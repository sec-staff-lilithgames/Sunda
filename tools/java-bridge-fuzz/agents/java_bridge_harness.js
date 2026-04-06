'use strict';

var state = {
  hooks: {},
  hookKeys: [],
  eventLog: [],
  counts: {
    threadGetName: 0,
    appGetPackageName: 0
  },
  lastValues: {
    threadName: null,
    packageName: null
  }
};

function recordEvent(kind, payload) {
  if (payload === undefined) {
    payload = {};
  }
  state.eventLog.push({
    kind: kind,
    payload: payload,
    at: Date.now()
  });
}

function assertClass(className) {
  try {
    return Java.use(className);
  } catch (e) {
    throw new Error('Java.use(' + className + ') failed: ' + (e.stack || e));
  }
}

function withEntry(mode, fn) {
  return new Promise(function (resolve, reject) {
    function runner() {
      try {
        resolve(fn());
      } catch (e) {
        reject(e);
      }
    }

    if (mode === 'perform') {
      Java.perform(runner);
    } else {
      Java.performNow(runner);
    }
  });
}

function getCurrentApplication() {
  var ActivityThread = Java.use('android.app.ActivityThread');
  return ActivityThread.currentApplication();
}

function installHook(className, methodName) {
  var key = className + '#' + methodName;
  var klass;
  var overload;
  var original;

  if (state.hooks[key] !== undefined) {
    recordEvent('hook-reused', { className: className, methodName: methodName });
    return;
  }

  klass = assertClass(className);
  overload = klass[methodName].overload();
  original = overload.implementation;

  /*
   * Keep the hook callback intentionally thin. The baseline wants to exercise
   * bridge install + dispatch + original-call routing, and heavy per-call JS
   * bookkeeping is not needed for that goal.
   */
  overload.implementation = function () {
    return overload.call(this);
  };

  state.hooks[key] = {
    overload: overload,
    original: original
  };
  state.hookKeys.push(key);
  recordEvent('hook-installed', { className: className, methodName: methodName });
}

function removeAllHooks() {
  var i;
  var key;
  var entry;

  for (i = 0; i !== state.hookKeys.length; i++) {
    key = state.hookKeys[i];
    entry = state.hooks[key];
    if (entry !== undefined) {
      entry.overload.implementation = entry.original;
      recordEvent('hook-removed', { key: key });
      delete state.hooks[key];
    }
  }
  state.hookKeys = [];
}

function runOperation(op) {
  var result;
  var Thread;
  var thread;
  var app;

  switch (op.op) {
    case 'java_use':
      result = assertClass(op.class_name);
      recordEvent('java-use', { className: op.class_name });
      return { className: op.class_name, hasClass: result !== null };
    case 'enumerate_methods':
      result = Java.enumerateMethods(op.query);
      recordEvent('enumerate-methods', { query: op.query, groups: result.length });
      return { query: op.query, groups: result.length };
    case 'hook_method':
      installHook(op.class_name, op.method_name);
      return { hooked: op.class_name + '#' + op.method_name };
    case 'hook_remove_all':
      removeAllHooks();
      return { hooksRemaining: 0 };
    case 'call_static':
      if (op.class_name === 'java.lang.Thread' && op.method_name === 'currentThread') {
        Thread = assertClass('java.lang.Thread');
        thread = Thread.currentThread();
        result = thread.getName();
        recordEvent('call-static', { className: op.class_name, methodName: op.method_name });
        return { threadName: result };
      }
      throw new Error('Unsupported static call: ' + op.class_name + '.' + op.method_name);
    case 'call_instance':
      if (op.class_name === 'java.lang.Thread' && op.method_name === 'getName') {
        Thread = assertClass('java.lang.Thread');
        thread = Thread.currentThread();
        result = thread.getName();
        recordEvent('call-instance', { className: op.class_name, methodName: op.method_name });
        return { value: result };
      }
      throw new Error('Unsupported instance call: ' + op.class_name + '.' + op.method_name);
    case 'call_current_application':
      app = getCurrentApplication();
      result = app !== null ? app[op.method_name]() : null;
      recordEvent('call-current-application', { methodName: op.method_name });
      return {
        applicationClass: app !== null ? app.$className : null,
        value: result
      };
    default:
      throw new Error('Unsupported operation: ' + op.op);
  }
}

function runStress(config) {
  var stress = config.stress || {};
  var rounds = stress.rounds || 1;
  var callsPerRound = stress.calls_per_round || 1;
  var workers = stress.workers || 1;
  var sleepMs = stress.sleep_ms_between_rounds || 0;
  var Thread = Java.use('java.lang.Thread');
  var worker;
  var round;
  var i;
  var thread;
  var app;

  for (worker = 0; worker !== workers; worker++) {
    for (round = 0; round !== rounds; round++) {
      thread = Thread.currentThread();
      app = getCurrentApplication();

      for (i = 0; i !== callsPerRound; i++) {
        state.lastValues.threadName = thread.getName();
      }
      state.counts.threadGetName += callsPerRound;

      if (app !== null) {
        for (i = 0; i !== callsPerRound; i++) {
          state.lastValues.packageName = app.getPackageName();
        }
        state.counts.appGetPackageName += callsPerRound;
      }

      if (sleepMs > 0) {
        Thread.sleep(sleepMs);
      }
    }
  }

  recordEvent('stress-finished', {
    rounds: rounds,
    callsPerRound: callsPerRound,
    workers: workers
  });

  return {
    rounds: rounds,
    callsPerRound: callsPerRound,
    workers: workers,
    counts: state.counts,
    lastValues: state.lastValues
  };
}

function snapshot() {
  return {
    counts: state.counts,
    lastValues: state.lastValues,
    hookCount: state.hookKeys.length,
    eventLog: state.eventLog
  };
}

function runCaseImpl(configJson) {
    var config = (typeof configJson === 'string') ? JSON.parse(configJson) : configJson;
    var entries = config.entry || ['performNow'];
    var operationResults = [];
    var index = 0;

    function runNextEntry() {
      if (index >= entries.length) {
        return withEntry('performNow', function () {
          runStress(config);
          return {
            ok: true,
            operations: operationResults,
            snapshot: snapshot()
          };
        });
      }

      return withEntry(entries[index], function () {
        var mode = entries[index];
        var ops = config.operations || [];
        var i;

        recordEvent('entry-start', { mode: mode });
        for (i = 0; i !== ops.length; i++) {
          operationResults.push({
            mode: mode,
            op: ops[i].op,
            result: runOperation(ops[i])
          });
        }
        recordEvent('entry-finished', { mode: mode });
      }).then(function () {
        index++;
        return runNextEntry();
      });
    }

    return runNextEntry().catch(function (e) {
      recordEvent('bridge-operation-error', { error: e.stack || String(e) });
      throw e;
    }).finally(function () {
      removeAllHooks();
    });
}

rpc.exports = {
  runCase: runCaseImpl,
  run_case: runCaseImpl
};

'use strict';

const OFFSETS = {
  jniOnLoad: 0x80474,
  vmBridge: 0x62c78,
  dispatcher: 0x52f20,
  crashEntry: 0x5d61c,
  crashLoop: 0x5d758,
  crashPc: 0x5d75c,
};

const state = {
  base: null,
  moduleName: null,
  dispatcherThreadId: null,
  stalking: false,
  blocks: [],
  interestingHits: [],
};

function sendEvent(type, payload) {
  send({ type, payload });
}

function abs(offset) {
  return state.base.add(offset);
}

function withinInterestingRange(blockStart) {
  const start = ptr(blockStart);
  return start.compare(abs(0x5d61c)) >= 0 && start.compare(abs(0x5f1e0)) <= 0;
}

function maybeResolveModule() {
  if (state.base !== null) {
    return true;
  }
  const modules = Process.enumerateModules();
  const mod = modules.find((m) => m.name.indexOf('libpairipcore.so') !== -1);
  if (mod === undefined) {
    return false;
  }

  state.base = mod.base;
  state.moduleName = mod.name;
  sendEvent('module', {
    name: mod.name,
    base: mod.base.toString(),
    size: mod.size,
    offsets: Object.fromEntries(
      Object.entries(OFFSETS).map(([k, v]) => [k, abs(v).toString()])
    ),
  });

  Interceptor.attach(abs(OFFSETS.jniOnLoad), {
    onEnter() {
      sendEvent('jni_on_load', { threadId: this.threadId, pc: this.context.pc.toString() });
    },
  });

  Interceptor.attach(abs(OFFSETS.vmBridge), {
    onEnter(args) {
      sendEvent('vm_bridge', {
        threadId: this.threadId,
        pc: this.context.pc.toString(),
        x0: args[0].toString(),
        x1: args[1].toString(),
      });
    },
  });

  Interceptor.attach(abs(OFFSETS.dispatcher), {
    onEnter(args) {
      const tid = this.threadId;
      state.dispatcherThreadId = tid;
      sendEvent('dispatcher_enter', {
        threadId: tid,
        pc: this.context.pc.toString(),
        x0: args[0].toString(),
        x1: args[1].toString(),
      });
      if (state.stalking) {
        return;
      }
      state.stalking = true;
      Stalker.follow(tid, {
        events: {
          call: false,
          ret: false,
          exec: false,
          block: true,
          compile: false,
        },
        onReceive(events) {
          const parsed = Stalker.parse(events, { annotate: false, stringify: false });
          for (const row of parsed) {
            const blockStart = row[0];
            if (!withinInterestingRange(blockStart)) {
              continue;
            }
            const blockString = ptr(blockStart).toString();
            state.blocks.push(blockString);
            if (blockString === abs(OFFSETS.crashEntry).toString() ||
                blockString === abs(OFFSETS.crashLoop).toString() ||
                blockString === abs(OFFSETS.crashPc).toString()) {
              state.interestingHits.push(blockString);
            }
          }
        },
      });
    },
  });

  Interceptor.attach(abs(OFFSETS.crashPc), {
    onEnter() {
      sendEvent('crash_pc_hit', {
        threadId: this.threadId,
        pc: this.context.pc.toString(),
        x10: this.context.x10.toString(),
        x11: this.context.x11.toString(),
        x16: this.context.x16.toString(),
        x17: this.context.x17.toString(),
      });
    },
  });

  return true;
}

const poll = setInterval(() => {
  try {
    maybeResolveModule();
  } catch (e) {
    sendEvent('module_error', { error: String(e) });
  }
}, 25);

rpc.exports = {
  flush() {
    return {
      moduleName: state.moduleName,
      blockCount: state.blocks.length,
      blocks: state.blocks,
      interestingHits: state.interestingHits,
      dispatcherThreadId: state.dispatcherThreadId,
    };
  },
  stop() {
    clearInterval(poll);
    if (state.dispatcherThreadId !== null && state.stalking) {
      try {
        Stalker.unfollow(state.dispatcherThreadId);
      } catch (_) {
      }
    }
    return this.flush();
  },
};

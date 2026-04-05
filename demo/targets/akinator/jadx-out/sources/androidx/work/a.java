package androidx.work;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import n6.e;
import n6.e1;
import n6.k;
import n6.r;
import n6.r0;
import n6.s0;
import n6.t0;
import o6.d;
import qv.v;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7439a;

    /* renamed from: b, reason: collision with root package name */
    public final m f7440b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f7441c;

    /* renamed from: d, reason: collision with root package name */
    public final n6.b f7442d;

    /* renamed from: e, reason: collision with root package name */
    public final e1 f7443e;

    /* renamed from: f, reason: collision with root package name */
    public final r f7444f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f7445g;

    /* renamed from: h, reason: collision with root package name */
    public final w3.b f7446h;

    /* renamed from: i, reason: collision with root package name */
    public final w3.b f7447i;

    /* renamed from: j, reason: collision with root package name */
    public final w3.b f7448j;

    /* renamed from: k, reason: collision with root package name */
    public final w3.b f7449k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7450l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7451m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7452n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7453o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7454p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7455q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7456r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f7457s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f7458t;

    /* renamed from: u, reason: collision with root package name */
    public final t0 f7459u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(u uVar) {
        }
    }

    static {
        new b(null);
    }

    public a(C0006a builder) {
        e0.checkNotNullParameter(builder, "builder");
        m workerContext$work_runtime_release = builder.getWorkerContext$work_runtime_release();
        Executor executor$work_runtime_release = builder.getExecutor$work_runtime_release();
        if (executor$work_runtime_release == null) {
            executor$work_runtime_release = workerContext$work_runtime_release != null ? e.access$asExecutor(workerContext$work_runtime_release) : null;
            if (executor$work_runtime_release == null) {
                executor$work_runtime_release = e.access$createDefaultExecutor(false);
            }
        }
        this.f7439a = executor$work_runtime_release;
        this.f7440b = workerContext$work_runtime_release == null ? builder.getExecutor$work_runtime_release() != null ? ExecutorsKt.from(executor$work_runtime_release) : Dispatchers.getDefault() : workerContext$work_runtime_release;
        this.f7457s = builder.getTaskExecutor$work_runtime_release() == null;
        Executor taskExecutor$work_runtime_release = builder.getTaskExecutor$work_runtime_release();
        this.f7441c = taskExecutor$work_runtime_release == null ? e.access$createDefaultExecutor(true) : taskExecutor$work_runtime_release;
        n6.b clock$work_runtime_release = builder.getClock$work_runtime_release();
        this.f7442d = clock$work_runtime_release == null ? new s0() : clock$work_runtime_release;
        e1 workerFactory$work_runtime_release = builder.getWorkerFactory$work_runtime_release();
        this.f7443e = workerFactory$work_runtime_release == null ? k.f75750a : workerFactory$work_runtime_release;
        r inputMergerFactory$work_runtime_release = builder.getInputMergerFactory$work_runtime_release();
        this.f7444f = inputMergerFactory$work_runtime_release == null ? n6.e0.f75716a : inputMergerFactory$work_runtime_release;
        r0 runnableScheduler$work_runtime_release = builder.getRunnableScheduler$work_runtime_release();
        this.f7445g = runnableScheduler$work_runtime_release == null ? new d() : runnableScheduler$work_runtime_release;
        this.f7452n = builder.getLoggingLevel$work_runtime_release();
        this.f7453o = builder.getMinJobSchedulerId$work_runtime_release();
        this.f7454p = builder.getMaxJobSchedulerId$work_runtime_release();
        this.f7456r = builder.getMaxSchedulerLimit$work_runtime_release();
        this.f7446h = builder.getInitializationExceptionHandler$work_runtime_release();
        this.f7447i = builder.getSchedulingExceptionHandler$work_runtime_release();
        this.f7448j = builder.getWorkerInitializationExceptionHandler$work_runtime_release();
        this.f7449k = builder.getWorkerExecutionExceptionHandler$work_runtime_release();
        this.f7450l = builder.getDefaultProcessName$work_runtime_release();
        this.f7451m = builder.getRemoteSessionTimeoutMillis$work_runtime_release();
        this.f7455q = builder.getContentUriTriggerWorkersLimit$work_runtime_release();
        this.f7458t = builder.getMarkJobsAsImportantWhileForeground$work_runtime_release();
        t0 tracer$work_runtime_release = builder.getTracer$work_runtime_release();
        this.f7459u = tracer$work_runtime_release == null ? e.access$createDefaultTracer() : tracer$work_runtime_release;
    }

    public final n6.b getClock() {
        return this.f7442d;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.f7455q;
    }

    public final String getDefaultProcessName() {
        return this.f7450l;
    }

    public final Executor getExecutor() {
        return this.f7439a;
    }

    public final w3.b getInitializationExceptionHandler() {
        return this.f7446h;
    }

    public final r getInputMergerFactory() {
        return this.f7444f;
    }

    public final int getMaxJobSchedulerId() {
        return this.f7454p;
    }

    public final int getMaxSchedulerLimit() {
        return this.f7456r;
    }

    public final int getMinJobSchedulerId() {
        return this.f7453o;
    }

    public final int getMinimumLoggingLevel() {
        return this.f7452n;
    }

    public final long getRemoteSessionTimeoutMillis() {
        return this.f7451m;
    }

    public final r0 getRunnableScheduler() {
        return this.f7445g;
    }

    public final w3.b getSchedulingExceptionHandler() {
        return this.f7447i;
    }

    public final Executor getTaskExecutor() {
        return this.f7441c;
    }

    public final t0 getTracer() {
        return this.f7459u;
    }

    public final m getWorkerCoroutineContext() {
        return this.f7440b;
    }

    public final w3.b getWorkerExecutionExceptionHandler() {
        return this.f7449k;
    }

    public final e1 getWorkerFactory() {
        return this.f7443e;
    }

    public final w3.b getWorkerInitializationExceptionHandler() {
        return this.f7448j;
    }

    public final boolean isMarkingJobsAsImportantWhileForeground() {
        return this.f7458t;
    }

    public final boolean isUsingDefaultTaskExecutor() {
        return this.f7457s;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0006a {

        /* renamed from: a, reason: collision with root package name */
        public Executor f7460a;

        /* renamed from: b, reason: collision with root package name */
        public m f7461b;

        /* renamed from: c, reason: collision with root package name */
        public e1 f7462c;

        /* renamed from: d, reason: collision with root package name */
        public r f7463d;

        /* renamed from: e, reason: collision with root package name */
        public Executor f7464e;

        /* renamed from: f, reason: collision with root package name */
        public n6.b f7465f;

        /* renamed from: g, reason: collision with root package name */
        public r0 f7466g;

        /* renamed from: h, reason: collision with root package name */
        public w3.b f7467h;

        /* renamed from: i, reason: collision with root package name */
        public w3.b f7468i;

        /* renamed from: j, reason: collision with root package name */
        public w3.b f7469j;

        /* renamed from: k, reason: collision with root package name */
        public w3.b f7470k;

        /* renamed from: l, reason: collision with root package name */
        public String f7471l;

        /* renamed from: m, reason: collision with root package name */
        public long f7472m;

        /* renamed from: n, reason: collision with root package name */
        public int f7473n;

        /* renamed from: o, reason: collision with root package name */
        public int f7474o;

        /* renamed from: p, reason: collision with root package name */
        public int f7475p;

        /* renamed from: q, reason: collision with root package name */
        public int f7476q;

        /* renamed from: r, reason: collision with root package name */
        public int f7477r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f7478s;

        /* renamed from: t, reason: collision with root package name */
        public t0 f7479t;

        public C0006a() {
            this.f7472m = TTAdConstant.AD_MAX_EVENT_TIME;
            this.f7473n = 4;
            this.f7475p = Integer.MAX_VALUE;
            this.f7476q = 20;
            this.f7477r = 8;
            this.f7478s = true;
        }

        public final a build() {
            return new a(this);
        }

        public final n6.b getClock$work_runtime_release() {
            return this.f7465f;
        }

        public final int getContentUriTriggerWorkersLimit$work_runtime_release() {
            return this.f7477r;
        }

        public final String getDefaultProcessName$work_runtime_release() {
            return this.f7471l;
        }

        public final Executor getExecutor$work_runtime_release() {
            return this.f7460a;
        }

        public final w3.b getInitializationExceptionHandler$work_runtime_release() {
            return this.f7467h;
        }

        public final r getInputMergerFactory$work_runtime_release() {
            return this.f7463d;
        }

        public final int getLoggingLevel$work_runtime_release() {
            return this.f7473n;
        }

        public final boolean getMarkJobsAsImportantWhileForeground$work_runtime_release() {
            return this.f7478s;
        }

        public final int getMaxJobSchedulerId$work_runtime_release() {
            return this.f7475p;
        }

        public final int getMaxSchedulerLimit$work_runtime_release() {
            return this.f7476q;
        }

        public final int getMinJobSchedulerId$work_runtime_release() {
            return this.f7474o;
        }

        public final long getRemoteSessionTimeoutMillis$work_runtime_release() {
            return this.f7472m;
        }

        public final r0 getRunnableScheduler$work_runtime_release() {
            return this.f7466g;
        }

        public final w3.b getSchedulingExceptionHandler$work_runtime_release() {
            return this.f7468i;
        }

        public final Executor getTaskExecutor$work_runtime_release() {
            return this.f7464e;
        }

        public final t0 getTracer$work_runtime_release() {
            return this.f7479t;
        }

        public final m getWorkerContext$work_runtime_release() {
            return this.f7461b;
        }

        public final w3.b getWorkerExecutionExceptionHandler$work_runtime_release() {
            return this.f7470k;
        }

        public final e1 getWorkerFactory$work_runtime_release() {
            return this.f7462c;
        }

        public final w3.b getWorkerInitializationExceptionHandler$work_runtime_release() {
            return this.f7469j;
        }

        public final C0006a setClock(n6.b clock) {
            e0.checkNotNullParameter(clock, "clock");
            this.f7465f = clock;
            return this;
        }

        public final void setClock$work_runtime_release(n6.b bVar) {
            this.f7465f = bVar;
        }

        public final C0006a setContentUriTriggerWorkersLimit(int i10) {
            this.f7477r = Math.max(i10, 0);
            return this;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int i10) {
            this.f7477r = i10;
        }

        public final C0006a setDefaultProcessName(String processName) {
            e0.checkNotNullParameter(processName, "processName");
            this.f7471l = processName;
            return this;
        }

        public final void setDefaultProcessName$work_runtime_release(String str) {
            this.f7471l = str;
        }

        public final C0006a setExecutor(Executor executor) {
            e0.checkNotNullParameter(executor, "executor");
            this.f7460a = executor;
            return this;
        }

        public final void setExecutor$work_runtime_release(Executor executor) {
            this.f7460a = executor;
        }

        public final C0006a setInitializationExceptionHandler(w3.b exceptionHandler) {
            e0.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            this.f7467h = exceptionHandler;
            return this;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(w3.b bVar) {
            this.f7467h = bVar;
        }

        public final C0006a setInputMergerFactory(r inputMergerFactory) {
            e0.checkNotNullParameter(inputMergerFactory, "inputMergerFactory");
            this.f7463d = inputMergerFactory;
            return this;
        }

        public final void setInputMergerFactory$work_runtime_release(r rVar) {
            this.f7463d = rVar;
        }

        public final C0006a setJobSchedulerJobIdRange(int i10, int i11) {
            if (i11 - i10 < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.f7474o = i10;
            this.f7475p = i11;
            return this;
        }

        public final void setLoggingLevel$work_runtime_release(int i10) {
            this.f7473n = i10;
        }

        public final void setMarkJobsAsImportantWhileForeground$work_runtime_release(boolean z10) {
            this.f7478s = z10;
        }

        public final C0006a setMarkingJobsAsImportantWhileForeground(boolean z10) {
            this.f7478s = z10;
            return this;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int i10) {
            this.f7475p = i10;
        }

        public final C0006a setMaxSchedulerLimit(int i10) {
            if (i10 < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.f7476q = Math.min(i10, 50);
            return this;
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int i10) {
            this.f7476q = i10;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int i10) {
            this.f7474o = i10;
        }

        public final C0006a setMinimumLoggingLevel(int i10) {
            this.f7473n = i10;
            return this;
        }

        public final C0006a setRemoteSessionTimeoutMillis(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("The remote session timeout must not be negative.");
            }
            this.f7472m = v.coerceAtMost(j10, 1200000L);
            return this;
        }

        public final void setRemoteSessionTimeoutMillis$work_runtime_release(long j10) {
            this.f7472m = j10;
        }

        public final C0006a setRunnableScheduler(r0 runnableScheduler) {
            e0.checkNotNullParameter(runnableScheduler, "runnableScheduler");
            this.f7466g = runnableScheduler;
            return this;
        }

        public final void setRunnableScheduler$work_runtime_release(r0 r0Var) {
            this.f7466g = r0Var;
        }

        public final C0006a setSchedulingExceptionHandler(w3.b schedulingExceptionHandler) {
            e0.checkNotNullParameter(schedulingExceptionHandler, "schedulingExceptionHandler");
            this.f7468i = schedulingExceptionHandler;
            return this;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(w3.b bVar) {
            this.f7468i = bVar;
        }

        public final C0006a setTaskExecutor(Executor taskExecutor) {
            e0.checkNotNullParameter(taskExecutor, "taskExecutor");
            this.f7464e = taskExecutor;
            return this;
        }

        public final void setTaskExecutor$work_runtime_release(Executor executor) {
            this.f7464e = executor;
        }

        public final C0006a setTracer(t0 tracer) {
            e0.checkNotNullParameter(tracer, "tracer");
            this.f7479t = tracer;
            return this;
        }

        public final void setTracer$work_runtime_release(t0 t0Var) {
            this.f7479t = t0Var;
        }

        public final void setWorkerContext$work_runtime_release(m mVar) {
            this.f7461b = mVar;
        }

        public final C0006a setWorkerCoroutineContext(m context) {
            e0.checkNotNullParameter(context, "context");
            this.f7461b = context;
            return this;
        }

        public final C0006a setWorkerExecutionExceptionHandler(w3.b workerExceptionHandler) {
            e0.checkNotNullParameter(workerExceptionHandler, "workerExceptionHandler");
            this.f7470k = workerExceptionHandler;
            return this;
        }

        public final void setWorkerExecutionExceptionHandler$work_runtime_release(w3.b bVar) {
            this.f7470k = bVar;
        }

        public final C0006a setWorkerFactory(e1 workerFactory) {
            e0.checkNotNullParameter(workerFactory, "workerFactory");
            this.f7462c = workerFactory;
            return this;
        }

        public final void setWorkerFactory$work_runtime_release(e1 e1Var) {
            this.f7462c = e1Var;
        }

        public final C0006a setWorkerInitializationExceptionHandler(w3.b workerExceptionHandler) {
            e0.checkNotNullParameter(workerExceptionHandler, "workerExceptionHandler");
            this.f7469j = workerExceptionHandler;
            return this;
        }

        public final void setWorkerInitializationExceptionHandler$work_runtime_release(w3.b bVar) {
            this.f7469j = bVar;
        }

        public C0006a(a configuration) {
            e0.checkNotNullParameter(configuration, "configuration");
            this.f7472m = TTAdConstant.AD_MAX_EVENT_TIME;
            this.f7473n = 4;
            this.f7475p = Integer.MAX_VALUE;
            this.f7476q = 20;
            this.f7477r = 8;
            this.f7478s = true;
            this.f7460a = configuration.getExecutor();
            this.f7462c = configuration.getWorkerFactory();
            this.f7463d = configuration.getInputMergerFactory();
            this.f7464e = configuration.getTaskExecutor();
            this.f7465f = configuration.getClock();
            this.f7473n = configuration.getMinimumLoggingLevel();
            this.f7474o = configuration.getMinJobSchedulerId();
            this.f7475p = configuration.getMaxJobSchedulerId();
            this.f7476q = configuration.getMaxSchedulerLimit();
            this.f7466g = configuration.getRunnableScheduler();
            this.f7467h = configuration.getInitializationExceptionHandler();
            this.f7468i = configuration.getSchedulingExceptionHandler();
            this.f7469j = configuration.getWorkerInitializationExceptionHandler();
            this.f7470k = configuration.getWorkerExecutionExceptionHandler();
            this.f7471l = configuration.getDefaultProcessName();
            this.f7472m = configuration.getRemoteSessionTimeoutMillis();
            this.f7477r = configuration.getContentUriTriggerWorkersLimit();
            this.f7478s = configuration.f7458t;
            this.f7479t = configuration.getTracer();
        }
    }
}

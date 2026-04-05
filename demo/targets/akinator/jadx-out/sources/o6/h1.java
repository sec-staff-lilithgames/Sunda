package o6;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import j1.o2;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final v6.b0 f77900a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f77901b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77902c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkerParameters.a f77903d;

    /* renamed from: e, reason: collision with root package name */
    public final n6.b0 f77904e;

    /* renamed from: f, reason: collision with root package name */
    public final x6.b f77905f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.work.a f77906g;

    /* renamed from: h, reason: collision with root package name */
    public final n6.b f77907h;

    /* renamed from: i, reason: collision with root package name */
    public final u6.a f77908i;

    /* renamed from: j, reason: collision with root package name */
    public final WorkDatabase f77909j;

    /* renamed from: k, reason: collision with root package name */
    public final v6.c0 f77910k;

    /* renamed from: l, reason: collision with root package name */
    public final v6.b f77911l;

    /* renamed from: m, reason: collision with root package name */
    public final List f77912m;

    /* renamed from: n, reason: collision with root package name */
    public final String f77913n;

    /* renamed from: o, reason: collision with root package name */
    public final CompletableJob f77914o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.work.a f77915a;

        /* renamed from: b, reason: collision with root package name */
        public final x6.b f77916b;

        /* renamed from: c, reason: collision with root package name */
        public final u6.a f77917c;

        /* renamed from: d, reason: collision with root package name */
        public final WorkDatabase f77918d;

        /* renamed from: e, reason: collision with root package name */
        public final v6.b0 f77919e;

        /* renamed from: f, reason: collision with root package name */
        public final List f77920f;

        /* renamed from: g, reason: collision with root package name */
        public final Context f77921g;

        /* renamed from: h, reason: collision with root package name */
        public n6.b0 f77922h;

        /* renamed from: i, reason: collision with root package name */
        public WorkerParameters.a f77923i;

        public a(Context context, androidx.work.a configuration, x6.b workTaskExecutor, u6.a foregroundProcessor, WorkDatabase workDatabase, v6.b0 workSpec, List<String> tags) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
            kotlin.jvm.internal.e0.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
            kotlin.jvm.internal.e0.checkNotNullParameter(foregroundProcessor, "foregroundProcessor");
            kotlin.jvm.internal.e0.checkNotNullParameter(workDatabase, "workDatabase");
            kotlin.jvm.internal.e0.checkNotNullParameter(workSpec, "workSpec");
            kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
            this.f77915a = configuration;
            this.f77916b = workTaskExecutor;
            this.f77917c = foregroundProcessor;
            this.f77918d = workDatabase;
            this.f77919e = workSpec;
            this.f77920f = tags;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.f77921g = applicationContext;
            this.f77923i = new WorkerParameters.a();
        }

        public final h1 build() {
            return new h1(this);
        }

        public final Context getAppContext() {
            return this.f77921g;
        }

        public final androidx.work.a getConfiguration() {
            return this.f77915a;
        }

        public final u6.a getForegroundProcessor() {
            return this.f77917c;
        }

        public final WorkerParameters.a getRuntimeExtras() {
            return this.f77923i;
        }

        public final List<String> getTags() {
            return this.f77920f;
        }

        public final WorkDatabase getWorkDatabase() {
            return this.f77918d;
        }

        public final v6.b0 getWorkSpec() {
            return this.f77919e;
        }

        public final x6.b getWorkTaskExecutor() {
            return this.f77916b;
        }

        public final n6.b0 getWorker() {
            return this.f77922h;
        }

        public final void setRuntimeExtras(WorkerParameters.a aVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
            this.f77923i = aVar;
        }

        public final void setWorker(n6.b0 b0Var) {
            this.f77922h = b0Var;
        }

        public final a withRuntimeExtras(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f77923i = aVar;
            }
            return this;
        }

        public final a withWorker(n6.b0 worker) {
            kotlin.jvm.internal.e0.checkNotNullParameter(worker, "worker");
            this.f77922h = worker;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final n6.a0 f77924a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final n6.a0 getResult() {
                return this.f77924a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n6.a0 result) {
                super(null);
                kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
                this.f77924a = result;
            }

            public /* synthetic */ a(n6.a0 a0Var, int i10, kotlin.jvm.internal.u uVar) {
                this((i10 & 1) != 0 ? new n6.x() : a0Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: o6.h1$b$b, reason: collision with other inner class name */
        public static final class C0755b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final n6.a0 f77925a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0755b(n6.a0 result) {
                super(null);
                kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
                this.f77925a = result;
            }

            public final n6.a0 getResult() {
                return this.f77925a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public final int f77926a;

            public c() {
                this(0, 1, null);
            }

            public final int getReason() {
                return this.f77926a;
            }

            public c(int i10) {
                super(null);
                this.f77926a = i10;
            }

            public /* synthetic */ c(int i10, int i11, kotlin.jvm.internal.u uVar) {
                this((i11 & 1) != 0 ? -256 : i10);
            }
        }

        public b(kotlin.jvm.internal.u uVar) {
        }
    }

    public h1(a builder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        v6.b0 workSpec = builder.getWorkSpec();
        this.f77900a = workSpec;
        this.f77901b = builder.getAppContext();
        String str = workSpec.f89053a;
        this.f77902c = str;
        this.f77903d = builder.getRuntimeExtras();
        this.f77904e = builder.getWorker();
        this.f77905f = builder.getWorkTaskExecutor();
        androidx.work.a configuration = builder.getConfiguration();
        this.f77906g = configuration;
        this.f77907h = configuration.getClock();
        this.f77908i = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.f77909j = workDatabase;
        this.f77910k = workDatabase.workSpecDao();
        this.f77911l = workDatabase.dependencyDao();
        List<String> tags = builder.getTags();
        this.f77912m = tags;
        this.f77913n = o2.o(e3.g.o("Work [ id=", str, ", tags={ "), uu.y0.joinToString$default(tags, ",", null, null, 0, null, null, 62, null), " } ]");
        this.f77914o = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    public static final boolean access$onWorkFinished(h1 h1Var, n6.a0 a0Var) {
        v6.c0 c0Var = h1Var.f77910k;
        String str = h1Var.f77902c;
        n6.x0 state = c0Var.getState(str);
        h1Var.f77909j.workProgressDao().delete(str);
        if (state != null) {
            if (state == n6.x0.f75807c) {
                v6.b0 b0Var = h1Var.f77900a;
                String str2 = h1Var.f77913n;
                if (!(a0Var instanceof n6.z)) {
                    if (a0Var instanceof n6.y) {
                        String str3 = n1.f77949a;
                        n6.c0.get().info(str3, "Worker result RETRY for " + str2);
                        h1Var.a(-256);
                        return true;
                    }
                    String str4 = n1.f77949a;
                    n6.c0.get().info(str4, "Worker result FAILURE for " + str2);
                    if (b0Var.isPeriodic()) {
                        h1Var.b();
                        return false;
                    }
                    if (a0Var == null) {
                        a0Var = new n6.x();
                    }
                    return h1Var.setFailed(a0Var);
                }
                String str5 = n1.f77949a;
                n6.c0.get().info(str5, "Worker result SUCCESS for " + str2);
                if (b0Var.isPeriodic()) {
                    h1Var.b();
                    return false;
                }
                c0Var.setState(n6.x0.f75808e, str);
                kotlin.jvm.internal.e0.checkNotNull(a0Var, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
                androidx.work.b outputData = ((n6.z) a0Var).getOutputData();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(outputData, "getOutputData(...)");
                c0Var.setOutput(str, outputData);
                long jCurrentTimeMillis = h1Var.f77907h.currentTimeMillis();
                v6.b bVar = h1Var.f77911l;
                for (String str6 : bVar.getDependentWorkIds(str)) {
                    if (c0Var.getState(str6) == n6.x0.f75810g && bVar.hasCompletedAllPrerequisites(str6)) {
                        String str7 = n1.f77949a;
                        n6.c0.get().info(str7, "Setting status to enqueued for " + str6);
                        c0Var.setState(n6.x0.f75806b, str6);
                        c0Var.setLastEnqueueTime(str6, jCurrentTimeMillis);
                    }
                }
            } else if (!state.isFinished()) {
                h1Var.a(-512);
                return true;
            }
        }
        return false;
    }

    public static final boolean access$resetWorkerStatus(h1 h1Var, int i10) {
        v6.c0 c0Var = h1Var.f77910k;
        String str = h1Var.f77902c;
        v6.b0 b0Var = h1Var.f77900a;
        if (kotlin.jvm.internal.e0.areEqual(b0Var.getBackOffOnSystemInterruptions(), Boolean.TRUE)) {
            String str2 = n1.f77949a;
            n6.c0.get().debug(str2, "Worker " + b0Var.f89055c + " was interrupted. Backing off.");
            h1Var.a(i10);
            return true;
        }
        n6.x0 state = c0Var.getState(str);
        if (state == null || state.isFinished()) {
            String str3 = n1.f77949a;
            n6.c0.get().debug(str3, "Status for " + str + " is " + state + " ; not doing any work");
            return false;
        }
        String str4 = n1.f77949a;
        n6.c0.get().debug(str4, "Status for " + str + " is " + state + "; not doing any work and rescheduling for later execution");
        c0Var.setState(n6.x0.f75806b, str);
        c0Var.setStopReason(str, i10);
        c0Var.markWorkSpecScheduled(str, -1L);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$runWorker(final o6.h1 r29, zu.d r30) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.h1.access$runWorker(o6.h1, zu.d):java.lang.Object");
    }

    public final void a(int i10) {
        n6.x0 x0Var = n6.x0.f75806b;
        v6.c0 c0Var = this.f77910k;
        String str = this.f77902c;
        c0Var.setState(x0Var, str);
        c0Var.setLastEnqueueTime(str, this.f77907h.currentTimeMillis());
        c0Var.resetWorkSpecNextScheduleTimeOverride(str, this.f77900a.getNextScheduleTimeOverrideGeneration());
        c0Var.markWorkSpecScheduled(str, -1L);
        c0Var.setStopReason(str, i10);
    }

    public final void b() {
        long jCurrentTimeMillis = this.f77907h.currentTimeMillis();
        v6.c0 c0Var = this.f77910k;
        String str = this.f77902c;
        c0Var.setLastEnqueueTime(str, jCurrentTimeMillis);
        c0Var.setState(n6.x0.f75806b, str);
        c0Var.resetWorkSpecRunAttemptCount(str);
        c0Var.resetWorkSpecNextScheduleTimeOverride(str, this.f77900a.getNextScheduleTimeOverrideGeneration());
        c0Var.incrementPeriodCount(str);
        c0Var.markWorkSpecScheduled(str, -1L);
    }

    public final v6.s getWorkGenerationalId() {
        return v6.n0.generationalId(this.f77900a);
    }

    public final v6.b0 getWorkSpec() {
        return this.f77900a;
    }

    public final void interrupt(int i10) {
        this.f77914o.cancel((CancellationException) new d1(i10));
    }

    public final sh.n1 launch() {
        return n6.w.launchFuture$default(this.f77905f.getTaskCoroutineDispatcher().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), null, new j1(this, null), 2, null);
    }

    public final boolean setFailed(n6.a0 result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        String str = this.f77902c;
        List listMutableListOf = uu.p0.mutableListOf(str);
        while (true) {
            boolean zIsEmpty = listMutableListOf.isEmpty();
            v6.c0 c0Var = this.f77910k;
            if (zIsEmpty) {
                androidx.work.b outputData = ((n6.x) result).getOutputData();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(outputData, "getOutputData(...)");
                c0Var.resetWorkSpecNextScheduleTimeOverride(str, this.f77900a.getNextScheduleTimeOverrideGeneration());
                c0Var.setOutput(str, outputData);
                return false;
            }
            String str2 = (String) uu.v0.removeLast(listMutableListOf);
            if (c0Var.getState(str2) != n6.x0.f75811h) {
                c0Var.setState(n6.x0.f75809f, str2);
            }
            listMutableListOf.addAll(this.f77911l.getDependentWorkIds(str2));
        }
    }
}

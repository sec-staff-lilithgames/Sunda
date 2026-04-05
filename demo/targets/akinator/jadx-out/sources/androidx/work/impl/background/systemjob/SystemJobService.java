package androidx.work.impl.background.systemjob;

import a.b;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import e4.q;
import java.util.Arrays;
import java.util.HashMap;
import k3.a;
import n6.c0;
import o6.e;
import o6.p;
import o6.u;
import o6.u0;
import o6.w;
import o6.y0;
import v6.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final String f7502g = c0.tagWithPrefix("SystemJobService");

    /* renamed from: b, reason: collision with root package name */
    public y0 f7503b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7504c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final w f7505e = w.create(false);

    /* renamed from: f, reason: collision with root package name */
    public u0 f7506f;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(b.l("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static s b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new s(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            y0 y0Var = y0.getInstance(getApplicationContext());
            this.f7503b = y0Var;
            p processor = y0Var.getProcessor();
            this.f7506f = new u0(processor, this.f7503b.getWorkTaskExecutor());
            processor.addExecutionListener(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            c0.get().warning(f7502g, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        y0 y0Var = this.f7503b;
        if (y0Var != null) {
            y0Var.getProcessor().removeExecutionListener(this);
        }
    }

    @Override // o6.e
    public void onExecuted(s sVar, boolean z10) {
        a("onExecuted");
        c0.get().debug(f7502g, sVar.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f7504c.remove(sVar);
        this.f7505e.remove(sVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        y0 y0Var = this.f7503b;
        String str = f7502g;
        if (y0Var == null) {
            c0.get().debug(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        s sVarB = b(jobParameters);
        if (sVarB == null) {
            c0.get().error(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f7504c;
        if (map.containsKey(sVarB)) {
            c0.get().debug(str, "Job is already being executed by SystemJobService: " + sVarB);
            return false;
        }
        c0.get().debug(str, "onStartJob for " + sVarB);
        map.put(sVarB, jobParameters);
        int i10 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (jobParameters.getTriggeredContentUris() != null) {
            aVar.f7437b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            aVar.f7436a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (i10 >= 28) {
            aVar.f7438c = q.h(jobParameters);
        }
        this.f7506f.startWork(this.f7505e.tokenFor(sVarB), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        y0 y0Var = this.f7503b;
        String str = f7502g;
        if (y0Var == null) {
            c0.get().debug(str, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        s sVarB = b(jobParameters);
        if (sVarB == null) {
            c0.get().error(str, "WorkSpec id not found!");
            return false;
        }
        c0.get().debug(str, "onStopJob for " + sVarB);
        this.f7504c.remove(sVarB);
        u uVarRemove = this.f7505e.remove(sVarB);
        if (uVarRemove != null) {
            this.f7506f.stopWorkWithReason(uVarRemove, Build.VERSION.SDK_INT >= 31 ? a.b(jobParameters) : -512);
        }
        return !this.f7503b.getProcessor().isCancelled(sVarB.getWorkSpecId());
    }
}

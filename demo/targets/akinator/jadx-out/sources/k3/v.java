package k3;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;
import androidx.core.app.JobIntentService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends JobServiceEngine implements q {

    /* renamed from: a, reason: collision with root package name */
    public final JobIntentService f70256a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f70257b;

    /* renamed from: c, reason: collision with root package name */
    public JobParameters f70258c;

    public v(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.f70257b = new Object();
        this.f70256a = jobIntentService;
    }

    @Override // k3.q
    public IBinder compatGetBinder() {
        return getBinder();
    }

    @Override // k3.q
    public t dequeueWork() {
        synchronized (this.f70257b) {
            try {
                JobParameters jobParameters = this.f70258c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f70256a.getClassLoader());
                return new u(this, jobWorkItemDequeueWork);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.f70258c = jobParameters;
        this.f70256a.a(false);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        JobIntentService jobIntentService = this.f70256a;
        ja.d dVar = jobIntentService.f5629e;
        if (dVar != null) {
            dVar.cancel(jobIntentService.f5630f);
        }
        jobIntentService.f5631g = true;
        boolean zOnStopCurrentWork = jobIntentService.onStopCurrentWork();
        synchronized (this.f70257b) {
            this.f70258c = null;
        }
        return zOnStopCurrentWork;
    }
}

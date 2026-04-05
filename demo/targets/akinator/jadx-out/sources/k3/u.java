package k3;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final JobWorkItem f70254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f70255b;

    public u(v vVar, JobWorkItem jobWorkItem) {
        this.f70255b = vVar;
        this.f70254a = jobWorkItem;
    }

    @Override // k3.t
    public void complete() {
        synchronized (this.f70255b.f70257b) {
            try {
                JobParameters jobParameters = this.f70255b.f70258c;
                if (jobParameters != null) {
                    jobParameters.completeWork(this.f70254a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k3.t
    public Intent getIntent() {
        return this.f70254a.getIntent();
    }
}

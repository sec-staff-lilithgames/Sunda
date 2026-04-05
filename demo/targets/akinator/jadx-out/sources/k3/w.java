package k3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends x {

    /* renamed from: d, reason: collision with root package name */
    public final JobInfo f70259d;

    /* renamed from: e, reason: collision with root package name */
    public final JobScheduler f70260e;

    public w(Context context, ComponentName componentName, int i10) {
        super(componentName);
        b(i10);
        this.f70259d = new JobInfo.Builder(i10, componentName).setOverrideDeadline(0L).build();
        this.f70260e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // k3.x
    public final void a(Intent intent) {
        this.f70260e.enqueue(this.f70259d, new JobWorkItem(intent));
    }
}

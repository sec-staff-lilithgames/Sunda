package q6;

import android.app.job.JobScheduler;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f82522a = new b();

    public final JobScheduler forNamespace(JobScheduler jobScheduler) {
        e0.checkNotNullParameter(jobScheduler, "jobScheduler");
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        e0.checkNotNullExpressionValue(jobSchedulerForNamespace, "forNamespace(...)");
        return jobSchedulerForNamespace;
    }
}

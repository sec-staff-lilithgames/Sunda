package q6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f82521a = new a();

    public final List<JobInfo> getAllPendingJobs(JobScheduler jobScheduler) {
        e0.checkNotNullParameter(jobScheduler, "jobScheduler");
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        e0.checkNotNullExpressionValue(allPendingJobs, "getAllPendingJobs(...)");
        return allPendingJobs;
    }
}

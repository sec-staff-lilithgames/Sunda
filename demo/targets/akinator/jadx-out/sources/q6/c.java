package q6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import n6.c0;
import p0.o2;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82523a;

    static {
        String strTagWithPrefix = c0.tagWithPrefix("SystemJobScheduler");
        e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f82523a = strTagWithPrefix;
    }

    public static final String createErrorMessage(Context context, WorkDatabase workDatabase, androidx.work.a configuration) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(workDatabase, "workDatabase");
        e0.checkNotNullParameter(configuration, "configuration");
        int i10 = Build.VERSION.SDK_INT;
        int i11 = i10 >= 31 ? 150 : 100;
        int size = workDatabase.workSpecDao().getScheduledWork().size();
        String strJoinToString$default = "<faulty JobScheduler failed to getPendingJobs>";
        if (i10 >= 34) {
            JobScheduler wmJobScheduler = getWmJobScheduler(context);
            List<JobInfo> safePendingJobs = getSafePendingJobs(wmJobScheduler);
            if (safePendingJobs != null) {
                ArrayList arrayListB = f.b(context, wmJobScheduler);
                int size2 = arrayListB != null ? safePendingJobs.size() - arrayListB.size() : 0;
                String strJ = size2 == 0 ? null : o2.j(size2, " of which are not owned by WorkManager");
                Object systemService = context.getSystemService("jobscheduler");
                e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                ArrayList arrayListB2 = f.b(context, (JobScheduler) systemService);
                int size3 = arrayListB2 != null ? arrayListB2.size() : 0;
                strJoinToString$default = y0.joinToString$default(p0.listOfNotNull((Object[]) new String[]{safePendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strJ, size3 != 0 ? o2.j(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            ArrayList arrayListB3 = f.b(context, getWmJobScheduler(context));
            if (arrayListB3 != null) {
                strJoinToString$default = arrayListB3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i11 + " job limit exceeded.\nIn JobScheduler there are " + strJoinToString$default + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.getMaxSchedulerLimit() + '.';
    }

    public static final List<JobInfo> getSafePendingJobs(JobScheduler jobScheduler) {
        e0.checkNotNullParameter(jobScheduler, "<this>");
        try {
            return a.f82521a.getAllPendingJobs(jobScheduler);
        } catch (Throwable th2) {
            c0.get().error(f82523a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    public static final JobScheduler getWmJobScheduler(Context context) {
        e0.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? b.f82522a.forNamespace(jobScheduler) : jobScheduler;
    }
}

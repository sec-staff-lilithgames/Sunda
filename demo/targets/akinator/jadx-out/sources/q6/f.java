package q6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n6.c0;
import n6.o0;
import n6.x0;
import o6.r;
import v6.b0;
import v6.n;
import v6.n0;
import v6.s;
import w6.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f implements r {

    /* renamed from: h, reason: collision with root package name */
    public static final String f82528h = c0.tagWithPrefix("SystemJobScheduler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f82529b;

    /* renamed from: c, reason: collision with root package name */
    public final JobScheduler f82530c;

    /* renamed from: e, reason: collision with root package name */
    public final d f82531e;

    /* renamed from: f, reason: collision with root package name */
    public final WorkDatabase f82532f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.work.a f82533g;

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, c.getWmJobScheduler(context), new d(context, aVar.getClock(), aVar.isMarkingJobsAsImportantWhileForeground()));
    }

    public static void a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            c0.get().error(f82528h, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> safePendingJobs = c.getSafePendingJobs(jobScheduler);
        if (safePendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(safePendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : safePendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static s c(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new s(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static void cancelAllInAllNamespaces(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.getWmJobScheduler(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList arrayListB = b(context, jobScheduler);
        if (arrayListB == null || arrayListB.isEmpty()) {
            return;
        }
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static boolean reconcileJobs(Context context, WorkDatabase workDatabase) {
        JobScheduler wmJobScheduler = c.getWmJobScheduler(context);
        ArrayList arrayListB = b(context, wmJobScheduler);
        List<String> workSpecIds = workDatabase.systemIdInfoDao().getWorkSpecIds();
        boolean z10 = false;
        HashSet hashSet = new HashSet(arrayListB != null ? arrayListB.size() : 0);
        if (arrayListB != null && !arrayListB.isEmpty()) {
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                s sVarC = c(jobInfo);
                if (sVarC != null) {
                    hashSet.add(sVarC.getWorkSpecId());
                } else {
                    a(wmJobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it2 = workSpecIds.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!hashSet.contains(it2.next())) {
                c0.get().debug(f82528h, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        workDatabase.beginTransaction();
        try {
            v6.c0 c0VarWorkSpecDao = workDatabase.workSpecDao();
            Iterator<String> it3 = workSpecIds.iterator();
            while (it3.hasNext()) {
                c0VarWorkSpecDao.markWorkSpecScheduled(it3.next(), -1L);
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            return z10;
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }

    @Override // o6.r
    public void cancel(String str) {
        ArrayList arrayList;
        Context context = this.f82529b;
        JobScheduler jobScheduler = this.f82530c;
        ArrayList arrayListB = b(context, jobScheduler);
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                s sVarC = c(jobInfo);
                if (sVarC != null && str.equals(sVarC.getWorkSpecId())) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a(jobScheduler, ((Integer) it2.next()).intValue());
        }
        this.f82532f.systemIdInfoDao().removeSystemIdInfo(str);
    }

    @Override // o6.r
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // o6.r
    public void schedule(b0... b0VarArr) {
        androidx.work.a aVar = this.f82533g;
        WorkDatabase workDatabase = this.f82532f;
        i iVar = new i(workDatabase);
        for (b0 b0Var : b0VarArr) {
            workDatabase.beginTransaction();
            try {
                v6.c0 c0VarWorkSpecDao = workDatabase.workSpecDao();
                String str = b0Var.f89053a;
                String str2 = b0Var.f89053a;
                b0 workSpec = c0VarWorkSpecDao.getWorkSpec(str);
                String str3 = f82528h;
                if (workSpec == null) {
                    c0.get().warning(str3, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.setTransactionSuccessful();
                } else if (workSpec.f89054b != x0.f75806b) {
                    c0.get().warning(str3, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.setTransactionSuccessful();
                } else {
                    s sVarGenerationalId = n0.generationalId(b0Var);
                    n systemIdInfo = workDatabase.systemIdInfoDao().getSystemIdInfo(sVarGenerationalId);
                    int iNextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.f89148c : iVar.nextJobSchedulerIdWithRange(aVar.getMinJobSchedulerId(), aVar.getMaxJobSchedulerId());
                    if (systemIdInfo == null) {
                        workDatabase.systemIdInfoDao().insertSystemIdInfo(v6.r.systemIdInfo(sVarGenerationalId, iNextJobSchedulerIdWithRange));
                    }
                    scheduleInternal(b0Var, iNextJobSchedulerIdWithRange);
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    public void scheduleInternal(b0 b0Var, int i10) {
        JobInfo jobInfoA = this.f82531e.a(b0Var, i10);
        c0 c0Var = c0.get();
        StringBuilder sb2 = new StringBuilder("Scheduling work ID ");
        String str = b0Var.f89053a;
        sb2.append(str);
        sb2.append("Job ID ");
        sb2.append(i10);
        String string = sb2.toString();
        String str2 = f82528h;
        c0Var.debug(str2, string);
        try {
            if (this.f82530c.schedule(jobInfoA) == 0) {
                c0.get().warning(str2, "Unable to schedule work ID " + str);
                if (b0Var.f89069q && b0Var.f89070r == o0.f75776b) {
                    b0Var.f89069q = false;
                    c0.get().debug(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    scheduleInternal(b0Var, i10);
                }
            }
        } catch (IllegalStateException e10) {
            Context context = this.f82529b;
            WorkDatabase workDatabase = this.f82532f;
            androidx.work.a aVar = this.f82533g;
            String strCreateErrorMessage = c.createErrorMessage(context, workDatabase, aVar);
            c0.get().error(str2, strCreateErrorMessage);
            IllegalStateException illegalStateException = new IllegalStateException(strCreateErrorMessage, e10);
            w3.b schedulingExceptionHandler = aVar.getSchedulingExceptionHandler();
            if (schedulingExceptionHandler == null) {
                throw illegalStateException;
            }
            schedulingExceptionHandler.accept(illegalStateException);
        } catch (Throwable th2) {
            c0.get().error(str2, "Unable to schedule " + b0Var, th2);
        }
    }

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, d dVar) {
        this.f82529b = context;
        this.f82530c = jobScheduler;
        this.f82531e = dVar;
        this.f82532f = workDatabase;
        this.f82533g = aVar;
    }
}

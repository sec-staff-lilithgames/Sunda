package o6;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final String f77971a = n6.c0.tagWithPrefix("Schedulers");

    public static void a(v6.c0 c0Var, n6.b bVar, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = bVar.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c0Var.markWorkSpecScheduled(((v6.b0) it.next()).f89053a, jCurrentTimeMillis);
            }
        }
    }

    public static void registerRescheduling(final List<r> list, p pVar, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar) {
        pVar.addExecutionListener(new e() { // from class: o6.s
            @Override // o6.e
            public final void onExecuted(v6.s sVar, boolean z10) {
                executor.execute(new al.a(27, list, sVar, aVar, workDatabase));
            }
        });
    }

    public static void schedule(androidx.work.a aVar, WorkDatabase workDatabase, List<r> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        v6.c0 c0VarWorkSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<v6.b0> eligibleWorkForSchedulingWithContentUris = c0VarWorkSpecDao.getEligibleWorkForSchedulingWithContentUris();
            a(c0VarWorkSpecDao, aVar.getClock(), eligibleWorkForSchedulingWithContentUris);
            List<v6.b0> eligibleWorkForScheduling = c0VarWorkSpecDao.getEligibleWorkForScheduling(aVar.getMaxSchedulerLimit());
            a(c0VarWorkSpecDao, aVar.getClock(), eligibleWorkForScheduling);
            eligibleWorkForScheduling.addAll(eligibleWorkForSchedulingWithContentUris);
            List<v6.b0> allEligibleWorkSpecsForScheduling = c0VarWorkSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling.size() > 0) {
                v6.b0[] b0VarArr = (v6.b0[]) eligibleWorkForScheduling.toArray(new v6.b0[eligibleWorkForScheduling.size()]);
                for (r rVar : list) {
                    if (rVar.hasLimitedSchedulingSlots()) {
                        rVar.schedule(b0VarArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling.size() > 0) {
                v6.b0[] b0VarArr2 = (v6.b0[]) allEligibleWorkSpecsForScheduling.toArray(new v6.b0[allEligibleWorkSpecsForScheduling.size()]);
                for (r rVar2 : list) {
                    if (!rVar2.hasLimitedSchedulingSlots()) {
                        rVar2.schedule(b0VarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }
}

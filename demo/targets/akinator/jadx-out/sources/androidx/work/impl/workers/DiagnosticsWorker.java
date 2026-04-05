package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import n6.a0;
import o6.y0;
import v6.b0;
import v6.c0;
import v6.o;
import v6.p0;
import v6.u;
import y6.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public a0 doWork() {
        y0 y0Var = y0.getInstance(getApplicationContext());
        e0.checkNotNullExpressionValue(y0Var, "getInstance(...)");
        WorkDatabase workDatabase = y0Var.getWorkDatabase();
        e0.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
        c0 c0VarWorkSpecDao = workDatabase.workSpecDao();
        u uVarWorkNameDao = workDatabase.workNameDao();
        p0 p0VarWorkTagDao = workDatabase.workTagDao();
        o oVarSystemIdInfoDao = workDatabase.systemIdInfoDao();
        List<b0> recentlyCompletedWork = c0VarWorkSpecDao.getRecentlyCompletedWork(y0Var.getConfiguration().getClock().currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<b0> runningWork = c0VarWorkSpecDao.getRunningWork();
        List<b0> allEligibleWorkSpecsForScheduling = c0VarWorkSpecDao.getAllEligibleWorkSpecsForScheduling(200);
        if (!recentlyCompletedWork.isEmpty()) {
            n6.c0.get().info(j.f94114a, "Recently completed work:\n\n");
            n6.c0.get().info(j.f94114a, j.access$workSpecRows(uVarWorkNameDao, p0VarWorkTagDao, oVarSystemIdInfoDao, recentlyCompletedWork));
        }
        if (!runningWork.isEmpty()) {
            n6.c0.get().info(j.f94114a, "Running work:\n\n");
            n6.c0.get().info(j.f94114a, j.access$workSpecRows(uVarWorkNameDao, p0VarWorkTagDao, oVarSystemIdInfoDao, runningWork));
        }
        if (!allEligibleWorkSpecsForScheduling.isEmpty()) {
            n6.c0.get().info(j.f94114a, "Enqueued work:\n\n");
            n6.c0.get().info(j.f94114a, j.access$workSpecRows(uVarWorkNameDao, p0VarWorkTagDao, oVarSystemIdInfoDao, allEligibleWorkSpecsForScheduling));
        }
        a0 a0VarSuccess = a0.success();
        e0.checkNotNullExpressionValue(a0VarSuccess, "success(...)");
        return a0VarSuccess;
    }
}

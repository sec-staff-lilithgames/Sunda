package w6;

import androidx.work.impl.WorkDatabase;
import o6.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90407a = n6.c0.tagWithPrefix("EnqueueRunnable");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c3  */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(o6.d0 r20) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.f.a(o6.d0):boolean");
    }

    public static boolean addToDatabase(o6.d0 d0Var) {
        y0 workManagerImpl = d0Var.getWorkManagerImpl();
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            g.checkContentUriTriggerWorkerLimits(workDatabase, workManagerImpl.getConfiguration(), d0Var);
            boolean zA = a(d0Var);
            workDatabase.setTransactionSuccessful();
            return zA;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public static void enqueue(o6.d0 d0Var) {
        if (d0Var.hasCycles()) {
            throw new IllegalStateException("WorkContinuation has cycles (" + d0Var + ")");
        }
        if (addToDatabase(d0Var)) {
            scheduleWorkInBackground(d0Var);
        }
    }

    public static void scheduleWorkInBackground(o6.d0 d0Var) {
        y0 workManagerImpl = d0Var.getWorkManagerImpl();
        o6.t.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }
}

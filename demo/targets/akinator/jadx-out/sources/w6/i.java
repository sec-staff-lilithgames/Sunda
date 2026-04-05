package w6;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f90419a;

    public i(WorkDatabase workDatabase) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workDatabase, "workDatabase");
        this.f90419a = workDatabase;
    }

    public final int nextAlarmManagerId() {
        Object objRunInTransaction = this.f90419a.runInTransaction(new com.vungle.ads.internal.session.a(this, 14));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(objRunInTransaction, "runInTransaction(...)");
        return ((Number) objRunInTransaction).intValue();
    }

    public final int nextJobSchedulerIdWithRange(final int i10, final int i11) {
        Object objRunInTransaction = this.f90419a.runInTransaction((Callable<Object>) new Callable() { // from class: w6.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                i iVar = this.f90413b;
                int iAccess$nextId = j.access$nextId(iVar.f90419a, "next_job_scheduler_id");
                int i12 = i10;
                if (i12 > iAccess$nextId || iAccess$nextId > i11) {
                    iVar.f90419a.preferenceDao().insertPreference(new v6.e("next_job_scheduler_id", Long.valueOf(i12 + 1)));
                    iAccess$nextId = i12;
                }
                return Integer.valueOf(iAccess$nextId);
            }
        });
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(objRunInTransaction, "runInTransaction(...)");
        return ((Number) objRunInTransaction).intValue();
    }
}

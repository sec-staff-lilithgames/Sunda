package o6;

import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface t0 {
    default void startWork(u workSpecId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        startWork(workSpecId, null);
    }

    void startWork(u uVar, WorkerParameters.a aVar);

    default void stopWork(u workSpecId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        stopWork(workSpecId, -512);
    }

    void stopWork(u uVar, int i10);

    default void stopWorkWithReason(u workSpecId, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        stopWork(workSpecId, i10);
    }
}

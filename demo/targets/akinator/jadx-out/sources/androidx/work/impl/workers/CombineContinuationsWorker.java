package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.pairip.VMRunner;
import kotlin.jvm.internal.e0;
import n6.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public a0 doWork() {
        return (a0) VMRunner.invoke("nChoGIJe0Pj3vGV2", new Object[]{this});
    }
}

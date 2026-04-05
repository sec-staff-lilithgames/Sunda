package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorsKt;
import n6.a0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f7522b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends CancellationException {

        /* renamed from: b, reason: collision with root package name */
        public final int f7523b;

        public a(int i10) {
            this.f7523b = i10;
        }

        public final int getStopReason() {
            return this.f7523b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        e0.checkNotNullParameter(appContext, "appContext");
        e0.checkNotNullParameter(workerParameters, "workerParameters");
        this.f7522b = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$runWorker(androidx.work.impl.workers.ConstraintTrackingWorker r4, n6.b0 r5, r6.l r6, v6.b0 r7, zu.d r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof y6.b
            if (r0 == 0) goto L16
            r0 = r8
            y6.b r0 = (y6.b) r0
            int r1 = r0.f94090k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f94090k = r1
            goto L1b
        L16:
            y6.b r0 = new y6.b
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r4 = r0.f94088i
            java.lang.Object r8 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r0.f94090k
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            tu.a0.throwOnFailure(r4)
            goto L46
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            tu.a0.throwOnFailure(r4)
            androidx.work.impl.workers.a r4 = new androidx.work.impl.workers.a
            r1 = 0
            r4.<init>(r5, r6, r7, r1)
            r0.f94090k = r2
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r4, r0)
            if (r4 != r8) goto L46
            return r8
        L46:
            java.lang.String r5 = "coroutineScope(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.access$runWorker(androidx.work.impl.workers.ConstraintTrackingWorker, n6.b0, r6.l, v6.b0, zu.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Type inference failed for: r11v4, types: [n6.e1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.work.WorkerParameters] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [n6.b0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$setupAndRunConstraintTrackingWork(androidx.work.impl.workers.ConstraintTrackingWorker r14, zu.d r15) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.access$setupAndRunConstraintTrackingWork(androidx.work.impl.workers.ConstraintTrackingWorker, zu.d):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(d<? super a0> dVar) {
        Executor backgroundExecutor = getBackgroundExecutor();
        e0.checkNotNullExpressionValue(backgroundExecutor, "getBackgroundExecutor(...)");
        return BuildersKt.withContext(ExecutorsKt.from(backgroundExecutor), new y6.a(this, null), dVar);
    }
}

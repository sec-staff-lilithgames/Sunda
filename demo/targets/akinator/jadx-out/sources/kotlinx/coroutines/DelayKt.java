package kotlinx.coroutines;

import av.e;
import bv.d;
import bv.f;
import bv.h;
import tu.t;
import tu.x0;
import tv.i;
import zu.k;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DelayKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.DelayKt$awaitCancellation$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DelayKt.awaitCancellation(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitCancellation(zu.d<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            tu.a0.throwOnFailure(r4)
            goto L52
        L31:
            tu.a0.throwOnFailure(r4)
            r0.label = r3
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            zu.d r2 = av.b.intercepted(r0)
            r4.<init>(r2, r3)
            r4.initCancellability()
            java.lang.Object r4 = r4.getResult()
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            if (r4 != r2) goto L4f
            bv.h.probeCoroutineSuspended(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            tu.k r4 = new tu.k
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.awaitCancellation(zu.d):java.lang.Object");
    }

    public static final Object delay(long j10, zu.d<? super x0> dVar) {
        x0 x0Var = x0.f87415a;
        if (j10 <= 0) {
            return x0Var;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        if (j10 < Long.MAX_VALUE) {
            getDelay(cancellableContinuationImpl.getContext()).mo5198scheduleResumeAfterDelay(j10, cancellableContinuationImpl);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result == e.getCOROUTINE_SUSPENDED() ? result : x0Var;
    }

    /* renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m5128delayVtjQ1oo(long j10, zu.d<? super x0> dVar) {
        Object objDelay = delay(m5129toDelayMillisLRDsOJo(j10), dVar);
        return objDelay == e.getCOROUTINE_SUSPENDED() ? objDelay : x0.f87415a;
    }

    public static final Delay getDelay(m mVar) {
        k kVar = mVar.get(zu.f.f98853b);
        Delay delay = kVar instanceof Delay ? (Delay) kVar : null;
        return delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
    }

    /* renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m5129toDelayMillisLRDsOJo(long j10) {
        boolean zM7206isPositiveimpl = tv.f.m7206isPositiveimpl(j10);
        if (zM7206isPositiveimpl) {
            return tv.f.m7195getInWholeMillisecondsimpl(tv.f.m7208plusLRDsOJo(j10, tv.h.toDuration(999999L, i.f87439c)));
        }
        if (zM7206isPositiveimpl) {
            throw new t();
        }
        return 0L;
    }
}

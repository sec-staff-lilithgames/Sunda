package kotlinx.coroutines;

import av.e;
import bv.d;
import bv.f;
import bv.h;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TimeoutKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {102}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    /* renamed from: kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends d {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TimeoutKt.withTimeoutOrNull(0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.coroutines.TimeoutCancellationException TimeoutCancellationException(long r2, kotlinx.coroutines.Delay r4, kotlinx.coroutines.Job r5) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayWithTimeoutDiagnostics
            if (r0 == 0) goto L7
            kotlinx.coroutines.DelayWithTimeoutDiagnostics r4 = (kotlinx.coroutines.DelayWithTimeoutDiagnostics) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            tv.e r0 = tv.f.f87433c
            tv.i r0 = tv.i.f87441f
            long r0 = tv.h.toDuration(r2, r0)
            java.lang.String r4 = r4.m5130timeoutMessageLRDsOJo(r0)
            if (r4 != 0) goto L20
        L18:
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r0 = " ms"
            java.lang.String r4 = p0.o2.n(r2, r4, r0)
        L20:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.TimeoutCancellationException(long, kotlinx.coroutines.Delay, kotlinx.coroutines.Job):kotlinx.coroutines.TimeoutCancellationException");
    }

    private static final <U, T extends U> Object setupTimeout(TimeoutCoroutine<U, ? super T> timeoutCoroutine, p pVar) {
        JobKt.disposeOnCompletion(timeoutCoroutine, DelayKt.getDelay(timeoutCoroutine.uCont.getContext()).invokeOnTimeout(timeoutCoroutine.time, timeoutCoroutine, timeoutCoroutine.getContext()));
        return UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(timeoutCoroutine, timeoutCoroutine, pVar);
    }

    public static final <T> Object withTimeout(long j10, p pVar, zu.d<? super T> dVar) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object obj = setupTimeout(new TimeoutCoroutine(j10, dVar), pVar);
        if (obj == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return obj;
    }

    /* renamed from: withTimeout-KLykuaI, reason: not valid java name */
    public static final <T> Object m5137withTimeoutKLykuaI(long j10, p pVar, zu.d<? super T> dVar) {
        return withTimeout(DelayKt.m5129toDelayMillisLRDsOJo(j10), pVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object withTimeoutOrNull(long r7, kv.p r9, zu.d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.b1 r7 = (kotlin.jvm.internal.b1) r7
            java.lang.Object r8 = r0.L$0
            kv.p r8 = (kv.p) r8
            tu.a0.throwOnFailure(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            tu.a0.throwOnFailure(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.b1 r10 = new kotlin.jvm.internal.b1
            r10.<init>()
            r0.L$0 = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.L$1 = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.J$0 = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.label = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            kotlinx.coroutines.TimeoutCoroutine r2 = new kotlinx.coroutines.TimeoutCoroutine     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.f71816b = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = setupTimeout(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = av.e.getCOROUTINE_SUSPENDED()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            bv.h.probeCoroutineSuspended(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L6f
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        L6f:
            kotlinx.coroutines.Job r9 = r8.coroutine
            java.lang.Object r7 = r7.f71816b
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(long, kv.p, zu.d):java.lang.Object");
    }

    /* renamed from: withTimeoutOrNull-KLykuaI, reason: not valid java name */
    public static final <T> Object m5138withTimeoutOrNullKLykuaI(long j10, p pVar, zu.d<? super T> dVar) {
        return withTimeoutOrNull(DelayKt.m5129toDelayMillisLRDsOJo(j10), pVar, dVar);
    }
}

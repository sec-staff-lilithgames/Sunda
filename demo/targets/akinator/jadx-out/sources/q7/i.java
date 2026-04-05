package q7;

import androidx.lifecycle.a1;
import androidx.lifecycle.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitStarted(androidx.lifecycle.k0 r7, zu.d<? super tu.x0> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof q7.g
            if (r0 == 0) goto L13
            r0 = r8
            q7.g r0 = (q7.g) r0
            int r1 = r0.f82541l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82541l = r1
            goto L18
        L13:
            q7.g r0 = new q7.g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f82540k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f82541l
            tu.x0 r3 = tu.x0.f87415a
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            kotlin.jvm.internal.b1 r7 = r0.f82539j
            androidx.lifecycle.k0 r0 = r0.f82538i
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2f
            goto L86
        L2f:
            r8 = move-exception
            goto L90
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            tu.a0.throwOnFailure(r8)
            androidx.lifecycle.j0 r8 = r7.getCurrentState()
            androidx.lifecycle.j0 r2 = androidx.lifecycle.j0.f6617f
            boolean r8 = r8.isAtLeast(r2)
            if (r8 == 0) goto L49
            goto L8f
        L49:
            kotlin.jvm.internal.b1 r8 = new kotlin.jvm.internal.b1
            r8.<init>()
            r0.f82538i = r7     // Catch: java.lang.Throwable -> L7b
            r0.f82539j = r8     // Catch: java.lang.Throwable -> L7b
            r0.f82541l = r4     // Catch: java.lang.Throwable -> L7b
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L7b
            zu.d r5 = av.b.intercepted(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L7b
            r2.initCancellability()     // Catch: java.lang.Throwable -> L7b
            q7.h r4 = new q7.h     // Catch: java.lang.Throwable -> L7b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            r8.f71816b = r4     // Catch: java.lang.Throwable -> L7b
            kotlin.jvm.internal.e0.checkNotNull(r4)     // Catch: java.lang.Throwable -> L7b
            r7.addObserver(r4)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r2 = r2.getResult()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r4 = av.e.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L7b
            if (r2 != r4) goto L81
            bv.h.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L7b
            goto L81
        L7b:
            r0 = move-exception
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r6
            goto L90
        L81:
            if (r2 != r1) goto L84
            return r1
        L84:
            r0 = r7
            r7 = r8
        L86:
            java.lang.Object r7 = r7.f71816b
            androidx.lifecycle.a1 r7 = (androidx.lifecycle.a1) r7
            if (r7 == 0) goto L8f
            r0.removeObserver(r7)
        L8f:
            return r3
        L90:
            java.lang.Object r7 = r7.f71816b
            androidx.lifecycle.a1 r7 = (androidx.lifecycle.a1) r7
            if (r7 == 0) goto L99
            r0.removeObserver(r7)
        L99:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.i.awaitStarted(androidx.lifecycle.k0, zu.d):java.lang.Object");
    }

    public static final void removeAndAddObserver(k0 k0Var, a1 a1Var) {
        k0Var.removeObserver(a1Var);
        k0Var.addObserver(a1Var);
    }
}

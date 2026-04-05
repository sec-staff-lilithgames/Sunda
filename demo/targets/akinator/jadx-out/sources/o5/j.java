package o5;

import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {
    public j(kotlin.jvm.internal.u uVar) {
    }

    @tu.f
    public final <R> Flow<R> createFlow(y0 db2, boolean z10, String[] tableNames, Callable<R> callable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(callable, "callable");
        return q5.o.createFlow(db2, z10, tableNames, new aw.f(callable, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object execute(o5.y0 r6, boolean r7, java.util.concurrent.Callable<R> r8, zu.d<? super R> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof o5.e
            if (r0 == 0) goto L13
            r0 = r9
            o5.e r0 = (o5.e) r0
            int r1 = r0.f77535l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77535l = r1
            goto L18
        L13:
            o5.e r0 = new o5.e
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f77533j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77535l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.util.concurrent.Callable r8 = r0.f77532i
            tu.a0.throwOnFailure(r9)
            goto L59
        L3a:
            tu.a0.throwOnFailure(r9)
            boolean r9 = r6.isOpenInternal()
            if (r9 == 0) goto L4e
            boolean r9 = r6.inTransaction()
            if (r9 == 0) goto L4e
            java.lang.Object r6 = r8.call()
            return r6
        L4e:
            r0.f77532i = r8
            r0.f77535l = r4
            java.lang.Object r9 = u5.c.getCoroutineContext(r6, r7, r0)
            if (r9 != r1) goto L59
            goto L6b
        L59:
            zu.m r9 = (zu.m) r9
            o5.f r6 = new o5.f
            r7 = 0
            r6.<init>(r8, r7)
            r0.f77532i = r7
            r0.f77535l = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r9, r6, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j.execute(o5.y0, boolean, java.util.concurrent.Callable, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object execute(o5.y0 r17, boolean r18, android.os.CancellationSignal r19, java.util.concurrent.Callable<R> r20, zu.d<? super R> r21) {
        /*
            r16 = this;
            r0 = r17
            r1 = r21
            boolean r2 = r1 instanceof o5.g
            if (r2 == 0) goto L19
            r2 = r1
            o5.g r2 = (o5.g) r2
            int r3 = r2.f77571o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f77571o = r3
            r3 = r16
            goto L20
        L19:
            o5.g r2 = new o5.g
            r3 = r16
            r2.<init>(r3, r1)
        L20:
            java.lang.Object r1 = r2.f77569m
            java.lang.Object r4 = av.e.getCOROUTINE_SUSPENDED()
            int r5 = r2.f77571o
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4b
            if (r5 == r7) goto L3c
            if (r5 != r6) goto L34
            tu.a0.throwOnFailure(r1)
            return r1
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            java.util.concurrent.Callable r0 = r2.f77567k
            android.os.CancellationSignal r5 = r2.f77566j
            o5.y0 r8 = r2.f77565i
            tu.a0.throwOnFailure(r1)
            r15 = r5
            r5 = r0
            r0 = r8
            r8 = r1
            r1 = r15
            goto L74
        L4b:
            tu.a0.throwOnFailure(r1)
            boolean r1 = r0.isOpenInternal()
            if (r1 == 0) goto L5f
            boolean r1 = r0.inTransaction()
            if (r1 == 0) goto L5f
            java.lang.Object r0 = r20.call()
            return r0
        L5f:
            r2.f77565i = r0
            r1 = r19
            r2.f77566j = r1
            r5 = r20
            r2.f77567k = r5
            r2.f77571o = r7
            r8 = r18
            java.lang.Object r8 = u5.c.getCoroutineContext(r0, r8, r2)
            if (r8 != r4) goto L74
            goto Lb5
        L74:
            r10 = r8
            zu.m r10 = (zu.m) r10
            r2.f77565i = r0
            r2.f77566j = r1
            r2.f77567k = r5
            r2.f77568l = r10
            r2.f77571o = r6
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl
            zu.d r8 = av.b.intercepted(r2)
            r6.<init>(r8, r7)
            r6.initCancellability()
            kotlinx.coroutines.CoroutineScope r9 = r0.getCoroutineScope()
            o5.i r12 = new o5.i
            r0 = 0
            r12.<init>(r5, r6, r0)
            r13 = 2
            r14 = 0
            r11 = 0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r9, r10, r11, r12, r13, r14)
            o5.h r5 = new o5.h
            r5.<init>(r1, r0)
            r6.invokeOnCancellation(r5)
            java.lang.Object r0 = r6.getResult()
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lb3
            bv.h.probeCoroutineSuspended(r2)
        Lb3:
            if (r0 != r4) goto Lb6
        Lb5:
            return r4
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.j.execute(o5.y0, boolean, android.os.CancellationSignal, java.util.concurrent.Callable, zu.d):java.lang.Object");
    }
}

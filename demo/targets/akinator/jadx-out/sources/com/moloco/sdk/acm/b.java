package com.moloco.sdk.acm;

import bv.n;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f45505i;

    /* renamed from: j, reason: collision with root package name */
    public int f45506j;

    public b(zu.d<? super b> dVar) {
        super(2, dVar);
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new b(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.f45506j
            r2 = 0
            java.lang.String r3 = "eventProcessor"
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            java.util.Iterator r1 = r7.f45505i
            tu.a0.throwOnFailure(r8)
            goto L5c
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.util.Iterator r1 = r7.f45505i
            tu.a0.throwOnFailure(r8)
            goto L30
        L25:
            tu.a0.throwOnFailure(r8)
            java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.a.access$getPreInitTimerList$p()
            java.util.Iterator r1 = r8.iterator()
        L30:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L54
            java.lang.Object r8 = r1.next()
            com.moloco.sdk.acm.g r8 = (com.moloco.sdk.acm.g) r8
            com.moloco.sdk.acm.eventprocessing.h r6 = com.moloco.sdk.acm.a.access$getEventProcessor$p()
            if (r6 != 0) goto L46
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r3)
            r6 = r2
        L46:
            kotlin.jvm.internal.e0.checkNotNull(r8)
            r7.f45505i = r1
            r7.f45506j = r5
            java.lang.Object r8 = r6.a(r8, r7)
            if (r8 != r0) goto L30
            goto L7f
        L54:
            java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.a.access$getPreInitCountList$p()
            java.util.Iterator r1 = r8.iterator()
        L5c:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L80
            java.lang.Object r8 = r1.next()
            com.moloco.sdk.acm.d r8 = (com.moloco.sdk.acm.d) r8
            com.moloco.sdk.acm.eventprocessing.h r5 = com.moloco.sdk.acm.a.access$getEventProcessor$p()
            if (r5 != 0) goto L72
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r3)
            r5 = r2
        L72:
            kotlin.jvm.internal.e0.checkNotNull(r8)
            r7.f45505i = r1
            r7.f45506j = r4
            java.lang.Object r8 = r5.a(r8, r7)
            if (r8 != r0) goto L5c
        L7f:
            return r0
        L80:
            java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.a.access$getPreInitTimerList$p()
            r8.clear()
            java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.a.access$getPreInitCountList$p()
            r8.clear()
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

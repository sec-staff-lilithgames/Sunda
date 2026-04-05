package z4;

import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kv.p;
import p0.d3;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f97521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f97522j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Flow f97523k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d3 f97524l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, Flow flow, d3 d3Var, zu.d dVar) {
        super(2, dVar);
        this.f97522j = mVar;
        this.f97523k = flow;
        this.f97524l = d3Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f97522j, this.f97523k, this.f97524l, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5.collect(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return r0;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f97521i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            tu.a0.throwOnFailure(r7)
            goto L49
        L1b:
            tu.a0.throwOnFailure(r7)
            zu.n r7 = zu.n.f98854b
            zu.m r1 = r6.f97522j
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r1, r7)
            p0.d3 r4 = r6.f97524l
            kotlinx.coroutines.flow.Flow r5 = r6.f97523k
            if (r7 == 0) goto L3a
            z4.a r7 = new z4.a
            r7.<init>(r4)
            r6.f97521i = r3
            java.lang.Object r7 = r5.collect(r7, r6)
            if (r7 != r0) goto L49
            goto L48
        L3a:
            z4.c r7 = new z4.c
            r3 = 0
            r7.<init>(r5, r4, r3)
            r6.f97521i = r2
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r7, r6)
            if (r7 != r0) goto L49
        L48:
            return r0
        L49:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

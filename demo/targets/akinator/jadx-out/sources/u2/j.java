package u2;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f87733i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f87734j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f87735k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f87736l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z10, o oVar, long j10, zu.d dVar) {
        super(2, dVar);
        this.f87734j = z10;
        this.f87735k = oVar;
        this.f87736l = j10;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new j(this.f87734j, this.f87735k, this.f87736l, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r4.m7015dispatchPostFlingRZ2iAVY(r5, r10.f87736l, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1.m7015dispatchPostFlingRZ2iAVY(r10.f87736l, r4, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        return r0;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r10.f87733i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            tu.a0.throwOnFailure(r11)
            goto L55
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            tu.a0.throwOnFailure(r11)
            r6 = r10
            goto L55
        L1f:
            tu.a0.throwOnFailure(r11)
            boolean r11 = r10.f87734j
            u2.o r1 = r10.f87735k
            if (r11 != 0) goto L3f
            t1.e r4 = u2.o.access$getDispatcher$p(r1)
            s2.d0 r11 = s2.e0.f85330b
            long r5 = r11.m6777getZero9UxMQ8M()
            r10.f87733i = r3
            long r7 = r10.f87736l
            r9 = r10
            java.lang.Object r11 = r4.m7015dispatchPostFlingRZ2iAVY(r5, r7, r9)
            r6 = r9
            if (r11 != r0) goto L55
            goto L54
        L3f:
            r6 = r10
            t1.e r1 = u2.o.access$getDispatcher$p(r1)
            s2.d0 r11 = s2.e0.f85330b
            long r4 = r11.m6777getZero9UxMQ8M()
            r6.f87733i = r2
            long r2 = r6.f87736l
            java.lang.Object r11 = r1.m7015dispatchPostFlingRZ2iAVY(r2, r4, r6)
            if (r11 != r0) goto L55
        L54:
            return r0
        L55:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

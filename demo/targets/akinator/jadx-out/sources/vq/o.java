package vq;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f89600i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f89601j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f89602k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f89603l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c cVar, String str, a aVar, zu.d dVar) {
        super(2, dVar);
        this.f89601j = cVar;
        this.f89602k = str;
        this.f89603l = aVar;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new o(this.f89601j, this.f89602k, this.f89603l, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r7.c(r5, r4, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r7.b(r5, r3, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
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
            int r1 = r6.f89600i
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
            goto L47
        L1b:
            tu.a0.throwOnFailure(r7)
            vq.c r7 = r6.f89601j
            java.lang.String r1 = r6.f89602k
            android.net.Uri r4 = r7.b(r1)
            vq.a r5 = r6.f89603l
            if (r4 == 0) goto L33
            r6.f89600i = r3
            java.lang.Object r7 = vq.c.a(r7, r5, r4, r6)
            if (r7 != r0) goto L47
            goto L46
        L33:
            br.h0 r3 = new br.h0
            java.lang.String r4 = "Can't parse video stream url - "
            java.lang.String r1 = a.b.k(r4, r1)
            r3.<init>(r1)
            r6.f89600i = r2
            java.lang.Object r7 = vq.c.a(r7, r5, r3, r6)
            if (r7 != r0) goto L47
        L46:
            return r0
        L47:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

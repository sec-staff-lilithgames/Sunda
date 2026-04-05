package vq;

import br.e1;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f89588i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1 f89589j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f89590k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f89591l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e1 e1Var, a aVar, c cVar, zu.d dVar) {
        super(2, dVar);
        this.f89589j = e1Var;
        this.f89590k = cVar;
        this.f89591l = aVar;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        c cVar = this.f89590k;
        return new l(this.f89589j, this.f89591l, cVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r5.c(r4, r8, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r5.b(r4, r8, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        return r0;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.f89588i
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            tu.a0.throwOnFailure(r8)
            goto L69
        L1b:
            tu.a0.throwOnFailure(r8)
            br.e1 r8 = r7.f89589j
            boolean r1 = r8 instanceof br.c2
            vq.a r4 = r7.f89591l
            vq.c r5 = r7.f89590k
            if (r1 == 0) goto L3e
            br.c2 r8 = (br.c2) r8
            java.lang.String r8 = r8.getUrl()
            cr.f$d r0 = new cr.f$d
            r0.<init>()
            br.h0 r1 = new br.h0
            java.lang.String r2 = "Uri is null"
            r1.<init>(r2)
            r5.a(r8, r0, r4, r1)
            goto L69
        L3e:
            boolean r1 = r8 instanceof br.r
            if (r1 == 0) goto L69
            br.r r8 = (br.r) r8
            java.lang.String r8 = r8.getBase64()
            r1 = 0
            r6 = 0
            java.lang.String r8 = ir.q.decodeBase64ToString$default(r8, r1, r3, r6)
            if (r8 == 0) goto L59
            r7.f89588i = r2
            java.lang.Object r8 = vq.c.a(r5, r4, r8, r7)
            if (r8 != r0) goto L69
            goto L68
        L59:
            br.h0 r8 = new br.h0
            java.lang.String r1 = "Can't decode string from base64"
            r8.<init>(r1)
            r7.f89588i = r3
            java.lang.Object r8 = vq.c.a(r5, r4, r8, r7)
            if (r8 != r0) goto L69
        L68:
            return r0
        L69:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

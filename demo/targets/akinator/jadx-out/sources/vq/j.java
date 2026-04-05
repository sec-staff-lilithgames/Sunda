package vq;

import br.e1;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f89580i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1 f89581j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f89582k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f89583l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e1 e1Var, a aVar, c cVar, zu.d dVar) {
        super(2, dVar);
        this.f89581j = e1Var;
        this.f89582k = cVar;
        this.f89583l = aVar;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        c cVar = this.f89582k;
        return new j(this.f89581j, this.f89583l, cVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6.a((br.c2) r1, r8, r5, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r6.a((br.r) r1, r8, r5, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
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
            int r1 = r7.f89580i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            tu.a0.throwOnFailure(r8)
            goto L49
        L1b:
            tu.a0.throwOnFailure(r8)
            android.graphics.BitmapFactory$Options r8 = ir.e.createDefaultBitmapFactoryOptions()
            r1 = 0
            r8.inJustDecodeBounds = r1
            br.e1 r1 = r7.f89581j
            boolean r4 = r1 instanceof br.c2
            vq.a r5 = r7.f89583l
            vq.c r6 = r7.f89582k
            if (r4 == 0) goto L3a
            br.c2 r1 = (br.c2) r1
            r7.f89580i = r3
            java.lang.Object r8 = r6.a(r1, r8, r5, r7)
            if (r8 != r0) goto L49
            goto L48
        L3a:
            boolean r3 = r1 instanceof br.r
            if (r3 == 0) goto L49
            br.r r1 = (br.r) r1
            r7.f89580i = r2
            java.lang.Object r8 = r6.a(r1, r8, r5, r7)
            if (r8 != r0) goto L49
        L48:
            return r0
        L49:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

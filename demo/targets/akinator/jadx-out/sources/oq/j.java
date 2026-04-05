package oq;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f79746i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f79747j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ dq.h f79748k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f79749l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ br.i f79750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x xVar, dq.h hVar, boolean z10, br.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f79747j = xVar;
        this.f79748k = hVar;
        this.f79749l = z10;
        this.f79750m = iVar;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new j(this.f79747j, this.f79748k, this.f79749l, this.f79750m, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r2.a(r9, r1, r8.f79750m, r6, r8) == r0) goto L17;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.f79746i
            oq.x r2 = r8.f79747j
            dq.h r3 = r8.f79748k
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            tu.a0.throwOnFailure(r9)
            goto L4e
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            tu.a0.throwOnFailure(r9)
            goto L2e
        L22:
            tu.a0.throwOnFailure(r9)
            r8.f79746i = r5
            java.lang.Object r9 = oq.x.a(r2, r3, r8)
            if (r9 != r0) goto L2e
            goto L4d
        L2e:
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L4e
            br.a r1 = r3.h()
            boolean r5 = r8.f79749l
            oq.a r1 = oq.d.a(r1, r5)
            boolean r6 = r3.i()
            r8.f79746i = r4
            br.i r5 = r8.f79750m
            r7 = r8
            r3 = r9
            r4 = r1
            java.lang.Object r9 = r2.a(r3, r4, r5, r6, r7)
            if (r9 != r0) goto L4e
        L4d:
            return r0
        L4e:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

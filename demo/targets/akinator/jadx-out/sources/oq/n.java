package oq;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f79768i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f79769j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ dq.i f79770k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ br.i f79771l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f79772m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Runnable f79773n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Runnable f79774o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x xVar, dq.i iVar, br.i iVar2, boolean z10, Runnable runnable, Runnable runnable2, zu.d dVar) {
        super(2, dVar);
        this.f79769j = xVar;
        this.f79770k = iVar;
        this.f79771l = iVar2;
        this.f79772m = z10;
        this.f79773n = runnable;
        this.f79774o = runnable2;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new n(this.f79769j, this.f79770k, this.f79771l, this.f79772m, this.f79773n, this.f79774o, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r2.a(r11, r10.f79771l, r10.f79772m, true, r10.f79773n, r10.f79774o, r10) == r0) goto L17;
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
            int r1 = r10.f79768i
            oq.x r2 = r10.f79769j
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            tu.a0.throwOnFailure(r11)
            goto L46
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            tu.a0.throwOnFailure(r11)
            goto L2e
        L20:
            tu.a0.throwOnFailure(r11)
            r10.f79768i = r4
            dq.i r11 = r10.f79770k
            java.lang.Object r11 = oq.x.a(r2, r11, r10)
            if (r11 != r0) goto L2e
            goto L45
        L2e:
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L46
            r10.f79768i = r3
            r6 = 1
            br.i r4 = r10.f79771l
            boolean r5 = r10.f79772m
            java.lang.Runnable r7 = r10.f79773n
            java.lang.Runnable r8 = r10.f79774o
            r9 = r10
            r3 = r11
            java.lang.Object r11 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L46
        L45:
            return r0
        L46:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package oq;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f79788i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f79789j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ dq.h f79790k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ br.i f79791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f79792m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Runnable f79793n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Runnable f79794o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, dq.h hVar, br.i iVar, boolean z10, Runnable runnable, Runnable runnable2, zu.d dVar) {
        super(2, dVar);
        this.f79789j = xVar;
        this.f79790k = hVar;
        this.f79791l = iVar;
        this.f79792m = z10;
        this.f79793n = runnable;
        this.f79794o = runnable2;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((s) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new s(this.f79789j, this.f79790k, this.f79791l, this.f79792m, this.f79793n, this.f79794o, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2.b(r11, r10.f79791l, r10.f79792m, r6, r10.f79793n, r10.f79794o, r10) == r0) goto L17;
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
            int r1 = r10.f79788i
            oq.x r2 = r10.f79789j
            dq.h r3 = r10.f79790k
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            tu.a0.throwOnFailure(r11)
            goto L49
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            tu.a0.throwOnFailure(r11)
            goto L2e
        L22:
            tu.a0.throwOnFailure(r11)
            r10.f79788i = r5
            java.lang.Object r11 = oq.x.a(r2, r3, r10)
            if (r11 != r0) goto L2e
            goto L48
        L2e:
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L49
            boolean r6 = r3.i()
            r10.f79788i = r4
            br.i r4 = r10.f79791l
            boolean r5 = r10.f79792m
            java.lang.Runnable r7 = r10.f79793n
            java.lang.Runnable r8 = r10.f79794o
            r9 = r10
            r3 = r11
            java.lang.Object r11 = r2.b(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L49
        L48:
            return r0
        L49:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package p0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public b1.h f80482i;

    /* renamed from: j, reason: collision with root package name */
    public int f80483j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f80484k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n3 f80485l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.q f80486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d2 f80487n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(n3 n3Var, kv.q qVar, d2 d2Var, zu.d dVar) {
        super(2, dVar);
        this.f80485l = n3Var;
        this.f80486m = qVar;
        this.f80487n = d2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        t3 t3Var = new t3(this.f80485l, this.f80486m, this.f80487n, dVar);
        t3Var.f80484k = obj;
        return t3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.t3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((t3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

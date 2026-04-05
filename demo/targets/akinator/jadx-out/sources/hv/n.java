package hv;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public uu.u f59222i;

    /* renamed from: j, reason: collision with root package name */
    public d f59223j;

    /* renamed from: k, reason: collision with root package name */
    public Object f59224k;

    /* renamed from: l, reason: collision with root package name */
    public Object f59225l;

    /* renamed from: m, reason: collision with root package name */
    public Object f59226m;

    /* renamed from: n, reason: collision with root package name */
    public Object f59227n;

    /* renamed from: o, reason: collision with root package name */
    public int f59228o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f59229p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p f59230q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, zu.d dVar) {
        super(2, dVar);
        this.f59230q = pVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        n nVar = new n(this.f59230q, dVar);
        nVar.f59229p = obj;
        return nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.nio.file.FileSystemLoopException, hv.i {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hv.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super x0> dVar) {
        return ((n) create(vVar, dVar)).invokeSuspend(x0.f87415a);
    }
}

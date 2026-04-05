package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0 extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f50981a;

    /* renamed from: b, reason: collision with root package name */
    public final st.g f50982b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f50983c;

    /* renamed from: d, reason: collision with root package name */
    public final st.g f50984d;

    /* renamed from: e, reason: collision with root package name */
    public final st.a f50985e;

    /* renamed from: f, reason: collision with root package name */
    public final st.a f50986f;

    /* renamed from: g, reason: collision with root package name */
    public final st.g f50987g;

    /* renamed from: h, reason: collision with root package name */
    public final st.p f50988h;

    /* renamed from: i, reason: collision with root package name */
    public final st.a f50989i;

    public f0(lu.b bVar, st.g gVar, st.g gVar2, st.g gVar3, st.a aVar, st.a aVar2, st.g gVar4, st.p pVar, st.a aVar3) {
        this.f50981a = bVar;
        this.f50982b = (st.g) ut.o0.requireNonNull(gVar, "onNext is null");
        this.f50983c = (st.g) ut.o0.requireNonNull(gVar2, "onAfterNext is null");
        this.f50984d = (st.g) ut.o0.requireNonNull(gVar3, "onError is null");
        this.f50985e = (st.a) ut.o0.requireNonNull(aVar, "onComplete is null");
        this.f50986f = (st.a) ut.o0.requireNonNull(aVar2, "onAfterTerminated is null");
        this.f50987g = (st.g) ut.o0.requireNonNull(gVar4, "onSubscribe is null");
        this.f50988h = (st.p) ut.o0.requireNonNull(pVar, "onRequest is null");
        this.f50989i = (st.a) ut.o0.requireNonNull(aVar3, "onCancel is null");
    }

    @Override // lu.b
    public int parallelism() {
        return this.f50981a.parallelism();
    }

    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            for (int i10 = 0; i10 < length; i10++) {
                cVarArr2[i10] = new e0(cVarArr[i10], this);
            }
            this.f50981a.subscribe(cVarArr2);
        }
    }
}

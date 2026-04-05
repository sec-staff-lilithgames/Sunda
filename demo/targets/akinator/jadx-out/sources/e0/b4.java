package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b4 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public u1.c f52982i;

    /* renamed from: j, reason: collision with root package name */
    public u1.o f52983j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f52984k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f52985l;

    /* renamed from: m, reason: collision with root package name */
    public int f52986m;

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f52985l = obj;
        this.f52986m |= Integer.MIN_VALUE;
        return q4.awaitFirstDownOnPass(null, null, false, this);
    }
}

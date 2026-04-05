package z7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97644a;

    /* renamed from: b, reason: collision with root package name */
    public final y7.b f97645b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.b f97646c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.n f97647d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f97648e;

    public p(String str, y7.b bVar, y7.b bVar2, y7.n nVar, boolean z10) {
        this.f97644a = str;
        this.f97645b = bVar;
        this.f97646c = bVar2;
        this.f97647d = nVar;
        this.f97648e = z10;
    }

    public y7.b getCopies() {
        return this.f97645b;
    }

    public String getName() {
        return this.f97644a;
    }

    public y7.b getOffset() {
        return this.f97646c;
    }

    public y7.n getTransform() {
        return this.f97647d;
    }

    public boolean isHidden() {
        return this.f97648e;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.q(a0Var, aVar, this);
    }
}

package z7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97573a;

    /* renamed from: b, reason: collision with root package name */
    public final y7.o f97574b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.f f97575c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f97576d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f97577e;

    public b(String str, y7.o oVar, y7.f fVar, boolean z10, boolean z11) {
        this.f97573a = str;
        this.f97574b = oVar;
        this.f97575c = fVar;
        this.f97576d = z10;
        this.f97577e = z11;
    }

    public String getName() {
        return this.f97573a;
    }

    public y7.o getPosition() {
        return this.f97574b;
    }

    public y7.f getSize() {
        return this.f97575c;
    }

    public boolean isHidden() {
        return this.f97577e;
    }

    public boolean isReversed() {
        return this.f97576d;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.g(a0Var, aVar, this);
    }
}

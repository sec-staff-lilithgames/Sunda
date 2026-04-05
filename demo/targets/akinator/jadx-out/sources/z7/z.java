package z7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class z implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97684a;

    /* renamed from: b, reason: collision with root package name */
    public final y f97685b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.b f97686c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.b f97687d;

    /* renamed from: e, reason: collision with root package name */
    public final y7.b f97688e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f97689f;

    public z(String str, y yVar, y7.b bVar, y7.b bVar2, y7.b bVar3, boolean z10) {
        this.f97684a = str;
        this.f97685b = yVar;
        this.f97686c = bVar;
        this.f97687d = bVar2;
        this.f97688e = bVar3;
        this.f97689f = z10;
    }

    public y7.b getEnd() {
        return this.f97687d;
    }

    public String getName() {
        return this.f97684a;
    }

    public y7.b getOffset() {
        return this.f97688e;
    }

    public y7.b getStart() {
        return this.f97686c;
    }

    public y getType() {
        return this.f97685b;
    }

    public boolean isHidden() {
        return this.f97689f;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.v(aVar, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.f97686c + ", end: " + this.f97687d + ", offset: " + this.f97688e + "}";
    }
}

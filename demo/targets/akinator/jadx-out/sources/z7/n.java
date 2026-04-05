package z7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97628a;

    /* renamed from: b, reason: collision with root package name */
    public final m f97629b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.b f97630c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.o f97631d;

    /* renamed from: e, reason: collision with root package name */
    public final y7.b f97632e;

    /* renamed from: f, reason: collision with root package name */
    public final y7.b f97633f;

    /* renamed from: g, reason: collision with root package name */
    public final y7.b f97634g;

    /* renamed from: h, reason: collision with root package name */
    public final y7.b f97635h;

    /* renamed from: i, reason: collision with root package name */
    public final y7.b f97636i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f97637j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f97638k;

    public n(String str, m mVar, y7.b bVar, y7.o oVar, y7.b bVar2, y7.b bVar3, y7.b bVar4, y7.b bVar5, y7.b bVar6, boolean z10, boolean z11) {
        this.f97628a = str;
        this.f97629b = mVar;
        this.f97630c = bVar;
        this.f97631d = oVar;
        this.f97632e = bVar2;
        this.f97633f = bVar3;
        this.f97634g = bVar4;
        this.f97635h = bVar5;
        this.f97636i = bVar6;
        this.f97637j = z10;
        this.f97638k = z11;
    }

    public y7.b getInnerRadius() {
        return this.f97633f;
    }

    public y7.b getInnerRoundedness() {
        return this.f97635h;
    }

    public String getName() {
        return this.f97628a;
    }

    public y7.b getOuterRadius() {
        return this.f97634g;
    }

    public y7.b getOuterRoundedness() {
        return this.f97636i;
    }

    public y7.b getPoints() {
        return this.f97630c;
    }

    public y7.o getPosition() {
        return this.f97631d;
    }

    public y7.b getRotation() {
        return this.f97632e;
    }

    public m getType() {
        return this.f97629b;
    }

    public boolean isHidden() {
        return this.f97637j;
    }

    public boolean isReversed() {
        return this.f97638k;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.o(a0Var, aVar, this);
    }
}

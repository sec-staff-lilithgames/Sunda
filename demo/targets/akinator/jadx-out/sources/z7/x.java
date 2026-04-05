package z7;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class x implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97671a;

    /* renamed from: b, reason: collision with root package name */
    public final y7.b f97672b;

    /* renamed from: c, reason: collision with root package name */
    public final List f97673c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.a f97674d;

    /* renamed from: e, reason: collision with root package name */
    public final y7.d f97675e;

    /* renamed from: f, reason: collision with root package name */
    public final y7.b f97676f;

    /* renamed from: g, reason: collision with root package name */
    public final v f97677g;

    /* renamed from: h, reason: collision with root package name */
    public final w f97678h;

    /* renamed from: i, reason: collision with root package name */
    public final float f97679i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f97680j;

    public x(String str, y7.b bVar, List<y7.b> list, y7.a aVar, y7.d dVar, y7.b bVar2, v vVar, w wVar, float f10, boolean z10) {
        this.f97671a = str;
        this.f97672b = bVar;
        this.f97673c = list;
        this.f97674d = aVar;
        this.f97675e = dVar;
        this.f97676f = bVar2;
        this.f97677g = vVar;
        this.f97678h = wVar;
        this.f97679i = f10;
        this.f97680j = z10;
    }

    public v getCapType() {
        return this.f97677g;
    }

    public y7.a getColor() {
        return this.f97674d;
    }

    public y7.b getDashOffset() {
        return this.f97672b;
    }

    public w getJoinType() {
        return this.f97678h;
    }

    public List<y7.b> getLineDashPattern() {
        return this.f97673c;
    }

    public float getMiterLimit() {
        return this.f97679i;
    }

    public String getName() {
        return this.f97671a;
    }

    public y7.d getOpacity() {
        return this.f97675e;
    }

    public y7.b getWidth() {
        return this.f97676f;
    }

    public boolean isHidden() {
        return this.f97680j;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.u(a0Var, aVar, this);
    }
}

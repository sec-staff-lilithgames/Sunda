package z7;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97588a;

    /* renamed from: b, reason: collision with root package name */
    public final g f97589b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.c f97590c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.d f97591d;

    /* renamed from: e, reason: collision with root package name */
    public final y7.f f97592e;

    /* renamed from: f, reason: collision with root package name */
    public final y7.f f97593f;

    /* renamed from: g, reason: collision with root package name */
    public final y7.b f97594g;

    /* renamed from: h, reason: collision with root package name */
    public final v f97595h;

    /* renamed from: i, reason: collision with root package name */
    public final w f97596i;

    /* renamed from: j, reason: collision with root package name */
    public final float f97597j;

    /* renamed from: k, reason: collision with root package name */
    public final List f97598k;

    /* renamed from: l, reason: collision with root package name */
    public final y7.b f97599l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f97600m;

    public f(String str, g gVar, y7.c cVar, y7.d dVar, y7.f fVar, y7.f fVar2, y7.b bVar, v vVar, w wVar, float f10, List<y7.b> list, y7.b bVar2, boolean z10) {
        this.f97588a = str;
        this.f97589b = gVar;
        this.f97590c = cVar;
        this.f97591d = dVar;
        this.f97592e = fVar;
        this.f97593f = fVar2;
        this.f97594g = bVar;
        this.f97595h = vVar;
        this.f97596i = wVar;
        this.f97597j = f10;
        this.f97598k = list;
        this.f97599l = bVar2;
        this.f97600m = z10;
    }

    public v getCapType() {
        return this.f97595h;
    }

    public y7.b getDashOffset() {
        return this.f97599l;
    }

    public y7.f getEndPoint() {
        return this.f97593f;
    }

    public y7.c getGradientColor() {
        return this.f97590c;
    }

    public g getGradientType() {
        return this.f97589b;
    }

    public w getJoinType() {
        return this.f97596i;
    }

    public List<y7.b> getLineDashPattern() {
        return this.f97598k;
    }

    public float getMiterLimit() {
        return this.f97597j;
    }

    public String getName() {
        return this.f97588a;
    }

    public y7.d getOpacity() {
        return this.f97591d;
    }

    public y7.f getStartPoint() {
        return this.f97592e;
    }

    public y7.b getWidth() {
        return this.f97594g;
    }

    public boolean isHidden() {
        return this.f97600m;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.j(a0Var, aVar, this);
    }
}

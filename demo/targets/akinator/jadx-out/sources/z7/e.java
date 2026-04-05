package z7;

import android.graphics.Path;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final g f97580a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f97581b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.c f97582c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.d f97583d;

    /* renamed from: e, reason: collision with root package name */
    public final y7.f f97584e;

    /* renamed from: f, reason: collision with root package name */
    public final y7.f f97585f;

    /* renamed from: g, reason: collision with root package name */
    public final String f97586g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f97587h;

    public e(String str, g gVar, Path.FillType fillType, y7.c cVar, y7.d dVar, y7.f fVar, y7.f fVar2, y7.b bVar, y7.b bVar2, boolean z10) {
        this.f97580a = gVar;
        this.f97581b = fillType;
        this.f97582c = cVar;
        this.f97583d = dVar;
        this.f97584e = fVar;
        this.f97585f = fVar2;
        this.f97586g = str;
        this.f97587h = z10;
    }

    public y7.f getEndPoint() {
        return this.f97585f;
    }

    public Path.FillType getFillType() {
        return this.f97581b;
    }

    public y7.c getGradientColor() {
        return this.f97582c;
    }

    public g getGradientType() {
        return this.f97580a;
    }

    public String getName() {
        return this.f97586g;
    }

    public y7.d getOpacity() {
        return this.f97583d;
    }

    public y7.f getStartPoint() {
        return this.f97584e;
    }

    public boolean isHidden() {
        return this.f97587h;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.i(a0Var, hVar, aVar, this);
    }
}

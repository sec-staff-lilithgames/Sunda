package y7;

import r7.a0;
import u7.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n implements z7.c {

    /* renamed from: a, reason: collision with root package name */
    public final e f94129a;

    /* renamed from: b, reason: collision with root package name */
    public final o f94130b;

    /* renamed from: c, reason: collision with root package name */
    public final g f94131c;

    /* renamed from: d, reason: collision with root package name */
    public final b f94132d;

    /* renamed from: e, reason: collision with root package name */
    public final d f94133e;

    /* renamed from: f, reason: collision with root package name */
    public final b f94134f;

    /* renamed from: g, reason: collision with root package name */
    public final b f94135g;

    /* renamed from: h, reason: collision with root package name */
    public final b f94136h;

    /* renamed from: i, reason: collision with root package name */
    public final b f94137i;

    /* renamed from: j, reason: collision with root package name */
    public final b f94138j;

    /* renamed from: k, reason: collision with root package name */
    public final b f94139k;

    /* renamed from: l, reason: collision with root package name */
    public final b f94140l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f94141m;

    public n() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public x createAnimation() {
        return new x(this);
    }

    public e getAnchorPoint() {
        return this.f94129a;
    }

    public b getEndOpacity() {
        return this.f94140l;
    }

    public d getOpacity() {
        return this.f94133e;
    }

    public o getPosition() {
        return this.f94130b;
    }

    public b getRotation() {
        return this.f94132d;
    }

    public b getRotationX() {
        return this.f94136h;
    }

    public b getRotationY() {
        return this.f94137i;
    }

    public b getRotationZ() {
        return this.f94138j;
    }

    public g getScale() {
        return this.f94131c;
    }

    public b getSkew() {
        return this.f94134f;
    }

    public b getSkewAngle() {
        return this.f94135g;
    }

    public b getStartOpacity() {
        return this.f94139k;
    }

    public boolean has3DRotation() {
        return (this.f94136h == null && this.f94137i == null && this.f94138j == null) ? false : true;
    }

    public boolean isAutoOrient() {
        return this.f94141m;
    }

    public void setAutoOrient(boolean z10) {
        this.f94141m = z10;
    }

    @Override // z7.c
    public t7.d toContent(a0 a0Var, r7.h hVar, a8.a aVar) {
        return null;
    }

    public n(e eVar, o oVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5) {
        this(eVar, oVar, gVar, bVar, dVar, bVar2, bVar3, bVar4, bVar5, null, null, null);
    }

    public n(e eVar, o oVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, b bVar7, b bVar8) {
        this.f94141m = false;
        this.f94129a = eVar;
        this.f94130b = oVar;
        this.f94131c = gVar;
        this.f94132d = bVar;
        this.f94133e = dVar;
        this.f94139k = bVar2;
        this.f94140l = bVar3;
        this.f94134f = bVar4;
        this.f94135g = bVar5;
        this.f94136h = bVar6;
        this.f94137i = bVar7;
        this.f94138j = bVar8;
    }
}

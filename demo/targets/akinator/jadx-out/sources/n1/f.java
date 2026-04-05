package n1;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: b, reason: collision with root package name */
    public String f75352b;

    /* renamed from: c, reason: collision with root package name */
    public j1.b0 f75353c;

    /* renamed from: d, reason: collision with root package name */
    public float f75354d;

    /* renamed from: e, reason: collision with root package name */
    public List f75355e;

    /* renamed from: f, reason: collision with root package name */
    public int f75356f;

    /* renamed from: g, reason: collision with root package name */
    public float f75357g;

    /* renamed from: h, reason: collision with root package name */
    public float f75358h;

    /* renamed from: i, reason: collision with root package name */
    public j1.b0 f75359i;

    /* renamed from: j, reason: collision with root package name */
    public int f75360j;

    /* renamed from: k, reason: collision with root package name */
    public int f75361k;

    /* renamed from: l, reason: collision with root package name */
    public float f75362l;

    /* renamed from: m, reason: collision with root package name */
    public float f75363m;

    /* renamed from: n, reason: collision with root package name */
    public float f75364n;

    /* renamed from: o, reason: collision with root package name */
    public float f75365o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f75366p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f75367q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f75368r;

    /* renamed from: s, reason: collision with root package name */
    public l1.n f75369s;

    /* renamed from: t, reason: collision with root package name */
    public final j1.l1 f75370t;

    /* renamed from: u, reason: collision with root package name */
    public final j1.l1 f75371u;

    /* renamed from: v, reason: collision with root package name */
    public final tu.o f75372v;

    /* renamed from: w, reason: collision with root package name */
    public final j f75373w;

    public f() {
        super(null);
        this.f75352b = "";
        this.f75354d = 1.0f;
        this.f75355e = w0.getEmptyPath();
        this.f75356f = w0.getDefaultFillType();
        this.f75357g = 1.0f;
        this.f75360j = w0.getDefaultStrokeLineCap();
        this.f75361k = w0.getDefaultStrokeLineJoin();
        this.f75362l = 4.0f;
        this.f75364n = 1.0f;
        this.f75366p = true;
        this.f75367q = true;
        this.f75368r = true;
        this.f75370t = j1.p.Path();
        this.f75371u = j1.p.Path();
        this.f75372v = tu.q.lazy(tu.s.f87405e, (kv.a) e.f75346e);
        this.f75373w = new j();
    }

    public final void a() {
        j1.l1 l1Var = this.f75371u;
        l1Var.reset();
        if (this.f75363m == 0.0f && this.f75364n == 1.0f) {
            j1.l1.m4840addPathUv8p0NA$default(this.f75371u, this.f75370t, 0L, 2, null);
            return;
        }
        tu.o oVar = this.f75372v;
        ((j1.p1) oVar.getValue()).setPath(this.f75370t, false);
        float length = ((j1.p1) oVar.getValue()).getLength();
        float f10 = this.f75363m;
        float f11 = this.f75365o;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f75364n + f11) % 1.0f) * length;
        if (f12 <= f13) {
            ((j1.p1) oVar.getValue()).getSegment(f12, f13, l1Var, true);
        } else {
            ((j1.p1) oVar.getValue()).getSegment(f12, length, l1Var, true);
            ((j1.p1) oVar.getValue()).getSegment(0.0f, f13, l1Var, true);
        }
    }

    @Override // n1.l
    public void draw(l1.i iVar) {
        l1.n nVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<this>");
        if (this.f75366p) {
            j jVar = this.f75373w;
            jVar.clear();
            j1.l1 l1Var = this.f75370t;
            l1Var.reset();
            jVar.addPathNodes(this.f75355e).toPath(l1Var);
            a();
        } else if (this.f75368r) {
            a();
        }
        this.f75366p = false;
        this.f75368r = false;
        j1.b0 b0Var = this.f75353c;
        if (b0Var != null) {
            l1.i.m5406drawPathGBMwjPU$default(iVar, this.f75371u, b0Var, this.f75354d, null, null, 0, 56, null);
        }
        j1.b0 b0Var2 = this.f75359i;
        if (b0Var2 != null) {
            l1.n nVar2 = this.f75369s;
            if (this.f75367q || nVar2 == null) {
                l1.n nVar3 = new l1.n(this.f75358h, this.f75362l, this.f75360j, this.f75361k, null, 16, null);
                this.f75369s = nVar3;
                this.f75367q = false;
                nVar = nVar3;
            } else {
                nVar = nVar2;
            }
            l1.i.m5406drawPathGBMwjPU$default(iVar, this.f75371u, b0Var2, this.f75357g, nVar, null, 0, 48, null);
        }
    }

    public final j1.b0 getFill() {
        return this.f75353c;
    }

    public final float getFillAlpha() {
        return this.f75354d;
    }

    public final String getName() {
        return this.f75352b;
    }

    public final List<g> getPathData() {
        return this.f75355e;
    }

    /* renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m5718getPathFillTypeRgk1Os() {
        return this.f75356f;
    }

    public final j1.b0 getStroke() {
        return this.f75359i;
    }

    public final float getStrokeAlpha() {
        return this.f75357g;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m5719getStrokeLineCapKaPHkGw() {
        return this.f75360j;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m5720getStrokeLineJoinLxFBmk8() {
        return this.f75361k;
    }

    public final float getStrokeLineMiter() {
        return this.f75362l;
    }

    public final float getStrokeLineWidth() {
        return this.f75358h;
    }

    public final float getTrimPathEnd() {
        return this.f75364n;
    }

    public final float getTrimPathOffset() {
        return this.f75365o;
    }

    public final float getTrimPathStart() {
        return this.f75363m;
    }

    public final void setFill(j1.b0 b0Var) {
        this.f75353c = b0Var;
        invalidate();
    }

    public final void setFillAlpha(float f10) {
        this.f75354d = f10;
        invalidate();
    }

    public final void setName(String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f75352b = value;
        invalidate();
    }

    public final void setPathData(List<? extends g> value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f75355e = value;
        this.f75366p = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U, reason: not valid java name */
    public final void m5721setPathFillTypeoQ8Xj4U(int i10) {
        this.f75356f = i10;
        this.f75371u.mo4808setFillTypeoQ8Xj4U(i10);
        invalidate();
    }

    public final void setStroke(j1.b0 b0Var) {
        this.f75359i = b0Var;
        invalidate();
    }

    public final void setStrokeAlpha(float f10) {
        this.f75357g = f10;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE, reason: not valid java name */
    public final void m5722setStrokeLineCapBeK7IIE(int i10) {
        this.f75360j = i10;
        this.f75367q = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ, reason: not valid java name */
    public final void m5723setStrokeLineJoinWw9F2mQ(int i10) {
        this.f75361k = i10;
        this.f75367q = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f10) {
        this.f75362l = f10;
        this.f75367q = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f10) {
        this.f75358h = f10;
        invalidate();
    }

    public final void setTrimPathEnd(float f10) {
        if (this.f75364n == f10) {
            return;
        }
        this.f75364n = f10;
        this.f75368r = true;
        invalidate();
    }

    public final void setTrimPathOffset(float f10) {
        if (this.f75365o == f10) {
            return;
        }
        this.f75365o = f10;
        this.f75368r = true;
        invalidate();
    }

    public final void setTrimPathStart(float f10) {
        if (this.f75363m == f10) {
            return;
        }
        this.f75363m = f10;
        this.f75368r = true;
        invalidate();
    }

    public String toString() {
        return this.f75370t.toString();
    }
}

package a2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p4 implements z1.t1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f3767b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3768c;

    /* renamed from: e, reason: collision with root package name */
    public Float f3769e;

    /* renamed from: f, reason: collision with root package name */
    public Float f3770f;

    /* renamed from: g, reason: collision with root package name */
    public e2.n f3771g;

    /* renamed from: h, reason: collision with root package name */
    public e2.n f3772h;

    public p4(int i10, List<p4> allScopes, Float f10, Float f11, e2.n nVar, e2.n nVar2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(allScopes, "allScopes");
        this.f3767b = i10;
        this.f3768c = allScopes;
        this.f3769e = f10;
        this.f3770f = f11;
        this.f3771g = nVar;
        this.f3772h = nVar2;
    }

    public final List<p4> getAllScopes() {
        return this.f3768c;
    }

    public final e2.n getHorizontalScrollAxisRange() {
        return this.f3771g;
    }

    public final Float getOldXValue() {
        return this.f3769e;
    }

    public final Float getOldYValue() {
        return this.f3770f;
    }

    public final int getSemanticsNodeId() {
        return this.f3767b;
    }

    public final e2.n getVerticalScrollAxisRange() {
        return this.f3772h;
    }

    @Override // z1.t1
    public boolean isValid() {
        return this.f3768c.contains(this);
    }

    public final void setHorizontalScrollAxisRange(e2.n nVar) {
        this.f3771g = nVar;
    }

    public final void setOldXValue(Float f10) {
        this.f3769e = f10;
    }

    public final void setOldYValue(Float f10) {
        this.f3770f = f10;
    }

    public final void setVerticalScrollAxisRange(e2.n nVar) {
        this.f3772h = nVar;
    }
}

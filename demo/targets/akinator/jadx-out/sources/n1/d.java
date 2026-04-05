package n1;

import java.util.ArrayList;
import java.util.List;
import n1.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f75342a = new ArrayList();

    public final void a(g gVar) {
        this.f75342a.add(gVar);
    }

    public final d arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        a(new g.a(f10, f11, f12, z10, z11, f13, f14));
        return this;
    }

    public final d arcToRelative(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        a(new g.i(f10, f11, f12, z10, z11, f13, f14));
        return this;
    }

    public final d close() {
        a(h.f75436c);
        return this;
    }

    public final d curveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        a(new g.b(f10, f11, f12, f13, f14, f15));
        return this;
    }

    public final d curveToRelative(float f10, float f11, float f12, float f13, float f14, float f15) {
        a(new g.j(f10, f11, f12, f13, f14, f15));
        return this;
    }

    public final List<g> getNodes() {
        return this.f75342a;
    }

    public final d horizontalLineTo(float f10) {
        a(new g.c(f10));
        return this;
    }

    public final d horizontalLineToRelative(float f10) {
        a(new g.k(f10));
        return this;
    }

    public final d lineTo(float f10, float f11) {
        a(new g.d(f10, f11));
        return this;
    }

    public final d lineToRelative(float f10, float f11) {
        a(new g.l(f10, f11));
        return this;
    }

    public final d moveTo(float f10, float f11) {
        a(new g.e(f10, f11));
        return this;
    }

    public final d moveToRelative(float f10, float f11) {
        a(new g.m(f10, f11));
        return this;
    }

    public final d quadTo(float f10, float f11, float f12, float f13) {
        a(new g.f(f10, f11, f12, f13));
        return this;
    }

    public final d quadToRelative(float f10, float f11, float f12, float f13) {
        a(new g.n(f10, f11, f12, f13));
        return this;
    }

    public final d reflectiveCurveTo(float f10, float f11, float f12, float f13) {
        a(new g.C0751g(f10, f11, f12, f13));
        return this;
    }

    public final d reflectiveCurveToRelative(float f10, float f11, float f12, float f13) {
        a(new g.o(f10, f11, f12, f13));
        return this;
    }

    public final d reflectiveQuadTo(float f10, float f11) {
        a(new g.h(f10, f11));
        return this;
    }

    public final d reflectiveQuadToRelative(float f10, float f11) {
        a(new g.p(f10, f11));
        return this;
    }

    public final d verticalLineTo(float f10) {
        a(new g.r(f10));
        return this;
    }

    public final d verticalLineToRelative(float f10) {
        a(new g.q(f10));
        return this;
    }
}

package m1;

import i1.h;
import i1.j;
import i1.o;
import i1.p;
import j1.i1;
import j1.k;
import j1.n0;
import kotlin.jvm.internal.e0;
import l1.i;
import s2.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: b, reason: collision with root package name */
    public i1 f73883b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f73884c;

    /* renamed from: e, reason: collision with root package name */
    public n0 f73885e;

    /* renamed from: f, reason: collision with root package name */
    public float f73886f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public x f73887g = x.f85363b;

    public e() {
        new d(this);
    }

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m5581drawx_KDEd0$default(e eVar, i iVar, long j10, float f10, n0 n0Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 4) != 0) {
            n0Var = null;
        }
        eVar.m5582drawx_KDEd0(iVar, j10, f11, n0Var);
    }

    public boolean a(float f10) {
        return false;
    }

    public boolean b(n0 n0Var) {
        return false;
    }

    public void c(x layoutDirection) {
        e0.checkNotNullParameter(layoutDirection, "layoutDirection");
    }

    public abstract void d(i iVar);

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m5582drawx_KDEd0(i draw, long j10, float f10, n0 n0Var) {
        e0.checkNotNullParameter(draw, "$this$draw");
        if (this.f73886f != f10) {
            if (!a(f10)) {
                if (f10 == 1.0f) {
                    i1 i1Var = this.f73883b;
                    if (i1Var != null) {
                        i1Var.setAlpha(f10);
                    }
                    this.f73884c = false;
                } else {
                    i1 i1VarPaint = this.f73883b;
                    if (i1VarPaint == null) {
                        i1VarPaint = k.Paint();
                        this.f73883b = i1VarPaint;
                    }
                    i1VarPaint.setAlpha(f10);
                    this.f73884c = true;
                }
            }
            this.f73886f = f10;
        }
        if (!e0.areEqual(this.f73885e, n0Var)) {
            if (!b(n0Var)) {
                if (n0Var == null) {
                    i1 i1Var2 = this.f73883b;
                    if (i1Var2 != null) {
                        i1Var2.setColorFilter(null);
                    }
                    this.f73884c = false;
                } else {
                    i1 i1VarPaint2 = this.f73883b;
                    if (i1VarPaint2 == null) {
                        i1VarPaint2 = k.Paint();
                        this.f73883b = i1VarPaint2;
                    }
                    i1VarPaint2.setColorFilter(n0Var);
                    this.f73884c = true;
                }
            }
            this.f73885e = n0Var;
        }
        x layoutDirection = draw.getLayoutDirection();
        if (this.f73887g != layoutDirection) {
            c(layoutDirection);
            this.f73887g = layoutDirection;
        }
        float fM4252getWidthimpl = o.m4252getWidthimpl(draw.mo5314getSizeNHjbRc()) - o.m4252getWidthimpl(j10);
        float fM4249getHeightimpl = o.m4249getHeightimpl(draw.mo5314getSizeNHjbRc()) - o.m4249getHeightimpl(j10);
        ((l1.c) ((l1.b) draw.getDrawContext()).getTransform()).inset(0.0f, 0.0f, fM4252getWidthimpl, fM4249getHeightimpl);
        if (f10 > 0.0f && o.m4252getWidthimpl(j10) > 0.0f && o.m4249getHeightimpl(j10) > 0.0f) {
            if (this.f73884c) {
                j jVarM4219Recttz77jQw = i1.k.m4219Recttz77jQw(h.f59344b.m4173getZeroF1C5BW0(), p.Size(o.m4252getWidthimpl(j10), o.m4249getHeightimpl(j10)));
                j1.e0 canvas = ((l1.b) draw.getDrawContext()).getCanvas();
                i1 i1VarPaint3 = this.f73883b;
                if (i1VarPaint3 == null) {
                    i1VarPaint3 = k.Paint();
                    this.f73883b = i1VarPaint3;
                }
                try {
                    canvas.saveLayer(jVarM4219Recttz77jQw, i1VarPaint3);
                    d(draw);
                } finally {
                    canvas.restore();
                }
            } else {
                d(draw);
            }
        }
        ((l1.c) ((l1.b) draw.getDrawContext()).getTransform()).inset(-0.0f, -0.0f, -fM4252getWidthimpl, -fM4249getHeightimpl);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo138getIntrinsicSizeNHjbRc();
}

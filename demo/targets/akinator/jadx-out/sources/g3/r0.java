package g3;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f57207a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57208b;

    /* renamed from: c, reason: collision with root package name */
    public final s f57209c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57210d;

    /* renamed from: f, reason: collision with root package name */
    public final u0 f57212f;

    /* renamed from: g, reason: collision with root package name */
    public final Interpolator f57213g;

    /* renamed from: i, reason: collision with root package name */
    public float f57215i;

    /* renamed from: j, reason: collision with root package name */
    public float f57216j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f57219m;

    /* renamed from: e, reason: collision with root package name */
    public final a3.i f57211e = new a3.i();

    /* renamed from: h, reason: collision with root package name */
    public boolean f57214h = false;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f57218l = new Rect();

    /* renamed from: k, reason: collision with root package name */
    public long f57217k = System.nanoTime();

    public r0(u0 u0Var, s sVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
        this.f57219m = false;
        this.f57212f = u0Var;
        this.f57209c = sVar;
        this.f57210d = i11;
        if (u0Var.f57281e == null) {
            u0Var.f57281e = new ArrayList();
        }
        u0Var.f57281e.add(this);
        this.f57213g = interpolator;
        this.f57207a = i13;
        this.f57208b = i14;
        if (i12 == 3) {
            this.f57219m = true;
        }
        this.f57216j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
        a();
    }

    public final void a() {
        boolean z10 = this.f57214h;
        Interpolator interpolator = this.f57213g;
        int i10 = this.f57207a;
        int i11 = this.f57208b;
        u0 u0Var = this.f57212f;
        s sVar = this.f57209c;
        if (z10) {
            long jNanoTime = System.nanoTime();
            long j10 = jNanoTime - this.f57217k;
            this.f57217k = jNanoTime;
            float f10 = this.f57215i - (((float) (j10 * 1.0E-6d)) * this.f57216j);
            this.f57215i = f10;
            if (f10 < 0.0f) {
                this.f57215i = 0.0f;
            }
            boolean zF = sVar.f(sVar.f57221b, interpolator == null ? this.f57215i : interpolator.getInterpolation(this.f57215i), jNanoTime, this.f57211e);
            if (this.f57215i <= 0.0f) {
                if (i10 != -1) {
                    sVar.getView().setTag(i10, Long.valueOf(System.nanoTime()));
                }
                if (i11 != -1) {
                    sVar.getView().setTag(i11, null);
                }
                u0Var.f57282f.add(this);
            }
            if (this.f57215i > 0.0f || zF) {
                u0Var.f57277a.invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j11 = jNanoTime2 - this.f57217k;
        this.f57217k = jNanoTime2;
        float f11 = (((float) (j11 * 1.0E-6d)) * this.f57216j) + this.f57215i;
        this.f57215i = f11;
        if (f11 >= 1.0f) {
            this.f57215i = 1.0f;
        }
        boolean zF2 = sVar.f(sVar.f57221b, interpolator == null ? this.f57215i : interpolator.getInterpolation(this.f57215i), jNanoTime2, this.f57211e);
        if (this.f57215i >= 1.0f) {
            if (i10 != -1) {
                sVar.getView().setTag(i10, Long.valueOf(System.nanoTime()));
            }
            if (i11 != -1) {
                sVar.getView().setTag(i11, null);
            }
            if (!this.f57219m) {
                u0Var.f57282f.add(this);
            }
        }
        if (this.f57215i < 1.0f || zF2) {
            u0Var.f57277a.invalidate();
        }
    }

    public final void b() {
        this.f57214h = true;
        int i10 = this.f57210d;
        if (i10 != -1) {
            this.f57216j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
        }
        this.f57212f.f57277a.invalidate();
        this.f57217k = System.nanoTime();
    }

    public void reactTo(int i10, float f10, float f11) {
        if (i10 == 1) {
            if (this.f57214h) {
                return;
            }
            b();
        } else {
            if (i10 != 2) {
                return;
            }
            View view = this.f57209c.getView();
            Rect rect = this.f57218l;
            view.getHitRect(rect);
            if (rect.contains((int) f10, (int) f11) || this.f57214h) {
                return;
            }
            b();
        }
    }
}

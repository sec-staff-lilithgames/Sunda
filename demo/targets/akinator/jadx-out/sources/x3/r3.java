package x3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r3 extends q3 {

    /* renamed from: s, reason: collision with root package name */
    public static final e3 f91666s = e3.toWindowInsetsCompat(WindowInsets.CONSUMED);

    public r3(e3 e3Var, WindowInsets windowInsets) {
        super(e3Var, windowInsets);
    }

    @Override // x3.p3, x3.l3, x3.s3
    public o3.c getInsets(int i10) {
        return o3.c.toCompatInsets(this.f91632c.getInsets(v3.a(i10)));
    }

    @Override // x3.p3, x3.l3, x3.s3
    public o3.c getInsetsIgnoringVisibility(int i10) {
        return o3.c.toCompatInsets(this.f91632c.getInsetsIgnoringVisibility(v3.a(i10)));
    }

    @Override // x3.p3, x3.l3, x3.s3
    public boolean isVisible(int i10) {
        return this.f91632c.isVisible(v3.a(i10));
    }

    public r3(e3 e3Var, r3 r3Var) {
        super(e3Var, r3Var);
    }
}

package x3;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p3 extends o3 {

    /* renamed from: r, reason: collision with root package name */
    public static final e3 f91654r = e3.toWindowInsetsCompat(WindowInsets.CONSUMED);

    public p3(e3 e3Var, WindowInsets windowInsets) {
        super(e3Var, windowInsets);
    }

    @Override // x3.l3, x3.s3
    public o3.c getInsets(int i10) {
        return o3.c.toCompatInsets(this.f91632c.getInsets(u3.a(i10)));
    }

    @Override // x3.l3, x3.s3
    public o3.c getInsetsIgnoringVisibility(int i10) {
        return o3.c.toCompatInsets(this.f91632c.getInsetsIgnoringVisibility(u3.a(i10)));
    }

    @Override // x3.l3, x3.s3
    public boolean isVisible(int i10) {
        return this.f91632c.isVisible(u3.a(i10));
    }

    public p3(e3 e3Var, p3 p3Var) {
        super(e3Var, p3Var);
    }

    @Override // x3.l3, x3.s3
    public final void d(View view) {
    }
}

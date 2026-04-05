package dh;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class h extends yg.j {
    public static final /* synthetic */ int K = 0;
    public f J;

    @Override // yg.j, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.J = new f(this.J);
        return this;
    }

    public final void o(float f10, float f11, float f12, float f13) {
        RectF rectF = this.J.f52229w;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}

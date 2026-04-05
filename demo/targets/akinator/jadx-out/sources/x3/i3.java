package x3;

import android.graphics.Rect;
import android.view.RoundedCorner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i3 extends h3 {
    public i3() {
    }

    @Override // x3.k3
    public void g(Rect rect) {
        this.f91585c.setPrivacyIndicatorBounds(rect != null ? new Rect(rect) : null);
    }

    @Override // x3.k3
    public void h(int i10, v0 v0Var) {
        this.f91585c.setRoundedCorner(v0.a(i10), v0Var != null ? new RoundedCorner(v0.a(v0Var.getPosition()), v0Var.getRadius(), v0Var.getCenterX(), v0Var.getCenterY()) : null);
    }

    public i3(e3 e3Var) {
        super(e3Var);
    }
}

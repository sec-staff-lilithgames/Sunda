package x3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n3 extends m3 {
    public n3(e3 e3Var, WindowInsets windowInsets) {
        super(e3Var, windowInsets);
    }

    @Override // x3.s3
    public e3 a() {
        return e3.toWindowInsetsCompat(this.f91632c.consumeDisplayCutout());
    }

    @Override // x3.l3, x3.s3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return Objects.equals(this.f91632c, n3Var.f91632c) && Objects.equals(this.f91636g, n3Var.f91636g) && l3.z(this.f91637h, n3Var.f91637h);
    }

    @Override // x3.s3
    public s f() {
        DisplayCutout displayCutout = this.f91632c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new s(displayCutout);
    }

    @Override // x3.s3
    public int hashCode() {
        return this.f91632c.hashCode();
    }

    public n3(e3 e3Var, n3 n3Var) {
        super(e3Var, n3Var);
    }
}

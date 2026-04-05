package x3;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.RoundedCorner;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q3 extends p3 {
    public q3(e3 e3Var, WindowInsets windowInsets) {
        super(e3Var, windowInsets);
    }

    @Override // x3.s3
    public Rect h() {
        Rect privacyIndicatorBounds = this.f91632c.getPrivacyIndicatorBounds();
        if (privacyIndicatorBounds != null) {
            return new Rect(privacyIndicatorBounds);
        }
        return null;
    }

    @Override // x3.s3
    public v0 i(int i10) {
        int i11;
        RoundedCorner roundedCorner = this.f91632c.getRoundedCorner(i10);
        if (roundedCorner == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i11 = 1;
            if (position != 1) {
                i11 = 2;
                if (position != 2) {
                    i11 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(a.b.e(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i11 = 0;
        }
        int radius = roundedCorner.getRadius();
        Point center = roundedCorner.getCenter();
        return new v0(i11, radius, center.x, center.y);
    }

    public q3(e3 e3Var, q3 q3Var) {
        super(e3Var, q3Var);
    }
}

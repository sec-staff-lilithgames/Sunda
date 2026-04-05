package e6;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends Property {
    @Override // android.util.Property
    public PointF get(View view) {
        return null;
    }

    @Override // android.util.Property
    public void set(View view, PointF pointF) {
        int iRound = Math.round(pointF.x);
        int iRound2 = Math.round(pointF.y);
        b1.a(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
    }
}

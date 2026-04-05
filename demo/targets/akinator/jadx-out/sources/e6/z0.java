package e6;

import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 extends Property {
    @Override // android.util.Property
    public Float get(View view) {
        return Float.valueOf(b1.f53758a.getTransitionAlpha(view));
    }

    @Override // android.util.Property
    public void set(View view, Float f10) {
        b1.f53758a.setTransitionAlpha(view, f10.floatValue());
    }
}

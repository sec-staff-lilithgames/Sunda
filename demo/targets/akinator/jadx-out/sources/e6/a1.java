package e6;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 extends Property {
    @Override // android.util.Property
    public Rect get(View view) {
        return view.getClipBounds();
    }

    @Override // android.util.Property
    public void set(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}

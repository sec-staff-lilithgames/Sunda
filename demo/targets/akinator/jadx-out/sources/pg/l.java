package pg;

import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class l extends Property {
    @Override // android.util.Property
    public Float get(View view) {
        return Float.valueOf(view.getPaddingStart());
    }

    @Override // android.util.Property
    public void set(View view, Float f10) {
        view.setPaddingRelative(f10.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }
}

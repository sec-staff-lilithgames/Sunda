package q;

import android.util.Property;
import androidx.appcompat.widget.SwitchCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g3 extends Property {
    @Override // android.util.Property
    public Float get(SwitchCompat switchCompat) {
        return Float.valueOf(switchCompat.B);
    }

    @Override // android.util.Property
    public void set(SwitchCompat switchCompat, Float f10) {
        switchCompat.setThumbPosition(f10.floatValue());
    }
}

package pg;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f81200a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.f81200a = cVar;
    }

    @Override // android.util.Property
    public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return Float.valueOf(vf.a.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f29247a0.getColorForState(extendedFloatingActionButton.getDrawableState(), this.f81200a.f81202b.f29247a0.getDefaultColor()))));
    }

    @Override // android.util.Property
    public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f10) {
        int colorForState = extendedFloatingActionButton.f29247a0.getColorForState(extendedFloatingActionButton.getDrawableState(), this.f81200a.f81202b.f29247a0.getDefaultColor());
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (vf.a.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f10.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
        if (f10.floatValue() == 1.0f) {
            extendedFloatingActionButton.k(extendedFloatingActionButton.f29247a0);
        } else {
            extendedFloatingActionButton.k(colorStateListValueOf);
        }
    }
}

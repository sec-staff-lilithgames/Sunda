package r4;

import android.util.FloatProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a0 {
    public a0(String str) {
    }

    public static <T> a0 createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new z(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f10);
}

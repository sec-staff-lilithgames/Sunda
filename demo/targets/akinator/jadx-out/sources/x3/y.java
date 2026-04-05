package x3;

import android.view.LayoutInflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y {
    @Deprecated
    public static z getFactory(LayoutInflater layoutInflater) {
        layoutInflater.getFactory();
        return null;
    }

    @Deprecated
    public static void setFactory(LayoutInflater layoutInflater, z zVar) {
        layoutInflater.setFactory2(new x());
    }

    public static void setFactory2(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}

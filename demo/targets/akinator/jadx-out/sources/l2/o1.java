package l2;

import android.os.Build;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o1 {
    public static final l1 PlatformTypefaces() {
        return Build.VERSION.SDK_INT >= 28 ? new m1() : new n1();
    }

    public static final String getWeightSuffixForFallbackFamilyName(String name, c1 fontWeight) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        int weight = fontWeight.getWeight() / 100;
        return (weight < 0 || weight >= 2) ? (2 > weight || weight >= 4) ? weight == 4 ? name : weight == 5 ? o2.l(name, "-medium") : ((6 > weight || weight >= 8) && 8 <= weight && weight < 11) ? o2.l(name, "-black") : name : o2.l(name, "-light") : o2.l(name, "-thin");
    }
}

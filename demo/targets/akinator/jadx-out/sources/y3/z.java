package y3;

import android.os.LocaleList;
import android.view.accessibility.AccessibilityWindowInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z {
    public static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getLocales();
    }

    public static long getTransitionTimeMillis(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getTransitionTimeMillis();
    }
}

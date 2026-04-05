package y3;

import android.graphics.Region;
import android.view.accessibility.AccessibilityWindowInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y {
    public static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getDisplayId();
    }

    public static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
        accessibilityWindowInfo.getRegionInScreen(region);
    }

    public static c getRoot(Object obj, int i10) {
        return c.e(((AccessibilityWindowInfo) obj).getRoot(i10));
    }
}

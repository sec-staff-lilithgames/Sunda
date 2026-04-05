package y3;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static Object createRangeInfo(int i10, float f10, float f11, float f12) {
        return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
    }

    public static CharSequence getStateDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void setStateDescription(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}

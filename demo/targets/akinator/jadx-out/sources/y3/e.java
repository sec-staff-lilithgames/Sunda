package y3;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {
    public static k buildCollectionItemInfoCompat(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
        return new k(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static c getChild(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
        return c.e(accessibilityNodeInfo.getChild(i10, i11));
    }

    public static String getCollectionItemColumnTitle(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String getCollectionItemRowTitle(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static c getParent(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
        return c.e(accessibilityNodeInfo.getParent(i10));
    }

    public static String getUniqueId(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean isTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void setTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setTextSelectable(z10);
    }

    public static void setUniqueId(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}

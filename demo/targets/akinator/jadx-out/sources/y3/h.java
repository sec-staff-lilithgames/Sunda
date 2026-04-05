package y3;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    public static j buildCollectionInfoCompat(int i10, int i11, boolean z10, int i12, int i13, int i14) {
        return new j(new AccessibilityNodeInfo.CollectionInfo.Builder().setRowCount(i10).setColumnCount(i11).setHierarchical(z10).setSelectionMode(i12).setItemCount(i13).setImportantForAccessibilityItemCount(i14).build());
    }

    public static int getImportantForAccessibilityItemCount(Object obj) {
        return ((AccessibilityNodeInfo.CollectionInfo) obj).getImportantForAccessibilityItemCount();
    }

    public static int getItemCount(Object obj) {
        return ((AccessibilityNodeInfo.CollectionInfo) obj).getItemCount();
    }
}

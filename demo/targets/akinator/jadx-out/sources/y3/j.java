package y3;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f94060a;

    public j(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.f94060a = collectionInfo;
    }

    public static j obtain(int i10, int i11, boolean z10, int i12) {
        return new j(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
    }

    public int getColumnCount() {
        return ((AccessibilityNodeInfo.CollectionInfo) this.f94060a).getColumnCount();
    }

    public int getImportantForAccessibilityItemCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            return h.getImportantForAccessibilityItemCount(this.f94060a);
        }
        return -1;
    }

    public int getItemCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            return h.getItemCount(this.f94060a);
        }
        return -1;
    }

    public int getRowCount() {
        return ((AccessibilityNodeInfo.CollectionInfo) this.f94060a).getRowCount();
    }

    public int getSelectionMode() {
        return ((AccessibilityNodeInfo.CollectionInfo) this.f94060a).getSelectionMode();
    }

    public boolean isHierarchical() {
        return ((AccessibilityNodeInfo.CollectionInfo) this.f94060a).isHierarchical();
    }

    public static j obtain(int i10, int i11, boolean z10) {
        return new j(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
    }
}

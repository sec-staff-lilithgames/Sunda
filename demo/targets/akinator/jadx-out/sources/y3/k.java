package y3;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f94061a;

    public k(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f94061a = collectionItemInfo;
    }

    public static k obtain(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        return new k(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
    }

    public int getColumnIndex() {
        return ((AccessibilityNodeInfo.CollectionItemInfo) this.f94061a).getColumnIndex();
    }

    public int getColumnSpan() {
        return ((AccessibilityNodeInfo.CollectionItemInfo) this.f94061a).getColumnSpan();
    }

    public String getColumnTitle() {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.getCollectionItemColumnTitle(this.f94061a);
        }
        return null;
    }

    public int getRowIndex() {
        return ((AccessibilityNodeInfo.CollectionItemInfo) this.f94061a).getRowIndex();
    }

    public int getRowSpan() {
        return ((AccessibilityNodeInfo.CollectionItemInfo) this.f94061a).getRowSpan();
    }

    public String getRowTitle() {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.getCollectionItemRowTitle(this.f94061a);
        }
        return null;
    }

    @Deprecated
    public boolean isHeading() {
        return ((AccessibilityNodeInfo.CollectionItemInfo) this.f94061a).isHeading();
    }

    public boolean isSelected() {
        return ((AccessibilityNodeInfo.CollectionItemInfo) this.f94061a).isSelected();
    }

    public static k obtain(int i10, int i11, int i12, int i13, boolean z10) {
        return new k(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
    }
}

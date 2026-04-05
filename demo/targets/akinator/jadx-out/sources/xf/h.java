package xf;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.ParcelableSparseArray;
import j1.o2;
import qg.l0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class h {
    public static void a(ActionMenuItemView actionMenuItemView, a aVar) {
        if (Build.VERSION.SDK_INT < 29 || !z1.hasAccessibilityDelegate(actionMenuItemView)) {
            z1.setAccessibilityDelegate(actionMenuItemView, new f(actionMenuItemView, aVar));
        } else {
            z1.setAccessibilityDelegate(actionMenuItemView, new e(actionMenuItemView.getAccessibilityDelegate(), actionMenuItemView, aVar));
        }
    }

    public static void attachBadgeDrawable(a aVar, View view) {
        attachBadgeDrawable(aVar, view, (FrameLayout) null);
    }

    public static SparseArray<a> createBadgeDrawablesFromSavedStates(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<a> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i10 = 0; i10 < parcelableSparseArray.size(); i10++) {
            int iKeyAt = parcelableSparseArray.keyAt(i10);
            BadgeState$State badgeState$State = (BadgeState$State) parcelableSparseArray.valueAt(i10);
            sparseArray.put(iKeyAt, badgeState$State != null ? new a(context, 0, badgeState$State) : null);
        }
        return sparseArray;
    }

    public static ParcelableSparseArray createParcelableBadgeStates(SparseArray<a> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            a aVarValueAt = sparseArray.valueAt(i10);
            parcelableSparseArray.put(iKeyAt, aVarValueAt != null ? aVarValueAt.f91947g.f91956a : null);
        }
        return parcelableSparseArray;
    }

    public static void detachBadgeDrawable(a aVar, View view) {
        if (aVar == null) {
            return;
        }
        if (aVar.getCustomBadgeParent() != null) {
            aVar.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void setBadgeDrawableBounds(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.updateBadgeCoordinates(view, frameLayout);
    }

    public static void updateBadgeBounds(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }

    public static void attachBadgeDrawable(a aVar, View view, FrameLayout frameLayout) {
        setBadgeDrawableBounds(aVar, view, frameLayout);
        if (aVar.getCustomBadgeParent() != null) {
            aVar.getCustomBadgeParent().setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
    }

    public static void detachBadgeDrawable(a aVar, Toolbar toolbar, int i10) {
        if (aVar == null) {
            return;
        }
        c cVar = aVar.f91947g;
        ActionMenuItemView actionMenuItemView = l0.getActionMenuItemView(toolbar, i10);
        if (actionMenuItemView != null) {
            cVar.f91956a.C = 0;
            cVar.f91957b.C = 0;
            aVar.k();
            cVar.f91956a.D = 0;
            cVar.f91957b.D = 0;
            aVar.k();
            detachBadgeDrawable(aVar, actionMenuItemView);
            if (Build.VERSION.SDK_INT >= 29 && z1.hasAccessibilityDelegate(actionMenuItemView)) {
                z1.setAccessibilityDelegate(actionMenuItemView, new g(actionMenuItemView.getAccessibilityDelegate(), actionMenuItemView));
                return;
            } else {
                z1.setAccessibilityDelegate(actionMenuItemView, null);
                return;
            }
        }
        o2.u(i10, "Trying to remove badge from a null menuItemView: ", "BadgeUtils");
    }

    public static void attachBadgeDrawable(a aVar, Toolbar toolbar, int i10) {
        attachBadgeDrawable(aVar, toolbar, i10, null);
    }

    public static void attachBadgeDrawable(a aVar, Toolbar toolbar, int i10, FrameLayout frameLayout) {
        toolbar.post(new d(aVar, toolbar, i10, frameLayout));
    }
}

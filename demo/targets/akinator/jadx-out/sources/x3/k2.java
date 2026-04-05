package x3;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static int[] f91617a;

    @Deprecated
    public static void notifySubtreeAccessibilityStateChanged(ViewParent viewParent, View view, View view2, int i10) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
    }

    public static boolean onNestedFling(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        try {
            return viewParent.onNestedFling(view, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public static boolean onNestedPreFling(ViewParent viewParent, View view, float f10, float f11) {
        try {
            return viewParent.onNestedPreFling(view, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(viewParent, view, i10, i11, iArr, 0);
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (viewParent instanceof n0) {
            ((n0) viewParent).onNestedScroll(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof m0) {
            ((m0) viewParent).onNestedScroll(view, i10, i11, i12, i13, i14);
            return;
        }
        if (i14 == 0) {
            try {
                viewParent.onNestedScroll(view, i10, i11, i12, i13);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e10);
            }
        }
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i10) {
        onNestedScrollAccepted(viewParent, view, view2, i10, 0);
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i10) {
        return onStartNestedScroll(viewParent, view, view2, i10, 0);
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view) {
        onStopNestedScroll(viewParent, view, 0);
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof m0) {
            ((m0) viewParent).onNestedPreScroll(view, i10, i11, iArr, i12);
            return;
        }
        if (i12 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i10, i11, iArr);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e10);
            }
        }
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof m0) {
            ((m0) viewParent).onNestedScrollAccepted(view, view2, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e10);
            }
        }
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof m0) {
            return ((m0) viewParent).onStartNestedScroll(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e10);
            return false;
        }
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof m0) {
            ((m0) viewParent).onStopNestedScroll(view, i10);
            return;
        }
        if (i10 == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e10);
            }
        }
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
        int[] iArr = f91617a;
        if (iArr == null) {
            f91617a = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        onNestedScroll(viewParent, view, i10, i11, i12, i13, 0, f91617a);
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = f91617a;
        if (iArr == null) {
            f91617a = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        onNestedScroll(viewParent, view, i10, i11, i12, i13, i14, f91617a);
    }
}

package x3;

import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f91620a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f91621b;

    /* renamed from: c, reason: collision with root package name */
    public final View f91622c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91623d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f91624e;

    public l0(View view) {
        this.f91622c = view;
    }

    public final boolean a(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentB;
        int i15;
        int i16;
        int[] iArr3;
        if (isNestedScrollingEnabled() && (viewParentB = b(i14)) != null) {
            if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                View view = this.f91622c;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f91624e == null) {
                        this.f91624e = new int[2];
                    }
                    int[] iArr4 = this.f91624e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                k2.onNestedScroll(viewParentB, this.f91622c, i10, i11, i12, i13, i14, iArr3);
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent b(int i10) {
        if (i10 == 0) {
            return this.f91620a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f91621b;
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        ViewParent viewParentB;
        if (!isNestedScrollingEnabled() || (viewParentB = b(0)) == null) {
            return false;
        }
        return k2.onNestedFling(viewParentB, this.f91622c, f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        ViewParent viewParentB;
        if (!isNestedScrollingEnabled() || (viewParentB = b(0)) == null) {
            return false;
        }
        return k2.onNestedPreFling(viewParentB, this.f91622c, f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return a(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f91623d;
    }

    public void onDetachedFromWindow() {
        z1.stopNestedScroll(this.f91622c);
    }

    public void onStopNestedScroll(View view) {
        z1.stopNestedScroll(this.f91622c);
    }

    public void setNestedScrollingEnabled(boolean z10) {
        if (this.f91623d) {
            z1.stopNestedScroll(this.f91622c);
        }
        this.f91623d = z10;
    }

    public boolean startNestedScroll(int i10) {
        return startNestedScroll(i10, 0);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentB;
        int i13;
        int i14;
        if (isNestedScrollingEnabled() && (viewParentB = b(i12)) != null) {
            if (i10 != 0 || i11 != 0) {
                View view = this.f91622c;
                if (iArr2 != null) {
                    view.getLocationInWindow(iArr2);
                    i13 = iArr2[0];
                    i14 = iArr2[1];
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                if (iArr == null) {
                    if (this.f91624e == null) {
                        this.f91624e = new int[2];
                    }
                    iArr = this.f91624e;
                }
                int[] iArr3 = iArr;
                iArr3[0] = 0;
                iArr3[1] = 0;
                k2.onNestedPreScroll(viewParentB, this.f91622c, i10, i11, iArr3, i12);
                if (iArr2 != null) {
                    view.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i13;
                    iArr2[1] = iArr2[1] - i14;
                }
                if (iArr3[0] != 0 || iArr3[1] != 0) {
                    return true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
        }
        return false;
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return a(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean hasNestedScrollingParent(int i10) {
        return b(i10) != null;
    }

    public boolean startNestedScroll(int i10, int i11) {
        if (hasNestedScrollingParent(i11)) {
            return true;
        }
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        View view = this.f91622c;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (k2.onStartNestedScroll(parent, view2, view, i10, i11)) {
                if (i11 == 0) {
                    this.f91620a = parent;
                } else if (i11 == 1) {
                    this.f91621b = parent;
                }
                k2.onNestedScrollAccepted(parent, view2, view, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view2 = parent;
            }
        }
        return false;
    }

    public void stopNestedScroll(int i10) {
        ViewParent viewParentB = b(i10);
        if (viewParentB != null) {
            k2.onStopNestedScroll(viewParentB, this.f91622c, i10);
            if (i10 == 0) {
                this.f91620a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f91621b = null;
            }
        }
    }

    public void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        a(i10, i11, i12, i13, iArr, i14, iArr2);
    }
}

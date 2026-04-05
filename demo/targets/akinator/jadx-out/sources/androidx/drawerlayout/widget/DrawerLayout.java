package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.customview.view.AbsSavedState;
import i4.i;
import i4.m;
import java.util.ArrayList;
import q4.d;
import q4.e;
import x3.e3;
import x3.u;
import x3.z1;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements i {
    public static final int[] M = {R.attr.colorPrimaryDark};
    public static final int[] N = {R.attr.layout_gravity};
    public static final boolean O;
    public static final boolean P;
    public static final boolean Q;
    public CharSequence A;
    public CharSequence B;
    public Object C;
    public boolean D;
    public Drawable E;
    public Drawable F;
    public Drawable G;
    public Drawable H;
    public final ArrayList I;
    public Rect J;
    public Matrix K;
    public final q4.a L;

    /* renamed from: b, reason: collision with root package name */
    public final d f6161b;

    /* renamed from: c, reason: collision with root package name */
    public float f6162c;

    /* renamed from: e, reason: collision with root package name */
    public final int f6163e;

    /* renamed from: f, reason: collision with root package name */
    public int f6164f;

    /* renamed from: g, reason: collision with root package name */
    public float f6165g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f6166h;

    /* renamed from: i, reason: collision with root package name */
    public final m f6167i;

    /* renamed from: j, reason: collision with root package name */
    public final m f6168j;

    /* renamed from: k, reason: collision with root package name */
    public final b f6169k;

    /* renamed from: l, reason: collision with root package name */
    public final b f6170l;

    /* renamed from: m, reason: collision with root package name */
    public int f6171m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6172n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6173o;

    /* renamed from: p, reason: collision with root package name */
    public int f6174p;

    /* renamed from: q, reason: collision with root package name */
    public int f6175q;

    /* renamed from: r, reason: collision with root package name */
    public int f6176r;

    /* renamed from: s, reason: collision with root package name */
    public int f6177s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6178t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f6179u;

    /* renamed from: v, reason: collision with root package name */
    public float f6180v;

    /* renamed from: w, reason: collision with root package name */
    public float f6181w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f6182x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f6183y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f6184z;

    static {
        int i10 = Build.VERSION.SDK_INT;
        O = true;
        P = true;
        Q = i10 >= 29;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public static String f(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean g(View view) {
        return (z1.getImportantForAccessibility(view) == 4 || z1.getImportantForAccessibility(view) == 2) ? false : true;
    }

    public static boolean h(View view) {
        return ((a) view.getLayoutParams()).f6190a == 0;
    }

    public static boolean i(View view) {
        int absoluteGravity = u.getAbsoluteGravity(((a) view.getLayoutParams()).f6190a, z1.getLayoutDirection(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(int i10, View view) {
        return (e(view) & i10) == i10;
    }

    public void addDrawerListener(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f6179u == null) {
            this.f6179u = new ArrayList();
        }
        this.f6179u.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            arrayList2 = this.I;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (!i(childAt)) {
                arrayList2.add(childAt);
            } else if (isDrawerOpen(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
            i12++;
        }
        if (!z10) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) arrayList2.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i10, layoutParams);
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i11);
            if ((((a) childAt.getLayoutParams()).f6193d & 1) == 1) {
                break;
            } else {
                i11++;
            }
        }
        if (childAt != null || i(view)) {
            z1.setImportantForAccessibility(view, 4);
        } else {
            z1.setImportantForAccessibility(view, 1);
        }
        if (O) {
            return;
        }
        z1.setAccessibilityDelegate(view, this.f6161b);
    }

    public final void b(boolean z10) {
        int childCount = getChildCount();
        boolean zSmoothSlideViewTo = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            if (i(childAt) && (!z10 || aVar.f6192c)) {
                zSmoothSlideViewTo |= a(3, childAt) ? this.f6167i.smoothSlideViewTo(childAt, -childAt.getWidth(), childAt.getTop()) : this.f6168j.smoothSlideViewTo(childAt, getWidth(), childAt.getTop());
                aVar.f6192c = false;
            }
        }
        this.f6169k.removeCallbacks();
        this.f6170l.removeCallbacks();
        if (zSmoothSlideViewTo) {
            invalidate();
        }
    }

    public final View c(int i10) {
        int absoluteGravity = u.getAbsoluteGravity(i10, z1.getLayoutDirection(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((e(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof a) && super.checkLayoutParams(layoutParams);
    }

    @Override // i4.i
    public void close() {
        closeDrawer(8388611);
    }

    public void closeDrawer(View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        b(false);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((a) getChildAt(i10).getLayoutParams()).f6191b);
        }
        this.f6165g = fMax;
        boolean zContinueSettling = this.f6167i.continueSettling(true);
        boolean zContinueSettling2 = this.f6168j.continueSettling(true);
        if (zContinueSettling || zContinueSettling2) {
            z1.postInvalidateOnAnimation(this);
        }
    }

    public final View d() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (i(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f6165g <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.J == null) {
                this.J = new Rect();
            }
            childAt.getHitRect(this.J);
            if (this.J.contains((int) x10, (int) y10) && !h(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.K == null) {
                            this.K = new Matrix();
                        }
                        matrix.invert(this.K);
                        motionEventObtain.transform(this.K);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Drawable background;
        int height = getHeight();
        boolean zH = h(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zH) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && i(childAt) && childAt.getHeight() >= height) {
                    if (a(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f6165g;
        if (f10 > 0.0f && zH) {
            int i13 = this.f6164f;
            Paint paint = this.f6166h;
            paint.setColor((i13 & 16777215) | (((int) ((((-16777216) & i13) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), paint);
            return zDrawChild;
        }
        if (this.f6183y != null && a(3, view)) {
            int intrinsicWidth = this.f6183y.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f6167i.getEdgeSize(), 1.0f));
            this.f6183y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f6183y.setAlpha((int) (fMax * 255.0f));
            this.f6183y.draw(canvas);
            return zDrawChild;
        }
        if (this.f6184z != null && a(5, view)) {
            int intrinsicWidth2 = this.f6184z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f6168j.getEdgeSize(), 1.0f));
            this.f6184z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f6184z.setAlpha((int) (fMax2 * 255.0f));
            this.f6184z.draw(canvas);
        }
        return zDrawChild;
    }

    public final int e(View view) {
        return u.getAbsoluteGravity(((a) view.getLayoutParams()).f6190a, z1.getLayoutDirection(this));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public float getDrawerElevation() {
        if (P) {
            return this.f6162c;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i10) {
        int layoutDirection = z1.getLayoutDirection(this);
        if (i10 == 3) {
            int i11 = this.f6174p;
            if (i11 != 3) {
                return i11;
            }
            int i12 = layoutDirection == 0 ? this.f6176r : this.f6177s;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f6175q;
            if (i13 != 3) {
                return i13;
            }
            int i14 = layoutDirection == 0 ? this.f6177s : this.f6176r;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f6176r;
            if (i15 != 3) {
                return i15;
            }
            int i16 = layoutDirection == 0 ? this.f6174p : this.f6175q;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f6177s;
        if (i17 != 3) {
            return i17;
        }
        int i18 = layoutDirection == 0 ? this.f6175q : this.f6174p;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public CharSequence getDrawerTitle(int i10) {
        int absoluteGravity = u.getAbsoluteGravity(i10, z1.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            return this.A;
        }
        if (absoluteGravity == 5) {
            return this.B;
        }
        return null;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f6182x;
    }

    public boolean isDrawerOpen(View view) {
        if (i(view)) {
            return (((a) view.getLayoutParams()).f6193d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerVisible(View view) {
        if (i(view)) {
            return ((a) view.getLayoutParams()).f6191b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // i4.i
    public boolean isOpen() {
        return isDrawerOpen(8388611);
    }

    public final void j(View view, float f10) {
        float f11 = ((a) view.getLayoutParams()).f6191b;
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (f11 * width));
        if (!a(3, view)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        l(view, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r3 = this;
            boolean r0 = androidx.drawerlayout.widget.DrawerLayout.P
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = x3.z1.getLayoutDirection(r3)
            if (r0 != 0) goto L1b
            android.graphics.drawable.Drawable r1 = r3.E
            if (r1 == 0) goto L2b
            boolean r2 = p3.a.isAutoMirrored(r1)
            if (r2 == 0) goto L18
            p3.a.setLayoutDirection(r1, r0)
        L18:
            android.graphics.drawable.Drawable r0 = r3.E
            goto L2d
        L1b:
            android.graphics.drawable.Drawable r1 = r3.F
            if (r1 == 0) goto L2b
            boolean r2 = p3.a.isAutoMirrored(r1)
            if (r2 == 0) goto L28
            p3.a.setLayoutDirection(r1, r0)
        L28:
            android.graphics.drawable.Drawable r0 = r3.F
            goto L2d
        L2b:
            android.graphics.drawable.Drawable r0 = r3.G
        L2d:
            r3.f6183y = r0
            int r0 = x3.z1.getLayoutDirection(r3)
            if (r0 != 0) goto L45
            android.graphics.drawable.Drawable r1 = r3.F
            if (r1 == 0) goto L55
            boolean r2 = p3.a.isAutoMirrored(r1)
            if (r2 == 0) goto L42
            p3.a.setLayoutDirection(r1, r0)
        L42:
            android.graphics.drawable.Drawable r0 = r3.F
            goto L57
        L45:
            android.graphics.drawable.Drawable r1 = r3.E
            if (r1 == 0) goto L55
            boolean r2 = p3.a.isAutoMirrored(r1)
            if (r2 == 0) goto L52
            p3.a.setLayoutDirection(r1, r0)
        L52:
            android.graphics.drawable.Drawable r0 = r3.E
            goto L57
        L55:
            android.graphics.drawable.Drawable r0 = r3.H
        L57:
            r3.f6184z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.k():void");
    }

    public final void l(View view, float f10) {
        int size;
        a aVar = (a) view.getLayoutParams();
        if (f10 == aVar.f6191b) {
            return;
        }
        aVar.f6191b = f10;
        if (this.f6179u == null || r2.size() - 1 < 0) {
            return;
        }
        this.f6179u.get(size).getClass();
        throw new ClassCastException();
    }

    public final void m(View view) {
        c.a aVar = c.a.f94046n;
        z1.removeAccessibilityAction(view, aVar.getId());
        if (!isDrawerOpen(view) || getDrawerLockMode(view) == 2) {
            return;
        }
        z1.replaceAccessibilityAction(view, aVar, null, this.L);
    }

    public final void n(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || i(childAt)) && !(z10 && childAt == view)) {
                z1.setImportantForAccessibility(childAt, 4);
            } else {
                z1.setImportantForAccessibility(childAt, 1);
            }
        }
    }

    public final void o(int i10, View view) {
        int i11;
        int size;
        int size2;
        View rootView;
        int size3;
        int viewDragState = this.f6167i.getViewDragState();
        int viewDragState2 = this.f6168j.getViewDragState();
        if (viewDragState == 1 || viewDragState2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (viewDragState != 2 && viewDragState2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((a) view.getLayoutParams()).f6191b;
            if (f10 == 0.0f) {
                a aVar = (a) view.getLayoutParams();
                if ((aVar.f6193d & 1) == 1) {
                    aVar.f6193d = 0;
                    ArrayList arrayList = this.f6179u;
                    if (arrayList != null && (size3 = arrayList.size() - 1) >= 0) {
                        this.f6179u.get(size3).getClass();
                        throw new ClassCastException();
                    }
                    n(view, false);
                    m(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                a aVar2 = (a) view.getLayoutParams();
                if ((aVar2.f6193d & 1) == 0) {
                    aVar2.f6193d = 1;
                    ArrayList arrayList2 = this.f6179u;
                    if (arrayList2 != null && (size2 = arrayList2.size() - 1) >= 0) {
                        this.f6179u.get(size2).getClass();
                        throw new ClassCastException();
                    }
                    n(view, true);
                    m(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i11 != this.f6171m) {
            this.f6171m = i11;
            ArrayList arrayList3 = this.f6179u;
            if (arrayList3 == null || (size = arrayList3.size() - 1) < 0) {
                return;
            }
            this.f6179u.get(size).getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6173o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6173o = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.D || this.f6182x == null) {
            return;
        }
        Object obj = this.C;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f6182x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f6182x.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            i4.m r1 = r7.f6167i
            boolean r2 = r1.shouldInterceptTouchEvent(r8)
            i4.m r3 = r7.f6168j
            boolean r3 = r3.shouldInterceptTouchEvent(r8)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L36
            if (r0 == r3) goto L2f
            r8 = 2
            r5 = 3
            if (r0 == r8) goto L1e
            if (r0 == r5) goto L2f
            goto L34
        L1e:
            boolean r8 = r1.checkTouchSlop(r5)
            if (r8 == 0) goto L34
            androidx.drawerlayout.widget.b r8 = r7.f6169k
            r8.removeCallbacks()
            androidx.drawerlayout.widget.b r8 = r7.f6170l
            r8.removeCallbacks()
            goto L34
        L2f:
            r7.b(r3)
            r7.f6178t = r4
        L34:
            r8 = r4
            goto L5c
        L36:
            float r0 = r8.getX()
            float r8 = r8.getY()
            r7.f6180v = r0
            r7.f6181w = r8
            float r5 = r7.f6165g
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L59
            int r0 = (int) r0
            int r8 = (int) r8
            android.view.View r8 = r1.findTopChildUnder(r0, r8)
            if (r8 == 0) goto L59
            boolean r8 = h(r8)
            if (r8 == 0) goto L59
            r8 = r3
            goto L5a
        L59:
            r8 = r4
        L5a:
            r7.f6178t = r4
        L5c:
            if (r2 != 0) goto L7f
            if (r8 != 0) goto L7f
            int r8 = r7.getChildCount()
            r0 = r4
        L65:
            if (r0 >= r8) goto L79
            android.view.View r1 = r7.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$a r1 = (androidx.drawerlayout.widget.DrawerLayout.a) r1
            boolean r1 = r1.f6192c
            if (r1 == 0) goto L76
            goto L7f
        L76:
            int r0 = r0 + 1
            goto L65
        L79:
            boolean r8 = r7.f6178t
            if (r8 == 0) goto L7e
            goto L7f
        L7e:
            return r4
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || d() == null) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewD = d();
        if (viewD != null && getDrawerLockMode(viewD) == 0) {
            closeDrawers();
        }
        return viewD != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.f6172n = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (h(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) aVar).topMargin, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (aVar.f6191b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i15 - r11) / f12;
                        i14 = i15 - ((int) (aVar.f6191b * f12));
                    }
                    boolean z12 = f10 != aVar.f6191b ? z11 : false;
                    int i18 = aVar.f6190a & 112;
                    if (i18 == 16) {
                        int i19 = i13 - i11;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = i19 - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            if (i22 > i23) {
                                i20 = i23 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight + i24);
                    } else {
                        int i25 = i13 - i11;
                        childAt.layout(i14, (i25 - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i25 - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin);
                    }
                    if (z12) {
                        l(childAt, f10);
                    }
                    int i26 = aVar.f6191b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (Q && (rootWindowInsets = getRootWindowInsets()) != null) {
            o3.c systemGestureInsets = e3.toWindowInsetsCompat(rootWindowInsets).getSystemGestureInsets();
            m mVar = this.f6167i;
            mVar.setEdgeSize(Math.max(mVar.getDefaultEdgeSize(), systemGestureInsets.f77432a));
            m mVar2 = this.f6168j;
            mVar2.setEdgeSize(Math.max(mVar2.getDefaultEdgeSize(), systemGestureInsets.f77434c));
        }
        this.f6172n = false;
        this.f6173o = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.C != null && z1.getFitsSystemWindows(this);
        int layoutDirection = z1.getLayoutDirection(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (z10) {
                    int absoluteGravity = u.getAbsoluteGravity(aVar.f6190a, layoutDirection);
                    if (z1.getFitsSystemWindows(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.C;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.C;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) aVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) aVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) aVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (h(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - ((ViewGroup.MarginLayoutParams) aVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, 1073741824));
                } else {
                    if (!i(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (P) {
                        float elevation = z1.getElevation(childAt);
                        float f10 = this.f6162c;
                        if (elevation != f10) {
                            z1.setElevation(childAt, f10);
                        }
                    }
                    int iE = e(childAt) & 7;
                    boolean z13 = iE == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + f(iE) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f6163e + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin, ((ViewGroup.MarginLayoutParams) aVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewC;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i10 = savedState.f6185e;
        if (i10 != 0 && (viewC = c(i10)) != null) {
            openDrawer(viewC);
        }
        int i11 = savedState.f6186f;
        if (i11 != 3) {
            setDrawerLockMode(i11, 3);
        }
        int i12 = savedState.f6187g;
        if (i12 != 3) {
            setDrawerLockMode(i12, 5);
        }
        int i13 = savedState.f6188h;
        if (i13 != 3) {
            setDrawerLockMode(i13, 8388611);
        }
        int i14 = savedState.f6189i;
        if (i14 != 3) {
            setDrawerLockMode(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        k();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            a aVar = (a) getChildAt(i10).getLayoutParams();
            int i11 = aVar.f6193d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                savedState.f6185e = aVar.f6190a;
                break;
            }
        }
        savedState.f6186f = this.f6174p;
        savedState.f6187g = this.f6175q;
        savedState.f6188h = this.f6176r;
        savedState.f6189i = this.f6177s;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            i4.m r0 = r6.f6167i
            r0.processTouchEvent(r7)
            i4.m r1 = r6.f6168j
            r1.processTouchEvent(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L72
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.b(r3)
            r6.f6178t = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.findTopChildUnder(r4, r5)
            if (r4 == 0) goto L6d
            boolean r4 = h(r4)
            if (r4 == 0) goto L6d
            float r4 = r6.f6180v
            float r1 = r1 - r4
            float r4 = r6.f6181w
            float r7 = r7 - r4
            int r0 = r0.getTouchSlop()
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L6d
            int r7 = r6.getChildCount()
            r0 = r2
        L4e:
            if (r0 >= r7) goto L63
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$a r4 = (androidx.drawerlayout.widget.DrawerLayout.a) r4
            int r4 = r4.f6193d
            r4 = r4 & r3
            if (r4 != r3) goto L60
            goto L64
        L60:
            int r0 = r0 + 1
            goto L4e
        L63:
            r1 = 0
        L64:
            if (r1 == 0) goto L6d
            int r7 = r6.getDrawerLockMode(r1)
            r0 = 2
            if (r7 != r0) goto L6e
        L6d:
            r2 = r3
        L6e:
            r6.b(r2)
            return r3
        L72:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f6180v = r0
            r6.f6181w = r7
            r6.f6178t = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // i4.i
    public void open() {
        openDrawer(8388611);
    }

    public void openDrawer(View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(e eVar) {
        ArrayList arrayList;
        if (eVar == null || (arrayList = this.f6179u) == null) {
            return;
        }
        arrayList.remove(eVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            b(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f6172n) {
            return;
        }
        super.requestLayout();
    }

    public void setChildInsets(Object obj, boolean z10) {
        this.C = obj;
        this.D = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f10) {
        this.f6162c = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (i(childAt)) {
                z1.setElevation(childAt, this.f6162c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        if (eVar != null) {
            addDrawerListener(eVar);
        }
    }

    public void setDrawerLockMode(int i10) {
        setDrawerLockMode(i10, 3);
        setDrawerLockMode(i10, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i10) {
        if (P) {
            return;
        }
        if ((i10 & 8388611) == 8388611) {
            this.E = drawable;
        } else if ((i10 & 8388613) == 8388613) {
            this.F = drawable;
        } else if ((i10 & 3) == 3) {
            this.G = drawable;
        } else if ((i10 & 5) != 5) {
            return;
        } else {
            this.H = drawable;
        }
        k();
        invalidate();
    }

    public void setDrawerTitle(int i10, CharSequence charSequence) {
        int absoluteGravity = u.getAbsoluteGravity(i10, z1.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            this.A = charSequence;
        } else if (absoluteGravity == 5) {
            this.B = charSequence;
        }
    }

    public void setScrimColor(int i10) {
        this.f6164f = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f6182x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f6182x = new ColorDrawable(i10);
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.drawerLayoutStyle);
    }

    public void closeDrawer(View view, boolean z10) {
        if (!i(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        a aVar = (a) view.getLayoutParams();
        if (this.f6173o) {
            aVar.f6191b = 0.0f;
            aVar.f6193d = 0;
        } else if (z10) {
            aVar.f6193d |= 4;
            if (a(3, view)) {
                this.f6167i.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
            } else {
                this.f6168j.smoothSlideViewTo(view, getWidth(), view.getTop());
            }
        } else {
            j(view, 0.0f);
            o(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void openDrawer(View view, boolean z10) {
        if (!i(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        a aVar = (a) view.getLayoutParams();
        if (this.f6173o) {
            aVar.f6191b = 1.0f;
            aVar.f6193d = 1;
            n(view, true);
            m(view);
        } else if (z10) {
            aVar.f6193d |= 2;
            if (a(3, view)) {
                this.f6167i.smoothSlideViewTo(view, 0, view.getTop());
            } else {
                this.f6168j.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            j(view, 1.0f);
            o(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6161b = new d();
        this.f6164f = -1728053248;
        this.f6166h = new Paint();
        this.f6173o = true;
        this.f6174p = 3;
        this.f6175q = 3;
        this.f6176r = 3;
        this.f6177s = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.L = new q4.a(this);
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f6163e = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        b bVar = new b(this, 3);
        this.f6169k = bVar;
        b bVar2 = new b(this, 5);
        this.f6170l = bVar2;
        m mVarCreate = m.create(this, 1.0f, bVar);
        this.f6167i = mVarCreate;
        mVarCreate.setEdgeTrackingEnabled(1);
        mVarCreate.setMinVelocity(f11);
        bVar.setDragger(mVarCreate);
        m mVarCreate2 = m.create(this, 1.0f, bVar2);
        this.f6168j = mVarCreate2;
        mVarCreate2.setEdgeTrackingEnabled(2);
        mVarCreate2.setMinVelocity(f11);
        bVar2.setDragger(mVarCreate2);
        setFocusableInTouchMode(true);
        z1.setImportantForAccessibility(this, 1);
        z1.setAccessibilityDelegate(this, new q4.c(this));
        setMotionEventSplittingEnabled(false);
        if (z1.getFitsSystemWindows(this)) {
            setOnApplyWindowInsetsListener(new q4.b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(M);
            try {
                this.f6182x = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p4.a.f80676a, i10, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f6162c = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f6162c = getResources().getDimension(com.digidust.elokence.akinator.freemium.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.I = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setDrawerLockMode(int i10, int i11) {
        View viewC;
        int absoluteGravity = u.getAbsoluteGravity(i11, z1.getLayoutDirection(this));
        if (i11 == 3) {
            this.f6174p = i10;
        } else if (i11 == 5) {
            this.f6175q = i10;
        } else if (i11 == 8388611) {
            this.f6176r = i10;
        } else if (i11 == 8388613) {
            this.f6177s = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f6167i : this.f6168j).cancel();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewC = c(absoluteGravity)) != null) {
                openDrawer(viewC);
                return;
            }
            return;
        }
        View viewC2 = c(absoluteGravity);
        if (viewC2 != null) {
            closeDrawer(viewC2);
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f6182x = i10 != 0 ? m3.a.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    public boolean isDrawerVisible(int i10) {
        View viewC = c(i10);
        if (viewC != null) {
            return isDrawerVisible(viewC);
        }
        return false;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public final int f6190a;

        /* renamed from: b, reason: collision with root package name */
        public float f6191b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6192c;

        /* renamed from: d, reason: collision with root package name */
        public int f6193d;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6190a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.N);
            this.f6190a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.f6190a = 0;
        }

        public a(int i10, int i11, int i12) {
            this(i10, i11);
            this.f6190a = i12;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f6190a = 0;
            this.f6190a = aVar.f6190a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6190a = 0;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6190a = 0;
        }
    }

    public boolean isDrawerOpen(int i10) {
        View viewC = c(i10);
        if (viewC != null) {
            return isDrawerOpen(viewC);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new androidx.drawerlayout.widget.a();

        /* renamed from: e, reason: collision with root package name */
        public int f6185e;

        /* renamed from: f, reason: collision with root package name */
        public int f6186f;

        /* renamed from: g, reason: collision with root package name */
        public int f6187g;

        /* renamed from: h, reason: collision with root package name */
        public int f6188h;

        /* renamed from: i, reason: collision with root package name */
        public int f6189i;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6185e = 0;
            this.f6185e = parcel.readInt();
            this.f6186f = parcel.readInt();
            this.f6187g = parcel.readInt();
            this.f6188h = parcel.readInt();
            this.f6189i = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6185e);
            parcel.writeInt(this.f6186f);
            parcel.writeInt(this.f6187g);
            parcel.writeInt(this.f6188h);
            parcel.writeInt(this.f6189i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f6185e = 0;
        }
    }

    public void setDrawerShadow(int i10, int i11) {
        setDrawerShadow(m3.a.getDrawable(getContext(), i10), i11);
    }

    public int getDrawerLockMode(View view) {
        if (i(view)) {
            return getDrawerLockMode(((a) view.getLayoutParams()).f6190a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerLockMode(int i10, View view) {
        if (i(view)) {
            setDrawerLockMode(i10, ((a) view.getLayoutParams()).f6190a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i10) {
        closeDrawer(i10, true);
    }

    public void closeDrawer(int i10, boolean z10) {
        View viewC = c(i10);
        if (viewC != null) {
            closeDrawer(viewC, z10);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + f(i10));
        }
    }

    public void openDrawer(int i10) {
        openDrawer(i10, true);
    }

    public void openDrawer(int i10, boolean z10) {
        View viewC = c(i10);
        if (viewC != null) {
            openDrawer(viewC, z10);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + f(i10));
        }
    }
}

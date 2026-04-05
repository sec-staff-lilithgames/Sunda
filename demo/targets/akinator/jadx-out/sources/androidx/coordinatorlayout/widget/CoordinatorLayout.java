package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import com.digidust.elokence.akinator.freemium.R;
import i3.d;
import i3.e;
import i3.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w3.h;
import x3.e3;
import x3.m0;
import x3.n0;
import x3.p0;
import x3.u;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements m0, n0 {
    public static final h A;

    /* renamed from: w, reason: collision with root package name */
    public static final String f5582w;

    /* renamed from: x, reason: collision with root package name */
    public static final Class[] f5583x;

    /* renamed from: y, reason: collision with root package name */
    public static final ThreadLocal f5584y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f5585z;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5586b;

    /* renamed from: c, reason: collision with root package name */
    public final e f5587c;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5588e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5589f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f5590g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f5591h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f5592i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5593j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5594k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f5595l;

    /* renamed from: m, reason: collision with root package name */
    public View f5596m;

    /* renamed from: n, reason: collision with root package name */
    public View f5597n;

    /* renamed from: o, reason: collision with root package name */
    public i3.c f5598o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5599p;

    /* renamed from: q, reason: collision with root package name */
    public e3 f5600q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5601r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f5602s;

    /* renamed from: t, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f5603t;

    /* renamed from: u, reason: collision with root package name */
    public i3.a f5604u;

    /* renamed from: v, reason: collision with root package name */
    public final p0 f5605v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public a() {
        }

        public static Object getTag(View view) {
            return ((b) view.getLayoutParams()).f5624r;
        }

        public static void setTag(View view, Object obj) {
            ((b) view.getLayoutParams()).f5624r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            return getScrimOpacity(coordinatorLayout, view) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public a(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                onNestedPreScroll(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                onNestedScroll(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return onStartNestedScroll(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                onStopNestedScroll(coordinatorLayout, view, view2);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            onNestedScroll(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void onDetachedFromLayoutParams() {
        }

        public void onAttachedToLayoutParams(b bVar) {
        }

        public e3 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, View view, e3 e3Var) {
            return e3Var;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f5582w = r02 != null ? r02.getName() : null;
        f5585z = new d();
        f5583x = new Class[]{Context.class, AttributeSet.class};
        f5584y = new ThreadLocal();
        A = new h(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public static Rect a() {
        Rect rect = (Rect) A.acquire();
        return rect == null ? new Rect() : rect;
    }

    public static void d(int i10, Rect rect, Rect rect2, b bVar, int i11, int i12) {
        int i13 = bVar.f5609c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = u.getAbsoluteGravity(i13, i10);
        int i14 = bVar.f5610d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = u.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        int iWidth = i17 != 1 ? i17 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i18 != 16 ? i18 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b f(View view) {
        b bVar = (b) view.getLayoutParams();
        if (!bVar.f5608b) {
            if (view instanceof androidx.coordinatorlayout.widget.a) {
                a behavior = ((androidx.coordinatorlayout.widget.a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                bVar.setBehavior(behavior);
                bVar.f5608b = true;
                return bVar;
            }
            androidx.coordinatorlayout.widget.b bVar2 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar2 = (androidx.coordinatorlayout.widget.b) superclass.getAnnotation(androidx.coordinatorlayout.widget.b.class);
                if (bVar2 != null) {
                    break;
                }
            }
            if (bVar2 != null) {
                try {
                    bVar.setBehavior((a) bVar2.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar2.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            bVar.f5608b = true;
        }
        return bVar;
    }

    public static void k(int i10, View view) {
        b bVar = (b) view.getLayoutParams();
        int i11 = bVar.f5615i;
        if (i11 != i10) {
            z1.offsetLeftAndRight(view, i10 - i11);
            bVar.f5615i = i10;
        }
    }

    public static void l(int i10, View view) {
        b bVar = (b) view.getLayoutParams();
        int i11 = bVar.f5616j;
        if (i11 != i10) {
            z1.offsetTopAndBottom(view, i10 - i11);
            bVar.f5616j = i10;
        }
    }

    public final void b(b bVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) bVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) bVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    public final void c(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            f.getDescendantRect(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(View view) {
        List incomingEdges = this.f5587c.getIncomingEdges(view);
        if (incomingEdges == null || incomingEdges.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < incomingEdges.size(); i10++) {
            View view2 = (View) incomingEdges.get(i10);
            a behavior = ((b) view2.getLayoutParams()).getBehavior();
            if (behavior != null) {
                behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        h hVar = A;
        boolean z10 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectA = a();
        c(view, rectA, view.getParent() != this);
        Rect rectA2 = a();
        c(view2, rectA2, view2.getParent() != this);
        try {
            if (rectA.left <= rectA2.right && rectA.top <= rectA2.bottom && rectA.right >= rectA2.left) {
                if (rectA.bottom >= rectA2.top) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            rectA.setEmpty();
            hVar.release(rectA);
            rectA2.setEmpty();
            hVar.release(rectA2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.b) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r3 = r2.f5607a
            if (r3 == 0) goto L91
            float r3 = r3.getScrimOpacity(r0, r1)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L91
            android.graphics.Paint r4 = r0.f5590g
            if (r4 != 0) goto L22
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.f5590g = r4
        L22:
            android.graphics.Paint r4 = r0.f5590g
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r2 = r2.f5607a
            int r2 = r2.getScrimColor(r0, r1)
            r4.setColor(r2)
            android.graphics.Paint r2 = r0.f5590g
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            if (r3 >= 0) goto L3a
            r3 = 0
            goto L3f
        L3a:
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L3f
            r3 = r4
        L3f:
            r2.setAlpha(r3)
            int r2 = r17.save()
            boolean r3 = r1.isOpaque()
            if (r3 == 0) goto L67
            int r3 = r1.getLeft()
            float r5 = (float) r3
            int r3 = r1.getTop()
            float r6 = (float) r3
            int r3 = r1.getRight()
            float r7 = (float) r3
            int r3 = r1.getBottom()
            float r8 = (float) r3
            android.graphics.Region$Op r9 = android.graphics.Region.Op.DIFFERENCE
            r4 = r17
            r4.clipRect(r5, r6, r7, r8, r9)
        L67:
            int r3 = r0.getPaddingLeft()
            float r11 = (float) r3
            int r3 = r0.getPaddingTop()
            float r12 = (float) r3
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            float r13 = (float) r3
            int r3 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r3 = r3 - r4
            float r14 = (float) r3
            android.graphics.Paint r15 = r0.f5590g
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            r4 = r10
            r4.restoreToCount(r2)
            goto L93
        L91:
            r4 = r17
        L93:
            boolean r1 = super.drawChild(r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5602s;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final int e(int i10) {
        int[] iArr = this.f5595l;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r23) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.g(int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public List<View> getDependencies(View view) {
        List<Object> outgoingEdges = this.f5587c.getOutgoingEdges(view);
        ArrayList arrayList = this.f5589f;
        arrayList.clear();
        if (outgoingEdges != null) {
            arrayList.addAll(outgoingEdges);
        }
        return arrayList;
    }

    public final List<View> getDependencySortedChildren() {
        i();
        return Collections.unmodifiableList(this.f5586b);
    }

    public List<View> getDependents(View view) {
        List incomingEdges = this.f5587c.getIncomingEdges(view);
        ArrayList arrayList = this.f5589f;
        arrayList.clear();
        if (incomingEdges != null) {
            arrayList.addAll(incomingEdges);
        }
        return arrayList;
    }

    public final e3 getLastWindowInsets() {
        return this.f5600q;
    }

    @Override // android.view.ViewGroup, x3.m0, x3.n0
    public int getNestedScrollAxes() {
        return this.f5605v.getNestedScrollAxes();
    }

    public Drawable getStatusBarBackground() {
        return this.f5602s;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final boolean h(MotionEvent motionEvent, int i10) {
        boolean zBlocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f5588e;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        d dVar = f5585z;
        if (dVar != null) {
            Collections.sort(arrayList, dVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            b bVar = (b) view.getLayoutParams();
            a behavior = bVar.getBehavior();
            if (!(zOnInterceptTouchEvent || z10) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && behavior != null) {
                    if (i10 == 0) {
                        zOnInterceptTouchEvent = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zOnInterceptTouchEvent = behavior.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.f5596m = view;
                    }
                }
                a aVar = bVar.f5607a;
                if (aVar == null) {
                    bVar.f5619m = false;
                }
                boolean z11 = bVar.f5619m;
                if (z11) {
                    zBlocksInteractionBelow = true;
                } else {
                    zBlocksInteractionBelow = (aVar != null ? aVar.blocksInteractionBelow(this, view) : false) | z11;
                    bVar.f5619m = zBlocksInteractionBelow;
                }
                boolean z12 = zBlocksInteractionBelow && !z11;
                if (zBlocksInteractionBelow && !z12) {
                    break;
                }
                z10 = z12;
            } else if (behavior != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    behavior.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zOnInterceptTouchEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.i():void");
    }

    public boolean isPointInChildBounds(View view, int i10, int i11) {
        h hVar = A;
        Rect rectA = a();
        f.getDescendantRect(this, view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            rectA.setEmpty();
            hVar.release(rectA);
        }
    }

    public final void j(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a behavior = ((b) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    behavior.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    behavior.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((b) getChildAt(i11).getLayoutParams()).f5619m = false;
        }
        this.f5596m = null;
        this.f5593j = false;
    }

    public final void m() {
        if (!z1.getFitsSystemWindows(this)) {
            z1.setOnApplyWindowInsetsListener(this, null);
            return;
        }
        if (this.f5604u == null) {
            this.f5604u = new i3.a(this);
        }
        z1.setOnApplyWindowInsetsListener(this, this.f5604u);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j(false);
        if (this.f5599p) {
            if (this.f5598o == null) {
                this.f5598o = new i3.c(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5598o);
        }
        if (this.f5600q == null && z1.getFitsSystemWindows(this)) {
            z1.requestApplyInsets(this);
        }
        this.f5594k = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j(false);
        if (this.f5599p && this.f5598o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5598o);
        }
        View view = this.f5597n;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f5594k = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5601r || this.f5602s == null) {
            return;
        }
        e3 e3Var = this.f5600q;
        int systemWindowInsetTop = e3Var != null ? e3Var.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f5602s.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f5602s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            j(true);
        }
        boolean zH = h(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zH;
        }
        j(true);
        return zH;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a behavior;
        int layoutDirection = z1.getLayoutDirection(this);
        ArrayList arrayList = this.f5586b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((behavior = ((b) view.getLayoutParams()).getBehavior()) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(View view, int i10) {
        Rect rectA;
        Rect rectA2;
        b bVar = (b) view.getLayoutParams();
        View view2 = bVar.f5617k;
        if (view2 == null && bVar.f5612f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        h hVar = A;
        if (view2 != null) {
            rectA = a();
            rectA2 = a();
            try {
                f.getDescendantRect(this, view2, rectA);
                b bVar2 = (b) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                d(i10, rectA, rectA2, bVar2, measuredWidth, measuredHeight);
                b(bVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                hVar.release(rectA);
                rectA2.setEmpty();
                hVar.release(rectA2);
            }
        }
        int i11 = bVar.f5611e;
        if (i11 < 0) {
            b bVar3 = (b) view.getLayoutParams();
            rectA = a();
            rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) bVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) bVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin);
            if (this.f5600q != null && z1.getFitsSystemWindows(this) && !z1.getFitsSystemWindows(view)) {
                rectA.left = this.f5600q.getSystemWindowInsetLeft() + rectA.left;
                rectA.top = this.f5600q.getSystemWindowInsetTop() + rectA.top;
                rectA.right -= this.f5600q.getSystemWindowInsetRight();
                rectA.bottom -= this.f5600q.getSystemWindowInsetBottom();
            }
            rectA2 = a();
            int i12 = bVar3.f5609c;
            if ((i12 & 7) == 0) {
                i12 |= 8388611;
            }
            if ((i12 & 112) == 0) {
                i12 |= 48;
            }
            u.apply(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
            return;
        }
        b bVar4 = (b) view.getLayoutParams();
        int i13 = bVar4.f5609c;
        if (i13 == 0) {
            i13 = 8388661;
        }
        int absoluteGravity = u.getAbsoluteGravity(i13, i10);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i11 = width - i11;
        }
        int iE = e(i11) - measuredWidth2;
        if (i14 == 1) {
            iE += measuredWidth2 / 2;
        } else if (i14 == 5) {
            iE += measuredWidth2;
        }
        int i16 = i15 != 16 ? i15 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bVar4).leftMargin, Math.min(iE, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) bVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) bVar4).topMargin, Math.min(i16, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0181  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, x3.m0, x3.o0, x3.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
        /*
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3f
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1b
        L15:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            goto L38
        L1b:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.b) r4
            boolean r5 = r4.a(r1)
            if (r5 != 0) goto L28
            goto L15
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r4 = r4.getBehavior()
            if (r4 == 0) goto L15
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r12 = r4.onNestedFling(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r12
        L38:
            int r2 = r2 + 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            goto L7
        L3f:
            r5 = r11
            if (r3 == 0) goto L46
            r12 = 1
            r11.g(r12)
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedFling(android.view.View, float, float, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, x3.m0, x3.o0, x3.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
        /*
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3b
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L19
        L15:
            r7 = r11
            r8 = r12
            r9 = r13
            goto L35
        L19:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.b) r4
            boolean r5 = r4.a(r1)
            if (r5 != 0) goto L26
            goto L15
        L26:
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r4 = r4.getBehavior()
            if (r4 == 0) goto L15
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r11 = r4.onNestedPreFling(r5, r6, r7, r8, r9)
            r3 = r3 | r11
        L35:
            int r2 = r2 + 1
            r11 = r7
            r12 = r8
            r13 = r9
            goto L7
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedPreFling(android.view.View, float, float):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.m0, x3.o0, x3.n0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.m0, x3.o0, x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.m0, x3.o0, x3.n0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray sparseArray = savedState.f5606e;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            a behavior = f(childAt).getBehavior();
            if (id2 != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            a behavior = ((b) childAt.getLayoutParams()).getBehavior();
            if (id2 != -1 && behavior != null && (parcelableOnSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id2, parcelableOnSaveInstanceState);
            }
        }
        savedState.f5606e = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.m0, x3.o0, x3.n0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.m0, x3.o0, x3.n0
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f5596m
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.h(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f5596m
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.b) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r6 = r6.getBehavior()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f5596m
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f5596m
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L56
            r1 = 3
            if (r2 != r1) goto L55
            goto L56
        L55:
            return r6
        L56:
            r0.j(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        a behavior = ((b) view.getLayoutParams()).getBehavior();
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f5593j) {
            return;
        }
        j(false);
        this.f5593j = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        m();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5603t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f5602s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f5602s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f5602s.setState(getDrawableState());
                }
                p3.a.setLayoutDirection(this.f5602s, z1.getLayoutDirection(this));
                this.f5602s.setVisible(getVisibility() == 0, false);
                this.f5602s.setCallback(this);
            }
            z1.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? m3.a.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f5602s;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f5602s.setVisible(z10, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5602s;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // x3.m0, x3.n0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        a behavior;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.a(i12) && (behavior = bVar.getBehavior()) != null) {
                    int[] iArr2 = this.f5591h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f5591h;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr3[1]) : Math.min(iMax2, iArr3[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            g(1);
        }
    }

    @Override // x3.m0, x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.f5592i);
    }

    @Override // x3.m0, x3.n0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        a behavior;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f5605v.onNestedScrollAccepted(view, view2, i10, i11);
        this.f5597n = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            if (bVar.a(i11) && (behavior = bVar.getBehavior()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                behavior.onNestedScrollAccepted(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // x3.m0, x3.n0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                a behavior = bVar.getBehavior();
                if (behavior != null) {
                    boolean zOnStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i10, i11);
                    z10 |= zOnStartNestedScroll;
                    if (i11 == 0) {
                        bVar.f5620n = zOnStartNestedScroll;
                    } else if (i11 == 1) {
                        bVar.f5621o = zOnStartNestedScroll;
                    }
                } else if (i11 == 0) {
                    bVar.f5620n = false;
                } else if (i11 == 1) {
                    bVar.f5621o = false;
                }
            }
        }
        return z10;
    }

    @Override // x3.m0, x3.n0
    public void onStopNestedScroll(View view, int i10) {
        this.f5605v.onStopNestedScroll(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            b bVar = (b) childAt.getLayoutParams();
            if (bVar.a(i10)) {
                a behavior = bVar.getBehavior();
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    bVar.f5620n = false;
                } else if (i10 == 1) {
                    bVar.f5621o = false;
                }
                bVar.f5622p = false;
            }
        }
        this.f5597n = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f5586b = new ArrayList();
        this.f5587c = new e();
        this.f5588e = new ArrayList();
        this.f5589f = new ArrayList();
        this.f5591h = new int[2];
        this.f5592i = new int[2];
        this.f5605v = new p0(this);
        int[] iArr = h3.a.f58694a;
        if (i10 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f5595l = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i11 = 0; i11 < length; i11++) {
                coordinatorLayout.f5595l[i11] = (int) (r11[i11] * f10);
            }
        }
        coordinatorLayout.f5602s = typedArray.getDrawable(1);
        typedArray.recycle();
        m();
        super.setOnHierarchyChangeListener(new i3.b(this));
        if (z1.getImportantForAccessibility(this) == 0) {
            z1.setImportantForAccessibility(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    @Override // x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        a behavior;
        int iMin;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.a(i14) && (behavior = bVar.getBehavior()) != null) {
                    int[] iArr2 = this.f5591h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f5591h;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i13 > 0) {
                        iMin = Math.max(i15, iArr3[1]);
                    } else {
                        iMin = Math.min(i15, iArr3[1]);
                    }
                    i15 = iMin;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i15;
        if (z10) {
            g(1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new c();

        /* renamed from: e, reason: collision with root package name */
        public SparseArray f5606e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f5606e = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f5606e.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f5606e;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f5606e.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f5606e.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public a f5607a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5608b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5609c;

        /* renamed from: d, reason: collision with root package name */
        public int f5610d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5611e;

        /* renamed from: f, reason: collision with root package name */
        public int f5612f;

        /* renamed from: g, reason: collision with root package name */
        public final int f5613g;

        /* renamed from: h, reason: collision with root package name */
        public int f5614h;

        /* renamed from: i, reason: collision with root package name */
        public int f5615i;

        /* renamed from: j, reason: collision with root package name */
        public int f5616j;

        /* renamed from: k, reason: collision with root package name */
        public View f5617k;

        /* renamed from: l, reason: collision with root package name */
        public View f5618l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f5619m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f5620n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f5621o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f5622p;

        /* renamed from: q, reason: collision with root package name */
        public final Rect f5623q;

        /* renamed from: r, reason: collision with root package name */
        public Object f5624r;

        public b(int i10, int i11) {
            super(i10, i11);
            this.f5608b = false;
            this.f5609c = 0;
            this.f5610d = 0;
            this.f5611e = -1;
            this.f5612f = -1;
            this.f5613g = 0;
            this.f5614h = 0;
            this.f5623q = new Rect();
        }

        public final boolean a(int i10) {
            if (i10 == 0) {
                return this.f5620n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f5621o;
        }

        public int getAnchorId() {
            return this.f5612f;
        }

        public a getBehavior() {
            return this.f5607a;
        }

        public void setAnchorId(int i10) {
            this.f5618l = null;
            this.f5617k = null;
            this.f5612f = i10;
        }

        public void setBehavior(a aVar) {
            a aVar2 = this.f5607a;
            if (aVar2 != aVar) {
                if (aVar2 != null) {
                    aVar2.onDetachedFromLayoutParams();
                }
                this.f5607a = aVar;
                this.f5624r = null;
                this.f5608b = true;
                if (aVar != null) {
                    aVar.onAttachedToLayoutParams(this);
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
            a aVar;
            super(context, attributeSet);
            this.f5608b = false;
            this.f5609c = 0;
            this.f5610d = 0;
            this.f5611e = -1;
            this.f5612f = -1;
            this.f5613g = 0;
            this.f5614h = 0;
            this.f5623q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3.a.f58695b);
            this.f5609c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f5612f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f5610d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f5611e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f5613g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f5614h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f5608b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f5582w;
                if (TextUtils.isEmpty(string)) {
                    aVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f5582w;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal threadLocal = CoordinatorLayout.f5584y;
                        Map map = (Map) threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f5583x);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        aVar = (a) constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException(a.b.k("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f5607a = aVar;
            }
            typedArrayObtainStyledAttributes.recycle();
            a aVar2 = this.f5607a;
            if (aVar2 != null) {
                aVar2.onAttachedToLayoutParams(this);
            }
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.f5608b = false;
            this.f5609c = 0;
            this.f5610d = 0;
            this.f5611e = -1;
            this.f5612f = -1;
            this.f5613g = 0;
            this.f5614h = 0;
            this.f5623q = new Rect();
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5608b = false;
            this.f5609c = 0;
            this.f5610d = 0;
            this.f5611e = -1;
            this.f5612f = -1;
            this.f5613g = 0;
            this.f5614h = 0;
            this.f5623q = new Rect();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5608b = false;
            this.f5609c = 0;
            this.f5610d = 0;
            this.f5611e = -1;
            this.f5612f = -1;
            this.f5613g = 0;
            this.f5614h = 0;
            this.f5623q = new Rect();
        }
    }
}

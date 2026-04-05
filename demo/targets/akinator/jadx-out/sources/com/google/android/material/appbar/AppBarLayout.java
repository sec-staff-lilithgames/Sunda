package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import ao.kwoC.zAQQWzBxnS;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import qg.j0;
import qg.k;
import sg.o;
import wf.e;
import wf.g;
import wf.h;
import x3.e3;
import x3.k0;
import x3.z1;
import yg.j;
import yg.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class AppBarLayout extends LinearLayout implements androidx.coordinatorlayout.widget.a {
    public static final /* synthetic */ int D = 0;
    public Integer A;
    public final float B;
    public Behavior C;

    /* renamed from: b, reason: collision with root package name */
    public int f28838b;

    /* renamed from: c, reason: collision with root package name */
    public int f28839c;

    /* renamed from: e, reason: collision with root package name */
    public int f28840e;

    /* renamed from: f, reason: collision with root package name */
    public int f28841f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28842g;

    /* renamed from: h, reason: collision with root package name */
    public int f28843h;

    /* renamed from: i, reason: collision with root package name */
    public e3 f28844i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f28845j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28846k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f28847l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28848m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28849n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f28850o;

    /* renamed from: p, reason: collision with root package name */
    public int f28851p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f28852q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f28853r;

    /* renamed from: s, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f28854s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f28855t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f28856u;

    /* renamed from: v, reason: collision with root package name */
    public final long f28857v;

    /* renamed from: w, reason: collision with root package name */
    public final TimeInterpolator f28858w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f28859x;

    /* renamed from: y, reason: collision with root package name */
    public int f28860y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f28861z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class BaseBehavior<T extends AppBarLayout> extends g {

        /* renamed from: m, reason: collision with root package name */
        public int f28862m;

        /* renamed from: n, reason: collision with root package name */
        public int f28863n;

        /* renamed from: o, reason: collision with root package name */
        public ValueAnimator f28864o;

        /* renamed from: p, reason: collision with root package name */
        public SavedState f28865p;

        /* renamed from: q, reason: collision with root package name */
        public WeakReference f28866q;

        /* renamed from: r, reason: collision with root package name */
        public a f28867r;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class a {
            public abstract boolean canDrag(AppBarLayout appBarLayout);
        }

        public BaseBehavior() {
        }

        public static View i(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.b) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View k(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof k0) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void n(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L5d
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.getScrollFlags()
                r3 = r1 & 1
                if (r3 == 0) goto L5d
                int r3 = r4.getMinimumHeight()
                if (r9 <= 0) goto L4b
                r9 = r1 & 12
                if (r9 == 0) goto L4b
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                int r1 = r7.getTopInset()
                int r9 = r9 - r1
                if (r8 < r9) goto L5d
            L49:
                r8 = r0
                goto L5e
            L4b:
                r9 = r1 & 2
                if (r9 == 0) goto L5d
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                int r1 = r7.getTopInset()
                int r9 = r9 - r1
                if (r8 < r9) goto L5d
                goto L49
            L5d:
                r8 = r2
            L5e:
                boolean r9 = r7.isLiftOnScroll()
                if (r9 == 0) goto L6c
                android.view.View r8 = k(r6)
                boolean r8 = r7.e(r8)
            L6c:
                boolean r9 = r7.f28846k
                r9 = r9 ^ r0
                boolean r8 = r7.d(r8, r9)
                if (r10 != 0) goto La1
                if (r8 == 0) goto Lc8
                java.util.List r6 = r6.getDependents(r7)
                int r8 = r6.size()
            L7f:
                if (r2 >= r8) goto Lc8
                java.lang.Object r9 = r6.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$b r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.b) r9
                androidx.coordinatorlayout.widget.CoordinatorLayout$a r9 = r9.getBehavior()
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto L9e
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.getOverlayTop()
                if (r6 == 0) goto Lc8
                goto La1
            L9e:
                int r2 = r2 + 1
                goto L7f
            La1:
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                if (r6 == 0) goto Lae
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                r6.jumpToCurrentState()
            Lae:
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                if (r6 == 0) goto Lbb
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                r6.jumpToCurrentState()
            Lbb:
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                if (r6 == 0) goto Lc8
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                r6.jumpToCurrentState()
            Lc8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.n(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // wf.i
        public final int a() {
            return getTopAndBottomOffset() + this.f28862m;
        }

        @Override // wf.g
        public final boolean c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            a aVar = this.f28867r;
            if (aVar != null) {
                return aVar.canDrag(appBarLayout);
            }
            WeakReference weakReference = this.f28866q;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // wf.g
        public final int d(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // wf.g
        public final int e(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // wf.g
        public final void f(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m(coordinatorLayout, appBarLayout);
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.d(appBarLayout.e(k(coordinatorLayout)), !appBarLayout.f28846k);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
        @Override // wf.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int g(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.a()
                r1 = 0
                if (r11 == 0) goto Lda
                if (r0 < r11) goto Lda
                if (r0 > r12) goto Lda
                int r10 = r3.a.clamp(r10, r11, r12)
                if (r0 == r10) goto Ldc
                boolean r11 = r9.f28842g
                if (r11 == 0) goto L87
                int r11 = java.lang.Math.abs(r10)
                int r12 = r9.getChildCount()
                r2 = r1
            L20:
                if (r2 >= r12) goto L87
                android.view.View r3 = r9.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r4 = (com.google.android.material.appbar.AppBarLayout.c) r4
                android.view.animation.Interpolator r5 = r4.getScrollInterpolator()
                int r6 = r3.getTop()
                if (r11 < r6) goto L84
                int r6 = r3.getBottom()
                if (r11 > r6) goto L84
                if (r5 == 0) goto L87
                int r12 = r4.getScrollFlags()
                r2 = r12 & 1
                if (r2 == 0) goto L5a
                int r2 = r3.getHeight()
                int r6 = r4.topMargin
                int r2 = r2 + r6
                int r4 = r4.bottomMargin
                int r2 = r2 + r4
                r12 = r12 & 2
                if (r12 == 0) goto L5b
                int r12 = r3.getMinimumHeight()
                int r2 = r2 - r12
                goto L5b
            L5a:
                r2 = r1
            L5b:
                boolean r12 = r3.getFitsSystemWindows()
                if (r12 == 0) goto L66
                int r12 = r9.getTopInset()
                int r2 = r2 - r12
            L66:
                if (r2 <= 0) goto L87
                int r12 = r3.getTop()
                int r11 = r11 - r12
                float r12 = (float) r2
                float r11 = (float) r11
                float r11 = r11 / r12
                float r11 = r5.getInterpolation(r11)
                float r11 = r11 * r12
                int r11 = java.lang.Math.round(r11)
                int r12 = java.lang.Integer.signum(r10)
                int r2 = r3.getTop()
                int r2 = r2 + r11
                int r2 = r2 * r12
                goto L88
            L84:
                int r2 = r2 + 1
                goto L20
            L87:
                r2 = r10
            L88:
                boolean r11 = r7.setTopAndBottomOffset(r2)
                int r12 = r0 - r10
                int r2 = r10 - r2
                r7.f28862m = r2
                r2 = 1
                if (r11 == 0) goto Lc2
                r3 = r1
            L96:
                int r4 = r9.getChildCount()
                if (r3 >= r4) goto Lc2
                android.view.View r4 = r9.getChildAt(r3)
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r4 = (com.google.android.material.appbar.AppBarLayout.c) r4
                com.google.android.material.appbar.AppBarLayout$a r5 = r4.getScrollEffect()
                if (r5 == 0) goto Lbf
                int r4 = r4.getScrollFlags()
                r4 = r4 & r2
                if (r4 == 0) goto Lbf
                android.view.View r4 = r9.getChildAt(r3)
                int r6 = r7.getTopAndBottomOffset()
                float r6 = (float) r6
                r5.onOffsetChanged(r9, r4, r6)
            Lbf:
                int r3 = r3 + 1
                goto L96
            Lc2:
                if (r11 != 0) goto Lcb
                boolean r11 = r9.f28842g
                if (r11 == 0) goto Lcb
                r8.dispatchDependentViewsChanged(r9)
            Lcb:
                int r11 = r7.getTopAndBottomOffset()
                r9.c(r11)
                if (r10 >= r0) goto Ld5
                r2 = -1
            Ld5:
                n(r8, r9, r10, r2, r1)
                r1 = r12
                goto Ldc
            Lda:
                r7.f28862m = r1
            Ldc:
                boolean r10 = x3.z1.hasAccessibilityDelegate(r8)
                if (r10 != 0) goto Lea
                com.google.android.material.appbar.b r10 = new com.google.android.material.appbar.b
                r10.<init>(r8, r7, r9)
                x3.z1.setAccessibilityDelegate(r8, r10)
            Lea:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void j(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(a() - i10);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iA = a();
            if (iA == i10) {
                ValueAnimator valueAnimator = this.f28864o;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f28864o.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f28864o;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f28864o = valueAnimator3;
                valueAnimator3.setInterpolator(vf.a.f89244e);
                this.f28864o.addUpdateListener(new com.google.android.material.appbar.a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f28864o.setDuration(Math.min(iRound, 600));
            this.f28864o.setIntValues(iA, i10);
            this.f28864o.start();
        }

        public final SavedState l(Parcelable parcelable, AppBarLayout appBarLayout) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f5785c;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = topAndBottomOffset == 0;
                    savedState.f28869f = z10;
                    savedState.f28868e = !z10 && (-topAndBottomOffset) >= appBarLayout.getTotalScrollRange();
                    savedState.f28870g = i10;
                    savedState.f28872i = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.f28871h = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iA = a() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.getScrollFlags() & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i11 = -iA;
                if (top <= i11 && bottom >= i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i10);
                c cVar2 = (c) childAt2.getLayoutParams();
                int scrollFlags = cVar2.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i10 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((scrollFlags & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((scrollFlags & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iA < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((scrollFlags & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iA < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    j(coordinatorLayout, appBarLayout, r3.a.clamp(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public void setDragCallback(a aVar) {
            this.f28867r = aVar;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // wf.i, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, (View) t10, i10);
            int pendingAction = t10.getPendingAction();
            SavedState savedState = this.f28865p;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t10.getUpNestedPreScrollRange();
                        if (z10) {
                            j(coordinatorLayout, t10, i11);
                        } else {
                            h(coordinatorLayout, t10, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            j(coordinatorLayout, t10, 0);
                        } else {
                            h(coordinatorLayout, t10, 0);
                        }
                    }
                }
            } else if (savedState.f28868e) {
                h(coordinatorLayout, t10, -t10.getTotalScrollRange());
            } else if (savedState.f28869f) {
                h(coordinatorLayout, t10, 0);
            } else {
                View childAt = t10.getChildAt(savedState.f28870g);
                int i12 = -childAt.getBottom();
                h(coordinatorLayout, t10, this.f28865p.f28872i ? t10.getTopInset() + childAt.getMinimumHeight() + i12 : Math.round(childAt.getHeight() * this.f28865p.f28871h) + i12);
            }
            t10.f28843h = 0;
            this.f28865p = null;
            setTopAndBottomOffset(r3.a.clamp(getTopAndBottomOffset(), -t10.getTotalScrollRange(), 0));
            n(coordinatorLayout, t10, getTopAndBottomOffset(), 0, true);
            t10.c(getTopAndBottomOffset());
            if (!z1.hasAccessibilityDelegate(coordinatorLayout)) {
                z1.setAccessibilityDelegate(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, t10));
            }
            return zOnLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.b) t10.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, (View) t10, i10, i11, i12, i13);
            }
            coordinatorLayout.onMeasureChild(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r8, T r9, android.view.View r10, int r11, int r12, int[] r13, int r14) {
            /*
                r7 = this;
                r11 = 1
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L12
                int r14 = r9.getTotalScrollRange()
                int r14 = -r14
                int r0 = r9.getDownNestedPreScrollRange()
                int r0 = r0 + r14
            Lf:
                r5 = r14
                r6 = r0
                goto L19
            L12:
                int r14 = r9.getUpNestedPreScrollRange()
                int r14 = -r14
                r0 = 0
                goto Lf
            L19:
                if (r5 == r6) goto L2b
                int r14 = r7.a()
                int r4 = r14 - r12
                r1 = r7
                r2 = r8
                r3 = r9
                int r8 = r1.g(r2, r3, r4, r5, r6)
                r13[r11] = r8
                goto L2c
            L2b:
                r3 = r9
            L2c:
                boolean r8 = r3.isLiftOnScroll()
                if (r8 == 0) goto L3c
                boolean r8 = r3.e(r10)
                boolean r9 = r3.f28846k
                r9 = r9 ^ r11
                r3.d(r8, r9)
            L3c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t11;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t11 = t10;
                iArr[1] = g(coordinatorLayout2, t11, a() - i13, -t10.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t11 = t10;
            }
            if (i13 != 0 || z1.hasAccessibilityDelegate(coordinatorLayout2)) {
                return;
            }
            z1.setAccessibilityDelegate(coordinatorLayout2, new com.google.android.material.appbar.b(coordinatorLayout2, this, t11));
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                super.onRestoreInstanceState(coordinatorLayout, (View) t10, parcelable);
                this.f28865p = null;
            } else {
                SavedState savedState = (SavedState) parcelable;
                this.f28865p = savedState;
                super.onRestoreInstanceState(coordinatorLayout, (View) t10, savedState.getSuperState());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (View) t10);
            SavedState savedStateL = l(parcelableOnSaveInstanceState, t10);
            return savedStateL == null ? parcelableOnSaveInstanceState : savedStateL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.isLiftOnScroll() || t10.isLifted() || (t10.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight()));
            if (z10 && (valueAnimator = this.f28864o) != null) {
                valueAnimator.cancel();
            }
            this.f28866q = null;
            this.f28863n = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f28863n == 0 || i10 == 1) {
                m(coordinatorLayout, t10);
                if (t10.isLiftOnScroll()) {
                    t10.d(t10.e(view), !t10.f28846k);
                }
            }
            this.f28866q = new WeakReference(view);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new com.google.android.material.appbar.c();

            /* renamed from: e, reason: collision with root package name */
            public boolean f28868e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f28869f;

            /* renamed from: g, reason: collision with root package name */
            public int f28870g;

            /* renamed from: h, reason: collision with root package name */
            public float f28871h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f28872i;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f28868e = parcel.readByte() != 0;
                this.f28869f = parcel.readByte() != 0;
                this.f28870g = parcel.readInt();
                this.f28871h = parcel.readFloat();
                this.f28872i = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f28868e ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f28869f ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f28870g);
                parcel.writeFloat(this.f28871h);
                parcel.writeByte(this.f28872i ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // wf.g, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i10);
        }

        @Override // wf.g, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public /* bridge */ /* synthetic */ boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.a aVar) {
            super.setDragCallback(aVar);
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z10) {
            super.setHorizontalOffsetEnabled(z10);
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i10) {
            return super.setLeftAndRightOffset(i10);
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i10) {
            return super.setTopAndBottomOffset(i10);
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z10) {
            super.setVerticalOffsetEnabled(z10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ScrollingViewBehavior extends h {
        public ScrollingViewBehavior() {
        }

        @Override // wf.h
        public final AppBarLayout c(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // wf.h
        public final float d(View view) {
            int i10;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.a behavior = ((CoordinatorLayout.b) appBarLayout.getLayoutParams()).getBehavior();
            int iA = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).a() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iA > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                return (iA / i10) + 1.0f;
            }
            return 0.0f;
        }

        @Override // wf.h
        public final int e(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iClamp;
            CoordinatorLayout.a behavior = ((CoordinatorLayout.b) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f28862m + this.f90563h;
                if (this.f90564i == 0) {
                    iClamp = 0;
                } else {
                    float fD = d(view2);
                    int i10 = this.f90564i;
                    iClamp = r3.a.clamp((int) (fD * i10), 0, i10);
                }
                z1.offsetTopAndBottom(view, bottom - iClamp);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.d(appBarLayout.e(view), !appBarLayout.f28846k);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                z1.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // wf.i, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.onLayoutChild(coordinatorLayout, view, i10);
        }

        @Override // wf.h, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.onMeasureChild(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = dependencies.get(i10);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i10++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f90561f;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.setExpanded(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z10) {
            super.setHorizontalOffsetEnabled(z10);
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i10) {
            return super.setLeftAndRightOffset(i10);
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i10) {
            return super.setTopAndBottomOffset(i10);
        }

        @Override // wf.i
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z10) {
            super.setVerticalOffsetEnabled(z10);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.H);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract void onOffsetChanged(AppBarLayout appBarLayout, View view, float f10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f28873a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f28874b = new Rect();

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public void onOffsetChanged(AppBarLayout appBarLayout, View view, float f10) {
            Rect rect = this.f28873a;
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
            float fAbs = rect.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fClamp = 1.0f - r3.a.clamp(Math.abs(fAbs / rect.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (fClamp * fClamp)));
            view.setTranslationY(fHeight);
            Rect rect2 = this.f28874b;
            view.getDrawingRect(rect2);
            rect2.offset(0, (int) (-fHeight));
            if (fHeight >= rect2.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(rect2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class d {
        public abstract void onUpdate(float f10, int i10, float f11);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public static c a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Deprecated
    public void addLiftOnScrollListener(wf.d dVar) {
        this.f28855t.add(dVar);
    }

    public void addLiftOnScrollProgressListener(d dVar) {
        this.f28856u.add(dVar);
    }

    public void addOnOffsetChangedListener(wf.c cVar) {
        if (this.f28845j == null) {
            this.f28845j = new ArrayList();
        }
        if (cVar == null || this.f28845j.contains(cVar)) {
            return;
        }
        this.f28845j.add(cVar);
    }

    public final void b() {
        Behavior behavior = this.C;
        BaseBehavior.SavedState savedStateL = (behavior == null || this.f28839c == -1 || this.f28843h != 0) ? null : behavior.l(AbsSavedState.f5785c, this);
        this.f28839c = -1;
        this.f28840e = -1;
        this.f28841f = -1;
        if (savedStateL != null) {
            Behavior behavior2 = this.C;
            if (behavior2.f28865p != null) {
                return;
            }
            behavior2.f28865p = savedStateL;
        }
    }

    public final void c(int i10) {
        this.f28838b = i10;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f28845j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f28845j.get(i11) != null) {
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Deprecated
    public void clearLiftOnScrollListener() {
        this.f28855t.clear();
    }

    public void clearLiftOnScrollProgressListener() {
        this.f28856u.clear();
    }

    public final boolean d(boolean z10, boolean z11) {
        if (!z11 || this.f28848m == z10) {
            return false;
        }
        this.f28848m = z10;
        refreshDrawableState();
        if (!(getBackground() instanceof j)) {
            return true;
        }
        if (this.f28850o != null) {
            f(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f28849n) {
            return true;
        }
        float f10 = this.B;
        f(z10 ? 0.0f : f10, z10 ? f10 : 0.0f);
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f28861z == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f28838b);
        this.f28861z.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f28861z;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i10;
        if (this.f28852q == null && (i10 = this.f28851p) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f28851p);
            }
            if (viewFindViewById != null) {
                this.f28852q = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f28852q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void f(float f10, float f11) {
        ValueAnimator valueAnimator = this.f28853r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f28853r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f28857v);
        this.f28853r.setInterpolator(this.f28858w);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f28854s;
        if (animatorUpdateListener != null) {
            this.f28853r.addUpdateListener(animatorUpdateListener);
        }
        this.f28853r.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        Behavior behavior = new Behavior();
        this.C = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f28840e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f28875a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i12 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i13 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = minimumHeight + i13;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f28840e = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f28841f;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = cVar.f28875a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f28841f = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f28851p;
    }

    public j getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof j) {
            return (j) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i10 = (minimumHeight * 2) + topInset;
            return i10 < getHeight() ? i10 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i11 = (minimumHeight2 * 2) + topInset;
        return i11 < getHeight() ? i11 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f28843h;
    }

    public Drawable getStatusBarForeground() {
        return this.f28861z;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        e3 e3Var = this.f28844i;
        if (e3Var != null) {
            return e3Var.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f28839c;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f28875a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f28839c = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean isLiftOnScroll() {
        return this.f28849n;
    }

    public boolean isLifted() {
        return this.f28848m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f28859x == null) {
            this.f28859x = new int[4];
        }
        int[] iArr = this.f28859x;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f28847l;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969875;
        iArr[1] = (z10 && this.f28848m) ? R.attr.state_lifted : -2130969876;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969871;
        iArr[3] = (z10 && this.f28848m) ? R.attr.state_collapsed : -2130969870;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f28852q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f28852q = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    z1.offsetTopAndBottom(getChildAt(childCount), topInset);
                }
            }
        }
        b();
        this.f28842g = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((c) getChildAt(i14).getLayoutParams()).getScrollInterpolator() != null) {
                this.f28842g = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f28861z;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f28846k) {
            return;
        }
        if (!this.f28849n) {
            int childCount3 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount3) {
                    z11 = false;
                    break;
                }
                int i16 = ((c) getChildAt(i15).getLayoutParams()).f28875a;
                if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (this.f28847l != z11) {
            this.f28847l = z11;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = r3.a.clamp(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    @Deprecated
    public boolean removeLiftOnScrollListener(wf.d dVar) {
        return this.f28855t.remove(dVar);
    }

    public boolean removeLiftOnScrollProgressListener(d dVar) {
        return this.f28856u.remove(dVar);
    }

    public void removeOnOffsetChangedListener(wf.c cVar) {
        ArrayList arrayList = this.f28845j;
        if (arrayList == null || cVar == null) {
            return;
        }
        arrayList.remove(cVar);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final j jVar;
        Context context = getContext();
        if (drawable instanceof j) {
            jVar = (j) drawable;
        } else {
            ColorStateList colorStateListOrNull = mg.c.getColorStateListOrNull(drawable);
            if (colorStateListOrNull == null) {
                jVar = null;
            } else {
                j jVar2 = new j();
                jVar2.setFillColor(colorStateListOrNull);
                jVar = jVar2;
            }
        }
        if (jVar != null && jVar.getFillColor() != null) {
            this.f28860y = jVar.getFillColor().getDefaultColor();
            final ColorStateList colorStateList = this.f28850o;
            if (colorStateList != null) {
                final Integer colorOrNull = jg.b.getColorOrNull(getContext(), R.attr.colorSurface);
                this.f28854s = new ValueAnimator.AnimatorUpdateListener() { // from class: wf.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.f90546a;
                        LinkedHashSet linkedHashSet = appBarLayout.f28856u;
                        ArrayList arrayList = appBarLayout.f28855t;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int iLayer = jg.b.layer(appBarLayout.f28860y, colorStateList.getDefaultColor(), fFloatValue);
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iLayer);
                        yg.j jVar3 = jVar;
                        jVar3.setFillColor(colorStateListValueOf);
                        if (appBarLayout.f28861z != null && (num = appBarLayout.A) != null && num.equals(colorOrNull)) {
                            appBarLayout.f28861z.setTint(iLayer);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    throw new ClassCastException();
                                }
                                if (jVar3.getFillColor() != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            ((AppBarLayout.d) it2.next()).onUpdate(0.0f, iLayer, fFloatValue);
                        }
                    }
                };
            } else {
                jVar.initializeElevationOverlay(context);
                this.f28854s = new k(1, this, jVar);
            }
            drawable = jVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m.setElevation(this, f10);
    }

    public void setExpanded(boolean z10) {
        setExpanded(z10, isLaidOut());
    }

    public void setLiftOnScroll(boolean z10) {
        this.f28849n = z10;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f28850o != colorStateList) {
            this.f28850o = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f28851p = -1;
        if (view != null) {
            this.f28852q = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f28852q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f28852q = null;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f28851p = i10;
        WeakReference weakReference = this.f28852q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f28852q = null;
    }

    public boolean setLiftable(boolean z10) {
        this.f28846k = true;
        if (this.f28847l == z10) {
            return false;
        }
        this.f28847l = z10;
        refreshDrawableState();
        return true;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f28846k = z10;
    }

    public boolean setLifted(boolean z10) {
        return d(z10, true);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException(zAQQWzBxnS.pDkjTWYzlgsYt);
        }
        super.setOrientation(i10);
    }

    public void setPendingAction(int i10) {
        this.f28843h = i10;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f28861z;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f28861z = drawableMutate;
            if (drawableMutate instanceof j) {
                numValueOf = Integer.valueOf(((j) drawableMutate).getResolvedTintColor());
            } else {
                ColorStateList colorStateListOrNull = mg.c.getColorStateListOrNull(drawableMutate);
                if (colorStateListOrNull != null) {
                    numValueOf = Integer.valueOf(colorStateListOrNull.getDefaultColor());
                }
            }
            this.A = numValueOf;
            Drawable drawable3 = this.f28861z;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f28861z.setState(getDrawableState());
                }
                p3.a.setLayoutDirection(this.f28861z, getLayoutDirection());
                this.f28861z.setVisible(getVisibility() == 0, false);
                this.f28861z.setCallback(this);
            }
            if (this.f28861z != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(l.a.getDrawable(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        wf.k.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f28861z;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f28861z;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f28875a;

        /* renamed from: b, reason: collision with root package name */
        public a f28876b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f28877c;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28875a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.f88454b);
            this.f28875a = typedArrayObtainStyledAttributes.getInt(1, 0);
            setScrollEffect(typedArrayObtainStyledAttributes.getInt(0, 0));
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.f28877c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public a getScrollEffect() {
            return this.f28876b;
        }

        public int getScrollFlags() {
            return this.f28875a;
        }

        public Interpolator getScrollInterpolator() {
            return this.f28877c;
        }

        public void setScrollEffect(int i10) {
            this.f28876b = i10 != 1 ? null : new b();
        }

        public void setScrollFlags(int i10) {
            this.f28875a = i10;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.f28877c = interpolator;
        }

        public void setScrollEffect(a aVar) {
            this.f28876b = aVar;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f28875a = 1;
        }

        public c(int i10, int i11, float f10) {
            super(i10, i11, f10);
            this.f28875a = 1;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f28875a = 1;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f28875a = 1;
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f28875a = 1;
        }

        public c(c cVar) {
            super((LinearLayout.LayoutParams) cVar);
            this.f28875a = 1;
            this.f28875a = cVar.f28875a;
            this.f28876b = cVar.f28876b;
            this.f28877c = cVar.f28877c;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public void setExpanded(boolean z10, boolean z11) {
        this.f28843h = (z10 ? 1 : 2) | (z11 ? 4 : 0) | 8;
        requestLayout();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_Design_AppBarLayout), attributeSet, i10);
        this.f28839c = -1;
        this.f28840e = -1;
        this.f28841f = -1;
        this.f28843h = 0;
        this.f28855t = new ArrayList();
        this.f28856u = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context3, attributeSet, wf.k.f90575a, i10, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = j0.obtainStyledAttributes(context2, attributeSet, uf.a.f88453a, i10, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.f28850o = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes2, 6);
            this.f28857v = o.resolveThemeDuration(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f28858w = o.resolveThemeInterpolator(context2, R.attr.motionEasingStandardInterpolator, vf.a.f89240a);
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                this.f28843h = typedArrayObtainStyledAttributes2.getBoolean(4, false) ? 1 : 2;
                requestLayout();
            }
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                wf.k.a(this, typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayObtainStyledAttributes2.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayObtainStyledAttributes2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayObtainStyledAttributes2.getBoolean(2, false));
                }
                if (typedArrayObtainStyledAttributes2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes2.getBoolean(1, false));
                }
            }
            this.B = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f28849n = typedArrayObtainStyledAttributes2.getBoolean(5, false);
            this.f28851p = typedArrayObtainStyledAttributes2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayObtainStyledAttributes2.getDrawable(8));
            typedArrayObtainStyledAttributes2.recycle();
            z1.setOnApplyWindowInsetsListener(this, new wf.b(this));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void removeOnOffsetChangedListener(e eVar) {
        removeOnOffsetChangedListener((wf.c) eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public void addOnOffsetChangedListener(e eVar) {
        addOnOffsetChangedListener((wf.c) eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.app.NotificationCompat;
import com.digidust.elokence.akinator.freemium.R;
import p.z;
import q.h1;
import q.i1;
import x3.e3;
import x3.m0;
import x3.n0;
import x3.o0;
import x3.p0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements h1, o0, m0, n0 {
    public static final int[] E = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final e3 F = new e3.a().setSystemWindowInsets(o3.c.of(0, 1, 0, 1)).build();
    public static final Rect G = new Rect();
    public final q.i A;
    public final q.j B;
    public final p0 C;
    public final q.l D;

    /* renamed from: b, reason: collision with root package name */
    public int f4954b;

    /* renamed from: c, reason: collision with root package name */
    public int f4955c;

    /* renamed from: e, reason: collision with root package name */
    public ContentFrameLayout f4956e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f4957f;

    /* renamed from: g, reason: collision with root package name */
    public i1 f4958g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f4959h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4960i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4961j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4962k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4963l;

    /* renamed from: m, reason: collision with root package name */
    public int f4964m;

    /* renamed from: n, reason: collision with root package name */
    public int f4965n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4966o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f4967p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f4968q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f4969r;

    /* renamed from: s, reason: collision with root package name */
    public e3 f4970s;

    /* renamed from: t, reason: collision with root package name */
    public e3 f4971t;

    /* renamed from: u, reason: collision with root package name */
    public e3 f4972u;

    /* renamed from: v, reason: collision with root package name */
    public e3 f4973v;

    /* renamed from: w, reason: collision with root package name */
    public q.k f4974w;

    /* renamed from: x, reason: collision with root package name */
    public OverScroller f4975x;

    /* renamed from: y, reason: collision with root package name */
    public ViewPropertyAnimator f4976y;

    /* renamed from: z, reason: collision with root package name */
    public final q.h f4977z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends ViewGroup.MarginLayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public static boolean a(View view, Rect rect, boolean z10) {
        boolean z11;
        a aVar = (a) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    public final void b() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        ViewPropertyAnimator viewPropertyAnimator = this.f4976y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(E);
        this.f4954b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f4959h = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f4975x = new OverScroller(context);
    }

    @Override // q.h1
    public boolean canShowOverflowMenu() {
        d();
        return this.f4958g.canShowOverflowMenu();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d() {
        i1 wrapper;
        if (this.f4956e == null) {
            this.f4956e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f4957f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof i1) {
                wrapper = (i1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f4958g = wrapper;
        }
    }

    @Override // q.h1
    public void dismissPopups() {
        d();
        this.f4958g.dismissPopupMenus();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f4959h != null) {
            if (this.f4957f.getVisibility() == 0) {
                translationY = (int) (this.f4957f.getTranslationY() + this.f4957f.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f4959h.setBounds(0, translationY, getWidth(), this.f4959h.getIntrinsicHeight() + translationY);
            this.f4959h.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4957f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, x3.o0, x3.m0, x3.n0
    public int getNestedScrollAxes() {
        return this.C.getNestedScrollAxes();
    }

    @Override // q.h1
    public CharSequence getTitle() {
        d();
        return this.f4958g.getTitle();
    }

    @Override // q.h1
    public boolean hasIcon() {
        d();
        return this.f4958g.hasIcon();
    }

    @Override // q.h1
    public boolean hasLogo() {
        d();
        return this.f4958g.hasLogo();
    }

    @Override // q.h1
    public boolean hideOverflowMenu() {
        d();
        return this.f4958g.hideOverflowMenu();
    }

    @Override // q.h1
    public void initFeature(int i10) {
        d();
        if (i10 == 2) {
            this.f4958g.initProgress();
        } else if (i10 == 5) {
            this.f4958g.initIndeterminateProgress();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.f4962k;
    }

    public boolean isInOverlayMode() {
        return this.f4960i;
    }

    @Override // q.h1
    public boolean isOverflowMenuShowPending() {
        d();
        return this.f4958g.isOverflowMenuShowPending();
    }

    @Override // q.h1
    public boolean isOverflowMenuShowing() {
        d();
        return this.f4958g.isOverflowMenuShowing();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        d();
        e3 windowInsetsCompat = e3.toWindowInsetsCompat(windowInsets, this);
        boolean zA = a(this.f4957f, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), false);
        Rect rect = this.f4966o;
        z1.computeSystemWindowInsets(this, windowInsetsCompat, rect);
        e3 e3VarInset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.f4970s = e3VarInset;
        boolean z10 = true;
        if (!this.f4971t.equals(e3VarInset)) {
            this.f4971t = this.f4970s;
            zA = true;
        }
        Rect rect2 = this.f4967p;
        if (rect2.equals(rect)) {
            z10 = zA;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        z1.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.o0, x3.m0, x3.n0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f4962k || !z10) {
            return false;
        }
        this.f4975x.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4975x.getFinalY() > this.f4957f.getHeight()) {
            b();
            this.B.run();
        } else {
            b();
            this.A.run();
        }
        this.f4963l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.o0, x3.m0, x3.n0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.o0, x3.m0, x3.n0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // x3.m0, x3.n0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // x3.m0, x3.n0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // x3.m0, x3.n0
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        d();
        int i11 = this.f4965n ^ i10;
        this.f4965n = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        q.k kVar = this.f4974w;
        if (kVar != null) {
            kVar.enableContentAnimations(!z11);
            if (z10 || !z11) {
                this.f4974w.showForSystem();
            } else {
                this.f4974w.hideForSystem();
            }
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 || this.f4974w == null) {
            return;
        }
        z1.requestApplyInsets(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f4955c = i10;
        q.k kVar = this.f4974w;
        if (kVar != null) {
            kVar.onWindowVisibilityChanged(i10);
        }
    }

    @Override // q.h1
    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        d();
        this.f4958g.restoreHierarchyState(sparseArray);
    }

    @Override // q.h1
    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        d();
        this.f4958g.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i10) {
        b();
        this.f4957f.setTranslationY(-Math.max(0, Math.min(i10, this.f4957f.getHeight())));
    }

    public void setActionBarVisibilityCallback(q.k kVar) {
        this.f4974w = kVar;
        if (getWindowToken() != null) {
            this.f4974w.onWindowVisibilityChanged(this.f4955c);
            int i10 = this.f4965n;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                z1.requestApplyInsets(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f4961j = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f4962k) {
            this.f4962k = z10;
            if (z10) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    @Override // q.h1
    public void setIcon(int i10) {
        d();
        this.f4958g.setIcon(i10);
    }

    @Override // q.h1
    public void setLogo(int i10) {
        d();
        this.f4958g.setLogo(i10);
    }

    @Override // q.h1
    public void setMenu(Menu menu, z zVar) {
        d();
        this.f4958g.setMenu(menu, zVar);
    }

    @Override // q.h1
    public void setMenuPrepared() {
        d();
        this.f4958g.setMenuPrepared();
    }

    public void setOverlayMode(boolean z10) {
        this.f4960i = z10;
    }

    @Override // q.h1
    public void setWindowCallback(Window.Callback callback) {
        d();
        this.f4958g.setWindowCallback(callback);
    }

    @Override // q.h1
    public void setWindowTitle(CharSequence charSequence) {
        d();
        this.f4958g.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // q.h1
    public boolean showOverflowMenu() {
        d();
        return this.f4958g.showOverflowMenu();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4955c = 0;
        this.f4966o = new Rect();
        this.f4967p = new Rect();
        this.f4968q = new Rect();
        this.f4969r = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        e3 e3Var = e3.f91568b;
        this.f4970s = e3Var;
        this.f4971t = e3Var;
        this.f4972u = e3Var;
        this.f4973v = e3Var;
        this.f4977z = new q.h(this);
        this.A = new q.i(this);
        this.B = new q.j(this);
        c(context);
        this.C = new p0(this);
        q.l lVar = new q.l(context);
        lVar.setWillNotDraw(true);
        this.D = lVar;
        addView(lVar);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // x3.m0, x3.n0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // x3.m0, x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.o0, x3.m0, x3.n0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.C.onNestedScrollAccepted(view, view2, i10);
        this.f4964m = getActionBarHideOffset();
        b();
        q.k kVar = this.f4974w;
        if (kVar != null) {
            kVar.onContentScrollStarted();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.o0, x3.m0, x3.n0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f4957f.getVisibility() != 0) {
            return false;
        }
        return this.f4962k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.o0, x3.m0, x3.n0
    public void onStopNestedScroll(View view) {
        if (this.f4962k && !this.f4963l) {
            if (this.f4964m <= this.f4957f.getHeight()) {
                b();
                postDelayed(this.A, 600L);
            } else {
                b();
                postDelayed(this.B, 600L);
            }
        }
        q.k kVar = this.f4974w;
        if (kVar != null) {
            kVar.onContentScrollStopped();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.o0, x3.m0, x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f4964m + i11;
        this.f4964m = i14;
        setActionBarHideOffset(i14);
    }

    @Override // q.h1
    public void setIcon(Drawable drawable) {
        d();
        this.f4958g.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    @Override // q.h1
    public void setUiOptions(int i10) {
    }
}

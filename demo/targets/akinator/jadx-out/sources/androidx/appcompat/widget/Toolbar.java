package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.Iterator;
import p.z;
import q.f4;
import q.i1;
import q.n3;
import q.o3;
import q.p3;
import q.q3;
import q.r2;
import q.r3;
import q.s3;
import q.t3;
import q.u3;
import q.y3;
import x3.a0;
import x3.c0;
import x3.g0;
import x3.u;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements a0 {
    public CharSequence A;
    public ColorStateList B;
    public ColorStateList C;
    public boolean D;
    public boolean E;
    public final ArrayList F;
    public final ArrayList G;
    public final int[] H;
    public final c0 I;
    public ArrayList J;
    public u3 K;
    public final p3 L;
    public s M;
    public ActionMenuPresenter N;
    public q O;
    public z P;
    public p.k Q;
    public boolean R;
    public OnBackInvokedCallback S;
    public OnBackInvokedDispatcher T;
    public boolean U;
    public final q3 V;

    /* renamed from: b, reason: collision with root package name */
    public ActionMenuView f5110b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f5111c;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatTextView f5112e;

    /* renamed from: f, reason: collision with root package name */
    public AppCompatImageButton f5113f;

    /* renamed from: g, reason: collision with root package name */
    public AppCompatImageView f5114g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f5115h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f5116i;

    /* renamed from: j, reason: collision with root package name */
    public AppCompatImageButton f5117j;

    /* renamed from: k, reason: collision with root package name */
    public View f5118k;

    /* renamed from: l, reason: collision with root package name */
    public Context f5119l;

    /* renamed from: m, reason: collision with root package name */
    public int f5120m;

    /* renamed from: n, reason: collision with root package name */
    public int f5121n;

    /* renamed from: o, reason: collision with root package name */
    public int f5122o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5123p;

    /* renamed from: q, reason: collision with root package name */
    public final int f5124q;

    /* renamed from: r, reason: collision with root package name */
    public int f5125r;

    /* renamed from: s, reason: collision with root package name */
    public int f5126s;

    /* renamed from: t, reason: collision with root package name */
    public int f5127t;

    /* renamed from: u, reason: collision with root package name */
    public int f5128u;

    /* renamed from: v, reason: collision with root package name */
    public r2 f5129v;

    /* renamed from: w, reason: collision with root package name */
    public int f5130w;

    /* renamed from: x, reason: collision with root package name */
    public int f5131x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5132y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f5133z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new r();

        /* renamed from: e, reason: collision with root package name */
        public int f5134e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5135f;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5134e);
            parcel.writeInt(this.f5135f ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5134e = parcel.readInt();
            this.f5135f = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new o.h(getContext());
    }

    public static a h() {
        return new a(-2, -2);
    }

    public static a i(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof a.C0002a ? new a((a.C0002a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = u.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.f5136b == 0 && r(childAt)) {
                    int i12 = aVar.f4717a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = u.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            a aVar2 = (a) childAt2.getLayoutParams();
            if (aVar2.f5136b == 0 && r(childAt2)) {
                int i14 = aVar2.f4717a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = u.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // x3.a0
    public void addMenuProvider(g0 g0Var) {
        this.I.addMenuProvider(g0Var);
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a aVarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (a) layoutParams;
        aVarH.f5136b = 1;
        if (!z10 || this.f5118k == null) {
            addView(view, aVarH);
        } else {
            view.setLayoutParams(aVarH);
            this.G.add(view);
        }
    }

    public final void c() {
        if (this.f5117j == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f5117j = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f5115h);
            this.f5117j.setContentDescription(this.f5116i);
            a aVarH = h();
            aVarH.f4717a = (this.f5123p & 112) | 8388611;
            aVarH.f5136b = 2;
            this.f5117j.setLayoutParams(aVarH);
            this.f5117j.setOnClickListener(new s3(this));
        }
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f5110b) != null && actionMenuView.isOverflowReserved();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a);
    }

    public void collapseActionView() {
        q qVar = this.O;
        p.q qVar2 = qVar == null ? null : qVar.f5172c;
        if (qVar2 != null) {
            qVar2.collapseActionView();
        }
    }

    public final void d() {
        if (this.f5129v == null) {
            r2 r2Var = new r2();
            r2Var.f82220a = 0;
            r2Var.f82221b = 0;
            r2Var.f82222c = Integer.MIN_VALUE;
            r2Var.f82223d = Integer.MIN_VALUE;
            r2Var.f82224e = 0;
            r2Var.f82225f = 0;
            r2Var.f82226g = false;
            r2Var.f82227h = false;
            this.f5129v = r2Var;
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.f5110b;
        if (actionMenuView != null) {
            actionMenuView.dismissPopupMenus();
        }
    }

    public final void e() {
        f();
        if (this.f5110b.peekMenu() == null) {
            p.m mVar = (p.m) this.f5110b.getMenu();
            if (this.O == null) {
                this.O = new q(this);
            }
            this.f5110b.setExpandedActionViewsExclusive(true);
            mVar.addMenuPresenter(this.O, this.f5119l);
            s();
        }
    }

    public final void f() {
        if (this.f5110b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f5110b = actionMenuView;
            actionMenuView.setPopupTheme(this.f5120m);
            this.f5110b.setOnMenuItemClickListener(this.L);
            this.f5110b.setMenuCallbacks(this.P, new r3(this));
            a aVarH = h();
            aVarH.f4717a = (this.f5123p & 112) | 8388613;
            this.f5110b.setLayoutParams(aVarH);
            b(this.f5110b, false);
        }
    }

    public final void g() {
        if (this.f5113f == null) {
            this.f5113f = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            a aVarH = h();
            aVarH.f4717a = (this.f5123p & 112) | 8388611;
            this.f5113f.setLayoutParams(aVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f5117j;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f5117j;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        r2 r2Var = this.f5129v;
        if (r2Var != null) {
            return r2Var.getEnd();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f5131x;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        r2 r2Var = this.f5129v;
        if (r2Var != null) {
            return r2Var.getLeft();
        }
        return 0;
    }

    public int getContentInsetRight() {
        r2 r2Var = this.f5129v;
        if (r2Var != null) {
            return r2Var.getRight();
        }
        return 0;
    }

    public int getContentInsetStart() {
        r2 r2Var = this.f5129v;
        if (r2Var != null) {
            return r2Var.getStart();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f5130w;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        p.m mVarPeekMenu;
        ActionMenuView actionMenuView = this.f5110b;
        return (actionMenuView == null || (mVarPeekMenu = actionMenuView.peekMenu()) == null || !mVarPeekMenu.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f5131x, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f5130w, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f5114g;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f5114g;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f5110b.getMenu();
    }

    public View getNavButtonView() {
        return this.f5113f;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f5113f;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f5113f;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.N;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f5110b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f5119l;
    }

    public int getPopupTheme() {
        return this.f5120m;
    }

    public CharSequence getSubtitle() {
        return this.A;
    }

    public final TextView getSubtitleTextView() {
        return this.f5112e;
    }

    public CharSequence getTitle() {
        return this.f5133z;
    }

    public int getTitleMarginBottom() {
        return this.f5128u;
    }

    public int getTitleMarginEnd() {
        return this.f5126s;
    }

    public int getTitleMarginStart() {
        return this.f5125r;
    }

    public int getTitleMarginTop() {
        return this.f5127t;
    }

    public final TextView getTitleTextView() {
        return this.f5111c;
    }

    public i1 getWrapper() {
        if (this.M == null) {
            this.M = new s(this, true);
        }
        return this.M;
    }

    public boolean hasExpandedActionView() {
        q qVar = this.O;
        return (qVar == null || qVar.f5172c == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.f5110b;
        return actionMenuView != null && actionMenuView.hideOverflowMenu();
    }

    public void inflateMenu(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    @Override // x3.a0
    public void invalidateMenu() {
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.I.onCreateMenu(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.J = currentMenuItems2;
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.U;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.f5110b;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.f5110b;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowing();
    }

    public boolean isTitleTruncated() {
        Layout layout;
        AppCompatTextView appCompatTextView = this.f5111c;
        if (appCompatTextView != null && (layout = appCompatTextView.getLayout()) != null) {
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                if (layout.getEllipsisCount(i10) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int j(int i10, View view) {
        a aVar = (a) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = aVar.f4717a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f5132y & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.G.contains(view);
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        a aVar = (a) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iJ = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + iMax;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        a aVar = (a) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iJ = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
        s();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.E = false;
        }
        if (!this.E) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.E = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.E = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028d A[LOOP:0: B:102:0x028b->B:103:0x028d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a5 A[LOOP:1: B:105:0x02a3->B:106:0x02a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c5 A[LOOP:2: B:108:0x02c3->B:109:0x02c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0318 A[LOOP:3: B:117:0x0316->B:118:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0216  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zIsLayoutRtl = f4.isLayoutRtl(this);
        int i12 = !zIsLayoutRtl ? 1 : 0;
        int i13 = 0;
        if (r(this.f5113f)) {
            q(this.f5113f, i10, 0, i11, this.f5124q);
            iK = k(this.f5113f) + this.f5113f.getMeasuredWidth();
            iMax = Math.max(0, l(this.f5113f) + this.f5113f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f5113f.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (r(this.f5117j)) {
            q(this.f5117j, i10, 0, i11, this.f5124q);
            iK = k(this.f5117j) + this.f5117j.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f5117j) + this.f5117j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5117j.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.H;
        iArr[zIsLayoutRtl ? 1 : 0] = iMax4;
        if (r(this.f5110b)) {
            q(this.f5110b, i10, iMax3, i11, this.f5124q);
            iK2 = k(this.f5110b) + this.f5110b.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f5110b) + this.f5110b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5110b.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[i12] = Math.max(0, currentContentInsetEnd - iK2);
        if (r(this.f5118k)) {
            iMax5 += p(this.f5118k, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f5118k) + this.f5118k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5118k.getMeasuredState());
        }
        if (r(this.f5114g)) {
            iMax5 += p(this.f5114g, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f5114g) + this.f5114g.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5114g.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((a) childAt.getLayoutParams()).f5136b == 0 && r(childAt)) {
                iMax5 += p(childAt, i10, iMax5, i11, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i15 = iMax5;
        int i16 = this.f5127t + this.f5128u;
        int i17 = this.f5125r + this.f5126s;
        if (r(this.f5111c)) {
            p(this.f5111c, i10, i15 + i17, i11, i16, iArr);
            int iK3 = k(this.f5111c) + this.f5111c.getMeasuredWidth();
            iL = l(this.f5111c) + this.f5111c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f5111c.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (r(this.f5112e)) {
            iMax2 = Math.max(iMax2, p(this.f5112e, i10, i15 + i17, i11, i16 + iL, iArr));
            iL += l(this.f5112e) + this.f5112e.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f5112e.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i15 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.R) {
            i13 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            View childAt2 = getChildAt(i18);
            if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i13 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i13);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.f5110b;
        p.m mVarPeekMenu = actionMenuView != null ? actionMenuView.peekMenu() : null;
        int i10 = savedState.f5134e;
        if (i10 != 0 && this.O != null && mVarPeekMenu != null && (menuItemFindItem = mVarPeekMenu.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f5135f) {
            q3 q3Var = this.V;
            removeCallbacks(q3Var);
            post(q3Var);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        this.f5129v.setDirection(i10 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        p.q qVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        q qVar2 = this.O;
        if (qVar2 != null && (qVar = qVar2.f5172c) != null) {
            savedState.f5134e = qVar.getItemId();
        }
        savedState.f5135f = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.D = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.D = false;
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // x3.a0
    public void removeMenuProvider(g0 g0Var) {
        this.I.removeMenuProvider(g0Var);
    }

    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = t3.a(this);
            boolean z10 = hasExpandedActionView() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.U;
            if (z10 && this.T == null) {
                if (this.S == null) {
                    this.S = t3.b(new o3(this, 0));
                }
                t3.c(onBackInvokedDispatcherA, this.S);
                this.T = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.T) == null) {
                return;
            }
            t3.d(onBackInvokedDispatcher, this.S);
            this.T = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            s();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(l.a.getDrawable(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.R = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f5131x) {
            this.f5131x = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f5130w) {
            this.f5130w = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i10, int i11) {
        d();
        this.f5129v.setAbsolute(i10, i11);
    }

    public void setContentInsetsRelative(int i10, int i11) {
        d();
        this.f5129v.setRelative(i10, i11);
    }

    public void setLogo(int i10) {
        setLogo(l.a.getDrawable(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setMenu(p.m mVar, ActionMenuPresenter actionMenuPresenter) {
        if (mVar == null && this.f5110b == null) {
            return;
        }
        f();
        p.m mVarPeekMenu = this.f5110b.peekMenu();
        if (mVarPeekMenu == mVar) {
            return;
        }
        if (mVarPeekMenu != null) {
            mVarPeekMenu.removeMenuPresenter(this.N);
            mVarPeekMenu.removeMenuPresenter(this.O);
        }
        if (this.O == null) {
            this.O = new q(this);
        }
        actionMenuPresenter.setExpandedActionViewsExclusive(true);
        if (mVar != null) {
            mVar.addMenuPresenter(actionMenuPresenter, this.f5119l);
            mVar.addMenuPresenter(this.O, this.f5119l);
        } else {
            actionMenuPresenter.initForMenu(this.f5119l, null);
            this.O.initForMenu(this.f5119l, null);
            actionMenuPresenter.updateMenuView(true);
            this.O.updateMenuView(true);
        }
        this.f5110b.setPopupTheme(this.f5120m);
        this.f5110b.setPresenter(actionMenuPresenter);
        this.N = actionMenuPresenter;
        s();
    }

    public void setMenuCallbacks(z zVar, p.k kVar) {
        this.P = zVar;
        this.Q = kVar;
        ActionMenuView actionMenuView = this.f5110b;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(zVar, kVar);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(l.a.getDrawable(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f5113f.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(u3 u3Var) {
        this.K = u3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f5110b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f5120m != i10) {
            this.f5120m = i10;
            if (i10 == 0) {
                this.f5119l = getContext();
            } else {
                this.f5119l = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextAppearance(Context context, int i10) {
        this.f5122o = i10;
        AppCompatTextView appCompatTextView = this.f5112e;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i10);
        }
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMargin(int i10, int i11, int i12, int i13) {
        this.f5125r = i10;
        this.f5127t = i11;
        this.f5126s = i12;
        this.f5128u = i13;
        requestLayout();
    }

    public void setTitleMarginBottom(int i10) {
        this.f5128u = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f5126s = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f5125r = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f5127t = i10;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i10) {
        this.f5121n = i10;
        AppCompatTextView appCompatTextView = this.f5111c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i10);
        }
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.f5110b;
        return actionMenuView != null && actionMenuView.showOverflowMenu();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends a.C0002a {

        /* renamed from: b, reason: collision with root package name */
        public int f5136b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5136b = 0;
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.f5136b = 0;
            this.f4717a = 8388627;
        }

        public a(int i10, int i11, int i12) {
            super(i10, i11);
            this.f5136b = 0;
            this.f4717a = i12;
        }

        public a(int i10) {
            this(-2, -1, i10);
        }

        public a(a aVar) {
            super((a.C0002a) aVar);
            this.f5136b = 0;
            this.f5136b = aVar.f5136b;
        }

        public a(a.C0002a c0002a) {
            super(c0002a);
            this.f5136b = 0;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5136b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5136b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // x3.a0
    public void addMenuProvider(g0 g0Var, b1 b1Var) {
        this.I.addMenuProvider(g0Var, b1Var);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f5117j;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f5117j.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f5117j;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f5115h);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f5114g == null) {
                this.f5114g = new AppCompatImageView(getContext());
            }
            if (!m(this.f5114g)) {
                b(this.f5114g, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f5114g;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f5114g);
                this.G.remove(this.f5114g);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f5114g;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f5114g == null) {
            this.f5114g = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f5114g;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f5113f;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            y3.setTooltipText(this.f5113f, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!m(this.f5113f)) {
                b(this.f5113f, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f5113f;
            if (appCompatImageButton != null && m(appCompatImageButton)) {
                removeView(this.f5113f);
                this.G.remove(this.f5113f);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f5113f;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f5112e;
            if (appCompatTextView != null && m(appCompatTextView)) {
                removeView(this.f5112e);
                this.G.remove(this.f5112e);
            }
        } else {
            if (this.f5112e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f5112e = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f5112e.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f5122o;
                if (i10 != 0) {
                    this.f5112e.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.f5112e.setTextColor(colorStateList);
                }
            }
            if (!m(this.f5112e)) {
                b(this.f5112e, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f5112e;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        AppCompatTextView appCompatTextView = this.f5112e;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f5111c;
            if (appCompatTextView != null && m(appCompatTextView)) {
                removeView(this.f5111c);
                this.G.remove(this.f5111c);
            }
        } else {
            if (this.f5111c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f5111c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f5111c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f5121n;
                if (i10 != 0) {
                    this.f5111c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f5111c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f5111c)) {
                b(this.f5111c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f5111c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f5133z = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        AppCompatTextView appCompatTextView = this.f5111c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5132y = 8388627;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new int[2];
        this.I = new c0(new o3(this, 1));
        this.J = new ArrayList();
        this.L = new p3(this);
        this.V = new q3(this);
        Context context2 = getContext();
        int[] iArr = k.a.f70002z;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context2, attributeSet, iArr, i10, 0);
        z1.saveAttributeDataForStyleable(this, context, iArr, attributeSet, n3VarObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        this.f5121n = n3VarObtainStyledAttributes.getResourceId(28, 0);
        this.f5122o = n3VarObtainStyledAttributes.getResourceId(19, 0);
        this.f5132y = n3VarObtainStyledAttributes.getInteger(0, 8388627);
        this.f5123p = n3VarObtainStyledAttributes.getInteger(2, 48);
        int dimensionPixelOffset = n3VarObtainStyledAttributes.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = n3VarObtainStyledAttributes.hasValue(27) ? n3VarObtainStyledAttributes.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f5128u = dimensionPixelOffset;
        this.f5127t = dimensionPixelOffset;
        this.f5126s = dimensionPixelOffset;
        this.f5125r = dimensionPixelOffset;
        int dimensionPixelOffset2 = n3VarObtainStyledAttributes.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f5125r = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = n3VarObtainStyledAttributes.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f5126s = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = n3VarObtainStyledAttributes.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f5127t = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = n3VarObtainStyledAttributes.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f5128u = dimensionPixelOffset5;
        }
        this.f5124q = n3VarObtainStyledAttributes.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = n3VarObtainStyledAttributes.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = n3VarObtainStyledAttributes.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = n3VarObtainStyledAttributes.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = n3VarObtainStyledAttributes.getDimensionPixelSize(8, 0);
        d();
        this.f5129v.setAbsolute(dimensionPixelSize, dimensionPixelSize2);
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            this.f5129v.setRelative(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f5130w = n3VarObtainStyledAttributes.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f5131x = n3VarObtainStyledAttributes.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f5115h = n3VarObtainStyledAttributes.getDrawable(4);
        this.f5116i = n3VarObtainStyledAttributes.getText(3);
        CharSequence text = n3VarObtainStyledAttributes.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = n3VarObtainStyledAttributes.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f5119l = getContext();
        setPopupTheme(n3VarObtainStyledAttributes.getResourceId(17, 0));
        Drawable drawable = n3VarObtainStyledAttributes.getDrawable(16);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        CharSequence text3 = n3VarObtainStyledAttributes.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawable2 = n3VarObtainStyledAttributes.getDrawable(11);
        if (drawable2 != null) {
            setLogo(drawable2);
        }
        CharSequence text4 = n3VarObtainStyledAttributes.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (n3VarObtainStyledAttributes.hasValue(29)) {
            setTitleTextColor(n3VarObtainStyledAttributes.getColorStateList(29));
        }
        if (n3VarObtainStyledAttributes.hasValue(20)) {
            setSubtitleTextColor(n3VarObtainStyledAttributes.getColorStateList(20));
        }
        if (n3VarObtainStyledAttributes.hasValue(14)) {
            inflateMenu(n3VarObtainStyledAttributes.getResourceId(14, 0));
        }
        n3VarObtainStyledAttributes.recycle();
    }

    @Override // x3.a0
    public void addMenuProvider(g0 g0Var, b1 b1Var, j0 j0Var) {
        this.I.addMenuProvider(g0Var, b1Var, j0Var);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.LinearLayoutCompat;
import p.c0;
import p.z;
import p0.o2;
import q.f4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements p.l, c0 {

    /* renamed from: b, reason: collision with root package name */
    public p.m f4999b;

    /* renamed from: c, reason: collision with root package name */
    public Context f5000c;

    /* renamed from: e, reason: collision with root package name */
    public int f5001e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5002f;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuPresenter f5003g;

    /* renamed from: h, reason: collision with root package name */
    public z f5004h;

    /* renamed from: i, reason: collision with root package name */
    public p.k f5005i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5006j;

    /* renamed from: k, reason: collision with root package name */
    public int f5007k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5008l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5009m;

    /* renamed from: n, reason: collision with root package name */
    public q.q f5010n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends LinearLayoutCompat.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5011a;

        /* renamed from: b, reason: collision with root package name */
        public int f5012b;

        /* renamed from: c, reason: collision with root package name */
        public int f5013c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5014d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f5015e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5016f;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(a aVar) {
            super((ViewGroup.LayoutParams) aVar);
            this.f5011a = aVar.f5011a;
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.f5011a = false;
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static a a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            a aVar = new a(-2, -2);
            ((LinearLayout.LayoutParams) aVar).gravity = 16;
            return aVar;
        }
        a aVar2 = layoutParams instanceof a ? new a((a) layoutParams) : new a(layoutParams);
        if (((LinearLayout.LayoutParams) aVar2).gravity <= 0) {
            ((LinearLayout.LayoutParams) aVar2).gravity = 16;
        }
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$a r0 = (androidx.appcompat.widget.ActionMenuView.a) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.hasText()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.f5011a
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.f5014d = r1
            r0.f5012b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.c(android.view.View, int, int, int, int):int");
    }

    public final boolean b(int i10) {
        boolean zNeedsDividerAfter = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof q.n)) {
            zNeedsDividerAfter = ((q.n) childAt).needsDividerAfter();
        }
        return (i10 <= 0 || !(childAt2 instanceof q.n)) ? zNeedsDividerAfter : ((q.n) childAt2).needsDividerBefore() | zNeedsDividerAfter;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.f5003g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-2, -2);
        ((LinearLayout.LayoutParams) aVar).gravity = 16;
        return aVar;
    }

    public a generateOverflowButtonLayoutParams() {
        a aVar = new a(-2, -2);
        ((LinearLayout.LayoutParams) aVar).gravity = 16;
        aVar.f5011a = true;
        return aVar;
    }

    public Menu getMenu() {
        if (this.f4999b == null) {
            Context context = getContext();
            p.m mVar = new p.m(context);
            this.f4999b = mVar;
            mVar.setCallback(new q.p(this));
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f5003g = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f5003g;
            z oVar = this.f5004h;
            if (oVar == null) {
                oVar = new q.o();
            }
            actionMenuPresenter2.setCallback(oVar);
            this.f4999b.addMenuPresenter(this.f5003g, this.f5000c);
            this.f5003g.setMenuView(this);
        }
        return this.f4999b;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f5003g.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.f5001e;
    }

    @Override // p.c0
    public int getWindowAnimations() {
        return 0;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.f5003g;
        return actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu();
    }

    @Override // p.c0
    public void initialize(p.m mVar) {
        this.f4999b = mVar;
    }

    @Override // p.l
    public boolean invokeItem(p.q qVar) {
        return this.f4999b.performItemAction(qVar, 0);
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.f5003g;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.f5003g;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing();
    }

    public boolean isOverflowReserved() {
        return this.f5002f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f5003g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.f5003g.isOverflowMenuShowing()) {
                this.f5003g.hideOverflowMenu();
                this.f5003g.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f5006j) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zIsLayoutRtl = f4.isLayoutRtl(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.f5011a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (b(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zIsLayoutRtl) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) aVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar).leftMargin) + ((LinearLayout.LayoutParams) aVar).rightMargin;
                    b(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zIsLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                a aVar2 = (a) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !aVar2.f5011a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) aVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) aVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            a aVar3 = (a) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !aVar3.f5011a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) aVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = o2.c(measuredWidth4, ((LinearLayout.LayoutParams) aVar3).rightMargin, iMax, i27);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        ?? r12;
        p.m mVar;
        boolean z10 = this.f5006j;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f5006j = z11;
        if (z10 != z11) {
            this.f5007k = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f5006j && (mVar = this.f4999b) != null && size != this.f5007k) {
            this.f5007k = size;
            mVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f5006j || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                a aVar = (a) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) aVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f5008l;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z12 = false;
        int i24 = 0;
        long j10 = 0;
        while (true) {
            i12 = this.f5009m;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = i19;
            if (childAt.getVisibility() == 8) {
                i19 = i26;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                a aVar2 = (a) childAt.getLayoutParams();
                aVar2.f5016f = false;
                aVar2.f5013c = 0;
                aVar2.f5012b = 0;
                aVar2.f5014d = false;
                ((LinearLayout.LayoutParams) aVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) aVar2).rightMargin = 0;
                aVar2.f5015e = z13 && ((ActionMenuItemView) childAt).hasText();
                int iC = c(childAt, i21, aVar2.f5011a ? 1 : i26, childMeasureSpec, paddingBottom);
                iMax2 = Math.max(iMax2, iC);
                if (aVar2.f5014d) {
                    i24++;
                }
                if (aVar2.f5011a) {
                    z12 = true;
                }
                i19 = i26 - iC;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iC == 1) {
                    j10 |= 1 << i23;
                }
            }
            i23++;
            size3 = i25;
        }
        int i27 = size3;
        int i28 = i19;
        char c10 = 2;
        boolean z14 = z12 && i22 == 2;
        int i29 = i28;
        boolean z15 = false;
        while (i24 > 0 && i29 > 0) {
            int i30 = Integer.MAX_VALUE;
            long j11 = 0;
            char c11 = c10;
            i15 = iMax;
            int i31 = 0;
            int i32 = 0;
            while (i32 < childCount2) {
                int i33 = i32;
                a aVar3 = (a) getChildAt(i32).getLayoutParams();
                boolean z16 = z14;
                if (aVar3.f5014d) {
                    int i34 = aVar3.f5012b;
                    if (i34 < i30) {
                        j11 = 1 << i33;
                        i30 = i34;
                        i31 = 1;
                    } else if (i34 == i30) {
                        j11 |= 1 << i33;
                        i31++;
                    }
                }
                i32 = i33 + 1;
                z14 = z16;
            }
            boolean z17 = z14;
            j10 |= j11;
            if (i31 > i29) {
                i13 = mode;
                i14 = i17;
                break;
            }
            int i35 = i30 + 1;
            int i36 = 0;
            while (i36 < childCount2) {
                View childAt2 = getChildAt(i36);
                a aVar4 = (a) childAt2.getLayoutParams();
                int i37 = mode;
                int i38 = i17;
                long j12 = 1 << i36;
                if ((j11 & j12) != 0) {
                    if (z17 && aVar4.f5015e) {
                        r12 = 1;
                        r12 = 1;
                        if (i29 == 1) {
                            childAt2.setPadding(i12 + i21, 0, i12, 0);
                        }
                    } else {
                        r12 = 1;
                    }
                    aVar4.f5012b += r12;
                    aVar4.f5016f = r12;
                    i29--;
                } else if (aVar4.f5012b == i35) {
                    j10 |= j12;
                }
                i36++;
                mode = i37;
                i17 = i38;
            }
            c10 = c11;
            iMax = i15;
            z14 = z17;
            z15 = true;
        }
        i13 = mode;
        i14 = i17;
        i15 = iMax;
        boolean z18 = !z12 && i22 == 1;
        if (i29 > 0 && j10 != 0 && (i29 < i22 - 1 || z18 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j10);
            if (!z18) {
                if ((j10 & 1) != 0 && !((a) getChildAt(0).getLayoutParams()).f5015e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j10 & (1 << i39)) != 0 && !((a) getChildAt(i39).getLayoutParams()).f5015e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i29 * i21) / fBitCount) : 0;
            boolean z19 = z15;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j10 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    a aVar5 = (a) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        aVar5.f5013c = i40;
                        aVar5.f5016f = true;
                        if (i41 == 0 && !aVar5.f5015e) {
                            ((LinearLayout.LayoutParams) aVar5).leftMargin = (-i40) / 2;
                        }
                        z19 = true;
                    } else if (aVar5.f5011a) {
                        aVar5.f5013c = i40;
                        aVar5.f5016f = true;
                        ((LinearLayout.LayoutParams) aVar5).rightMargin = (-i40) / 2;
                        z19 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) aVar5).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) aVar5).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z15 = z19;
        }
        if (z15) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                a aVar6 = (a) childAt4.getLayoutParams();
                if (aVar6.f5016f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((aVar6.f5012b * i21) + aVar6.f5013c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, i13 != 1073741824 ? i15 : i27);
    }

    public p.m peekMenu() {
        return this.f4999b;
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f5003g.setExpandedActionViewsExclusive(z10);
    }

    public void setMenuCallbacks(z zVar, p.k kVar) {
        this.f5004h = zVar;
        this.f5005i = kVar;
    }

    public void setOnMenuItemClickListener(q.q qVar) {
        this.f5010n = qVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f5003g.setOverflowIcon(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f5002f = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f5001e != i10) {
            this.f5001e = i10;
            if (i10 == 0) {
                this.f5000c = getContext();
            } else {
                this.f5000c = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f5003g = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.f5003g;
        return actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f5008l = (int) (56.0f * f10);
        this.f5009m = (int) (f10 * 4.0f);
        this.f5000c = context;
        this.f5001e = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.a generateDefaultLayoutParams() {
        a aVar = new a(-2, -2);
        ((LinearLayout.LayoutParams) aVar).gravity = 16;
        return aVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}

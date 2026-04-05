package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import q.f4;
import q.n3;
import x3.m2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ActionBarContextView extends q.c {

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4942k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4943l;

    /* renamed from: m, reason: collision with root package name */
    public View f4944m;

    /* renamed from: n, reason: collision with root package name */
    public View f4945n;

    /* renamed from: o, reason: collision with root package name */
    public View f4946o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f4947p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f4948q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f4949r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4950s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4951t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4952u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4953v;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // q.c
    public /* bridge */ /* synthetic */ void animateToVisibility(int i10) {
        super.animateToVisibility(i10);
    }

    @Override // q.c
    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    public void closeMode() {
        if (this.f4944m == null) {
            killMode();
        }
    }

    @Override // q.c
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    public final void e() {
        if (this.f4947p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4947p = linearLayout;
            this.f4948q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f4949r = (TextView) this.f4947p.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f4950s;
            if (i10 != 0) {
                this.f4948q.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f4951t;
            if (i11 != 0) {
                this.f4949r.setTextAppearance(getContext(), i11);
            }
        }
        this.f4948q.setText(this.f4942k);
        this.f4949r.setText(this.f4943l);
        boolean zIsEmpty = TextUtils.isEmpty(this.f4942k);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f4943l);
        this.f4949r.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f4947p.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f4947p.getParent() == null) {
            addView(this.f4947p);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // q.c
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // q.c
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f4943l;
    }

    public CharSequence getTitle() {
        return this.f4942k;
    }

    @Override // q.c
    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.hideOverflowMenu();
        }
        return false;
    }

    public void initForMode(o.c cVar) {
        View view = this.f4944m;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f4953v, (ViewGroup) this, false);
            this.f4944m = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f4944m);
        }
        View viewFindViewById = this.f4944m.findViewById(R.id.action_mode_close_button);
        this.f4945n = viewFindViewById;
        viewFindViewById.setOnClickListener(new q.g(cVar));
        p.m mVar = (p.m) cVar.getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f82054f = actionMenuPresenter2;
        actionMenuPresenter2.setReserveOverflow(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mVar.addMenuPresenter(this.f82054f, this.f82052c);
        ActionMenuView actionMenuView = (ActionMenuView) this.f82054f.getMenuView(this);
        this.f82053e = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f82053e, layoutParams);
    }

    @Override // q.c
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    @Override // q.c
    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowing();
        }
        return false;
    }

    @Override // q.c
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    public boolean isTitleOptional() {
        return this.f4952u;
    }

    public void killMode() {
        removeAllViews();
        this.f4946o = null;
        this.f82053e = null;
        this.f82054f = null;
        View view = this.f4945n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.hideOverflowMenu();
            this.f82054f.hideSubMenus();
        }
    }

    @Override // q.c, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zIsLayoutRtl = f4.isLayoutRtl(this);
        int paddingRight = zIsLayoutRtl ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4944m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4944m.getLayoutParams();
            int i14 = zIsLayoutRtl ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zIsLayoutRtl ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = zIsLayoutRtl ? paddingRight - i14 : paddingRight + i14;
            int iD = q.c.d(this.f4944m, zIsLayoutRtl, i16, paddingTop, paddingTop2) + i16;
            paddingRight = zIsLayoutRtl ? iD - i15 : iD + i15;
        }
        LinearLayout linearLayout = this.f4947p;
        if (linearLayout != null && this.f4946o == null && linearLayout.getVisibility() != 8) {
            paddingRight += q.c.d(this.f4947p, zIsLayoutRtl, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f4946o;
        if (view2 != null) {
            q.c.d(view2, zIsLayoutRtl, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = zIsLayoutRtl ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f82053e;
        if (actionMenuView != null) {
            q.c.d(actionMenuView, !zIsLayoutRtl, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f82055g;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f4944m;
        if (view != null) {
            int iC = q.c.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4944m.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f82053e;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = q.c.c(this.f82053e, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f4947p;
        if (linearLayout != null && this.f4946o == null) {
            if (this.f4952u) {
                this.f4947p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f4947p.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f4947p.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = q.c.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f4946o;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f4946o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f82055g > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // q.c, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // q.c
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    @Override // q.c
    public void setContentHeight(int i10) {
        this.f82055g = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4946o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4946o = view;
        if (view != null && (linearLayout = this.f4947p) != null) {
            removeView(linearLayout);
            this.f4947p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4943l = charSequence;
        e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4942k = charSequence;
        e();
        z1.setAccessibilityPaneTitle(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f4952u) {
            requestLayout();
        }
        this.f4952u = z10;
    }

    @Override // q.c, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // q.c
    public /* bridge */ /* synthetic */ m2 setupAnimatorToVisibility(int i10, long j10) {
        return super.setupAnimatorToVisibility(i10, j10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // q.c
    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.f82054f;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.showOverflowMenu();
        }
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, k.a.f69980d, i10, 0);
        setBackground(n3VarObtainStyledAttributes.getDrawable(0));
        this.f4950s = n3VarObtainStyledAttributes.getResourceId(5, 0);
        this.f4951t = n3VarObtainStyledAttributes.getResourceId(4, 0);
        this.f82055g = n3VarObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4953v = n3VarObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        n3VarObtainStyledAttributes.recycle();
    }
}

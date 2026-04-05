package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.appbar.AppBarLayout;
import e4.t;
import java.util.Iterator;
import java.util.List;
import on.w;
import qg.j0;
import qg.l0;
import qg.t0;
import qg.x;
import wg.e;
import wg.f;
import yg.j;
import yg.m;
import yg.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class SearchBar extends Toolbar {
    public final TextView W;

    /* renamed from: a0, reason: collision with root package name */
    public final TextView f29304a0;

    /* renamed from: b0, reason: collision with root package name */
    public final FrameLayout f29305b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f29306c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f29307d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ColorStateList f29308e0;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f29309f0;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f29310g0;

    /* renamed from: h0, reason: collision with root package name */
    public final c f29311h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Drawable f29312i0;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f29313j0;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f29314k0;

    /* renamed from: l0, reason: collision with root package name */
    public View f29315l0;

    /* renamed from: m0, reason: collision with root package name */
    public final Integer f29316m0;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f29317n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f29318o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f29319p0;

    /* renamed from: q0, reason: collision with root package name */
    public final j f29320q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f29321r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f29322s0;

    /* renamed from: t0, reason: collision with root package name */
    public ActionMenuView f29323t0;

    /* renamed from: u0, reason: collision with root package name */
    public ImageButton f29324u0;

    /* renamed from: v0, reason: collision with root package name */
    public final wg.a f29325v0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new com.google.android.material.search.a();

        /* renamed from: e, reason: collision with root package name */
        public String f29326e;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f29326e);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29326e = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton navigationIconButton = l0.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z10);
        navigationIconButton.setFocusable(!z10);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.f29317n0 = background;
        }
        navigationIconButton.setBackgroundDrawable(z10 ? null : this.f29317n0);
        t();
    }

    public void addCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f29311h0.f29357c.add(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f29311h0.f29356b.add(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(a aVar) {
        this.f29311h0.f29355a.add(aVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f29309f0 && this.f29315l0 == null && !(view instanceof ActionMenuView)) {
            this.f29315l0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public void clearText() {
        this.W.setText("");
        this.f29304a0.setText("");
    }

    public boolean collapse(View view) {
        return collapse(view, null);
    }

    public boolean expand(View view) {
        return expand(view, null);
    }

    public View getCenterView() {
        return this.f29315l0;
    }

    public float getCompatElevation() {
        j jVar = this.f29320q0;
        return jVar != null ? jVar.getElevation() : getElevation();
    }

    public float getCornerSize() {
        return this.f29320q0.getTopLeftCornerResolvedSize();
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.W.getHint();
    }

    public int getMaxWidth() {
        return this.f29322s0;
    }

    public int getMenuResId() {
        return this.f29318o0;
    }

    public TextView getPlaceholderTextView() {
        return this.f29304a0;
    }

    public int getStrokeColor() {
        return this.f29320q0.getStrokeColor().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f29320q0.getStrokeWidth();
    }

    public CharSequence getText() {
        return this.W.getText();
    }

    public boolean getTextCentered() {
        return this.f29321r0;
    }

    public TextView getTextView() {
        return this.W;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i10) {
        super.inflateMenu(i10);
        this.f29318o0 = i10;
    }

    public boolean isCollapsing() {
        return this.f29311h0.f29361g;
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.f29319p0;
    }

    public boolean isExpanding() {
        return this.f29311h0.f29360f;
    }

    public boolean isLiftOnScroll() {
        return this.f29307d0;
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.f29311h0.f29362h;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws Resources.NotFoundException {
        AppBarLayout appBarLayoutParentIfExists;
        super.onAttachedToWindow();
        m.setParentAbsoluteElevation(this, this.f29320q0);
        if (this.f29310g0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i10 = marginLayoutParams.leftMargin;
            if (i10 == 0) {
                i10 = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i10;
            int i11 = marginLayoutParams.topMargin;
            if (i11 == 0) {
                i11 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i11;
            int i12 = marginLayoutParams.rightMargin;
            if (i12 != 0) {
                dimensionPixelSize = i12;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i13 = marginLayoutParams.bottomMargin;
            if (i13 != 0) {
                dimensionPixelSize2 = i13;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        u();
        if (!this.f29307d0 || (appBarLayoutParentIfExists = getAppBarLayoutParentIfExists()) == null || this.f29308e0 == null) {
            return;
        }
        appBarLayoutParentIfExists.addLiftOnScrollProgressListener(this.f29325v0);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.removeLiftOnScrollProgressListener(this.f29325v0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f29315l0;
        if (view != null && view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i14 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i15 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i14, measuredHeight2, getMeasuredWidth() - measuredWidth2, i15);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i14, i15);
            }
        }
        t();
        TextView textView = this.W;
        if (textView == null || !this.f29321r0) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.f29305b0;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        boolean z11 = getLayoutDirection() == 1;
        if (this.f29323t0 == null) {
            this.f29323t0 = l0.getActionMenuView(this);
        }
        View view2 = this.f29323t0;
        if (this.f29324u0 == null) {
            this.f29324u0 = l0.getNavigationIconButton(this);
        }
        View view3 = this.f29324u0;
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i16 = measuredWidth6 + measuredWidth4;
        int i17 = measuredWidth7 + measuredWidth4;
        View view4 = z11 ? view2 : view3;
        if (z11) {
            view2 = view3;
        }
        int iMax = view4 != null ? Math.max(view4.getRight() - i16, 0) : 0;
        int i18 = i16 + iMax;
        int i19 = i17 + iMax;
        int iMax2 = view2 != null ? Math.max(i19 - view2.getLeft(), 0) : 0;
        int i20 = i18 - iMax2;
        int i21 = i19 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i20, getContentInsetLeft() - i20), 0)) - Math.max(Math.max(i21 - (getMeasuredWidth() - getPaddingRight()), i21 - (getMeasuredWidth() - getContentInsetRight())), 0);
        frameLayout.layout(measuredWidth4 + iMax3, measuredHeight3, measuredWidth5 + iMax3, measuredHeight4);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f29322s0;
        if (i12 >= 0 && i12 < View.MeasureSpec.getSize(i10)) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f29322s0, View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        View view = this.f29315l0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f29326e);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f29326e = text == null ? null : text.toString();
        return savedState;
    }

    public boolean removeCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f29311h0.f29357c.remove(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f29311h0.f29356b.remove(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(a aVar) {
        return this.f29311h0.f29355a.remove(aVar);
    }

    public void setCenterView(View view) {
        View view2 = this.f29315l0;
        if (view2 != null) {
            removeView(view2);
            this.f29315l0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f29319p0 = z10;
        u();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        j jVar = this.f29320q0;
        if (jVar != null) {
            jVar.setElevation(f10);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.W.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f29307d0 = z10;
        wg.a aVar = this.f29325v0;
        if (!z10) {
            AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
            if (appBarLayoutParentIfExists != null) {
                appBarLayoutParentIfExists.removeLiftOnScrollProgressListener(aVar);
                return;
            }
            return;
        }
        AppBarLayout appBarLayoutParentIfExists2 = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists2 == null || this.f29308e0 == null) {
            return;
        }
        appBarLayoutParentIfExists2.addLiftOnScrollProgressListener(aVar);
    }

    public void setMaxWidth(int i10) {
        if (this.f29322s0 != i10) {
            this.f29322s0 = i10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int color;
        if (this.f29313j0 && drawable != null) {
            Integer num = this.f29316m0;
            if (num != null) {
                color = num.intValue();
            } else {
                color = jg.b.getColor(this, drawable == this.f29312i0 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = p3.a.wrap(drawable.mutate());
            drawable.setTint(color);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f29314k0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.f29311h0.f29362h = z10;
    }

    public void setPlaceholderText(String str) {
        this.f29304a0.setText(str);
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f29320q0.setStrokeColor(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f29320q0.setStrokeWidth(f10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.W.setText(charSequence);
        this.f29304a0.setText(charSequence);
    }

    public void setTextCentered(boolean z10) {
        this.f29321r0 = z10;
        TextView textView = this.W;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z10) {
            layoutParams.gravity = 1;
            textView.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            textView.setGravity(0);
        }
        textView.setLayoutParams(layoutParams);
        this.f29304a0.setLayoutParams(layoutParams);
    }

    public void startOnLoadAnimation() {
        post(new w(this, 22));
    }

    public void stopOnLoadAnimation() {
        c cVar = this.f29311h0;
        AnimatorSet animatorSet = cVar.f29358d;
        if (animatorSet != null) {
            animatorSet.end();
        }
        AnimatorSet animatorSet2 = cVar.f29359e;
        if (animatorSet2 != null) {
            animatorSet2.end();
        }
        View centerView = getCenterView();
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }

    public final void t() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z10 = getLayoutDirection() == 1;
        ImageButton navigationIconButton = l0.getNavigationIconButton(this);
        int width = (navigationIconButton == null || !navigationIconButton.isClickable()) ? 0 : z10 ? getWidth() - navigationIconButton.getLeft() : navigationIconButton.getRight();
        ActionMenuView actionMenuView = l0.getActionMenuView(this);
        int right = actionMenuView != null ? z10 ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft() : 0;
        float f10 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f10, 0.0f, -width, 0.0f);
    }

    public final void u() {
        if (getLayoutParams() instanceof AppBarLayout.c) {
            AppBarLayout.c cVar = (AppBarLayout.c) getLayoutParams();
            if (this.f29319p0) {
                if (cVar.getScrollFlags() == 0) {
                    cVar.setScrollFlags(53);
                }
            } else if (cVar.getScrollFlags() == 53) {
                cVar.setScrollFlags(0);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: j, reason: collision with root package name */
        public boolean f29327j;

        public ScrollingViewBehavior() {
            this.f29327j = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean zOnDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.f29327j && (view2 instanceof AppBarLayout)) {
                this.f29327j = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return zOnDependentViewChanged;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29327j = false;
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public boolean collapse(View view, AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    public boolean expand(View view, AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public void setHint(int i10) {
        this.W.setHint(i10);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_Material3_SearchBar), attributeSet, i10);
        this.f29318o0 = -1;
        this.f29325v0 = new wg.a(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable drawable = l.a.getDrawable(context2, getDefaultNavigationIconResource());
        this.f29312i0 = drawable;
        this.f29311h0 = new c();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.I, i10, R.style.Widget_Material3_SearchBar, new int[0]);
        p pVarBuild = p.builder(context2, attributeSet, i10, R.style.Widget_Material3_SearchBar).build();
        int color = typedArrayObtainStyledAttributes.getColor(4, 0);
        this.f29306c0 = color;
        this.f29308e0 = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 11);
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        this.f29310g0 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f29319p0 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f29314k0 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        this.f29313j0 = typedArrayObtainStyledAttributes.getBoolean(16, true);
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.f29316m0 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(12, -1));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        String string2 = typedArrayObtainStyledAttributes.getString(3);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(14, -1.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(13, 0);
        this.f29321r0 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f29307d0 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f29322s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (!z10) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawable);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.f29309f0 = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.W = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.f29304a0 = textView2;
        this.f29305b0 = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            t.setTextAppearance(textView, resourceId);
            t.setTextAppearance(textView2, resourceId);
        }
        setText(string);
        setHint(string2);
        setTextCentered(this.f29321r0);
        j jVar = new j(pVarBuild);
        this.f29320q0 = jVar;
        jVar.initializeElevationOverlay(getContext());
        this.f29320q0.setElevation(dimension);
        if (dimension2 >= 0.0f) {
            this.f29320q0.setStroke(dimension2, color2);
        }
        int color3 = jg.b.getColor(this, R.attr.colorControlHighlight);
        this.f29320q0.setFillColor(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color3);
        j jVar2 = this.f29320q0;
        setBackground(new RippleDrawable(colorStateListValueOf, jVar2, jVar2));
    }

    public boolean collapse(View view, AppBarLayout appBarLayout, boolean z10) {
        AnimatorSet animatorSet;
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        c cVar = this.f29311h0;
        if (cVar.f29360f && (animatorSet = cVar.f29363i) != null) {
            animatorSet.cancel();
        }
        cVar.f29361g = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator collapseAnimator = c.a(this, view, appBarLayout).setDuration(250L).addListener(new f(cVar, this)).getCollapseAnimator();
        List<View> children = t0.getChildren(this);
        if (getCenterView() != null) {
            children.remove(getCenterView());
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(x.alphaListener(children));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(vf.a.f89240a);
        animatorSet2.playSequentially(collapseAnimator, valueAnimatorOfFloat);
        animatorSet2.addListener(new e(cVar));
        Iterator it = cVar.f29357c.iterator();
        while (it.hasNext()) {
            animatorSet2.addListener((AnimatorListenerAdapter) it.next());
        }
        if (z10) {
            animatorSet2.setDuration(0L);
        }
        animatorSet2.start();
        cVar.f29363i = animatorSet2;
        return true;
    }

    public boolean expand(View view, AppBarLayout appBarLayout, boolean z10) {
        AnimatorSet animatorSet;
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        c cVar = this.f29311h0;
        if (cVar.f29361g && (animatorSet = cVar.f29363i) != null) {
            animatorSet.cancel();
        }
        cVar.f29360f = true;
        view.setVisibility(4);
        view.post(new com.applovin.impl.mediation.ads.f(cVar, this, view, appBarLayout, z10));
        return true;
    }

    public void setText(int i10) {
        this.W.setText(i10);
        this.f29304a0.setText(i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}

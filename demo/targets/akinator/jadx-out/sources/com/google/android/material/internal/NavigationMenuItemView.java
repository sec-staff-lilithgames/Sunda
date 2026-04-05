package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import e4.t;
import n3.p;
import p.b0;
import p.q;
import q.y3;
import qg.s;
import qg.y;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class NavigationMenuItemView extends s implements b0 {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f29291t = {R.attr.state_checked};

    /* renamed from: i, reason: collision with root package name */
    public int f29292i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29293j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29294k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29295l;

    /* renamed from: m, reason: collision with root package name */
    public final CheckedTextView f29296m;

    /* renamed from: n, reason: collision with root package name */
    public FrameLayout f29297n;

    /* renamed from: o, reason: collision with root package name */
    public q f29298o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f29299p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29300q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f29301r;

    /* renamed from: s, reason: collision with root package name */
    public final y f29302s;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f29297n == null) {
                this.f29297n = (FrameLayout) ((ViewStub) findViewById(com.digidust.elokence.akinator.freemium.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f29297n.removeAllViews();
            this.f29297n.addView(view);
        }
    }

    @Override // p.b0
    public q getItemData() {
        return this.f29298o;
    }

    @Override // p.b0
    public void initialize(q qVar, int i10) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.f29298o = qVar;
        if (qVar.getItemId() > 0) {
            setId(qVar.getItemId());
        }
        setVisibility(qVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.digidust.elokence.akinator.freemium.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f29291t, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setTitle(qVar.getTitle());
        setIcon(qVar.getIcon());
        setActionView(qVar.getActionView());
        setContentDescription(qVar.getContentDescription());
        y3.setTooltipText(this, qVar.getTooltipText());
        CharSequence title = this.f29298o.getTitle();
        CheckedTextView checkedTextView = this.f29296m;
        if (title == null && this.f29298o.getIcon() == null && this.f29298o.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f29297n;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f29297n.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f29297n;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f29297n.setLayoutParams(aVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        q qVar = this.f29298o;
        if (qVar != null && qVar.isCheckable() && this.f29298o.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f29291t);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p.b0
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.f29297n;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f29296m.setCompoundDrawables(null, null, null, null);
    }

    @Override // p.b0
    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f29294k != z10) {
            this.f29294k = z10;
            this.f29302s.sendAccessibilityEvent(this.f29296m, 2048);
        }
    }

    @Override // p.b0
    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f29296m;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f29295l) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    @Override // p.b0
    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f29300q) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = p3.a.wrap(drawable).mutate();
                drawable.setTintList(this.f29299p);
            }
            int i10 = this.f29292i;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f29293j) {
            if (this.f29301r == null) {
                Drawable drawable2 = p.getDrawable(getResources(), com.digidust.elokence.akinator.freemium.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.f29301r = drawable2;
                if (drawable2 != null) {
                    int i11 = this.f29292i;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f29301r;
        }
        this.f29296m.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f29296m.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f29292i = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f29299p = colorStateList;
        this.f29300q = colorStateList != null;
        q qVar = this.f29298o;
        if (qVar != null) {
            setIcon(qVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f29296m.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f29293j = z10;
    }

    public void setTextAppearance(int i10) {
        t.setTextAppearance(this.f29296m, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f29296m.setTextColor(colorStateList);
    }

    @Override // p.b0
    public void setTitle(CharSequence charSequence) {
        this.f29296m.setText(charSequence);
    }

    @Override // p.b0
    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29295l = true;
        y yVar = new y(this);
        this.f29302s = yVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.digidust.elokence.akinator.freemium.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.digidust.elokence.akinator.freemium.R.id.design_menu_item_text);
        this.f29296m = checkedTextView;
        z1.setAccessibilityDelegate(checkedTextView, yVar);
    }

    public void initialize(q qVar, boolean z10) throws Resources.NotFoundException {
        this.f29295l = z10;
        initialize(qVar, 0);
    }

    @Override // p.b0
    public void setShortcut(boolean z10, char c10) {
    }
}

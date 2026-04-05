package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.digidust.elokence.akinator.freemium.R;
import gg.g;
import gg.h;
import gg.i;
import gg.j;
import gg.k;
import java.util.List;
import qg.c;
import qg.j0;
import qg.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ChipGroup extends r {

    /* renamed from: g, reason: collision with root package name */
    public int f29124g;

    /* renamed from: h, reason: collision with root package name */
    public int f29125h;

    /* renamed from: i, reason: collision with root package name */
    public j f29126i;

    /* renamed from: j, reason: collision with root package name */
    public final c f29127j;

    /* renamed from: k, reason: collision with root package name */
    public final int f29128k;

    /* renamed from: l, reason: collision with root package name */
    public final k f29129l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends ViewGroup.MarginLayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && getChildAt(i11).getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public void check(int i10) {
        this.f29127j.check(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a);
    }

    public void clearCheck() {
        this.f29127j.clearCheck();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f29127j.getSingleCheckedId();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f29127j.getCheckedIdsSortedByChildOrder(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f29124g;
    }

    public int getChipSpacingVertical() {
        return this.f29125h;
    }

    public boolean isSelectionRequired() {
        return this.f29127j.isSelectionRequired();
    }

    @Override // qg.r
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.f29127j.isSingleSelection();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f29128k;
        if (i10 != -1) {
            this.f29127j.check(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y3.c.wrap(accessibilityNodeInfo).setCollectionInfo(y3.j.obtain(getRowCount(), isSingleLine() ? getVisibleChipCount() : -1, false, isSingleSelection() ? 1 : 2));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f29124g != i10) {
            this.f29124g = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f29125h != i10) {
            this.f29125h = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(i iVar) {
        if (iVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new h(this));
        }
    }

    public void setOnCheckedStateChangeListener(j jVar) {
        this.f29126i = jVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f29129l.f57683b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f29127j.setSelectionRequired(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // qg.r
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f29127j.setSingleSelection(z10);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i10);
        c cVar = new c();
        this.f29127j = cVar;
        k kVar = new k(this);
        this.f29129l = kVar;
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(getContext(), attributeSet, uf.a.f88460h, i10, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayObtainStyledAttributes.getBoolean(5, false));
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(6, false));
        setSelectionRequired(typedArrayObtainStyledAttributes.getBoolean(4, false));
        this.f29128k = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        cVar.setOnCheckedStateChangeListener(new g(this));
        super.setOnHierarchyChangeListener(kVar);
        setImportantForAccessibility(1);
    }
}

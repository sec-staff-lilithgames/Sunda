package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.digidust.elokence.akinator.freemium.R;
import e4.f;
import e6.h0;
import f6.i;
import j1.o2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jg.b;
import mg.c;
import q.n3;
import qg.j0;
import qg.t0;
import ug.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int[] A = {R.attr.state_indeterminate};
    public static final int[] B = {R.attr.state_error};
    public static final int[][] C = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int D = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f29083g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f29084h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f29085i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29086j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29087k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29088l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f29089m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f29090n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f29091o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29092p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f29093q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f29094r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuff.Mode f29095s;

    /* renamed from: t, reason: collision with root package name */
    public int f29096t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f29097u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29098v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f29099w;

    /* renamed from: x, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f29100x;

    /* renamed from: y, reason: collision with root package name */
    public final i f29101y;

    /* renamed from: z, reason: collision with root package name */
    public final fg.a f29102z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f29103b;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i10 = this.f29103b;
            return o2.o(sb2, i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f29103b));
        }
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private String getButtonStateDescription() {
        int i10 = this.f29096t;
        return i10 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i10 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f29085i == null) {
            int color = b.getColor(this, R.attr.colorControlActivated);
            int color2 = b.getColor(this, R.attr.colorError);
            int color3 = b.getColor(this, R.attr.colorSurface);
            int color4 = b.getColor(this, R.attr.colorOnSurface);
            this.f29085i = new ColorStateList(C, new int[]{b.layer(color3, color2, 1.0f), b.layer(color3, color, 1.0f), b.layer(color3, color4, 0.54f), b.layer(color3, color4, 0.38f), b.layer(color3, color4, 0.38f)});
        }
        return this.f29085i;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f29093q;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.f29090n = c.createTintableMutatedDrawableIfNeeded(this.f29090n, this.f29093q, f.getButtonTintMode(this));
        this.f29091o = c.createTintableMutatedDrawableIfNeeded(this.f29091o, this.f29094r, this.f29095s);
        if (this.f29092p) {
            i iVar = this.f29101y;
            if (iVar != null) {
                fg.a aVar = this.f29102z;
                iVar.unregisterAnimationCallback(aVar);
                iVar.registerAnimationCallback(aVar);
            }
            Drawable drawable = this.f29090n;
            if ((drawable instanceof AnimatedStateListDrawable) && iVar != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(R.id.checked, R.id.unchecked, iVar, false);
                ((AnimatedStateListDrawable) this.f29090n).addTransition(R.id.indeterminate, R.id.unchecked, iVar, false);
            }
        }
        Drawable drawable2 = this.f29090n;
        if (drawable2 != null && (colorStateList2 = this.f29093q) != null) {
            drawable2.setTintList(colorStateList2);
        }
        Drawable drawable3 = this.f29091o;
        if (drawable3 != null && (colorStateList = this.f29094r) != null) {
            drawable3.setTintList(colorStateList);
        }
        super.setButtonDrawable(c.compositeTwoLayeredDrawable(this.f29090n, this.f29091o));
        refreshDrawableState();
    }

    public void addOnCheckedStateChangedListener(fg.b bVar) {
        this.f29084h.add(bVar);
    }

    public void addOnErrorChangedListener(fg.c cVar) {
        this.f29083g.add(cVar);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.f29084h.clear();
    }

    public void clearOnErrorChangedListeners() {
        this.f29083g.clear();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f29090n;
    }

    public Drawable getButtonIconDrawable() {
        return this.f29091o;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f29094r;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f29095s;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f29093q;
    }

    public int getCheckedState() {
        return this.f29096t;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f29089m;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.f29087k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f29096t == 1;
    }

    public boolean isErrorShown() {
        return this.f29088l;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f29086j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29086j && this.f29093q == null && this.f29094r == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        if (isErrorShown()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        this.f29097u = c.getCheckedState(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f29087k || !TextUtils.isEmpty(getText()) || (buttonDrawable = f.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (t0.isLayoutRtl(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f29089m));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f29103b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29103b = getCheckedState();
        return savedState;
    }

    public void removeOnCheckedStateChangedListener(fg.b bVar) {
        this.f29084h.remove(bVar);
    }

    public void removeOnErrorChangedListener(fg.c cVar) {
        this.f29083g.remove(cVar);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(l.a.getDrawable(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f29091o = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(l.a.getDrawable(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f29094r == colorStateList) {
            return;
        }
        this.f29094r = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f29095s == mode) {
            return;
        }
        this.f29095s = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f29093q == colorStateList) {
            return;
        }
        this.f29093q = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f29087k = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerB;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f29096t != i10) {
            this.f29096t = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.f29099w == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f29098v) {
                return;
            }
            this.f29098v = true;
            LinkedHashSet linkedHashSet = this.f29084h;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw a.b.c(it);
                }
            }
            if (this.f29096t != 2 && (onCheckedChangeListener = this.f29100x) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManagerB = h0.b(getContext().getSystemService(h0.c()))) != null) {
                autofillManagerB.notifyValueChanged(this);
            }
            this.f29098v = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f29089m = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f29088l == z10) {
            return;
        }
        this.f29088l = z10;
        refreshDrawableState();
        Iterator it = this.f29083g.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f29100x = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f29099w = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f29086j = z10;
        if (z10) {
            f.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            f.setButtonTintList(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f29090n = drawable;
        this.f29092p = false;
        a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i10);
        this.f29083g = new LinkedHashSet();
        this.f29084h = new LinkedHashSet();
        this.f29101y = i.create(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.f29102z = new fg.a(this);
        Context context2 = getContext();
        this.f29090n = f.getButtonDrawable(this);
        this.f29093q = getSuperButtonTintList();
        setSupportButtonTintList(null);
        n3 n3VarObtainTintedStyledAttributes = j0.obtainTintedStyledAttributes(context2, attributeSet, uf.a.f88477y, i10, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.f29091o = n3VarObtainTintedStyledAttributes.getDrawable(2);
        if (this.f29090n != null && j0.isMaterial3Theme(context2)) {
            int resourceId = n3VarObtainTintedStyledAttributes.getResourceId(0, 0);
            int resourceId2 = n3VarObtainTintedStyledAttributes.getResourceId(1, 0);
            if (resourceId == D && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f29090n = l.a.getDrawable(context2, R.drawable.mtrl_checkbox_button);
                this.f29092p = true;
                if (this.f29091o == null) {
                    this.f29091o = l.a.getDrawable(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f29094r = d.getColorStateList(context2, n3VarObtainTintedStyledAttributes, 3);
        this.f29095s = t0.parseTintMode(n3VarObtainTintedStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f29086j = n3VarObtainTintedStyledAttributes.getBoolean(10, false);
        this.f29087k = n3VarObtainTintedStyledAttributes.getBoolean(6, true);
        this.f29088l = n3VarObtainTintedStyledAttributes.getBoolean(9, false);
        this.f29089m = n3VarObtainTintedStyledAttributes.getText(8);
        if (n3VarObtainTintedStyledAttributes.hasValue(7)) {
            setCheckedState(n3VarObtainTintedStyledAttributes.getInt(7, 0));
        }
        n3VarObtainTintedStyledAttributes.recycle();
        a();
    }
}

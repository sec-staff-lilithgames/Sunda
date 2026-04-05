package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.digidust.elokence.akinator.freemium.R;
import e4.t;
import e4.x;
import java.lang.reflect.InvocationTargetException;
import q.f4;
import q.i3;
import q.j3;
import q.t1;
import q.v0;
import q.z;
import x3.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AppCompatButton extends Button implements e1, e4.d, x, t1 {

    /* renamed from: b, reason: collision with root package name */
    public final q.s f5018b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f5019c;

    /* renamed from: e, reason: collision with root package name */
    public z f5020e;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private z getEmojiTextViewHelper() {
        if (this.f5020e == null) {
            this.f5020e = new z(this);
        }
        return this.f5020e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q.s sVar = this.f5018b;
        if (sVar != null) {
            sVar.a();
        }
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView, e4.d
    public int getAutoSizeMaxTextSize() {
        if (f4.f82107c) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            return Math.round(v0Var.f82278i.f82072e);
        }
        return -1;
    }

    @Override // android.widget.TextView, e4.d
    public int getAutoSizeMinTextSize() {
        if (f4.f82107c) {
            return super.getAutoSizeMinTextSize();
        }
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            return Math.round(v0Var.f82278i.f82071d);
        }
        return -1;
    }

    @Override // android.widget.TextView, e4.d
    public int getAutoSizeStepGranularity() {
        if (f4.f82107c) {
            return super.getAutoSizeStepGranularity();
        }
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            return Math.round(v0Var.f82278i.f82070c);
        }
        return -1;
    }

    @Override // android.widget.TextView, e4.d
    public int[] getAutoSizeTextAvailableSizes() {
        if (f4.f82107c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.f5019c;
        return v0Var != null ? v0Var.f82278i.f82073f : new int[0];
    }

    @Override // android.widget.TextView, e4.d
    public int getAutoSizeTextType() {
        if (f4.f82107c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            return v0Var.f82278i.f82068a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        q.s sVar = this.f5018b;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q.s sVar = this.f5018b;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // e4.x
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5019c.d();
    }

    @Override // e4.x
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5019c.e();
    }

    @Override // q.t1
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().isEnabled();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        v0 v0Var = this.f5019c;
        if (v0Var == null || f4.f82107c) {
            return;
        }
        v0Var.f82278i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            q.e1 e1Var = v0Var.f82278i;
            if (f4.f82107c || !e1Var.f()) {
                return;
            }
            e1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView, e4.d
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (f4.f82107c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            v0Var.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, e4.d
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (f4.f82107c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            v0Var.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView, e4.d
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (f4.f82107c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            v0Var.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q.s sVar = this.f5018b;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q.s sVar = this.f5018b;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // q.t1
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f82316b.getFilters(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            v0Var.f82270a.setAllCaps(z10);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q.s sVar = this.f5018b;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q.s sVar = this.f5018b;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f5019c;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f5019c;
        v0Var.l(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z10 = f4.f82107c;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        v0 v0Var = this.f5019c;
        if (v0Var != null) {
            q.e1 e1Var = v0Var.f82278i;
            if (z10 || e1Var.f()) {
                return;
            }
            e1Var.g(f10, i10);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(j3.wrap(context), attributeSet, i10);
        i3.checkAppCompatTheme(this, getContext());
        q.s sVar = new q.s(this);
        this.f5018b = sVar;
        sVar.d(attributeSet, i10);
        v0 v0Var = new v0(this);
        this.f5019c = v0Var;
        v0Var.f(attributeSet, i10);
        v0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i10);
    }
}

package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import e4.t;
import e4.x;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import q.f4;
import q.i3;
import q.j3;
import q.p0;
import q.t1;
import q.v0;
import q.w0;
import q.x0;
import q.y0;
import q.z;
import q.z0;
import x3.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements e1, x, e4.d, t1 {
    private final q.s mBackgroundTintHelper;
    private z mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<v3.i> mPrecomputedTextFuture;
    private w0 mSuperCaller;
    private final p0 mTextClassifierHelper;
    private final v0 mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private z getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new z(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.a();
        }
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView, e4.d
    public int getAutoSizeMaxTextSize() {
        if (f4.f82107c) {
            return ((x0) getSuperCaller()).getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            return Math.round(v0Var.f82278i.f82072e);
        }
        return -1;
    }

    @Override // android.widget.TextView, e4.d
    public int getAutoSizeMinTextSize() {
        if (f4.f82107c) {
            return ((x0) getSuperCaller()).getAutoSizeMinTextSize();
        }
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            return Math.round(v0Var.f82278i.f82071d);
        }
        return -1;
    }

    @Override // android.widget.TextView, e4.d
    public int getAutoSizeStepGranularity() {
        if (f4.f82107c) {
            return ((x0) getSuperCaller()).getAutoSizeStepGranularity();
        }
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            return Math.round(v0Var.f82278i.f82070c);
        }
        return -1;
    }

    @Override // android.widget.TextView, e4.d
    public int[] getAutoSizeTextAvailableSizes() {
        if (f4.f82107c) {
            return ((x0) getSuperCaller()).getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.mTextHelper;
        return v0Var != null ? v0Var.f82278i.f82073f : new int[0];
    }

    @Override // android.widget.TextView, e4.d
    public int getAutoSizeTextType() {
        if (f4.f82107c) {
            return ((x0) getSuperCaller()).getAutoSizeTextType() == 1 ? 1 : 0;
        }
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            return v0Var.f82278i.f82068a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return t.getFirstBaselineToTopHeight(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return t.getLastBaselineToBottomHeight(this);
    }

    public w0 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.mSuperCaller = new z0(this);
            } else if (i10 >= 28) {
                this.mSuperCaller = new y0(this);
            } else if (i10 >= 26) {
                this.mSuperCaller = new x0(this);
            }
        }
        return this.mSuperCaller;
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // e4.x
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    @Override // e4.x
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<v3.i> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                t.setPrecomputedText(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        p0 p0Var;
        return (Build.VERSION.SDK_INT >= 28 || (p0Var = this.mTextClassifierHelper) == null) ? ((x0) getSuperCaller()).getTextClassifier() : p0Var.getTextClassifier();
    }

    public v3.f getTextMetricsParamsCompat() {
        return t.getTextMetricsParams(this);
    }

    @Override // q.t1
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            c4.c.setInitialSurroundingText(editorInfo, getText());
        }
        jh.i.K(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        v0 v0Var = this.mTextHelper;
        if (v0Var == null || f4.f82107c) {
            return;
        }
        v0Var.f82278i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<v3.i> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                t.setPrecomputedText(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        v0 v0Var = this.mTextHelper;
        if (v0Var == null || f4.f82107c || !v0Var.f82278i.f()) {
            return;
        }
        this.mTextHelper.f82278i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView, e4.d
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (f4.f82107c) {
            ((x0) getSuperCaller()).setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, e4.d
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (f4.f82107c) {
            ((x0) getSuperCaller()).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView, e4.d
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (f4.f82107c) {
            ((x0) getSuperCaller()).setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().setFirstBaselineToTopHeight(i10);
        } else {
            t.setFirstBaselineToTopHeight(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().setLastBaselineToBottomHeight(i10);
        } else {
            t.setLastBaselineToBottomHeight(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        t.setLineHeight(this, i10);
    }

    public void setPrecomputedText(v3.i iVar) {
        t.setPrecomputedText(this, iVar);
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        p0 p0Var;
        if (Build.VERSION.SDK_INT >= 28 || (p0Var = this.mTextClassifierHelper) == null) {
            ((x0) getSuperCaller()).setTextClassifier(textClassifier);
        } else {
            p0Var.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<v3.i> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(v3.f fVar) {
        t.setTextMetricsParams(this, fVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z10 = f4.f82107c;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            q.e1 e1Var = v0Var.f82278i;
            if (z10 || e1Var.f()) {
                return;
            }
            e1Var.g(f10, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceCreate = (typeface == null || i10 <= 0) ? null : o3.i.create(getContext(), typeface, i10);
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().setLineHeight(i10, f10);
        } else {
            t.setLineHeight(this, i10, f10);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(j3.wrap(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        i3.checkAppCompatTheme(this, getContext());
        q.s sVar = new q.s(this);
        this.mBackgroundTintHelper = sVar;
        sVar.d(attributeSet, i10);
        v0 v0Var = new v0(this);
        this.mTextHelper = v0Var;
        v0Var.f(attributeSet, i10);
        v0Var.b();
        this.mTextClassifierHelper = new p0(this);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? l.a.getDrawable(context, i10) : null, i11 != 0 ? l.a.getDrawable(context, i11) : null, i12 != 0 ? l.a.getDrawable(context, i12) : null, i13 != 0 ? l.a.getDrawable(context, i13) : null);
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? l.a.getDrawable(context, i10) : null, i11 != 0 ? l.a.getDrawable(context, i11) : null, i12 != 0 ? l.a.getDrawable(context, i12) : null, i13 != 0 ? l.a.getDrawable(context, i13) : null);
        v0 v0Var = this.mTextHelper;
        if (v0Var != null) {
            v0Var.b();
        }
    }
}

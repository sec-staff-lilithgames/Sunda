package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class r extends AutoCompleteTextView implements x3.e1, t1, e4.x {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f82212f = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    public final s f82213b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f82214c;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f82215e;

    public r(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f82213b;
        if (sVar != null) {
            sVar.a();
        }
        v0 v0Var = this.f82214c;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e4.t.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f82213b;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f82213b;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // e4.x
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f82214c.d();
    }

    @Override // e4.x
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f82214c.e();
    }

    @Override // q.t1
    public boolean isEmojiCompatEnabled() {
        return ((u4.a) this.f82215e.f82065c).isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jh.i.K(inputConnectionOnCreateInputConnection, editorInfo, this);
        return ((u4.a) this.f82215e.f82065c).onCreateInputConnection(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f82213b;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f82213b;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f82214c;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f82214c;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e4.t.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(l.a.getDrawable(getContext(), i10));
    }

    @Override // q.t1
    public void setEmojiCompatEnabled(boolean z10) {
        ((u4.a) this.f82215e.f82065c).setEnabled(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f82215e.a(keyListener));
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f82213b;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f82213b;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f82214c;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f82214c;
        v0Var.l(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.f82214c;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.autoCompleteTextViewStyle);
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(j3.wrap(context), attributeSet, i10);
        i3.checkAppCompatTheme(this, getContext());
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(getContext(), attributeSet, f82212f, i10, 0);
        if (n3VarObtainStyledAttributes.hasValue(0)) {
            setDropDownBackgroundDrawable(n3VarObtainStyledAttributes.getDrawable(0));
        }
        n3VarObtainStyledAttributes.recycle();
        s sVar = new s(this);
        this.f82213b = sVar;
        sVar.d(attributeSet, i10);
        v0 v0Var = new v0(this);
        this.f82214c = v0Var;
        v0Var.f(attributeSet, i10);
        v0Var.b();
        e0 e0Var = new e0(this);
        this.f82215e = e0Var;
        e0Var.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = e0Var.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}

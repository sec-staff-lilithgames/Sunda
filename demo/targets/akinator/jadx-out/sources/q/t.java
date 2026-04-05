package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t extends CheckedTextView implements e4.v, x3.e1, t1, e4.x {

    /* renamed from: b, reason: collision with root package name */
    public final u f82250b;

    /* renamed from: c, reason: collision with root package name */
    public final s f82251c;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f82252e;

    /* renamed from: f, reason: collision with root package name */
    public z f82253f;

    public t(Context context) {
        this(context, null);
    }

    private z getEmojiTextViewHelper() {
        if (this.f82253f == null) {
            this.f82253f = new z(this);
        }
        return this.f82253f;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v0 v0Var = this.f82252e;
        if (v0Var != null) {
            v0Var.b();
        }
        s sVar = this.f82251c;
        if (sVar != null) {
            sVar.a();
        }
        u uVar = this.f82250b;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e4.t.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f82251c;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f82251c;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // e4.v
    public ColorStateList getSupportCheckMarkTintList() {
        u uVar = this.f82250b;
        if (uVar != null) {
            return uVar.f82257a;
        }
        return null;
    }

    @Override // e4.v
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        u uVar = this.f82250b;
        if (uVar != null) {
            return uVar.f82258b;
        }
        return null;
    }

    @Override // e4.x
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f82252e.d();
    }

    @Override // e4.x
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f82252e.e();
    }

    @Override // q.t1
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jh.i.K(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f82251c;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f82251c;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        u uVar = this.f82250b;
        if (uVar != null) {
            if (uVar.f82261e) {
                uVar.f82261e = false;
            } else {
                uVar.f82261e = true;
                uVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f82252e;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f82252e;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e4.t.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // q.t1
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f82251c;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f82251c;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    @Override // e4.v
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        u uVar = this.f82250b;
        if (uVar != null) {
            uVar.f82257a = colorStateList;
            uVar.f82259c = true;
            uVar.b();
        }
    }

    @Override // e4.v
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        u uVar = this.f82250b;
        if (uVar != null) {
            uVar.f82258b = mode;
            uVar.f82260d = true;
            uVar.b();
        }
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f82252e;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f82252e;
        v0Var.l(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.f82252e;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public t(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        super(j3.wrap(context), attributeSet, i10);
        i3.checkAppCompatTheme(this, getContext());
        v0 v0Var = new v0(this);
        this.f82252e = v0Var;
        v0Var.f(attributeSet, i10);
        v0Var.b();
        s sVar = new s(this);
        this.f82251c = sVar;
        sVar.d(attributeSet, i10);
        this.f82250b = new u(this);
        Context context2 = getContext();
        int[] iArr = k.a.f69988l;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context2, attributeSet, iArr, i10, 0);
        x3.z1.saveAttributeDataForStyleable(this, getContext(), iArr, attributeSet, n3VarObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            if (n3VarObtainStyledAttributes.hasValue(1) && (resourceId2 = n3VarObtainStyledAttributes.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(l.a.getDrawable(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (n3VarObtainStyledAttributes.hasValue(0) && (resourceId = n3VarObtainStyledAttributes.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(l.a.getDrawable(getContext(), resourceId));
            }
            if (n3VarObtainStyledAttributes.hasValue(2)) {
                e4.e.setCheckMarkTintList(this, n3VarObtainStyledAttributes.getColorStateList(2));
            }
            if (n3VarObtainStyledAttributes.hasValue(3)) {
                e4.e.setCheckMarkTintMode(this, l1.parseTintMode(n3VarObtainStyledAttributes.getInt(3, -1), null));
            }
            n3VarObtainStyledAttributes.recycle();
            getEmojiTextViewHelper().a(attributeSet, i10);
        } catch (Throwable th2) {
            n3VarObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(l.a.getDrawable(getContext(), i10));
    }
}

package q;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class y extends EditText implements x3.e1, x3.s0, t1, e4.x {

    /* renamed from: b, reason: collision with root package name */
    public final s f82298b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f82299c;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f82300e;

    /* renamed from: f, reason: collision with root package name */
    public final e4.u f82301f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f82302g;

    /* renamed from: h, reason: collision with root package name */
    public x f82303h;

    public y(Context context) {
        this(context, null);
    }

    private x getSuperCaller() {
        if (this.f82303h == null) {
            this.f82303h = new x(this);
        }
        return this.f82303h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f82298b;
        if (sVar != null) {
            sVar.a();
        }
        v0 v0Var = this.f82299c;
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
        s sVar = this.f82298b;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f82298b;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // e4.x
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f82299c.d();
    }

    @Override // e4.x
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f82299c.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        p0 p0Var;
        return (Build.VERSION.SDK_INT >= 28 || (p0Var = this.f82300e) == null) ? getSuperCaller().getTextClassifier() : p0Var.getTextClassifier();
    }

    @Override // q.t1
    public boolean isEmojiCompatEnabled() {
        return ((u4.a) this.f82302g.f82065c).isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] onReceiveContentMimeTypes;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f82299c.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            c4.c.setInitialSurroundingText(editorInfo, getText());
        }
        jh.i.K(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (onReceiveContentMimeTypes = x3.z1.getOnReceiveContentMimeTypes(this)) != null) {
            c4.c.setContentMimeTypes(editorInfo, onReceiveContentMimeTypes);
            inputConnectionOnCreateInputConnection = c4.h.createWrapper(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return ((u4.a) this.f82302g.f82065c).onCreateInputConnection(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && x3.z1.getOnReceiveContentMimeTypes(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = h0.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // x3.s0
    public x3.n onReceiveContent(x3.n nVar) {
        return this.f82301f.onReceiveContent(this, nVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (Build.VERSION.SDK_INT >= 31 || x3.z1.getOnReceiveContentMimeTypes(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            x3.z1.performReceiveContent(this, new x3.g(primaryClip, 1).setFlags(i10 == 16908322 ? 0 : 1).build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f82298b;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f82298b;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f82299c;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f82299c;
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
        ((u4.a) this.f82302g.f82065c).setEnabled(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f82302g.a(keyListener));
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f82298b;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f82298b;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f82299c;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f82299c;
        v0Var.l(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.f82299c;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        p0 p0Var;
        if (Build.VERSION.SDK_INT >= 28 || (p0Var = this.f82300e) == null) {
            getSuperCaller().setTextClassifier(textClassifier);
        } else {
            p0Var.setTextClassifier(textClassifier);
        }
    }

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public y(Context context, AttributeSet attributeSet, int i10) {
        super(j3.wrap(context), attributeSet, i10);
        i3.checkAppCompatTheme(this, getContext());
        s sVar = new s(this);
        this.f82298b = sVar;
        sVar.d(attributeSet, i10);
        v0 v0Var = new v0(this);
        this.f82299c = v0Var;
        v0Var.f(attributeSet, i10);
        v0Var.b();
        this.f82300e = new p0(this);
        this.f82301f = new e4.u();
        e0 e0Var = new e0(this);
        this.f82302g = e0Var;
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

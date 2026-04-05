package u4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import s4.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final EditText f87850b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87851c;

    /* renamed from: e, reason: collision with root package name */
    public m f87852e;

    /* renamed from: f, reason: collision with root package name */
    public int f87853f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f87854g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87855h = true;

    public n(EditText editText, boolean z10) {
        this.f87850b = editText;
        this.f87851c = z10;
    }

    public static void a(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            s.get().process(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public boolean isEnabled() {
        return this.f87855h;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f87850b;
        if (editText.isInEditMode() || !this.f87855h) {
            return;
        }
        if ((this.f87851c || s.isConfigured()) && i11 <= i12 && (charSequence instanceof Spannable)) {
            int loadState = s.get().getLoadState();
            if (loadState != 0) {
                if (loadState == 1) {
                    s.get().process((Spannable) charSequence, i10, i10 + i12, this.f87853f, this.f87854g);
                    return;
                } else if (loadState != 3) {
                    return;
                }
            }
            s sVar = s.get();
            if (this.f87852e == null) {
                this.f87852e = new m(editText);
            }
            sVar.registerInitCallback(this.f87852e);
        }
    }

    public void setEnabled(boolean z10) {
        if (this.f87855h != z10) {
            if (this.f87852e != null) {
                s.get().unregisterInitCallback(this.f87852e);
            }
            this.f87855h = z10;
            if (z10) {
                a(this.f87850b, s.get().getLoadState());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}

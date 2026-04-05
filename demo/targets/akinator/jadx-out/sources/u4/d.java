package u4;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f87836a;

    /* renamed from: b, reason: collision with root package name */
    public final c f87837b;

    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        c cVar = new c();
        super(inputConnection, false);
        this.f87836a = editText;
        this.f87837b = cVar;
        cVar.updateEditorInfoAttrs(editorInfo);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f87837b.handleDeleteSurroundingText(this, this.f87836a.getEditableText(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f87837b.handleDeleteSurroundingText(this, this.f87836a.getEditableText(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}

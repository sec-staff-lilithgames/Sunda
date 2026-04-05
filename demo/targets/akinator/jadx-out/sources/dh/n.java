package dh;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class n implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f52248a;

    public n(q qVar) {
        this.f52248a = qVar;
    }

    @Override // dh.f0
    public void onEditTextAttached(TextInputLayout textInputLayout) {
        q qVar = this.f52248a;
        m mVar = qVar.f52275x;
        if (qVar.f52272u == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f52272u;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f52272u.getOnFocusChangeListener() == qVar.b().d()) {
                qVar.f52272u.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f52272u = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().onEditTextAttached(qVar.f52272u);
        qVar.j(qVar.b());
    }
}

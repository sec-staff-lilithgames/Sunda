package q9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f82616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f82617c;

    public c(b bVar, EditText editText) {
        this.f82616b = bVar;
        this.f82617c = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f82616b.setDescDisplayed(this.f82617c.getText().toString());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}

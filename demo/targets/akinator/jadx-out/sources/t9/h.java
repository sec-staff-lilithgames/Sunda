package t9;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f86613b;

    public h(g gVar) {
        this.f86613b = gVar;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        g gVar = this.f86613b;
        gVar.f86611e = g.access$getBinding(gVar).searchQuestionFieldValue.getText().toString();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}

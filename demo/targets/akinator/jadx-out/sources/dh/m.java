package dh;

import android.text.Editable;
import qg.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class m extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f52247b;

    public m(q qVar) {
        this.f52247b = qVar;
    }

    @Override // qg.i0, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f52247b.b().afterEditTextChanged(editable);
    }

    @Override // qg.i0, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f52247b.b().a();
    }
}

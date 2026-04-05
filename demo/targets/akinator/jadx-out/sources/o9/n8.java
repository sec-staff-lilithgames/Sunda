package o9;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n8 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p8 f78405b;

    public n8(p8 p8Var) {
        this.f78405b = p8Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (ca.m.sharedInstance().isSoundLikeAutoCompletionEnabledForCurrentInstance()) {
            this.f78405b.f78123b.disposeAtDestruction(mt.b0.fromCallable(new com.google.firebase.messaging.m(8, this, editable)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new h0(5, this, editable)));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}

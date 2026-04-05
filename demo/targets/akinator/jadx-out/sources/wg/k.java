package wg;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class k implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f90592b;

    public k(SearchView searchView) {
        this.f90592b = searchView;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f90592b.f29339n.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}

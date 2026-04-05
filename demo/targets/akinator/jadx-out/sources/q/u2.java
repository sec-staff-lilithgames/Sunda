package q;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f82263b;

    public u2(SearchView searchView) {
        this.f82263b = searchView;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        SearchView searchView = this.f82263b;
        Editable text = searchView.f5051b.getText();
        searchView.I = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.m(!zIsEmpty);
        searchView.o(zIsEmpty);
        searchView.i();
        searchView.l();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}

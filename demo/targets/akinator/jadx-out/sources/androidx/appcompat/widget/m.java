package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f5169b;

    public m(SearchView searchView) {
        this.f5169b = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        SearchView searchView = this.f5169b;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f5051b;
        if (searchView.L != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i10 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.a(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.L != null && searchView.B != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i10 == 66 || i10 == 84 || i10 == 61) {
                    searchView.e(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i10 == 21 || i10 == 22) {
                    searchAutoComplete.setSelection(i10 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                    return true;
                }
                if (i10 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}

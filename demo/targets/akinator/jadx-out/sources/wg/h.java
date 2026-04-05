package wg;

import android.view.View;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f90587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchView f90588c;

    public /* synthetic */ h(SearchView searchView, int i10) {
        this.f90587b = i10;
        this.f90588c = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f90587b;
        SearchView searchView = this.f90588c;
        switch (i10) {
            case 0:
                int i11 = SearchView.G;
                searchView.clearText();
                if (searchView.A) {
                    searchView.requestFocusAndShowKeyboard();
                    break;
                }
                break;
            case 1:
                int i12 = SearchView.G;
                searchView.show();
                break;
            default:
                int i13 = SearchView.G;
                searchView.hide();
                break;
        }
    }
}

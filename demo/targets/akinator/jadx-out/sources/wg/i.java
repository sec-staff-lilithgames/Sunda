package wg;

import android.widget.EditText;
import com.google.android.material.search.SearchView;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f90589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchView f90590c;

    public /* synthetic */ i(SearchView searchView, int i10) {
        this.f90589b = i10;
        this.f90590c = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f90589b) {
            case 0:
                SearchView searchView = this.f90590c;
                EditText editText = searchView.f29338m;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                t0.showKeyboard(editText, searchView.C);
                break;
            case 1:
                this.f90590c.show();
                break;
            case 2:
                SearchView searchView2 = this.f90590c;
                EditText editText2 = searchView2.f29338m;
                editText2.clearFocus();
                t0.hideKeyboard(editText2, searchView2.C);
                break;
            default:
                SearchView searchView3 = this.f90590c;
                if (searchView3.A) {
                    searchView3.requestFocusAndShowKeyboard();
                    break;
                }
                break;
        }
    }
}

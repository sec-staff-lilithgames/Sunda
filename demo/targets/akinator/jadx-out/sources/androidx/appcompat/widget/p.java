package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f5170b;

    public p(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f5170b = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f5170b;
        if (searchAutoComplete.f5078i) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f5078i = false;
        }
    }
}

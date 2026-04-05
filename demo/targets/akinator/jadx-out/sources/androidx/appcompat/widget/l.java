package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f5168b;

    public l(SearchView searchView) {
        this.f5168b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SearchView searchView = this.f5168b;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f5051b;
        if (view == searchView.f5055g) {
            searchView.n(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f5073y;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f5057i) {
            searchView.d();
            return;
        }
        if (view == searchView.f5056h) {
            searchView.h();
            return;
        }
        if (view != searchView.f5058j) {
            if (view == searchAutoComplete) {
                searchView.c();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.L;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.b(searchView.f5070v, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f5069u);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}

package wg;

import android.content.res.ColorStateList;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a extends AppBarLayout.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBar f90576a;

    public a(SearchBar searchBar) {
        this.f90576a = searchBar;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.d
    public void onUpdate(float f10, int i10, float f11) {
        SearchBar searchBar = this.f90576a;
        ColorStateList colorStateList = searchBar.f29308e0;
        if (colorStateList != null) {
            searchBar.f29320q0.setFillColor(ColorStateList.valueOf(jg.b.layer(searchBar.f29306c0, colorStateList.getDefaultColor(), f11)));
        }
    }
}

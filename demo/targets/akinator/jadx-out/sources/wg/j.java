package wg;

import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchView;
import qg.r0;
import qg.s0;
import qg.t0;
import x3.e3;
import x3.q0;
import x3.t3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements r0, q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f90591b;

    public /* synthetic */ j(SearchView searchView) {
        this.f90591b = searchView;
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        SearchView.a(this.f90591b, e3Var);
        return e3Var;
    }

    @Override // qg.r0
    public e3 onApplyWindowInsets(View view, e3 e3Var, s0 s0Var) {
        MaterialToolbar materialToolbar = this.f90591b.f29334i;
        boolean zIsLayoutRtl = t0.isLayoutRtl(materialToolbar);
        int i10 = zIsLayoutRtl ? s0Var.f83234c : s0Var.f83232a;
        int i11 = zIsLayoutRtl ? s0Var.f83232a : s0Var.f83234c;
        o3.c insets = e3Var.getInsets(t3.systemBars() | t3.displayCutout());
        materialToolbar.setPadding(i10 + insets.f77432a, s0Var.f83233b, i11 + insets.f77434c, s0Var.f83235d);
        return e3Var;
    }
}

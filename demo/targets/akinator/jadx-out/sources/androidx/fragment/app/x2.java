package androidx.fragment.app;

import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 extends a3 {

    /* renamed from: h, reason: collision with root package name */
    public final e2 f6495h;

    public x2(z2 z2Var, int i10, e2 e2Var, t3.g gVar) {
        super(z2Var, i10, e2Var.f6304c, gVar);
        this.f6495h = e2Var;
    }

    @Override // androidx.fragment.app.a3
    public final void c() {
        int i10 = this.f6276b;
        e2 e2Var = this.f6495h;
        if (i10 != 2) {
            if (i10 == 3) {
                Fragment fragment = e2Var.f6304c;
                View viewRequireView = fragment.requireView();
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        Fragment fragment2 = e2Var.f6304c;
        View viewFindFocus = fragment2.mView.findFocus();
        if (viewFindFocus != null) {
            fragment2.setFocusedView(viewFindFocus);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
            }
        }
        View viewRequireView2 = getFragment().requireView();
        if (viewRequireView2.getParent() == null) {
            e2Var.a();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
    }

    @Override // androidx.fragment.app.a3
    public void complete() {
        super.complete();
        this.f6495h.j();
    }
}

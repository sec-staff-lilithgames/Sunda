package androidx.fragment.app;

import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.u1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6466b;

    public u(w wVar) {
        this.f6466b = wVar;
    }

    @Override // androidx.lifecycle.u1
    public void onChanged(androidx.lifecycle.b1 b1Var) {
        if (b1Var != null) {
            w wVar = this.f6466b;
            if (wVar.mShowsDialog) {
                View viewRequireView = wVar.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (wVar.mDialog != null) {
                    if (FragmentManager.isLoggingEnabled(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + wVar.mDialog);
                    }
                    wVar.mDialog.setContentView(viewRequireView);
                }
            }
        }
    }
}

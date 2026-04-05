package q;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f82021b;

    public a2(j2 j2Var) {
        this.f82021b = j2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        j2 j2Var = this.f82021b;
        View anchorView = j2Var.getAnchorView();
        if (anchorView == null || anchorView.getWindowToken() == null) {
            return;
        }
        j2Var.show();
    }
}

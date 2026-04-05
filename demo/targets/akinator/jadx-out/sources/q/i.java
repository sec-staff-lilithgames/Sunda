package q;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f82114b;

    public i(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f82114b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f82114b;
        actionBarOverlayLayout.b();
        actionBarOverlayLayout.f4976y = actionBarOverlayLayout.f4957f.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4977z);
    }
}

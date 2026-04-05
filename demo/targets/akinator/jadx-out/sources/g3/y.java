package g3;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f57285b;

    public y(View view) {
        this.f57285b = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f57285b.setNestedScrollingEnabled(true);
    }
}

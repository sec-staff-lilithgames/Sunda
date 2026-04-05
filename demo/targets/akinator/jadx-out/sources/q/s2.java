package q;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f82247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.k f82248c;

    public s2(androidx.appcompat.widget.k kVar, View view) {
        this.f82248c = kVar;
        this.f82247b = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        View view = this.f82247b;
        int left = view.getLeft();
        androidx.appcompat.widget.k kVar = this.f82248c;
        kVar.smoothScrollTo(left - ((kVar.getWidth() - view.getWidth()) / 2), 0);
        kVar.f5152b = null;
    }
}

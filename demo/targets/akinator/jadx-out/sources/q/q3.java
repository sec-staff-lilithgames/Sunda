package q;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f82211b;

    public q3(Toolbar toolbar) {
        this.f82211b = toolbar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f82211b.showOverflowMenu();
    }
}

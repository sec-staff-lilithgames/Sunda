package q;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f82290b;

    public w2(SearchView searchView) {
        this.f82290b = searchView;
    }

    @Override // java.lang.Runnable
    public void run() {
        f4.c cVar = this.f82290b.B;
        if (cVar instanceof f3) {
            cVar.changeCursor(null);
        }
    }
}

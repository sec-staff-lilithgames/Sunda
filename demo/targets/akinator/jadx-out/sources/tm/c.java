package tm;

import android.graphics.Point;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Point f86996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f86997c;

    public c(d dVar, Point point) {
        this.f86997c = dVar;
        this.f86996b = point;
    }

    @Override // java.lang.Runnable
    public void run() {
        b bVar = new b(this);
        d dVar = this.f86997c;
        g gVar = dVar.f87004h;
        Point point = this.f86996b;
        int i10 = point.x;
        int i11 = point.y;
        w0 w0Var = dVar.f87003g;
        int i12 = g.f87037y;
        if (gVar.isRedirectProcessed()) {
            return;
        }
        w0Var.applyClick(i10, i11);
        gVar.f87059x = bVar;
        gVar.postDelayed(bVar, 150L);
    }
}

package tm;

import android.graphics.Point;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f87000c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f87003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f87004h;

    public d(g gVar, int i10, int i11, int i12, int i13, w0 w0Var) {
        this.f87004h = gVar;
        this.f86999b = i10;
        this.f87000c = i11;
        this.f87001e = i12;
        this.f87002f = i13;
        this.f87003g = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        Point clickPoint = um.h0.getClickPoint(this.f86999b, this.f87000c, this.f87001e, this.f87002f);
        c cVar = new c(this, clickPoint);
        int i10 = clickPoint.x;
        int i11 = clickPoint.y;
        int i12 = g.f87037y;
        this.f87004h.a(i10, i11, this.f87003g, cVar);
    }
}

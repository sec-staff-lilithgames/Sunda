package gt;

import io.odeeo.internal.w1.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f58411c;

    public /* synthetic */ a(c cVar, int i10) {
        this.f58410b = i10;
        this.f58411c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f58410b) {
            case 0:
                c.a(this.f58411c);
                break;
            case 1:
                c.c(this.f58411c);
                break;
            default:
                c.b(this.f58411c);
                break;
        }
    }
}

package et;

import io.odeeo.internal.e.e;
import io.odeeo.internal.r0.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l.a f55128c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f55129e;

    public /* synthetic */ a(l.a aVar, e eVar, int i10) {
        this.f55127b = i10;
        this.f55128c = aVar;
        this.f55129e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55127b) {
            case 0:
                this.f55128c.b(this.f55129e);
                break;
            default:
                this.f55128c.a(this.f55129e);
                break;
        }
    }
}

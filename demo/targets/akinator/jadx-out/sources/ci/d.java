package ci;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f12333c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f12334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f12335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f12336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f12337h;

    public /* synthetic */ d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f12332b = i10;
        this.f12333c = gVar;
        this.f12334e = runnable;
        this.f12335f = j10;
        this.f12336g = j11;
        this.f12337h = timeUnit;
    }

    @Override // ci.j
    public final ScheduledFuture addCompleter(i iVar) {
        switch (this.f12332b) {
            case 0:
                g gVar = this.f12333c;
                return gVar.f12347c.scheduleAtFixedRate(new e(gVar, this.f12334e, iVar, 0), this.f12335f, this.f12336g, this.f12337h);
            default:
                g gVar2 = this.f12333c;
                return gVar2.f12347c.scheduleWithFixedDelay(new e(gVar2, this.f12334e, iVar, 2), this.f12335f, this.f12336g, this.f12337h);
        }
    }
}

package em;

import io.bidmachine.NetworkAdUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class a implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f54689c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NetworkAdUnit f54690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f54691f;

    public /* synthetic */ a(d dVar, NetworkAdUnit networkAdUnit, u uVar, int i10) {
        this.f54688b = i10;
        this.f54689c = dVar;
        this.f54690e = networkAdUnit;
        this.f54691f = uVar;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f54688b) {
            case 0:
                d dVar = this.f54689c;
                dVar.getClass();
                String id2 = this.f54690e.getId();
                u uVar = this.f54691f;
                return String.format("Reserve ad (networkAdUnitId - %s, %s, %s / %s)", id2, uVar, Integer.valueOf(dVar.d(uVar.getAdsFormat())), Integer.valueOf(dVar.b(uVar.getAdsFormat())));
            default:
                d dVar2 = this.f54689c;
                dVar2.getClass();
                String id3 = this.f54690e.getId();
                u uVar2 = this.f54691f;
                return String.format("UnReserve ad (networkAdUnitId - %s, %s, %s / %s)", id3, uVar2, Integer.valueOf(dVar2.d(uVar2.getAdsFormat())), Integer.valueOf(dVar2.b(uVar2.getAdsFormat())));
        }
    }
}

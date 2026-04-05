package em;

import io.bidmachine.NetworkAdUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class o implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NetworkAdUnit f54715c;

    public /* synthetic */ o(NetworkAdUnit networkAdUnit, int i10) {
        this.f54714b = i10;
        this.f54715c = networkAdUnit;
    }

    @Override // rr.b
    public final Object get() {
        String id2;
        String str;
        String str2;
        switch (this.f54714b) {
            case 0:
                id2 = this.f54715c.getId();
                str = "Fail to load interstitial (Can't find reserved ad by network ad unit id - ";
                str2 = ")";
                break;
            case 1:
                id2 = this.f54715c.getId();
                str = "Fail to load banner (Can't find reserved ad by network ad unit id - ";
                str2 = ")";
                break;
            case 2:
                id2 = this.f54715c.getId();
                str = "Fail to load rewarded (Can't find reserved ad by network ad unit id - ";
                str2 = ")";
                break;
            case 3:
                id2 = this.f54715c.getId();
                str = "unReserveGAMAd (networkAdUnitId - ";
                str2 = ")";
                break;
            case 4:
                id2 = this.f54715c.getId();
                str = "Fail to load rewarded (Can't find reserved GAMAd by network ad unit id - ";
                str2 = ")";
                break;
            case 5:
                id2 = this.f54715c.getId();
                str = "Fail to load interstitial (Can't find reserved GAMAd by network ad unit id - ";
                str2 = ")";
                break;
            default:
                id2 = this.f54715c.getId();
                str = "Fail to load banner (Can't find reserved GAMAd by network ad unit id - ";
                str2 = ")";
                break;
        }
        return a.b.l(str, id2, str2);
    }
}

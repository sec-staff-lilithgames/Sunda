package zk;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.Ve;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ve f98086c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InMobiAdRequestStatus f98087e;

    public /* synthetic */ d0(Ve ve2, InMobiAdRequestStatus inMobiAdRequestStatus, int i10) {
        this.f98085b = i10;
        this.f98086c = ve2;
        this.f98087e = inMobiAdRequestStatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98085b) {
            case 0:
                Ve.a(this.f98086c, this.f98087e);
                break;
            default:
                Ve.b(this.f98086c, this.f98087e);
                break;
        }
    }
}

package zk;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.C2769f9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2769f9 f98153c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdMetaInfo f98154e;

    public /* synthetic */ n0(C2769f9 c2769f9, AdMetaInfo adMetaInfo, int i10) {
        this.f98152b = i10;
        this.f98153c = c2769f9;
        this.f98154e = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98152b) {
            case 0:
                C2769f9.b(this.f98153c, this.f98154e);
                break;
            default:
                C2769f9.a(this.f98153c, this.f98154e);
                break;
        }
    }
}

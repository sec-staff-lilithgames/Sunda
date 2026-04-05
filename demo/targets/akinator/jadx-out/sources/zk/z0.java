package zk;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.C3019u6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class z0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3019u6 f98220c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdMetaInfo f98221e;

    public /* synthetic */ z0(C3019u6 c3019u6, AdMetaInfo adMetaInfo, int i10) {
        this.f98219b = i10;
        this.f98220c = c3019u6;
        this.f98221e = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98219b) {
            case 0:
                C3019u6.a(this.f98220c, this.f98221e);
                break;
            default:
                C3019u6.b(this.f98220c, this.f98221e);
                break;
        }
    }
}

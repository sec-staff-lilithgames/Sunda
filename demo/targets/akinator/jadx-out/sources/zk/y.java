package zk;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.T1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T1 f98210c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdMetaInfo f98211e;

    public /* synthetic */ y(T1 t12, AdMetaInfo adMetaInfo, int i10) {
        this.f98209b = i10;
        this.f98210c = t12;
        this.f98211e = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98209b) {
            case 0:
                T1.b(this.f98210c, this.f98211e);
                break;
            default:
                T1.a(this.f98210c, this.f98211e);
                break;
        }
    }
}

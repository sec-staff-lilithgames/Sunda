package zk;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.G1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G1 f98145c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdMetaInfo f98146e;

    public /* synthetic */ m(G1 g12, AdMetaInfo adMetaInfo, int i10) {
        this.f98144b = i10;
        this.f98145c = g12;
        this.f98146e = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98144b) {
            case 0:
                G1.a(this.f98145c, this.f98146e);
                break;
            default:
                G1.b(this.f98145c, this.f98146e);
                break;
        }
    }
}

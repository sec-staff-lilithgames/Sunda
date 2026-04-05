package zk;

import com.inmobi.media.AbstractC2694b2;
import com.inmobi.media.C3100z2;
import com.inmobi.media.F5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class i1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f98126c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f98127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F5 f98128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC2694b2 f98129g;

    public /* synthetic */ i1(String str, boolean z10, F5 f52, AbstractC2694b2 abstractC2694b2, int i10) {
        this.f98125b = i10;
        this.f98126c = str;
        this.f98127e = z10;
        this.f98128f = f52;
        this.f98129g = abstractC2694b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98125b) {
            case 0:
                C3100z2.a(this.f98126c, this.f98127e, this.f98128f, this.f98129g);
                break;
            default:
                C3100z2.b(this.f98126c, this.f98127e, this.f98128f, this.f98129g);
                break;
        }
    }
}

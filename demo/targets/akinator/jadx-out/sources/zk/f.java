package zk;

import com.inmobi.media.B6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B6 f98097c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f98098e;

    public /* synthetic */ f(B6 b62, String str, int i10) {
        this.f98096b = i10;
        this.f98097c = b62;
        this.f98098e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98096b) {
            case 0:
                B6.a(this.f98097c, this.f98098e);
                break;
            case 1:
                B6.c(this.f98097c, this.f98098e);
                break;
            default:
                B6.b(this.f98097c, this.f98098e);
                break;
        }
    }
}

package zk;

import com.inmobi.media.B6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B6 f98102c;

    public /* synthetic */ g(B6 b62, int i10) {
        this.f98101b = i10;
        this.f98102c = b62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98101b) {
            case 0:
                B6.c(this.f98102c);
                break;
            case 1:
                B6.a(this.f98102c);
                break;
            default:
                B6.b(this.f98102c);
                break;
        }
    }
}

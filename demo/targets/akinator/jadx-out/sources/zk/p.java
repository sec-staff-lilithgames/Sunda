package zk;

import com.inmobi.media.K6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K6 f98164c;

    public /* synthetic */ p(K6 k62, int i10) {
        this.f98163b = i10;
        this.f98164c = k62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98163b) {
            case 0:
                K6.a(this.f98164c);
                break;
            default:
                K6.b(this.f98164c);
                break;
        }
    }
}

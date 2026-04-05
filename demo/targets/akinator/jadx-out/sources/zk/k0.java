package zk;

import com.inmobi.media.C2734d8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f98136c;

    public /* synthetic */ k0(C2734d8 c2734d8, int i10) {
        this.f98135b = i10;
        this.f98136c = c2734d8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98135b) {
            case 0:
                C2734d8.d(this.f98136c);
                break;
            case 1:
                C2734d8.b(this.f98136c);
                break;
            default:
                C2734d8.a(this.f98136c);
                break;
        }
    }
}

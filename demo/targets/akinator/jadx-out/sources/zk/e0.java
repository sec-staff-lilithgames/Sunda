package zk;

import com.inmobi.media.Ve;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ve f98094c;

    public /* synthetic */ e0(Ve ve2, int i10) {
        this.f98093b = i10;
        this.f98094c = ve2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98093b) {
            case 0:
                Ve.b(this.f98094c);
                break;
            case 1:
                Ve.a(this.f98094c);
                break;
            default:
                Ve.c(this.f98094c);
                break;
        }
    }
}

package zk;

import com.inmobi.media.O1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O1 f98193c;

    public /* synthetic */ v(O1 o12, int i10) {
        this.f98192b = i10;
        this.f98193c = o12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98192b) {
            case 0:
                O1.d(this.f98193c);
                break;
            case 1:
                O1.c(this.f98193c);
                break;
            case 2:
                O1.e(this.f98193c);
                break;
            case 3:
                O1.g(this.f98193c);
                break;
            default:
                O1.f(this.f98193c);
                break;
        }
    }
}

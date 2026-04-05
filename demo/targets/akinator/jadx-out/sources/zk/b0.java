package zk;

import com.inmobi.media.Ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ub f98063c;

    public /* synthetic */ b0(Ub ub2, int i10) {
        this.f98062b = i10;
        this.f98063c = ub2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98062b) {
            case 0:
                Ub.a(this.f98063c);
                break;
            default:
                Ub.b(this.f98063c);
                break;
        }
    }
}

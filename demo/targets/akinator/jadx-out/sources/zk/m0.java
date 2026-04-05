package zk;

import com.inmobi.media.C2769f9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class m0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2769f9 f98148c;

    public /* synthetic */ m0(C2769f9 c2769f9, int i10) {
        this.f98147b = i10;
        this.f98148c = c2769f9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98147b) {
            case 0:
                C2769f9.c(this.f98148c);
                break;
            case 1:
                C2769f9.a(this.f98148c);
                break;
            default:
                C2769f9.b(this.f98148c);
                break;
        }
    }
}

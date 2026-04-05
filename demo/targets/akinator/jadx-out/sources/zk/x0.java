package zk;

import com.inmobi.media.C2985s6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class x0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2985s6 f98208c;

    public /* synthetic */ x0(C2985s6 c2985s6, int i10) {
        this.f98207b = i10;
        this.f98208c = c2985s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98207b) {
            case 0:
                C2985s6.c(this.f98208c);
                break;
            case 1:
                C2985s6.e(this.f98208c);
                break;
            case 2:
                C2985s6.d(this.f98208c);
                break;
            default:
                C2985s6.b(this.f98208c);
                break;
        }
    }
}

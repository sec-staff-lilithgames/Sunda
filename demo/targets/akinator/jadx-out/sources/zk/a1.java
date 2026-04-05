package zk;

import com.inmobi.media.C3019u6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3019u6 f98056c;

    public /* synthetic */ a1(C3019u6 c3019u6, int i10) {
        this.f98055b = i10;
        this.f98056c = c3019u6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98055b) {
            case 0:
                C3019u6.b(this.f98056c);
                break;
            case 1:
                C3019u6.a(this.f98056c);
                break;
            default:
                C3019u6.c(this.f98056c);
                break;
        }
    }
}

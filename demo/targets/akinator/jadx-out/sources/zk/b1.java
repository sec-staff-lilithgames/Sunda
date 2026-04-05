package zk;

import com.inmobi.media.C3039v9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3039v9 f98065c;

    public /* synthetic */ b1(C3039v9 c3039v9, int i10) {
        this.f98064b = i10;
        this.f98065c = c3039v9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98064b) {
            case 0:
                C3039v9.b(this.f98065c);
                break;
            case 1:
                C3039v9.c(this.f98065c);
                break;
            case 2:
                C3039v9.a(this.f98065c);
                break;
            default:
                C3039v9.e(this.f98065c);
                break;
        }
    }
}

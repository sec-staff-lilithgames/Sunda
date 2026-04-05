package zk;

import com.inmobi.media.B6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B6 f98109c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f98110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f98111f;

    public /* synthetic */ h(B6 b62, boolean z10, String str, int i10) {
        this.f98108b = i10;
        this.f98109c = b62;
        this.f98110e = z10;
        this.f98111f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98108b) {
            case 0:
                B6.a(this.f98109c, this.f98110e, this.f98111f);
                break;
            default:
                B6.b(this.f98109c, this.f98110e, this.f98111f);
                break;
        }
    }
}

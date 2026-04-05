package zk;

import com.inmobi.media.B6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B6 f98090c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f98091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f98092f;

    public /* synthetic */ e(B6 b62, String str, String str2, int i10) {
        this.f98089b = i10;
        this.f98090c = b62;
        this.f98091e = str;
        this.f98092f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98089b) {
            case 0:
                B6.c(this.f98090c, this.f98091e, this.f98092f);
                break;
            case 1:
                B6.f(this.f98090c, this.f98091e, this.f98092f);
                break;
            case 2:
                B6.d(this.f98090c, this.f98091e, this.f98092f);
                break;
            case 3:
                B6.a(this.f98090c, this.f98091e, this.f98092f);
                break;
            case 4:
                B6.e(this.f98090c, this.f98091e, this.f98092f);
                break;
            default:
                B6.b(this.f98090c, this.f98091e, this.f98092f);
                break;
        }
    }
}

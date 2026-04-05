package xn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class a0 implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.media3.common.b f92045c;

    public /* synthetic */ a0(io.bidmachine.media3.common.b bVar, int i10) {
        this.f92044b = i10;
        this.f92045c = bVar;
    }

    @Override // xn.g0
    public final int getScore(Object obj) {
        switch (this.f92044b) {
            case 0:
                try {
                    return ((s) obj).isFormatSupported(this.f92045c) ? 1 : 0;
                } catch (c0 unused) {
                    return -1;
                }
            default:
                return ((s) obj).isFormatFunctionallySupported(this.f92045c) ? 1 : 0;
        }
    }
}

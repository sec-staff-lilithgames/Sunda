package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class k implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79642c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f79644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f79645g;

    public /* synthetic */ k(b bVar, int i10, long j10, long j11, int i11) {
        this.f79641b = i11;
        this.f79642c = bVar;
        this.f79643e = i10;
        this.f79644f = j10;
        this.f79645g = j11;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79641b) {
            case 0:
                ((c0) dVar).onAudioUnderrun(this.f79642c, this.f79643e, this.f79644f, this.f79645g);
                break;
            default:
                ((c0) dVar).onBandwidthEstimate(this.f79642c, this.f79643e, this.f79644f, this.f79645g);
                break;
        }
    }
}

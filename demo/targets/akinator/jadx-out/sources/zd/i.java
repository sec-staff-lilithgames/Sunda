package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97827c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f97828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f97829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f97830g;

    public /* synthetic */ i(b bVar, int i10, long j10, long j11, int i11) {
        this.f97826b = i11;
        this.f97827c = bVar;
        this.f97828e = i10;
        this.f97829f = j10;
        this.f97830g = j11;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97826b) {
            case 0:
                ((z) dVar).onAudioUnderrun(this.f97827c, this.f97828e, this.f97829f, this.f97830g);
                break;
            default:
                ((z) dVar).onBandwidthEstimate(this.f97827c, this.f97828e, this.f97829f, this.f97830g);
                break;
        }
    }
}

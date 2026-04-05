package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class u implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97867b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97868c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f97869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f97870f;

    public /* synthetic */ u(b bVar, int i10, long j10) {
        this.f97868c = bVar;
        this.f97870f = i10;
        this.f97869e = j10;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97867b) {
            case 0:
                ((z) dVar).onDroppedVideoFrames(this.f97868c, this.f97870f, this.f97869e);
                break;
            default:
                ((z) dVar).onVideoFrameProcessingOffset(this.f97868c, this.f97869e, this.f97870f);
                break;
        }
    }

    public /* synthetic */ u(b bVar, long j10, int i10) {
        this.f97868c = bVar;
        this.f97869e = j10;
        this.f97870f = i10;
    }
}

package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class h implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79632b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79633c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f79635f;

    public /* synthetic */ h(b bVar, int i10, long j10) {
        this.f79633c = bVar;
        this.f79634e = i10;
        this.f79635f = j10;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79632b) {
            case 0:
                ((c0) dVar).onVideoFrameProcessingOffset(this.f79633c, this.f79635f, this.f79634e);
                break;
            default:
                ((c0) dVar).onDroppedVideoFrames(this.f79633c, this.f79634e, this.f79635f);
                break;
        }
    }

    public /* synthetic */ h(b bVar, long j10, int i10) {
        this.f79633c = bVar;
        this.f79635f = j10;
        this.f79634e = i10;
    }
}

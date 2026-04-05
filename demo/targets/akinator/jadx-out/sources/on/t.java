package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class t implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79674c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f79675e;

    public /* synthetic */ t(b bVar, long j10, int i10) {
        this.f79673b = i10;
        this.f79674c = bVar;
        this.f79675e = j10;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79673b) {
            case 0:
                ((c0) dVar).onMaxSeekToPreviousPositionChanged(this.f79674c, this.f79675e);
                break;
            case 1:
                ((c0) dVar).onAudioPositionAdvancing(this.f79674c, this.f79675e);
                break;
            case 2:
                ((c0) dVar).onSeekForwardIncrementChanged(this.f79674c, this.f79675e);
                break;
            default:
                ((c0) dVar).onSeekBackIncrementChanged(this.f79674c, this.f79675e);
                break;
        }
    }
}

package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class r implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79667c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.media3.exoplayer.audio.p f79668e;

    public /* synthetic */ r(b bVar, io.bidmachine.media3.exoplayer.audio.p pVar, int i10) {
        this.f79666b = i10;
        this.f79667c = bVar;
        this.f79668e = pVar;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79666b) {
            case 0:
                ((c0) dVar).onAudioTrackReleased(this.f79667c, this.f79668e);
                break;
            default:
                ((c0) dVar).onAudioTrackInitialized(this.f79667c, this.f79668e);
                break;
        }
    }
}

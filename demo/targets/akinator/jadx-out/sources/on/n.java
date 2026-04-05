package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class n implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79654c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79655e;

    public /* synthetic */ n(b bVar, int i10, int i11) {
        this.f79653b = i11;
        this.f79654c = bVar;
        this.f79655e = i10;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79653b) {
            case 0:
                ((c0) dVar).onTimelineChanged(this.f79654c, this.f79655e);
                break;
            case 1:
                ((c0) dVar).onRepeatModeChanged(this.f79654c, this.f79655e);
                break;
            case 2:
                c0 c0Var = (c0) dVar;
                b bVar = this.f79654c;
                c0Var.onDrmSessionAcquired(bVar);
                c0Var.onDrmSessionAcquired(bVar, this.f79655e);
                break;
            case 3:
                ((c0) dVar).onPlaybackStateChanged(this.f79654c, this.f79655e);
                break;
            case 4:
                ((c0) dVar).onPlaybackSuppressionReasonChanged(this.f79654c, this.f79655e);
                break;
            default:
                ((c0) dVar).onAudioSessionIdChanged(this.f79654c, this.f79655e);
                break;
        }
    }
}

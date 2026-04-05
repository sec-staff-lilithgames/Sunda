package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f60970c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f60971e;

    public /* synthetic */ l(n nVar, p pVar, int i10) {
        this.f60969b = i10;
        this.f60970c = nVar;
        this.f60971e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60969b) {
            case 0:
                ((io.bidmachine.media3.exoplayer.j0) ((o) io.bidmachine.media3.common.util.a1.castNonNull(this.f60970c.f60991b))).onAudioTrackInitialized(this.f60971e);
                break;
            default:
                ((io.bidmachine.media3.exoplayer.j0) ((o) io.bidmachine.media3.common.util.a1.castNonNull(this.f60970c.f60991b))).onAudioTrackReleased(this.f60971e);
                break;
        }
    }
}

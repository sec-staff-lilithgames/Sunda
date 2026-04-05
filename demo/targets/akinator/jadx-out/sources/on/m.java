package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class m implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79651c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.media3.exoplayer.j f79652e;

    public /* synthetic */ m(b bVar, io.bidmachine.media3.exoplayer.j jVar, int i10) {
        this.f79650b = i10;
        this.f79651c = bVar;
        this.f79652e = jVar;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79650b) {
            case 0:
                ((c0) dVar).onVideoEnabled(this.f79651c, this.f79652e);
                break;
            case 1:
                ((c0) dVar).onVideoDisabled(this.f79651c, this.f79652e);
                break;
            case 2:
                ((c0) dVar).onAudioEnabled(this.f79651c, this.f79652e);
                break;
            default:
                ((c0) dVar).onAudioDisabled(this.f79651c, this.f79652e);
                break;
        }
    }
}

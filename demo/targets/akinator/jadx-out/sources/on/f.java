package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class f implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79621c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.media3.common.b f79622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.media3.exoplayer.k f79623f;

    public /* synthetic */ f(b bVar, io.bidmachine.media3.common.b bVar2, io.bidmachine.media3.exoplayer.k kVar, int i10) {
        this.f79620b = i10;
        this.f79621c = bVar;
        this.f79622e = bVar2;
        this.f79623f = kVar;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79620b) {
            case 0:
                ((c0) dVar).onAudioInputFormatChanged(this.f79621c, this.f79622e, this.f79623f);
                break;
            default:
                ((c0) dVar).onVideoInputFormatChanged(this.f79621c, this.f79622e, this.f79623f);
                break;
        }
    }
}

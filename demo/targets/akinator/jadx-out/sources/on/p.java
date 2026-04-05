package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class p implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79660c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f79661e;

    public /* synthetic */ p(b bVar, Exception exc, int i10) {
        this.f79659b = i10;
        this.f79660c = bVar;
        this.f79661e = exc;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79659b) {
            case 0:
                ((c0) dVar).onVideoCodecError(this.f79660c, this.f79661e);
                break;
            case 1:
                ((c0) dVar).onAudioCodecError(this.f79660c, this.f79661e);
                break;
            case 2:
                ((c0) dVar).onAudioSinkError(this.f79660c, this.f79661e);
                break;
            default:
                ((c0) dVar).onDrmSessionManagerError(this.f79660c, this.f79661e);
                break;
        }
    }
}

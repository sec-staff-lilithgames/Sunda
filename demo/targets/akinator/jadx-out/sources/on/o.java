package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class o implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79657c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f79658e;

    public /* synthetic */ o(b bVar, String str, int i10) {
        this.f79656b = i10;
        this.f79657c = bVar;
        this.f79658e = str;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79656b) {
            case 0:
                ((c0) dVar).onAudioDecoderReleased(this.f79657c, this.f79658e);
                break;
            default:
                ((c0) dVar).onVideoDecoderReleased(this.f79657c, this.f79658e);
                break;
        }
    }
}

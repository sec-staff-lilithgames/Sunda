package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class v implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79680c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f79681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f79682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f79683g;

    public /* synthetic */ v(b bVar, String str, long j10, long j11, int i10) {
        this.f79679b = i10;
        this.f79680c = bVar;
        this.f79681e = str;
        this.f79682f = j10;
        this.f79683g = j11;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79679b) {
            case 0:
                c0 c0Var = (c0) dVar;
                b bVar = this.f79680c;
                String str = this.f79681e;
                long j10 = this.f79682f;
                c0Var.onAudioDecoderInitialized(bVar, str, j10);
                c0Var.onAudioDecoderInitialized(bVar, str, this.f79683g, j10);
                break;
            default:
                c0 c0Var2 = (c0) dVar;
                b bVar2 = this.f79680c;
                String str2 = this.f79681e;
                long j11 = this.f79682f;
                c0Var2.onVideoDecoderInitialized(bVar2, str2, j11);
                c0Var2.onVideoDecoderInitialized(bVar2, str2, this.f79683g, j11);
                break;
        }
    }
}

package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97832c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f97833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f97834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f97835g;

    public /* synthetic */ j(b bVar, String str, long j10, long j11, int i10) {
        this.f97831b = i10;
        this.f97832c = bVar;
        this.f97833e = str;
        this.f97834f = j10;
        this.f97835g = j11;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97831b) {
            case 0:
                z zVar = (z) dVar;
                b bVar = this.f97832c;
                String str = this.f97833e;
                long j10 = this.f97834f;
                zVar.onAudioDecoderInitialized(bVar, str, j10);
                zVar.onAudioDecoderInitialized(bVar, str, this.f97835g, j10);
                break;
            default:
                z zVar2 = (z) dVar;
                b bVar2 = this.f97832c;
                String str2 = this.f97833e;
                long j11 = this.f97834f;
                zVar2.onVideoDecoderInitialized(bVar2, str2, j11);
                zVar2.onVideoDecoderInitialized(bVar2, str2, this.f97835g, j11);
                break;
        }
    }
}

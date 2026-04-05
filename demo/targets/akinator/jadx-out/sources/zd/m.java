package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class m implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97844c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f97845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f97846f;

    public /* synthetic */ m(b bVar, int i10, boolean z10) {
        this.f97843b = 2;
        this.f97844c = bVar;
        this.f97846f = i10;
        this.f97845e = z10;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97843b) {
            case 0:
                ((z) dVar).onPlayerStateChanged(this.f97844c, this.f97845e, this.f97846f);
                break;
            case 1:
                ((z) dVar).onPlayWhenReadyChanged(this.f97844c, this.f97845e, this.f97846f);
                break;
            default:
                ((z) dVar).onDeviceVolumeChanged(this.f97844c, this.f97846f, this.f97845e);
                break;
        }
    }

    public /* synthetic */ m(b bVar, boolean z10, int i10, int i11) {
        this.f97843b = i11;
        this.f97844c = bVar;
        this.f97845e = z10;
        this.f97846f = i10;
    }
}

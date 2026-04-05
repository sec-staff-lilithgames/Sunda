package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class l implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79647c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f79648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f79649f;

    public /* synthetic */ l(b bVar, int i10, int i11, boolean z10) {
        this.f79646b = i11;
        this.f79647c = bVar;
        this.f79648e = z10;
        this.f79649f = i10;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79646b) {
            case 0:
                ((c0) dVar).onDeviceVolumeChanged(this.f79647c, this.f79649f, this.f79648e);
                break;
            case 1:
                ((c0) dVar).onPlayWhenReadyChanged(this.f79647c, this.f79648e, this.f79649f);
                break;
            default:
                ((c0) dVar).onPlayerStateChanged(this.f79647c, this.f79648e, this.f79649f);
                break;
        }
    }

    public /* synthetic */ l(b bVar, int i10, boolean z10) {
        this.f79646b = 0;
        this.f79647c = bVar;
        this.f79649f = i10;
        this.f79648e = z10;
    }
}

package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97817c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f97818e;

    public /* synthetic */ f(b bVar, int i10, boolean z10) {
        this.f97816b = i10;
        this.f97817c = bVar;
        this.f97818e = z10;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97816b) {
            case 0:
                ((z) dVar).onSkipSilenceEnabledChanged(this.f97817c, this.f97818e);
                break;
            case 1:
                ((z) dVar).onIsPlayingChanged(this.f97817c, this.f97818e);
                break;
            case 2:
                ((z) dVar).onShuffleModeChanged(this.f97817c, this.f97818e);
                break;
            default:
                z zVar = (z) dVar;
                b bVar = this.f97817c;
                boolean z10 = this.f97818e;
                zVar.onLoadingChanged(bVar, z10);
                zVar.onIsLoadingChanged(bVar, z10);
                break;
        }
    }
}

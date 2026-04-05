package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class u implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79677c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f79678e;

    public /* synthetic */ u(b bVar, int i10, boolean z10) {
        this.f79676b = i10;
        this.f79677c = bVar;
        this.f79678e = z10;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79676b) {
            case 0:
                ((c0) dVar).onShuffleModeChanged(this.f79677c, this.f79678e);
                break;
            case 1:
                ((c0) dVar).onSkipSilenceEnabledChanged(this.f79677c, this.f79678e);
                break;
            case 2:
                c0 c0Var = (c0) dVar;
                b bVar = this.f79677c;
                boolean z10 = this.f79678e;
                c0Var.onLoadingChanged(bVar, z10);
                c0Var.onIsLoadingChanged(bVar, z10);
                break;
            default:
                ((c0) dVar).onIsPlayingChanged(this.f79677c, this.f79678e);
                break;
        }
    }
}

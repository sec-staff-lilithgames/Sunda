package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class l implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97840c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bf.t f97841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bf.y f97842f;

    public /* synthetic */ l(b bVar, bf.t tVar, bf.y yVar, int i10) {
        this.f97839b = i10;
        this.f97840c = bVar;
        this.f97841e = tVar;
        this.f97842f = yVar;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97839b) {
            case 0:
                ((z) dVar).onLoadCompleted(this.f97840c, this.f97841e, this.f97842f);
                break;
            case 1:
                ((z) dVar).onLoadStarted(this.f97840c, this.f97841e, this.f97842f);
                break;
            default:
                ((z) dVar).onLoadCanceled(this.f97840c, this.f97841e, this.f97842f);
                break;
        }
    }
}

package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class p implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97853c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bf.y f97854e;

    public /* synthetic */ p(b bVar, bf.y yVar, int i10) {
        this.f97852b = i10;
        this.f97853c = bVar;
        this.f97854e = yVar;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97852b) {
            case 0:
                ((z) dVar).onDownstreamFormatChanged(this.f97853c, this.f97854e);
                break;
            default:
                ((z) dVar).onUpstreamDiscarded(this.f97853c, this.f97854e);
                break;
        }
    }
}

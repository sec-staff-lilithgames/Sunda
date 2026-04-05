package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class r implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97859c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce.f f97860e;

    public /* synthetic */ r(b bVar, ce.f fVar, int i10) {
        this.f97858b = i10;
        this.f97859c = bVar;
        this.f97860e = fVar;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97858b) {
            case 0:
                ((z) dVar).onVideoEnabled(this.f97859c, this.f97860e);
                break;
            case 1:
                ((z) dVar).onAudioDisabled(this.f97859c, this.f97860e);
                break;
            case 2:
                ((z) dVar).onVideoDisabled(this.f97859c, this.f97860e);
                break;
            default:
                ((z) dVar).onAudioEnabled(this.f97859c, this.f97860e);
                break;
        }
    }
}

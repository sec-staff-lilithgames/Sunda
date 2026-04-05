package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97850c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f97851e;

    public /* synthetic */ o(b bVar, int i10, int i11) {
        this.f97849b = i11;
        this.f97850c = bVar;
        this.f97851e = i10;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97849b) {
            case 0:
                ((z) dVar).onAudioSessionIdChanged(this.f97850c, this.f97851e);
                break;
            case 1:
                ((z) dVar).onPlaybackStateChanged(this.f97850c, this.f97851e);
                break;
            case 2:
                ((z) dVar).onRepeatModeChanged(this.f97850c, this.f97851e);
                break;
            case 3:
                ((z) dVar).onPlaybackSuppressionReasonChanged(this.f97850c, this.f97851e);
                break;
            case 4:
                ((z) dVar).onTimelineChanged(this.f97850c, this.f97851e);
                break;
            default:
                z zVar = (z) dVar;
                b bVar = this.f97850c;
                zVar.onDrmSessionAcquired(bVar);
                zVar.onDrmSessionAcquired(bVar, this.f97851e);
                break;
        }
    }
}

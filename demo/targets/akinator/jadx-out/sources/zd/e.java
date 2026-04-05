package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97814c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f97815e;

    public /* synthetic */ e(b bVar, long j10, int i10) {
        this.f97813b = i10;
        this.f97814c = bVar;
        this.f97815e = j10;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97813b) {
            case 0:
                ((z) dVar).onSeekForwardIncrementChanged(this.f97814c, this.f97815e);
                break;
            case 1:
                ((z) dVar).onSeekBackIncrementChanged(this.f97814c, this.f97815e);
                break;
            case 2:
                ((z) dVar).onAudioPositionAdvancing(this.f97814c, this.f97815e);
                break;
            default:
                ((z) dVar).onMaxSeekToPreviousPositionChanged(this.f97814c, this.f97815e);
                break;
        }
    }
}

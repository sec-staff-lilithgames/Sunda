package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class s implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97862c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f97863e;

    public /* synthetic */ s(b bVar, String str, int i10) {
        this.f97861b = i10;
        this.f97862c = bVar;
        this.f97863e = str;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97861b) {
            case 0:
                ((z) dVar).onAudioDecoderReleased(this.f97862c, this.f97863e);
                break;
            default:
                ((z) dVar).onVideoDecoderReleased(this.f97862c, this.f97863e);
                break;
        }
    }
}

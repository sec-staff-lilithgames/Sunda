package zd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class n implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97848c;

    public /* synthetic */ n(b bVar, int i10) {
        this.f97847b = i10;
        this.f97848c = bVar;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97847b) {
            case 0:
                ((z) dVar).onSeekStarted(this.f97848c);
                break;
            case 1:
                ((z) dVar).onDrmKeysLoaded(this.f97848c);
                break;
            case 2:
                ((z) dVar).onDrmSessionReleased(this.f97848c);
                break;
            case 3:
                ((z) dVar).onDrmKeysRestored(this.f97848c);
                break;
            case 4:
                ((z) dVar).onPlayerReleased(this.f97848c);
                break;
            default:
                ((z) dVar).onDrmKeysRemoved(this.f97848c);
                break;
        }
    }
}

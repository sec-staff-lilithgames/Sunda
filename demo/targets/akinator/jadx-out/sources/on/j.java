package on;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class j implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79640c;

    public /* synthetic */ j(b bVar, int i10) {
        this.f79639b = i10;
        this.f79640c = bVar;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79639b) {
            case 0:
                ((c0) dVar).onDrmKeysRestored(this.f79640c);
                break;
            case 1:
                ((c0) dVar).onDrmSessionReleased(this.f79640c);
                break;
            case 2:
                ((c0) dVar).onSeekStarted(this.f79640c);
                break;
            case 3:
                ((c0) dVar).onDrmKeysRemoved(this.f79640c);
                break;
            case 4:
                ((c0) dVar).onDrmKeysLoaded(this.f79640c);
                break;
            default:
                ((c0) dVar).onPlayerReleased(this.f79640c);
                break;
        }
    }
}

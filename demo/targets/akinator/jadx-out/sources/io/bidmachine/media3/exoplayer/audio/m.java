package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f60985c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.media3.exoplayer.j f60986e;

    public /* synthetic */ m(n nVar, io.bidmachine.media3.exoplayer.j jVar, int i10) {
        this.f60984b = i10;
        this.f60985c = nVar;
        this.f60986e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60984b) {
            case 0:
                n nVar = this.f60985c;
                nVar.getClass();
                io.bidmachine.media3.exoplayer.j jVar = this.f60986e;
                jVar.ensureUpdated();
                ((io.bidmachine.media3.exoplayer.j0) ((o) io.bidmachine.media3.common.util.a1.castNonNull(nVar.f60991b))).onAudioDisabled(jVar);
                break;
            default:
                ((io.bidmachine.media3.exoplayer.j0) ((o) io.bidmachine.media3.common.util.a1.castNonNull(this.f60985c.f60991b))).onAudioEnabled(this.f60986e);
                break;
        }
    }
}

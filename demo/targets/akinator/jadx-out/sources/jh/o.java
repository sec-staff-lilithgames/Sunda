package jh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f69562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f69563c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f69564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f69565f;

    public o(p pVar, a aVar, int i10, int i11) {
        this.f69565f = pVar;
        this.f69562b = aVar;
        this.f69563c = i10;
        this.f69564e = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f69562b;
        this.f69565f.zzk(new b(aVar.sessionId(), this.f69563c, this.f69564e, aVar.bytesDownloaded(), aVar.totalBytesToDownload(), aVar.b(), aVar.a(), aVar.resolutionIntent(), aVar.c()));
    }
}

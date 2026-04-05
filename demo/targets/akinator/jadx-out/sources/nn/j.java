package nn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f77088b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f77088b = kVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (this.f77088b.e());
    }
}

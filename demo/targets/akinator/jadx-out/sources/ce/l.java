package ce;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ef.i f12249b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ef.i iVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f12249b = iVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (this.f12249b.b());
    }
}

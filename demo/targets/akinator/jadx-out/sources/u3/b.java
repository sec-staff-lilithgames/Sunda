package u3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f87783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f87784c;

    public b(p pVar, int i10) {
        this.f87783b = pVar;
        this.f87784c = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87783b.onTypefaceRequestFailed(this.f87784c);
    }
}

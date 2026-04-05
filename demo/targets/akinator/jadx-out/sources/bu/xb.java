package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class xb implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f11223b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11224c;

    public xb(long j10, wb wbVar) {
        this.f11224c = j10;
        this.f11223b = wbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bu.wb, java.lang.Object] */
    @Override // java.lang.Runnable
    public void run() {
        this.f11223b.onTimeout(this.f11224c);
    }
}

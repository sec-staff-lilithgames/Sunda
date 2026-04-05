package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class pd implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Number f96134b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96135c;

    /* JADX WARN: Multi-variable type inference failed */
    public pd(long j10, od odVar) {
        this.f96135c = j10;
        this.f96134b = (Number) odVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Number, yt.od] */
    @Override // java.lang.Runnable
    public void run() {
        this.f96134b.onTimeout(this.f96135c);
    }
}

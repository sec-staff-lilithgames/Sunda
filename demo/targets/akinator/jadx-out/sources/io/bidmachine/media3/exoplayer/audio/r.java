package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f61010b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f61011c;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(int i10, int i11, int i12, int i13, io.bidmachine.media3.common.b bVar, boolean z10, Exception exc) {
        StringBuilder sbF = w0.i.f(i10, i11, "AudioTrack init failed ", " Config(", ", ");
        a.b.x(i12, i13, ", ", ") ", sbF);
        sbF.append(bVar);
        sbF.append(z10 ? " (recoverable)" : "");
        this(sbF.toString(), i10, bVar, z10, exc);
    }

    public r(String str, int i10, io.bidmachine.media3.common.b bVar, boolean z10, Throwable th2) {
        super(str, th2);
        this.f61010b = i10;
        this.f61011c = z10;
    }
}

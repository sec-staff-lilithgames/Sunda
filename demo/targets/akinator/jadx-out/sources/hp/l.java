package hp;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final long f59108b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f59109c;

    public l(long j10, byte[] bArr) {
        this.f59108b = j10;
        this.f59109c = bArr;
    }

    @Override // java.lang.Comparable
    public int compareTo(l lVar) {
        return Long.compare(this.f59108b, lVar.f59108b);
    }
}

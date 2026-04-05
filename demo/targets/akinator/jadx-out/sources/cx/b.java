package cx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* renamed from: b, reason: collision with root package name */
    public final int f51271b;

    /* renamed from: c, reason: collision with root package name */
    public final String f51272c;

    b(int i10, String str) {
        this.f51271b = i10;
        this.f51272c = str;
    }

    public int toInt() {
        return this.f51271b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f51272c;
    }
}

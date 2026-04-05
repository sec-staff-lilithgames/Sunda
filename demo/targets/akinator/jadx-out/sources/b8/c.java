package b8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: b, reason: collision with root package name */
    public final String f8920b;

    c(String str) {
        this.f8920b = str;
    }

    public String tempExtension() {
        return ".temp" + this.f8920b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f8920b;
    }
}

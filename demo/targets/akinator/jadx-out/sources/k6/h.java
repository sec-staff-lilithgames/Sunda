package k6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f70593a;

    /* renamed from: b, reason: collision with root package name */
    public String f70594b;

    /* renamed from: c, reason: collision with root package name */
    public String f70595c;

    public h() {
    }

    public i build() {
        String str;
        String str2;
        String str3 = this.f70593a;
        if (str3 == null || str3.trim().isEmpty() || (str = this.f70594b) == null || str.trim().isEmpty() || (str2 = this.f70595c) == null || str2.trim().isEmpty()) {
            throw new IllegalStateException("Brand name, major version and full version should not be null or blank.");
        }
        return new i(this.f70593a, this.f70594b, this.f70595c);
    }

    public h setBrand(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand should not be blank.");
        }
        this.f70593a = str;
        return this;
    }

    public h setFullVersion(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("FullVersion should not be blank.");
        }
        this.f70595c = str;
        return this;
    }

    public h setMajorVersion(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("MajorVersion should not be blank.");
        }
        this.f70594b = str;
        return this;
    }

    public h(i iVar) {
        this.f70593a = iVar.getBrand();
        this.f70594b = iVar.getMajorVersion();
        this.f70595c = iVar.getFullVersion();
    }
}

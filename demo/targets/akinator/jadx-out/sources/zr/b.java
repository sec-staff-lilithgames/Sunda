package zr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98460a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f98461b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f98462c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f98463d;

    public b(boolean z10) {
        this.f98460a = z10;
    }

    public c build() {
        return new c(this);
    }

    public b cipherSuites(a... aVarArr) {
        if (!this.f98460a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            strArr[i10] = aVarArr[i10].f98459b;
        }
        this.f98461b = strArr;
        return this;
    }

    public b supportsTlsExtensions(boolean z10) {
        if (!this.f98460a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        this.f98463d = z10;
        return this;
    }

    public b tlsVersions(r... rVarArr) {
        if (!this.f98460a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (rVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            strArr[i10] = rVarArr[i10].f98523b;
        }
        this.f98462c = strArr;
        return this;
    }

    public b(c cVar) {
        this.f98460a = cVar.f98465a;
        this.f98461b = cVar.f98466b;
        this.f98462c = cVar.f98467c;
        this.f98463d = cVar.f98468d;
    }

    public b cipherSuites(String... strArr) {
        if (!this.f98460a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr == null) {
            this.f98461b = null;
            return this;
        }
        this.f98461b = (String[]) strArr.clone();
        return this;
    }

    public b tlsVersions(String... strArr) {
        if (!this.f98460a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr == null) {
            this.f98462c = null;
            return this;
        }
        this.f98462c = (String[]) strArr.clone();
        return this;
    }
}

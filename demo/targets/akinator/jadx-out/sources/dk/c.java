package dk;

import dk.f;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public String f52357a;

    /* renamed from: b, reason: collision with root package name */
    public String f52358b;

    /* renamed from: c, reason: collision with root package name */
    public String f52359c;

    /* renamed from: d, reason: collision with root package name */
    public String f52360d;

    /* renamed from: e, reason: collision with root package name */
    public long f52361e;

    /* renamed from: f, reason: collision with root package name */
    public byte f52362f;

    @Override // dk.f.a
    public f build() {
        if (this.f52362f == 1 && this.f52357a != null && this.f52358b != null && this.f52359c != null && this.f52360d != null) {
            return new d(this.f52357a, this.f52358b, this.f52359c, this.f52360d, this.f52361e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f52357a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f52358b == null) {
            sb2.append(" variantId");
        }
        if (this.f52359c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f52360d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f52362f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // dk.f.a
    public f.a setParameterKey(String str) {
        if (str == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f52359c = str;
        return this;
    }

    @Override // dk.f.a
    public f.a setParameterValue(String str) {
        if (str == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f52360d = str;
        return this;
    }

    @Override // dk.f.a
    public f.a setRolloutId(String str) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f52357a = str;
        return this;
    }

    @Override // dk.f.a
    public f.a setTemplateVersion(long j10) {
        this.f52361e = j10;
        this.f52362f = (byte) (this.f52362f | 1);
        return this;
    }

    @Override // dk.f.a
    public f.a setVariantId(String str) {
        if (str == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f52358b = str;
        return this;
    }
}

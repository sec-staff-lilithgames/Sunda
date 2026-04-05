package tj;

import j1.o2;
import tj.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a extends k.a {

    /* renamed from: a, reason: collision with root package name */
    public String f86919a;

    /* renamed from: b, reason: collision with root package name */
    public Long f86920b;

    /* renamed from: c, reason: collision with root package name */
    public Long f86921c;

    @Override // tj.k.a
    public k build() {
        String strL = this.f86919a == null ? " token" : "";
        if (this.f86920b == null) {
            strL = strL.concat(" tokenExpirationTimestamp");
        }
        if (this.f86921c == null) {
            strL = o2.l(strL, " tokenCreationTimestamp");
        }
        if (strL.isEmpty()) {
            return new b(this.f86919a, this.f86920b.longValue(), this.f86921c.longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    @Override // tj.k.a
    public k.a setToken(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f86919a = str;
        return this;
    }

    @Override // tj.k.a
    public k.a setTokenCreationTimestamp(long j10) {
        this.f86921c = Long.valueOf(j10);
        return this;
    }

    @Override // tj.k.a
    public k.a setTokenExpirationTimestamp(long j10) {
        this.f86920b = Long.valueOf(j10);
        return this;
    }
}

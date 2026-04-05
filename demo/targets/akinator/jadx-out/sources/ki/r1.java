package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r1 extends f2.e.d.AbstractC0731e.a {

    /* renamed from: a, reason: collision with root package name */
    public f2.e.d.AbstractC0731e.b f71434a;

    /* renamed from: b, reason: collision with root package name */
    public String f71435b;

    /* renamed from: c, reason: collision with root package name */
    public String f71436c;

    /* renamed from: d, reason: collision with root package name */
    public long f71437d;

    /* renamed from: e, reason: collision with root package name */
    public byte f71438e;

    @Override // ki.f2.e.d.AbstractC0731e.a
    public f2.e.d.AbstractC0731e build() {
        f2.e.d.AbstractC0731e.b bVar;
        String str;
        String str2;
        if (this.f71438e == 1 && (bVar = this.f71434a) != null && (str = this.f71435b) != null && (str2 = this.f71436c) != null) {
            return new s1(bVar, str, str2, this.f71437d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71434a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f71435b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f71436c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f71438e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.AbstractC0731e.a
    public f2.e.d.AbstractC0731e.a setParameterKey(String str) {
        if (str == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f71435b = str;
        return this;
    }

    @Override // ki.f2.e.d.AbstractC0731e.a
    public f2.e.d.AbstractC0731e.a setParameterValue(String str) {
        if (str == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f71436c = str;
        return this;
    }

    @Override // ki.f2.e.d.AbstractC0731e.a
    public f2.e.d.AbstractC0731e.a setRolloutVariant(f2.e.d.AbstractC0731e.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Null rolloutVariant");
        }
        this.f71434a = bVar;
        return this;
    }

    @Override // ki.f2.e.d.AbstractC0731e.a
    public f2.e.d.AbstractC0731e.a setTemplateVersion(long j10) {
        this.f71437d = j10;
        this.f71438e = (byte) (this.f71438e | 1);
        return this;
    }
}

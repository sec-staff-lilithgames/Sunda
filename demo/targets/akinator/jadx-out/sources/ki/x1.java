package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x1 extends f2.e.AbstractC0732e.a {

    /* renamed from: a, reason: collision with root package name */
    public int f71516a;

    /* renamed from: b, reason: collision with root package name */
    public String f71517b;

    /* renamed from: c, reason: collision with root package name */
    public String f71518c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f71519d;

    /* renamed from: e, reason: collision with root package name */
    public byte f71520e;

    @Override // ki.f2.e.AbstractC0732e.a
    public f2.e.AbstractC0732e build() {
        String str;
        String str2;
        if (this.f71520e == 3 && (str = this.f71517b) != null && (str2 = this.f71518c) != null) {
            return new y1(this.f71516a, str, str2, this.f71519d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f71520e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f71517b == null) {
            sb2.append(" version");
        }
        if (this.f71518c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f71520e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.AbstractC0732e.a
    public f2.e.AbstractC0732e.a setBuildVersion(String str) {
        if (str == null) {
            throw new NullPointerException("Null buildVersion");
        }
        this.f71518c = str;
        return this;
    }

    @Override // ki.f2.e.AbstractC0732e.a
    public f2.e.AbstractC0732e.a setJailbroken(boolean z10) {
        this.f71519d = z10;
        this.f71520e = (byte) (this.f71520e | 2);
        return this;
    }

    @Override // ki.f2.e.AbstractC0732e.a
    public f2.e.AbstractC0732e.a setPlatform(int i10) {
        this.f71516a = i10;
        this.f71520e = (byte) (this.f71520e | 1);
        return this;
    }

    @Override // ki.f2.e.AbstractC0732e.a
    public f2.e.AbstractC0732e.a setVersion(String str) {
        if (str == null) {
            throw new NullPointerException("Null version");
        }
        this.f71517b = str;
        return this;
    }
}

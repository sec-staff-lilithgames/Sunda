package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b0 extends f2.b {

    /* renamed from: a, reason: collision with root package name */
    public String f71138a;

    /* renamed from: b, reason: collision with root package name */
    public String f71139b;

    /* renamed from: c, reason: collision with root package name */
    public int f71140c;

    /* renamed from: d, reason: collision with root package name */
    public String f71141d;

    /* renamed from: e, reason: collision with root package name */
    public String f71142e;

    /* renamed from: f, reason: collision with root package name */
    public String f71143f;

    /* renamed from: g, reason: collision with root package name */
    public String f71144g;

    /* renamed from: h, reason: collision with root package name */
    public String f71145h;

    /* renamed from: i, reason: collision with root package name */
    public String f71146i;

    /* renamed from: j, reason: collision with root package name */
    public f2.e f71147j;

    /* renamed from: k, reason: collision with root package name */
    public f2.d f71148k;

    /* renamed from: l, reason: collision with root package name */
    public f2.a f71149l;

    /* renamed from: m, reason: collision with root package name */
    public byte f71150m;

    @Override // ki.f2.b
    public f2 build() {
        if (this.f71150m == 1 && this.f71138a != null && this.f71139b != null && this.f71141d != null && this.f71145h != null && this.f71146i != null) {
            return new c0(this.f71138a, this.f71139b, this.f71140c, this.f71141d, this.f71142e, this.f71143f, this.f71144g, this.f71145h, this.f71146i, this.f71147j, this.f71148k, this.f71149l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71138a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f71139b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f71150m) == 0) {
            sb2.append(" platform");
        }
        if (this.f71141d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f71145h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f71146i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.b
    public f2.b setAppExitInfo(f2.a aVar) {
        this.f71149l = aVar;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setAppQualitySessionId(String str) {
        this.f71144g = str;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setBuildVersion(String str) {
        if (str == null) {
            throw new NullPointerException("Null buildVersion");
        }
        this.f71145h = str;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setDisplayVersion(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayVersion");
        }
        this.f71146i = str;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setFirebaseAuthenticationToken(String str) {
        this.f71143f = str;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setFirebaseInstallationId(String str) {
        this.f71142e = str;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setGmpAppId(String str) {
        if (str == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        this.f71139b = str;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setInstallationUuid(String str) {
        if (str == null) {
            throw new NullPointerException("Null installationUuid");
        }
        this.f71141d = str;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setNdkPayload(f2.d dVar) {
        this.f71148k = dVar;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setPlatform(int i10) {
        this.f71140c = i10;
        this.f71150m = (byte) (this.f71150m | 1);
        return this;
    }

    @Override // ki.f2.b
    public f2.b setSdkVersion(String str) {
        if (str == null) {
            throw new NullPointerException("Null sdkVersion");
        }
        this.f71138a = str;
        return this;
    }

    @Override // ki.f2.b
    public f2.b setSession(f2.e eVar) {
        this.f71147j = eVar;
        return this;
    }
}

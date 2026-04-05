package md;

import cv.BLca.YsiBvdpw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f74314a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74315b;

    /* renamed from: c, reason: collision with root package name */
    public final jd.f f74316c;

    /* renamed from: d, reason: collision with root package name */
    public final jd.j f74317d;

    /* renamed from: e, reason: collision with root package name */
    public final jd.e f74318e;

    public l(d0 d0Var, String str, jd.f fVar, jd.j jVar, jd.e eVar) {
        this.f74314a = d0Var;
        this.f74315b = str;
        this.f74316c = fVar;
        this.f74317d = jVar;
        this.f74318e = eVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f74314a.equals(c0Var.getTransportContext()) && this.f74315b.equals(c0Var.getTransportName())) {
                l lVar = (l) c0Var;
                if (this.f74316c.equals(lVar.f74316c) && this.f74317d.equals(lVar.f74317d) && this.f74318e.equals(c0Var.getEncoding())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // md.c0
    public jd.e getEncoding() {
        return this.f74318e;
    }

    @Override // md.c0
    public d0 getTransportContext() {
        return this.f74314a;
    }

    @Override // md.c0
    public String getTransportName() {
        return this.f74315b;
    }

    public int hashCode() {
        return ((((((((this.f74314a.hashCode() ^ 1000003) * 1000003) ^ this.f74315b.hashCode()) * 1000003) ^ this.f74316c.hashCode()) * 1000003) ^ this.f74317d.hashCode()) * 1000003) ^ this.f74318e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f74314a + ", transportName=" + this.f74315b + ", event=" + this.f74316c + YsiBvdpw.PYgU + this.f74317d + ", encoding=" + this.f74318e + "}";
    }
}

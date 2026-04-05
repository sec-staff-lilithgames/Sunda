package bs;

import zr.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public b f10048a;

    /* renamed from: b, reason: collision with root package name */
    public final f f10049b = new f();

    public d build() {
        if (this.f10048a != null) {
            return new d(this);
        }
        throw new IllegalStateException("url == null");
    }

    public c header(String str, String str2) {
        this.f10049b.set(str, str2);
        return this;
    }

    public c url(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("url == null");
        }
        this.f10048a = bVar;
        return this;
    }
}

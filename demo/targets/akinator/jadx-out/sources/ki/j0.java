package ki;

import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j0 extends f2.d.a {

    /* renamed from: a, reason: collision with root package name */
    public List f71307a;

    /* renamed from: b, reason: collision with root package name */
    public String f71308b;

    @Override // ki.f2.d.a
    public f2.d build() {
        List list = this.f71307a;
        if (list != null) {
            return new k0(list, this.f71308b);
        }
        throw new IllegalStateException("Missing required properties: files");
    }

    @Override // ki.f2.d.a
    public f2.d.a setFiles(List<f2.d.b> list) {
        if (list == null) {
            throw new NullPointerException("Null files");
        }
        this.f71307a = list;
        return this;
    }

    @Override // ki.f2.d.a
    public f2.d.a setOrgId(String str) {
        this.f71308b = str;
        return this;
    }
}

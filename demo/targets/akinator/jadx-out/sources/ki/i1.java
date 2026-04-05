package ki;

import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i1 extends f2.e.d.a.b.AbstractC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final String f71291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71292b;

    /* renamed from: c, reason: collision with root package name */
    public final List f71293c;

    public i1(String str, int i10, List list) {
        this.f71291a = str;
        this.f71292b = i10;
        this.f71293c = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.a.b.AbstractC0725e) {
            f2.e.d.a.b.AbstractC0725e abstractC0725e = (f2.e.d.a.b.AbstractC0725e) obj;
            if (this.f71291a.equals(abstractC0725e.getName()) && this.f71292b == abstractC0725e.getImportance() && this.f71293c.equals(abstractC0725e.getFrames())) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e
    public List<f2.e.d.a.b.AbstractC0725e.AbstractC0727b> getFrames() {
        return this.f71293c;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e
    public int getImportance() {
        return this.f71292b;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e
    public String getName() {
        return this.f71291a;
    }

    public int hashCode() {
        return ((((this.f71291a.hashCode() ^ 1000003) * 1000003) ^ this.f71292b) * 1000003) ^ this.f71293c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f71291a + ", importance=" + this.f71292b + ", frames=" + this.f71293c + "}";
    }
}

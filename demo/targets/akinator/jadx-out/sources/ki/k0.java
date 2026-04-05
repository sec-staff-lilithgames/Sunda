package ki;

import com.unity3d.services.core.request.NJc.yFkbx;
import j1.o2;
import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class k0 extends f2.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f71323a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71324b;

    public k0(List list, String str) {
        this.f71323a = list;
        this.f71324b = str;
    }

    @Override // ki.f2.d
    public final j0 a() {
        j0 j0Var = new j0();
        j0Var.f71307a = getFiles();
        j0Var.f71308b = getOrgId();
        return j0Var;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.d) {
            f2.d dVar = (f2.d) obj;
            if (this.f71323a.equals(dVar.getFiles()) && ((str = this.f71324b) != null ? str.equals(dVar.getOrgId()) : dVar.getOrgId() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.d
    public List<f2.d.b> getFiles() {
        return this.f71323a;
    }

    @Override // ki.f2.d
    public String getOrgId() {
        return this.f71324b;
    }

    public int hashCode() {
        int iHashCode = (this.f71323a.hashCode() ^ 1000003) * 1000003;
        String str = this.f71324b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f71323a);
        sb2.append(yFkbx.PcewACNNHkV);
        return o2.o(sb2, this.f71324b, "}");
    }
}

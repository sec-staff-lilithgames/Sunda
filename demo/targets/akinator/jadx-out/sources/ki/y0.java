package ki;

import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y0 extends f2.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    public final f2.e.d.a.b f71526a;

    /* renamed from: b, reason: collision with root package name */
    public final List f71527b;

    /* renamed from: c, reason: collision with root package name */
    public final List f71528c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f71529d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.e.d.a.c f71530e;

    /* renamed from: f, reason: collision with root package name */
    public final List f71531f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71532g;

    public y0(f2.e.d.a.b bVar, List list, List list2, Boolean bool, f2.e.d.a.c cVar, List list3, int i10) {
        this.f71526a = bVar;
        this.f71527b = list;
        this.f71528c = list2;
        this.f71529d = bool;
        this.f71530e = cVar;
        this.f71531f = list3;
        this.f71532g = i10;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        f2.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.a) {
            f2.e.d.a aVar = (f2.e.d.a) obj;
            if (this.f71526a.equals(aVar.getExecution()) && ((list = this.f71527b) != null ? list.equals(aVar.getCustomAttributes()) : aVar.getCustomAttributes() == null) && ((list2 = this.f71528c) != null ? list2.equals(aVar.getInternalKeys()) : aVar.getInternalKeys() == null) && ((bool = this.f71529d) != null ? bool.equals(aVar.getBackground()) : aVar.getBackground() == null) && ((cVar = this.f71530e) != null ? cVar.equals(aVar.getCurrentProcessDetails()) : aVar.getCurrentProcessDetails() == null) && ((list3 = this.f71531f) != null ? list3.equals(aVar.getAppProcessDetails()) : aVar.getAppProcessDetails() == null) && this.f71532g == aVar.getUiOrientation()) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.a
    public List<f2.e.d.a.c> getAppProcessDetails() {
        return this.f71531f;
    }

    @Override // ki.f2.e.d.a
    public Boolean getBackground() {
        return this.f71529d;
    }

    @Override // ki.f2.e.d.a
    public f2.e.d.a.c getCurrentProcessDetails() {
        return this.f71530e;
    }

    @Override // ki.f2.e.d.a
    public List<f2.c> getCustomAttributes() {
        return this.f71527b;
    }

    @Override // ki.f2.e.d.a
    public f2.e.d.a.b getExecution() {
        return this.f71526a;
    }

    @Override // ki.f2.e.d.a
    public List<f2.c> getInternalKeys() {
        return this.f71528c;
    }

    @Override // ki.f2.e.d.a
    public int getUiOrientation() {
        return this.f71532g;
    }

    public int hashCode() {
        int iHashCode = (this.f71526a.hashCode() ^ 1000003) * 1000003;
        List list = this.f71527b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f71528c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f71529d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        f2.e.d.a.c cVar = this.f71530e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f71531f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f71532g;
    }

    @Override // ki.f2.e.d.a
    public f2.e.d.a.AbstractC0718a toBuilder() {
        x0 x0Var = new x0();
        x0Var.f71508a = getExecution();
        x0Var.f71509b = getCustomAttributes();
        x0Var.f71510c = getInternalKeys();
        x0Var.f71511d = getBackground();
        x0Var.f71512e = getCurrentProcessDetails();
        x0Var.f71513f = getAppProcessDetails();
        x0Var.f71514g = getUiOrientation();
        x0Var.f71515h = (byte) 1;
        return x0Var;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f71526a);
        sb2.append(", customAttributes=");
        sb2.append(this.f71527b);
        sb2.append(", internalKeys=");
        sb2.append(this.f71528c);
        sb2.append(", background=");
        sb2.append(this.f71529d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f71530e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f71531f);
        sb2.append(", uiOrientation=");
        return a.b.f(this.f71532g, "}", sb2);
    }
}

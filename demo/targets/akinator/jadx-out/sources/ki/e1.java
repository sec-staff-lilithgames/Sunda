package ki;

import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e1 extends f2.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f71234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71235b;

    /* renamed from: c, reason: collision with root package name */
    public final List f71236c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.e.d.a.b.c f71237d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71238e;

    public e1(String str, String str2, List list, f2.e.d.a.b.c cVar, int i10) {
        this.f71234a = str;
        this.f71235b = str2;
        this.f71236c = list;
        this.f71237d = cVar;
        this.f71238e = i10;
    }

    public boolean equals(Object obj) {
        String str;
        f2.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.a.b.c) {
            f2.e.d.a.b.c cVar2 = (f2.e.d.a.b.c) obj;
            if (this.f71234a.equals(cVar2.getType()) && ((str = this.f71235b) != null ? str.equals(cVar2.getReason()) : cVar2.getReason() == null) && this.f71236c.equals(cVar2.getFrames()) && ((cVar = this.f71237d) != null ? cVar.equals(cVar2.getCausedBy()) : cVar2.getCausedBy() == null) && this.f71238e == cVar2.getOverflowCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.a.b.c
    public f2.e.d.a.b.c getCausedBy() {
        return this.f71237d;
    }

    @Override // ki.f2.e.d.a.b.c
    public List<f2.e.d.a.b.AbstractC0725e.AbstractC0727b> getFrames() {
        return this.f71236c;
    }

    @Override // ki.f2.e.d.a.b.c
    public int getOverflowCount() {
        return this.f71238e;
    }

    @Override // ki.f2.e.d.a.b.c
    public String getReason() {
        return this.f71235b;
    }

    @Override // ki.f2.e.d.a.b.c
    public String getType() {
        return this.f71234a;
    }

    public int hashCode() {
        int iHashCode = (this.f71234a.hashCode() ^ 1000003) * 1000003;
        String str = this.f71235b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f71236c.hashCode()) * 1000003;
        f2.e.d.a.b.c cVar = this.f71237d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f71238e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f71234a);
        sb2.append(", reason=");
        sb2.append(this.f71235b);
        sb2.append(", frames=");
        sb2.append(this.f71236c);
        sb2.append(", causedBy=");
        sb2.append(this.f71237d);
        sb2.append(", overflowCount=");
        return a.b.f(this.f71238e, "}", sb2);
    }
}

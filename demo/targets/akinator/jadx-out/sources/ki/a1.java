package ki;

import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a1 extends f2.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final List f71122a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.e.d.a.b.c f71123b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.a f71124c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.e.d.a.b.AbstractC0723d f71125d;

    /* renamed from: e, reason: collision with root package name */
    public final List f71126e;

    public a1(List list, f2.e.d.a.b.c cVar, f2.a aVar, f2.e.d.a.b.AbstractC0723d abstractC0723d, List list2) {
        this.f71122a = list;
        this.f71123b = cVar;
        this.f71124c = aVar;
        this.f71125d = abstractC0723d;
        this.f71126e = list2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.a.b) {
            f2.e.d.a.b bVar = (f2.e.d.a.b) obj;
            List list = this.f71122a;
            if (list != null ? list.equals(bVar.getThreads()) : bVar.getThreads() == null) {
                f2.e.d.a.b.c cVar = this.f71123b;
                if (cVar != null ? cVar.equals(bVar.getException()) : bVar.getException() == null) {
                    f2.a aVar = this.f71124c;
                    if (aVar != null ? aVar.equals(bVar.getAppExitInfo()) : bVar.getAppExitInfo() == null) {
                        if (this.f71125d.equals(bVar.getSignal()) && this.f71126e.equals(bVar.getBinaries())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.a.b
    public f2.a getAppExitInfo() {
        return this.f71124c;
    }

    @Override // ki.f2.e.d.a.b
    public List<f2.e.d.a.b.AbstractC0719a> getBinaries() {
        return this.f71126e;
    }

    @Override // ki.f2.e.d.a.b
    public f2.e.d.a.b.c getException() {
        return this.f71123b;
    }

    @Override // ki.f2.e.d.a.b
    public f2.e.d.a.b.AbstractC0723d getSignal() {
        return this.f71125d;
    }

    @Override // ki.f2.e.d.a.b
    public List<f2.e.d.a.b.AbstractC0725e> getThreads() {
        return this.f71122a;
    }

    public int hashCode() {
        List list = this.f71122a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        f2.e.d.a.b.c cVar = this.f71123b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        f2.a aVar = this.f71124c;
        return (((((aVar != null ? aVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f71125d.hashCode()) * 1000003) ^ this.f71126e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f71122a + ", exception=" + this.f71123b + ", appExitInfo=" + this.f71124c + ", signal=" + this.f71125d + ", binaries=" + this.f71126e + "}";
    }
}

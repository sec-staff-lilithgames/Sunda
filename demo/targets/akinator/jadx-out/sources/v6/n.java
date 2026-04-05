package v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f89146a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89147b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89148c;

    public n(String workSpecId, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        this.f89146a = workSpecId;
        this.f89147b = i10;
        this.f89148c = i11;
    }

    public static /* synthetic */ n copy$default(n nVar, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = nVar.f89146a;
        }
        if ((i12 & 2) != 0) {
            i10 = nVar.f89147b;
        }
        if ((i12 & 4) != 0) {
            i11 = nVar.f89148c;
        }
        return nVar.copy(str, i10, i11);
    }

    public final String component1() {
        return this.f89146a;
    }

    public final int component2() {
        return this.f89147b;
    }

    public final int component3() {
        return this.f89148c;
    }

    public final n copy(String workSpecId, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        return new n(workSpecId, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f89146a, nVar.f89146a) && this.f89147b == nVar.f89147b && this.f89148c == nVar.f89148c;
    }

    public final int getGeneration() {
        return this.f89147b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f89148c) + e3.g.d(this.f89147b, this.f89146a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f89146a);
        sb2.append(", generation=");
        sb2.append(this.f89147b);
        sb2.append(", systemId=");
        return e3.g.m(sb2, this.f89148c, ')');
    }
}

package v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f89157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89158b;

    public s(String workSpecId, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        this.f89157a = workSpecId;
        this.f89158b = i10;
    }

    public static /* synthetic */ s copy$default(s sVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sVar.f89157a;
        }
        if ((i11 & 2) != 0) {
            i10 = sVar.f89158b;
        }
        return sVar.copy(str, i10);
    }

    public final String component1() {
        return this.f89157a;
    }

    public final int component2() {
        return this.f89158b;
    }

    public final s copy(String workSpecId, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        return new s(workSpecId, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f89157a, sVar.f89157a) && this.f89158b == sVar.f89158b;
    }

    public final int getGeneration() {
        return this.f89158b;
    }

    public final String getWorkSpecId() {
        return this.f89157a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f89158b) + (this.f89157a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f89157a);
        sb2.append(", generation=");
        return e3.g.m(sb2, this.f89158b, ')');
    }
}

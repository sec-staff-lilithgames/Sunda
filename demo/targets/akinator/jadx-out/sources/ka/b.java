package ka;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f70697a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70698b;

    public b(a akitude, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(akitude, "akitude");
        this.f70697a = akitude;
        this.f70698b = i10;
    }

    public static /* synthetic */ b copy$default(b bVar, a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = bVar.f70697a;
        }
        if ((i11 & 2) != 0) {
            i10 = bVar.f70698b;
        }
        return bVar.copy(aVar, i10);
    }

    public final a component1() {
        return this.f70697a;
    }

    public final int component2() {
        return this.f70698b;
    }

    public final b copy(a akitude, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(akitude, "akitude");
        return new b(akitude, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f70697a == bVar.f70697a && this.f70698b == bVar.f70698b;
    }

    public final a getAkitude() {
        return this.f70697a;
    }

    public final int getDelay() {
        return this.f70698b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f70698b) + (this.f70697a.hashCode() * 31);
    }

    public String toString() {
        return "AkitudeStep(akitude=" + this.f70697a + ", delay=" + this.f70698b + ")";
    }
}

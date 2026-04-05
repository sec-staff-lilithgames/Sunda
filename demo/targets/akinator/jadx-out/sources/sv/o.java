package sv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f86191a;

    /* renamed from: b, reason: collision with root package name */
    public final qv.m f86192b;

    public o(String value, qv.m range) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.e0.checkNotNullParameter(range, "range");
        this.f86191a = value;
        this.f86192b = range;
    }

    public static /* synthetic */ o copy$default(o oVar, String str, qv.m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oVar.f86191a;
        }
        if ((i10 & 2) != 0) {
            mVar = oVar.f86192b;
        }
        return oVar.copy(str, mVar);
    }

    public final String component1() {
        return this.f86191a;
    }

    public final qv.m component2() {
        return this.f86192b;
    }

    public final o copy(String value, qv.m range) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.e0.checkNotNullParameter(range, "range");
        return new o(value, range);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f86191a, oVar.f86191a) && kotlin.jvm.internal.e0.areEqual(this.f86192b, oVar.f86192b);
    }

    public final qv.m getRange() {
        return this.f86192b;
    }

    public final String getValue() {
        return this.f86191a;
    }

    public int hashCode() {
        return this.f86192b.hashCode() + (this.f86191a.hashCode() * 31);
    }

    public String toString() {
        return "MatchGroup(value=" + this.f86191a + ", range=" + this.f86192b + ')';
    }
}

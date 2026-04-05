package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8325a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8326b;

    public a(float f10, float f11) {
        this.f8325a = f10;
        this.f8326b = f11;
    }

    public static /* synthetic */ a copy$default(a aVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = aVar.f8325a;
        }
        if ((i10 & 2) != 0) {
            f11 = aVar.f8326b;
        }
        return aVar.copy(f10, f11);
    }

    public final float component1() {
        return this.f8325a;
    }

    public final float component2() {
        return this.f8326b;
    }

    public final a copy(float f10, float f11) {
        return new a(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f8325a), (Object) Float.valueOf(aVar.f8325a)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f8326b), (Object) Float.valueOf(aVar.f8326b));
    }

    public final float getDistanceCoefficient() {
        return this.f8325a;
    }

    public final float getVelocityCoefficient() {
        return this.f8326b;
    }

    public int hashCode() {
        return Float.hashCode(this.f8326b) + (Float.hashCode(this.f8325a) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f8325a);
        sb2.append(", velocityCoefficient=");
        return a.b.n(sb2, this.f8326b, ')');
    }
}

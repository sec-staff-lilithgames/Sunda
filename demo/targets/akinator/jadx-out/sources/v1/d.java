package v1;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f88851a;

    /* renamed from: b, reason: collision with root package name */
    public final float f88852b;

    public d(List<Float> coefficients, float f10) {
        e0.checkNotNullParameter(coefficients, "coefficients");
        this.f88851a = coefficients;
        this.f88852b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d copy$default(d dVar, List list, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = dVar.f88851a;
        }
        if ((i10 & 2) != 0) {
            f10 = dVar.f88852b;
        }
        return dVar.copy(list, f10);
    }

    public final List<Float> component1() {
        return this.f88851a;
    }

    public final float component2() {
        return this.f88852b;
    }

    public final d copy(List<Float> coefficients, float f10) {
        e0.checkNotNullParameter(coefficients, "coefficients");
        return new d(coefficients, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e0.areEqual(this.f88851a, dVar.f88851a) && e0.areEqual((Object) Float.valueOf(this.f88852b), (Object) Float.valueOf(dVar.f88852b));
    }

    public final List<Float> getCoefficients() {
        return this.f88851a;
    }

    public final float getConfidence() {
        return this.f88852b;
    }

    public int hashCode() {
        return Float.hashCode(this.f88852b) + (this.f88851a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PolynomialFit(coefficients=");
        sb2.append(this.f88851a);
        sb2.append(", confidence=");
        return a.b.n(sb2, this.f88852b, ')');
    }
}

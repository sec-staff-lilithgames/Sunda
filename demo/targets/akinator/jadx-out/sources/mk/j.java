package mk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j extends Number {

    /* renamed from: b, reason: collision with root package name */
    public final String f74773b;

    public j(String str) {
        this.f74773b = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f74773b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f74773b.equals(((j) obj).f74773b);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f74773b);
    }

    public int hashCode() {
        return this.f74773b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        String str = this.f74773b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return t.parseBigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        String str = this.f74773b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return t.parseBigDecimal(str).longValue();
        }
    }

    public String toString() {
        return this.f74773b;
    }
}

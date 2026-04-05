package b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: h, reason: collision with root package name */
    public float f8730h;

    public e(char[] cArr) {
        super(cArr);
        this.f8730h = Float.NaN;
    }

    public static c allocate(char[] cArr) {
        return new e(cArr);
    }

    @Override // b3.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            float f10 = getFloat();
            float f11 = ((e) obj).getFloat();
            if ((Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11) {
                return true;
            }
        }
        return false;
    }

    @Override // b3.c
    public float getFloat() {
        if (Float.isNaN(this.f8730h) && hasContent()) {
            this.f8730h = Float.parseFloat(content());
        }
        return this.f8730h;
    }

    @Override // b3.c
    public int getInt() {
        if (Float.isNaN(this.f8730h) && hasContent()) {
            this.f8730h = Integer.parseInt(content());
        }
        return (int) this.f8730h;
    }

    @Override // b3.c
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f10 = this.f8730h;
        return iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }

    public boolean isInt() {
        float f10 = getFloat();
        return ((float) ((int) f10)) == f10;
    }

    public void putValue(float f10) {
        this.f8730h = f10;
    }

    @Override // b3.c
    public final String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        c.a(i10, sb2);
        float f10 = getFloat();
        int i12 = (int) f10;
        if (i12 == f10) {
            sb2.append(i12);
        } else {
            sb2.append(f10);
        }
        return sb2.toString();
    }

    @Override // b3.c
    public final String toJSON() {
        float f10 = getFloat();
        int i10 = (int) f10;
        if (i10 == f10) {
            return a.b.e(i10, "");
        }
        return "" + f10;
    }

    public e(float f10) {
        super(null);
        this.f8730h = f10;
    }
}

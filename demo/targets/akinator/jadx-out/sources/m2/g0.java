package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f73918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73919b;

    public g0(int i10, int i11) {
        this.f73918a = i10;
        this.f73919b = i11;
    }

    @Override // m2.d
    public void applyTo(g buffer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        int iCoerceIn = qv.v.coerceIn(this.f73918a, 0, buffer.getLength$ui_text_release());
        int iCoerceIn2 = qv.v.coerceIn(this.f73919b, 0, buffer.getLength$ui_text_release());
        if (iCoerceIn < iCoerceIn2) {
            buffer.setSelection$ui_text_release(iCoerceIn, iCoerceIn2);
        } else {
            buffer.setSelection$ui_text_release(iCoerceIn2, iCoerceIn);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f73918a == g0Var.f73918a && this.f73919b == g0Var.f73919b;
    }

    public final int getEnd() {
        return this.f73919b;
    }

    public final int getStart() {
        return this.f73918a;
    }

    public int hashCode() {
        return (this.f73918a * 31) + this.f73919b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f73918a);
        sb2.append(", end=");
        return e3.g.m(sb2, this.f73919b, ')');
    }
}

package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f73907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73908b;

    public e0(int i10, int i11) {
        this.f73907a = i10;
        this.f73908b = i11;
    }

    @Override // m2.d
    public void applyTo(g buffer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        if (buffer.hasComposition$ui_text_release()) {
            buffer.commitComposition$ui_text_release();
        }
        int iCoerceIn = qv.v.coerceIn(this.f73907a, 0, buffer.getLength$ui_text_release());
        int iCoerceIn2 = qv.v.coerceIn(this.f73908b, 0, buffer.getLength$ui_text_release());
        if (iCoerceIn != iCoerceIn2) {
            if (iCoerceIn < iCoerceIn2) {
                buffer.setComposition$ui_text_release(iCoerceIn, iCoerceIn2);
            } else {
                buffer.setComposition$ui_text_release(iCoerceIn2, iCoerceIn);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f73907a == e0Var.f73907a && this.f73908b == e0Var.f73908b;
    }

    public final int getEnd() {
        return this.f73908b;
    }

    public final int getStart() {
        return this.f73907a;
    }

    public int hashCode() {
        return (this.f73907a * 31) + this.f73908b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f73907a);
        sb2.append(", end=");
        return e3.g.m(sb2, this.f73908b, ')');
    }
}

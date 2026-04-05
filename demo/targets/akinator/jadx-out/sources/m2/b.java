package m2;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f73894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73895b;

    public b(int i10, int i11) {
        this.f73894a = i10;
        this.f73895b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(o2.i(i10, i11, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.").toString());
        }
    }

    @Override // m2.d
    public void applyTo(g buffer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        buffer.delete$ui_text_release(buffer.getSelectionEnd$ui_text_release(), Math.min(buffer.getSelectionEnd$ui_text_release() + this.f73895b, buffer.getLength$ui_text_release()));
        buffer.delete$ui_text_release(Math.max(0, buffer.getSelectionStart$ui_text_release() - this.f73894a), buffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f73894a == bVar.f73894a && this.f73895b == bVar.f73895b;
    }

    public final int getLengthAfterCursor() {
        return this.f73895b;
    }

    public final int getLengthBeforeCursor() {
        return this.f73894a;
    }

    public int hashCode() {
        return (this.f73894a * 31) + this.f73895b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f73894a);
        sb2.append(", lengthAfterCursor=");
        return e3.g.m(sb2, this.f73895b, ')');
    }
}

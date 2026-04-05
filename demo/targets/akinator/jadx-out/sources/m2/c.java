package m2;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f73897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73898b;

    public c(int i10, int i11) {
        this.f73897a = i10;
        this.f73898b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(o2.i(i10, i11, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.").toString());
        }
    }

    @Override // m2.d
    public void applyTo(g buffer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        int i10 = 0;
        for (int i11 = 0; i11 < this.f73897a; i11++) {
            int i12 = i10 + 1;
            i10 = (buffer.getSelectionStart$ui_text_release() <= i12 || !e.access$isSurrogatePair(buffer.get$ui_text_release((buffer.getSelectionStart$ui_text_release() - i12) + (-1)), buffer.get$ui_text_release(buffer.getSelectionStart$ui_text_release() - i12))) ? i12 : i10 + 2;
            if (i10 == buffer.getSelectionStart$ui_text_release()) {
                break;
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f73898b; i14++) {
            int i15 = i13 + 1;
            i13 = (buffer.getSelectionEnd$ui_text_release() + i15 >= buffer.getLength$ui_text_release() || !e.access$isSurrogatePair(buffer.get$ui_text_release((buffer.getSelectionEnd$ui_text_release() + i15) + (-1)), buffer.get$ui_text_release(buffer.getSelectionEnd$ui_text_release() + i15))) ? i15 : i13 + 2;
            if (buffer.getSelectionEnd$ui_text_release() + i13 == buffer.getLength$ui_text_release()) {
                break;
            }
        }
        buffer.delete$ui_text_release(buffer.getSelectionEnd$ui_text_release(), buffer.getSelectionEnd$ui_text_release() + i13);
        buffer.delete$ui_text_release(buffer.getSelectionStart$ui_text_release() - i10, buffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f73897a == cVar.f73897a && this.f73898b == cVar.f73898b;
    }

    public final int getLengthAfterCursor() {
        return this.f73898b;
    }

    public final int getLengthBeforeCursor() {
        return this.f73897a;
    }

    public int hashCode() {
        return (this.f73897a * 31) + this.f73898b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f73897a);
        sb2.append(", lengthAfterCursor=");
        return e3.g.m(sb2, this.f73898b, ')');
    }
}

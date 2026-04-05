package io.ktor.utils.io.core.internal;

import a.b;
import kotlin.jvm.internal.e0;
import p0.o2;
import tu.k;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CharArraySequence implements CharSequence {
    private final char[] array;
    private final int length;
    private final int offset;

    public CharArraySequence(char[] array, int i10, int i11) {
        e0.checkNotNullParameter(array, "array");
        this.array = array;
        this.offset = i10;
        this.length = i11;
    }

    private final Void indexOutOfBounds(int i10) {
        StringBuilder sbT = o2.t(i10, "String index out of bounds: ", " > ");
        sbT.append(this.length);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return get(i10);
    }

    public final char get(int i10) {
        if (i10 < this.length) {
            return this.array[i10 + this.offset];
        }
        indexOutOfBounds(i10);
        throw new k();
    }

    public final int getLength() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "startIndex shouldn't be negative: ").toString());
        }
        int i12 = this.length;
        if (i10 > i12) {
            StringBuilder sbT = o2.t(i10, "startIndex is too large: ", " > ");
            sbT.append(this.length);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        if (i10 + i11 <= i12) {
            if (i11 >= i10) {
                return new CharArraySequence(this.array, this.offset + i10, i11 - i10);
            }
            throw new IllegalArgumentException(i.a(i10, i11, "endIndex should be greater or equal to startIndex: ", " > ").toString());
        }
        StringBuilder sbT2 = o2.t(i11, "endIndex is too large: ", " > ");
        sbT2.append(this.length);
        throw new IllegalArgumentException(sbT2.toString().toString());
    }
}

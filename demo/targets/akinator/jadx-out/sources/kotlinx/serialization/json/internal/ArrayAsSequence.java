package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ArrayAsSequence implements CharSequence {
    private final char[] buffer;
    private int length;

    public ArrayAsSequence(char[] buffer) {
        e0.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        this.length = buffer.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return get(i10);
    }

    public char get(int i10) {
        return this.buffer[i10];
    }

    public final char[] getBuffer$kotlinx_serialization_json() {
        return this.buffer;
    }

    public int getLength() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public void setLength(int i10) {
        this.length = i10;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return k0.concatToString(this.buffer, i10, Math.min(i11, length()));
    }

    public final String substring(int i10, int i11) {
        return k0.concatToString(this.buffer, i10, Math.min(i11, length()));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return substring(0, length());
    }

    public final void trim(int i10) {
        setLength(Math.min(this.buffer.length, i10));
    }
}

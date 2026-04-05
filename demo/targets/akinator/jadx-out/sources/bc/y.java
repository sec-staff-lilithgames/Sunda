package bc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y extends d {
    @Override // bc.d
    public final long g() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // bc.d
    public final long h() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // bc.d
    public final long i() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // bc.d
    public final long k(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) throws NumberFormatException {
        float fH = f.h(z10, j10, i12, z11, i13);
        if (Float.isNaN(fH)) {
            fH = Float.parseFloat(charSequence.subSequence(i10, i11).toString());
        }
        return Float.floatToRawIntBits(fH);
    }

    @Override // bc.d
    public final long l(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) throws NumberFormatException {
        float fL = f.l(z10, j10, i12, z11, i13);
        if (Float.isNaN(fL)) {
            fL = Float.parseFloat(charSequence.subSequence(i10, i11).toString());
        }
        return Float.floatToRawIntBits(fL);
    }
}

package wk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.type.Fraction;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o extends GeneratedMessageLite.Builder implements p {
    public o clearDenominator() {
        copyOnWrite();
        ((Fraction) this.instance).clearDenominator();
        return this;
    }

    public o clearNumerator() {
        copyOnWrite();
        ((Fraction) this.instance).clearNumerator();
        return this;
    }

    @Override // wk.p
    public long getDenominator() {
        return ((Fraction) this.instance).getDenominator();
    }

    @Override // wk.p
    public long getNumerator() {
        return ((Fraction) this.instance).getNumerator();
    }

    public o setDenominator(long j10) {
        copyOnWrite();
        ((Fraction) this.instance).setDenominator(j10);
        return this;
    }

    public o setNumerator(long j10) {
        copyOnWrite();
        ((Fraction) this.instance).setNumerator(j10);
        return this;
    }
}

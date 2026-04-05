package wk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.type.Money;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u extends GeneratedMessageLite.Builder implements v {
    public u clearCurrencyCode() {
        copyOnWrite();
        ((Money) this.instance).clearCurrencyCode();
        return this;
    }

    public u clearNanos() {
        copyOnWrite();
        ((Money) this.instance).clearNanos();
        return this;
    }

    public u clearUnits() {
        copyOnWrite();
        ((Money) this.instance).clearUnits();
        return this;
    }

    @Override // wk.v
    public String getCurrencyCode() {
        return ((Money) this.instance).getCurrencyCode();
    }

    @Override // wk.v
    public ByteString getCurrencyCodeBytes() {
        return ((Money) this.instance).getCurrencyCodeBytes();
    }

    @Override // wk.v
    public int getNanos() {
        return ((Money) this.instance).getNanos();
    }

    @Override // wk.v
    public long getUnits() {
        return ((Money) this.instance).getUnits();
    }

    public u setCurrencyCode(String str) {
        copyOnWrite();
        ((Money) this.instance).setCurrencyCode(str);
        return this;
    }

    public u setCurrencyCodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Money) this.instance).setCurrencyCodeBytes(byteString);
        return this;
    }

    public u setNanos(int i10) {
        copyOnWrite();
        ((Money) this.instance).setNanos(i10);
        return this;
    }

    public u setUnits(long j10) {
        copyOnWrite();
        ((Money) this.instance).setUnits(j10);
        return this;
    }
}

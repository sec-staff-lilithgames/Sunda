package zw;

import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements h0 {
    @Override // zw.h0
    public BigInteger read(String str) {
        return new BigInteger(str);
    }

    @Override // zw.h0
    public String write(BigInteger bigInteger) {
        return bigInteger.toString();
    }
}

package zw;

import java.util.Currency;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l implements h0 {
    @Override // zw.h0
    public Currency read(String str) {
        return Currency.getInstance(str);
    }

    @Override // zw.h0
    public String write(Currency currency) {
        return currency.toString();
    }
}

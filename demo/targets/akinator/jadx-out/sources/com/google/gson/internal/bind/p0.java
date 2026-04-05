package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Currency;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class p0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public Currency read(JsonReader jsonReader) throws IOException {
        String strNextString = jsonReader.nextString();
        try {
            return Currency.getInstance(strNextString);
        } catch (IllegalArgumentException e10) {
            StringBuilder sbO = e3.g.o("Failed parsing '", strNextString, "' as Currency; at path ");
            sbO.append(jsonReader.getPreviousPath());
            throw new com.google.gson.w(sbO.toString(), e10);
        }
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
        jsonWriter.value(currency.getCurrencyCode());
    }
}

package com.google.gson;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum d0 extends h0 {
    public d0() {
        super("DOUBLE", 0);
    }

    @Override // com.google.gson.h0, com.google.gson.i0
    public Double readNumber(JsonReader jsonReader) throws IOException {
        return Double.valueOf(jsonReader.nextDouble());
    }
}

package com.google.gson;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum e0 extends h0 {
    public e0() {
        super("LAZILY_PARSED_NUMBER", 1);
    }

    @Override // com.google.gson.h0, com.google.gson.i0
    public Number readNumber(JsonReader jsonReader) throws IOException {
        return new mk.j(jsonReader.nextString());
    }
}

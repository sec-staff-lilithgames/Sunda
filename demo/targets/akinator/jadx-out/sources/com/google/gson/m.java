package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m extends k0 {
    @Override // com.google.gson.k0
    public Float read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        if (number == null) {
            jsonWriter.nullValue();
            return;
        }
        float fFloatValue = number.floatValue();
        Gson.checkValidFloatingPoint(fFloatValue);
        if (!(number instanceof Float)) {
            number = Float.valueOf(fFloatValue);
        }
        jsonWriter.value(number);
    }
}

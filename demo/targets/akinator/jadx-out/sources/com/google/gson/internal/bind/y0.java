package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class y0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public Number read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            int iNextInt = jsonReader.nextInt();
            if (iNextInt <= 65535 && iNextInt >= -32768) {
                return Short.valueOf((short) iNextInt);
            }
            StringBuilder sbT = o2.t(iNextInt, "Lossy conversion from ", " to short; at path ");
            sbT.append(jsonReader.getPreviousPath());
            throw new com.google.gson.w(sbT.toString());
        } catch (NumberFormatException e10) {
            throw new com.google.gson.w(e10);
        }
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(number.shortValue());
        }
    }
}

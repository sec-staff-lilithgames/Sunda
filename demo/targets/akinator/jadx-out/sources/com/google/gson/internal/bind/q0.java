package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class q0 extends com.google.gson.k0 {
    @Override // com.google.gson.k0
    public Calendar read(JsonReader jsonReader) throws IOException, NumberFormatException {
        int iNextInt;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            iNextInt = jsonReader.nextInt();
            strNextName.getClass();
            switch (strNextName) {
                case "dayOfMonth":
                    i12 = iNextInt;
                    break;
                case "minute":
                    i14 = iNextInt;
                    break;
                case "second":
                    i15 = iNextInt;
                    break;
                case "year":
                    i10 = iNextInt;
                    break;
                case "month":
                    i11 = iNextInt;
                    break;
                case "hourOfDay":
                    i13 = iNextInt;
                    break;
            }
        }
        jsonReader.endObject();
        return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
        if (calendar == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("year");
        jsonWriter.value(calendar.get(1));
        jsonWriter.name("month");
        jsonWriter.value(calendar.get(2));
        jsonWriter.name("dayOfMonth");
        jsonWriter.value(calendar.get(5));
        jsonWriter.name("hourOfDay");
        jsonWriter.value(calendar.get(11));
        jsonWriter.name("minute");
        jsonWriter.value(calendar.get(12));
        jsonWriter.name("second");
        jsonWriter.value(calendar.get(13));
        jsonWriter.endObject();
    }
}

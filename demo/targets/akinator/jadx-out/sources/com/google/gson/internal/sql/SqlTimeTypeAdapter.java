package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.k0;
import com.google.gson.l0;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.w;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class SqlTimeTypeAdapter extends k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f30045b = new l0() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.l0
        public <T> k0 create(Gson gson, pk.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f30046a;

    public /* synthetic */ SqlTimeTypeAdapter(int i10) {
        this();
    }

    private SqlTimeTypeAdapter() {
        this.f30046a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.k0
    public Time read(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f30046a.getTimeZone();
            try {
                try {
                    time = new Time(this.f30046a.parse(strNextString).getTime());
                } catch (ParseException e10) {
                    throw new w("Failed parsing '" + strNextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e10);
                }
            } finally {
                this.f30046a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Time time) throws IOException {
        String str;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f30046a.format((Date) time);
        }
        jsonWriter.value(str);
    }
}

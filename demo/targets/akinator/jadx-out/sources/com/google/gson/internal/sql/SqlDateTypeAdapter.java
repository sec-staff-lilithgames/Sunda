package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.k0;
import com.google.gson.l0;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.w;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class SqlDateTypeAdapter extends k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f30043b = new l0() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.l0
        public <T> k0 create(Gson gson, pk.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f30044a;

    public /* synthetic */ SqlDateTypeAdapter(int i10) {
        this();
    }

    private SqlDateTypeAdapter() {
        this.f30044a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.k0
    public Date read(JsonReader jsonReader) throws IOException {
        Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f30044a.getTimeZone();
            try {
                try {
                    date = new Date(this.f30044a.parse(strNextString).getTime());
                } catch (ParseException e10) {
                    throw new w("Failed parsing '" + strNextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e10);
                }
            } finally {
                this.f30044a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f30044a.format((java.util.Date) date);
        }
        jsonWriter.value(str);
    }
}

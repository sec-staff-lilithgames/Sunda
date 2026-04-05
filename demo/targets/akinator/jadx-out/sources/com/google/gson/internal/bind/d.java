package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends com.google.gson.k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.l0 f29987c = new com.google.gson.l0() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter$1
        @Override // com.google.gson.l0
        public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new d(c.f29985b, 2, 2);
            }
            return null;
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final c f29988a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29989b;

    public d(c cVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f29989b = arrayList;
        this.f29988a = cVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f29989b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.k0
    public Date read(JsonReader jsonReader) throws IOException {
        Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this.f29989b) {
            try {
                Iterator it = this.f29989b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            date = nk.a.parse(strNextString, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder sbO = e3.g.o("Failed parsing '", strNextString, "' as Date; at path ");
                            sbO.append(jsonReader.getPreviousPath());
                            throw new com.google.gson.w(sbO.toString(), e10);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            date = dateFormat.parse(strNextString);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f29988a.a(date);
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f29989b.get(0);
        synchronized (this.f29989b) {
            str = dateFormat.format(date);
        }
        jsonWriter.value(str);
    }

    public d(c cVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f29989b = arrayList;
        this.f29988a = cVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (mk.h.isJava9OrLater()) {
            arrayList.add(mk.v.getUsDateTimeFormat(i10, i11));
        }
    }
}

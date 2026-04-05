package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.k0;
import com.google.gson.l0;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a extends k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f30047b = new l0() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter$1
        @Override // com.google.gson.l0
        public <T> k0 create(Gson gson, pk.a<T> aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                return new a(gson.getAdapter(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final k0 f30048a;

    public a(k0 k0Var) {
        this.f30048a = k0Var;
    }

    @Override // com.google.gson.k0
    public Timestamp read(JsonReader jsonReader) throws IOException {
        Date date = (Date) this.f30048a.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.f30048a.write(jsonWriter, timestamp);
    }
}

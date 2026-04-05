package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class k0 {
    public final Object fromJson(Reader reader) throws IOException {
        return read(new JsonReader(reader));
    }

    public final Object fromJsonTree(q qVar) {
        try {
            return read(new com.google.gson.internal.bind.j(qVar));
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    public final k0 nullSafe() {
        return !(this instanceof j0) ? new j0(this) : this;
    }

    public abstract Object read(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, Object obj) throws IOException {
        write(new JsonWriter(writer), obj);
    }

    public final q toJsonTree(Object obj) {
        try {
            com.google.gson.internal.bind.l lVar = new com.google.gson.internal.bind.l();
            write(lVar, obj);
            return lVar.get();
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    public abstract void write(JsonWriter jsonWriter, Object obj) throws IOException;

    public final Object fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringBuilder sb2 = new StringBuilder();
        try {
            toJson(mk.d0.writerForAppendable(sb2), obj);
            return sb2.toString();
        } catch (IOException e10) {
            throw new r(e10);
        }
    }
}

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.ironsource.C3191e4;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j0 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f30058a;

    public j0(k0 k0Var) {
        this.f30058a = k0Var;
    }

    @Override // com.google.gson.k0
    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return this.f30058a.read(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }

    public String toString() {
        return "NullSafeTypeAdapter[" + this.f30058a + C3191e4.i.f36531e;
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.f30058a.write(jsonWriter, obj);
        }
    }
}

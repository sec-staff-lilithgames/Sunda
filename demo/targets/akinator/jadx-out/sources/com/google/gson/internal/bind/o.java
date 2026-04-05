package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o extends com.google.gson.k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.l0 f30013b = new NumberTypeAdapter$1(new o(com.google.gson.h0.f29920c));

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.i0 f30014a;

    public o(com.google.gson.i0 i0Var) {
        this.f30014a = i0Var;
    }

    public static com.google.gson.l0 getFactory(com.google.gson.i0 i0Var) {
        return i0Var == com.google.gson.h0.f29920c ? f30013b : new NumberTypeAdapter$1(new o(i0Var));
    }

    @Override // com.google.gson.k0
    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i10 = n.f30012a[jsonTokenPeek.ordinal()];
        if (i10 == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f30014a.readNumber(jsonReader);
        }
        throw new com.google.gson.w("Expecting number, got: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}

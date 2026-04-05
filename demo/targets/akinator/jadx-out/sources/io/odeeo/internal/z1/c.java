package io.odeeo.internal.z1;

import com.google.gson.Gson;
import com.google.gson.k0;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import io.odeeo.internal.y1.f;
import java.io.IOException;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c<T> implements f<w0, T> {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f67816a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f67817b;

    public c(Gson gson, k0 k0Var) {
        this.f67816a = gson;
        this.f67817b = k0Var;
    }

    @Override // io.odeeo.internal.y1.f
    public T convert(w0 w0Var) throws IOException {
        JsonReader jsonReaderNewJsonReader = this.f67816a.newJsonReader(w0Var.charStream());
        try {
            T t10 = (T) this.f67817b.read(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return t10;
            }
            throw new r("JSON document was not fully consumed.");
        } finally {
            w0Var.close();
        }
    }
}

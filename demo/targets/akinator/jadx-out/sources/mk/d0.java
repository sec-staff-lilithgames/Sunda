package mk;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class d0 {
    public static com.google.gson.q parse(JsonReader jsonReader) throws com.google.gson.u {
        boolean z10;
        try {
            try {
                jsonReader.peek();
                z10 = false;
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                return (com.google.gson.q) TypeAdapters.B.read(jsonReader);
            } catch (EOFException e11) {
                e = e11;
                if (z10) {
                    return com.google.gson.s.f30067b;
                }
                throw new com.google.gson.w(e);
            }
        } catch (MalformedJsonException e12) {
            throw new com.google.gson.w(e12);
        } catch (IOException e13) {
            throw new com.google.gson.r(e13);
        } catch (NumberFormatException e14) {
            throw new com.google.gson.w(e14);
        }
    }

    public static void write(com.google.gson.q qVar, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.B.write(jsonWriter, (Object) qVar);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new c0(appendable);
    }
}

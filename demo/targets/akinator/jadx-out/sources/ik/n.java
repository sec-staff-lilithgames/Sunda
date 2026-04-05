package ik;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import k4.h2;
import kotlinx.serialization.json.Json;
import sv.k0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final n f59708a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final m f59709b = new m(null, null, null, null, null);

    @Override // k4.h2
    public Object readFrom(InputStream inputStream, zu.d<? super m> dVar) throws k4.e {
        try {
            Json.Default r32 = Json.Default;
            String strDecodeToString = k0.decodeToString(gv.c.readBytes(inputStream));
            r32.getSerializersModule();
            return (m) r32.decodeFromString(m.Companion.serializer(), strDecodeToString);
        } catch (Exception e10) {
            throw new k4.e("Cannot parse session configs", e10);
        }
    }

    @Override // k4.h2
    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, zu.d dVar) {
        return writeTo((m) obj, outputStream, (zu.d<? super x0>) dVar);
    }

    @Override // k4.h2
    public m getDefaultValue() {
        return f59709b;
    }

    public Object writeTo(m mVar, OutputStream outputStream, zu.d<? super x0> dVar) throws IOException {
        outputStream.write(k0.encodeToByteArray(Json.Default.encodeToString(m.Companion.serializer(), mVar)));
        return x0.f87415a;
    }
}

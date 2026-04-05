package ek;

import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import k4.h2;
import kotlinx.serialization.json.Json;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u0 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f54643a;

    public u0(f1 sessionGenerator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        this.f54643a = sessionGenerator;
    }

    @Override // k4.h2
    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, zu.d dVar) {
        return writeTo((t0) obj, outputStream, (zu.d<? super tu.x0>) dVar);
    }

    @Override // k4.h2
    public t0 getDefaultValue() {
        return new t0(this.f54643a.generateNewSession(null), (y1) null, (Map) null, 6, (kotlin.jvm.internal.u) null);
    }

    @Override // k4.h2
    public Object readFrom(InputStream inputStream, zu.d<? super t0> dVar) throws k4.e {
        try {
            Json.Default r32 = Json.Default;
            String strDecodeToString = sv.k0.decodeToString(gv.c.readBytes(inputStream));
            r32.getSerializersModule();
            return (t0) r32.decodeFromString(t0.Companion.serializer(), strDecodeToString);
        } catch (Exception e10) {
            throw new k4.e(gjnZrsdA.HxRnn, e10);
        }
    }

    public Object writeTo(t0 t0Var, OutputStream outputStream, zu.d<? super tu.x0> dVar) throws IOException {
        outputStream.write(sv.k0.encodeToByteArray(Json.Default.encodeToString(t0.Companion.serializer(), t0Var)));
        return tu.x0.f87415a;
    }
}

package io.odeeo.internal.z1;

import com.google.gson.Gson;
import com.google.gson.k0;
import com.google.gson.stream.JsonWriter;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.y1.f;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import pw.g;
import xv.j0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b<T> implements f<T, u0> {

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f67812c = j0.get("application/json; charset=UTF-8");

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f67813d = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final Gson f67814a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f67815b;

    public b(Gson gson, k0 k0Var) {
        this.f67814a = gson;
        this.f67815b = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.y1.f
    public /* bridge */ /* synthetic */ u0 convert(Object obj) throws IOException {
        return convert((b<T>) obj);
    }

    @Override // io.odeeo.internal.y1.f
    public u0 convert(T t10) throws IOException {
        g gVar = new g();
        JsonWriter jsonWriterNewJsonWriter = this.f67814a.newJsonWriter(new OutputStreamWriter(gVar.outputStream(), f67813d));
        this.f67815b.write(jsonWriterNewJsonWriter, t10);
        jsonWriterNewJsonWriter.close();
        return u0.create(f67812c, gVar.readByteString());
    }
}

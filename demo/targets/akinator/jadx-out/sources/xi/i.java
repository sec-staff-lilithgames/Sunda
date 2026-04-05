package xi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f92018a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f92019b;

    /* renamed from: c, reason: collision with root package name */
    public final ui.f f92020c;

    public i(HashMap map, HashMap map2, ui.f fVar) {
        this.f92018a = map;
        this.f92019b = map2;
        this.f92020c = fVar;
    }

    public static h builder() {
        return new h();
    }

    public void encode(Object obj, OutputStream outputStream) throws IOException {
        new g(outputStream, this.f92018a, this.f92019b, this.f92020c).g(obj);
    }

    public byte[] encode(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}

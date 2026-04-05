package md;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final xi.i f74340a = xi.i.builder().configureWith(h.f74278a).build();

    public static byte[] encode(Object obj) {
        return f74340a.encode(obj);
    }

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        f74340a.encode(obj, outputStream);
    }
}

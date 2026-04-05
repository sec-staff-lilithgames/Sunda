package yc;

import java.io.IOException;
import jc.h0;
import jc.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final tc.a f94325a;

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f94326b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f94327c;

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f94328d;

    static {
        tc.a aVar = new tc.a();
        f94325a = aVar;
        f94326b = aVar.writer();
        f94327c = aVar.writer().withDefaultPrettyPrinter();
        f94328d = aVar.readerFor(jc.t.class);
    }

    public static jc.t bytesToNode(byte[] bArr) throws IOException {
        return (jc.t) f94328d.readValue(bArr);
    }

    public static String nodeToPrettyString(b bVar) {
        try {
            return f94327c.writeValueAsString(new l(bVar));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String nodeToString(b bVar) {
        try {
            return f94326b.writeValueAsString(new l(bVar));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static byte[] valueToBytes(Object obj) throws IOException {
        return f94325a.writeValueAsBytes(obj);
    }
}

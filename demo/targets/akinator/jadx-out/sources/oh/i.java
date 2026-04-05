package oh;

import java.io.OutputStream;
import java.nio.charset.Charset;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i {
    public static OutputStream asOutputStream(p pVar) {
        f fVar = new f();
        if (p1.checkNotNull(pVar) == null) {
            return fVar;
        }
        throw new ClassCastException();
    }

    public static a byteArrayFunnel() {
        return b.f79384b;
    }

    public static a integerFunnel() {
        return c.f79386b;
    }

    public static a longFunnel() {
        return d.f79388b;
    }

    public static <E> a sequentialFunnel(a aVar) {
        return new e(aVar);
    }

    public static a stringFunnel(Charset charset) {
        return new g(charset);
    }

    public static a unencodedCharsFunnel() {
        return h.f79392b;
    }
}

package ph;

import java.nio.charset.Charset;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends v {

    /* renamed from: d, reason: collision with root package name */
    public static final x f81365d = new x(new byte[0], 0, 0);

    @Override // ph.z
    public m0 asCharSource(Charset charset) {
        p1.checkNotNull(charset);
        return m0.empty();
    }

    @Override // ph.v, ph.z
    public byte[] read() {
        return this.f81357a;
    }

    @Override // ph.v
    public String toString() {
        return "ByteSource.empty()";
    }
}

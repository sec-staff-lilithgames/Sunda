package ph;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h0 extends z {

    /* renamed from: a, reason: collision with root package name */
    public final Charset f81311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f81312b;

    public h0(m0 m0Var, Charset charset) {
        this.f81312b = m0Var;
        this.f81311a = (Charset) p1.checkNotNull(charset);
    }

    @Override // ph.z
    public m0 asCharSource(Charset charset) {
        return charset.equals(this.f81311a) ? this.f81312b : super.asCharSource(charset);
    }

    @Override // ph.z
    public InputStream openStream() throws IOException {
        return new x0(this.f81312b.openStream(), this.f81311a);
    }

    public String toString() {
        return this.f81312b.toString() + ".asByteSource(" + this.f81311a + ")";
    }
}

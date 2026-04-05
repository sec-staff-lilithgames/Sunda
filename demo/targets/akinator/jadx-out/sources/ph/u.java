package ph;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Charset f81349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f81350b;

    public u(z zVar, Charset charset) {
        this.f81350b = zVar;
        this.f81349a = (Charset) p1.checkNotNull(charset);
    }

    @Override // ph.m0
    public z asByteSource(Charset charset) {
        return charset.equals(this.f81349a) ? this.f81350b : super.asByteSource(charset);
    }

    @Override // ph.m0
    public Reader openStream() throws IOException {
        return new InputStreamReader(this.f81350b.openStream(), this.f81349a);
    }

    @Override // ph.m0
    public String read() throws IOException {
        return new String(this.f81350b.read(), this.f81349a);
    }

    public String toString() {
        return this.f81350b.toString() + ".asCharSource(" + this.f81349a + ")";
    }
}

package ph;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Charset f81343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f81344b;

    public s(t tVar, Charset charset) {
        this.f81344b = tVar;
        this.f81343a = (Charset) p1.checkNotNull(charset);
    }

    @Override // ph.g0
    public Writer openStream() throws IOException {
        return new OutputStreamWriter(this.f81344b.openStream(), this.f81343a);
    }

    public String toString() {
        return this.f81344b.toString() + ".asCharSink(" + this.f81343a + ")";
    }
}

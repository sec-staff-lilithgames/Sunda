package ph;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l0 extends i0 {
    @Override // ph.m0
    public long copyTo(Appendable appendable) throws IOException {
        appendable.append(this.f81314a);
        return r0.length();
    }

    @Override // ph.i0, ph.m0
    public Reader openStream() {
        return new StringReader((String) this.f81314a);
    }

    @Override // ph.m0
    public long copyTo(g0 g0Var) throws Throwable {
        CharSequence charSequence = this.f81314a;
        p1.checkNotNull(g0Var);
        try {
            ((Writer) s0.create().register(g0Var.openStream())).write((String) charSequence);
            return charSequence.length();
        } finally {
        }
    }
}

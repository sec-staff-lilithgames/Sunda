package oh;

import java.nio.charset.Charset;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements a {

    /* renamed from: b, reason: collision with root package name */
    public final Charset f79391b;

    public g(Charset charset) {
        this.f79391b = (Charset) p1.checkNotNull(charset);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f79391b.equals(((g) obj).f79391b);
        }
        return false;
    }

    public int hashCode() {
        return g.class.hashCode() ^ this.f79391b.hashCode();
    }

    public String toString() {
        return "Funnels.stringFunnel(" + this.f79391b.name() + ")";
    }

    @Override // oh.a
    public void funnel(CharSequence charSequence, p pVar) {
        pVar.a();
    }
}

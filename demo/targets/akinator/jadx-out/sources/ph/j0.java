package ph;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import mh.k1;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f81315a;

    public j0(Iterable iterable) {
        this.f81315a = (Iterable) p1.checkNotNull(iterable);
    }

    @Override // ph.m0
    public boolean isEmpty() throws IOException {
        Iterator it = this.f81315a.iterator();
        while (it.hasNext()) {
            if (!((m0) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // ph.m0
    public long length() throws IOException {
        Iterator it = this.f81315a.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += ((m0) it.next()).length();
        }
        return length;
    }

    @Override // ph.m0
    public k1 lengthIfKnown() {
        Iterator it = this.f81315a.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            k1 k1VarLengthIfKnown = ((m0) it.next()).lengthIfKnown();
            if (!k1VarLengthIfKnown.isPresent()) {
                return k1.absent();
            }
            jLongValue += ((Long) k1VarLengthIfKnown.get()).longValue();
        }
        return k1.of(Long.valueOf(jLongValue));
    }

    @Override // ph.m0
    public Reader openStream() throws IOException {
        return new w0(this.f81315a.iterator());
    }

    public String toString() {
        return "CharSource.concat(" + this.f81315a + ")";
    }
}

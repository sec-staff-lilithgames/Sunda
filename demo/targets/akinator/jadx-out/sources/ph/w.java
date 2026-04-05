package ph;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import mh.k1;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w extends z {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f81362a;

    public w(Iterable iterable) {
        this.f81362a = (Iterable) p1.checkNotNull(iterable);
    }

    @Override // ph.z
    public boolean isEmpty() throws IOException {
        Iterator it = this.f81362a.iterator();
        while (it.hasNext()) {
            if (!((z) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // ph.z
    public InputStream openStream() throws IOException {
        return new v0(this.f81362a.iterator());
    }

    @Override // ph.z
    public long size() throws IOException {
        Iterator it = this.f81362a.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((z) it.next()).size();
            if (size < 0) {
                return Long.MAX_VALUE;
            }
        }
        return size;
    }

    @Override // ph.z
    public k1 sizeIfKnown() {
        Iterable iterable = this.f81362a;
        if (!(iterable instanceof Collection)) {
            return k1.absent();
        }
        Iterator it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            k1 k1VarSizeIfKnown = ((z) it.next()).sizeIfKnown();
            if (!k1VarSizeIfKnown.isPresent()) {
                return k1.absent();
            }
            jLongValue += ((Long) k1VarSizeIfKnown.get()).longValue();
            if (jLongValue < 0) {
                return k1.of(Long.MAX_VALUE);
            }
        }
        return k1.of(Long.valueOf(jLongValue));
    }

    public String toString() {
        return "ByteSource.concat(" + this.f81362a + ")";
    }
}

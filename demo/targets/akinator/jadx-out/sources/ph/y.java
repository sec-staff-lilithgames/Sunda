package ph;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import mh.k1;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y extends z {

    /* renamed from: a, reason: collision with root package name */
    public final long f81374a;

    /* renamed from: b, reason: collision with root package name */
    public final long f81375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f81376c;

    public y(z zVar, long j10, long j11) {
        this.f81376c = zVar;
        p1.checkArgument(j10 >= 0, "offset (%s) may not be negative", j10);
        p1.checkArgument(j11 >= 0, "length (%s) may not be negative", j11);
        this.f81374a = j10;
        this.f81375b = j11;
    }

    public final InputStream a(InputStream inputStream) throws Throwable {
        long j10 = this.f81374a;
        if (j10 > 0) {
            try {
                if (e0.b(inputStream, j10) < j10) {
                    inputStream.close();
                    return new ByteArrayInputStream(new byte[0]);
                }
            } finally {
            }
        }
        return e0.limit(inputStream, this.f81375b);
    }

    @Override // ph.z
    public boolean isEmpty() throws IOException {
        return this.f81375b == 0 || super.isEmpty();
    }

    @Override // ph.z
    public InputStream openBufferedStream() throws IOException {
        return a(this.f81376c.openBufferedStream());
    }

    @Override // ph.z
    public InputStream openStream() throws IOException {
        return a(this.f81376c.openStream());
    }

    @Override // ph.z
    public k1 sizeIfKnown() {
        k1 k1VarSizeIfKnown = this.f81376c.sizeIfKnown();
        if (!k1VarSizeIfKnown.isPresent()) {
            return k1.absent();
        }
        long jLongValue = ((Long) k1VarSizeIfKnown.get()).longValue();
        return k1.of(Long.valueOf(Math.min(this.f81375b, jLongValue - Math.min(this.f81374a, jLongValue))));
    }

    @Override // ph.z
    public z slice(long j10, long j11) {
        p1.checkArgument(j10 >= 0, "offset (%s) may not be negative", j10);
        p1.checkArgument(j11 >= 0, "length (%s) may not be negative", j11);
        long j12 = this.f81375b - j10;
        if (j12 <= 0) {
            return z.empty();
        }
        return this.f81376c.slice(this.f81374a + j10, Math.min(j11, j12));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f81376c.toString());
        sb2.append(".slice(");
        sb2.append(this.f81374a);
        sb2.append(", ");
        return a.b.g(this.f81375b, ")", sb2);
    }
}

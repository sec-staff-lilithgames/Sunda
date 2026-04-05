package yr;

import java.io.IOException;
import java.util.List;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i implements as.d {

    /* renamed from: b, reason: collision with root package name */
    public final as.d f94925b;

    public i(as.d dVar) {
        this.f94925b = (as.d) p1.checkNotNull(dVar, "delegate");
    }

    @Override // as.d
    public void ackSettings(as.p pVar) throws IOException {
        this.f94925b.ackSettings(pVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f94925b.close();
    }

    @Override // as.d
    public void connectionPreface() throws IOException {
        this.f94925b.connectionPreface();
    }

    @Override // as.d
    public void data(boolean z10, int i10, pw.g gVar, int i11) throws IOException {
        this.f94925b.data(z10, i10, gVar, i11);
    }

    @Override // as.d
    public void flush() throws IOException {
        this.f94925b.flush();
    }

    @Override // as.d
    public void goAway(int i10, as.a aVar, byte[] bArr) throws IOException {
        this.f94925b.goAway(i10, aVar, bArr);
    }

    @Override // as.d
    public void headers(int i10, List<as.e> list) throws IOException {
        this.f94925b.headers(i10, list);
    }

    @Override // as.d
    public int maxDataLength() {
        return this.f94925b.maxDataLength();
    }

    @Override // as.d
    public void ping(boolean z10, int i10, int i11) throws IOException {
        this.f94925b.ping(z10, i10, i11);
    }

    @Override // as.d
    public void pushPromise(int i10, int i11, List<as.e> list) throws IOException {
        this.f94925b.pushPromise(i10, i11, list);
    }

    @Override // as.d
    public void rstStream(int i10, as.a aVar) throws IOException {
        this.f94925b.rstStream(i10, aVar);
    }

    @Override // as.d
    public void settings(as.p pVar) throws IOException {
        this.f94925b.settings(pVar);
    }

    @Override // as.d
    public void synReply(boolean z10, int i10, List<as.e> list) throws IOException {
        this.f94925b.synReply(z10, i10, list);
    }

    @Override // as.d
    public void synStream(boolean z10, boolean z11, int i10, int i11, List<as.e> list) throws IOException {
        this.f94925b.synStream(z10, z11, i10, i11, list);
    }

    @Override // as.d
    public void windowUpdate(int i10, long j10) throws IOException {
        this.f94925b.windowUpdate(i10, j10);
    }
}

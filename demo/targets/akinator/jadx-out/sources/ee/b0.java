package ee;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b0 implements q {

    /* renamed from: a, reason: collision with root package name */
    public final q f54167a;

    public b0(q qVar) {
        this.f54167a = qVar;
    }

    @Override // ee.q
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        return this.f54167a.advancePeekPosition(i10, z10);
    }

    @Override // ee.q
    public long getLength() {
        return this.f54167a.getLength();
    }

    @Override // ee.q
    public long getPeekPosition() {
        return this.f54167a.getPeekPosition();
    }

    @Override // ee.q
    public long getPosition() {
        return this.f54167a.getPosition();
    }

    @Override // ee.q
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        return this.f54167a.peek(bArr, i10, i11);
    }

    @Override // ee.q
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f54167a.peekFully(bArr, i10, i11, z10);
    }

    @Override // ee.q, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f54167a.read(bArr, i10, i11);
    }

    @Override // ee.q
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f54167a.readFully(bArr, i10, i11, z10);
    }

    @Override // ee.q
    public void resetPeekPosition() {
        this.f54167a.resetPeekPosition();
    }

    @Override // ee.q
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        this.f54167a.setRetryPosition(j10, e10);
    }

    @Override // ee.q
    public int skip(int i10) throws IOException {
        return this.f54167a.skip(i10);
    }

    @Override // ee.q
    public boolean skipFully(int i10, boolean z10) throws IOException {
        return this.f54167a.skipFully(i10, z10);
    }

    @Override // ee.q
    public void advancePeekPosition(int i10) throws IOException {
        this.f54167a.advancePeekPosition(i10);
    }

    @Override // ee.q
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f54167a.peekFully(bArr, i10, i11);
    }

    @Override // ee.q
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f54167a.readFully(bArr, i10, i11);
    }

    @Override // ee.q
    public void skipFully(int i10) throws IOException {
        this.f54167a.skipFully(i10);
    }
}

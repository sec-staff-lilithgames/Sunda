package ko;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class l0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f71703a;

    public l0(a0 a0Var) {
        this.f71703a = a0Var;
    }

    @Override // ko.a0
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        return this.f71703a.advancePeekPosition(i10, z10);
    }

    @Override // ko.a0
    public long getLength() {
        return this.f71703a.getLength();
    }

    @Override // ko.a0
    public long getPeekPosition() {
        return this.f71703a.getPeekPosition();
    }

    @Override // ko.a0
    public long getPosition() {
        return this.f71703a.getPosition();
    }

    @Override // ko.a0
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        return this.f71703a.peek(bArr, i10, i11);
    }

    @Override // ko.a0
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f71703a.peekFully(bArr, i10, i11, z10);
    }

    @Override // ko.a0, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f71703a.read(bArr, i10, i11);
    }

    @Override // ko.a0
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f71703a.readFully(bArr, i10, i11, z10);
    }

    @Override // ko.a0
    public void resetPeekPosition() {
        this.f71703a.resetPeekPosition();
    }

    @Override // ko.a0
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        this.f71703a.setRetryPosition(j10, e10);
    }

    @Override // ko.a0
    public int skip(int i10) throws IOException {
        return this.f71703a.skip(i10);
    }

    @Override // ko.a0
    public boolean skipFully(int i10, boolean z10) throws IOException {
        return this.f71703a.skipFully(i10, z10);
    }

    @Override // ko.a0
    public void advancePeekPosition(int i10) throws IOException {
        this.f71703a.advancePeekPosition(i10);
    }

    @Override // ko.a0
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f71703a.peekFully(bArr, i10, i11);
    }

    @Override // ko.a0
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f71703a.readFully(bArr, i10, i11);
    }

    @Override // ko.a0
    public void skipFully(int i10) throws IOException {
        this.f71703a.skipFully(i10);
    }
}

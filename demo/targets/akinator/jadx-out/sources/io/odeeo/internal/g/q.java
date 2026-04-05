package io.odeeo.internal.g;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f64162a;

    public q(i iVar) {
        this.f64162a = iVar;
    }

    @Override // io.odeeo.internal.g.i
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        return this.f64162a.advancePeekPosition(i10, z10);
    }

    @Override // io.odeeo.internal.g.i
    public long getLength() {
        return this.f64162a.getLength();
    }

    @Override // io.odeeo.internal.g.i
    public long getPeekPosition() {
        return this.f64162a.getPeekPosition();
    }

    @Override // io.odeeo.internal.g.i
    public long getPosition() {
        return this.f64162a.getPosition();
    }

    @Override // io.odeeo.internal.g.i
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        return this.f64162a.peek(bArr, i10, i11);
    }

    @Override // io.odeeo.internal.g.i
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f64162a.peekFully(bArr, i10, i11, z10);
    }

    @Override // io.odeeo.internal.g.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f64162a.read(bArr, i10, i11);
    }

    @Override // io.odeeo.internal.g.i
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f64162a.readFully(bArr, i10, i11, z10);
    }

    @Override // io.odeeo.internal.g.i
    public void resetPeekPosition() {
        this.f64162a.resetPeekPosition();
    }

    @Override // io.odeeo.internal.g.i
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        this.f64162a.setRetryPosition(j10, e10);
    }

    @Override // io.odeeo.internal.g.i
    public int skip(int i10) throws IOException {
        return this.f64162a.skip(i10);
    }

    @Override // io.odeeo.internal.g.i
    public boolean skipFully(int i10, boolean z10) throws IOException {
        return this.f64162a.skipFully(i10, z10);
    }

    @Override // io.odeeo.internal.g.i
    public void advancePeekPosition(int i10) throws IOException {
        this.f64162a.advancePeekPosition(i10);
    }

    @Override // io.odeeo.internal.g.i
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f64162a.peekFully(bArr, i10, i11);
    }

    @Override // io.odeeo.internal.g.i
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f64162a.readFully(bArr, i10, i11);
    }

    @Override // io.odeeo.internal.g.i
    public void skipFully(int i10) throws IOException {
        this.f64162a.skipFully(i10);
    }
}

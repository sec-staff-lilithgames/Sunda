package io.odeeo.internal.g;

import io.odeeo.internal.g.x;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements x {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f64141a = new byte[4096];

    @Override // io.odeeo.internal.g.x
    public /* bridge */ /* synthetic */ int sampleData(io.odeeo.internal.p0.g gVar, int i10, boolean z10) throws IOException {
        return super.sampleData(gVar, i10, z10);
    }

    @Override // io.odeeo.internal.g.x
    public /* bridge */ /* synthetic */ void sampleData(io.odeeo.internal.q0.x xVar, int i10) {
        super.sampleData(xVar, i10);
    }

    @Override // io.odeeo.internal.g.x
    public int sampleData(io.odeeo.internal.p0.g gVar, int i10, boolean z10, int i11) throws IOException {
        int i12 = gVar.read(this.f64141a, 0, Math.min(this.f64141a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // io.odeeo.internal.g.x
    public void sampleData(io.odeeo.internal.q0.x xVar, int i10, int i11) {
        xVar.skipBytes(i10);
    }

    @Override // io.odeeo.internal.g.x
    public void format(io.odeeo.internal.b.t tVar) {
    }

    @Override // io.odeeo.internal.g.x
    public void sampleMetadata(long j10, int i10, int i11, int i12, x.a aVar) {
    }
}

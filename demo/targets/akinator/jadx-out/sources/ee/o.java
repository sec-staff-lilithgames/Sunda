package ee;

import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.z0;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f54253a = new byte[4096];

    @Override // ee.l0
    public /* bridge */ /* synthetic */ int sampleData(qf.k kVar, int i10, boolean z10) throws IOException {
        return super.sampleData(kVar, i10, z10);
    }

    @Override // ee.l0
    public /* bridge */ /* synthetic */ void sampleData(v0 v0Var, int i10) {
        super.sampleData(v0Var, i10);
    }

    @Override // ee.l0
    public int sampleData(qf.k kVar, int i10, boolean z10, int i11) throws IOException {
        byte[] bArr = this.f54253a;
        int i12 = kVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // ee.l0
    public void sampleData(v0 v0Var, int i10, int i11) {
        v0Var.skipBytes(i10);
    }

    @Override // ee.l0
    public void format(z0 z0Var) {
    }

    @Override // ee.l0
    public void sampleMetadata(long j10, int i10, int i11, int i12, k0 k0Var) {
    }
}

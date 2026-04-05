package ko;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f71789a = new byte[4096];

    @Override // ko.e1
    public /* bridge */ /* synthetic */ void durationUs(long j10) {
        super.durationUs(j10);
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ int sampleData(gn.o oVar, int i10, boolean z10) throws IOException {
        return super.sampleData(oVar, i10, z10);
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ void sampleData(io.bidmachine.media3.common.util.m0 m0Var, int i10) {
        super.sampleData(m0Var, i10);
    }

    @Override // ko.e1
    public int sampleData(gn.o oVar, int i10, boolean z10, int i11) throws IOException {
        byte[] bArr = this.f71789a;
        int i12 = oVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // ko.e1
    public void sampleData(io.bidmachine.media3.common.util.m0 m0Var, int i10, int i11) {
        m0Var.skipBytes(i10);
    }

    @Override // ko.e1
    public void format(io.bidmachine.media3.common.b bVar) {
    }

    @Override // ko.e1
    public void sampleMetadata(long j10, int i10, int i11, int i12, d1 d1Var) {
    }
}

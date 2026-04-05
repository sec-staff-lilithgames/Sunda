package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q extends p {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26456d;

    public q(byte[] bArr) {
        bArr.getClass();
        this.f26456d = bArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public void a(int i10, byte[] bArr) {
        System.arraycopy(this.f26456d, 0, bArr, 0, i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public byte c(int i10) {
        return this.f26456d[i10];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public byte d(int i10) {
        return this.f26456d[i10];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final s e(int i10) {
        int iA = s.a(0, i10, size());
        return iA == 0 ? s.f26471b : new n(this.f26456d, g(), iA);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || size() != ((s) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof q)) {
            return obj.equals(this);
        }
        q qVar = (q) obj;
        int i10 = this.f26473a;
        int i11 = qVar.f26473a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > qVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > qVar.size()) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Ran off end of other: 0, ", size, ", ");
            sbA.append(qVar.size());
            throw new IllegalArgumentException(sbA.toString());
        }
        byte[] bArr = this.f26456d;
        byte[] bArr2 = qVar.f26456d;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = qVar.g();
        while (iG2 < iG) {
            if (bArr[iG2] != bArr2[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public int size() {
        return this.f26456d.length;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final void a(k kVar) {
        kVar.a(this.f26456d, g(), size());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final boolean c() {
        int iG = g();
        return d4.f26366a.b(this.f26456d, iG, size() + iG);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final w d() {
        byte[] bArr = this.f26456d;
        int iG = g();
        int size = size();
        t tVar = new t(bArr, iG, size, true);
        try {
            tVar.d(size);
            return tVar;
        } catch (n1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final int a(int i10, int i11) {
        byte[] bArr = this.f26456d;
        int iG = g();
        Charset charset = l1.f26429a;
        for (int i12 = iG; i12 < iG + i11; i12++) {
            i10 = (i10 * 31) + bArr[i12];
        }
        return i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final String e() {
        return new String(this.f26456d, g(), size(), l1.f26429a);
    }
}

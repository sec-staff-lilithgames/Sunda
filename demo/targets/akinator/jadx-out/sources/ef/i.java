package ef;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i extends ce.m implements k {

    /* renamed from: m, reason: collision with root package name */
    public final String f54322m;

    public i(String str) {
        super(new p[2], new q[2]);
        this.f54322m = str;
        int i10 = this.f12256g;
        ce.h[] hVarArr = this.f12254e;
        com.google.android.exoplayer2.util.a.checkState(i10 == hVarArr.length);
        for (ce.h hVar : hVarArr) {
            hVar.ensureSpaceForWrite(1024);
        }
    }

    @Override // ce.m
    public final l a(ce.h hVar, ce.j jVar, boolean z10) {
        p pVar = (p) hVar;
        q qVar = (q) jVar;
        try {
            ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.checkNotNull(pVar.f12237e);
            qVar.setContent(pVar.f12239g, c(byteBuffer.array(), byteBuffer.limit(), z10), pVar.f54335k);
            qVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (l e10) {
            return e10;
        }
    }

    public abstract j c(byte[] bArr, int i10, boolean z10);

    @Override // ce.m, ce.e
    public final String getName() {
        return this.f54322m;
    }

    @Override // ef.k
    public void setPositionUs(long j10) {
    }
}

package hp;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class h extends nn.k implements j {

    /* renamed from: n, reason: collision with root package name */
    public final String f59107n;

    public h(String str) {
        super(new n[2], new o[2]);
        this.f59107n = str;
        int i10 = this.f77095g;
        nn.g[] gVarArr = this.f77093e;
        io.bidmachine.media3.common.util.a.checkState(i10 == gVarArr.length);
        for (nn.g gVar : gVarArr) {
            gVar.ensureSpaceForWrite(1024);
        }
    }

    @Override // nn.k
    public final nn.g a() {
        return new n();
    }

    @Override // nn.k
    public final nn.i b() {
        return new g(this);
    }

    @Override // nn.k
    public final nn.f c(Throwable th2) {
        return new k("Unexpected decode error", th2);
    }

    @Override // nn.k
    public final nn.f d(nn.g gVar, nn.i iVar, boolean z10) {
        n nVar = (n) gVar;
        o oVar = (o) iVar;
        try {
            ByteBuffer byteBuffer = (ByteBuffer) io.bidmachine.media3.common.util.a.checkNotNull(nVar.f77080f);
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            s sVar = ((eo.b) this).f54792o;
            if (z10) {
                sVar.reset();
            }
            oVar.setContent(nVar.f77082h, sVar.parseToLegacySubtitle(bArrArray, 0, iLimit), nVar.f59121l);
            oVar.f77087e = false;
            return null;
        } catch (k e10) {
            return e10;
        }
    }

    @Override // nn.k, nn.e, hp.j
    public final String getName() {
        return this.f59107n;
    }

    @Override // hp.j
    public void setPositionUs(long j10) {
    }
}

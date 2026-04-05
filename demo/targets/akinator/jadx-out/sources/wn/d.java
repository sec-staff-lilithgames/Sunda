package wn;

import java.nio.ByteBuffer;
import nn.k;
import sn.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends k implements f {

    /* renamed from: n, reason: collision with root package name */
    public final b f90749n;

    public d(b bVar) {
        super(new nn.g[1], new i[1]);
        this.f90749n = bVar;
    }

    @Override // nn.k
    public final nn.g a() {
        return new nn.g(1);
    }

    @Override // nn.k
    public final nn.i b() {
        return new a(this);
    }

    @Override // nn.k
    public final nn.f c(Throwable th2) {
        return new g("Unexpected decode error", th2);
    }

    @Override // nn.k
    public final nn.f d(nn.g gVar, nn.i iVar, boolean z10) {
        i iVar2 = (i) iVar;
        try {
            ByteBuffer byteBuffer = (ByteBuffer) io.bidmachine.media3.common.util.a.checkNotNull(gVar.f77080f);
            io.bidmachine.media3.common.util.a.checkState(byteBuffer.hasArray());
            io.bidmachine.media3.common.util.a.checkArgument(byteBuffer.arrayOffset() == 0);
            iVar2.f90751f = ((t) this.f90749n).decode(byteBuffer.array(), byteBuffer.remaining());
            iVar2.f77086c = gVar.f77082h;
            return null;
        } catch (g e10) {
            return e10;
        }
    }

    @Override // nn.k, nn.e
    public /* bridge */ /* synthetic */ i dequeueOutputBuffer() throws g {
        return (i) dequeueOutputBuffer();
    }

    @Override // nn.k, nn.e, hp.j
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }
}

package co;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import ln.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o extends e {

    /* renamed from: j, reason: collision with root package name */
    public final h f12465j;

    /* renamed from: k, reason: collision with root package name */
    public g f12466k;

    /* renamed from: l, reason: collision with root package name */
    public ko.q f12467l;

    /* renamed from: m, reason: collision with root package name */
    public long f12468m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f12469n;

    public o(ln.i iVar, ln.m mVar, io.bidmachine.media3.common.b bVar, int i10, Object obj, h hVar) {
        super(iVar, mVar, 2, bVar, i10, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.f12465j = hVar;
    }

    @Override // co.e, go.x
    public void cancelLoad() {
        this.f12469n = true;
    }

    public ko.q getChunkIndex() {
        return this.f12467l;
    }

    public void init(g gVar) {
        this.f12466k = gVar;
    }

    @Override // co.e, go.x
    public void load() throws IOException {
        if (this.f12468m == 0) {
            this.f12465j.init(this.f12466k, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            ln.m mVarSubrange = this.f12418b.subrange(this.f12468m);
            e0 e0Var = this.f12425i;
            ko.s sVar = new ko.s(e0Var, mVarSubrange.f73472f, e0Var.open(mVarSubrange));
            while (!this.f12469n && this.f12465j.read(sVar)) {
                try {
                } finally {
                    this.f12468m = sVar.getPosition() - this.f12418b.f73472f;
                    this.f12467l = this.f12465j.getChunkIndex();
                }
            }
        } finally {
            ln.l.closeQuietly(this.f12425i);
        }
    }
}

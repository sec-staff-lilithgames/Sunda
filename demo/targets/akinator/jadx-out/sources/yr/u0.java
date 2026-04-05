package yr;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u0 extends i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f95054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, d dVar) {
        super(dVar);
        this.f95054c = v0Var;
    }

    @Override // yr.i, as.d
    public void data(boolean z10, int i10, pw.g gVar, int i11) throws IOException {
        this.f95054c.f95068m.resetCounters();
        super.data(z10, i10, gVar, i11);
    }

    @Override // yr.i, as.d
    public void headers(int i10, List<as.e> list) throws IOException {
        this.f95054c.f95068m.resetCounters();
        super.headers(i10, list);
    }

    @Override // yr.i, as.d
    public void synReply(boolean z10, int i10, List<as.e> list) throws IOException {
        this.f95054c.f95068m.resetCounters();
        super.synReply(z10, i10, list);
    }
}

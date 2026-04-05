package je;

import ee.g0;
import ee.i0;
import ee.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f69522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f69523b;

    public d(e eVar, i0 i0Var) {
        this.f69523b = eVar;
        this.f69522a = i0Var;
    }

    @Override // ee.i0
    public long getDurationUs() {
        return this.f69522a.getDurationUs();
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        g0 seekPoints = this.f69522a.getSeekPoints(j10);
        j0 j0Var = seekPoints.f54193a;
        long j11 = j0Var.f54211a;
        long j12 = j0Var.f54212b;
        e eVar = this.f69523b;
        j0 j0Var2 = new j0(j11, j12 + eVar.f69524b);
        j0 j0Var3 = seekPoints.f54194b;
        return new g0(j0Var2, new j0(j0Var3.f54211a, j0Var3.f54212b + eVar.f69524b));
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return this.f69522a.isSeekable();
    }
}

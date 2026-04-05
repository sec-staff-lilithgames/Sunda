package so;

import ko.m0;
import ko.w0;
import ko.y0;
import ko.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f86062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f86063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, y0 y0Var, y0 y0Var2) {
        super(y0Var);
        this.f86063c = fVar;
        this.f86062b = y0Var2;
    }

    @Override // ko.m0, ko.y0
    public w0 getSeekPoints(long j10) {
        w0 seekPoints = this.f86062b.getSeekPoints(j10);
        z0 z0Var = seekPoints.f71792a;
        long j11 = z0Var.f71811a;
        long j12 = z0Var.f71812b;
        f fVar = this.f86063c;
        z0 z0Var2 = new z0(j11, j12 + fVar.f86064b);
        z0 z0Var3 = seekPoints.f71793b;
        return new w0(z0Var2, new z0(z0Var3.f71811a, z0Var3.f71812b + fVar.f86064b));
    }
}

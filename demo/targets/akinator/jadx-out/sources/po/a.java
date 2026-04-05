package po;

import java.io.IOException;
import ko.a0;
import ko.f0;
import ko.g0;
import ko.k0;
import ko.m;
import ko.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f81594a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81595b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f81596c = new f0();

    public a(k0 k0Var, int i10) {
        this.f81594a = k0Var;
        this.f81595b = i10;
    }

    public final long a(a0 a0Var) throws IOException {
        f0 f0Var;
        k0 k0Var;
        while (true) {
            long peekPosition = a0Var.getPeekPosition();
            long length = a0Var.getLength() - 6;
            f0Var = this.f81596c;
            k0Var = this.f81594a;
            if (peekPosition >= length || g0.checkFrameHeaderFromPeek(a0Var, k0Var, this.f81595b, f0Var)) {
                break;
            }
            a0Var.advancePeekPosition(1);
        }
        if (a0Var.getPeekPosition() < a0Var.getLength() - 6) {
            return f0Var.f71637a;
        }
        a0Var.advancePeekPosition((int) (a0Var.getLength() - a0Var.getPeekPosition()));
        return k0Var.f71698j;
    }

    @Override // ko.n
    public /* bridge */ /* synthetic */ void onSeekFinished() {
        super.onSeekFinished();
    }

    @Override // ko.n
    public m searchForTimestamp(a0 a0Var, long j10) throws IOException {
        long position = a0Var.getPosition();
        long jA = a(a0Var);
        long peekPosition = a0Var.getPeekPosition();
        a0Var.advancePeekPosition(Math.max(6, this.f81594a.f71691c));
        long jA2 = a(a0Var);
        return (jA > j10 || jA2 <= j10) ? jA2 <= j10 ? m.underestimatedResult(jA2, a0Var.getPeekPosition()) : m.overestimatedResult(jA, position) : m.targetFoundResult(peekPosition);
    }
}

package he;

import ee.a0;
import ee.e;
import ee.f;
import ee.q;
import ee.v;
import ee.w;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f58734a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58735b;

    /* renamed from: c, reason: collision with root package name */
    public final v f58736c = new v();

    public a(a0 a0Var, int i10) {
        this.f58734a = a0Var;
        this.f58735b = i10;
    }

    public final long a(q qVar) throws IOException {
        v vVar;
        a0 a0Var;
        while (true) {
            long peekPosition = qVar.getPeekPosition();
            long length = qVar.getLength() - 6;
            vVar = this.f58736c;
            a0Var = this.f58734a;
            if (peekPosition >= length || w.checkFrameHeaderFromPeek(qVar, a0Var, this.f58735b, vVar)) {
                break;
            }
            qVar.advancePeekPosition(1);
        }
        if (qVar.getPeekPosition() < qVar.getLength() - 6) {
            return vVar.f54263a;
        }
        qVar.advancePeekPosition((int) (qVar.getLength() - qVar.getPeekPosition()));
        return a0Var.f54162j;
    }

    @Override // ee.f
    public /* bridge */ /* synthetic */ void onSeekFinished() {
        super.onSeekFinished();
    }

    @Override // ee.f
    public e searchForTimestamp(q qVar, long j10) throws IOException {
        long position = qVar.getPosition();
        long jA = a(qVar);
        long peekPosition = qVar.getPeekPosition();
        qVar.advancePeekPosition(Math.max(6, this.f58734a.f54155c));
        long jA2 = a(qVar);
        return (jA > j10 || jA2 <= j10) ? jA2 <= j10 ? e.underestimatedResult(jA2, qVar.getPeekPosition()) : e.overestimatedResult(jA, position) : e.targetFoundResult(peekPosition);
    }
}

package hn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends j {
    @Override // hn.j, hn.h
    public /* bridge */ /* synthetic */ long getDurationAfterProcessorApplied(long j10) {
        return super.getDurationAfterProcessorApplied(j10);
    }

    @Override // hn.j
    public f onConfigure(f fVar) throws g {
        int i10 = fVar.f59040c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 2 ? new f(fVar.f59038a, fVar.f59039b, 2) : f.f59037e;
        }
        throw new g(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // hn.j, hn.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void queueInput(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.m.queueInput(java.nio.ByteBuffer):void");
    }
}

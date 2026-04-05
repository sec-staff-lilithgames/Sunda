package io.odeeo.internal.i;

import io.odeeo.internal.g.a;
import io.odeeo.internal.g.i;
import io.odeeo.internal.g.m;
import io.odeeo.internal.g.p;
import java.io.IOException;
import java.util.Objects;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends io.odeeo.internal.g.a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final p f64283a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64284b;

        /* renamed from: c, reason: collision with root package name */
        public final m.a f64285c;

        public final long a(i iVar) throws IOException {
            while (iVar.getPeekPosition() < iVar.getLength() - 6 && !m.checkFrameHeaderFromPeek(iVar, this.f64283a, this.f64284b, this.f64285c)) {
                iVar.advancePeekPosition(1);
            }
            if (iVar.getPeekPosition() < iVar.getLength() - 6) {
                return this.f64285c.f64144a;
            }
            iVar.advancePeekPosition((int) (iVar.getLength() - iVar.getPeekPosition()));
            return this.f64283a.f64157j;
        }

        @Override // io.odeeo.internal.g.a.f
        public /* bridge */ /* synthetic */ void onSeekFinished() {
            super.onSeekFinished();
        }

        @Override // io.odeeo.internal.g.a.f
        public a.e searchForTimestamp(i iVar, long j10) throws IOException {
            long position = iVar.getPosition();
            long jA = a(iVar);
            long peekPosition = iVar.getPeekPosition();
            iVar.advancePeekPosition(Math.max(6, this.f64283a.f64150c));
            long jA2 = a(iVar);
            return (jA > j10 || jA2 <= j10) ? jA2 <= j10 ? a.e.underestimatedResult(jA2, iVar.getPeekPosition()) : a.e.overestimatedResult(jA, position) : a.e.targetFoundResult(peekPosition);
        }

        public b(p pVar, int i10) {
            this.f64283a = pVar;
            this.f64284b = i10;
            this.f64285c = new m.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p pVar, int i10, long j10, long j11) {
        super(new b3(pVar, 12), new b(pVar, i10), pVar.getDurationUs(), 0L, pVar.f64157j, j10, j11, pVar.getApproxBytesPerFrame(), Math.max(6, pVar.f64150c));
        Objects.requireNonNull(pVar);
    }
}

package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.a;
import io.odeeo.internal.q0.g0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends io.odeeo.internal.g.a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.q0.e0 f65223a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.q0.x f65224b = new io.odeeo.internal.q0.x();

        /* renamed from: c, reason: collision with root package name */
        public final int f65225c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65226d;

        public a(int i10, io.odeeo.internal.q0.e0 e0Var, int i11) {
            this.f65225c = i10;
            this.f65223a = e0Var;
            this.f65226d = i11;
        }

        public final a.e a(io.odeeo.internal.q0.x xVar, long j10, long j11) {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            int iLimit = xVar.limit();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (xVar.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = e0.findSyncBytePosition(xVar.getData(), xVar.getPosition(), iLimit)) + 188) <= iLimit) {
                long pcrFromPacket = e0.readPcrFromPacket(xVar, iFindSyncBytePosition, this.f65225c);
                if (pcrFromPacket != C.TIME_UNSET) {
                    long jAdjustTsTimestamp = this.f65223a.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > j10) {
                        return j14 == C.TIME_UNSET ? a.e.overestimatedResult(jAdjustTsTimestamp, j11) : a.e.targetFoundResult(j11 + j13);
                    }
                    if (100000 + jAdjustTsTimestamp > j10) {
                        return a.e.targetFoundResult(j11 + iFindSyncBytePosition);
                    }
                    j13 = iFindSyncBytePosition;
                    j14 = jAdjustTsTimestamp;
                }
                xVar.setPosition(iFindSyncBytePosition2);
                j12 = iFindSyncBytePosition2;
            }
            return j14 != C.TIME_UNSET ? a.e.underestimatedResult(j14, j11 + j12) : a.e.f64079d;
        }

        @Override // io.odeeo.internal.g.a.f
        public void onSeekFinished() {
            this.f65224b.reset(g0.f65866f);
        }

        @Override // io.odeeo.internal.g.a.f
        public a.e searchForTimestamp(io.odeeo.internal.g.i iVar, long j10) throws IOException {
            long position = iVar.getPosition();
            int iMin = (int) Math.min(this.f65226d, iVar.getLength() - position);
            this.f65224b.reset(iMin);
            iVar.peekFully(this.f65224b.getData(), 0, iMin);
            return a(this.f65224b, j10, position);
        }
    }

    public a0(io.odeeo.internal.q0.e0 e0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, e0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}

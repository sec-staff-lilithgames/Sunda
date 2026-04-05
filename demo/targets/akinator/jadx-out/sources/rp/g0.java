package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.u0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 extends ko.o {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements ko.n {

        /* renamed from: a, reason: collision with root package name */
        public final u0 f84635a;

        /* renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.common.util.m0 f84636b = new io.bidmachine.media3.common.util.m0();

        /* renamed from: c, reason: collision with root package name */
        public final int f84637c;

        /* renamed from: d, reason: collision with root package name */
        public final int f84638d;

        public a(int i10, u0 u0Var, int i11) {
            this.f84637c = i10;
            this.f84635a = u0Var;
            this.f84638d = i11;
        }

        @Override // ko.n
        public void onSeekFinished() {
            this.f84636b.reset(a1.f60681c);
        }

        @Override // ko.n
        public ko.m searchForTimestamp(ko.a0 a0Var, long j10) throws IOException {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            long position = a0Var.getPosition();
            int iMin = (int) Math.min(this.f84638d, a0Var.getLength() - position);
            io.bidmachine.media3.common.util.m0 m0Var = this.f84636b;
            m0Var.reset(iMin);
            a0Var.peekFully(m0Var.getData(), 0, iMin);
            int iLimit = m0Var.limit();
            long j11 = -1;
            long j12 = -1;
            long j13 = -9223372036854775807L;
            while (m0Var.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = o0.findSyncBytePosition(m0Var.getData(), m0Var.getPosition(), iLimit)) + 188) <= iLimit) {
                long pcrFromPacket = o0.readPcrFromPacket(m0Var, iFindSyncBytePosition, this.f84637c);
                if (pcrFromPacket != C.TIME_UNSET) {
                    long jAdjustTsTimestamp = this.f84635a.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > j10) {
                        return j13 == C.TIME_UNSET ? ko.m.overestimatedResult(jAdjustTsTimestamp, position) : ko.m.targetFoundResult(position + j12);
                    }
                    if (100000 + jAdjustTsTimestamp > j10) {
                        return ko.m.targetFoundResult(position + iFindSyncBytePosition);
                    }
                    j12 = iFindSyncBytePosition;
                    j13 = jAdjustTsTimestamp;
                }
                m0Var.setPosition(iFindSyncBytePosition2);
                j11 = iFindSyncBytePosition2;
            }
            return j13 != C.TIME_UNSET ? ko.m.underestimatedResult(j13, position + j11) : ko.m.f71704d;
        }
    }

    public g0(u0 u0Var, long j10, long j11, int i10, int i11) {
        super(new ko.j(), new a(i10, u0Var, i11), j10, j10 + 1, 0L, j11, 188L, 940);
    }
}

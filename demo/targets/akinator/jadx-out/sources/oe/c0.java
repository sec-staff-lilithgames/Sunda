package oe;

import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 extends ee.g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements ee.f {

        /* renamed from: a, reason: collision with root package name */
        public final h1 f78996a;

        /* renamed from: b, reason: collision with root package name */
        public final v0 f78997b = new v0();

        /* renamed from: c, reason: collision with root package name */
        public final int f78998c;

        /* renamed from: d, reason: collision with root package name */
        public final int f78999d;

        public a(int i10, h1 h1Var, int i11) {
            this.f78998c = i10;
            this.f78996a = h1Var;
            this.f78999d = i11;
        }

        @Override // ee.f
        public void onSeekFinished() {
            this.f78997b.reset(n1.f28511f);
        }

        @Override // ee.f
        public ee.e searchForTimestamp(ee.q qVar, long j10) throws IOException {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            long position = qVar.getPosition();
            int iMin = (int) Math.min(this.f78999d, qVar.getLength() - position);
            v0 v0Var = this.f78997b;
            v0Var.reset(iMin);
            qVar.peekFully(v0Var.getData(), 0, iMin);
            int iLimit = v0Var.limit();
            long j11 = -1;
            long j12 = -1;
            long j13 = -9223372036854775807L;
            while (v0Var.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = k0.findSyncBytePosition(v0Var.getData(), v0Var.getPosition(), iLimit)) + 188) <= iLimit) {
                long pcrFromPacket = k0.readPcrFromPacket(v0Var, iFindSyncBytePosition, this.f78998c);
                if (pcrFromPacket != C.TIME_UNSET) {
                    long jAdjustTsTimestamp = this.f78996a.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > j10) {
                        return j13 == C.TIME_UNSET ? ee.e.overestimatedResult(jAdjustTsTimestamp, position) : ee.e.targetFoundResult(position + j12);
                    }
                    if (100000 + jAdjustTsTimestamp > j10) {
                        return ee.e.targetFoundResult(position + iFindSyncBytePosition);
                    }
                    j12 = iFindSyncBytePosition;
                    j13 = jAdjustTsTimestamp;
                }
                v0Var.setPosition(iFindSyncBytePosition2);
                j11 = iFindSyncBytePosition2;
            }
            return j13 != C.TIME_UNSET ? ee.e.underestimatedResult(j13, position + j11) : ee.e.f54180d;
        }
    }

    public c0(h1 h1Var, long j10, long j11, int i10, int i11) {
        super(new ee.b(), new a(i10, h1Var, i11), j10, j10 + 1, 0L, j11, 188L, 940);
    }
}

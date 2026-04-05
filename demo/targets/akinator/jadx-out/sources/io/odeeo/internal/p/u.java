package io.odeeo.internal.p;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.a;
import io.odeeo.internal.q0.g0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends io.odeeo.internal.g.a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.q0.e0 f65543a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.q0.x f65544b;

        public final a.e a(io.odeeo.internal.q0.x xVar, long j10, long j11) {
            int position = -1;
            int position2 = -1;
            long j12 = -9223372036854775807L;
            while (xVar.bytesLeft() >= 4) {
                if (u.b(xVar.getData(), xVar.getPosition()) != 442) {
                    xVar.skipBytes(1);
                } else {
                    xVar.skipBytes(4);
                    long scrValueFromPack = v.readScrValueFromPack(xVar);
                    if (scrValueFromPack != C.TIME_UNSET) {
                        long jAdjustTsTimestamp = this.f65543a.adjustTsTimestamp(scrValueFromPack);
                        if (jAdjustTsTimestamp > j10) {
                            return j12 == C.TIME_UNSET ? a.e.overestimatedResult(jAdjustTsTimestamp, j11) : a.e.targetFoundResult(j11 + position2);
                        }
                        if (100000 + jAdjustTsTimestamp > j10) {
                            return a.e.targetFoundResult(j11 + xVar.getPosition());
                        }
                        position2 = xVar.getPosition();
                        j12 = jAdjustTsTimestamp;
                    }
                    a(xVar);
                    position = xVar.getPosition();
                }
            }
            return j12 != C.TIME_UNSET ? a.e.underestimatedResult(j12, j11 + position) : a.e.f64079d;
        }

        @Override // io.odeeo.internal.g.a.f
        public void onSeekFinished() {
            this.f65544b.reset(g0.f65866f);
        }

        @Override // io.odeeo.internal.g.a.f
        public a.e searchForTimestamp(io.odeeo.internal.g.i iVar, long j10) throws IOException {
            long position = iVar.getPosition();
            int iMin = (int) Math.min(20000L, iVar.getLength() - position);
            this.f65544b.reset(iMin);
            iVar.peekFully(this.f65544b.getData(), 0, iMin);
            return a(this.f65544b, j10, position);
        }

        public b(io.odeeo.internal.q0.e0 e0Var) {
            this.f65543a = e0Var;
            this.f65544b = new io.odeeo.internal.q0.x();
        }

        public static void a(io.odeeo.internal.q0.x xVar) {
            int iB;
            int iLimit = xVar.limit();
            if (xVar.bytesLeft() < 10) {
                xVar.setPosition(iLimit);
                return;
            }
            xVar.skipBytes(9);
            int unsignedByte = xVar.readUnsignedByte() & 7;
            if (xVar.bytesLeft() < unsignedByte) {
                xVar.setPosition(iLimit);
                return;
            }
            xVar.skipBytes(unsignedByte);
            if (xVar.bytesLeft() >= 4) {
                if (u.b(xVar.getData(), xVar.getPosition()) == 443) {
                    xVar.skipBytes(4);
                    int unsignedShort = xVar.readUnsignedShort();
                    if (xVar.bytesLeft() < unsignedShort) {
                        xVar.setPosition(iLimit);
                        return;
                    }
                    xVar.skipBytes(unsignedShort);
                }
                while (xVar.bytesLeft() >= 4 && (iB = u.b(xVar.getData(), xVar.getPosition())) != 442 && iB != 441 && (iB >>> 8) == 1) {
                    xVar.skipBytes(4);
                    if (xVar.bytesLeft() < 2) {
                        xVar.setPosition(iLimit);
                        return;
                    }
                    xVar.setPosition(Math.min(xVar.limit(), xVar.getPosition() + xVar.readUnsignedShort()));
                }
                return;
            }
            xVar.setPosition(iLimit);
        }
    }

    public u(io.odeeo.internal.q0.e0 e0Var, long j10, long j11) {
        super(new a.b(), new b(e0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}

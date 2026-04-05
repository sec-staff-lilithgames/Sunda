package jo;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import io.bidmachine.media3.exoplayer.a0;
import io.bidmachine.media3.exoplayer.r0;
import io.bidmachine.media3.exoplayer.u1;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends io.bidmachine.media3.exoplayer.i {

    /* renamed from: t, reason: collision with root package name */
    public final nn.g f69812t;

    /* renamed from: u, reason: collision with root package name */
    public final m0 f69813u;

    /* renamed from: v, reason: collision with root package name */
    public a f69814v;

    /* renamed from: w, reason: collision with root package name */
    public long f69815w;

    public b() {
        super(6);
        this.f69812t = new nn.g(1);
        this.f69813u = new m0();
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void d() {
        a aVar = this.f69814v;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        super.enableMayRenderStartOfStream();
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void f(long j10, boolean z10) {
        this.f69815w = Long.MIN_VALUE;
        a aVar = this.f69814v;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ long getDurationToProgressUs(long j10, long j11) {
        return super.getDurationToProgressUs(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.u1
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.n1
    public void handleMessage(int i10, Object obj) throws a0 {
        if (i10 == 8) {
            this.f69814v = (a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isReady() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public void render(long j10, long j11) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.f69815w < 100000 + j10) {
            nn.g gVar = this.f69812t;
            gVar.clear();
            r0 r0Var = this.f61238e;
            r0Var.clear();
            if (l(r0Var, gVar, 0) != -4 || gVar.isEndOfStream()) {
                return;
            }
            long j12 = gVar.f77082h;
            this.f69815w = j12;
            boolean z10 = j12 < this.f61247n;
            if (this.f69814v != null && !z10) {
                gVar.flip();
                ByteBuffer byteBuffer = (ByteBuffer) a1.castNonNull(gVar.f77080f);
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    m0 m0Var = this.f69813u;
                    m0Var.reset(bArrArray, iLimit);
                    m0Var.setPosition(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(m0Var.readLittleEndianInt());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    ((a) a1.castNonNull(this.f69814v)).onCameraMotion(this.f69815w - this.f61246m, fArr);
                }
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws a0 {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.u1
    public int supportsFormat(io.bidmachine.media3.common.b bVar) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(bVar.f60665o) ? u1.create(4) : u1.create(0);
    }
}

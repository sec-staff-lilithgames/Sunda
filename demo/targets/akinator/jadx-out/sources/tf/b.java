package tf;

import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends com.google.android.exoplayer2.f {

    /* renamed from: q, reason: collision with root package name */
    public final ce.h f86831q;

    /* renamed from: r, reason: collision with root package name */
    public final v0 f86832r;

    /* renamed from: s, reason: collision with root package name */
    public long f86833s;

    /* renamed from: t, reason: collision with root package name */
    public a f86834t;

    /* renamed from: u, reason: collision with root package name */
    public long f86835u;

    public b() {
        super(6);
        this.f86831q = new ce.h(1);
        this.f86832r = new v0();
    }

    @Override // com.google.android.exoplayer2.f
    public final void b() {
        a aVar = this.f86834t;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }

    @Override // com.google.android.exoplayer2.f
    public final void d(long j10, boolean z10) {
        this.f86835u = Long.MIN_VALUE;
        a aVar = this.f86834t;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2, com.google.android.exoplayer2.b3
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2, com.google.android.exoplayer2.t2
    public void handleMessage(int i10, Object obj) throws r {
        if (i10 == 8) {
            this.f86834t = (a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // com.google.android.exoplayer2.f
    public final void i(z0[] z0VarArr, long j10, long j11) {
        this.f86833s = j11;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public void render(long j10, long j11) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.f86835u < 100000 + j10) {
            ce.h hVar = this.f86831q;
            hVar.clear();
            a1 a1Var = this.f27449e;
            a1Var.clear();
            if (j(a1Var, hVar, 0) != -4 || hVar.isEndOfStream()) {
                return;
            }
            this.f86835u = hVar.f12239g;
            if (this.f86834t != null && !hVar.isDecodeOnly()) {
                hVar.flip();
                ByteBuffer byteBuffer = (ByteBuffer) n1.castNonNull(hVar.f12237e);
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    v0 v0Var = this.f86832r;
                    v0Var.reset(bArrArray, iLimit);
                    v0Var.setPosition(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(v0Var.readLittleEndianInt());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    ((a) n1.castNonNull(this.f86834t)).onCameraMotion(this.f86835u - this.f86833s, fArr);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws r {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.b3
    public int supportsFormat(z0 z0Var) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(z0Var.f28802n) ? b3.create(4) : b3.create(0);
    }
}

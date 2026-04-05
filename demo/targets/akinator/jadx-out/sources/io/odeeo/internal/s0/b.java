package io.odeeo.internal.s0;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.n;
import io.odeeo.internal.b.q0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.x;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends io.odeeo.internal.b.e {

    /* renamed from: n, reason: collision with root package name */
    public final io.odeeo.internal.e.g f66260n;

    /* renamed from: o, reason: collision with root package name */
    public final x f66261o;

    /* renamed from: p, reason: collision with root package name */
    public long f66262p;

    /* renamed from: q, reason: collision with root package name */
    public a f66263q;

    /* renamed from: r, reason: collision with root package name */
    public long f66264r;

    public b() {
        super(6);
        this.f66260n = new io.odeeo.internal.e.g(1);
        this.f66261o = new x();
    }

    @Override // io.odeeo.internal.b.e
    public void a(t[] tVarArr, long j10, long j11) {
        this.f66262p = j11;
    }

    @Override // io.odeeo.internal.b.e
    public void f() {
        j();
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0, io.odeeo.internal.b.q0
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0, io.odeeo.internal.b.m0.b
    public void handleMessage(int i10, Object obj) throws n {
        if (i10 == 8) {
            this.f66263q = (a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isReady() {
        return true;
    }

    public final void j() {
        a aVar = this.f66263q;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public void render(long j10, long j11) {
        while (!hasReadStreamToEnd() && this.f66264r < 100000 + j10) {
            this.f66260n.clear();
            if (a(b(), this.f66260n, 0) != -4 || this.f66260n.isEndOfStream()) {
                return;
            }
            io.odeeo.internal.e.g gVar = this.f66260n;
            this.f66264r = gVar.f63707e;
            if (this.f66263q != null && !gVar.isDecodeOnly()) {
                this.f66260n.flip();
                float[] fArrA = a((ByteBuffer) g0.castNonNull(this.f66260n.f63705c));
                if (fArrA != null) {
                    ((a) g0.castNonNull(this.f66263q)).onCameraMotion(this.f66264r - this.f66262p, fArrA);
                }
            }
        }
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.q0
    public int supportsFormat(t tVar) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(tVar.f62971l) ? q0.create(4) : q0.create(0);
    }

    @Override // io.odeeo.internal.b.e
    public void a(long j10, boolean z10) {
        this.f66264r = Long.MIN_VALUE;
        j();
    }

    public final float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f66261o.reset(byteBuffer.array(), byteBuffer.limit());
        this.f66261o.setPosition(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f66261o.readLittleEndianInt());
        }
        return fArr;
    }
}

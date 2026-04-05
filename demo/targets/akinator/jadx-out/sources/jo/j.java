package jo;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.s;
import io.bidmachine.media3.common.util.t;
import io.bidmachine.media3.common.util.t0;
import io.v;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements v, a {

    /* renamed from: k, reason: collision with root package name */
    public int f69862k;

    /* renamed from: l, reason: collision with root package name */
    public SurfaceTexture f69863l;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f69866o;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f69854b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f69855c = new AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public final i f69856e = new i();

    /* renamed from: f, reason: collision with root package name */
    public final c f69857f = new c();

    /* renamed from: g, reason: collision with root package name */
    public final t0 f69858g = new t0();

    /* renamed from: h, reason: collision with root package name */
    public final t0 f69859h = new t0();

    /* renamed from: i, reason: collision with root package name */
    public final float[] f69860i = new float[16];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f69861j = new float[16];

    /* renamed from: m, reason: collision with root package name */
    public volatile int f69864m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f69865n = -1;

    public void drawFrame(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            t.checkGlError();
        } catch (s e10) {
            b0.e("SceneRenderer", "Failed to draw a frame", e10);
        }
        boolean zCompareAndSet = this.f69854b.compareAndSet(true, false);
        i iVar = this.f69856e;
        if (zCompareAndSet) {
            ((SurfaceTexture) io.bidmachine.media3.common.util.a.checkNotNull(this.f69863l)).updateTexImage();
            try {
                t.checkGlError();
            } catch (s e11) {
                b0.e("SceneRenderer", "Failed to draw a frame", e11);
            }
            boolean zCompareAndSet2 = this.f69855c.compareAndSet(true, false);
            float[] fArr2 = this.f69860i;
            if (zCompareAndSet2) {
                t.setToIdentity(fArr2);
            }
            long timestamp = this.f69863l.getTimestamp();
            Long l9 = (Long) this.f69858g.poll(timestamp);
            if (l9 != null) {
                this.f69857f.pollRotationMatrix(fArr2, l9.longValue());
            }
            f fVar = (f) this.f69859h.pollFloor(timestamp);
            if (fVar != null) {
                iVar.setProjection(fVar);
            }
        }
        Matrix.multiplyMM(this.f69861j, 0, fArr, 0, this.f69860i, 0);
        iVar.draw(this.f69862k, this.f69861j, z10);
    }

    public SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            t.checkGlError();
            this.f69856e.init();
            t.checkGlError();
            this.f69862k = t.createExternalTexture();
        } catch (s e10) {
            b0.e("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f69862k);
        this.f69863l = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new ft.a(this, 1));
        return this.f69863l;
    }

    @Override // jo.a
    public void onCameraMotion(long j10, float[] fArr) {
        this.f69857f.setRotation(j10, fArr);
    }

    @Override // jo.a
    public void onCameraMotionReset() {
        this.f69858g.clear();
        this.f69857f.reset();
        this.f69855c.set(true);
    }

    @Override // io.v
    public void onVideoFrameAboutToBeRendered(long j10, long j11, io.bidmachine.media3.common.b bVar, MediaFormat mediaFormat) {
        this.f69858g.add(j11, Long.valueOf(j10));
        byte[] bArr = bVar.A;
        int i10 = bVar.B;
        byte[] bArr2 = this.f69866o;
        int i11 = this.f69865n;
        this.f69866o = bArr;
        if (i10 == -1) {
            i10 = this.f69864m;
        }
        this.f69865n = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f69866o)) {
            return;
        }
        byte[] bArr3 = this.f69866o;
        f fVarDecode = bArr3 != null ? g.decode(bArr3, this.f69865n) : null;
        if (fVarDecode == null || !i.isSupported(fVarDecode)) {
            fVarDecode = f.createEquirectangular(this.f69865n);
        }
        this.f69859h.add(j11, fVarDecode);
    }

    public void setDefaultStereoMode(int i10) {
        this.f69864m = i10;
    }

    public void shutdown() {
        this.f69856e.shutdown();
    }
}

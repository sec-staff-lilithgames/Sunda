package tf;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g1;
import com.google.android.exoplayer2.util.w;
import com.google.android.exoplayer2.util.x;
import com.google.android.exoplayer2.z0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements sf.l, a {

    /* renamed from: k, reason: collision with root package name */
    public int f86882k;

    /* renamed from: l, reason: collision with root package name */
    public SurfaceTexture f86883l;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f86886o;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f86874b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f86875c = new AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public final i f86876e = new i();

    /* renamed from: f, reason: collision with root package name */
    public final c f86877f = new c();

    /* renamed from: g, reason: collision with root package name */
    public final g1 f86878g = new g1();

    /* renamed from: h, reason: collision with root package name */
    public final g1 f86879h = new g1();

    /* renamed from: i, reason: collision with root package name */
    public final float[] f86880i = new float[16];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f86881j = new float[16];

    /* renamed from: m, reason: collision with root package name */
    public volatile int f86884m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f86885n = -1;

    public void drawFrame(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            x.checkGlError();
        } catch (w e10) {
            f0.e("SceneRenderer", "Failed to draw a frame", e10);
        }
        boolean zCompareAndSet = this.f86874b.compareAndSet(true, false);
        i iVar = this.f86876e;
        if (zCompareAndSet) {
            ((SurfaceTexture) com.google.android.exoplayer2.util.a.checkNotNull(this.f86883l)).updateTexImage();
            try {
                x.checkGlError();
            } catch (w e11) {
                f0.e("SceneRenderer", "Failed to draw a frame", e11);
            }
            boolean zCompareAndSet2 = this.f86875c.compareAndSet(true, false);
            float[] fArr2 = this.f86880i;
            if (zCompareAndSet2) {
                x.setToIdentity(fArr2);
            }
            long timestamp = this.f86883l.getTimestamp();
            Long l9 = (Long) this.f86878g.poll(timestamp);
            if (l9 != null) {
                this.f86877f.pollRotationMatrix(fArr2, l9.longValue());
            }
            f fVar = (f) this.f86879h.pollFloor(timestamp);
            if (fVar != null) {
                iVar.setProjection(fVar);
            }
        }
        Matrix.multiplyMM(this.f86881j, 0, fArr, 0, this.f86880i, 0);
        iVar.draw(this.f86882k, this.f86881j, z10);
    }

    public SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            x.checkGlError();
            this.f86876e.init();
            x.checkGlError();
            this.f86882k = x.createExternalTexture();
        } catch (w e10) {
            f0.e("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f86882k);
        this.f86883l = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new ft.a(this, 2));
        return this.f86883l;
    }

    @Override // tf.a
    public void onCameraMotion(long j10, float[] fArr) {
        this.f86877f.setRotation(j10, fArr);
    }

    @Override // tf.a
    public void onCameraMotionReset() {
        this.f86878g.clear();
        this.f86877f.reset();
        this.f86875c.set(true);
    }

    @Override // sf.l
    public void onVideoFrameAboutToBeRendered(long j10, long j11, z0 z0Var, MediaFormat mediaFormat) {
        this.f86878g.add(j11, Long.valueOf(j10));
        byte[] bArr = z0Var.f28812x;
        int i10 = z0Var.f28813y;
        byte[] bArr2 = this.f86886o;
        int i11 = this.f86885n;
        this.f86886o = bArr;
        if (i10 == -1) {
            i10 = this.f86884m;
        }
        this.f86885n = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f86886o)) {
            return;
        }
        byte[] bArr3 = this.f86886o;
        f fVarDecode = bArr3 != null ? g.decode(bArr3, this.f86885n) : null;
        if (fVarDecode == null || !i.isSupported(fVarDecode)) {
            fVarDecode = f.createEquirectangular(this.f86885n);
        }
        this.f86879h.add(j11, fVarDecode);
    }

    public void setDefaultStereoMode(int i10) {
        this.f86884m = i10;
    }

    public void shutdown() {
        this.f86876e.shutdown();
    }
}

package io.odeeo.internal.s0;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.d0;
import io.odeeo.internal.q0.m;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements io.odeeo.internal.r0.j, a {

    /* renamed from: j, reason: collision with root package name */
    public int f66313j;

    /* renamed from: k, reason: collision with root package name */
    public SurfaceTexture f66314k;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f66317n;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f66305a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f66306b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f66307c = new g();

    /* renamed from: e, reason: collision with root package name */
    public final c f66308e = new c();

    /* renamed from: f, reason: collision with root package name */
    public final d0<Long> f66309f = new d0<>();

    /* renamed from: g, reason: collision with root package name */
    public final d0<e> f66310g = new d0<>();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f66311h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f66312i = new float[16];

    /* renamed from: l, reason: collision with root package name */
    public volatile int f66315l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f66316m = -1;

    public void drawFrame(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        m.checkGlError();
        if (this.f66305a.compareAndSet(true, false)) {
            ((SurfaceTexture) io.odeeo.internal.q0.a.checkNotNull(this.f66314k)).updateTexImage();
            m.checkGlError();
            if (this.f66306b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f66311h, 0);
            }
            long timestamp = this.f66314k.getTimestamp();
            Long lPoll = this.f66309f.poll(timestamp);
            if (lPoll != null) {
                this.f66308e.pollRotationMatrix(this.f66311h, lPoll.longValue());
            }
            e eVarPollFloor = this.f66310g.pollFloor(timestamp);
            if (eVarPollFloor != null) {
                this.f66307c.setProjection(eVarPollFloor);
            }
        }
        Matrix.multiplyMM(this.f66312i, 0, fArr, 0, this.f66311h, 0);
        this.f66307c.a(this.f66313j, this.f66312i, z10);
    }

    public SurfaceTexture init() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        m.checkGlError();
        this.f66307c.a();
        m.checkGlError();
        this.f66313j = m.createExternalTexture();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f66313j);
        this.f66314k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new ft.a(this, 0));
        return this.f66314k;
    }

    @Override // io.odeeo.internal.s0.a
    public void onCameraMotion(long j10, float[] fArr) {
        this.f66308e.setRotation(j10, fArr);
    }

    @Override // io.odeeo.internal.s0.a
    public void onCameraMotionReset() {
        this.f66309f.clear();
        this.f66308e.reset();
        this.f66306b.set(true);
    }

    @Override // io.odeeo.internal.r0.j
    public void onVideoFrameAboutToBeRendered(long j10, long j11, t tVar, MediaFormat mediaFormat) {
        this.f66309f.add(j11, Long.valueOf(j10));
        a(tVar.f62981v, tVar.f62982w, j11);
    }

    public void setDefaultStereoMode(int i10) {
        this.f66315l = i10;
    }

    public void shutdown() {
        this.f66307c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f66305a.set(true);
    }

    public final void a(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f66317n;
        int i11 = this.f66316m;
        this.f66317n = bArr;
        if (i10 == -1) {
            i10 = this.f66315l;
        }
        this.f66316m = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f66317n)) {
            return;
        }
        byte[] bArr3 = this.f66317n;
        e eVarDecode = bArr3 != null ? f.decode(bArr3, this.f66316m) : null;
        if (eVarDecode == null || !g.isSupported(eVarDecode)) {
            eVarDecode = e.createEquirectangular(this.f66316m);
        }
        this.f66310g.add(j10, eVarDecode);
    }
}

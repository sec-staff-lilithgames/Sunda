package io.bidmachine.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f60751i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    public final Handler f60752b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f60753c;

    /* renamed from: e, reason: collision with root package name */
    public EGLDisplay f60754e;

    /* renamed from: f, reason: collision with root package name */
    public EGLContext f60755f;

    /* renamed from: g, reason: collision with root package name */
    public EGLSurface f60756g;

    /* renamed from: h, reason: collision with root package name */
    public SurfaceTexture f60757h;

    public n(Handler handler) {
        this(handler, null);
    }

    public SurfaceTexture getSurfaceTexture() {
        return (SurfaceTexture) a.checkNotNull(this.f60757h);
    }

    public void init(int i10) throws s {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        t.checkGlException(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        t.checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.f60754e = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f60751i, 0, eGLConfigArr, 0, 1, iArr2, 0);
        t.checkGlException(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, a1.formatInvariant("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f60754e, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        t.checkGlException(eGLContextEglCreateContext != null, "eglCreateContext failed");
        this.f60755f = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f60754e;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            t.checkGlException(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        t.checkGlException(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        this.f60756g = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = this.f60753c;
        GLES20.glGenTextures(1, iArr3, 0);
        t.checkGlError();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f60757h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f60752b.post(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void release() {
        this.f60752b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f60757h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f60753c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f60754e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f60754e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f60756g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f60754e, this.f60756g);
            }
            EGLContext eGLContext = this.f60755f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f60754e, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f60754e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f60754e);
            }
            this.f60754e = null;
            this.f60755f = null;
            this.f60756g = null;
            this.f60757h = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceTexture surfaceTexture = this.f60757h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public n(Handler handler, m mVar) {
        this.f60752b = handler;
        this.f60753c = new int[1];
    }
}

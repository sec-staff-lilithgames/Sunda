package io.odeeo.internal.q0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f65880i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f65881a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f65882b;

    /* renamed from: c, reason: collision with root package name */
    public final c f65883c;

    /* renamed from: e, reason: collision with root package name */
    public EGLDisplay f65884e;

    /* renamed from: f, reason: collision with root package name */
    public EGLContext f65885f;

    /* renamed from: g, reason: collision with root package name */
    public EGLSurface f65886g;

    /* renamed from: h, reason: collision with root package name */
    public SurfaceTexture f65887h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        void onFrameAvailable();
    }

    public j(Handler handler) {
        this(handler, null);
    }

    public static EGLDisplay b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new b("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new b("eglInitialize failed");
    }

    public final void a() {
        c cVar = this.f65883c;
        if (cVar != null) {
            cVar.onFrameAvailable();
        }
    }

    public SurfaceTexture getSurfaceTexture() {
        return (SurfaceTexture) io.odeeo.internal.q0.a.checkNotNull(this.f65887h);
    }

    public void init(int i10) {
        EGLDisplay eGLDisplayB = b();
        this.f65884e = eGLDisplayB;
        EGLConfig eGLConfigA = a(eGLDisplayB);
        EGLContext eGLContextA = a(this.f65884e, eGLConfigA, i10);
        this.f65885f = eGLContextA;
        this.f65886g = a(this.f65884e, eGLConfigA, eGLContextA, i10);
        a(this.f65882b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f65882b[0]);
        this.f65887h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f65881a.post(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void release() {
        this.f65881a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f65887h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f65882b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f65884e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f65884e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f65886g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f65884e, this.f65886g);
            }
            EGLContext eGLContext = this.f65885f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f65884e, eGLContext);
            }
            if (g0.f65861a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f65884e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f65884e);
            }
            this.f65884e = null;
            this.f65885f = null;
            this.f65886g = null;
            this.f65887h = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
        SurfaceTexture surfaceTexture = this.f65887h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public j(Handler handler, c cVar) {
        this.f65881a = handler;
        this.f65883c = cVar;
        this.f65882b = new int[1];
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f65880i, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new b(g0.formatInvariant("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    public static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        int[] iArr;
        if (i10 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    public static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        int[] iArr;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    public static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        m.checkGlError();
    }
}

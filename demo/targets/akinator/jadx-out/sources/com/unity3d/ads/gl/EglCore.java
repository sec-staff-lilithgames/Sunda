package com.unity3d.ads.gl;

import a.b;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import kotlin.jvm.internal.u;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class EglCore {
    public static final Companion Companion = new Companion(null);
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int FLAG_RECORDABLE = 1;
    public static final int FLAG_TRY_GLES3 = 2;
    private int glVersion;
    private EGLConfig mEGLConfig;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EglCore() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    private final void checkEglError(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new RuntimeException(i.b(iEglGetError, b.t(str, ": EGL error: 0x")));
        }
    }

    private final EGLConfig getConfig(int i10, int i11) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i11 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i10 & 1) != 0) {
            iArr[10] = EGL_RECORDABLE_ANDROID;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.mEGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public final EGLSurface createOffscreenSurface(int i10, int i11) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        checkEglError("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public final void finalize() {
        if (this.mEGLDisplay != EGL14.EGL_NO_DISPLAY) {
            release();
        }
    }

    public final int getGlVersion() {
        return this.glVersion;
    }

    public final void makeCurrent(EGLSurface eGLSurface) {
        if (!EGL14.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void release() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
    }

    public final boolean releaseSurface(EGLSurface eGLSurface) {
        return EGL14.eglDestroySurface(this.mEGLDisplay, eGLSurface);
    }

    public final void setGlVersion(int i10) {
        this.glVersion = i10;
    }

    public EglCore(EGLContext eGLContext, int i10) {
        EGLConfig config;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLDisplay = eGLDisplay;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.glVersion = -1;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("EGL already set up");
        }
        eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.mEGLDisplay = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        if ((i10 & 2) != 0 && (config = getConfig(i10, 3)) != null) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.mEGLDisplay, config, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.mEGLConfig = config;
                this.mEGLContext = eGLContextEglCreateContext;
                this.glVersion = 3;
            }
        }
        if (this.mEGLContext == EGL14.EGL_NO_CONTEXT) {
            EGLConfig config2 = getConfig(i10, 2);
            if (config2 == null) {
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
            EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.mEGLDisplay, config2, eGLContext, new int[]{12440, 2, 12344}, 0);
            checkEglError("eglCreateContext");
            this.mEGLConfig = config2;
            this.mEGLContext = eGLContextEglCreateContext2;
            this.glVersion = 2;
        }
        EGL14.eglQueryContext(this.mEGLDisplay, this.mEGLContext, 12440, new int[1], 0);
    }

    public /* synthetic */ EglCore(EGLContext eGLContext, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : eGLContext, (i11 & 2) != 0 ? 0 : i10);
    }
}

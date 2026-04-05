package com.google.android.exoplayer2.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class v {
    private static EGLConfig a(EGLDisplay eGLDisplay, int[] iArr) throws w {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new w("eglChooseConfig failed.");
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, int i10, int[] iArr) throws w {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, a(eGLDisplay, iArr), eGLContext, new int[]{12440, i10, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            x.checkGlError();
            return eGLContextEglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new w(a.b.e(i10, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
    }

    public static EGLDisplay createEglDisplay() throws w {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        x.checkGlException(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        x.checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        x.checkGlError();
        return eGLDisplayEglGetDisplay;
    }

    public static EGLSurface createEglPbufferSurface(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws w {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, a(eGLDisplay, iArr), iArr2, 0);
        x.a("Error creating surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws w {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, a(eGLDisplay, iArr), obj, iArr2, 0);
        x.a("Error creating surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) throws w {
        if (eGLDisplay == null) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        x.a("Error releasing context");
        if (eGLContext != null) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            x.a("Error destroying context");
        }
        EGL14.eglReleaseThread();
        x.a("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        x.a("Error terminating display");
    }

    public static void destroyEglSurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws w {
        if (eGLDisplay == null || eGLSurface == null) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        x.a("Error destroying surface");
    }

    public static void focusFramebufferUsingCurrentContext(int i10, int i11, int i12) throws w {
        x.checkGlException(!n1.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i10) {
            GLES20.glBindFramebuffer(36160, i10);
        }
        x.checkGlError();
        GLES20.glViewport(0, 0, i11, i12);
        x.checkGlError();
    }

    public static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws w {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        x.a("Error making context current");
        focusFramebufferUsingCurrentContext(i10, i11, i12);
    }
}

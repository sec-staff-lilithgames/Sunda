package io.bidmachine;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final k2 f62070a;

    /* renamed from: b, reason: collision with root package name */
    public String f62071b;

    /* renamed from: c, reason: collision with root package name */
    public String f62072c;

    public z1(k2 k2Var) {
        this.f62070a = k2Var;
    }

    public static void a(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext) {
        if (eGLDisplay != null) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            if (eGLSurface != null) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            }
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            }
            EGL14.eglTerminate(eGLDisplay);
        }
    }
}

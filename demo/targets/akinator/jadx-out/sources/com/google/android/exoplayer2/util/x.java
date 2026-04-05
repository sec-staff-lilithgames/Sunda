package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f28589a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f28590b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f28591c = {12445, 13120, 12344, 12344};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f28592d = {12344};

    public static void a(String str) throws w {
        int iEglGetError = EGL14.eglGetError();
        checkGlException(iEglGetError == 12288, str + ", error code: " + iEglGetError);
    }

    public static int b(int i10, int i11, int i12, int i13) throws w {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i14 = iArr[0];
        a.checkState(i14 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i10 < 0 || i11 < 0) {
            throw new w("width or height is less than 0");
        }
        if (i10 > i14 || i11 > i14) {
            throw new w(a.b.e(i14, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
        checkGlException(!n1.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        checkGlError();
        int i15 = iArr2[0];
        bindTexture(3553, i15);
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, 6408, i13, ByteBuffer.allocateDirect(i10 * i11 * 4));
        checkGlError();
        return i15;
    }

    public static void bindTexture(int i10, int i11) throws w {
        GLES20.glBindTexture(i10, i11);
        checkGlError();
        GLES20.glTexParameteri(i10, 10240, 9729);
        checkGlError();
        GLES20.glTexParameteri(i10, 10241, 9729);
        checkGlError();
        GLES20.glTexParameteri(i10, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i10, 10243, 33071);
        checkGlError();
    }

    public static void checkGlError() throws w {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(iGlGetError));
            z10 = true;
        }
        if (z10) {
            throw new w(sb2.toString());
        }
    }

    public static void checkGlException(boolean z10, String str) throws w {
        if (!z10) {
            throw new w(str);
        }
    }

    public static void clearOutputFrame() throws w {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        checkGlError();
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws w {
        return createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, f28589a);
    }

    public static EGLDisplay createEglDisplay() throws w {
        return v.createEglDisplay();
    }

    public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) throws w {
        int[] iArr;
        int[] iArr2 = f28592d;
        if (i10 == 3 || i10 == 10) {
            iArr = f28589a;
        } else {
            iArr = f28590b;
            if (i10 == 6) {
                if (!z10) {
                    iArr2 = f28591c;
                }
            } else {
                if (i10 != 7) {
                    throw new IllegalArgumentException(a.b.e(i10, "Unsupported color transfer: "));
                }
                a.checkArgument(z10, "Outputting HLG to the screen is not supported.");
            }
        }
        return v.createEglSurface(eGLDisplay, obj, iArr, iArr2);
    }

    public static int createExternalTexture() throws w {
        checkGlException(!n1.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        int i10 = iArr[0];
        bindTexture(36197, i10);
        return i10;
    }

    public static int createFboForTexture(int i10) throws w {
        checkGlException(!n1.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        checkGlError();
        return iArr[0];
    }

    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws w {
        EGLSurface eGLSurfaceCreateEglPbufferSurface = isSurfacelessContextExtensionSupported() ? EGL14.EGL_NO_SURFACE : v.createEglPbufferSurface(eGLDisplay, iArr, new int[]{12375, 1, 12374, 1, 12344});
        focusEglSurface(eGLDisplay, eGLContext, eGLSurfaceCreateEglPbufferSurface, 1, 1);
        return eGLSurfaceCreateEglPbufferSurface;
    }

    public static int createTexture(int i10, int i11, boolean z10) throws w {
        if (!z10) {
            return b(i10, i11, 6408, 5121);
        }
        a.checkState(n1.f28506a >= 18, "GLES30 extensions are not supported below API 18.");
        return b(i10, i11, 34842, 5131);
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i10 = 0; i10 < list.size(); i10++) {
            System.arraycopy(list.get(i10), 0, fArr, i10 * 4, 4);
        }
        return fArr;
    }

    public static void deleteFbo(int i10) throws w {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i10) throws w {
        GLES20.glDeleteRenderbuffers(1, new int[]{i10}, 0);
        checkGlError();
    }

    public static void deleteTexture(int i10) throws w {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        checkGlError();
    }

    public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) throws w {
        v.destroyEglContext(eGLDisplay, eGLContext);
    }

    public static void destroyEglSurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws w {
        v.destroyEglSurface(eGLDisplay, eGLSurface);
    }

    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) throws w {
        v.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i10, i11);
    }

    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws w {
        v.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i10, i11, i12);
    }

    public static void focusFramebufferUsingCurrentContext(int i10, int i11, int i12) throws w {
        v.focusFramebufferUsingCurrentContext(i10, i11, i12);
    }

    public static EGLSurface focusPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws w {
        return createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, f28589a);
    }

    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isBt2020PqExtensionSupported() {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String strEglQueryString;
        int i10 = n1.f28506a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(n1.f28508c) || "XT1650".equals(n1.f28509d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String strEglQueryString;
        return n1.f28506a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static boolean isYuvTargetExtensionSupported() {
        String strGlGetString;
        if (n1.f28506a < 17) {
            return false;
        }
        if (n1.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay eGLDisplayCreateEglDisplay = createEglDisplay();
                EGLContext eGLContextCreateEglContext = createEglContext(eGLDisplayCreateEglDisplay);
                focusPlaceholderEglSurface(eGLContextCreateEglContext, eGLDisplayCreateEglDisplay);
                strGlGetString = GLES20.glGetString(7939);
                destroyEglContext(eGLDisplayCreateEglDisplay, eGLContextCreateEglContext);
            } catch (w unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target");
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, int i10, int[] iArr) throws w {
        boolean z10 = true;
        a.checkArgument(Arrays.equals(iArr, f28589a) || Arrays.equals(iArr, f28590b));
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        }
        a.checkArgument(z10);
        return v.createEglContext(eGLContext, eGLDisplay, i10, iArr);
    }
}

package io.bidmachine.media3.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f60794a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f60795b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f60796c = {12445, 13120, 12344, 12344};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f60797d = {12445, 13632, 12344, 12344};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f60798e = {12344};

    public static void a(int i10, int i11) throws s {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i12 = iArr[0];
        a.checkState(i12 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i10 < 0 || i11 < 0) {
            throw new s("width or height is less than 0");
        }
        if (i10 > i12 || i11 > i12) {
            throw new s(a.b.e(i12, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static void awaitSyncObject(long j10) throws s {
        if (j10 == 0) {
            GLES20.glFinish();
        } else {
            GLES30.glWaitSync(j10, 0, -1L);
            checkGlError();
        }
    }

    public static void b(String str) throws s {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new s(w0.i.b(iEglGetError, a.b.t(str, ", error code: 0x")));
        }
    }

    public static void bindTexture(int i10, int i11, int i12) throws s {
        GLES20.glBindTexture(i10, i11);
        checkGlError();
        GLES20.glTexParameteri(i10, 10240, i12);
        checkGlError();
        GLES20.glTexParameteri(i10, 10241, i12);
        checkGlError();
        GLES20.glTexParameteri(i10, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i10, 10243, 33071);
        checkGlError();
    }

    public static void blitFrameBuffer(int i10, r rVar, int i11, r rVar2) throws s {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36008, i10);
        checkGlError();
        GLES20.glBindFramebuffer(36009, i11);
        checkGlError();
        GLES30.glBlitFramebuffer(rVar.f60786a, rVar.f60787b, rVar.f60788c, rVar.f60789d, rVar2.f60786a, rVar2.f60787b, rVar2.f60788c, rVar2.f60789d, 16384, 9729);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
    }

    public static int c(int i10, int i11, int i12, int i13) throws s {
        a(i10, i11);
        int iGenerateTexture = generateTexture();
        bindTexture(3553, iGenerateTexture, 9729);
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, 6408, i13, null);
        checkGlError();
        return iGenerateTexture;
    }

    public static void checkGlError() throws s {
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
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = w0.i.b(iGlGetError, new StringBuilder("error code: 0x"));
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new s(sb2.toString());
        }
    }

    public static void checkGlException(boolean z10, String str) throws s {
        if (!z10) {
            throw new s(str);
        }
    }

    public static void clearFocusedBuffers() throws s {
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

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws s {
        return createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, f60794a);
    }

    public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) throws s {
        int[] iArr;
        int[] iArr2 = f60798e;
        if (i10 == 3 || i10 == 10) {
            iArr = f60794a;
        } else {
            if (i10 != 7 && i10 != 6) {
                throw new IllegalArgumentException(a.b.e(i10, "Unsupported color transfer: "));
            }
            iArr = f60795b;
            if (!z10) {
                if (i10 == 6) {
                    if (!isBt2020PqExtensionSupported()) {
                        throw new s("BT.2020 PQ OpenGL output isn't supported.");
                    }
                    iArr2 = f60796c;
                } else {
                    if (!isBt2020HlgExtensionSupported()) {
                        throw new s("BT.2020 HLG OpenGL output isn't supported.");
                    }
                    iArr2 = f60797d;
                }
            }
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, d(eGLDisplay, iArr), obj, iArr2, 0);
        b("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static int createExternalTexture() throws s {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture, 9729);
        return iGenerateTexture;
    }

    public static int createFboForTexture(int i10) throws s {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        checkGlError();
        return iArr[0];
    }

    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws s {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (isSurfacelessContextExtensionSupported()) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, d(eGLDisplay, f60794a), new int[]{12375, 1, 12374, 1, 12344}, 0);
            b("Error creating a new EGL Pbuffer surface");
        }
        focusEglSurface(eGLDisplay, eGLContext, eGLSurfaceEglCreatePbufferSurface, 1, 1);
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static long createGlSyncFence() throws s {
        if (getContextMajorVersion() < 3) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        checkGlError();
        GLES20.glFlush();
        checkGlError();
        return jGlFenceSync;
    }

    public static int createPixelBufferObject(int i10) throws s {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindBuffer(35051, iArr[0]);
        checkGlError();
        GLES20.glBufferData(35051, i10, null, 35049);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
        return iArr[0];
    }

    public static int createRgb10A2Texture(int i10, int i11) throws s {
        return c(i10, i11, 32857, 33640);
    }

    public static int createTexture(Bitmap bitmap) throws s {
        int iGenerateTexture = generateTexture();
        setTexture(iGenerateTexture, bitmap);
        return iGenerateTexture;
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i10 = 0; i10 < list.size(); i10++) {
            System.arraycopy(list.get(i10), 0, fArr, i10 * 4, 4);
        }
        return fArr;
    }

    public static EGLConfig d(EGLDisplay eGLDisplay, int[] iArr) throws s {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new s("eglChooseConfig failed.");
    }

    public static void deleteBuffer(int i10) throws s {
        GLES20.glDeleteBuffers(1, new int[]{i10}, 0);
        checkGlError();
    }

    public static void deleteFbo(int i10) throws s {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i10) throws s {
        GLES20.glDeleteRenderbuffers(1, new int[]{i10}, 0);
        checkGlError();
    }

    public static void deleteSyncObject(long j10) throws s {
        deleteSyncObjectQuietly(j10);
        checkGlError();
    }

    public static void deleteSyncObjectQuietly(long j10) {
        GLES30.glDeleteSync(j10);
    }

    public static void deleteTexture(int i10) throws s {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        checkGlError();
    }

    public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) throws s {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        b("Error releasing context");
        if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            b("Error destroying context");
        }
        EGL14.eglReleaseThread();
        b("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        b("Error terminating display");
    }

    public static void destroyEglSurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws s {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        b("Error destroying surface");
    }

    public static boolean e(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) throws s {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        b("Error making context current");
        focusFramebufferUsingCurrentContext(0, i10, i11);
    }

    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws s {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        b("Error making context current");
        focusFramebufferUsingCurrentContext(i10, i11, i12);
    }

    public static void focusFramebufferUsingCurrentContext(int i10, int i11, int i12) throws s {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i10) {
            GLES20.glBindFramebuffer(36160, i10);
        }
        checkGlError();
        GLES20.glViewport(0, 0, i11, i12);
        checkGlError();
    }

    public static int generateTexture() throws s {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static long getContextMajorVersion() throws s {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        checkGlError();
        return r0[0];
    }

    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay getDefaultEglDisplay() throws s {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        checkGlException(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        checkGlError();
        return eGLDisplayEglGetDisplay;
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isBt2020HlgExtensionSupported() {
        return e("EGL_EXT_gl_colorspace_bt2020_hlg");
    }

    public static boolean isBt2020PqExtensionSupported() {
        return a1.f60679a >= 33 && e("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        int i10 = a1.f60679a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return e("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        return e("EGL_KHR_surfaceless_context");
    }

    public static boolean isYuvTargetExtensionSupported() {
        String strGlGetString;
        if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay defaultEglDisplay = getDefaultEglDisplay();
                EGLContext eGLContextCreateEglContext = createEglContext(defaultEglDisplay);
                createFocusedPlaceholderEglSurface(eGLContextCreateEglContext, defaultEglDisplay);
                strGlGetString = GLES20.glGetString(7939);
                destroyEglContext(defaultEglDisplay, eGLContextCreateEglContext);
            } catch (s unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target");
    }

    public static ByteBuffer mapPixelBufferObject(int i10, int i11) throws s {
        GLES20.glBindBuffer(35051, i10);
        checkGlError();
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, i11, 1);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
        return byteBuffer;
    }

    public static void schedulePixelBufferRead(int i10, int i11, int i12, int i13) throws s {
        focusFramebufferUsingCurrentContext(i10, i11, i12);
        GLES20.glBindBuffer(35051, i13);
        checkGlError();
        GLES30.glReadBuffer(36064);
        GLES30.glReadPixels(0, 0, i11, i12, 6408, 5121, 0);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
    }

    public static void setTexture(int i10, Bitmap bitmap) throws s {
        a(bitmap.getWidth(), bitmap.getHeight());
        bindTexture(3553, i10, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        checkGlError();
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void unmapPixelBufferObject(int i10) throws s {
        GLES20.glBindBuffer(35051, i10);
        checkGlError();
        GLES30.glUnmapBuffer(35051);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, int i10, int[] iArr) throws s {
        boolean z10 = true;
        a.checkArgument(Arrays.equals(iArr, f60794a) || Arrays.equals(iArr, f60795b));
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        }
        a.checkArgument(z10);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, d(eGLDisplay, iArr), eGLContext, new int[]{12440, i10, 12344}, 0);
        if (eGLContextEglCreateContext == null || eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglTerminate(eGLDisplay);
            throw new s(a.b.e(i10, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }
        checkGlError();
        return eGLContextEglCreateContext;
    }

    public static int createTexture(int i10, int i11, boolean z10) throws s {
        if (z10) {
            return c(i10, i11, 34842, 5131);
        }
        return c(i10, i11, 6408, 5121);
    }
}

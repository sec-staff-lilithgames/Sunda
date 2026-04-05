package io.odeeo.internal.q0;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f65891a = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        private static EGLConfig a(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                m.b("eglChooseConfig failed.");
            }
            return eGLConfigArr[0];
        }

        public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws f {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, a(eGLDisplay), EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            if (eGLContextEglCreateContext != null) {
                m.checkGlError();
                return eGLContextEglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new f();
        }

        public static EGLDisplay createEglDisplay() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            m.b(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0)) {
                m.b("Error in eglInitialize.");
            }
            m.checkGlError();
            return eGLDisplayEglGetDisplay;
        }

        public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            int iEglGetError = EGL14.eglGetError();
            m.b(iEglGetError == 12288, "Error releasing context: " + iEglGetError);
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                int iEglGetError2 = EGL14.eglGetError();
                m.b(iEglGetError2 == 12288, "Error destroying context: " + iEglGetError2);
            }
            EGL14.eglReleaseThread();
            int iEglGetError3 = EGL14.eglGetError();
            m.b(iEglGetError3 == 12288, "Error releasing thread: " + iEglGetError3);
            EGL14.eglTerminate(eGLDisplay);
            int iEglGetError4 = EGL14.eglGetError();
            m.b(iEglGetError4 == 12288, "Error terminating display: " + iEglGetError4);
        }

        public static void focusSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != 0) {
                GLES20.glBindFramebuffer(36160, 0);
            }
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GLES20.glViewport(0, 0, i10, i11);
        }

        public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj) {
            return EGL14.eglCreateWindowSurface(eGLDisplay, a(eGLDisplay), obj, new int[]{12344}, 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f65892a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65893b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65894c;

        /* renamed from: d, reason: collision with root package name */
        public Buffer f65895d;

        /* renamed from: e, reason: collision with root package name */
        public int f65896e;

        public b(String str, int i10, int i11) {
            this.f65892a = str;
            this.f65893b = i10;
            this.f65894c = i11;
        }

        public void bind() {
            Buffer buffer = (Buffer) io.odeeo.internal.q0.a.checkNotNull(this.f65895d, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f65894c, this.f65896e, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.f65893b);
            m.checkGlError();
        }

        public void setBuffer(float[] fArr, int i10) {
            this.f65895d = m.createBuffer(fArr);
            this.f65896e = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends RuntimeException {
        public c(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f65898a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65899b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65900c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f65901d = new float[16];

        /* renamed from: e, reason: collision with root package name */
        public int f65902e;

        /* renamed from: f, reason: collision with root package name */
        public int f65903f;

        public e(String str, int i10, int i11) {
            this.f65898a = str;
            this.f65899b = i10;
            this.f65900c = i11;
        }

        public void bind() {
            int i10 = this.f65900c;
            if (i10 == 5126) {
                GLES20.glUniform1fv(this.f65899b, 1, this.f65901d, 0);
                m.checkGlError();
                return;
            }
            if (i10 == 35676) {
                GLES20.glUniformMatrix4fv(this.f65899b, 1, false, this.f65901d, 0);
                m.checkGlError();
                return;
            }
            if (this.f65902e == 0) {
                throw new IllegalStateException("Call setSamplerTexId before bind.");
            }
            GLES20.glActiveTexture(this.f65903f + 33984);
            int i11 = this.f65900c;
            if (i11 == 36198) {
                GLES20.glBindTexture(36197, this.f65902e);
            } else {
                if (i11 != 35678) {
                    throw new IllegalStateException("Unexpected uniform type: " + this.f65900c);
                }
                GLES20.glBindTexture(3553, this.f65902e);
            }
            GLES20.glUniform1i(this.f65899b, this.f65903f);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            m.checkGlError();
        }

        public void setFloat(float f10) {
            this.f65901d[0] = f10;
        }

        public void setFloats(float[] fArr) {
            System.arraycopy(fArr, 0, this.f65901d, 0, fArr.length);
        }

        public void setSamplerTexId(int i10, int i11) {
            this.f65902e = i10;
            this.f65903f = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends Exception {
    }

    public static void b(String str) {
        p.e("GlUtil", str);
        if (f65891a) {
            throw new c(str);
        }
    }

    public static void checkGlError() {
        int i10 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            p.e("GlUtil", "glError " + GLU.gluErrorString(iGlGetError));
            i10 = iGlGetError;
        }
        if (i10 != 0) {
            b("glError " + GLU.gluErrorString(i10));
        }
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws f {
        return a.createEglContext(eGLDisplay);
    }

    public static EGLDisplay createEglDisplay() {
        return a.createEglDisplay();
    }

    public static int createExternalTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlError();
        return iArr[0];
    }

    public static void deleteTexture(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        checkGlError();
    }

    public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        a.destroyEglContext(eGLDisplay, eGLContext);
    }

    public static void focusSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) {
        a.focusSurface(eGLDisplay, eGLContext, eGLSurface, i10, i11);
    }

    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj) {
        return a.getEglSurface(eGLDisplay, obj);
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String strEglQueryString;
        int i10 = g0.f65861a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(g0.f65863c) || "XT1650".equals(g0.f65864d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String strEglQueryString;
        return g0.f65861a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return g0.fromUtf8Bytes(g0.toByteArray(inputStreamOpen));
        } finally {
            g0.closeQuietly(inputStreamOpen);
        }
    }

    public static FloatBuffer createBuffer(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static void b(boolean z10, String str) {
        if (z10) {
            return;
        }
        b(str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f65897a;

        public d(String str, String str2) {
            this.f65897a = GLES20.glCreateProgram();
            m.checkGlError();
            a(35633, str);
            a(35632, str2);
        }

        public final b a(int i10) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f65897a, 35722, iArr, 0);
            int i11 = iArr[0];
            byte[] bArr = new byte[i11];
            int[] iArr2 = new int[1];
            int i12 = this.f65897a;
            GLES20.glGetActiveAttrib(i12, i10, i11, iArr2, 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, m.b(bArr));
            return new b(str, i10, getAttribLocation(str));
        }

        public final e b(int i10) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f65897a, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i11 = iArr[0];
            byte[] bArr = new byte[i11];
            int i12 = this.f65897a;
            GLES20.glGetActiveUniform(i12, i10, i11, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, m.b(bArr));
            return new e(str, getUniformLocation(str), iArr2[0]);
        }

        public void delete() {
            GLES20.glDeleteProgram(this.f65897a);
        }

        public int getAttribLocation(String str) {
            return GLES20.glGetAttribLocation(this.f65897a, str);
        }

        public b[] getAttributes() {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f65897a, 35721, iArr, 0);
            int i10 = iArr[0];
            if (i10 != 2) {
                throw new IllegalStateException("Expected two attributes.");
            }
            b[] bVarArr = new b[i10];
            for (int i11 = 0; i11 < iArr[0]; i11++) {
                bVarArr[i11] = a(i11);
            }
            return bVarArr;
        }

        public int getUniformLocation(String str) {
            return GLES20.glGetUniformLocation(this.f65897a, str);
        }

        public e[] getUniforms() {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f65897a, 35718, iArr, 0);
            e[] eVarArr = new e[iArr[0]];
            for (int i10 = 0; i10 < iArr[0]; i10++) {
                eVarArr[i10] = b(i10);
            }
            return eVarArr;
        }

        public void use() {
            GLES20.glLinkProgram(this.f65897a);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.f65897a, 35714, iArr, 0);
            if (iArr[0] != 1) {
                m.b("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(this.f65897a));
            }
            m.checkGlError();
            GLES20.glUseProgram(this.f65897a);
        }

        public d(Context context, String str, String str2) throws IOException {
            this(m.loadAsset(context, str), m.loadAsset(context, str2));
        }

        public d(String[] strArr, String[] strArr2) {
            this(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
        }

        public final void a(int i10, String str) {
            int iGlCreateShader = GLES20.glCreateShader(i10);
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                m.b(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
            }
            GLES20.glAttachShader(this.f65897a, iGlCreateShader);
            GLES20.glDeleteShader(iGlCreateShader);
            m.checkGlError();
        }
    }

    public static int b(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }
}

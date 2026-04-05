package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f28570a;

    /* renamed from: b, reason: collision with root package name */
    public final s[] f28571b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f28572c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f28573d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f28574e;

    public u(Context context, String str, String str2) throws w, IOException {
        this(b(context, str), b(context, str2));
    }

    public static void a(int i10, int i11, String str) throws w {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        x.checkGlException(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        x.checkGlError();
    }

    public static String b(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return n1.fromUtf8Bytes(n1.toByteArray(inputStreamOpen));
        } finally {
            n1.closeQuietly(inputStreamOpen);
        }
    }

    public void bindAttributesAndUniforms() throws w {
        for (s sVar : this.f28571b) {
            sVar.bind();
        }
        for (t tVar : this.f28572c) {
            tVar.bind();
        }
    }

    public void delete() throws w {
        GLES20.glDeleteProgram(this.f28570a);
        x.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) throws w {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f28570a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        x.checkGlError();
        return iGlGetAttribLocation;
    }

    public int getUniformLocation(String str) {
        return GLES20.glGetUniformLocation(this.f28570a, str);
    }

    public void setBufferAttribute(String str, float[] fArr, int i10) {
        ((s) a.checkNotNull((s) this.f28573d.get(str))).setBuffer(fArr, i10);
    }

    public void setFloatUniform(String str, float f10) {
        ((t) a.checkNotNull((t) this.f28574e.get(str))).setFloat(f10);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        ((t) a.checkNotNull((t) this.f28574e.get(str))).setFloats(fArr);
    }

    public void setIntUniform(String str, int i10) {
        ((t) a.checkNotNull((t) this.f28574e.get(str))).setInt(i10);
    }

    public void setSamplerTexIdUniform(String str, int i10, int i11) {
        ((t) a.checkNotNull((t) this.f28574e.get(str))).setSamplerTexId(i10, i11);
    }

    public void use() throws w {
        GLES20.glUseProgram(this.f28570a);
        x.checkGlError();
    }

    public u(String str, String str2) throws w {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f28570a = iGlCreateProgram;
        x.checkGlError();
        a(iGlCreateProgram, 35633, str);
        a(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        x.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f28573d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f28571b = new s[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            s sVarCreate = s.create(this.f28570a, i10);
            this.f28571b[i10] = sVarCreate;
            this.f28573d.put(sVarCreate.f28553a, sVarCreate);
        }
        this.f28574e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f28570a, 35718, iArr3, 0);
        this.f28572c = new t[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            t tVarCreate = t.create(this.f28570a, i11);
            this.f28572c[i11] = tVarCreate;
            this.f28574e.put(tVarCreate.f28558a, tVarCreate);
        }
        x.checkGlError();
    }
}

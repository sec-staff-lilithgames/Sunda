package io.bidmachine.media3.common.util;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f60780a;

    /* renamed from: b, reason: collision with root package name */
    public final o[] f60781b;

    /* renamed from: c, reason: collision with root package name */
    public final p[] f60782c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f60783d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f60784e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f60785f;

    public q(Context context, String str, String str2) throws s, IOException {
        this(a1.loadAsset(context, str), a1.loadAsset(context, str2));
    }

    public static void a(int i10, int i11, String str) throws s {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        t.checkGlException(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        t.checkGlError();
    }

    public void bindAttributesAndUniforms() throws s {
        for (o oVar : this.f60781b) {
            oVar.bind();
        }
        for (p pVar : this.f60782c) {
            pVar.bind(this.f60785f);
        }
    }

    public void delete() throws s {
        GLES20.glDeleteProgram(this.f60780a);
        t.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) throws s {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f60780a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        t.checkGlError();
        return iGlGetAttribLocation;
    }

    public int getUniformLocation(String str) {
        return GLES20.glGetUniformLocation(this.f60780a, str);
    }

    public void setBufferAttribute(String str, float[] fArr, int i10) {
        ((o) a.checkNotNull((o) this.f60783d.get(str))).setBuffer(fArr, i10);
    }

    public void setExternalTexturesRequireNearestSampling(boolean z10) {
        this.f60785f = z10;
    }

    public void setFloatUniform(String str, float f10) {
        ((p) a.checkNotNull((p) this.f60784e.get(str))).setFloat(f10);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        ((p) a.checkNotNull((p) this.f60784e.get(str))).setFloats(fArr);
    }

    public void setFloatsUniformIfPresent(String str, float[] fArr) {
        p pVar = (p) this.f60784e.get(str);
        if (pVar == null) {
            return;
        }
        pVar.setFloats(fArr);
    }

    public void setIntUniform(String str, int i10) {
        ((p) a.checkNotNull((p) this.f60784e.get(str))).setInt(i10);
    }

    public void setIntsUniform(String str, int[] iArr) {
        ((p) a.checkNotNull((p) this.f60784e.get(str))).setInts(iArr);
    }

    public void setSamplerTexIdUniform(String str, int i10, int i11) {
        ((p) a.checkNotNull((p) this.f60784e.get(str))).setSamplerTexId(i10, i11);
    }

    public void use() throws s {
        GLES20.glUseProgram(this.f60780a);
        t.checkGlError();
    }

    public void setSamplerTexIdUniform(String str, int i10, int i11, int i12) {
        p pVar = (p) a.checkNotNull((p) this.f60784e.get(str));
        pVar.setSamplerTexId(i10, i11);
        pVar.setTexMinFilter(i12);
    }

    public q(String str, String str2) throws s {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f60780a = iGlCreateProgram;
        t.checkGlError();
        a(iGlCreateProgram, 35633, str);
        a(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        t.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f60783d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f60781b = new o[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            o oVarCreate = o.create(this.f60780a, i10);
            this.f60781b[i10] = oVarCreate;
            this.f60783d.put(oVarCreate.f60758a, oVarCreate);
        }
        this.f60784e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f60780a, 35718, iArr3, 0);
        this.f60782c = new p[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            p pVarCreate = p.create(this.f60780a, i11);
            this.f60782c[i11] = pVarCreate;
            this.f60784e.put(pVarCreate.f60769a, pVarCreate);
        }
        t.checkGlError();
    }
}

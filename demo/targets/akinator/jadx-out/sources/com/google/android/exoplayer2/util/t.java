package com.google.android.exoplayer2.util;

import android.opengl.GLES20;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f28558a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28559b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28560c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f28561d = new float[16];

    /* renamed from: e, reason: collision with root package name */
    public int f28562e;

    /* renamed from: f, reason: collision with root package name */
    public int f28563f;

    /* renamed from: g, reason: collision with root package name */
    public int f28564g;

    public t(String str, int i10, int i11) {
        this.f28558a = str;
        this.f28559b = i10;
        this.f28560c = i11;
    }

    public static t create(int i10, int i11) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i10, 35719, iArr, 0);
        int[] iArr2 = new int[1];
        int i12 = iArr[0];
        byte[] bArr = new byte[i12];
        GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            if (bArr[i13] == 0) {
                i12 = i13;
                break;
            }
            i13++;
        }
        String str = new String(bArr, 0, i12);
        return new t(str, GLES20.glGetUniformLocation(i10, str), iArr2[0]);
    }

    public void bind() throws w {
        float[] fArr = this.f28561d;
        int i10 = this.f28559b;
        int i11 = this.f28560c;
        switch (i11) {
            case 5124:
                GLES20.glUniform1i(i10, this.f28562e);
                return;
            case 5126:
                GLES20.glUniform1fv(i10, 1, fArr, 0);
                x.checkGlError();
                return;
            case 35664:
                GLES20.glUniform2fv(i10, 1, fArr, 0);
                x.checkGlError();
                return;
            case 35665:
                GLES20.glUniform3fv(i10, 1, fArr, 0);
                x.checkGlError();
                return;
            case 35675:
                GLES20.glUniformMatrix3fv(i10, 1, false, fArr, 0);
                x.checkGlError();
                return;
            case 35676:
                GLES20.glUniformMatrix4fv(i10, 1, false, fArr, 0);
                x.checkGlError();
                return;
            case 35678:
            case 35815:
            case 36198:
                if (this.f28563f == 0) {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                GLES20.glActiveTexture(this.f28564g + 33984);
                x.checkGlError();
                x.bindTexture(i11 == 35678 ? 3553 : 36197, this.f28563f);
                GLES20.glUniform1i(i10, this.f28564g);
                x.checkGlError();
                return;
            default:
                throw new IllegalStateException("Unexpected uniform type: " + i11);
        }
    }

    public void setFloat(float f10) {
        this.f28561d[0] = f10;
    }

    public void setFloats(float[] fArr) {
        System.arraycopy(fArr, 0, this.f28561d, 0, fArr.length);
    }

    public void setInt(int i10) {
        this.f28562e = i10;
    }

    public void setSamplerTexId(int i10, int i11) {
        this.f28563f = i10;
        this.f28564g = i11;
    }
}

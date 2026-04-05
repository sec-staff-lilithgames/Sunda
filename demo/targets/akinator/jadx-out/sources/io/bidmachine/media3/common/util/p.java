package io.bidmachine.media3.common.util;

import android.opengl.GLES20;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f60769a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60770b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60771c;

    /* renamed from: f, reason: collision with root package name */
    public int f60774f;

    /* renamed from: g, reason: collision with root package name */
    public int f60775g;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f60772d = new float[16];

    /* renamed from: e, reason: collision with root package name */
    public final int[] f60773e = new int[4];

    /* renamed from: h, reason: collision with root package name */
    public int f60776h = 9729;

    public p(String str, int i10, int i11) {
        this.f60769a = str;
        this.f60770b = i10;
        this.f60771c = i11;
    }

    public static p create(int i10, int i11) {
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
        return new p(str, GLES20.glGetUniformLocation(i10, str), iArr2[0]);
    }

    public void bind(boolean z10) throws s {
        int[] iArr = this.f60773e;
        int i10 = this.f60770b;
        int i11 = this.f60771c;
        if (i11 == 5124) {
            GLES20.glUniform1iv(i10, 1, iArr, 0);
            t.checkGlError();
            return;
        }
        float[] fArr = this.f60772d;
        if (i11 == 5126) {
            GLES20.glUniform1fv(i10, 1, fArr, 0);
            t.checkGlError();
            return;
        }
        if (i11 == 35678 || i11 == 35815 || i11 == 36198) {
            if (this.f60774f == 0) {
                throw new IllegalStateException("No call to setSamplerTexId() before bind.");
            }
            GLES20.glActiveTexture(this.f60775g + 33984);
            t.checkGlError();
            t.bindTexture(i11 == 35678 ? 3553 : 36197, this.f60774f, (i11 == 35678 || !z10) ? 9729 : 9728);
            if (i11 == 35678) {
                if (this.f60776h == 9987) {
                    GLES20.glGenerateMipmap(3553);
                    t.checkGlError();
                }
                GLES20.glTexParameteri(3553, 10241, this.f60776h);
                t.checkGlError();
            }
            GLES20.glUniform1i(i10, this.f60775g);
            t.checkGlError();
            return;
        }
        switch (i11) {
            case 35664:
                GLES20.glUniform2fv(i10, 1, fArr, 0);
                t.checkGlError();
                return;
            case 35665:
                GLES20.glUniform3fv(i10, 1, fArr, 0);
                t.checkGlError();
                return;
            case 35666:
                GLES20.glUniform4fv(i10, 1, fArr, 0);
                t.checkGlError();
                return;
            case 35667:
                GLES20.glUniform2iv(i10, 1, iArr, 0);
                t.checkGlError();
                return;
            case 35668:
                GLES20.glUniform3iv(i10, 1, iArr, 0);
                t.checkGlError();
                return;
            case 35669:
                GLES20.glUniform4iv(i10, 1, iArr, 0);
                t.checkGlError();
                return;
            default:
                switch (i11) {
                    case 35675:
                        GLES20.glUniformMatrix3fv(i10, 1, false, fArr, 0);
                        t.checkGlError();
                        return;
                    case 35676:
                        GLES20.glUniformMatrix4fv(i10, 1, false, fArr, 0);
                        t.checkGlError();
                        return;
                    default:
                        throw new IllegalStateException("Unexpected uniform type: " + i11);
                }
        }
    }

    public void setFloat(float f10) {
        this.f60772d[0] = f10;
    }

    public void setFloats(float[] fArr) {
        System.arraycopy(fArr, 0, this.f60772d, 0, fArr.length);
    }

    public void setInt(int i10) {
        this.f60773e[0] = i10;
    }

    public void setInts(int[] iArr) {
        System.arraycopy(iArr, 0, this.f60773e, 0, iArr.length);
    }

    public void setSamplerTexId(int i10, int i11) {
        this.f60774f = i10;
        this.f60775g = i11;
    }

    public void setTexMinFilter(int i10) {
        this.f60776h = i10;
    }
}

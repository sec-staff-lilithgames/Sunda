package io.bidmachine.media3.common.util;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f60758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60759b;

    /* renamed from: c, reason: collision with root package name */
    public FloatBuffer f60760c;

    /* renamed from: d, reason: collision with root package name */
    public int f60761d;

    public o(String str, int i10) {
        this.f60758a = str;
        this.f60759b = i10;
    }

    public static o create(int i10, int i11) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i10, 35722, iArr, 0);
        int i12 = iArr[0];
        byte[] bArr = new byte[i12];
        GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
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
        return new o(str, GLES20.glGetAttribLocation(i10, str));
    }

    public void bind() throws s {
        Buffer buffer = (Buffer) a.checkNotNull(this.f60760c, "call setBuffer before bind");
        GLES20.glBindBuffer(34962, 0);
        GLES20.glVertexAttribPointer(this.f60759b, this.f60761d, 5126, false, 0, buffer);
        GLES20.glEnableVertexAttribArray(this.f60759b);
        t.checkGlError();
    }

    public void setBuffer(float[] fArr, int i10) {
        this.f60760c = t.createBuffer(fArr);
        this.f60761d = i10;
    }
}

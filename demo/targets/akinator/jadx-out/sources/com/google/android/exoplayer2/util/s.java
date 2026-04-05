package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f28553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28555c;

    /* renamed from: d, reason: collision with root package name */
    public FloatBuffer f28556d;

    /* renamed from: e, reason: collision with root package name */
    public int f28557e;

    public s(String str, int i10, int i11) {
        this.f28553a = str;
        this.f28554b = i10;
        this.f28555c = i11;
    }

    public static s create(int i10, int i11) {
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
        return new s(str, i11, GLES20.glGetAttribLocation(i10, str));
    }

    public void bind() throws w {
        Buffer buffer = (Buffer) a.checkNotNull(this.f28556d, "call setBuffer before bind");
        GLES20.glBindBuffer(34962, 0);
        GLES20.glVertexAttribPointer(this.f28555c, this.f28557e, 5126, false, 0, buffer);
        GLES20.glEnableVertexAttribArray(this.f28554b);
        x.checkGlError();
    }

    public void setBuffer(float[] fArr, int i10) {
        this.f28556d = x.createBuffer(fArr);
        this.f28557e = i10;
    }
}

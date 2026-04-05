package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends t {
        public a(long j10, long j11, int i10, long j12, ByteBuffer byteBuffer) {
            super(j10, j11, i10, j12, byteBuffer);
        }
    }

    public static a a(q qVar) throws IOException, s {
        t tVarA = d.a(qVar);
        return new a(tVarA.a(), tVarA.c(), tVarA.b(), tVarA.e(), tVarA.d());
    }
}

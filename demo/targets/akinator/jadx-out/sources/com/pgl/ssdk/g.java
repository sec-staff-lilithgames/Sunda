package com.pgl.ssdk;

import com.pgl.ssdk.c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        return h.b(byteBuffer);
    }

    public static byte[] b(ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        return h.c(byteBuffer);
    }

    public static i a(q qVar, c.a aVar, int i10) throws IOException, a {
        try {
            return h.a(qVar, aVar, i10);
        } catch (j e10) {
            throw new a(e10.getMessage());
        }
    }
}

package com.fyber.inneractive.sdk.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f26429a = Charset.forName(C.UTF8_NAME);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f26430b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f26430b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static String a(byte[] bArr) {
        return new String(bArr, f26429a);
    }

    public static z0 a(Object obj, Object obj2) {
        d2 d2Var = (d2) obj2;
        t0 t0Var = (t0) ((d2) obj).toBuilder();
        if (!t0Var.f26482a.getClass().isInstance(d2Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        t0Var.c();
        t0.a(t0Var.f26483b, (z0) ((b) d2Var));
        return t0Var.b();
    }
}

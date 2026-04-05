package com.google.firebase.messaging;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final xi.i f29765a = xi.i.builder().configureWith(d.f29772a).build();

    public static byte[] encode(Object obj) {
        return f29765a.encode(obj);
    }

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        f29765a.encode(obj, outputStream);
    }
}

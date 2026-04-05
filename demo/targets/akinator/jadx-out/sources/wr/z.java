package wr;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f91209a = new z();

    @Override // wr.a0, wr.d0, wr.a1
    public String getMessageEncoding() {
        return "identity";
    }

    @Override // wr.a0, wr.d0
    public OutputStream compress(OutputStream outputStream) {
        return outputStream;
    }

    @Override // wr.a0, wr.a1
    public InputStream decompress(InputStream inputStream) {
        return inputStream;
    }
}

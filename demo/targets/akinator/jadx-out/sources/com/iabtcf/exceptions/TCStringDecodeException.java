package com.iabtcf.exceptions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class TCStringDecodeException extends RuntimeException {
    private static final long serialVersionUID = 4508672474002398542L;

    public TCStringDecodeException(Throwable th2) {
        super(th2);
    }

    public TCStringDecodeException(String str) {
        super(str);
    }

    public TCStringDecodeException(String str, Throwable th2) {
        super(str, th2);
    }
}

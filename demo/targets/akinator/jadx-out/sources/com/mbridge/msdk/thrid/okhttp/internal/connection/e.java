package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private IOException f43342a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f43343b;

    public e(IOException iOException) {
        super(iOException);
        this.f43342a = iOException;
        this.f43343b = iOException;
    }

    public IOException a() {
        return this.f43342a;
    }

    public IOException b() {
        return this.f43343b;
    }

    public void a(IOException iOException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f43342a, (Throwable) iOException);
        this.f43343b = iOException;
    }
}

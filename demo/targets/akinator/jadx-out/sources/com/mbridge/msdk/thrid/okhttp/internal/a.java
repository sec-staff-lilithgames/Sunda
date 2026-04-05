package com.mbridge.msdk.thrid.okhttp.internal;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.connection.g;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f43285a;

    public abstract int a(y.a aVar);

    public abstract com.mbridge.msdk.thrid.okhttp.internal.connection.c a(h hVar, com.mbridge.msdk.thrid.okhttp.a aVar, g gVar, a0 a0Var);

    public abstract com.mbridge.msdk.thrid.okhttp.internal.connection.d a(h hVar);

    public abstract IOException a(com.mbridge.msdk.thrid.okhttp.d dVar, IOException iOException);

    public abstract Socket a(h hVar, com.mbridge.msdk.thrid.okhttp.a aVar, g gVar);

    public abstract void a(i iVar, SSLSocket sSLSocket, boolean z10);

    public abstract void a(p.a aVar, String str);

    public abstract void a(p.a aVar, String str, String str2);

    public abstract boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2);

    public abstract boolean a(h hVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar);

    public abstract void b(h hVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar);
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class m {
    public static final g.a a(Exception e10) {
        e0.checkNotNullParameter(e10, "e");
        return e10 instanceof UnknownHostException ? g.a.q.f47942a : e10 instanceof SocketException ? g.a.i.f47934a : e10 instanceof SSLHandshakeException ? g.a.j.f47935a : e10 instanceof IOException ? g.a.f.f47931a : e10 instanceof SecurityException ? g.a.C0411g.f47932a : e10 instanceof n ? g.a.m.f47938a : e10 instanceof NumberFormatException ? g.a.l.f47937a : g.a.r.f47943a;
    }
}

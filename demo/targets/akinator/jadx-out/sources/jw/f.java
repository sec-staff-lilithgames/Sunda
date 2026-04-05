package jw;

import javax.net.ssl.SSLSocket;
import jw.g;
import kotlin.jvm.internal.e0;
import p0.o2;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f69959a;

    public f(String str) {
        this.f69959a = str;
    }

    @Override // jw.l
    public n create(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        return g.a.access$build(g.f69960e, sslSocket.getClass());
    }

    @Override // jw.l
    public boolean matchesSocket(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        e0.checkNotNullExpressionValue(name, "getName(...)");
        return k0.startsWith$default(name, o2.q(new StringBuilder(), this.f69959a, '.'), false, 2, null);
    }
}

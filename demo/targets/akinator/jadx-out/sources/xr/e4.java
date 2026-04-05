package xr;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e4 extends wr.t4 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f92460a = wr.t2.isAndroid(e4.class.getClassLoader());

    @Override // wr.p4.a
    public String getDefaultScheme() {
        return "dns";
    }

    @Override // wr.t4
    public Collection<Class<? extends SocketAddress>> getProducedSocketAddressTypes() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // wr.p4.a
    public wr.p4 newNameResolver(URI uri, wr.n4 n4Var) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) mh.p1.checkNotNull(uri.getPath(), "targetPath");
        mh.p1.checkArgument(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        String strSubstring = str.substring(1);
        uri.getAuthority();
        return new d4(strSubstring, n4Var, c5.f92325t, mh.t2.createUnstarted(), f92460a);
    }

    @Override // wr.t4
    public int priority() {
        return 5;
    }
}

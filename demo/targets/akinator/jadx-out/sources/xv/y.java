package xv;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y implements z {
    @Override // xv.z
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {
        kotlin.jvm.internal.e0.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(allByName, "getAllByName(...)");
            return uu.k0.toList(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(a.b.k("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }
}

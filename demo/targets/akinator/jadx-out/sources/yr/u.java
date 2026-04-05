package yr;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Logger;
import wr.m3;
import wr.n3;
import wr.t2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u extends n3 {
    @Override // wr.n3
    public final Set a() {
        Logger logger = t.f95032q;
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // wr.n3
    public boolean isAvailable() {
        return true;
    }

    @Override // wr.n3
    public m3 newChannelBuilder(String str, wr.k kVar) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        s sVarD = t.d(kVar);
        String str2 = sVarD.f95029c;
        return str2 != null ? m3.error(str2) : m3.channelBuilder(new t(str, kVar, sVarD.f95028b, sVarD.f95027a));
    }

    @Override // wr.n3
    public int priority() {
        return t2.isAndroid(u.class.getClassLoader()) ? 8 : 3;
    }

    @Override // wr.n3
    public t builderForAddress(String str, int i10) {
        return t.forAddress(str, i10);
    }

    @Override // wr.n3
    public t builderForTarget(String str) {
        return t.forTarget(str);
    }
}

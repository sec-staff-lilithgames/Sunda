package yr;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import wr.j5;
import wr.n5;
import wr.u5;
import wr.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 extends v5 {
    @Override // wr.v5
    public final j5 a() {
        throw new UnsupportedOperationException("Use Grpc.newServerBuilderForPort() instead");
    }

    @Override // wr.v5
    public final u5 b(int i10, n5 n5Var) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        n0 n0VarA = o0.a(n5Var);
        String str = n0VarA.f94966b;
        return str != null ? u5.error(str) : u5.serverBuilder(new o0(new InetSocketAddress(i10), n0VarA.f94965a));
    }
}

package yr;

import java.security.GeneralSecurityException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import xr.r1;
import xr.w8;
import xr.y9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p implements w8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f94991a;

    public p(t tVar) {
        this.f94991a = tVar;
    }

    @Override // xr.w8
    public r1 buildClientTransportFactory() {
        SSLSocketFactory sSLSocketFactory;
        t tVar = this.f94991a;
        boolean z10 = tVar.f95047k != Long.MAX_VALUE;
        y9 y9Var = tVar.f95039c;
        y9 y9Var2 = tVar.f95040d;
        SocketFactory socketFactory = tVar.f95041e;
        int iC = b3.h.c(tVar.f95046j);
        if (iC == 0) {
            try {
                if (tVar.f95042f == null) {
                    tVar.f95042f = SSLContext.getInstance("Default", zr.m.get().getProvider()).getSocketFactory();
                }
                sSLSocketFactory = tVar.f95042f;
            } catch (GeneralSecurityException e10) {
                throw new RuntimeException("TLS Provider failure", e10);
            }
        } else {
            if (iC != 1) {
                throw new RuntimeException("Unknown negotiation type: ".concat(w0.i.i(tVar.f95046j)));
            }
            sSLSocketFactory = null;
        }
        return new r(y9Var, y9Var2, socketFactory, sSLSocketFactory, tVar.f95044h, tVar.f95045i, tVar.f95051o, z10, tVar.f95047k, tVar.f95048l, tVar.f95049m, tVar.f95050n, tVar.f95052p, tVar.f95038b);
    }
}

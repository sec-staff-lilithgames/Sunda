package jw;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.conscrypt.Conscrypt;
import xv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f69969a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f69970b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f69971c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static /* synthetic */ boolean atLeastVersion$default(a aVar, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            return aVar.atLeastVersion(i10, i11, i12);
        }

        public final boolean atLeastVersion(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        public final l getFactory() {
            return k.f69970b;
        }

        public final boolean isSupported() {
            return k.f69971c;
        }
    }

    static {
        a aVar = new a(null);
        f69969a = aVar;
        f69970b = new j();
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.atLeastVersion(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f69971c = z10;
    }

    @Override // jw.n
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends n0> protocols) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        e0.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) okhttp3.internal.platform.c.f79515a.alpnProtocolNames(protocols).toArray(new String[0]));
        }
    }

    @Override // jw.n
    public String getSelectedProtocol(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        if (matchesSocket(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // jw.n
    public boolean isSupported() {
        return f69971c;
    }

    @Override // jw.n
    public boolean matchesSocket(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // jw.n
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return super.matchesSocketFactory(sSLSocketFactory);
    }

    @Override // jw.n
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return super.trustManager(sSLSocketFactory);
    }
}

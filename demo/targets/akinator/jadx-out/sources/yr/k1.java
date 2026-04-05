package yr;

import com.squareup.okhttp.CipherSuite;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.TlsVersion;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mh.p1;
import wr.e2;
import wr.e4;
import wr.p2;
import xr.df;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f94954a = Logger.getLogger(k1.class.getName());

    public static byte[][] a(List list) {
        byte[][] bArr = new byte[list.size() * 2][];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            as.e eVar = (as.e) it.next();
            int i11 = i10 + 1;
            bArr[i10] = eVar.f7946a.toByteArray();
            i10 += 2;
            bArr[i11] = eVar.f7947b.toByteArray();
        }
        return df.toRawSerializedHeaders(bArr);
    }

    public static zr.c b(ConnectionSpec connectionSpec) {
        p1.checkArgument(connectionSpec.isTls(), "plaintext ConnectionSpec is not accepted");
        List listTlsVersions = connectionSpec.tlsVersions();
        int size = listTlsVersions.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = ((TlsVersion) listTlsVersions.get(i10)).javaName();
        }
        List listCipherSuites = connectionSpec.cipherSuites();
        int size2 = listCipherSuites.size();
        zr.a[] aVarArr = new zr.a[size2];
        for (int i11 = 0; i11 < size2; i11++) {
            aVarArr[i11] = zr.a.valueOf(((CipherSuite) listCipherSuites.get(i11)).name());
        }
        return new zr.b(connectionSpec.isTls()).supportsTlsExtensions(connectionSpec.supportsTlsExtensions()).tlsVersions(strArr).cipherSuites(aVarArr).build();
    }

    public static e2.g c(Socket socket) {
        Logger logger = f94954a;
        e2.g.a aVar = new e2.g.a();
        try {
            aVar.setSocketOptionLingerSeconds(Integer.valueOf(socket.getSoLinger()));
        } catch (SocketException e10) {
            logger.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e10);
            aVar.addOption("SO_LINGER", "channelz_internal_error");
        }
        try {
            aVar.setSocketOptionTimeoutMillis(Integer.valueOf(socket.getSoTimeout()));
        } catch (Exception e11) {
            logger.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e11);
            aVar.addOption("SO_TIMEOUT", "channelz_internal_error");
        }
        try {
            aVar.addOption("TCP_NODELAY", socket.getTcpNoDelay());
        } catch (SocketException e12) {
            logger.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e12);
            aVar.addOption("TCP_NODELAY", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_REUSEADDR", socket.getReuseAddress());
        } catch (SocketException e13) {
            logger.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e13);
            aVar.addOption("SO_REUSEADDR", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_SNDBUF", socket.getSendBufferSize());
        } catch (SocketException e14) {
            logger.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e14);
            aVar.addOption("SO_SNDBUF", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_RECVBUF", socket.getReceiveBufferSize());
        } catch (SocketException e15) {
            logger.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e15);
            aVar.addOption("SO_RECVBUF", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_KEEPALIVE", socket.getKeepAlive());
        } catch (SocketException e16) {
            logger.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e16);
            aVar.addOption("SO_KEEPALIVE", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_OOBINLINE", socket.getOOBInline());
        } catch (SocketException e17) {
            logger.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e17);
            aVar.addOption("SO_OOBINLINE", "channelz_internal_error");
        }
        try {
            aVar.addOption("IP_TOS", socket.getTrafficClass());
        } catch (SocketException e18) {
            logger.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e18);
            aVar.addOption("IP_TOS", "channelz_internal_error");
        }
        return aVar.build();
    }

    public static e4 convertHeaders(List<as.e> list) {
        return p2.newMetadata(a(list));
    }

    public static e4 convertTrailers(List<as.e> list) {
        return p2.newMetadata(a(list));
    }
}

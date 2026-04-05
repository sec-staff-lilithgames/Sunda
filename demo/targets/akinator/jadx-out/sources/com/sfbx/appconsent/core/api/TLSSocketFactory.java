package com.sfbx.appconsent.core.api;

import io.sfbx.appconsent.logger.ACLogger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TLSSocketFactory extends SSLSocketFactory {
    public static final Companion Companion = new Companion(null);
    private static final String tag = "TLSSocketFactory";
    private final SSLSocketFactory delegate;
    private String[] protocols = {"TLSv1.3", "TLSv1.2", "TLSv1.1"};
    private final SSLContext sslContext;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public TLSSocketFactory() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        e0.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        this.sslContext = sSLContext;
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        e0.checkNotNullExpressionValue(socketFactory, "sslContext.socketFactory");
        this.delegate = socketFactory;
        final HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
        e0.checkNotNullExpressionValue(defaultHostnameVerifier, "getDefaultHostnameVerifier()");
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() { // from class: com.sfbx.appconsent.core.api.a
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    return TLSSocketFactory._init_$lambda$0(defaultHostnameVerifier, str, sSLSession);
                }
            });
        } catch (Exception e10) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            aCLogger.w(tag2, "Unable to define hostname verifier", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(HostnameVerifier hvDefault, String str, SSLSession sSLSession) throws SSLHandshakeException, SSLPeerUnverifiedException {
        boolean zVerify;
        Principal peerPrincipal;
        e0.checkNotNullParameter(hvDefault, "$hvDefault");
        try {
            zVerify = hvDefault.verify(str, sSLSession);
        } catch (Exception e10) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            aCLogger.e(tag2, e10);
            zVerify = false;
        }
        if (zVerify) {
            return true;
        }
        try {
            peerPrincipal = sSLSession.getPeerPrincipal();
        } catch (Exception unused) {
            peerPrincipal = null;
        }
        SSLHandshakeException sSLHandshakeException = new SSLHandshakeException("Expected " + str + ", found " + peerPrincipal);
        ACLogger aCLogger2 = ACLogger.INSTANCE;
        String tag3 = tag;
        e0.checkNotNullExpressionValue(tag3, "tag");
        aCLogger2.e(tag3, sSLHandshakeException);
        throw sSLHandshakeException;
    }

    private final Socket enableTLSOnSocket(Socket socket) throws SSLHandshakeException {
        if (socket == null) {
            return null;
        }
        boolean z10 = socket instanceof SSLSocket;
        if (z10) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            if (isTLSServerEnabled(sSLSocket)) {
                String[] supportedProtocols = sSLSocket.getSupportedProtocols();
                e0.checkNotNullExpressionValue(supportedProtocols, "this.supportedProtocols");
                Set set = k0.toSet(supportedProtocols);
                String[] strArr = this.protocols;
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (set.contains(str)) {
                        arrayList.add(str);
                    }
                }
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
                sSLSocket.getSSLParameters().setEndpointIdentificationAlgorithm("HTTPS");
                return socket;
            }
        }
        if (!z10) {
            SSLHandshakeException sSLHandshakeException = new SSLHandshakeException("This device does not support TLS socket connection");
            ACLogger aCLogger = ACLogger.INSTANCE;
            String tag2 = tag;
            e0.checkNotNullExpressionValue(tag2, "tag");
            aCLogger.e(tag2, sSLHandshakeException);
            throw sSLHandshakeException;
        }
        StringBuilder sb2 = new StringBuilder("This device does not support TLS protocol ");
        String string = Arrays.toString(((SSLSocket) socket).getSupportedProtocols());
        e0.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        SSLHandshakeException sSLHandshakeException2 = new SSLHandshakeException(sb2.toString());
        ACLogger aCLogger2 = ACLogger.INSTANCE;
        String tag3 = tag;
        e0.checkNotNullExpressionValue(tag3, "tag");
        aCLogger2.e(tag3, sSLHandshakeException2);
        throw sSLHandshakeException2;
    }

    private final boolean isTLSServerEnabled(SSLSocket sSLSocket) {
        String[] supportedProtocols = sSLSocket.getSupportedProtocols();
        e0.checkNotNullExpressionValue(supportedProtocols, "sslSocket.supportedProtocols");
        for (String str : supportedProtocols) {
            if (k0.contains(this.protocols, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}

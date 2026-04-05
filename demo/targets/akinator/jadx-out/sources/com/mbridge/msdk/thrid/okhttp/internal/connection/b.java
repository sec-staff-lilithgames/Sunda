package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<i> f43323a;

    /* renamed from: b, reason: collision with root package name */
    private int f43324b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f43325c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43326d;

    public b(List<i> list) {
        this.f43323a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i10 = this.f43324b; i10 < this.f43323a.size(); i10++) {
            if (this.f43323a.get(i10).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public i a(SSLSocket sSLSocket) throws IOException {
        i iVar;
        int i10 = this.f43324b;
        int size = this.f43323a.size();
        while (true) {
            if (i10 >= size) {
                iVar = null;
                break;
            }
            iVar = this.f43323a.get(i10);
            if (iVar.a(sSLSocket)) {
                this.f43324b = i10 + 1;
                break;
            }
            i10++;
        }
        if (iVar != null) {
            this.f43325c = b(sSLSocket);
            com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(iVar, sSLSocket, this.f43326d);
            return iVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f43326d + ", modes=" + this.f43323a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        this.f43326d = true;
        if (!this.f43325c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}

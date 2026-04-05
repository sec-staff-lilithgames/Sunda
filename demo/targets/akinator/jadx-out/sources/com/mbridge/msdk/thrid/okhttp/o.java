package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f43669a;

    /* renamed from: b, reason: collision with root package name */
    private final f f43670b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Certificate> f43671c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Certificate> f43672d;

    private o(b0 b0Var, f fVar, List<Certificate> list, List<Certificate> list2) {
        this.f43669a = b0Var;
        this.f43670b = fVar;
        this.f43671c = list;
        this.f43672d = list2;
    }

    public static o a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        f fVarA = f.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        b0 b0VarA = b0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listA = peerCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new o(b0VarA, fVarA, listA, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.EMPTY_LIST);
    }

    public List<Certificate> b() {
        return this.f43671c;
    }

    public b0 c() {
        return this.f43669a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f43669a.equals(oVar.f43669a) && this.f43670b.equals(oVar.f43670b) && this.f43671c.equals(oVar.f43671c) && this.f43672d.equals(oVar.f43672d);
    }

    public int hashCode() {
        return this.f43672d.hashCode() + ((this.f43671c.hashCode() + ((this.f43670b.hashCode() + ((this.f43669a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public f a() {
        return this.f43670b;
    }
}

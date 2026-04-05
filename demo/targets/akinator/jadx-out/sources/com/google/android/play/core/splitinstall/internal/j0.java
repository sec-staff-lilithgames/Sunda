package com.google.android.play.core.splitinstall.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j0 extends k0 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f29620c;

    public j0(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f29620c = bArr;
    }

    @Override // com.google.android.play.core.splitinstall.internal.k0, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f29620c;
    }
}

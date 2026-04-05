package es;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {
    public static PrivateKey getPrivateKey(InputStream inputStream) throws InvalidKeySpecException, NoSuchAlgorithmException, IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
        do {
            line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
        } while (!"-----BEGIN PRIVATE KEY-----".equals(line));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line2 = bufferedReader.readLine();
            if (line2 == null || "-----END PRIVATE KEY-----".equals(line2)) {
                break;
            }
            sb2.append(line2);
        }
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(ph.o.base64().decode(sb2.toString()));
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePrivate(pKCS8EncodedKeySpec);
            } catch (InvalidKeySpecException e10) {
                throw new InvalidKeySpecException("Neither RSA nor EC worked", e10);
            }
        } catch (InvalidKeySpecException unused) {
            return KeyFactory.getInstance("EC").generatePrivate(pKCS8EncodedKeySpec);
        }
    }

    public static X509Certificate[] getX509Certificates(InputStream inputStream) throws CertificateException {
        return (X509Certificate[]) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificates(inputStream).toArray(new X509Certificate[0]);
    }
}

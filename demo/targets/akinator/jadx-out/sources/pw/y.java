package pw;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import cv.BLca.YsiBvdpw;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y extends t {

    /* renamed from: f, reason: collision with root package name */
    public static final a f82009f = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final MessageDigest f82010c;

    /* renamed from: e, reason: collision with root package name */
    public final Mac f82011e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final y hmacSha1(z0 sink, l key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            return new y(sink, key, "HmacSHA1");
        }

        public final y hmacSha256(z0 sink, l key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            return new y(sink, key, "HmacSHA256");
        }

        public final y hmacSha512(z0 sink, l key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            return new y(sink, key, "HmacSHA512");
        }

        public final y md5(z0 sink) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            return new y(sink, SameMD5.TAG);
        }

        public final y sha1(z0 sink) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            return new y(sink, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        public final y sha256(z0 sink) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            return new y(sink, "SHA-256");
        }

        public final y sha512(z0 sink) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            return new y(sink, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z0 sink, MessageDigest digest) {
        super(sink);
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.e0.checkNotNullParameter(digest, "digest");
        this.f82010c = digest;
        this.f82011e = null;
    }

    public static final y hmacSha1(z0 z0Var, l lVar) {
        return f82009f.hmacSha1(z0Var, lVar);
    }

    public static final y hmacSha256(z0 z0Var, l lVar) {
        return f82009f.hmacSha256(z0Var, lVar);
    }

    public static final y hmacSha512(z0 z0Var, l lVar) {
        return f82009f.hmacSha512(z0Var, lVar);
    }

    public static final y md5(z0 z0Var) {
        return f82009f.md5(z0Var);
    }

    public static final y sha1(z0 z0Var) {
        return f82009f.sha1(z0Var);
    }

    public static final y sha256(z0 z0Var) {
        return f82009f.sha256(z0Var);
    }

    public static final y sha512(z0 z0Var) {
        return f82009f.sha512(z0Var);
    }

    @tu.f
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final l m5899deprecated_hash() {
        return hash();
    }

    public final l hash() throws IllegalStateException {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f82010c;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f82011e;
            kotlin.jvm.internal.e0.checkNotNull(mac);
            bArrDoFinal = mac.doFinal();
        }
        kotlin.jvm.internal.e0.checkNotNull(bArrDoFinal);
        return new l(bArrDoFinal);
    }

    @Override // pw.t, pw.z0
    public void write(g source, long j10) throws IllegalStateException, IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        b.checkOffsetAndCount(source.size(), 0L, j10);
        w0 w0Var = source.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        long j11 = 0;
        while (j11 < j10) {
            int i10 = w0Var.f81996c;
            byte[] bArr = w0Var.f81994a;
            int iMin = (int) Math.min(j10 - j11, i10 - w0Var.f81995b);
            MessageDigest messageDigest = this.f82010c;
            if (messageDigest != null) {
                messageDigest.update(bArr, w0Var.f81995b, iMin);
            } else {
                Mac mac = this.f82011e;
                kotlin.jvm.internal.e0.checkNotNull(mac);
                mac.update(bArr, w0Var.f81995b, iMin);
            }
            j11 += iMin;
            w0Var = w0Var.f81999f;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
        }
        super.write(source, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(z0 sink, String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z0 sink, Mac mac) {
        super(sink);
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.e0.checkNotNullParameter(mac, "mac");
        this.f82011e = mac;
        this.f82010c = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(z0 z0Var, l key, String algorithm) throws NoSuchAlgorithmException, InvalidKeyException {
        kotlin.jvm.internal.e0.checkNotNullParameter(z0Var, YsiBvdpw.zqVfF);
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            kotlin.jvm.internal.e0.checkNotNull(mac);
            this(z0Var, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

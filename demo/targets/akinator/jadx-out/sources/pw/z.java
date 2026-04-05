package pw;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z extends u {

    /* renamed from: e, reason: collision with root package name */
    public static final a f82014e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final MessageDigest f82015b;

    /* renamed from: c, reason: collision with root package name */
    public final Mac f82016c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final z hmacSha1(b1 source, l key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            return new z(source, key, "HmacSHA1");
        }

        public final z hmacSha256(b1 source, l key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            return new z(source, key, "HmacSHA256");
        }

        public final z hmacSha512(b1 source, l key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            return new z(source, key, "HmacSHA512");
        }

        public final z md5(b1 source) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            return new z(source, SameMD5.TAG);
        }

        public final z sha1(b1 source) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            return new z(source, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        public final z sha256(b1 source) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            return new z(source, "SHA-256");
        }

        public final z sha512(b1 source) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            return new z(source, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b1 source, MessageDigest digest) {
        super(source);
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(digest, "digest");
        this.f82015b = digest;
        this.f82016c = null;
    }

    public static final z hmacSha1(b1 b1Var, l lVar) {
        return f82014e.hmacSha1(b1Var, lVar);
    }

    public static final z hmacSha256(b1 b1Var, l lVar) {
        return f82014e.hmacSha256(b1Var, lVar);
    }

    public static final z hmacSha512(b1 b1Var, l lVar) {
        return f82014e.hmacSha512(b1Var, lVar);
    }

    public static final z md5(b1 b1Var) {
        return f82014e.md5(b1Var);
    }

    public static final z sha1(b1 b1Var) {
        return f82014e.sha1(b1Var);
    }

    public static final z sha256(b1 b1Var) {
        return f82014e.sha256(b1Var);
    }

    public static final z sha512(b1 b1Var) {
        return f82014e.sha512(b1Var);
    }

    @tu.f
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final l m5900deprecated_hash() {
        return hash();
    }

    public final l hash() throws IllegalStateException {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f82015b;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f82016c;
            kotlin.jvm.internal.e0.checkNotNull(mac);
            bArrDoFinal = mac.doFinal();
        }
        kotlin.jvm.internal.e0.checkNotNull(bArrDoFinal);
        return new l(bArrDoFinal);
    }

    @Override // pw.u, pw.b1
    public long read(g sink, long j10) throws IllegalStateException, IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        long j11 = super.read(sink, j10);
        if (j11 != -1) {
            long size = sink.size() - j11;
            long size2 = sink.size();
            w0 w0Var = sink.f81896b;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            while (size2 > size) {
                w0Var = w0Var.f82000g;
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
                size2 -= w0Var.f81996c - w0Var.f81995b;
            }
            while (size2 < sink.size()) {
                int i10 = w0Var.f81995b;
                byte[] bArr = w0Var.f81994a;
                int i11 = (int) ((i10 + size) - size2);
                MessageDigest messageDigest = this.f82015b;
                if (messageDigest != null) {
                    messageDigest.update(bArr, i11, w0Var.f81996c - i11);
                } else {
                    Mac mac = this.f82016c;
                    kotlin.jvm.internal.e0.checkNotNull(mac);
                    mac.update(bArr, i11, w0Var.f81996c - i11);
                }
                size2 += w0Var.f81996c - w0Var.f81995b;
                w0Var = w0Var.f81999f;
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
                size = size2;
            }
        }
        return j11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(b1 source, String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b1 source, Mac mac) {
        super(source);
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(mac, "mac");
        this.f82016c = mac;
        this.f82015b = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(b1 source, l key, String algorithm) throws NoSuchAlgorithmException, InvalidKeyException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            kotlin.jvm.internal.e0.checkNotNull(mac);
            this(source, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

package com.applovin.shadow.okio;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class HashingSource extends ForwardingSource implements Source {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final HashingSource hmacSha1(Source source, ByteString key) {
            e0.checkNotNullParameter(source, "source");
            e0.checkNotNullParameter(key, "key");
            return new HashingSource(source, key, "HmacSHA1");
        }

        public final HashingSource hmacSha256(Source source, ByteString key) {
            e0.checkNotNullParameter(source, "source");
            e0.checkNotNullParameter(key, "key");
            return new HashingSource(source, key, "HmacSHA256");
        }

        public final HashingSource hmacSha512(Source source, ByteString key) {
            e0.checkNotNullParameter(source, "source");
            e0.checkNotNullParameter(key, "key");
            return new HashingSource(source, key, "HmacSHA512");
        }

        public final HashingSource md5(Source source) {
            e0.checkNotNullParameter(source, "source");
            return new HashingSource(source, SameMD5.TAG);
        }

        public final HashingSource sha1(Source source) {
            e0.checkNotNullParameter(source, "source");
            return new HashingSource(source, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        public final HashingSource sha256(Source source) {
            e0.checkNotNullParameter(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        public final HashingSource sha512(Source source) {
            e0.checkNotNullParameter(source, "source");
            return new HashingSource(source, "SHA-512");
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, MessageDigest digest) {
        super(source);
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    public static final HashingSource hmacSha1(Source source, ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    public static final HashingSource hmacSha256(Source source, ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    public static final HashingSource hmacSha512(Source source, ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    public static final HashingSource md5(Source source) {
        return Companion.md5(source);
    }

    public static final HashingSource sha1(Source source) {
        return Companion.sha1(source);
    }

    public static final HashingSource sha256(Source source) {
        return Companion.sha256(source);
    }

    public static final HashingSource sha512(Source source) {
        return Companion.sha512(source);
    }

    @f
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m367deprecated_hash() {
        return hash();
    }

    public final ByteString hash() throws IllegalStateException {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            e0.checkNotNull(mac);
            bArrDoFinal = mac.doFinal();
        }
        e0.checkNotNull(bArrDoFinal);
        return new ByteString(bArrDoFinal);
    }

    @Override // com.applovin.shadow.okio.ForwardingSource, com.applovin.shadow.okio.Source
    public long read(Buffer sink, long j10) throws IllegalStateException, IOException {
        e0.checkNotNullParameter(sink, "sink");
        long j11 = super.read(sink, j10);
        if (j11 != -1) {
            long size = sink.size() - j11;
            long size2 = sink.size();
            Segment segment = sink.head;
            e0.checkNotNull(segment);
            while (size2 > size) {
                segment = segment.prev;
                e0.checkNotNull(segment);
                size2 -= segment.limit - segment.pos;
            }
            while (size2 < sink.size()) {
                int i10 = (int) ((segment.pos + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i10, segment.limit - i10);
                } else {
                    Mac mac = this.mac;
                    e0.checkNotNull(mac);
                    mac.update(segment.data, i10, segment.limit - i10);
                }
                size2 += segment.limit - segment.pos;
                segment = segment.next;
                e0.checkNotNull(segment);
                size = size2;
            }
        }
        return j11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, String algorithm) throws NoSuchAlgorithmException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        e0.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, Mac mac) {
        super(source);
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, ByteString key, String algorithm) throws NoSuchAlgorithmException, InvalidKeyException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            e0.checkNotNull(mac);
            this(source, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

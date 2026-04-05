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
public final class HashingSink extends ForwardingSink implements Sink {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final HashingSink hmacSha1(Sink sink, ByteString key) {
            e0.checkNotNullParameter(sink, "sink");
            e0.checkNotNullParameter(key, "key");
            return new HashingSink(sink, key, "HmacSHA1");
        }

        public final HashingSink hmacSha256(Sink sink, ByteString key) {
            e0.checkNotNullParameter(sink, "sink");
            e0.checkNotNullParameter(key, "key");
            return new HashingSink(sink, key, "HmacSHA256");
        }

        public final HashingSink hmacSha512(Sink sink, ByteString key) {
            e0.checkNotNullParameter(sink, "sink");
            e0.checkNotNullParameter(key, "key");
            return new HashingSink(sink, key, "HmacSHA512");
        }

        public final HashingSink md5(Sink sink) {
            e0.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, SameMD5.TAG);
        }

        public final HashingSink sha1(Sink sink) {
            e0.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        public final HashingSink sha256(Sink sink) {
            e0.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        public final HashingSink sha512(Sink sink) {
            e0.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, MessageDigest digest) {
        super(sink);
        e0.checkNotNullParameter(sink, "sink");
        e0.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    public static final HashingSink hmacSha1(Sink sink, ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    public static final HashingSink hmacSha256(Sink sink, ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    public static final HashingSink hmacSha512(Sink sink, ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    public static final HashingSink md5(Sink sink) {
        return Companion.md5(sink);
    }

    public static final HashingSink sha1(Sink sink) {
        return Companion.sha1(sink);
    }

    public static final HashingSink sha256(Sink sink) {
        return Companion.sha256(sink);
    }

    public static final HashingSink sha512(Sink sink) {
        return Companion.sha512(sink);
    }

    @f
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m366deprecated_hash() {
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

    @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws IllegalStateException, IOException {
        e0.checkNotNullParameter(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
        Segment segment = source.head;
        e0.checkNotNull(segment);
        long j11 = 0;
        while (j11 < j10) {
            int iMin = (int) Math.min(j10 - j11, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, iMin);
            } else {
                Mac mac = this.mac;
                e0.checkNotNull(mac);
                mac.update(segment.data, segment.pos, iMin);
            }
            j11 += iMin;
            segment = segment.next;
            e0.checkNotNull(segment);
        }
        super.write(source, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(Sink sink, String algorithm) throws NoSuchAlgorithmException {
        e0.checkNotNullParameter(sink, "sink");
        e0.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        e0.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, Mac mac) {
        super(sink);
        e0.checkNotNullParameter(sink, "sink");
        e0.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(Sink sink, ByteString key, String algorithm) throws NoSuchAlgorithmException, InvalidKeyException {
        e0.checkNotNullParameter(sink, "sink");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            e0.checkNotNull(mac);
            this(sink, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

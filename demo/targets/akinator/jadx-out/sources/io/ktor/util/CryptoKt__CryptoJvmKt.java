package io.ktor.util;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.channels.ChannelResult;
import kv.l;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final /* synthetic */ class CryptoKt__CryptoJvmKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.CryptoKt__CryptoJvmKt$getDigestFunction$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ String $algorithm;
        final /* synthetic */ l $salt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, l lVar) {
            super(1);
            this.$algorithm = str;
            this.$salt = lVar;
        }

        @Override // kv.l
        public final byte[] invoke(String e10) {
            e0.checkNotNullParameter(e10, "e");
            return CryptoKt__CryptoJvmKt.getDigest$CryptoKt__CryptoJvmKt(e10, this.$algorithm, this.$salt);
        }
    }

    public static final Digest Digest(String name) throws NoSuchAlgorithmException {
        e0.checkNotNullParameter(name, "name");
        MessageDigest messageDigest = MessageDigest.getInstance(name);
        e0.checkNotNullExpressionValue(messageDigest, "getInstance(name)");
        return DigestImpl.m4288boximpl(DigestImpl.m4290constructorimpl(messageDigest));
    }

    public static final String generateNonce() {
        String str = (String) ChannelResult.m5158getOrNullimpl(NonceKt.getSeedChannel().mo5146tryReceivePtdJZtk());
        return str != null ? str : generateNonceBlocking$CryptoKt__CryptoJvmKt();
    }

    private static final String generateNonceBlocking$CryptoKt__CryptoJvmKt() {
        NonceKt.ensureNonceGeneratorRunning();
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new CryptoKt__CryptoJvmKt$generateNonceBlocking$1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] getDigest$CryptoKt__CryptoJvmKt(String str, String str2, l lVar) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        String str3 = (String) lVar.invoke(str);
        Charset charset = g.f86134b;
        byte[] bytes = str3.getBytes(charset);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        byte[] bytes2 = str.getBytes(charset);
        e0.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDigest = messageDigest.digest(bytes2);
        e0.checkNotNullExpressionValue(bArrDigest, "with(MessageDigest.getIn…text.toByteArray())\n    }");
        return bArrDigest;
    }

    public static final l getDigestFunction(String algorithm, l salt) {
        e0.checkNotNullParameter(algorithm, "algorithm");
        e0.checkNotNullParameter(salt, "salt");
        return new AnonymousClass1(algorithm, salt);
    }

    public static final byte[] sha1(byte[] bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bytes);
        e0.checkNotNullExpressionValue(bArrDigest, "getInstance(\"SHA1\").digest(bytes)");
        return bArrDigest;
    }
}

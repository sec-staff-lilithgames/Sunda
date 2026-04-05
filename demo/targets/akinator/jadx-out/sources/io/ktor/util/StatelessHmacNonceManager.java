package io.ktor.util;

import bv.b;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.a;
import sv.e;
import sv.g;
import sv.n0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StatelessHmacNonceManager implements NonceManager {
    private final String algorithm;
    private final SecretKeySpec keySpec;
    private final int macLength;
    private final a nonceGenerator;
    private final long timeoutMillis;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.StatelessHmacNonceManager$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            return CryptoKt.generateNonce();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.StatelessHmacNonceManager$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            return CryptoKt.generateNonce();
        }
    }

    public StatelessHmacNonceManager(SecretKeySpec keySpec, String algorithm, long j10, a nonceGenerator) throws NoSuchAlgorithmException, InvalidKeyException {
        e0.checkNotNullParameter(keySpec, "keySpec");
        e0.checkNotNullParameter(algorithm, "algorithm");
        e0.checkNotNullParameter(nonceGenerator, "nonceGenerator");
        this.keySpec = keySpec;
        this.algorithm = algorithm;
        this.timeoutMillis = j10;
        this.nonceGenerator = nonceGenerator;
        Mac mac = Mac.getInstance(algorithm);
        mac.init(keySpec);
        this.macLength = mac.getMacLength();
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final SecretKeySpec getKeySpec() {
        return this.keySpec;
    }

    public final a getNonceGenerator() {
        return this.nonceGenerator;
    }

    public final long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    @Override // io.ktor.util.NonceManager
    public Object newNonce(d<? super String> dVar) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        String str = (String) this.nonceGenerator.invoke();
        String string = Long.toString(System.nanoTime(), e.checkRadix(16));
        e0.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        String strPadStart = n0.padStart(string, 16, '0');
        Mac mac = Mac.getInstance(this.algorithm);
        mac.init(this.keySpec);
        byte[] bytes = (str + AbstractJsonLexerKt.COLON + strPadStart).getBytes(g.f86137e);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        mac.update(bytes);
        byte[] bArrDoFinal = mac.doFinal();
        e0.checkNotNullExpressionValue(bArrDoFinal, "getInstance(algorithm).a…)\n            }.doFinal()");
        return str + '+' + strPadStart + '+' + CryptoKt.hex(bArrDoFinal);
    }

    @Override // io.ktor.util.NonceManager
    public Object verifyNonce(String str, d<? super Boolean> dVar) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        List listSplit$default = n0.split$default((CharSequence) str, new char[]{'+'}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 3) {
            return b.boxBoolean(false);
        }
        String str2 = (String) listSplit$default.get(0);
        String str3 = (String) listSplit$default.get(1);
        String str4 = (String) listSplit$default.get(2);
        if (str2.length() < 8) {
            return b.boxBoolean(false);
        }
        if (str4.length() != this.macLength * 2) {
            return b.boxBoolean(false);
        }
        if (str3.length() != 16) {
            return b.boxBoolean(false);
        }
        if (TimeUnit.MILLISECONDS.toNanos(this.timeoutMillis) + Long.parseLong(str3, e.checkRadix(16)) < System.nanoTime()) {
            return b.boxBoolean(false);
        }
        Mac mac = Mac.getInstance(this.algorithm);
        mac.init(this.keySpec);
        byte[] bytes = (str2 + AbstractJsonLexerKt.COLON + str3).getBytes(g.f86137e);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        mac.update(bytes);
        byte[] bArrDoFinal = mac.doFinal();
        e0.checkNotNullExpressionValue(bArrDoFinal, "getInstance(algorithm).a…)\n            }.doFinal()");
        String strHex = CryptoKt.hex(bArrDoFinal);
        int iMin = Math.min(strHex.length(), str4.length());
        int i10 = 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            if (strHex.charAt(i11) == str4.charAt(i11)) {
                i10++;
            }
        }
        return b.boxBoolean(i10 == this.macLength * 2);
    }

    public /* synthetic */ StatelessHmacNonceManager(SecretKeySpec secretKeySpec, String str, long j10, a aVar, int i10, u uVar) {
        this(secretKeySpec, (i10 & 2) != 0 ? "HmacSHA256" : str, (i10 & 4) != 0 ? ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS : j10, (i10 & 8) != 0 ? AnonymousClass1.INSTANCE : aVar);
    }

    public /* synthetic */ StatelessHmacNonceManager(byte[] bArr, String str, long j10, a aVar, int i10, u uVar) {
        this(bArr, (i10 & 2) != 0 ? "HmacSHA256" : str, (i10 & 4) != 0 ? ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS : j10, (i10 & 8) != 0 ? AnonymousClass2.INSTANCE : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatelessHmacNonceManager(byte[] key, String algorithm, long j10, a nonceGenerator) {
        this(new SecretKeySpec(key, algorithm), algorithm, j10, nonceGenerator);
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(algorithm, "algorithm");
        e0.checkNotNullParameter(nonceGenerator, "nonceGenerator");
    }
}

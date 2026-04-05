package io.ktor.util;

import bx.b;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NonceKt {
    private static final int INSECURE_NONCE_COUNT_FACTOR = 4;
    private static final CoroutineName NonceGeneratorCoroutineName;
    private static final int SECURE_NONCE_COUNT = 8;
    private static final int SECURE_RESEED_PERIOD = 30000;
    private static final String SHA1PRNG = "SHA1PRNG";
    private static final Job nonceGeneratorJob;
    private static final List<String> SECURE_RANDOM_PROVIDERS = p0.listOf((Object[]) new String[]{"NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG"});
    private static final Channel<String> seedChannel = ChannelKt.Channel$default(1024, null, null, 6, null);

    static {
        CoroutineName coroutineName = new CoroutineName("nonce-generator");
        NonceGeneratorCoroutineName = coroutineName;
        nonceGeneratorJob = BuildersKt.launch(GlobalScope.INSTANCE, Dispatchers.getIO().plus(NonCancellable.INSTANCE).plus(coroutineName), CoroutineStart.LAZY, new NonceKt$nonceGeneratorJob$1(null));
    }

    public static final void ensureNonceGeneratorRunning() {
        nonceGeneratorJob.start();
    }

    private static final SecureRandom getInstanceOrNull(String str) {
        try {
            return str != null ? SecureRandom.getInstance(str) : new SecureRandom();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static /* synthetic */ SecureRandom getInstanceOrNull$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return getInstanceOrNull(str);
    }

    public static final Channel<String> getSeedChannel() {
        return seedChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecureRandom lookupSecureRandom() {
        SecureRandom instanceOrNull;
        String property = System.getProperty("io.ktor.random.secure.random.provider");
        if (property != null && (instanceOrNull = getInstanceOrNull(property)) != null) {
            return instanceOrNull;
        }
        Iterator<String> it = SECURE_RANDOM_PROVIDERS.iterator();
        while (it.hasNext()) {
            SecureRandom instanceOrNull2 = getInstanceOrNull(it.next());
            if (instanceOrNull2 != null) {
                return instanceOrNull2;
            }
        }
        b.getLogger("io.ktor.util.random").warn("None of the " + y0.joinToString$default(SECURE_RANDOM_PROVIDERS, ", ", null, null, 0, null, null, 62, null) + " found, fallback to default");
        SecureRandom instanceOrNull$default = getInstanceOrNull$default(null, 1, null);
        if (instanceOrNull$default != null) {
            return instanceOrNull$default;
        }
        throw new IllegalStateException("No SecureRandom implementation found");
    }

    private static /* synthetic */ void getNonceGeneratorJob$annotations() {
    }
}

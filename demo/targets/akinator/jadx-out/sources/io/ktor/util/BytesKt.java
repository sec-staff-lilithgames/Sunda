package io.ktor.util;

import com.inmobi.commons.core.configs.AdConfig;
import i2.hQ.aTNDubNmpwAqdU;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BytesKt {
    @InternalAPI
    public static final short readShort(byte[] bArr, int i10) {
        e0.checkNotNullParameter(bArr, aTNDubNmpwAqdU.OVtiuYmKkTaPD);
        return (short) ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }
}

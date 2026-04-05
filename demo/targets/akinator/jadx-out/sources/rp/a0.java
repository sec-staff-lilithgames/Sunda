package rp;

import com.inmobi.commons.core.configs.AdConfig;
import io.bidmachine.media3.common.util.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 extends ko.o {
    public a0(u0 u0Var, long j10, long j11) {
        super(new ko.j(), new z(u0Var), j10, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}

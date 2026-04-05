package cp;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.inmobi.commons.core.configs.AdConfig;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import ko.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f50864a = new m0(8);

    /* renamed from: b, reason: collision with root package name */
    public int f50865b;

    public final long a(a0 a0Var) throws IOException {
        m0 m0Var = this.f50864a;
        int i10 = 0;
        a0Var.peekFully(m0Var.getData(), 0, 1);
        int i11 = m0Var.getData()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        a0Var.peekFully(m0Var.getData(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (m0Var.getData()[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
        }
        this.f50865b = i13 + 1 + this.f50865b;
        return i14;
    }

    public boolean sniff(a0 a0Var) throws IOException {
        long length = a0Var.getLength();
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (length != -1 && length <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = length;
        }
        int i10 = (int) j10;
        m0 m0Var = this.f50864a;
        a0Var.peekFully(m0Var.getData(), 0, 4);
        this.f50865b = 4;
        for (long unsignedInt = m0Var.readUnsignedInt(); unsignedInt != 440786851; unsignedInt = ((unsignedInt << 8) & (-256)) | (m0Var.getData()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) {
            int i11 = this.f50865b + 1;
            this.f50865b = i11;
            if (i11 == i10) {
                return false;
            }
            a0Var.peekFully(m0Var.getData(), 0, 1);
        }
        long jA = a(a0Var);
        long j11 = this.f50865b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f50865b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(a0Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(a0Var);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        a0Var.advancePeekPosition(i13);
                        this.f50865b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}

package ke;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.google.android.exoplayer2.util.v0;
import com.inmobi.commons.core.configs.AdConfig;
import ee.q;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f70892a = new v0(8);

    /* renamed from: b, reason: collision with root package name */
    public int f70893b;

    public final long a(q qVar) throws IOException {
        v0 v0Var = this.f70892a;
        int i10 = 0;
        qVar.peekFully(v0Var.getData(), 0, 1);
        int i11 = v0Var.getData()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
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
        qVar.peekFully(v0Var.getData(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (v0Var.getData()[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
        }
        this.f70893b = i13 + 1 + this.f70893b;
        return i14;
    }

    public boolean sniff(q qVar) throws IOException {
        long length = qVar.getLength();
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (length != -1 && length <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = length;
        }
        int i10 = (int) j10;
        v0 v0Var = this.f70892a;
        qVar.peekFully(v0Var.getData(), 0, 4);
        this.f70893b = 4;
        for (long unsignedInt = v0Var.readUnsignedInt(); unsignedInt != 440786851; unsignedInt = ((unsignedInt << 8) & (-256)) | (v0Var.getData()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) {
            int i11 = this.f70893b + 1;
            this.f70893b = i11;
            if (i11 == i10) {
                return false;
            }
            qVar.peekFully(v0Var.getData(), 0, 1);
        }
        long jA = a(qVar);
        long j11 = this.f70893b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f70893b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(qVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(qVar);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        qVar.advancePeekPosition(i13);
                        this.f70893b += i13;
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

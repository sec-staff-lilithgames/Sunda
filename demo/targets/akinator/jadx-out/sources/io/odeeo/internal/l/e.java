package io.odeeo.internal.l;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.g.i;
import io.odeeo.internal.q0.x;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final x f64579a = new x(8);

    /* renamed from: b, reason: collision with root package name */
    public int f64580b;

    public final long a(i iVar) throws IOException {
        int i10 = 0;
        iVar.peekFully(this.f64579a.getData(), 0, 1);
        int i11 = this.f64579a.getData()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
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
        iVar.peekFully(this.f64579a.getData(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f64579a.getData()[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
        }
        this.f64580b = i13 + 1 + this.f64580b;
        return i14;
    }

    public boolean sniff(i iVar) throws IOException {
        long length = iVar.getLength();
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (length != -1 && length <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = length;
        }
        int i10 = (int) j10;
        iVar.peekFully(this.f64579a.getData(), 0, 4);
        long unsignedInt = this.f64579a.readUnsignedInt();
        this.f64580b = 4;
        while (unsignedInt != 440786851) {
            int i11 = this.f64580b + 1;
            this.f64580b = i11;
            if (i11 == i10) {
                return false;
            }
            iVar.peekFully(this.f64579a.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | (this.f64579a.getData()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        long jA = a(iVar);
        long j11 = this.f64580b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                long j12 = this.f64580b;
                long j13 = j11 + jA;
                if (j12 < j13) {
                    if (a(iVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(iVar);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i12 = (int) jA2;
                        iVar.advancePeekPosition(i12);
                        this.f64580b += i12;
                    }
                } else if (j12 == j13) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}

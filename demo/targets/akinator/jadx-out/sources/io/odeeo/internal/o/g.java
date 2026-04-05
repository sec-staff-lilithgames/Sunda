package io.odeeo.internal.o;

import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.s;
import io.odeeo.internal.o.h;
import io.odeeo.internal.q0.x;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends h {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f65143o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n, reason: collision with root package name */
    public boolean f65144n;

    public static boolean verifyBitstreamType(x xVar) {
        int iBytesLeft = xVar.bytesLeft();
        byte[] bArr = f65143o;
        if (iBytesLeft < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        xVar.readBytes(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // io.odeeo.internal.o.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f65144n = false;
        }
    }

    @Override // io.odeeo.internal.o.h
    public long a(x xVar) {
        return b(a(xVar.getData()));
    }

    @Override // io.odeeo.internal.o.h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean a(x xVar, long j10, h.b bVar) {
        if (!this.f65144n) {
            byte[] bArrCopyOf = Arrays.copyOf(xVar.getData(), xVar.limit());
            bVar.f65158a = new t.b().setSampleMimeType(MimeTypes.AUDIO_OPUS).setChannelCount(s.getChannelCount(bArrCopyOf)).setSampleRate(48000).setInitializationData(s.buildInitializationData(bArrCopyOf)).build();
            this.f65144n = true;
            return true;
        }
        io.odeeo.internal.q0.a.checkNotNull(bVar.f65158a);
        boolean z10 = xVar.readInt() == 1332770163;
        xVar.setPosition(0);
        return z10;
    }

    public final long a(byte[] bArr) {
        int i10;
        byte b10 = bArr[0];
        int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = bArr[1] & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? 10000 << (i13 & 1) : (i13 & 3) == 3 ? DtbConstants.NETWORK_READ_TIMEOUT : 10000 << r0);
    }
}

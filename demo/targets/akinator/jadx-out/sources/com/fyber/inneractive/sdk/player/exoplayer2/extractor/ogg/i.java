package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okio.Utf8;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends l {

    /* renamed from: o, reason: collision with root package name */
    public static final int f25253o = z.a("Opus");

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f25254p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n, reason: collision with root package name */
    public boolean f25255n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f25255n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10;
        byte[] bArr = nVar.f26042a;
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
        return (this.f25266i * (i10 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? 10000 << (i13 & 1) : (i13 & 3) == 3 ? DtbConstants.NETWORK_READ_TIMEOUT : 10000 << r0))) / 1000000;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar) {
        if (!this.f25255n) {
            byte[] bArrCopyOf = Arrays.copyOf(nVar.f26042a, nVar.f26044c);
            int i10 = bArrCopyOf[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i11 = ((bArrCopyOf[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrCopyOf[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArrCopyOf);
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i11 * C.NANOS_PER_SECOND) / 48000).array());
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((3840 * C.NANOS_PER_SECOND) / 48000).array());
            jVar.f25256a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, MimeTypes.AUDIO_OPUS, -1, -1, i10, 48000, arrayList, null, null);
            this.f25255n = true;
            return true;
        }
        boolean z10 = nVar.b() == f25253o;
        nVar.e(0);
        return z10;
    }
}

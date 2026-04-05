package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends l {

    /* renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.f f25237n;

    /* renamed from: o, reason: collision with root package name */
    public c f25238o;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f25237n = null;
            this.f25238o = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10;
        int i11;
        int i12;
        byte[] bArr = nVar.f26042a;
        int i13 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i14 = (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        switch (i14) {
            case 1:
                i13 = PsExtractor.AUDIO_STREAM;
                return i13;
            case 2:
            case 3:
            case 4:
            case 5:
                i10 = i14 - 2;
                i11 = 576;
                i13 = i11 << i10;
                return i13;
            case 6:
            case 7:
                nVar.e(nVar.f26043b + 4);
                long j10 = nVar.f26042a[nVar.f26043b];
                int i15 = 7;
                while (true) {
                    if (i15 >= 0) {
                        if (((1 << i15) & j10) != 0) {
                            i15--;
                        } else if (i15 < 6) {
                            j10 &= r8 - 1;
                            i12 = 7 - i15;
                        } else if (i15 == 7) {
                            i12 = 1;
                        }
                    }
                }
                i12 = 0;
                if (i12 != 0) {
                    for (int i16 = 1; i16 < i12; i16++) {
                        if ((nVar.f26042a[nVar.f26043b + i16] & 192) != 128) {
                            throw new NumberFormatException(o2.m(j10, "Invalid UTF-8 sequence continuation byte: "));
                        }
                        j10 = (j10 << 6) | (r8 & Utf8.REPLACEMENT_BYTE);
                    }
                    nVar.f26043b += i12;
                    int iJ = i14 == 6 ? nVar.j() : nVar.o();
                    nVar.e(0);
                    i13 = iJ + 1;
                    return i13;
                }
                throw new NumberFormatException(o2.m(j10, "Invalid UTF-8 sequence first byte: "));
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = i14 - 8;
                i11 = NotificationCompat.FLAG_LOCAL_ONLY;
                i13 = i11 << i10;
                return i13;
            default:
                return i13;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar) {
        byte[] bArr = nVar.f26042a;
        if (this.f25237n == null) {
            this.f25237n = new com.fyber.inneractive.sdk.player.exoplayer2.util.f(bArr);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, nVar.f26044c);
            bArrCopyOfRange[4] = -128;
            List listSingletonList = Collections.singletonList(bArrCopyOfRange);
            com.fyber.inneractive.sdk.player.exoplayer2.util.f fVar = this.f25237n;
            int i10 = fVar.f26018c;
            int i11 = fVar.f26016a;
            jVar.f25256a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, MimeTypes.AUDIO_FLAC, -1, i10 * i11, fVar.f26017b, i11, listSingletonList, null, null);
        } else {
            byte b10 = bArr[0];
            if ((b10 & AbstractJsonLexerKt.TC_INVALID) == 3) {
                c cVar = new c(this);
                this.f25238o = cVar;
                nVar.e(nVar.f26043b + 1);
                int iL = nVar.l() / 18;
                cVar.f25232a = new long[iL];
                cVar.f25233b = new long[iL];
                for (int i12 = 0; i12 < iL; i12++) {
                    cVar.f25232a[i12] = nVar.g();
                    cVar.f25233b[i12] = nVar.g();
                    nVar.e(nVar.f26043b + 2);
                }
            } else if (b10 == -1) {
                c cVar2 = this.f25238o;
                if (cVar2 != null) {
                    cVar2.f25234c = j10;
                    jVar.f25257b = cVar2;
                }
                return false;
            }
        }
        return true;
    }
}

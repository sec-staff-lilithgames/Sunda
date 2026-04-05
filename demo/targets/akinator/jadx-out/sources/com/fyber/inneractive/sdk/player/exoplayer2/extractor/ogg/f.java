package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f25240a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25241b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(0, new byte[OggPageHeader.MAX_PAGE_PAYLOAD]);

    /* renamed from: c, reason: collision with root package name */
    public int f25242c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f25243d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25244e;

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f25244e) {
            this.f25244e = false;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f25241b;
            nVar.f26043b = 0;
            nVar.f26044c = 0;
        }
        while (true) {
            if (this.f25244e) {
                return true;
            }
            if (this.f25242c < 0) {
                if (!this.f25240a.a(bVar, true)) {
                    return false;
                }
                g gVar = this.f25240a;
                int i13 = gVar.f25249d;
                if ((gVar.f25246a & 1) == 1 && this.f25241b.f26044c == 0) {
                    this.f25243d = 0;
                    int i14 = 0;
                    do {
                        int i15 = this.f25243d;
                        g gVar2 = this.f25240a;
                        if (i15 >= gVar2.f25248c) {
                            break;
                        }
                        int[] iArr = gVar2.f25251f;
                        this.f25243d = i15 + 1;
                        i12 = iArr[i15];
                        i14 += i12;
                    } while (i12 == 255);
                    i13 += i14;
                    i11 = this.f25243d;
                } else {
                    i11 = 0;
                }
                bVar.a(i13);
                this.f25242c = i11;
            }
            int i16 = this.f25242c;
            this.f25243d = 0;
            int i17 = 0;
            do {
                int i18 = this.f25243d;
                int i19 = i16 + i18;
                g gVar3 = this.f25240a;
                if (i19 >= gVar3.f25248c) {
                    break;
                }
                int[] iArr2 = gVar3.f25251f;
                this.f25243d = i18 + 1;
                i10 = iArr2[i19];
                i17 += i10;
            } while (i10 == 255);
            int i20 = this.f25242c + this.f25243d;
            if (i17 > 0) {
                int iA = this.f25241b.a();
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f25241b;
                int i21 = nVar2.f26044c + i17;
                if (iA < i21) {
                    nVar2.f26042a = Arrays.copyOf(nVar2.f26042a, i21);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f25241b;
                bVar.b(nVar3.f26042a, nVar3.f26044c, i17, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f25241b;
                nVar4.d(nVar4.f26044c + i17);
                this.f25244e = this.f25240a.f25251f[i20 + (-1)] != 255;
            }
            if (i20 == this.f25240a.f25248c) {
                i20 = -1;
            }
            this.f25242c = i20;
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f25241b;
        byte[] bArr = nVar.f26042a;
        if (bArr.length == 65025) {
            return;
        }
        nVar.f26042a = Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, nVar.f26044c));
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f24676e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f24677b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24678c;

    /* renamed from: d, reason: collision with root package name */
    public int f24679d;

    public a(r rVar) {
        super(rVar);
    }

    public final boolean a(n nVar) throws d {
        if (this.f24677b) {
            nVar.e(nVar.f26043b + 1);
        } else {
            int iJ = nVar.j();
            int i10 = (iJ >> 4) & 15;
            this.f24679d = i10;
            if (i10 == 2) {
                this.f24695a.a(o.a(null, MimeTypes.AUDIO_MPEG, -1, -1, 1, f24676e[(iJ >> 2) & 3], null, null, null));
                this.f24678c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f24695a.a(o.a(null, i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW, -1, -1, 1, 8000, (iJ & 1) == 1 ? 2 : 3, -1, -1, null, null, 0, null, null));
                this.f24678c = true;
            } else if (i10 != 10) {
                throw new d("Audio format not supported: " + this.f24679d);
            }
            this.f24677b = true;
        }
        return true;
    }

    public final void a(n nVar, long j10) {
        if (this.f24679d == 2) {
            int i10 = nVar.f26044c - nVar.f26043b;
            this.f24695a.a(i10, nVar);
            this.f24695a.a(j10, 1, i10, 0, null);
            return;
        }
        int iJ = nVar.j();
        if (iJ == 0 && !this.f24678c) {
            int i11 = nVar.f26044c - nVar.f26043b;
            byte[] bArr = new byte[i11];
            nVar.a(bArr, 0, i11);
            Pair pairA = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr);
            this.f24695a.a(o.a(null, MimeTypes.AUDIO_AAC, -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), Collections.singletonList(bArr), null, null));
            this.f24678c = true;
            return;
        }
        if (this.f24679d != 10 || iJ == 1) {
            int i12 = nVar.f26044c - nVar.f26043b;
            this.f24695a.a(i12, nVar);
            this.f24695a.a(j10, 1, i12, 0, null);
        }
    }
}

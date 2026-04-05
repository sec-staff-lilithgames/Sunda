package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f24812g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f24813h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f24814a;

    /* renamed from: b, reason: collision with root package name */
    public final v f24815b;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f24817d;

    /* renamed from: f, reason: collision with root package name */
    public int f24819f;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f24816c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    /* renamed from: e, reason: collision with root package name */
    public byte[] f24818e = new byte[1024];

    public p(String str, v vVar) {
        this.f24814a = str;
        this.f24815b = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f24817d = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(C.TIME_UNSET));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, r, NumberFormatException, EOFException, com.fyber.inneractive.sdk.player.exoplayer2.text.a {
        int iMin;
        Matcher matcher;
        String strC;
        int i10 = (int) bVar.f24648b;
        int i11 = this.f24819f;
        byte[] bArr = this.f24818e;
        if (i11 == bArr.length) {
            this.f24818e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f24818e;
        int i12 = this.f24819f;
        int length = bArr2.length - i12;
        int i13 = bVar.f24652f;
        if (i13 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i13, length);
            System.arraycopy(bVar.f24650d, 0, bArr2, i12, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            iMin = bVar.a(bArr2, i12, length, 0, true);
        }
        if (iMin != -1) {
            bVar.f24649c += iMin;
        }
        if (iMin != -1) {
            int i14 = this.f24819f + iMin;
            this.f24819f = i14;
            if (i10 == -1 || i14 != i10) {
                return 0;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(this.f24818e);
        try {
            Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f25831a;
            String strC2 = nVar.c();
            if (strC2 == null || !com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f25832b.matcher(strC2).matches()) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.text.a("Expected WEBVTT. Got " + strC2);
            }
            long j10 = 0;
            long j11 = 0;
            while (true) {
                String strC3 = nVar.c();
                if (TextUtils.isEmpty(strC3)) {
                    while (true) {
                        String strC4 = nVar.c();
                        if (strC4 == null) {
                            matcher = null;
                            break;
                        }
                        if (com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f25831a.matcher(strC4).matches()) {
                            do {
                                strC = nVar.c();
                                if (strC != null) {
                                }
                            } while (!strC.isEmpty());
                        } else {
                            matcher = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.a.f25830a.matcher(strC4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        this.f24817d.a(0, 3).a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, MimeTypes.TEXT_VTT, 0, this.f24814a, -1, null, 0L, Collections.EMPTY_LIST));
                        this.f24817d.b();
                    } else {
                        long jA = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher.group(1));
                        long jA2 = this.f24815b.a((j11 + jA) - j10);
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = this.f24817d.a(0, 3);
                        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, VPCjETNfjxu.AytdVt, 0, this.f24814a, -1, null, jA2 - jA, Collections.EMPTY_LIST));
                        this.f24817d.b();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f24816c;
                        byte[] bArr3 = this.f24818e;
                        int i15 = this.f24819f;
                        nVar2.f26042a = bArr3;
                        nVar2.f26044c = i15;
                        nVar2.f26043b = 0;
                        gVarA.a(i15, nVar2);
                        gVarA.a(jA2, 1, this.f24819f, 0, (byte[]) null);
                    }
                    return -1;
                }
                if (strC3.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f24812g.matcher(strC3);
                    if (matcher2.find()) {
                        Matcher matcher3 = f24813h.matcher(strC3);
                        if (matcher3.find()) {
                            long jA3 = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher2.group(1));
                            j11 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                            j10 = jA3;
                        } else {
                            throw new r("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strC3));
                        }
                    } else {
                        throw new r("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strC3));
                    }
                }
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.text.a e10) {
            throw new r(e10);
        }
    }
}

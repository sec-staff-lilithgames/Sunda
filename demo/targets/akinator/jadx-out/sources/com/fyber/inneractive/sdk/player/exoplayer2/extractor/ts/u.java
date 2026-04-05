package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* renamed from: d, reason: collision with root package name */
    public boolean f25518d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25519e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25520f;

    /* renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f25521g;

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f25515a = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(0);

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25517c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f25516b = new SparseArray();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        byte[] bArr = new byte[14];
        bVar.a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bVar.a(bArr[13] & 7, false);
        bVar.a(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f25521g = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(C.TIME_UNSET));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f25515a.f26068c = C.TIME_UNSET;
        for (int i10 = 0; i10 < this.f25516b.size(); i10++) {
            t tVar = (t) this.f25516b.valueAt(i10);
            tVar.f25513f = false;
            tVar.f25508a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r15) throws java.lang.InterruptedException, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }
}

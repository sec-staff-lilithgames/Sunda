package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f24729a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f24730b;

    /* renamed from: c, reason: collision with root package name */
    public final o f24731c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] f24732d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f24733e;

    /* renamed from: f, reason: collision with root package name */
    public final y f24734f;

    /* renamed from: g, reason: collision with root package name */
    public final List f24735g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24736h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f24737i;

    /* renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.g f24738j;

    /* renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f24739k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f24740l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f24741m;

    /* renamed from: n, reason: collision with root package name */
    public String f24742n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f24743o;

    /* renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b f24744p;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr, b bVar, o oVar, List list) {
        this.f24733e = kVar;
        this.f24732d = aVarArr;
        this.f24731c = oVar;
        this.f24735g = list;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            oVarArr[i10] = aVarArr[i10].f24821b;
            iArr[i10] = i10;
        }
        this.f24729a = bVar.f24719a.a();
        this.f24730b = bVar.f24719a.a();
        y yVar = new y(oVarArr);
        this.f24734f = yVar;
        this.f24744p = new e(yVar, iArr);
    }

    public final void a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(str.toLowerCase(Locale.getDefault()).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f24740l = uri;
        this.f24741m = bArr;
        this.f24742n = str;
        this.f24743o = bArr2;
    }
}

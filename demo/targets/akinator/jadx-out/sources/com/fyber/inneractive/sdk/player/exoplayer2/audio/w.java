package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import j1.o2;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f24576a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24577b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24578c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24579d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24580e;

    /* renamed from: f, reason: collision with root package name */
    public final short[] f24581f;

    /* renamed from: g, reason: collision with root package name */
    public int f24582g;

    /* renamed from: h, reason: collision with root package name */
    public short[] f24583h;

    /* renamed from: i, reason: collision with root package name */
    public int f24584i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f24585j;

    /* renamed from: k, reason: collision with root package name */
    public int f24586k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f24587l;

    /* renamed from: q, reason: collision with root package name */
    public int f24592q;

    /* renamed from: r, reason: collision with root package name */
    public int f24593r;

    /* renamed from: s, reason: collision with root package name */
    public int f24594s;

    /* renamed from: t, reason: collision with root package name */
    public int f24595t;

    /* renamed from: v, reason: collision with root package name */
    public int f24597v;

    /* renamed from: w, reason: collision with root package name */
    public int f24598w;

    /* renamed from: x, reason: collision with root package name */
    public int f24599x;

    /* renamed from: m, reason: collision with root package name */
    public int f24588m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f24589n = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f24596u = 0;

    /* renamed from: o, reason: collision with root package name */
    public float f24590o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f24591p = 1.0f;

    public w(int i10, int i11) {
        this.f24576a = i10;
        this.f24577b = i11;
        this.f24578c = i10 / 400;
        int i12 = i10 / 65;
        this.f24579d = i12;
        int i13 = i12 * 2;
        this.f24580e = i13;
        this.f24581f = new short[i13];
        this.f24582g = i13;
        int i14 = i11 * i13;
        this.f24583h = new short[i14];
        this.f24584i = i13;
        this.f24585j = new short[i14];
        this.f24586k = i13;
        this.f24587l = new short[i14];
    }

    public final void a(int i10) {
        int i11 = this.f24592q + i10;
        int i12 = this.f24582g;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f24582g = i13;
            this.f24583h = Arrays.copyOf(this.f24583h, i13 * this.f24577b);
        }
    }

    public final void b(int i10) {
        int i11 = this.f24593r + i10;
        int i12 = this.f24584i;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f24584i = i13;
            this.f24585j = Arrays.copyOf(this.f24585j, i13 * this.f24577b);
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f24580e / i11;
        int i13 = this.f24577b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[o2.B(i16, i14, i15, i18)];
            }
            this.f24581f[i16] = (short) (i17 / i14);
        }
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f24577b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f24598w = i15 / i16;
        this.f24599x = i17 / i14;
        return i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0253 A[LOOP:4: B:13:0x0048->B:103:0x0253, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0175 A[EDGE_INSN: B:113:0x0175->B:65:0x0175 BREAK  A[LOOP:4: B:13:0x0048->B:103:0x0253], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.w.a():void");
    }

    public static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) e3.g.e(sArr3[i17], i19, (i10 - i19) * sArr2[i18], i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }
}

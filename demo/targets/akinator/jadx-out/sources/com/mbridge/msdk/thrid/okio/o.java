package com.mbridge.msdk.thrid.okio;

import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f43850a;

    /* renamed from: b, reason: collision with root package name */
    int f43851b;

    /* renamed from: c, reason: collision with root package name */
    int f43852c;

    /* renamed from: d, reason: collision with root package name */
    boolean f43853d;

    /* renamed from: e, reason: collision with root package name */
    boolean f43854e;

    /* renamed from: f, reason: collision with root package name */
    o f43855f;

    /* renamed from: g, reason: collision with root package name */
    o f43856g;

    public o() {
        this.f43850a = new byte[Segment.SIZE];
        this.f43854e = true;
        this.f43853d = false;
    }

    public final o a(o oVar) {
        oVar.f43856g = this;
        oVar.f43855f = this.f43855f;
        this.f43855f.f43856g = oVar;
        this.f43855f = oVar;
        return oVar;
    }

    public final o b() {
        o oVar = this.f43855f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f43856g;
        oVar3.f43855f = oVar;
        this.f43855f.f43856g = oVar3;
        this.f43855f = null;
        this.f43856g = null;
        return oVar2;
    }

    public final o c() {
        this.f43853d = true;
        return new o(this.f43850a, this.f43851b, this.f43852c, true, false);
    }

    public o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f43850a = bArr;
        this.f43851b = i10;
        this.f43852c = i11;
        this.f43853d = z10;
        this.f43854e = z11;
    }

    public final o a(int i10) {
        o oVarA;
        if (i10 > 0 && i10 <= this.f43852c - this.f43851b) {
            if (i10 >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.f43850a, this.f43851b, oVarA.f43850a, 0, i10);
            }
            oVarA.f43852c = oVarA.f43851b + i10;
            this.f43851b += i10;
            this.f43856g.a(oVarA);
            return oVarA;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        o oVar = this.f43856g;
        if (oVar != this) {
            if (oVar.f43854e) {
                int i10 = this.f43852c - this.f43851b;
                if (i10 > (8192 - oVar.f43852c) + (oVar.f43853d ? 0 : oVar.f43851b)) {
                    return;
                }
                a(oVar, i10);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(o oVar, int i10) {
        if (oVar.f43854e) {
            int i11 = oVar.f43852c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!oVar.f43853d) {
                    int i13 = oVar.f43851b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = oVar.f43850a;
                        System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
                        oVar.f43852c -= oVar.f43851b;
                        oVar.f43851b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f43850a, this.f43851b, oVar.f43850a, oVar.f43852c, i10);
            oVar.f43852c += i10;
            this.f43851b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}

package me;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f74347a;

    /* renamed from: b, reason: collision with root package name */
    public int f74348b;

    /* renamed from: c, reason: collision with root package name */
    public int f74349c;

    /* renamed from: d, reason: collision with root package name */
    public long f74350d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74351e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f74352f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f74353g;

    /* renamed from: h, reason: collision with root package name */
    public int f74354h;

    /* renamed from: i, reason: collision with root package name */
    public int f74355i;

    public b(v0 v0Var, v0 v0Var2, boolean z10) throws h2 {
        this.f74353g = v0Var;
        this.f74352f = v0Var2;
        this.f74351e = z10;
        v0Var2.setPosition(12);
        this.f74347a = v0Var2.readUnsignedIntToInt();
        v0Var.setPosition(12);
        this.f74355i = v0Var.readUnsignedIntToInt();
        ee.t.checkContainerInput(v0Var.readInt() == 1, "first_chunk must be 1");
        this.f74348b = -1;
    }

    public boolean moveNext() {
        int i10 = this.f74348b + 1;
        this.f74348b = i10;
        if (i10 == this.f74347a) {
            return false;
        }
        boolean z10 = this.f74351e;
        v0 v0Var = this.f74352f;
        this.f74350d = z10 ? v0Var.readUnsignedLongToLong() : v0Var.readUnsignedInt();
        if (this.f74348b == this.f74354h) {
            v0 v0Var2 = this.f74353g;
            this.f74349c = v0Var2.readUnsignedIntToInt();
            v0Var2.skipBytes(4);
            int i11 = this.f74355i - 1;
            this.f74355i = i11;
            this.f74354h = i11 > 0 ? v0Var2.readUnsignedIntToInt() - 1 : -1;
        }
        return true;
    }
}

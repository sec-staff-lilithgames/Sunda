package com.google.android.exoplayer2.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f28544a;

    /* renamed from: b, reason: collision with root package name */
    public int f28545b;

    /* renamed from: c, reason: collision with root package name */
    public float f28546c;

    /* renamed from: d, reason: collision with root package name */
    public long f28547d;

    public q(int i10, int i11) {
        this.f28544a = i10;
        this.f28545b = i11;
        this.f28546c = 1.0f;
    }

    public r build() {
        return new r(this.f28544a, this.f28545b, this.f28546c, this.f28547d);
    }

    public q setHeight(int i10) {
        this.f28545b = i10;
        return this;
    }

    public q setOffsetToAddUs(long j10) {
        this.f28547d = j10;
        return this;
    }

    public q setPixelWidthHeightRatio(float f10) {
        this.f28546c = f10;
        return this;
    }

    public q setWidth(int i10) {
        this.f28544a = i10;
        return this;
    }

    public q(r rVar) {
        this.f28544a = rVar.f28549a;
        this.f28545b = rVar.f28550b;
        this.f28546c = rVar.f28551c;
        this.f28547d = rVar.f28552d;
    }
}

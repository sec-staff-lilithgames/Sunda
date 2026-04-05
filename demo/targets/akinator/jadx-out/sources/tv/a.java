package tv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements w {

    /* renamed from: b, reason: collision with root package name */
    public final w f87421b;

    /* renamed from: c, reason: collision with root package name */
    public final long f87422c;

    public a(w mark, long j10, kotlin.jvm.internal.u uVar) {
        e0.checkNotNullParameter(mark, "mark");
        this.f87421b = mark;
        this.f87422c = j10;
    }

    @Override // tv.w
    /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
    public long mo7144elapsedNowUwyO8pc() {
        return f.m7207minusLRDsOJo(this.f87421b.mo7144elapsedNowUwyO8pc(), this.f87422c);
    }

    /* renamed from: getAdjustment-UwyO8pc, reason: not valid java name */
    public final long m7145getAdjustmentUwyO8pc() {
        return this.f87422c;
    }

    public final w getMark() {
        return this.f87421b;
    }

    @Override // tv.w
    public boolean hasNotPassedNow() {
        return v.hasNotPassedNow(this);
    }

    @Override // tv.w
    public boolean hasPassedNow() {
        return v.hasPassedNow(this);
    }

    @Override // tv.w
    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public w mo7146minusLRDsOJo(long j10) {
        return v.m7234minusLRDsOJo(this, j10);
    }

    @Override // tv.w
    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public w mo7147plusLRDsOJo(long j10) {
        return new a(this.f87421b, f.m7208plusLRDsOJo(this.f87422c, j10), null);
    }
}

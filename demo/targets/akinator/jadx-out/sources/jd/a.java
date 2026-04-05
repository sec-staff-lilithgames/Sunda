package jd;

import cv.BLca.YsiBvdpw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f69489a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f69490b;

    /* renamed from: c, reason: collision with root package name */
    public final h f69491c;

    /* renamed from: d, reason: collision with root package name */
    public final i f69492d;

    /* renamed from: e, reason: collision with root package name */
    public final g f69493e;

    public a(Integer num, Object obj, h hVar, i iVar, g gVar) {
        this.f69489a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f69490b = obj;
        this.f69491c = hVar;
        this.f69492d = iVar;
        this.f69493e = gVar;
    }

    public boolean equals(Object obj) {
        i iVar;
        g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            Integer num = this.f69489a;
            if (num != null ? num.equals(fVar.getCode()) : fVar.getCode() == null) {
                if (this.f69490b.equals(fVar.getPayload()) && this.f69491c.equals(fVar.getPriority()) && ((iVar = this.f69492d) != null ? iVar.equals(fVar.getProductData()) : fVar.getProductData() == null) && ((gVar = this.f69493e) != null ? gVar.equals(fVar.getEventContext()) : fVar.getEventContext() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // jd.f
    public Integer getCode() {
        return this.f69489a;
    }

    @Override // jd.f
    public g getEventContext() {
        return this.f69493e;
    }

    @Override // jd.f
    public Object getPayload() {
        return this.f69490b;
    }

    @Override // jd.f
    public h getPriority() {
        return this.f69491c;
    }

    @Override // jd.f
    public i getProductData() {
        return this.f69492d;
    }

    public int hashCode() {
        Integer num = this.f69489a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f69490b.hashCode()) * 1000003) ^ this.f69491c.hashCode()) * 1000003;
        i iVar = this.f69492d;
        int iHashCode2 = (iHashCode ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        g gVar = this.f69493e;
        return (gVar != null ? gVar.hashCode() : 0) ^ iHashCode2;
    }

    public String toString() {
        return "Event{code=" + this.f69489a + ", payload=" + this.f69490b + ", priority=" + this.f69491c + ", productData=" + this.f69492d + ", eventContext=" + this.f69493e + YsiBvdpw.akOmIXOW;
    }
}

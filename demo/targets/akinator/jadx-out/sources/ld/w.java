package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f73315a;

    public w(Integer num) {
        this.f73315a = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        Integer num = this.f73315a;
        Integer originAssociatedProductId = ((m0) obj).getOriginAssociatedProductId();
        return num == null ? originAssociatedProductId == null : num.equals(originAssociatedProductId);
    }

    @Override // ld.m0
    public Integer getOriginAssociatedProductId() {
        return this.f73315a;
    }

    public int hashCode() {
        Integer num = this.f73315a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f73315a + "}";
    }
}

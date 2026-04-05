package jd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f69500a;

    public d(Integer num) {
        this.f69500a = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        Integer num = this.f69500a;
        Integer productId = ((i) obj).getProductId();
        return num == null ? productId == null : num.equals(productId);
    }

    @Override // jd.i
    public Integer getProductId() {
        return this.f69500a;
    }

    public int hashCode() {
        Integer num = this.f69500a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f69500a + "}";
    }
}

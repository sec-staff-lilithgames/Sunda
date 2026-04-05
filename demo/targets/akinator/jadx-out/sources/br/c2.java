package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c2 extends e1 {

    /* renamed from: c, reason: collision with root package name */
    public final String f9778c;

    /* renamed from: d, reason: collision with root package name */
    public final f1 f9779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(String url, f1 deliveryType) {
        super(deliveryType, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(deliveryType, "deliveryType");
        this.f9778c = url;
        this.f9779d = deliveryType;
    }

    public static /* synthetic */ c2 copy$default(c2 c2Var, String str, f1 f1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c2Var.f9778c;
        }
        if ((i10 & 2) != 0) {
            f1Var = c2Var.getDeliveryType();
        }
        return c2Var.copy(str, f1Var);
    }

    public final String component1() {
        return this.f9778c;
    }

    public final f1 component2() {
        return getDeliveryType();
    }

    public final c2 copy(String url, f1 deliveryType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(deliveryType, "deliveryType");
        return new c2(url, deliveryType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f9778c, c2Var.f9778c) && getDeliveryType() == c2Var.getDeliveryType();
    }

    @Override // br.e1
    public f1 getDeliveryType() {
        return this.f9779d;
    }

    public final String getUrl() {
        return this.f9778c;
    }

    public int hashCode() {
        return getDeliveryType().hashCode() + (this.f9778c.hashCode() * 31);
    }

    public String toString() {
        return "UrlMediaSource(url=" + this.f9778c + ", deliveryType=" + getDeliveryType() + ')';
    }
}

package em;

import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final Waterfall.Result.EstimatedPrice f54787a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54788b;

    public x(Waterfall.Result.EstimatedPrice estimatedPrice, String str) {
        this.f54787a = estimatedPrice;
        this.f54788b = str;
    }

    public String getAdResponse() {
        return this.f54788b;
    }

    public Waterfall.Result.EstimatedPrice getPrice() {
        return this.f54787a;
    }
}

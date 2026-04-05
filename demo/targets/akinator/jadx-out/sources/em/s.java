package em;

import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class s {
    public static String toString(Waterfall.Configuration.AdUnit adUnit) {
        return "adUnitId - " + adUnit.getAdUnitId() + ", price - " + adUnit.getPrice();
    }

    public static String toString(Waterfall.Result.AdUnit adUnit) {
        return "adUnitId - " + adUnit.getAdUnitId() + ", price - " + adUnit.getPrice() + ", status - " + adUnit.getStatus();
    }

    public static String toString(Waterfall.Result.EstimatedPrice estimatedPrice) {
        if (estimatedPrice == null) {
            return "estimated price - null";
        }
        return "estimated price - " + estimatedPrice.getValue().getValue() + " " + estimatedPrice.getCurrency().getValue() + ", precision - " + estimatedPrice.getPrecision().getValue();
    }
}

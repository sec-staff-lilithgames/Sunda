package com.vungle.ads.internal.load;

import com.vungle.ads.VungleAdSize;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import java.io.Serializable;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdRequest implements Serializable {
    private final BidPayload adMarkup;
    private final Placement placement;
    private final VungleAdSize requestAdSize;

    public AdRequest(Placement placement, BidPayload bidPayload, VungleAdSize vungleAdSize) {
        e0.checkNotNullParameter(placement, "placement");
        this.placement = placement;
        this.adMarkup = bidPayload;
        this.requestAdSize = vungleAdSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.areEqual(AdRequest.class, obj.getClass())) {
            AdRequest adRequest = (AdRequest) obj;
            if (!e0.areEqual(this.placement.getReferenceId(), adRequest.placement.getReferenceId()) || !e0.areEqual(this.requestAdSize, adRequest.requestAdSize)) {
                return false;
            }
            BidPayload bidPayload = this.adMarkup;
            BidPayload bidPayload2 = adRequest.adMarkup;
            if (bidPayload != null) {
                return e0.areEqual(bidPayload, bidPayload2);
            }
            if (bidPayload2 == null) {
                return true;
            }
        }
        return false;
    }

    public final BidPayload getAdMarkup() {
        return this.adMarkup;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final VungleAdSize getRequestAdSize() {
        return this.requestAdSize;
    }

    public int hashCode() {
        int iHashCode = this.placement.getReferenceId().hashCode() * 31;
        VungleAdSize vungleAdSize = this.requestAdSize;
        int iHashCode2 = (iHashCode + (vungleAdSize != null ? vungleAdSize.hashCode() : 0)) * 31;
        BidPayload bidPayload = this.adMarkup;
        return iHashCode2 + (bidPayload != null ? bidPayload.hashCode() : 0);
    }

    public String toString() {
        return "AdRequest{placementId='" + this.placement.getReferenceId() + "', adMarkup=" + this.adMarkup + ", requestAdSize=" + this.requestAdSize + AbstractJsonLexerKt.END_OBJ;
    }
}

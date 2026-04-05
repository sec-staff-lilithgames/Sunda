package om;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {
    public static HeaderBiddingAd a(Ad ad2) {
        if (ad2.hasDisplay()) {
            Ad.Display display = ad2.getDisplay();
            headerBiddingAdB = display.hasBanner() ? b(display.getBanner().getExtProtoList()) : null;
            if (headerBiddingAdB == null && display.hasNative()) {
                headerBiddingAdB = b(display.getNative().getExtProtoList());
            }
        }
        return (headerBiddingAdB == null && ad2.hasVideo()) ? b(ad2.getVideo().getExtProtoList()) : headerBiddingAdB;
    }

    public static HeaderBiddingAd b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Any any = (Any) it.next();
            if (any.is(HeaderBiddingAd.class)) {
                try {
                    return (HeaderBiddingAd) any.unpack(HeaderBiddingAd.class);
                } catch (InvalidProtocolBufferException e10) {
                    nm.a.w(e10);
                }
            }
        }
        return null;
    }
}

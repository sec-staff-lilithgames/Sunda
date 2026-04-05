package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 implements up.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f60572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f60573b;

    /* renamed from: c, reason: collision with root package name */
    public final double f60574c;

    /* renamed from: d, reason: collision with root package name */
    public final String f60575d;

    /* renamed from: e, reason: collision with root package name */
    public final String f60576e;

    /* renamed from: f, reason: collision with root package name */
    public final String f60577f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f60578g;

    /* renamed from: h, reason: collision with root package name */
    public final String f60579h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f60580i;

    /* renamed from: j, reason: collision with root package name */
    public final CreativeFormat f60581j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f60582k;

    public k0(AdsType adsType, Response.Seatbid seatbid, Response.Seatbid.Bid bid, Ad ad2, NetworkAdapter networkAdapter, AdExtension adExtension) {
        Map<String, String> clientParamsMap;
        this.f60572a = bid.getId();
        this.f60573b = seatbid.getSeat();
        this.f60574c = bid.getPrice();
        this.f60575d = bid.getDeal();
        this.f60576e = ad2.getId();
        this.f60577f = bid.getCid();
        CreativeFormat creativeFormat = null;
        if (ad2.getAdomainCount() > 0) {
            this.f60578g = (String[]) ad2.getAdomainList().toArray(new String[0]);
        } else {
            this.f60578g = null;
        }
        HashMap map = new HashMap();
        if (adExtension != null) {
            try {
                map.putAll(adExtension.getCustomParamsMap());
            } catch (Exception unused) {
            }
        }
        this.f60582k = map;
        this.f60579h = networkAdapter.getKey();
        HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = adsType.obtainHeaderBiddingAd(ad2);
        HashMap map2 = new HashMap();
        if (headerBiddingAdObtainHeaderBiddingAd != null && (clientParamsMap = headerBiddingAdObtainHeaderBiddingAd.getClientParamsMap()) != null) {
            map2.putAll(clientParamsMap);
        }
        this.f60580i = map2;
        if (ad2.hasDisplay()) {
            Ad.Display display = ad2.getDisplay();
            if (display.hasBanner() || !TextUtils.isEmpty(display.getAdm())) {
                creativeFormat = CreativeFormat.Banner;
            } else if (display.hasNative()) {
                creativeFormat = CreativeFormat.Native;
            }
        } else if (ad2.hasVideo()) {
            creativeFormat = CreativeFormat.Video;
        }
        this.f60581j = creativeFormat;
    }

    @Override // up.c
    public String[] getAdDomains() {
        return this.f60578g;
    }

    @Override // up.c
    public String getCid() {
        return this.f60577f;
    }

    @Override // up.c
    public CreativeFormat getCreativeFormat() {
        return this.f60581j;
    }

    @Override // up.c
    public String getCreativeId() {
        return this.f60576e;
    }

    @Override // up.c
    public Map<String, String> getCustomParams() {
        return this.f60582k;
    }

    @Override // up.c
    public String getDeal() {
        return this.f60575d;
    }

    @Override // up.c
    public String getDemandSource() {
        return this.f60573b;
    }

    @Override // up.c
    public String getId() {
        return this.f60572a;
    }

    @Override // up.c
    public String getNetworkKey() {
        return this.f60579h;
    }

    @Override // up.c
    public Map<String, String> getNetworkParams() {
        return this.f60580i;
    }

    @Override // up.c
    public double getPrice() {
        return this.f60574c;
    }

    public String toString() {
        return "id=" + this.f60572a + ", demandSource=" + this.f60573b + ", price=" + this.f60574c + ", creativeId=" + this.f60576e + ", cid=" + this.f60577f;
    }
}

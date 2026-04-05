package om;

import android.text.TextUtils;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineTrackingObject;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.sdk.Placement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final AdContentType f79572a;

    public l(AdContentType adContentType) {
        this.f79572a = adContentType;
    }

    public static Placement c(AdPlacementConfig adPlacementConfig, HeaderBiddingPlacement.Builder builder) {
        Placement.Builder builderNewBuilder = Placement.newBuilder();
        builderNewBuilder.setAdType(adPlacementConfig.getAdsFormat().getAdsType().getName());
        String placementId = adPlacementConfig.getPlacementId();
        if (!TextUtils.isEmpty(placementId)) {
            builderNewBuilder.setPlacementId(StringValue.of(placementId));
        }
        nm.j.ifNotNull(adPlacementConfig.getCustomParams(), new b3(builderNewBuilder, 3));
        if (builder != null) {
            builderNewBuilder.setHbPlacement(builder);
        }
        return builderNewBuilder.build();
    }

    public final c a(Ad ad2) {
        HeaderBiddingAd headerBiddingAdA = f.a(ad2);
        if (headerBiddingAdA == null) {
            return null;
        }
        c cVar = new c(ad2);
        cVar.getData().putAll(headerBiddingAdA.getClientParamsMap());
        cVar.getData().putAll(headerBiddingAdA.getServerParamsMap());
        return cVar;
    }

    public final HeaderBiddingPlacement.Builder b(ContextProvider contextProvider, hr.d dVar, AdsType adsType, Collection collection, List list, int i10) {
        AdContentType adContentType = getAdContentType();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            NetworkConfig networkConfig = (NetworkConfig) it.next();
            NetworkAdapter adapter = NetworkRegistry.getAdapter(networkConfig.getNetworkKey());
            if ((adapter instanceof HeaderBiddingAdapter) && adapter.isInitialized(contextProvider)) {
                for (NetworkAdUnit networkAdUnit : networkConfig.createNetworkAdUnitList(adsType, dVar, adContentType, adapter)) {
                    list.add(networkAdUnit);
                    arrayList.add(new e(contextProvider, (HeaderBiddingAdapter) adapter, adsType, adContentType, dVar, networkAdUnit));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        BidMachineTrackingObject bidMachineTrackingObject = new BidMachineTrackingObject();
        bidMachineTrackingObject.eventStart(TrackEventType.HeaderBiddingNetworksPrepare);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((e) it2.next()).a(countDownLatch);
            }
            try {
                countDownLatch.await(i10 > 0 ? i10 : 10L, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                nm.a.w(e10);
            }
            Iterator it3 = arrayList.iterator();
            ArrayList arrayList2 = null;
            while (it3.hasNext()) {
                e eVar = (e) it3.next();
                HeaderBiddingPlacement.AdUnit adUnit = eVar.f79560k;
                if (adUnit != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(adUnit);
                } else {
                    boolean z10 = eVar.f79561l;
                    if (!z10 && !z10) {
                        nm.a.d(eVar.f79553c.getKey(), new d(eVar, 0));
                        eVar.f79561l = true;
                        eVar.f79559j.countDown();
                    }
                }
            }
            if (nm.j.isEmpty(arrayList2)) {
                return null;
            }
            HeaderBiddingPlacement.Builder builderNewBuilder = HeaderBiddingPlacement.newBuilder();
            builderNewBuilder.addAllAdUnits(arrayList2);
            return builderNewBuilder;
        } finally {
            bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworksPrepare, adsType, (gr.a) null, (pr.a) null);
        }
    }

    public abstract up.b createAdObjectParams(Ad ad2);

    @Deprecated
    public Message.Builder createPlacement(ContextProvider contextProvider, hr.d dVar, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, int i10) throws Exception {
        return createPlacement(contextProvider, dVar, adsType, collection, list, null, i10);
    }

    public abstract Message.Builder createPlacement(ContextProvider contextProvider, hr.d dVar, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, AdPlacementConfig adPlacementConfig, int i10) throws Exception;

    public AdContentType getAdContentType() {
        return this.f79572a;
    }

    public HeaderBiddingAd obtainHeaderBiddingAd(Ad ad2) {
        return f.a(ad2);
    }
}

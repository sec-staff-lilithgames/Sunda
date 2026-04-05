package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import hr.d;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.ApiRequest;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.protobuf.ResponsePayload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class AdRequest<SelfType extends AdRequest, AdRequestParametersType extends AdRequestParameters, UnifiedAdRequestParamsType extends hr.d> {
    List<AdRequestListener<SelfType>> adRequestListeners;
    private final AdRequestParametersType adRequestParameters;
    n adResponse;
    private final q adResponseLoader;
    final Queue<String> auctionUrlQueue;

    /* renamed from: id, reason: collision with root package name */
    private final String f59824id;
    List<i> internalAdRequestListeners;
    private final AtomicBoolean isApiRequestCanceled;
    private final AtomicBoolean isApiRequestCompleted;
    private final AtomicBoolean isDestroyed;
    private final AtomicBoolean isLoading;
    private final AtomicBoolean isRequestExpired;
    private NetworkAdUnitManager networkAdUnitManager;
    private final pr.n tag = new pr.n("AdRequest");
    private final Runnable timeOutRunnable;
    private final BidMachineTrackingObject trackingObject;
    private UnifiedAdRequestParamsType unifiedAdRequestParams;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class AdRequestBuilderImpl<SelfType extends up.n, ReturnType extends AdRequest<ReturnType, AdRequestParametersType, ?>, AdRequestParametersType extends AdRequestParameters> implements up.n {
        ResponsePayload bidPayload;
        CustomParams customParams;
        AdRequestListener<ReturnType> listener;
        List<NetworkConfig> networkConfigList;
        String placementId;
        PriceFloorParams priceFloorParams;
        TargetingParams targetingParams;
        Integer timeOutMs;

        private void fillAdRequestParameters(AdRequestParametersType adrequestparameterstype) {
            adrequestparameterstype.setAdPlacementConfig(new AdPlacementConfig.Builder(adrequestparameterstype.getAdsFormat()).withPlacementId(this.placementId).withCustomParams(this.customParams).build());
            adrequestparameterstype.setPriceFloorParams(this.priceFloorParams);
            adrequestparameterstype.setTargetingParams(this.targetingParams);
            adrequestparameterstype.setNetworkConfigList(this.networkConfigList);
            adrequestparameterstype.setTimeOutMs(this.timeOutMs);
            adrequestparameterstype.setBidPayload(this.bidPayload);
        }

        @Override // up.n
        public ReturnType build() {
            Value value;
            ResponsePayload responsePayload = this.bidPayload;
            BidMachineTrackingObject bidMachineTrackingObject = u1.f62026a;
            AdRequest adRequest = null;
            if (responsePayload != null) {
                try {
                    value = responsePayload.getResponseCache().getResponse().getExt().getFieldsMap().get("tokenHashValue");
                } catch (Throwable unused) {
                }
                String stringValue = value == null ? null : value.getStringValue();
                nm.a.d("BidTokenManager", new m0(stringValue, 5));
                if (!TextUtils.isEmpty(stringValue)) {
                    BidToken bidTokenD = u1.d(stringValue);
                    if (bidTokenD == null) {
                        nm.a.d("BidTokenManager", new m0(stringValue, 6));
                    } else {
                        adRequest = bidTokenD.getAdRequest();
                    }
                }
            }
            if (adRequest == null) {
                adRequest = (ReturnType) build(createAdRequestParameters());
            }
            fillAdRequestParameters(adRequest.getAdRequestParameters());
            adRequest.addListener(this.listener);
            return (ReturnType) adRequest;
        }

        public abstract ReturnType build(AdRequestParametersType adrequestparameterstype);

        public abstract AdRequestParametersType createAdRequestParameters();

        public void fillNetworkConfigs(List<NetworkConfig> list) {
            if (list == null) {
                this.networkConfigList = new ArrayList();
            } else {
                this.networkConfigList = list;
            }
        }

        @Override // up.n
        public SelfType setBidPayload(String str) {
            if (str == null) {
                this.bidPayload = null;
                return this;
            }
            try {
                this.bidPayload = ResponsePayload.parseFrom(Base64.decode(str, 0));
            } catch (Throwable th2) {
                nm.a.w(th2);
            }
            if (this.bidPayload == null) {
                this.bidPayload = ResponsePayload.getDefaultInstance();
            }
            return this;
        }

        @Override // up.n
        public SelfType setCustomParams(CustomParams customParams) {
            this.customParams = customParams;
            return this;
        }

        @Override // up.n
        public SelfType setListener(AdRequestListener<ReturnType> adRequestListener) {
            this.listener = adRequestListener;
            return this;
        }

        @Override // up.n
        public SelfType setLoadingTimeOut(Integer num) {
            this.timeOutMs = num;
            return this;
        }

        @Override // up.n
        public SelfType setNetworks(List<NetworkConfig> list) {
            fillNetworkConfigs(list);
            return this;
        }

        @Override // up.n
        public SelfType setPlacementId(String str) {
            this.placementId = str;
            return this;
        }

        @Override // up.n
        public SelfType setPriceFloorParams(PriceFloorParams priceFloorParams) {
            this.priceFloorParams = priceFloorParams;
            return this;
        }

        @Override // up.n
        public SelfType setTargetingParams(TargetingParams targetingParams) {
            this.targetingParams = targetingParams;
            return this;
        }

        @Override // up.n
        public SelfType setNetworks(String str) throws JSONException {
            ArrayList arrayList = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            NetworkConfig networkConfigB = j3.b(n1.a().f61933p, jSONArray.getJSONObject(i10));
                            if (networkConfigB != null) {
                                arrayList2.add(networkConfigB);
                            }
                        }
                        arrayList = arrayList2;
                    } catch (Exception e10) {
                        e = e10;
                        arrayList = arrayList2;
                        nm.a.w(e);
                        fillNetworkConfigs(arrayList);
                        return this;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            fillNetworkConfigs(arrayList);
            return this;
        }

        @Override // up.n
        @Deprecated
        public SelfType setSessionAdParams(SessionAdParams sessionAdParams) {
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdRequestListener<AdRequestType extends AdRequest> {
        void onRequestExpired(AdRequestType adrequesttype);

        void onRequestFailed(AdRequestType adrequesttype, pr.a aVar);

        void onRequestSuccess(AdRequestType adrequesttype, up.c cVar);
    }

    public AdRequest(AdRequestParametersType adrequestparameterstype) {
        String string = UUID.randomUUID().toString();
        this.f59824id = string;
        this.isLoading = new AtomicBoolean(false);
        this.isApiRequestCanceled = new AtomicBoolean(false);
        this.isApiRequestCompleted = new AtomicBoolean(false);
        this.isRequestExpired = new AtomicBoolean(false);
        this.isDestroyed = new AtomicBoolean(false);
        this.timeOutRunnable = new d(this);
        this.trackingObject = new e(this, string);
        this.adRequestParameters = adrequestparameterstype;
        this.adResponseLoader = new q(string);
        this.auctionUrlQueue = new LinkedList();
    }

    private boolean canProcessApiRequestResult() {
        return (isCompleted() || isCanceled() || isDestroyed()) ? false : true;
    }

    private boolean canSendApiRequest() {
        return !isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$collectNetworkConfig$0(NetworkConfig networkConfig, String str) {
        return w0.i.d(networkConfig.getNetworkKey(), " was removed from AdRequest: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$destroy$3() {
        return "destroy";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$log$7(rr.b bVar) {
        return String.format("%s - %s", this.adRequestParameters.getAdsType(), bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$logError$8(rr.b bVar) {
        return String.format("%s - %s", this.adRequestParameters.getAdsType(), bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$notifyMediationLoss$2(String str, Double d10) {
        return "notifyMediationLoss (winnerNetworkName - " + str + ", winnerNetworkPrice - " + d10 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$notifyMediationWin$1() {
        return "notifyMediationWin";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processApiRequestSuccess$5(n nVar) {
        return String.format("Request success - %s", nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processExpired$4() {
        return "Request expired";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processRequestFail$6(pr.a aVar) {
        return String.format("Request fail - %s", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(rr.b bVar) {
        nm.a.d(this.tag, new a(this, bVar, 0));
    }

    private void logError(rr.b bVar) {
        nm.a.e(this.tag, new a(this, bVar, 1));
    }

    private NetworkAdUnitManager obtainNetworkAdUnitManager() {
        if (this.networkAdUnitManager == null) {
            this.networkAdUnitManager = new NetworkAdUnitManager();
        }
        return this.networkAdUnitManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processApiRequestCancel() {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCanceled.set(true);
            unsubscribeTimeOut();
            this.trackingObject.eventFinish(TrackEventType.AuctionRequestCancel, getAdsType(), (gr.a) null, (pr.a) null);
            this.trackingObject.clearEvent(TrackEventType.AuctionRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRequestObject(Context context) {
        prepareUrls();
        Object objBuild = build(context);
        if (objBuild instanceof Request) {
            processRequestBuilder(new ApiRequest.Builder().setRequestData((Request) objBuild).setDataBinder(getAdsType().getBinder()), pollUrl());
        } else {
            processRequestFail(objBuild instanceof pr.a ? (pr.a) objBuild : pr.a.internal("Failed to create ad request"));
        }
    }

    private void setLoading(boolean z10) {
        this.isLoading.set(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void subscribeTimeOut() {
        int iObtainTimeOutMs = obtainTimeOutMs();
        if (iObtainTimeOutMs > 0) {
            nm.j.onBackgroundThread(this.timeOutRunnable, iObtainTimeOutMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unsubscribeTimeOut() {
        nm.j.cancelBackgroundThreadTask(this.timeOutRunnable);
    }

    public void addInternalListener(i iVar) {
        if (iVar != null) {
            if (this.internalAdRequestListeners == null) {
                this.internalAdRequestListeners = new CopyOnWriteArrayList();
            }
            this.internalAdRequestListeners.add(iVar);
        }
    }

    public void addListener(AdRequestListener<SelfType> adRequestListener) {
        if (adRequestListener != null) {
            if (this.adRequestListeners == null) {
                this.adRequestListeners = new CopyOnWriteArrayList();
            }
            this.adRequestListeners.add(adRequestListener);
        }
    }

    public Object build(Context context) {
        try {
            String str = n1.a().f61934q;
            if (TextUtils.isEmpty(str)) {
                return pr.a.notFound("SellerId");
            }
            n1 n1VarA = n1.a();
            SessionManager sessionManager = SessionManager.get();
            d0.b(context);
            TargetingParams targetingParams = (TargetingParams) up.o.resolveParams(this.adRequestParameters.getTargetingParams(), n1VarA.f61935r);
            f4 f4Var = n1VarA.f61923f;
            PriceFloorParams priceFloorParams = this.adRequestParameters.getPriceFloorParams();
            Map<String, Double> priceFloors = (priceFloorParams == null || priceFloorParams.getPriceFloors().isEmpty()) ? n1VarA.f61924g.getPriceFloors() : priceFloorParams.getPriceFloors();
            if (priceFloors.isEmpty()) {
                return pr.a.notFound("PriceFloors");
            }
            Request.Builder builderNewBuilder = Request.newBuilder();
            Request.Item.Builder builderNewBuilder2 = Request.Item.newBuilder();
            builderNewBuilder2.setId(UUID.randomUUID().toString());
            builderNewBuilder2.setQty(1);
            for (Map.Entry<String, Double> entry : priceFloors.entrySet()) {
                Request.Item.Deal.Builder builderNewBuilder3 = Request.Item.Deal.newBuilder();
                builderNewBuilder3.setId(entry.getKey());
                builderNewBuilder3.setFlr(entry.getValue().doubleValue());
                builderNewBuilder3.setFlrcur("USD");
                builderNewBuilder2.addDeal(builderNewBuilder3);
            }
            builderNewBuilder.setContext(Any.pack(RequestDataRetriever.collectContext(context, n1VarA, f4Var, targetingParams, null, getAdsType())));
            builderNewBuilder.setTest(n1VarA.f61937t);
            builderNewBuilder.addCur("USD");
            builderNewBuilder.setAt(2);
            builderNewBuilder.setTmax(10000);
            Placement.Builder builderNewBuilder4 = Placement.newBuilder();
            builderNewBuilder4.setSsai(0);
            builderNewBuilder4.setSdk(BidMachine.NAME);
            builderNewBuilder4.setSdkver("3.4.0");
            builderNewBuilder4.setSecure(!nm.j.canUseCleartextTraffic());
            for (Message.Builder builder : collectPlacementFormats(context, null, this.adRequestParameters.getAdPlacementConfig())) {
                if (builder instanceof Placement.DisplayPlacement.Builder) {
                    Placement.DisplayPlacement.Builder builder2 = (Placement.DisplayPlacement.Builder) builder;
                    onBeforeSetDisplayPlacementBuilder(builder2);
                    builderNewBuilder4.setDisplay(builder2);
                } else {
                    if (!(builder instanceof Placement.VideoPlacement.Builder)) {
                        throw new IllegalArgumentException("Unsupported display type: " + builder);
                    }
                    Placement.VideoPlacement.Builder builder3 = (Placement.VideoPlacement.Builder) builder;
                    onBeforeSetVideoPlacementBuilder(builder3);
                    builderNewBuilder4.setVideo(builder3);
                }
            }
            Struct.Builder builderNewBuilder5 = Struct.newBuilder();
            fn.t.fillExtension(builderNewBuilder5);
            ListValue.Builder builderNewBuilder6 = ListValue.newBuilder();
            Iterator it = t.get().a(this.adRequestParameters).iterator();
            while (it.hasNext()) {
                builderNewBuilder6.addValues(((n) it.next()).b());
            }
            if (builderNewBuilder6.getValuesCount() > 0) {
                builderNewBuilder5.putFields("bid_cache", Value.newBuilder().setListValue(builderNewBuilder6).build());
            }
            if (builderNewBuilder5.getFieldsCount() > 0) {
                builderNewBuilder4.setExt(builderNewBuilder5);
            }
            onBuildPlacement(builderNewBuilder4);
            builderNewBuilder2.setSpec(Any.pack(builderNewBuilder4.build()));
            builderNewBuilder.addItem(builderNewBuilder2.build());
            Struct.Builder builderNewBuilder7 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(context);
            if (privateStruct != null) {
                builderNewBuilder7.putAllFields(privateStruct.getFieldsMap());
            }
            if (builderNewBuilder7.getFieldsCount() > 0) {
                builderNewBuilder.setExt(builderNewBuilder7.build());
            }
            RequestExtension.Builder builderNewBuilder8 = RequestExtension.newBuilder();
            builderNewBuilder8.setSellerId(str);
            String ifv = n1VarA.f61931n.getIfv();
            if (!TextUtils.isEmpty(ifv)) {
                builderNewBuilder8.setIfv(ifv);
            }
            builderNewBuilder8.setBmIfv(n1VarA.d(context));
            builderNewBuilder8.setSessionId(sessionManager.getSessionId());
            builderNewBuilder.addExtProto(Any.pack(builderNewBuilder8.build()));
            return builderNewBuilder.build();
        } catch (Throwable th2) {
            nm.a.w(th2);
            return pr.a.throwable("Exception creating ad request", th2);
        }
    }

    public void cancel() {
        this.adResponseLoader.cancel();
    }

    public void clearNetworkAdUnits() {
        obtainNetworkAdUnitManager().notifyNetworkClearAuction();
    }

    public List<NetworkConfig> collectNetworkConfig(Context context, AdsType adsType, List<String> list) {
        HashMap map = new HashMap();
        List<NetworkConfig> networkConfigList = this.adRequestParameters.getNetworkConfigList();
        if (networkConfigList == null) {
            nm.j.putAll(map, NetworkRegistry.copyOrNullInitializedNetworkConfigs(adsType));
        } else {
            map.putAll(NetworkRegistry.createInitNetworkConfigMap());
            for (NetworkConfig networkConfig : networkConfigList) {
                String strCheckAndPutNetwork = NetworkRegistry.checkAndPutNetwork(context, adsType, networkConfig, map);
                if (strCheckAndPutNetwork != null) {
                    logError(new ao.n(17, networkConfig, strCheckAndPutNetwork));
                }
            }
        }
        if (list != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!list.contains((String) ((Map.Entry) it.next()).getKey())) {
                    it.remove();
                }
            }
        }
        nm.j.putAll(map, NetworkRegistry.copyOrNullInitializedCoreNetworkConfigs(adsType));
        return new ArrayList(map.values());
    }

    public List<Message.Builder> collectPlacementFormats(Context context, List<String> list, AdPlacementConfig adPlacementConfig) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        AdsType adsType = getAdsType();
        adsType.collectPlacements(new SimpleContextProvider(context), this, obtainUnifiedRequestParams(), collectNetworkConfig(context, adsType, list), arrayList, copyOnWriteArrayList, adPlacementConfig, n1.a().f61939v);
        this.networkAdUnitManager = new NetworkAdUnitManager(copyOnWriteArrayList);
        return arrayList;
    }

    public abstract UnifiedAdRequestParamsType createUnifiedAdRequestParams(AdRequestParametersType adrequestparameterstype, TargetingParams targetingParams, up.d dVar);

    public void destroy() {
        if (this.isDestroyed.compareAndSet(false, true)) {
            log(new hv.t(7));
            this.trackingObject.eventFinish(TrackEventType.AuctionRequestDestroy, getAdsType(), this.adResponse, (pr.a) null);
            cancel();
            unsubscribeTimeOut();
            this.trackingObject.clear();
            BidMachineFetcher.release(this);
            notifyRequestDestroyed();
            this.unifiedAdRequestParams = null;
            n nVar = this.adResponse;
            if (nVar != null) {
                nVar.detachAdRequest(this);
                this.adResponse = null;
            }
        }
    }

    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    public n getAdResponse() {
        return this.adResponse;
    }

    public final AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    public up.c getAuctionResult() {
        n nVar = this.adResponse;
        if (nVar != null) {
            return nVar.getAuctionResult();
        }
        return null;
    }

    public boolean isAdResponseExpired() {
        n nVar = this.adResponse;
        return nVar != null && nVar.isExpired();
    }

    public boolean isBidPayloadValid(ResponsePayload responsePayload) {
        Placement requestItemSpec = responsePayload.getRequestItemSpec();
        try {
            if (requestItemSpec != Placement.getDefaultInstance()) {
                return this.adRequestParameters.isPlacementObjectValid(requestItemSpec);
            }
            return true;
        } catch (Throwable th2) {
            nm.a.w(th2);
            return false;
        }
    }

    public boolean isCanceled() {
        return this.isApiRequestCanceled.get();
    }

    public boolean isCompleted() {
        return this.isApiRequestCompleted.get();
    }

    public boolean isDestroyed() {
        return this.isDestroyed.get();
    }

    public boolean isExpired() {
        return isAdResponseExpired() || this.isRequestExpired.get();
    }

    public boolean isLoading() {
        return this.isLoading.get();
    }

    public boolean isPlacementBuilderMatch(om.l lVar) {
        return true;
    }

    public void notifyMediationLoss() {
        notifyMediationLoss(null, null);
    }

    public void notifyMediationWin() {
        if (isCompleted()) {
            log(new hv.t(5));
            this.trackingObject.eventFinish(TrackEventType.MediationWin, getAdsType(), this.adResponse, isDestroyed() ? pr.a.f81792j : isExpired() ? pr.a.f81791i : null);
        }
    }

    public void notifyRequestDestroyed() {
        List<i> list = this.internalAdRequestListeners;
        if (list != null) {
            Iterator<i> it = list.iterator();
            while (it.hasNext()) {
                ((r0) it.next()).onRequestDestroyed(this);
            }
        }
    }

    public int obtainTimeOutMs() {
        Integer timeOutMs;
        int i10 = n1.a().f61938u;
        return (i10 > 0 || (timeOutMs = this.adRequestParameters.getTimeOutMs()) == null || timeOutMs.intValue() <= 0) ? i10 : timeOutMs.intValue();
    }

    public final UnifiedAdRequestParamsType obtainUnifiedRequestParams() {
        if (this.unifiedAdRequestParams == null) {
            n1 n1VarA = n1.a();
            this.unifiedAdRequestParams = (UnifiedAdRequestParamsType) createUnifiedAdRequestParams(this.adRequestParameters, (TargetingParams) up.o.resolveParams(this.adRequestParameters.getTargetingParams(), n1VarA.f61935r), n1VarA.f61923f);
        }
        return this.unifiedAdRequestParams;
    }

    public String pollUrl() {
        if (this.auctionUrlQueue.isEmpty()) {
            this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
        }
        return this.auctionUrlQueue.poll();
    }

    public void prepareUrls() {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
    }

    public void processApiRequestFail(pr.a aVar) {
        processApiRequestFail(aVar, true);
    }

    public void processApiRequestLoadedFail(ApiRequest.Builder<Request, Response> builder, pr.a aVar) {
        String strPoll;
        if (canProcessApiRequestResult()) {
            if (aVar == pr.a.f81800r || (strPoll = this.auctionUrlQueue.poll()) == null) {
                processApiRequestFail(aVar);
            } else {
                processRequestBuilder(builder, strPoll);
            }
        }
    }

    public void processApiRequestSuccess(n nVar) {
        if (!canProcessApiRequestResult()) {
            nVar.detachAdRequest(this);
            return;
        }
        setLoading(false);
        this.isApiRequestCompleted.set(true);
        unsubscribeTimeOut();
        log(new c(nVar, 0));
        this.adResponse = nVar;
        nVar.attachAdRequest(this);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestSuccess(this, nVar.getAuctionResult());
            }
        }
        Iterator it2 = n1.a().f61930m.iterator();
        while (it2.hasNext()) {
            ((AdRequestListener) it2.next()).onRequestSuccess(this, nVar.getAuctionResult());
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, getAdsType(), nVar, (pr.a) null);
    }

    public void processBidPayload(ResponsePayload responsePayload) {
        if (responsePayload == ResponsePayload.getDefaultInstance()) {
            processRequestFail(pr.a.incorrectContent("BidPayload has invalid content"));
            return;
        }
        if (!isBidPayloadValid(responsePayload)) {
            processRequestFail(pr.a.incorrectContent("BidPayload does not match with AdRequest"));
            return;
        }
        Openrtb responseCache = responsePayload.getResponseCache();
        if (responseCache != null && responseCache != Openrtb.getDefaultInstance()) {
            t3.a(this.adRequestParameters, obtainNetworkAdUnitManager(), responseCache.getResponse(), new g(this));
            return;
        }
        String responseCacheUrl = responsePayload.getResponseCacheUrl();
        if (TextUtils.isEmpty(responseCacheUrl) || !nm.j.isHttpUrl(responseCacheUrl)) {
            processRequestFail(pr.a.incorrectContent("BidPayload does not contain Response or URL"));
        } else {
            retrieveBody(responseCacheUrl);
        }
    }

    public void processExpired() {
        log(new hv.t(6));
        this.isRequestExpired.set(true);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestExpired(this);
            }
        }
        Iterator it2 = n1.a().f61930m.iterator();
        while (it2.hasNext()) {
            ((AdRequestListener) it2.next()).onRequestExpired(this);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequestExpired, getAdsType(), this.adResponse, (pr.a) null);
    }

    public void processRequestBuilder(ApiRequest.Builder<Request, Response> builder, String str) {
        if (canSendApiRequest()) {
            builder.url(str);
            this.adResponseLoader.load(this.adRequestParameters, obtainNetworkAdUnitManager(), builder, new h(this, str, builder));
        }
    }

    public void processRequestFail(pr.a aVar) {
        processRequestFail(aVar, true);
    }

    public void removeInternalListener(i iVar) {
        List<i> list = this.internalAdRequestListeners;
        if (list == null || iVar == null) {
            return;
        }
        list.remove(iVar);
    }

    public void removeListener(AdRequestListener<SelfType> adRequestListener) {
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list == null || adRequestListener == null) {
            return;
        }
        list.remove(adRequestListener);
    }

    public void request(Context context) {
        if (!n1.a().f61920c.get()) {
            processRequestFail(pr.a.internal("BidMachine not initialized"));
            return;
        }
        if (isDestroyed()) {
            processRequestFail(pr.a.f81792j);
            return;
        }
        pr.a aVarVerifyRequest = verifyRequest();
        if (aVarVerifyRequest != null) {
            processRequestFail(aVarVerifyRequest);
        } else {
            if (isLoading()) {
                return;
            }
            setLoading(true);
            j.get().execute(new f(this, context.getApplicationContext()));
        }
    }

    public void retrieveBody(String str) {
        processRequestBuilder(new ApiRequest.Builder().setMethod(nm.e.Get).setDataBinder(new ApiRequest.ApiResponseAuctionDataBinder()), str);
    }

    public void setAuctionUrl(String str) {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.add(str);
    }

    public String toString() {
        return this.tag.toString();
    }

    public pr.a verifyRequest() {
        return null;
    }

    public void notifyMediationLoss(String str, Double d10) {
        if (isCompleted()) {
            log(new ao.n(16, str, d10));
            this.trackingObject.eventFinish(TrackEventType.MediationLoss, getAdsType(), new gr.a().setNetworkName(str).setPrice(d10), isDestroyed() ? pr.a.f81792j : isExpired() ? pr.a.f81791i : null);
        }
    }

    public void processApiRequestFail(pr.a aVar, boolean z10) {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCompleted.set(true);
            if (aVar == null) {
                aVar = pr.a.f81800r;
            }
            processRequestFail(aVar, z10);
        }
    }

    public void processRequestFail(pr.a aVar, boolean z10) {
        log(new b(aVar, 0));
        unsubscribeTimeOut();
        if (z10) {
            clearNetworkAdUnits();
        }
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestFailed(this, aVar);
            }
        }
        Iterator it2 = n1.a().f61930m.iterator();
        while (it2.hasNext()) {
            ((AdRequestListener) it2.next()).onRequestFailed(this, aVar);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, getAdsType(), (gr.a) null, aVar);
    }

    public void onBeforeSetDisplayPlacementBuilder(Placement.DisplayPlacement.Builder builder) {
    }

    public void onBeforeSetVideoPlacementBuilder(Placement.VideoPlacement.Builder builder) {
    }

    public void onBuildPlacement(Placement.Builder builder) {
    }
}

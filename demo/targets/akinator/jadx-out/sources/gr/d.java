package gr;

import android.text.TextUtils;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.google.android.exoplayer2.j0;
import io.bidmachine.AdsType;
import io.bidmachine.ApiRequest;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.analytics.events.SDKEvent;
import io.bidmachine.protobuf.sdk.Error;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public AdExtension.EventConfiguration f58404a;

    public d() {
        this(null);
    }

    public static boolean a(AdExtension.EventConfiguration eventConfiguration, int i10, long j10, long j11, AdsType adsType, String str, Double d10, Struct struct, pr.a aVar) {
        if (eventConfiguration != null) {
            try {
                if (eventConfiguration.getActionsList().contains(Integer.valueOf(i10))) {
                    String url = eventConfiguration.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        if (aVar == null) {
                            nm.a.d(new j0(i10, 2));
                        } else {
                            nm.a.d(new c(i10, aVar, 0));
                        }
                        SDKEvent.Builder finishTime = SDKEvent.newBuilder().setAction(i10).setContext(eventConfiguration.getContext()).setStartTime(pr.i.msToProtobufTimestamp(j10)).setFinishTime(pr.i.msToProtobufTimestamp(j11));
                        if (adsType != null) {
                            finishTime.setAdType(StringValue.newBuilder().setValue(adsType.getName()).build());
                        }
                        if (!TextUtils.isEmpty(str)) {
                            finishTime.setNetwork(StringValue.newBuilder().setValue(str).build());
                        }
                        if (d10 != null) {
                            finishTime.setPrice(d10.doubleValue());
                        }
                        if (struct != null) {
                            finishTime.setCustomParams(struct);
                        }
                        if (aVar != null) {
                            Error.Builder error = Error.newBuilder().setError(Error.Data.newBuilder().setCode(aVar.getCode()).setDescription(aVar.getMessage()).build());
                            pr.a errorExtension = aVar.getErrorExtension();
                            if (errorExtension != null) {
                                error.setReason(Error.Data.newBuilder().setCode(errorExtension.getCode()).setDescription(errorExtension.getMessage()).build());
                            }
                            finishTime.setError(error);
                        }
                        new ApiRequest.Builder().url(url).setMethod(nm.e.Post).setDataBinder(new ApiRequest.ApiEventDataBinder()).setRequestData(finishTime.build()).request();
                        return true;
                    }
                }
            } catch (Throwable th2) {
                nm.a.w(th2);
            }
        }
        return false;
    }

    public void setDefaultEventConfiguration(AdExtension.EventConfiguration eventConfiguration) {
        if (eventConfiguration != null && eventConfiguration.equals(AdExtension.EventConfiguration.getDefaultInstance())) {
            eventConfiguration = null;
        }
        this.f58404a = eventConfiguration;
    }

    @Override // gr.b
    public void trackEvent(j jVar, TrackEventType trackEventType, i iVar, AdsType adsType, pr.a aVar, a aVar2) {
        long jCurrentTimeMillis;
        long finishTimeMs;
        String networkName;
        Double price;
        Struct customParams;
        if (aVar == null || aVar.isTrackError()) {
            if (iVar != null) {
                jCurrentTimeMillis = iVar.getStartTimeMs();
                finishTimeMs = iVar.getFinishTimeMs();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                finishTimeMs = jCurrentTimeMillis;
            }
            if (aVar2 != null) {
                networkName = aVar2.getNetworkName();
                price = aVar2.getPrice();
                customParams = aVar2.getCustomParams();
            } else {
                networkName = null;
                price = null;
                customParams = null;
            }
            int actionValue = trackEventType.getActionValue();
            if (a(jVar.getEventConfiguration(), actionValue, jCurrentTimeMillis, finishTimeMs, adsType, networkName, price, customParams, aVar)) {
                return;
            }
            a(this.f58404a, actionValue, jCurrentTimeMillis, finishTimeMs, adsType, networkName, price, customParams, aVar);
        }
    }

    public d(AdExtension.EventConfiguration eventConfiguration) {
        setDefaultEventConfiguration(eventConfiguration);
    }
}

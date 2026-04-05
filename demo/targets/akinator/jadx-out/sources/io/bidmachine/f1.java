package io.bidmachine;

import android.text.TextUtils;
import io.bidmachine.ApiRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f1 implements gr.b {
    public static void a(List list, gr.i iVar, int i10, pr.a aVar) {
        if (list != null && aVar.isTrackError()) {
            nm.a.d(new b(aVar, 5));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c(e((String) it.next(), iVar, i10, aVar.getCode(), null), null);
            }
        }
    }

    public static ArrayList b(gr.j jVar, TrackEventType trackEventType) {
        List list = (List) n1.a().f61929l.get(trackEventType);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        List<String> trackingUrls = jVar.getTrackingUrls(trackEventType);
        if (trackingUrls != null) {
            if (arrayList == null) {
                return new ArrayList(trackingUrls);
            }
            arrayList.addAll(trackingUrls);
        }
        return arrayList;
    }

    public static void c(String str, nm.b bVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new ApiRequest.Builder().url(str).setMethod(nm.e.Get).setDataBinder(new ApiRequest.ApiTrackerDataBinder()).setCallback(bVar).request();
    }

    public static String d(Object obj, String str, String str2) {
        return str.replace(a.b.l("${", str2, "}"), String.valueOf(obj)).replace(a.b.l("%24%7B", str2, "%7D"), String.valueOf(obj));
    }

    public static String e(String str, gr.i iVar, int i10, int i11, gr.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strD = d(Integer.valueOf(i11), d(Integer.valueOf(i10), d(Integer.valueOf(i10), str, Constants.URL_MACROS_BM_EVENT_CODE), Constants.URL_MACROS_BM_ACTION_CODE), Constants.URL_MACROS_BM_ERROR_REASON);
        if (aVar != null) {
            String networkName = aVar.getNetworkName();
            if (networkName != null) {
                strD = d(networkName, strD, Constants.URL_MACROS_AUCTION_SEAT_ID);
            }
            Double price = aVar.getPrice();
            if (price != null) {
                strD = d(price, strD, Constants.URL_MACROS_AUCTION_PRICE);
            }
        }
        if (iVar != null) {
            strD = d(Long.valueOf(iVar.getFinishTimeMs()), d(Long.valueOf(iVar.getStartTimeMs()), strD, Constants.URL_MACROS_BM_ACTION_START), Constants.URL_MACROS_BM_ACTION_FINISH);
            Map<String, Object> eventParameters = iVar.getEventParameters();
            if (eventParameters != null) {
                for (Map.Entry<String, Object> entry : eventParameters.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        strD = d(value, strD, key);
                    }
                }
            }
        }
        return strD;
    }

    @Override // gr.b
    public void trackEvent(gr.j jVar, TrackEventType trackEventType, gr.i iVar, AdsType adsType, pr.a aVar, gr.a aVar2) {
        if (aVar == null) {
            ArrayList arrayListB = b(jVar, trackEventType);
            ArrayList arrayListB2 = b(jVar, TrackEventType.TrackingError);
            if (arrayListB == null) {
                return;
            }
            nm.a.d(new u0(trackEventType, 1));
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                c(e((String) it.next(), iVar, trackEventType.getActionValue(), -1, aVar2), new d1(arrayListB2, iVar, trackEventType));
            }
            return;
        }
        ArrayList arrayListB3 = b(jVar, TrackEventType.Error);
        ArrayList arrayListB4 = b(jVar, TrackEventType.TrackingError);
        int actionValue = trackEventType.getActionValue();
        if (arrayListB3 != null && aVar.isTrackError()) {
            nm.a.d(new gr.c(actionValue, aVar, 1));
            Iterator it2 = arrayListB3.iterator();
            while (it2.hasNext()) {
                c(e((String) it2.next(), iVar, actionValue, aVar.getCode(), null), new e1(arrayListB4, iVar));
            }
        }
    }
}

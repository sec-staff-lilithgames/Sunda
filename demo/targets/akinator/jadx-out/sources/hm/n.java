package hm;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.explorestack.protobuf.DoubleValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.UInt32Value;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import io.bidmachine.protobuf.Waterfall;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n {
    public static AdManagerAdRequest a(Waterfall.Configuration.AdUnit adUnit) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        String requestAgent = adUnit.getRequestAgent();
        if (!TextUtils.isEmpty(requestAgent)) {
            builder.setRequestAgent(requestAgent);
        }
        for (Map.Entry<String, String> entry : adUnit.getCustomTargetingMap().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                builder.addCustomTargeting(key, value);
            }
        }
        return builder.build();
    }

    public static Waterfall.Result.EstimatedPrice b(AdValue adValue) {
        return Waterfall.Result.EstimatedPrice.newBuilder().setValue(DoubleValue.newBuilder().setValue(adValue.getValueMicros()).build()).setCurrency(StringValue.newBuilder().setValue(adValue.getCurrencyCode()).build()).setPrecision(UInt32Value.newBuilder().setValue(adValue.getPrecisionType()).build()).build();
    }

    public static Waterfall.Result.EstimatedPrice c(Object obj, String[] strArr) {
        try {
            Object objFindValueByPath = pr.k.findValueByPath(obj, strArr);
            if (objFindValueByPath != null) {
                Integer num = (Integer) pr.k.findValue(objFindValueByPath, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                String str = (String) pr.k.findValue(objFindValueByPath, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
                Number number = (Number) pr.k.findValue(objFindValueByPath, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
                if (num != null || str != null || dValueOf != null) {
                    Waterfall.Result.EstimatedPrice.Builder builderNewBuilder = Waterfall.Result.EstimatedPrice.newBuilder();
                    if (dValueOf != null) {
                        builderNewBuilder.setValue(DoubleValue.newBuilder().setValue(dValueOf.doubleValue()).build());
                    }
                    if (str != null) {
                        builderNewBuilder.setCurrency(StringValue.newBuilder().setValue(str).build());
                    }
                    if (num != null) {
                        builderNewBuilder.setPrecision(UInt32Value.newBuilder().setValue(num.intValue()).build());
                    }
                    return builderNewBuilder.build();
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}

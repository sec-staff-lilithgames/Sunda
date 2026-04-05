package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Eb {
    public static final void a(Db telemetryType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryType, "telemetryType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (telemetryType instanceof C3109zb) {
            linkedHashMap.put("trigger", ((C3109zb) telemetryType).f33725a);
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("BillingClientConnectionError", linkedHashMap, EnumC2993se.f33373a);
            return;
        }
        if (telemetryType instanceof Ab) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((Ab) telemetryType).f31632a));
            C2926oe c2926oe2 = C2926oe.f33217a;
            C2926oe.b("IAPFetchFailed", linkedHashMap, EnumC2993se.f33373a);
        } else {
            if (!(telemetryType instanceof Cb)) {
                if (telemetryType instanceof Bb) {
                    C2926oe c2926oe3 = C2926oe.f33217a;
                    C2926oe.b("IAPFetchSuccess", linkedHashMap, EnumC2993se.f33373a);
                    return;
                }
                return;
            }
            String str = ((Cb) telemetryType).f31711a;
            if (str != null) {
                linkedHashMap.put("trigger", str);
            }
            C2926oe c2926oe4 = C2926oe.f33217a;
            C2926oe.b("BillingClientNotCompatible", linkedHashMap, EnumC2993se.f33373a);
        }
    }
}

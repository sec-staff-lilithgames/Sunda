package io.odeeo.internal.j1;

import com.ironsource.G5;
import io.odeeo.internal.a2.o;
import io.odeeo.internal.a2.t;
import io.odeeo.internal.a2.u;
import io.odeeo.internal.a2.y;
import io.odeeo.internal.y1.r;
import io.odeeo.sdk.OdeeoSDK;
import io.odeeo.sdk.advertisement.data.BidRequestData;
import java.util.Map;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public static /* synthetic */ Object getAppConfig$default(h hVar, String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, zu.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppConfig");
            }
            if ((i10 & 4) != 0) {
                str3 = "android";
            }
            String str8 = str3;
            if ((i10 & 8) != 0) {
                map = null;
            }
            return hVar.getAppConfig(str, str2, str8, map, (i10 & 16) != 0 ? OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().getAppVersion$odeeoSdk_release() : str4, (i10 & 32) != 0 ? io.odeeo.internal.d1.f.f63660a.getEngineName() : str5, (i10 & 64) != 0 ? io.odeeo.internal.d1.f.f63660a.getEngineVersion() : str6, str7, dVar);
        }

        public static /* synthetic */ Object getBidRequest$default(h hVar, BidRequestData bidRequestData, String str, String str2, String str3, String str4, String str5, String str6, String str7, zu.d dVar, int i10, Object obj) {
            if (obj == null) {
                return hVar.getBidRequest(bidRequestData, str, str2, str3, (i10 & 16) != 0 ? "android" : str4, str5, str6, (i10 & 128) != 0 ? G5.L : str7, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBidRequest");
        }

        public static /* synthetic */ Object getGlobalConfig$default(h hVar, String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, zu.d dVar, int i10, Object obj) {
            if (obj == null) {
                return hVar.getGlobalConfig(str, str2, (i10 & 4) != 0 ? "android" : str3, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? w0.i.c("randomUUID().toString()") : str4, (i10 & 32) != 0 ? io.odeeo.internal.d1.f.f63660a.getEngineName() : str5, (i10 & 64) != 0 ? OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().getAppVersion$odeeoSdk_release() : str6, (i10 & 128) != 0 ? io.odeeo.internal.d1.f.f63660a.getEngineVersion() : str7, str8, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGlobalConfig");
        }

        public static /* synthetic */ Object updateGeneralConsent$default(h hVar, String str, String str2, String str3, String str4, io.odeeo.internal.f1.c cVar, zu.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateGeneralConsent");
            }
            if ((i10 & 8) != 0) {
                str4 = "android";
            }
            return hVar.updateGeneralConsent(str, str2, str3, str4, cVar, dVar);
        }
    }

    @io.odeeo.internal.a2.f("v1/config/app")
    Object getAppConfig(@io.odeeo.internal.a2.i("X-ODEEO-APP-KEY") String str, @io.odeeo.internal.a2.i("X-ODEEO-BUNDLE-ID") String str2, @io.odeeo.internal.a2.i("X-ODEEO-PLATFORM") String str3, @u Map<String, String> map, @t("app_version") String str4, @t("engine_name") String str5, @t("sdk_version") String str6, @t("device_volume") String str7, zu.d<? super r<io.odeeo.internal.e1.a>> dVar);

    @o("v2/bidrequest")
    Object getBidRequest(@io.odeeo.internal.a2.a BidRequestData bidRequestData, @t("id") String str, @io.odeeo.internal.a2.i("X-ODEEO-APP-KEY") String str2, @io.odeeo.internal.a2.i("X-ODEEO-BUNDLE-ID") String str3, @io.odeeo.internal.a2.i("X-ODEEO-PLATFORM") String str4, @io.odeeo.internal.a2.i("X-ODEEO-PLACEMENT-ID") String str5, @io.odeeo.internal.a2.i("X-ODEEO-PLACEMENT-TYPE") String str6, @io.odeeo.internal.a2.i("Accept") String str7, zu.d<? super r<io.odeeo.internal.l1.d>> dVar);

    @io.odeeo.internal.a2.f("v2/initialize")
    Object getGlobalConfig(@io.odeeo.internal.a2.i("X-ODEEO-APP-KEY") String str, @io.odeeo.internal.a2.i("X-ODEEO-BUNDLE-ID") String str2, @io.odeeo.internal.a2.i("X-ODEEO-PLATFORM") String str3, @u Map<String, String> map, @t("request_id") String str4, @t("engine_name") String str5, @t("app_version") String str6, @t("sdk_version") String str7, @t("device_volume") String str8, zu.d<? super r<io.odeeo.internal.e1.b>> dVar);

    @io.odeeo.internal.a2.f
    Object getImage(@y String str, zu.d<? super r<w0>> dVar);

    @io.odeeo.internal.a2.f
    Object trackExternalEvent(@y String str, zu.d<? super r<w0>> dVar);

    @o
    Object trackInternalEvent(@y String str, @io.odeeo.internal.a2.a io.odeeo.internal.o1.c cVar, zu.d<? super r<w0>> dVar);

    @o
    Object trackSessionEvent(@y String str, @io.odeeo.internal.a2.a io.odeeo.internal.o1.h hVar, zu.d<? super r<w0>> dVar);

    @o
    Object updateGeneralConsent(@y String str, @io.odeeo.internal.a2.i("X-ODEEO-APP-KEY") String str2, @io.odeeo.internal.a2.i("X-ODEEO-BUNDLE-ID") String str3, @io.odeeo.internal.a2.i("X-ODEEO-PLATFORM") String str4, @io.odeeo.internal.a2.a io.odeeo.internal.f1.c cVar, zu.d<? super r<io.odeeo.internal.f1.e>> dVar);
}

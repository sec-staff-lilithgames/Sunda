package com.vungle.ads.internal.network;

import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import java.util.Map;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface VungleApi {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Call pingTPAT$default(VungleApi vungleApi, String str, String str2, HttpMethod httpMethod, Map map, u0 u0Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pingTPAT");
            }
            if ((i10 & 4) != 0) {
                httpMethod = HttpMethod.GET;
            }
            return vungleApi.pingTPAT(str, str2, httpMethod, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : u0Var);
        }
    }

    Call<AdPayload> ads(String str, String str2, CommonRequestBody commonRequestBody);

    Call<ConfigPayload> config(String str, String str2, CommonRequestBody commonRequestBody);

    Call<Void> pingTPAT(String str, String str2, HttpMethod httpMethod, Map<String, String> map, u0 u0Var);

    Call<Void> ri(String str, String str2, CommonRequestBody commonRequestBody);

    Call<Void> sendAdMarkup(String str, u0 u0Var);

    Call<Void> sendErrors(String str, String str2, u0 u0Var);

    Call<Void> sendMetrics(String str, String str2, u0 u0Var);
}

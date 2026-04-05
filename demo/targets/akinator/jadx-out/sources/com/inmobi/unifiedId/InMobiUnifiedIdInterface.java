package com.inmobi.unifiedId;

import com.inmobi.media.V5;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface InMobiUnifiedIdInterface {
    public static final V5 Companion = V5.f32391a;
    public static final String NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT = "Fetching the unifiedIds from ID Service has failed and there are no unified ids present in cache";
    public static final String NO_LOCAL_DATA_PRESENT = "No local data present";
    public static final String PUSH_NEEDS_TO_BE_CALLED_FIRST = "Push api needs to called prior to fetch";
    public static final String UNIFIED_SERVICE_IS_NOT_ENABLED = "UnifiedId Service not enabled, please connect with your respective partner manager";
    public static final String USER_HAS_AGE_RESTRICTION = "User has age restriction";
    public static final String USER_HAS_OPTED_OUT = "User has opted out for tracking";

    void onFetchCompleted(JSONObject jSONObject, Error error);
}

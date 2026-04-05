package com.unity3d.services.ads.gmascar.utils;

import com.ironsource.G5;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ScarRequestHandler {
    private final HttpClient httpClient = (HttpClient) Utilities.getService(HttpClient.class);

    public void makeUploadRequest(String str, BiddingSignals biddingSignals, String str2) throws Exception {
        HashMap map = new HashMap();
        map.put("Content-Type", Collections.singletonList(G5.L));
        HashMap map2 = new HashMap();
        map2.put("idfi", Device.getIdfi());
        map2.put(ScarConstants.TOKEN_ID_KEY, str);
        map2.putAll(biddingSignals.getMap());
        this.httpClient.executeBlocking(new HttpRequest(str2, "", RequestType.POST, new JSONObject(map2).toString().getBytes(StandardCharsets.UTF_8), map));
    }
}

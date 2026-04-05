package com.inmobi.media;

import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.l3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2864l3 {
    public static JSONArray a(C2847k3 it, List skipList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list = C2847k3.f32996j;
        kotlin.jvm.internal.e0.checkNotNullParameter(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, C3191e4.h.W);
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(it.f32997a);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("bid", C3191e4.h.W);
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("bid")) {
            jSONArray.put(it.f32998b);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("its", C3191e4.h.W);
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("its")) {
            jSONArray.put(it.f32999c);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("vtm", C3191e4.h.W);
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("vtm")) {
            jSONArray.put(it.f33000d);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("plid", C3191e4.h.W);
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("plid")) {
            jSONArray.put(it.f33001e);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("catid", C3191e4.h.W);
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("catid")) {
            jSONArray.put(it.f33002f);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("hcd", C3191e4.h.W);
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hcd")) {
            jSONArray.put(it.f33003g);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("hsv", C3191e4.h.W);
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hsv")) {
            jSONArray.put(it.f33004h);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("hcv", C3191e4.h.W);
        kotlin.jvm.internal.e0.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hcv")) {
            jSONArray.put(it.f33005i);
        }
        return jSONArray;
    }
}

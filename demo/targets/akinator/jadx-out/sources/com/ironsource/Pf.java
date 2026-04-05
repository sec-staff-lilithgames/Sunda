package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Pf {

    /* renamed from: a, reason: collision with root package name */
    public static final Pf f35205a = new Pf();

    /* renamed from: b, reason: collision with root package name */
    private static final String f35206b = ",";

    /* renamed from: c, reason: collision with root package name */
    private static final String f35207c = "[";

    /* renamed from: d, reason: collision with root package name */
    private static final String f35208d = "]";

    /* renamed from: e, reason: collision with root package name */
    private static final int f35209e = 118;

    private Pf() {
    }

    public final List<Object> a(Object... items) {
        kotlin.jvm.internal.e0.checkNotNullParameter(items, "items");
        return uu.p0.listOf(Arrays.copyOf(items, items.length));
    }

    public final String b(List<? extends Object> methodArgs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            str = ((Object) (((Object) str) + (obj instanceof List ? f35205a.a((List<?>) obj) : f35205a.a(obj)))) + f35206b;
        }
        return sv.n0.removeSuffix(str, (CharSequence) f35206b);
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + f35205a.a(it.next()) + f35206b;
        }
        return ((Object) sv.n0.removeSuffix(str, (CharSequence) f35206b)) + "]";
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            return j1.o2.k(obj, "'", "'");
        }
        return String.valueOf(obj);
    }

    public final AdInfo a(LevelPlayAdInfo levelPlayAdInfo) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(levelPlayAdInfo, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auctionId", levelPlayAdInfo.getAuctionId());
        jSONObject.put("adUnit", levelPlayAdInfo.getAdFormat());
        jSONObject.put("country", levelPlayAdInfo.getCountry());
        jSONObject.put("ab", levelPlayAdInfo.getAb());
        jSONObject.put("segmentName", levelPlayAdInfo.getSegmentName());
        jSONObject.put("placement", levelPlayAdInfo.getPlacementName());
        jSONObject.put("adNetwork", levelPlayAdInfo.getAdNetwork());
        jSONObject.put("instanceName", levelPlayAdInfo.getInstanceName());
        jSONObject.put("instanceId", levelPlayAdInfo.getInstanceId());
        jSONObject.put("precision", levelPlayAdInfo.getPrecision());
        jSONObject.put("encryptedCPM", levelPlayAdInfo.getEncryptedCPM());
        jSONObject.put("revenue", levelPlayAdInfo.getRevenue());
        return new AdInfo(new Y8(jSONObject), null);
    }

    public final IronSourceError a(LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    public final ViewGroup.LayoutParams a(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, 118);
        return layoutParams;
    }

    private final int a(Context context, int i10) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i10 * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }
}

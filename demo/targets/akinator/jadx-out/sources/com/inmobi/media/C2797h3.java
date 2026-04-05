package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2797h3 implements P2 {
    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        List<String> listEmptyList;
        AdConfig.ContextualDataConfig contextualData;
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        synchronized (this) {
            try {
                C2830j3 c2830j3 = C2830j3.f32954a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("j3", "<get-TAG>(...)");
                C2830j3.f32958e = (AdConfig) config;
                String str = C2830j3.f32960g;
                AdConfig adConfig = C2830j3.f32958e;
                if (adConfig == null || (contextualData = adConfig.getContextualData()) == null || (listEmptyList = contextualData.getSkipFields()) == null) {
                    listEmptyList = uu.p0.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C2847k3.f32996j);
                arrayList.removeAll(listEmptyList);
                String strJoinToString$default = uu.y0.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
                C2830j3.f32960g = strJoinToString$default;
                if (!kotlin.jvm.internal.e0.areEqual(strJoinToString$default, str)) {
                    c2830j3.e();
                }
                C2830j3.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

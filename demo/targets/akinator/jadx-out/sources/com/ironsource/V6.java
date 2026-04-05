package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class V6 {

    /* renamed from: a, reason: collision with root package name */
    private final V9 f35632a;

    public V6(V9 globalDataWriter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f35632a = globalDataWriter;
    }

    public final void a(JSONObject metaDataJson) {
        kotlin.jvm.internal.e0.checkNotNullParameter(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.ironsource.mediationsdk.metadata.a.f37603i)) {
            try {
                Object objRemove = metaDataJson.remove(com.ironsource.mediationsdk.metadata.a.f37603i);
                kotlin.jvm.internal.e0.checkNotNull(objRemove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) objRemove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                this.f35632a.e((String) obj);
            } catch (ClassCastException e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error("got the following error " + e10.getMessage());
            }
        }
    }
}

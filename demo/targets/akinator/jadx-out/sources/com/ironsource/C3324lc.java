package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.lc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3324lc {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, JSONObject> f37166a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3324lc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.f37166a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3324lc) && kotlin.jvm.internal.e0.areEqual(this.f37166a, ((C3324lc) obj).f37166a);
    }

    public int hashCode() {
        return this.f37166a.hashCode();
    }

    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f37166a + ")";
    }

    public C3324lc(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkDataMap, "networkDataMap");
        this.f37166a = networkDataMap;
    }

    public final C3324lc a(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkDataMap, "networkDataMap");
        return new C3324lc(networkDataMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3324lc a(C3324lc c3324lc, ConcurrentHashMap concurrentHashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            concurrentHashMap = c3324lc.f37166a;
        }
        return c3324lc.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public /* synthetic */ C3324lc(ConcurrentHashMap concurrentHashMap, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    public final void a(com.ironsource.mediationsdk.x networkData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkData, "networkData");
        if (!this.f37166a.containsKey(networkData.a())) {
            this.f37166a.put(networkData.a(), networkData.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f37166a;
            String strA = networkData.a();
            JSONObject jSONObject = this.f37166a.get(networkData.a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectA = IronSourceUtils.a(jSONObject, networkData.allData());
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectA, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(strA, jSONObjectA);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while merging network data: " + e10.getMessage());
        }
    }

    public final void a(AbstractAdapter adapter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adapter, "adapter");
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f37166a.entrySet();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setEntrySet, "networkDataMap.entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "it.value");
            adapter.setNetworkData(new com.ironsource.mediationsdk.x((String) key, (JSONObject) value));
        }
    }

    public final void a(AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f37166a.entrySet();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setEntrySet, "networkDataMap.entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            kotlin.jvm.internal.e0.checkNotNull(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.x((String) key, (JSONObject) value));
        }
    }
}

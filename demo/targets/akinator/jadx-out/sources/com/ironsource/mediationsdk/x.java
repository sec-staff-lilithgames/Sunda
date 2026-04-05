package com.ironsource.mediationsdk;

import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.H9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;
import rv.f0;
import sv.k0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class x implements AdapterNetworkData {

    /* renamed from: a, reason: collision with root package name */
    private final String f37831a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f37832b;

    public x(String networkName, JSONObject data) {
        e0.checkNotNullParameter(networkName, "networkName");
        e0.checkNotNullParameter(data, "data");
        this.f37831a = networkName;
        this.f37832b = new JSONObject(data.toString());
    }

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        List listFilterNotNull = y0.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (c.a(this.f37831a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AdapterBaseWrapper) it.next()).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof AdapterNetworkDataInterface) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ((AdapterNetworkDataInterface) it3.next()).setNetworkData(this);
        }
    }

    public final String a() {
        return this.f37831a;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject allData() {
        return this.f37832b;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(String desiredKey, Class<T> valueType) {
        Object next;
        e0.checkNotNullParameter(desiredKey, "desiredKey");
        e0.checkNotNullParameter(valueType, "valueType");
        Iterator<String> itKeys = allData().keys();
        e0.checkNotNullExpressionValue(itKeys, "allData()\n          .keys()");
        Iterator<Object> it = rv.y.asSequence(itKeys).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (k0.equals((String) next, desiredKey, true)) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            Object objOpt = allData().opt(str);
            if (!valueType.isInstance(objOpt)) {
                objOpt = null;
            }
            if (objOpt != null) {
                return valueType.cast(objOpt);
            }
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject networkDataByAdUnit(IronSource.a adUnit) {
        e0.checkNotNullParameter(adUnit, "adUnit");
        JSONObject jSONObjectOptJSONObject = this.f37832b.optJSONObject(adUnit.toString());
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    public String toString() {
        return "NetworkData(networkName=" + this.f37831a + ", networkData=" + this.f37832b + ")";
    }

    public final void a(Collection<? extends AbstractAdapter> adapters, Collection<? extends AdapterBaseWrapper> networkAdapters) {
        e0.checkNotNullParameter(adapters, "adapters");
        e0.checkNotNullParameter(networkAdapters, "networkAdapters");
        try {
            a(adapters);
            b(networkAdapters);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while setting network data: " + e10.getMessage());
        }
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        List listFilterNotNull = y0.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (c.a(this.f37831a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    public final void b() {
        Iterator<String> itKeys = this.f37832b.keys();
        e0.checkNotNullExpressionValue(itKeys, "networkData.keys()");
        String strJoinToString$default = y0.joinToString$default(f0.toList(rv.y.asSequence(itKeys)), ",", null, null, 0, null, null, 62, null);
        H9.i().a(new C5(D5.SET_NETWORK_DATA, IronSourceUtils.b(false).put(IronSourceConstants.EVENTS_EXT1, this.f37831a + " - " + strJoinToString$default)));
    }
}

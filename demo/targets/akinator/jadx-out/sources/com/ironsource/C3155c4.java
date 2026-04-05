package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3155c4 {

    /* renamed from: a, reason: collision with root package name */
    private Boolean f36112a;

    /* renamed from: b, reason: collision with root package name */
    private final B7 f36113b = Mb.f34856s.d().i();

    public final Boolean a() {
        return this.f36112a;
    }

    public final B7 b() {
        return this.f36113b;
    }

    public final void a(boolean z10) {
        this.f36112a = Boolean.valueOf(z10);
    }

    public final void a(ConcurrentHashMap<String, AbstractAdapter> adapters, ConcurrentHashMap<String, AdapterBaseWrapper> networkAdapters) throws JSONException {
        tu.x0 x0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(adapters, "adapters");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkAdapters, "networkAdapters");
        for (AbstractAdapter adapter : adapters.values()) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adapter, "adapter");
            a(adapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                x0Var = tu.x0.f87415a;
            } else {
                x0Var = null;
            }
            if (x0Var == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(AdapterBaseInterface adapter, NetworkSettings networkSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean boolA = a(networkSettings);
            if (boolA == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(boolA.booleanValue());
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strM = a.b.m("error while setting consent of ", networkSettings != null ? networkSettings.getProviderName() : null, ": ", th2.getLocalizedMessage());
            a(strM);
            IronLog.INTERNAL.error(strM);
        }
    }

    public final void a(AbstractAdapter adapter, NetworkSettings networkSettings) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean boolA = a(networkSettings);
            if (boolA != null) {
                adapter.setNewConsent(boolA.booleanValue());
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strM = a.b.m("error while setting consent of ", adapter.getProviderName(), ": ", th2.getLocalizedMessage());
            a(strM);
            IronLog.INTERNAL.error(strM);
        }
    }

    private final Boolean a(NetworkSettings networkSettings) {
        if (networkSettings != null && !networkSettings.isCustomNetwork()) {
            if (networkSettings.getApplicationSettings().has(C3173d4.f36229a)) {
                return Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(C3173d4.f36229a));
            }
            return this.f36112a;
        }
        return this.f36112a;
    }

    private final void a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            H9.i().a(new C5(D5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public final void a(int i10) {
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, i10 + ";" + this.f36113b.F(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(tu.h.stackTraceToString(e10));
        }
        Mb.f34856s.d().q().a(new C5(D5.CONSENT_TCF_CODE, jSONObjectB));
    }

    public final void a(int i10, ConcurrentHashMap<String, NetworkSettings> providerSettings) {
        JSONObject applicationSettings;
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        String strF = this.f36113b.F(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + strF);
        ironLog.general("CMP ID: " + i10);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<NetworkSettings> collectionValues = providerSettings.values();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(collectionValues, "providerSettings.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !kotlin.jvm.internal.e0.areEqual(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(C3173d4.f36229a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((NetworkSettings) next).getProviderDefaultInstance())) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            NetworkSettings networkSettings2 = (NetworkSettings) it2.next();
            IronLog ironLog2 = IronLog.API;
            String providerDefaultInstance = networkSettings2.getProviderDefaultInstance();
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(C3173d4.f36229a)) : null));
        }
    }
}

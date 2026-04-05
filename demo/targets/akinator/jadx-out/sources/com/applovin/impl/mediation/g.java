package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.h3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14732b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f14733c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f14731a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: d, reason: collision with root package name */
    private final Object f14734d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f14735e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Set f14736f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f14737g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Set f14738h = new HashSet();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f14739a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14740b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f14741c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f14742d;

        public a(String str, String str2, v2 v2Var, com.applovin.impl.sdk.k kVar) {
            this.f14739a = str;
            this.f14740b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f14742d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (v2Var == null) {
                this.f14741c = null;
            } else {
                this.f14741c = v2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", v2Var.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.f14742d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f14739a.equals(aVar.f14739a) || !this.f14740b.equals(aVar.f14740b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f14741c;
            MaxAdFormat maxAdFormat2 = aVar.f14741c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iE = o2.e(this.f14739a.hashCode() * 31, 31, this.f14740b);
            MaxAdFormat maxAdFormat = this.f14741c;
            return iE + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f14739a + "', operationTag='" + this.f14740b + "', format=" + this.f14741c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public g(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f14732b = kVar;
        this.f14733c = kVar.O();
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f14737g) {
            try {
                arrayList = new ArrayList(this.f14738h.size());
                Iterator it = this.f14738h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.f14734d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f14736f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f14734d) {
            try {
                HashSet hashSet = new HashSet(this.f14735e.size());
                Iterator it = this.f14735e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return setUnmodifiableSet;
    }

    public h a(h3 h3Var) {
        return a(h3Var, false);
    }

    public h a(h3 h3Var, boolean z10) {
        Class clsA;
        h hVar;
        if (h3Var != null) {
            String strC = h3Var.c();
            String strB = h3Var.b();
            if (TextUtils.isEmpty(strC)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14733c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14733c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z10 && (hVar = (h) this.f14731a.get(strB)) != null) {
                return hVar;
            }
            synchronized (this.f14734d) {
                try {
                    if (!this.f14736f.contains(strB)) {
                        if (this.f14735e.containsKey(strB)) {
                            clsA = (Class) this.f14735e.get(strB);
                        } else {
                            clsA = a(strB);
                            if (clsA == null) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f14733c.k("MediationAdapterManager", "Adapter " + strC + QGjYBESwAiCc.yjm + strB + " not found");
                                }
                                this.f14736f.add(strB);
                                return null;
                            }
                        }
                        h hVarA = a(h3Var, clsA, z10);
                        if (hVarA != null) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f14733c.a("MediationAdapterManager", "Loaded " + strC);
                            }
                            this.f14735e.put(strB, clsA);
                            if (z10) {
                                this.f14731a.put(h3Var.b(), hVarA);
                            }
                            return hVarA;
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f14733c.b("MediationAdapterManager", "Failed to load " + strC);
                        }
                        this.f14736f.add(strB);
                        return null;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14733c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, v2 v2Var) {
        synchronized (this.f14737g) {
            try {
                this.f14732b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14732b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f14738h.add(new a(str, str2, v2Var, this.f14732b));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private h a(h3 h3Var, Class cls, boolean z10) {
        try {
            return new h(h3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f14732b.z0()), z10, this.f14732b);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterManager", "Failed to load adapter: " + h3Var, th2);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            com.applovin.impl.sdk.o.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

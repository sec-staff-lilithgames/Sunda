package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h3 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f14067a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f14068b;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f14070d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f14072f;

    /* renamed from: g, reason: collision with root package name */
    private final f5 f14073g;

    /* renamed from: h, reason: collision with root package name */
    protected final f5 f14074h;

    /* renamed from: i, reason: collision with root package name */
    private String f14075i;

    /* renamed from: j, reason: collision with root package name */
    private String f14076j;

    /* renamed from: c, reason: collision with root package name */
    private final Object f14069c = new Object();

    /* renamed from: e, reason: collision with root package name */
    protected final Object f14071e = new Object();

    public h3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f14067a = kVar;
        if (((Boolean) kVar.a(v4.f16014q6)).booleanValue()) {
            this.f14073g = new f5(jSONObject2);
            this.f14074h = new f5(jSONObject);
            this.f14068b = null;
            this.f14070d = null;
        } else {
            this.f14068b = jSONObject2;
            this.f14070d = jSONObject;
            this.f14073g = null;
            this.f14074h = null;
        }
        this.f14072f = map;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f14067a.a(o3.S7)).intValue()));
    }

    public JSONObject a() {
        JSONObject jSONObject;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.a();
        }
        synchronized (this.f14071e) {
            jSONObject = this.f14070d;
        }
        return jSONObject;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        f5 f5Var = this.f14073g;
        if (f5Var != null) {
            return f5Var.a(str, bool);
        }
        synchronized (this.f14069c) {
            bool2 = JsonUtils.getBoolean(this.f14068b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean zHas;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.a(str);
        }
        synchronized (this.f14071e) {
            zHas = this.f14070d.has(str);
        }
        return zHas;
    }

    public boolean d(String str) {
        boolean zHas;
        f5 f5Var = this.f14073g;
        if (f5Var != null) {
            return f5Var.a(str);
        }
        synchronized (this.f14069c) {
            zHas = this.f14068b.has(str);
        }
        return zHas;
    }

    public Object e(String str) {
        Object objOpt;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.b(str);
        }
        synchronized (this.f14071e) {
            objOpt = this.f14070d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        f5 f5Var = this.f14073g;
        if (f5Var != null) {
            return f5Var.a();
        }
        synchronized (this.f14069c) {
            jSONObject = this.f14068b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f14075i;
    }

    public Map i() {
        return this.f14072f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            f5 f5Var = this.f14074h;
            bundle = f5Var != null ? (Bundle) f5Var.a(new cf.a(4)) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f14067a.o0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f14067a.a(o3.f14962o7)).longValue());
    }

    public Boolean n() {
        String str = this.f14067a.o0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f14067a.o0().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + AbstractJsonLexerKt.END_OBJ;
    }

    public void f(String str) {
        this.f14076j = str;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.a(str, bool);
        }
        synchronized (this.f14071e) {
            bool2 = JsonUtils.getBoolean(this.f14070d, str, bool);
        }
        return bool2;
    }

    public int b(String str, int i10) {
        int i11;
        f5 f5Var = this.f14073g;
        if (f5Var != null) {
            return f5Var.a(str, i10);
        }
        synchronized (this.f14069c) {
            i11 = JsonUtils.getInt(this.f14068b, str, i10);
        }
        return i11;
    }

    public void c(String str, int i10) {
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            f5Var.b(str, i10);
            return;
        }
        synchronized (this.f14071e) {
            JsonUtils.putInt(this.f14070d, str, i10);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f14067a.s0().j();
    }

    public String e() {
        return this.f14076j;
    }

    public void g(String str) {
        this.f14075i = str;
    }

    public float a(String str, float f10) {
        float f11;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.a(str, f10);
        }
        synchronized (this.f14071e) {
            f11 = JsonUtils.getFloat(this.f14070d, str, f10);
        }
        return f11;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        f5 f5Var = this.f14073g;
        if (f5Var != null) {
            return f5Var.a(str, jSONArray);
        }
        synchronized (this.f14069c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f14068b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, long j10) {
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            f5Var.b(str, j10);
            return;
        }
        synchronized (this.f14071e) {
            JsonUtils.putLong(this.f14070d, str, j10);
        }
    }

    public int a(String str, int i10) {
        int i11;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.a(str, i10);
        }
        synchronized (this.f14071e) {
            i11 = JsonUtils.getInt(this.f14070d, str, i10);
        }
        return i11;
    }

    public long b(String str, long j10) {
        long j11;
        f5 f5Var = this.f14073g;
        if (f5Var != null) {
            return f5Var.a(str, j10);
        }
        synchronized (this.f14069c) {
            j11 = JsonUtils.getLong(this.f14068b, str, j10);
        }
        return j11;
    }

    public void c(String str, String str2) {
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            f5Var.b(str, str2);
            return;
        }
        synchronized (this.f14071e) {
            JsonUtils.putString(this.f14070d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.a(str, jSONArray);
        }
        synchronized (this.f14071e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f14070d, str, jSONArray);
        }
        return jSONArray2;
    }

    public String b(String str, String str2) {
        String string;
        f5 f5Var = this.f14073g;
        if (f5Var != null) {
            return f5Var.a(str, str2);
        }
        synchronized (this.f14069c) {
            string = JsonUtils.getString(this.f14068b, str, str2);
        }
        return string;
    }

    public String c() {
        return a("name", (String) null);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.a(str, jSONObject);
        }
        synchronized (this.f14071e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f14070d, str, jSONObject);
        }
        return jSONObject2;
    }

    public String b() {
        return a("class", (String) null);
    }

    public List b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            f5 f5Var = this.f14073g;
            if (f5Var != null) {
                listOptList = f5Var.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            f5 f5Var2 = this.f14074h;
            if (f5Var2 != null) {
                listOptList2 = f5Var2.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            ArrayList arrayList = new ArrayList(listOptList2.size() + listOptList.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public long a(String str, long j10) {
        long j11;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.a(str, j10);
        }
        synchronized (this.f14071e) {
            j11 = JsonUtils.getLong(this.f14070d, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            return f5Var.a(str, str2);
        }
        synchronized (this.f14071e) {
            string = JsonUtils.getString(this.f14070d, str, str2);
        }
        return string;
    }

    public void a(String str, Object obj) {
        f5 f5Var = this.f14074h;
        if (f5Var != null) {
            f5Var.a(str, obj);
            return;
        }
        synchronized (this.f14071e) {
            JsonUtils.putObject(this.f14070d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(f5 f5Var) {
        return JsonUtils.toBundle(f5Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }
}

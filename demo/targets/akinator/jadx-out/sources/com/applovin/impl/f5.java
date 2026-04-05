package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f13960a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13961b = new Object();

    public f5(JSONObject jSONObject) {
        this.f13960a = jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f13961b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f13960a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f13961b) {
            stringList = JsonUtils.getStringList(this.f13960a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f13961b) {
            this.f13960a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f13961b) {
            string = this.f13960a.toString();
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f13961b) {
            zHas = this.f13960a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f13961b) {
            objOpt = this.f13960a.opt(str);
        }
        return objOpt;
    }

    public void a(w3.b bVar) {
        synchronized (this.f13961b) {
            bVar.accept(this);
        }
    }

    public void b(String str, int i10) {
        synchronized (this.f13961b) {
            JsonUtils.putInt(this.f13960a, str, i10);
        }
    }

    public Object a(t.a aVar) {
        Object objApply;
        synchronized (this.f13961b) {
            objApply = aVar.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j10) {
        synchronized (this.f13961b) {
            JsonUtils.putLong(this.f13960a, str, j10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f13961b) {
            bool2 = JsonUtils.getBoolean(this.f13960a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f13961b) {
            JsonUtils.putString(this.f13960a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f13961b) {
            f11 = JsonUtils.getFloat(this.f13960a, str, f10);
        }
        return f11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f13961b) {
            i11 = JsonUtils.getInt(this.f13960a, str, i10);
        }
        return i11;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f13961b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f13960a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f13961b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f13960a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f13961b) {
            j11 = JsonUtils.getLong(this.f13960a, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f13961b) {
            string = JsonUtils.getString(this.f13960a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f13961b) {
            integerList = JsonUtils.getIntegerList(this.f13960a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f13961b) {
            JsonUtils.putBoolean(this.f13960a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f13961b) {
            JsonUtils.putObject(this.f13960a, str, obj);
        }
    }
}

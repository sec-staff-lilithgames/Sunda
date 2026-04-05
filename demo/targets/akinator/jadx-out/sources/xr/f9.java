package xr;

import androidx.core.app.NotificationCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f9 {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f92507a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f92508b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f92509c;

    /* renamed from: d, reason: collision with root package name */
    public final sc f92510d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f92511e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f92512f;

    public f9(d9 d9Var, HashMap map, HashMap map2, sc scVar, Object obj, Map map3) {
        this.f92507a = d9Var;
        this.f92508b = Collections.unmodifiableMap(new HashMap(map));
        this.f92509c = Collections.unmodifiableMap(new HashMap(map2));
        this.f92510d = scVar;
        this.f92511e = obj;
        this.f92512f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static f9 a(Map map, boolean z10, int i10, int i11, Object obj) {
        sc scVar;
        Map<String, ?> object;
        sc scVar2;
        if (z10) {
            if (map == null || (object = o6.getObject(map, "retryThrottling")) == null) {
                scVar2 = null;
            } else {
                float fFloatValue = o6.getNumberAsDouble(object, "maxTokens").floatValue();
                float fFloatValue2 = o6.getNumberAsDouble(object, "tokenRatio").floatValue();
                mh.p1.checkState(fFloatValue > 0.0f, "maxToken should be greater than zero");
                mh.p1.checkState(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                scVar2 = new sc(fFloatValue, fFloatValue2);
            }
            scVar = scVar2;
        } else {
            scVar = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map<String, ?> healthCheckedService = ke.getHealthCheckedService(map);
        List<Map<String, ?>> listOfObjects = o6.getListOfObjects(map, "methodConfig");
        if (listOfObjects == null) {
            return new f9(null, map2, map3, scVar, obj, healthCheckedService);
        }
        d9 d9Var = null;
        for (Map<String, ?> map4 : listOfObjects) {
            d9 d9Var2 = new d9(map4, z10, i10, i11);
            List<Map<String, ?>> listOfObjects2 = o6.getListOfObjects(map4, "name");
            if (listOfObjects2 != null && !listOfObjects2.isEmpty()) {
                for (Map<String, ?> map5 : listOfObjects2) {
                    String string = o6.getString(map5, NotificationCompat.CATEGORY_SERVICE);
                    String string2 = o6.getString(map5, "method");
                    if (mh.u2.isNullOrEmpty(string)) {
                        mh.p1.checkArgument(mh.u2.isNullOrEmpty(string2), "missing service name for method %s", string2);
                        mh.p1.checkArgument(d9Var == null, "Duplicate default method config in service config %s", map);
                        d9Var = d9Var2;
                    } else if (mh.u2.isNullOrEmpty(string2)) {
                        mh.p1.checkArgument(!map3.containsKey(string), "Duplicate service %s", string);
                        map3.put(string, d9Var2);
                    } else {
                        String strGenerateFullMethodName = wr.k4.generateFullMethodName(string, string2);
                        mh.p1.checkArgument(!map2.containsKey(strGenerateFullMethodName), "Duplicate method name %s", strGenerateFullMethodName);
                        map2.put(strGenerateFullMethodName, d9Var2);
                    }
                }
            }
        }
        return new f9(d9Var, map2, map3, scVar, obj, healthCheckedService);
    }

    public final e9 b() {
        if (this.f92509c.isEmpty() && this.f92508b.isEmpty() && this.f92507a == null) {
            return null;
        }
        return new e9(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f9.class == obj.getClass()) {
            f9 f9Var = (f9) obj;
            if (mh.h1.equal(this.f92507a, f9Var.f92507a) && mh.h1.equal(this.f92508b, f9Var.f92508b) && mh.h1.equal(this.f92509c, f9Var.f92509c) && mh.h1.equal(this.f92510d, f9Var.f92510d) && mh.h1.equal(this.f92511e, f9Var.f92511e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f92507a, this.f92508b, this.f92509c, this.f92510d, this.f92511e);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("defaultMethodConfig", this.f92507a).add("serviceMethodMap", this.f92508b).add("serviceMap", this.f92509c).add("retryThrottling", this.f92510d).add("loadBalancingConfig", this.f92511e).toString();
    }
}

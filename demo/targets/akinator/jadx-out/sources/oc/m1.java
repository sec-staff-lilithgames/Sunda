package oc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f78903a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f78904b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78905c;

    /* renamed from: d, reason: collision with root package name */
    public String f78906d;

    /* renamed from: e, reason: collision with root package name */
    public LinkedHashMap f78907e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f78908f;

    public m1(m1 m1Var) {
        this.f78903a = m1Var;
        this.f78904b = false;
        this.f78905c = false;
    }

    public static List<Object> emptyList() {
        return new ArrayList(2);
    }

    public static Map<String, Object> emptyMap() {
        return new LinkedHashMap(2);
    }

    public static m1 rootArrayScope() {
        return new m1(null);
    }

    public static m1 rootObjectScope(boolean z10) {
        return new m1(null, z10);
    }

    public final void a(Object obj, String str) {
        LinkedHashMap linkedHashMap = this.f78907e;
        if (linkedHashMap == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            this.f78907e = linkedHashMap2;
            linkedHashMap2.put(str, obj);
            return;
        }
        Object objPut = linkedHashMap.put(str, obj);
        if (objPut != null) {
            if (objPut instanceof List) {
                ((List) objPut).add(obj);
                this.f78907e.put(str, objPut);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(objPut);
                arrayList.add(obj);
                this.f78907e.put(str, arrayList);
            }
        }
    }

    public void addValue(Object obj) {
        if (this.f78908f == null) {
            this.f78908f = new ArrayList();
        }
        this.f78908f.add(obj);
    }

    public m1 childArray() {
        return new m1(this);
    }

    public m1 childObject() {
        return new m1(this, this.f78905c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m1 finishBranchArray(boolean z10) {
        Object objEmptyList;
        ArrayList arrayList = this.f78908f;
        ArrayList array = arrayList;
        if (arrayList == null) {
            objEmptyList = z10 ? n1.f78916g : emptyList();
        } else {
            if (z10) {
                array = arrayList.toArray(n1.f78916g);
            }
            this.f78908f = null;
            objEmptyList = array;
        }
        m1 m1Var = this.f78903a;
        if (m1Var.isObject()) {
            return m1Var.putDeferredValue(objEmptyList);
        }
        m1Var.addValue(objEmptyList);
        return m1Var;
    }

    public m1 finishBranchObject() {
        LinkedHashMap linkedHashMap = this.f78907e;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            this.f78907e = null;
        }
        m1 m1Var = this.f78903a;
        if (m1Var.isObject()) {
            return m1Var.putDeferredValue(linkedHashMap);
        }
        m1Var.addValue(linkedHashMap);
        return m1Var;
    }

    public Object finishRootArray(boolean z10) {
        ArrayList arrayList = this.f78908f;
        return arrayList == null ? z10 ? n1.f78916g : emptyList() : z10 ? arrayList.toArray(n1.f78916g) : arrayList;
    }

    public Object finishRootObject() {
        LinkedHashMap linkedHashMap = this.f78907e;
        return linkedHashMap == null ? emptyMap() : linkedHashMap;
    }

    public boolean isObject() {
        return this.f78904b;
    }

    public m1 putDeferredValue(Object obj) {
        String str = this.f78906d;
        Objects.requireNonNull(str);
        this.f78906d = null;
        if (this.f78905c) {
            a(obj, str);
            return this;
        }
        if (this.f78907e == null) {
            this.f78907e = new LinkedHashMap();
        }
        this.f78907e.put(str, obj);
        return this;
    }

    public void putValue(String str, Object obj) {
        if (this.f78905c) {
            a(obj, str);
            return;
        }
        if (this.f78907e == null) {
            this.f78907e = new LinkedHashMap();
        }
        this.f78907e.put(str, obj);
    }

    public m1 childArray(String str) {
        this.f78906d = str;
        return new m1(this);
    }

    public m1 childObject(String str) {
        this.f78906d = str;
        return new m1(this, this.f78905c);
    }

    public m1(m1 m1Var, boolean z10) {
        this.f78903a = m1Var;
        this.f78904b = true;
        this.f78905c = z10;
    }
}

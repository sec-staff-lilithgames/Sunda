package com.google.gson;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t extends q {

    /* renamed from: b, reason: collision with root package name */
    public final mk.r f30069b = new mk.r(false);

    public void add(String str, q qVar) {
        if (qVar == null) {
            qVar = s.f30067b;
        }
        this.f30069b.put(str, qVar);
    }

    public void addProperty(String str, String str2) {
        add(str, str2 == null ? s.f30067b : new v(str2));
    }

    public Map<String, q> asMap() {
        return this.f30069b;
    }

    public Set<Map.Entry<String, q>> entrySet() {
        return this.f30069b.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof t) && ((t) obj).f30069b.equals(this.f30069b);
        }
        return true;
    }

    public q get(String str) {
        return (q) this.f30069b.get(str);
    }

    public p getAsJsonArray(String str) {
        return (p) this.f30069b.get(str);
    }

    public t getAsJsonObject(String str) {
        return (t) this.f30069b.get(str);
    }

    public v getAsJsonPrimitive(String str) {
        return (v) this.f30069b.get(str);
    }

    public boolean has(String str) {
        return this.f30069b.containsKey(str);
    }

    public int hashCode() {
        return this.f30069b.hashCode();
    }

    public boolean isEmpty() {
        return this.f30069b.isEmpty();
    }

    public Set<String> keySet() {
        return this.f30069b.keySet();
    }

    public q remove(String str) {
        return (q) this.f30069b.remove(str);
    }

    public int size() {
        return this.f30069b.size();
    }

    public void addProperty(String str, Number number) {
        add(str, number == null ? s.f30067b : new v(number));
    }

    @Override // com.google.gson.q
    public t deepCopy() {
        t tVar = new t();
        for (Map.Entry<Object, Object> entry : this.f30069b.entrySet()) {
            tVar.add((String) entry.getKey(), ((q) entry.getValue()).deepCopy());
        }
        return tVar;
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? s.f30067b : new v(bool));
    }

    public void addProperty(String str, Character ch2) {
        add(str, ch2 == null ? s.f30067b : new v(ch2));
    }
}

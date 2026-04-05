package mk;

import com.ironsource.C3191e4;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public q f74781b;

    /* renamed from: c, reason: collision with root package name */
    public q f74782c;

    /* renamed from: e, reason: collision with root package name */
    public q f74783e;

    /* renamed from: f, reason: collision with root package name */
    public q f74784f;

    /* renamed from: g, reason: collision with root package name */
    public q f74785g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f74786h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f74787i;

    /* renamed from: j, reason: collision with root package name */
    public Object f74788j;

    /* renamed from: k, reason: collision with root package name */
    public int f74789k;

    public q(boolean z10) {
        this.f74786h = null;
        this.f74787i = z10;
        this.f74785g = this;
        this.f74784f = this;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f74786h;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f74788j;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public q first() {
        q qVar = this;
        for (q qVar2 = this.f74782c; qVar2 != null; qVar2 = qVar2.f74782c) {
            qVar = qVar2;
        }
        return qVar;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f74786h;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f74788j;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object obj = this.f74786h;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f74788j;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public q last() {
        q qVar = this;
        for (q qVar2 = this.f74783e; qVar2 != null; qVar2 = qVar2.f74783e) {
            qVar = qVar2;
        }
        return qVar;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj == null && !this.f74787i) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f74788j;
        this.f74788j = obj;
        return obj2;
    }

    public String toString() {
        return this.f74786h + C3191e4.i.f36525b + this.f74788j;
    }

    public q(boolean z10, q qVar, Object obj, q qVar2, q qVar3) {
        this.f74781b = qVar;
        this.f74786h = obj;
        this.f74787i = z10;
        this.f74789k = 1;
        this.f74784f = qVar2;
        this.f74785g = qVar3;
        qVar3.f74784f = this;
        qVar2.f74785g = this;
    }
}

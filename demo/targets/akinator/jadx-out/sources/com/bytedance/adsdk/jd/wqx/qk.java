package com.bytedance.adsdk.jd.wqx;

import android.util.Pair;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk<T> {

    /* renamed from: jd, reason: collision with root package name */
    T f17523jd;
    T jpo;

    private static boolean jd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return jd(pair.first, this.jpo) && jd(pair.second, this.f17523jd);
    }

    public int hashCode() {
        T t10 = this.jpo;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f17523jd;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public void jpo(T t10, T t11) {
        this.jpo = t10;
        this.f17523jd = t11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.jpo);
        sb2.append(" ");
        return i.e(sb2, this.f17523jd, "}");
    }
}

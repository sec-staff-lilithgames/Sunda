package com.bytedance.adsdk.jd;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.jd.if, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Cif<V> {

    /* renamed from: jd, reason: collision with root package name */
    private final Throwable f17232jd;
    private final V jpo;

    public Cif(V v10) {
        this.jpo = v10;
        this.f17232jd = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cif)) {
            return false;
        }
        Cif cif = (Cif) obj;
        if (jpo() != null && jpo().equals(cif.jpo())) {
            return true;
        }
        if (jd() == null || cif.jd() == null) {
            return false;
        }
        return jd().toString().equals(jd().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{jpo(), jd()});
    }

    public Throwable jd() {
        return this.f17232jd;
    }

    public V jpo() {
        return this.jpo;
    }

    public Cif(Throwable th2) {
        this.f17232jd = th2;
        this.jpo = null;
    }
}

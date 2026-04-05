package com.google.android.gms.auth.api.signin.internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class HashAccumulator {
    private int zaa = 1;

    public HashAccumulator addObject(Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int hash() {
        return this.zaa;
    }

    public final HashAccumulator zaa(boolean z10) {
        this.zaa = (this.zaa * 31) + (z10 ? 1 : 0);
        return this;
    }
}

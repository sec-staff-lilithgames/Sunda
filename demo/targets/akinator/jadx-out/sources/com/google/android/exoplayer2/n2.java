package com.google.android.exoplayer2;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n2 implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final String f27829c;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.p f27830b;

    static {
        new m2().build();
        f27829c = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);
    }

    public n2(com.google.android.exoplayer2.util.p pVar) {
        this.f27830b = pVar;
    }

    public m2 buildUpon() {
        return new m2(this);
    }

    public boolean contains(int i10) {
        return this.f27830b.contains(i10);
    }

    public boolean containsAny(int... iArr) {
        return this.f27830b.containsAny(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n2) {
            return this.f27830b.equals(((n2) obj).f27830b);
        }
        return false;
    }

    public int get(int i10) {
        return this.f27830b.get(i10);
    }

    public int hashCode() {
        return this.f27830b.hashCode();
    }

    public int size() {
        return this.f27830b.size();
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            com.google.android.exoplayer2.util.p pVar = this.f27830b;
            if (i10 >= pVar.size()) {
                bundle.putIntegerArrayList(f27829c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(pVar.get(i10)));
            i10++;
        }
    }
}

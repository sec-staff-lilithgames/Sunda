package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    private final j4 f15728a = new j4();

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet f15729b = new TreeSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map f15730c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f15731d;

    /* renamed from: e, reason: collision with root package name */
    private int f15732e;

    public t2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.o.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f15728a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f15728a.isEmpty()) {
            this.f15728a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f15728a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f15728a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f15728a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f15729b);
    }

    public int c() {
        int i10 = this.f15731d;
        if (i10 != -1 && this.f15732e != -1) {
            while (i10 <= this.f15732e) {
                if (g(i10) && !h(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public int d(int i10) {
        if (g(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public Collection e(int i10) {
        return new TreeSet((SortedSet) this.f15729b.tailSet(Integer.valueOf(i10), false));
    }

    public void f(int i10) {
        int iB = this.f15728a.b(Integer.valueOf(i10));
        for (int size = this.f15728a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f15728a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f15728a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i10) {
        return this.f15728a.contains(Integer.valueOf(i10));
    }

    public boolean h(int i10) {
        return this.f15729b.contains(Integer.valueOf(i10));
    }

    public void i(int i10) {
        int iB = this.f15728a.b(Integer.valueOf(i10));
        if (g(i10)) {
            this.f15730c.remove(Integer.valueOf(i10));
            this.f15729b.remove(Integer.valueOf(i10));
            this.f15728a.b(iB);
        }
        while (iB < this.f15728a.size()) {
            Integer num = (Integer) this.f15728a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f15728a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public void b(int i10, int i11) {
        i(i10);
        f(i11);
    }

    public void c(int i10, int i11) {
        this.f15731d = i10;
        this.f15732e = i11;
    }

    public int c(int i10) {
        return i10 + a(i10, false);
    }

    public MaxAd a(int i10) {
        return (MaxAd) this.f15730c.get(Integer.valueOf(i10));
    }

    public void a(MaxAd maxAd, int i10) {
        this.f15730c.put(Integer.valueOf(i10), maxAd);
        this.f15729b.add(Integer.valueOf(i10));
    }

    public void a() {
        this.f15730c.clear();
        this.f15729b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f15730c.remove(num);
            this.f15729b.remove(num);
        }
    }

    private void a(int i10, int i11) {
        if (this.f15730c.containsKey(Integer.valueOf(i10))) {
            this.f15730c.put(Integer.valueOf(i11), (MaxAd) this.f15730c.get(Integer.valueOf(i10)));
            this.f15729b.add(Integer.valueOf(i11));
            this.f15730c.remove(Integer.valueOf(i10));
            this.f15729b.remove(Integer.valueOf(i10));
        }
    }

    private int a(int i10, boolean z10) {
        int iC = this.f15728a.c(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + iC;
            while (iC < this.f15728a.size() && i11 >= ((Integer) this.f15728a.a(iC)).intValue()) {
                i11++;
                iC++;
            }
        }
        return iC;
    }
}

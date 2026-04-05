package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final int f37521c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f37522d = 0;

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, ArrayList<a>> f37523a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private int f37524b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public h(List<NetworkSettings> list, int i10) {
        this.f37524b = i10;
        for (NetworkSettings networkSettings : list) {
            this.f37523a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    public void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f37524b == 0) {
            return;
        }
        for (String str : this.f37523a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.f37523a.get(str);
            if (this.f37524b != -1 && arrayList.size() == this.f37524b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }

    public String a(String str) {
        ArrayList<a> arrayList = this.f37523a.get(str);
        String string = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            string = "" + it.next().ordinal();
            while (it.hasNext()) {
                StringBuilder sbU = o2.u(j1.o2.l(string, ","));
                sbU.append(it.next().ordinal());
                string = sbU.toString();
            }
        }
        return string;
    }
}

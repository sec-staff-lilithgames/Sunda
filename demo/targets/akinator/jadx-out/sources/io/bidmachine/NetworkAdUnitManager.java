package io.bidmachine;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class NetworkAdUnitManager {
    private final AtomicBoolean isNetworkAuctionNotified;
    private final List<NetworkAdUnit> networkAdUnitList;
    private final pr.n tag;

    public NetworkAdUnitManager() {
        this(null);
    }

    public NetworkAdUnit findOrAddWinnerNetworkAdUnit(NetworkAdapter networkAdapter, AdsFormat adsFormat, Map<String, String> map) {
        String str = map.get(ProtoExtConstants.AD_UNIT_ID);
        NetworkAdUnit networkAdUnit = null;
        if (!TextUtils.isEmpty(str)) {
            for (NetworkAdUnit networkAdUnit2 : this.networkAdUnitList) {
                if (networkAdUnit2.getId().equals(str)) {
                    networkAdUnit = networkAdUnit2;
                }
            }
        }
        if (networkAdUnit != null) {
            return networkAdUnit;
        }
        NetworkAdUnit networkAdUnit3 = new NetworkAdUnit(networkAdapter, adsFormat, map);
        this.networkAdUnitList.add(networkAdUnit3);
        return networkAdUnit3;
    }

    public List<NetworkAdUnit> getNetworkAdUnitList() {
        return this.networkAdUnitList;
    }

    public void notifyNetworkAuctionResult(NetworkAdUnit networkAdUnit) {
        if (this.isNetworkAuctionNotified.compareAndSet(false, true)) {
            nm.a.d(this.tag, "notifyNetworkAuctionResult");
            for (NetworkAdUnit networkAdUnit2 : this.networkAdUnitList) {
                if (networkAdUnit2 == networkAdUnit) {
                    try {
                        networkAdUnit2.onWinAuction();
                    } catch (Throwable unused) {
                    }
                } else {
                    networkAdUnit2.onLossAuction();
                }
            }
        }
    }

    public void notifyNetworkClearAuction() {
        if (this.networkAdUnitList.isEmpty()) {
            return;
        }
        nm.a.d(this.tag, "notifyNetworkClearAuction");
        Iterator<NetworkAdUnit> it = this.networkAdUnitList.iterator();
        while (it.hasNext()) {
            try {
                it.next().clearAuction();
            } catch (Throwable unused) {
            }
        }
        this.networkAdUnitList.clear();
    }

    public void setNetworkAdUnitList(List<NetworkAdUnit> list) {
        this.networkAdUnitList.clear();
        if (nm.j.isEmpty(list)) {
            return;
        }
        this.networkAdUnitList.addAll(list);
    }

    public NetworkAdUnitManager(List<NetworkAdUnit> list) {
        this.tag = new pr.n("NetworkAdUnitManager");
        this.isNetworkAuctionNotified = new AtomicBoolean(false);
        this.networkAdUnitList = new CopyOnWriteArrayList();
        setNetworkAdUnitList(list);
    }
}

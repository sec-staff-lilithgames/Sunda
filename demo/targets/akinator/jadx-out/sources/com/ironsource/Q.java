package com.ironsource;

import com.ironsource.O;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q implements O, O.a {

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f35210a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, N> f35211b;

    /* JADX WARN: Multi-variable type inference failed */
    public Q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.O
    public N a(String adId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        this.f35210a.readLock().lock();
        try {
            return this.f35211b.get(adId);
        } finally {
            this.f35210a.readLock().unlock();
        }
    }

    public Q(ReadWriteLock readWriteLock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(readWriteLock, "readWriteLock");
        this.f35210a = readWriteLock;
        this.f35211b = new LinkedHashMap();
    }

    @Override // com.ironsource.O
    public List<N> a() {
        this.f35210a.readLock().lock();
        List<N> list = uu.y0.toList(this.f35211b.values());
        this.f35210a.readLock().unlock();
        return list;
    }

    public /* synthetic */ Q(ReadWriteLock readWriteLock, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.O.a
    public void a(N adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f35210a.writeLock().lock();
        try {
            if (this.f35211b.get(adInfo.c()) == null) {
                this.f35211b.put(adInfo.c(), adInfo);
            }
        } finally {
            this.f35210a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.O.a
    public void a(JSONObject json, EnumC3330m0 adStatus, String adId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.e0.checkNotNullParameter(adStatus, "adStatus");
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        this.f35210a.writeLock().lock();
        try {
            N n9 = this.f35211b.get(adId);
            if (n9 == null) {
                this.f35210a.writeLock().unlock();
                return;
            }
            String bundleId = json.optString("bundleId");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bundleId, "bundleId");
            if (bundleId.length() > 0) {
                n9.a(bundleId);
            }
            String dynamicDemandSourceId = json.optString("dynamicDemandSource");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(dynamicDemandSourceId, "dynamicDemandSourceId");
            if (dynamicDemandSourceId.length() > 0) {
                n9.a(W7.f35680b.a(dynamicDemandSourceId));
            }
            n9.a(adStatus);
            this.f35210a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f35210a.writeLock().unlock();
            throw th2;
        }
    }

    @Override // com.ironsource.O.a
    public void a(EnumC3330m0 adStatus, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adStatus, "adStatus");
        kotlin.jvm.internal.e0.checkNotNullParameter(str, SFPXhf.PnlkiMyAC);
        this.f35210a.writeLock().lock();
        try {
            N n9 = this.f35211b.get(str);
            if (n9 == null) {
                return;
            }
            n9.a(adStatus);
            n9.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.f35210a.writeLock().unlock();
        }
    }
}

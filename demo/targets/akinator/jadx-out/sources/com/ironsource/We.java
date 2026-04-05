package com.ironsource;

import com.ironsource.Q8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class We implements Q8, Q8.a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, C3502w> f35690a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C3397pc f35691b = new C3397pc();

    /* renamed from: c, reason: collision with root package name */
    private final ReadWriteLock f35692c = new ReentrantReadWriteLock();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35693a;

        static {
            int[] iArr = new int[Ve.values().length];
            try {
                iArr[Ve.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ve.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ve.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35693a = iArr;
        }
    }

    private final void b() {
        Ue configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        C3397pc c3397pc = this.f35691b;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(configuration, "configuration");
        c3397pc.a(a(configuration));
        this.f35691b.a(a());
    }

    @Override // com.ironsource.Q8.a
    public void a(Xe historyRecord) {
        kotlin.jvm.internal.e0.checkNotNullParameter(historyRecord, "historyRecord");
        this.f35692c.writeLock().lock();
        try {
            N nA = historyRecord.a();
            String strValueOf = String.valueOf(nA != null ? nA.b() : null);
            Map<String, C3502w> map = this.f35690a;
            C3502w c3502w = map.get(strValueOf);
            if (c3502w == null) {
                c3502w = new C3502w();
                map.put(strValueOf, c3502w);
            }
            c3502w.a(historyRecord.a(new C3184df()));
            this.f35692c.writeLock().unlock();
            b();
        } catch (Throwable th2) {
            this.f35692c.writeLock().unlock();
            throw th2;
        }
    }

    @Override // com.ironsource.Q8
    public JSONObject a(EnumC3238gf mode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mode, "mode");
        this.f35692c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C3502w> entry : this.f35690a.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectA = entry.getValue().a(mode);
                if (jSONObjectA.length() > 0) {
                    jSONObject.put(key, jSONObjectA);
                }
            }
            return jSONObject;
        } finally {
            this.f35692c.readLock().unlock();
        }
    }

    @Override // com.ironsource.Q8
    public int a(IronSource.a adFormat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        this.f35692c.readLock().lock();
        try {
            C3502w c3502w = this.f35690a.get(adFormat.toString());
            return c3502w != null ? c3502w.a() : 0;
        } finally {
            this.f35692c.readLock().unlock();
        }
    }

    @Override // com.ironsource.Q8
    public List<String> a() {
        this.f35692c.readLock().lock();
        try {
            Map<String, C3502w> map = this.f35690a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C3502w> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<String> list = uu.y0.toList(linkedHashMap.keySet());
            this.f35692c.readLock().unlock();
            return list;
        } catch (Throwable th2) {
            this.f35692c.readLock().unlock();
            throw th2;
        }
    }

    @Override // com.ironsource.Q8
    public Map<String, JSONObject> a(Ue configuration) {
        Map<String, JSONObject> mapMutableMapOf;
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        this.f35692c.readLock().lock();
        try {
            int i10 = a.f35693a[configuration.a().ordinal()];
            if (i10 == 1) {
                mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to(Q6.f35316y1, a(EnumC3238gf.FullHistory)), tu.e0.to(Q6.f35319z1, a(EnumC3238gf.CurrentlyLoadedAds)));
            } else if (i10 == 2) {
                mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to(Q6.f35319z1, a(EnumC3238gf.CurrentlyLoadedAds)));
            } else {
                if (i10 != 3) {
                    throw new tu.t();
                }
                mapMutableMapOf = uu.p1.emptyMap();
            }
            this.f35692c.readLock().unlock();
            return mapMutableMapOf;
        } catch (Throwable th2) {
            this.f35692c.readLock().unlock();
            throw th2;
        }
    }
}

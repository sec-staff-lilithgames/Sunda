package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.inmobi.ads.exceptions.VastException;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C2977rf;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2977rf {

    /* renamed from: a, reason: collision with root package name */
    public static final C2977rf f33332a = new C2977rf();

    /* renamed from: b, reason: collision with root package name */
    public static final tu.o f33333b = tu.q.lazy(C2961qf.f33294a);

    /* renamed from: c, reason: collision with root package name */
    public static final tu.o f33334c = tu.q.lazy(C2944pf.f33275a);

    public static void a(C2793h ad2, AdConfig adConfig, InterfaceC2994sf interfaceC2994sf, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        ((ExecutorService) f33333b.getValue()).execute(new zk.p0(1, ad2, adConfig, interfaceC2994sf, f52));
    }

    public static final void b(C2793h ad2, AdConfig adConfig, InterfaceC2994sf interfaceC2994sf, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "$ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "$adConfig");
        C2977rf c2977rf = f33332a;
        try {
            if (c2977rf.a(ad2.s(), interfaceC2994sf)) {
                C2793h c2793hA = K.a(ad2, adConfig, f52);
                if (c2793hA == null) {
                    c2977rf.a(ad2, false, (short) 75);
                } else {
                    c2977rf.a(c2793hA, true, (short) 0);
                }
            }
        } catch (VastException e10) {
            c2977rf.a(ad2, false, e10.getTelemetryErrorCode());
        } catch (JSONException unused) {
            c2977rf.a(ad2, false, (short) 58);
        }
    }

    public final synchronized boolean a(String str, InterfaceC2994sf interfaceC2994sf) {
        tu.o oVar = f33334c;
        List list = (List) ((HashMap) oVar.getValue()).get(str);
        if (list != null) {
            list.add(new WeakReference(interfaceC2994sf));
            return false;
        }
        ((HashMap) oVar.getValue()).put(str, uu.p0.mutableListOf(new WeakReference(interfaceC2994sf)));
        return true;
    }

    public final synchronized void a(final C2793h c2793h, final boolean z10, final short s10) {
        tu.x0 x0Var;
        try {
            List list = (List) ((HashMap) f33334c.getValue()).remove(c2793h.s());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final InterfaceC2994sf interfaceC2994sf = (InterfaceC2994sf) ((WeakReference) it.next()).get();
                    if (interfaceC2994sf != null) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: zk.v0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2977rf.a(interfaceC2994sf, c2793h, z10, s10);
                            }
                        });
                    } else {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_REFRESHFLAG, "TAG");
                    }
                }
                x0Var = tu.x0.f87415a;
            } else {
                x0Var = null;
            }
            if (x0Var == null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_REFRESHFLAG, "TAG");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final void a(InterfaceC2994sf interfaceC2994sf, C2793h ad2, boolean z10, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "$ad");
        interfaceC2994sf.a(ad2, z10, s10);
    }
}

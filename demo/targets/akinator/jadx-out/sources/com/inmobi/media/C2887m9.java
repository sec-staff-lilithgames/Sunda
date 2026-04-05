package com.inmobi.media;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.m9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2887m9 extends C2903n8 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public int D;
    public int E;
    public HashMap F;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f33091x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f33092y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f33093z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2887m9(String assetId, String assetName, C2870l9 assetStyle, InterfaceC3028uf interfaceC3028uf, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, ArrayList arrayList, boolean z15) {
        super(assetId, assetName, "VIDEO", assetStyle, 16);
        kotlin.jvm.internal.e0.checkNotNullParameter(assetId, "assetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetName, "assetName");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        this.f33091x = z15;
        this.f33140e = interfaceC3028uf;
        kotlin.jvm.internal.e0.checkNotNullParameter("EXTERNAL", "<set-?>");
        this.f33142g = "EXTERNAL";
        this.f33093z = z10;
        this.A = z11;
        this.B = z12;
        this.C = z13;
        this.f33092y = new ArrayList();
        Map map = null;
        this.f33151p = interfaceC3028uf != null ? ((C3011tf) interfaceC3028uf).f33415k : null;
        ArrayList<C2752e9> trackers = interfaceC3028uf != null ? ((C3011tf) interfaceC3028uf).f33412h : null;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2752e9 c2752e9 = (C2752e9) it.next();
                if (kotlin.jvm.internal.e0.areEqual("OMID_VIEWABILITY", c2752e9.f32815b)) {
                    map = c2752e9.f32816c;
                    if (!TextUtils.isEmpty(c2752e9.f32817d) && kotlin.jvm.internal.h1.isMutableList(trackers)) {
                        trackers.add(c2752e9);
                    }
                } else if (kotlin.jvm.internal.h1.isMutableList(trackers)) {
                    trackers.add(c2752e9);
                }
            }
        }
        if (trackers != null) {
            for (C2752e9 c2752e92 : trackers) {
                if (kotlin.jvm.internal.e0.areEqual("OMID_VIEWABILITY", c2752e92.f32815b)) {
                    c2752e92.f32816c = map;
                }
            }
        }
        if (trackers != null && !trackers.isEmpty()) {
            kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
            this.f33154s.addAll(trackers);
        }
        HashMap map2 = this.f33155t;
        map2.put("placementType", (byte) 0);
        map2.put("lastVisibleTimestamp", Integer.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        map2.put("visible", bool);
        map2.put("seekPosition", 0);
        map2.put("didStartPlaying", bool);
        map2.put("didPause", bool);
        map2.put("didCompleteQ1", bool);
        map2.put("didCompleteQ2", bool);
        map2.put("didCompleteQ3", bool);
        map2.put("didCompleteQ4", bool);
        map2.put("didRequestFullScreen", bool);
        map2.put("isFullScreen", bool);
        map2.put("didImpressionFire", bool);
        map2.put("mapViewabilityParams", new HashMap());
        map2.put("didSignalVideoCompleted", bool);
        map2.put("shouldAutoPlay", Boolean.valueOf(z14));
        map2.put("lastMediaVolume", 0);
        map2.put("currentMediaVolume", 0);
        map2.put("didQ4Fire", bool);
    }

    public final void a(HashMap map) {
        this.F = new HashMap(map);
    }

    public final int b() {
        return this.D;
    }

    public final boolean c() {
        return this.f33091x ? this.f33093z && !C2925od.o() : this.f33093z;
    }

    public final void d(int i10) {
        this.E = i10;
    }

    public final void a(C2887m9 source) {
        HashMap map;
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        this.f33155t.putAll(source.f33155t);
        HashMap map2 = source.F;
        if (map2 != null && (map = this.F) != null) {
            map.putAll(map2);
        }
        ArrayList trackers = source.f33154s;
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        this.f33154s.addAll(trackers);
    }

    public final InterfaceC3028uf d() {
        Object obj = this.f33140e;
        if (obj instanceof InterfaceC3028uf) {
            return (InterfaceC3028uf) obj;
        }
        return null;
    }

    public final void c(int i10) {
        this.D = i10;
    }
}

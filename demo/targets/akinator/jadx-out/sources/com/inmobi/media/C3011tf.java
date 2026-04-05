package com.inmobi.media;

import com.applovin.shadow.okio.Segment;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.tf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3011tf implements InterfaceC3028uf {

    /* renamed from: a, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f33405a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33406b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33407c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33408d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f33409e;

    /* renamed from: f, reason: collision with root package name */
    public String f33410f;

    /* renamed from: g, reason: collision with root package name */
    public String f33411g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f33412h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f33413i;

    /* renamed from: j, reason: collision with root package name */
    public C2859kf f33414j;

    /* renamed from: k, reason: collision with root package name */
    public String f33415k;

    /* renamed from: l, reason: collision with root package name */
    public int f33416l;

    public C3011tf(List trackers, AdConfig.VastVideoConfig vastVideoConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        kotlin.jvm.internal.e0.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        this.f33405a = vastVideoConfig;
        this.f33406b = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.f33407c = Segment.SIZE;
        this.f33408d = 60;
        ArrayList arrayList = new ArrayList();
        this.f33412h = arrayList;
        arrayList.addAll(trackers);
        this.f33409e = new ArrayList();
        this.f33413i = new ArrayList();
        this.f33416l = 0;
    }

    public static boolean a(double d10, double d11, double d12) {
        return d12 > d10 && d12 <= d11;
    }

    public final String b() {
        C2876lf c2876lf;
        int iA;
        String str = this.f33410f;
        if (str != null) {
            return str;
        }
        C2913o1 c2913o1A = AbstractC2807hd.a();
        c2913o1A.getClass();
        ArrayList<C2826j> arrayListA = V1.a(c2913o1A, null, null, null, null, "created_ts DESC ", null, 47);
        ArrayList arrayList = new ArrayList();
        for (C2826j c2826j : arrayListA) {
            if (c2826j != null) {
                arrayList.add(c2826j);
            }
        }
        ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C2826j) it.next()).f32940b);
        }
        C2876lf c2876lf2 = null;
        if (arrayList2.isEmpty()) {
            c2876lf = null;
        } else {
            Iterator it2 = this.f33409e.iterator();
            while (it2.hasNext()) {
                c2876lf = (C2876lf) it2.next();
                if (arrayList2.contains(c2876lf.f33060a)) {
                    break;
                }
            }
            c2876lf = null;
        }
        if (c2876lf != null) {
            String str2 = c2876lf.f33060a;
            this.f33410f = str2;
            return str2;
        }
        double optimalVastVideoSize = (this.f33405a.getOptimalVastVideoSize() * 2.0d) / this.f33406b;
        double vastMaxAssetSize = (this.f33405a.getVastMaxAssetSize() * 1.0d) / this.f33406b;
        Iterator it3 = this.f33409e.iterator();
        while (it3.hasNext()) {
            C2876lf c2876lf3 = (C2876lf) it3.next();
            try {
                iA = a();
            } catch (ArrayIndexOutOfBoundsException e10) {
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                iA = 0;
            }
            double d10 = ((c2876lf3.f33061b * 1.0d) * iA) / this.f33407c;
            c2876lf3.f33062c = d10;
            double d11 = optimalVastVideoSize;
            if (!a(0.0d, d11, d10)) {
                optimalVastVideoSize = d11;
                if (a(optimalVastVideoSize, vastMaxAssetSize, d10) && (c2876lf2 == null || d10 < c2876lf2.f33062c)) {
                    c2876lf2 = c2876lf3;
                }
            } else if (c2876lf == null || d10 > c2876lf.f33062c) {
                optimalVastVideoSize = d11;
                c2876lf = c2876lf3;
            } else {
                optimalVastVideoSize = d11;
            }
        }
        if (c2876lf != null) {
            this.f33410f = c2876lf.f33060a;
        } else if (c2876lf2 != null) {
            this.f33410f = c2876lf2.f33060a;
        }
        String str3 = this.f33410f;
        if (str3 == null || str3.length() == 0) {
            AdConfig.BitRateConfig bitRate = this.f33405a.getBitRate();
            if (bitRate.isBitRateMandatory() || this.f33409e.size() == 0) {
                return this.f33410f;
            }
            CountDownLatch countDownLatch = new CountDownLatch(this.f33409e.size());
            try {
                try {
                    a(bitRate, countDownLatch);
                    countDownLatch.await(bitRate.getHeaderTimeout(), TimeUnit.MILLISECONDS);
                    Iterator it4 = this.f33409e.iterator();
                    while (it4.hasNext()) {
                        C2876lf c2876lf4 = (C2876lf) it4.next();
                        double d12 = c2876lf4.f33062c;
                        double d13 = optimalVastVideoSize;
                        if (a(0.0d, d13, d12)) {
                            if (c2876lf == null || d12 > c2876lf.f33062c) {
                                c2876lf = c2876lf4;
                            }
                            optimalVastVideoSize = d13;
                        } else {
                            optimalVastVideoSize = d13;
                            if (a(optimalVastVideoSize, vastMaxAssetSize, d12) && (c2876lf2 == null || d12 < c2876lf2.f33062c)) {
                                c2876lf2 = c2876lf4;
                            }
                        }
                    }
                } catch (Exception e11) {
                    Y5 y53 = Y5.f32563a;
                    C2796h2 event2 = new C2796h2(e11);
                    kotlin.jvm.internal.e0.checkNotNullParameter(event2, "event");
                    Y5.f32566d.a(event2);
                    Iterator it5 = this.f33409e.iterator();
                    while (it5.hasNext()) {
                        C2876lf c2876lf5 = (C2876lf) it5.next();
                        double d14 = c2876lf5.f33062c;
                        double d15 = optimalVastVideoSize;
                        if (!a(0.0d, d15, d14)) {
                            boolean zA = a(d15, vastMaxAssetSize, d14);
                            d15 = d15;
                            if (zA && (c2876lf2 == null || d14 < c2876lf2.f33062c)) {
                                c2876lf2 = c2876lf5;
                            }
                        } else if (c2876lf == null || d14 > c2876lf.f33062c) {
                            c2876lf = c2876lf5;
                        }
                        optimalVastVideoSize = d15;
                    }
                    if (c2876lf == null) {
                        if (c2876lf2 != null) {
                        }
                    }
                }
                if (c2876lf != null) {
                    this.f33410f = c2876lf.f33060a;
                } else if (c2876lf2 != null) {
                    this.f33410f = c2876lf2.f33060a;
                }
            } catch (Throwable th2) {
                double d16 = optimalVastVideoSize;
                Iterator it6 = this.f33409e.iterator();
                while (it6.hasNext()) {
                    C2876lf c2876lf6 = (C2876lf) it6.next();
                    double d17 = c2876lf6.f33062c;
                    if (!a(0.0d, d16, d17)) {
                        double d18 = d16;
                        d16 = d18;
                        if (a(d18, vastMaxAssetSize, d17) && (c2876lf2 == null || d17 < c2876lf2.f33062c)) {
                            c2876lf2 = c2876lf6;
                        }
                    } else if (c2876lf == null || d17 > c2876lf.f33062c) {
                        c2876lf = c2876lf6;
                    }
                }
                if (c2876lf != null) {
                    this.f33410f = c2876lf.f33060a;
                } else if (c2876lf2 != null) {
                    this.f33410f = c2876lf2.f33060a;
                }
                throw th2;
            }
        }
        return this.f33410f;
    }

    public final int a() {
        List<String> listSplit;
        String[] strArr;
        String str = this.f33411g;
        if (str != null && (listSplit = new sv.x(":").split(str, 0)) != null && (strArr = (String[]) listSplit.toArray(new String[0])) != null && strArr.length > 2) {
            try {
                return (Integer.parseInt(strArr[1]) * this.f33408d) + ((int) Float.parseFloat(strArr[2]));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final void a(AdConfig.BitRateConfig bitRateConfig, CountDownLatch countDownLatch) {
        Iterator it = this.f33409e.iterator();
        while (it.hasNext()) {
            new C2910nf((C2876lf) it.next(), bitRateConfig.getHeaderTimeout(), countDownLatch).a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3011tf(String str, String str2, String str3, ArrayList trackers, ArrayList companionAds, AdConfig.VastVideoConfig vastVideoConfig) {
        this(trackers, vastVideoConfig);
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        kotlin.jvm.internal.e0.checkNotNullParameter(companionAds, "companionAds");
        kotlin.jvm.internal.e0.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        if (!companionAds.isEmpty()) {
            this.f33413i = new ArrayList(companionAds);
        }
        if (str != null) {
            this.f33409e.add(new C2876lf(str, 1000));
        }
        this.f33410f = str;
        this.f33411g = str2;
        this.f33415k = str3;
    }
}

package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2780g3 {

    /* renamed from: a, reason: collision with root package name */
    public final C2793h f32861a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32862b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32863c = "g3";

    /* renamed from: d, reason: collision with root package name */
    public final C2847k3 f32864d = new C2847k3();

    /* renamed from: e, reason: collision with root package name */
    public long f32865e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f32866f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f32867g = new AtomicBoolean();

    public C2780g3(C2793h c2793h, long j10) {
        this.f32861a = c2793h;
        this.f32862b = j10;
    }

    public final void a() {
        C2793h c2793h;
        C2793h c2793h2;
        Long lM;
        String strH;
        Boolean boolC;
        kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
        C2793h c2793h3 = this.f32861a;
        if (c2793h3 != null && (boolC = c2793h3.C()) != null) {
            boolean zBooleanValue = boolC.booleanValue();
            C2830j3 c2830j3 = C2830j3.f32954a;
            Context contextD = C2925od.d();
            if (contextD != null) {
                kotlin.jvm.internal.e0.checkNotNull("j3");
                if (zBooleanValue != C2830j3.d()) {
                    kotlin.jvm.internal.e0.checkNotNull("j3");
                    ConcurrentHashMap concurrentHashMap = I6.f31865b;
                    I6.a(H6.a(contextD, "c_data_store"), "isEnabled", zBooleanValue, false, 4, (Object) null);
                    if (!zBooleanValue) {
                        c2830j3.e();
                    }
                }
            }
        }
        if (C2830j3.d() && !this.f32866f.getAndSet(true)) {
            this.f32865e = System.currentTimeMillis();
            if (!this.f32867g.get()) {
                C2793h c2793h4 = this.f32861a;
                if ((c2793h4 != null ? c2793h4.h() : null) != null && (strH = this.f32861a.h()) != null) {
                    C2847k3 c2847k3 = this.f32864d;
                    c2847k3.getClass();
                    kotlin.jvm.internal.e0.checkNotNullParameter(strH, "<set-?>");
                    c2847k3.f32997a = strH;
                    kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
                }
            }
            if (!this.f32867g.get() && (c2793h2 = this.f32861a) != null && (lM = c2793h2.m()) != null) {
                this.f32864d.f32998b = lM.longValue();
                kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
            }
            if (!this.f32867g.get()) {
                this.f32864d.f33001e = this.f32862b;
                kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
            }
            if (!this.f32867g.get() && (c2793h = this.f32861a) != null) {
                this.f32864d.f33002f = c2793h.n();
                kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
            }
            long j10 = this.f32865e / 1000;
            if (this.f32867g.get()) {
                return;
            }
            this.f32864d.f32999c = j10;
            kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
        }
    }

    public final void b() {
        if (!C2830j3.d()) {
            kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
            return;
        }
        if (!this.f32866f.get()) {
            kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
            return;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f32865e);
        if (!this.f32867g.get()) {
            this.f32864d.f33000d = iCurrentTimeMillis;
            kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
        }
        if (this.f32867g.getAndSet(true)) {
            kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
        } else {
            kotlin.jvm.internal.e0.checkNotNull(this.f32863c);
            C2925od.a(new zg.h(this, 14));
        }
    }

    public static final void a(C2780g3 this$0) {
        List<String> listEmptyList;
        AdConfig.ContextualDataConfig contextualData;
        AdConfig.ContextualDataConfig contextualData2;
        AdConfig.ContextualDataConfig contextualData3;
        AdConfig.ContextualDataConfig contextualData4;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        C2830j3 c2830j3 = C2830j3.f32954a;
        C2847k3 contextualDataModel = this$0.f32864d;
        kotlin.jvm.internal.e0.checkNotNullParameter(contextualDataModel, "contextualDataModel");
        synchronized (c2830j3) {
            try {
                kotlin.jvm.internal.e0.checkNotNull("j3");
                long jCurrentTimeMillis = System.currentTimeMillis();
                AdConfig adConfig = C2830j3.f32958e;
                int maxAdRecords = 0;
                long expiryTime = jCurrentTimeMillis - (((adConfig == null || (contextualData4 = adConfig.getContextualData()) == null) ? 0 : contextualData4.getExpiryTime()) * 1000);
                AdConfig adConfig2 = C2830j3.f32958e;
                C2830j3.a(expiryTime, ((adConfig2 == null || (contextualData3 = adConfig2.getContextualData()) == null) ? 0 : contextualData3.getMaxAdRecords()) - 1);
                AdConfig adConfig3 = C2830j3.f32958e;
                if (adConfig3 == null || (contextualData2 = adConfig3.getContextualData()) == null || (listEmptyList = contextualData2.getSkipFields()) == null) {
                    listEmptyList = uu.p0.emptyList();
                }
                String string = AbstractC2864l3.a(contextualDataModel, listEmptyList).toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                C2916o4 c2916o4 = new C2916o4(AbstractC2933p4.a(string, C2830j3.f32959f), jCurrentTimeMillis);
                C2830j3.f32955b.add(c2916o4);
                Object objClone = C2830j3.f32955b.clone();
                kotlin.jvm.internal.e0.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
                C2830j3.f32956c = (LinkedList) objClone;
                AdConfig adConfig4 = C2830j3.f32958e;
                if (adConfig4 != null && (contextualData = adConfig4.getContextualData()) != null) {
                    maxAdRecords = contextualData.getMaxAdRecords();
                }
                kotlin.jvm.internal.e0.checkNotNull("j3");
                C2763f3 c2763f3 = (C2763f3) AbstractC2807hd.f32902d.getValue();
                c2763f3.getClass();
                Objects.toString(c2916o4);
                c2763f3.a(c2916o4);
                c2763f3.a("id NOT IN (SELECT id FROM ( SELECT id FROM c_data WHERE timestamp > " + expiryTime + " ORDER BY timestamp DESC LIMIT " + maxAdRecords + ") foo);", null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

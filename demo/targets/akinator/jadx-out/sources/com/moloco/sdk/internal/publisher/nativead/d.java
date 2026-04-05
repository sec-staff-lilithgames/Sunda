package com.moloco.sdk.internal.publisher.nativead;

import a1.e;
import com.moloco.sdk.internal.publisher.m0;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.moloco.sdk.internal.publisher.u;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f46532a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.c f46533b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.nativead.model.a f46534c;

    /* renamed from: d, reason: collision with root package name */
    public final r f46535d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f46536e;

    /* renamed from: f, reason: collision with root package name */
    public final AdFormatType f46537f;

    /* renamed from: g, reason: collision with root package name */
    public final k f46538g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f46539h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f46540i;

    /* renamed from: j, reason: collision with root package name */
    public final m0 f46541j;

    /* renamed from: k, reason: collision with root package name */
    public final a f46542k;

    public d(String adUnitId, com.moloco.sdk.internal.ortb.model.c bid, com.moloco.sdk.internal.publisher.nativead.model.a ortbResponse, r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, AdFormatType adFormatType, k persistentHttpRequest, e0 externalLinkHandler, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.e0.checkNotNullParameter(ortbResponse, "ortbResponse");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f46532a = adUnitId;
        this.f46533b = bid;
        this.f46534c = ortbResponse;
        this.f46535d = appLifecycleTrackerService;
        this.f46536e = customUserEventBuilderService;
        this.f46537f = adFormatType;
        this.f46538g = persistentHttpRequest;
        this.f46539h = externalLinkHandler;
        this.f46540i = metricsRecorder;
        this.f46541j = a();
        this.f46542k = b();
    }

    public final m0 a() {
        return com.moloco.sdk.internal.publisher.a.a(null, this.f46535d, this.f46536e, new e(this.f46533b, 7), new e(this, 8), null, null, this.f46537f, this.f46540i, 96, null);
    }

    public final a b() {
        com.moloco.sdk.internal.publisher.nativead.model.a aVar = this.f46534c;
        return new a(aVar.c(), aVar.b(), this.f46538g);
    }

    public final void c() {
        a.c cVarD = this.f46534c.d();
        if (cVarD != null) {
            this.f46542k.a(cVarD.a());
            this.f46539h.a(cVarD.c());
        }
        this.f46541j.onAdClicked(MolocoAdKt.createAdInfo$default(this.f46532a, null, 2, null));
    }

    public final void d() {
        this.f46542k.a();
        this.f46541j.onAdShowSuccess(MolocoAdKt.createAdInfo$default(this.f46532a, null, 2, null));
    }

    public static final com.moloco.sdk.internal.ortb.model.r a(com.moloco.sdk.internal.ortb.model.c cVar) {
        return cVar.e().i();
    }

    public static final u a(d dVar) {
        String strC = dVar.f46533b.c();
        if (strC != null) {
            return new u(strC, Float.valueOf(dVar.f46533b.g()));
        }
        return null;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public List f46543a;

        /* renamed from: b, reason: collision with root package name */
        public List f46544b;

        /* renamed from: c, reason: collision with root package name */
        public final k f46545c;

        /* renamed from: d, reason: collision with root package name */
        public final LinkedHashSet f46546d;

        public a(List<String> list, List<a.b> list2, k persistentHttpRequest) {
            kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
            this.f46543a = list;
            this.f46544b = list2;
            this.f46545c = persistentHttpRequest;
            this.f46546d = new LinkedHashSet();
        }

        public final void a() {
            List list = this.f46543a;
            k kVar = this.f46545c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    kVar.a((String) it.next());
                }
            }
            this.f46543a = null;
            List<a.b> list2 = this.f46544b;
            if (list2 != null) {
                for (a.b bVar : list2) {
                    if (bVar.c() != null && bVar.a() == 1 && bVar.b() == 1) {
                        kVar.a(bVar.c());
                    }
                }
            }
            this.f46544b = null;
        }

        public final void a(List<String> urls) {
            kotlin.jvm.internal.e0.checkNotNullParameter(urls, "urls");
            for (String str : urls) {
                LinkedHashSet linkedHashSet = this.f46546d;
                if (!linkedHashSet.contains(str)) {
                    this.f46545c.a(str);
                    linkedHashSet.add(str);
                }
            }
        }
    }
}

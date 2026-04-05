package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {

    /* renamed from: m, reason: collision with root package name */
    public static final String f23684m = IAlog.a(f.class);

    /* renamed from: n, reason: collision with root package name */
    public static final Object f23685n = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.i f23688c;

    /* renamed from: e, reason: collision with root package name */
    public t0 f23690e;

    /* renamed from: f, reason: collision with root package name */
    public d f23691f;

    /* renamed from: h, reason: collision with root package name */
    public final InneractiveAdRequest f23693h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f23694i;

    /* renamed from: j, reason: collision with root package name */
    public final String f23695j;

    /* renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.j f23696k;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f23686a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f23687b = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23689d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f23692g = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final e f23697l = new e(this);

    public f(com.fyber.inneractive.sdk.config.global.r rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, d dVar, String str) {
        this.f23694i = rVar;
        this.f23696k = jVar;
        this.f23693h = inneractiveAdRequest;
        this.f23688c = iVar;
        this.f23691f = dVar;
        this.f23695j = str;
    }

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        IAlog.f("%sonMainAssetLoadFailed: %s", f23684m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        Iterator it = this.f23686a.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        String strDescription = inneractiveInfrastructureError.description();
        if (this.f23692g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(strDescription));
            d dVar = this.f23691f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f23662b, dVar.f23661a, "send_failed_native_creatives", dVar.f23667g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.nativead.f.a():void");
    }
}

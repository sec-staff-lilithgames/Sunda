package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f49920a;

    /* renamed from: b, reason: collision with root package name */
    public List f49921b;

    /* renamed from: c, reason: collision with root package name */
    public List f49922c;

    /* renamed from: d, reason: collision with root package name */
    public List f49923d;

    /* renamed from: e, reason: collision with root package name */
    public final p f49924e;

    /* renamed from: f, reason: collision with root package name */
    public final n f49925f;

    public d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, List<String> list, List<String> list2, List<String> list3, p buttonTracker, n vastTracker) {
        e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        e0.checkNotNullParameter(buttonTracker, "buttonTracker");
        e0.checkNotNullParameter(vastTracker, "vastTracker");
        this.f49920a = customUserEventBuilderService;
        this.f49921b = list;
        this.f49922c = list2;
        this.f49923d = list3;
        this.f49924e = buttonTracker;
        this.f49925f = vastTracker;
    }

    public final void a(a.c button) {
        e0.checkNotNullParameter(button, "button");
        this.f49924e.a(button);
    }

    public final void b() {
        List list = this.f49923d;
        if (list != null) {
            m.a(this.f49925f, list, null, null, null, 14, null);
            this.f49923d = null;
        }
    }

    public final void a(a.c.EnumC0490a buttonType) {
        e0.checkNotNullParameter(buttonType, "buttonType");
        this.f49924e.a(buttonType);
    }

    public final void a(a.f position) {
        e0.checkNotNullParameter(position, "position");
        List list = this.f49921b;
        if (list != null) {
            m.a(this.f49925f, list, null, null, null, this.f49924e.q(), this.f49920a, position, 14, null);
            this.f49921b = null;
        }
    }

    public final void a() {
        List list = this.f49922c;
        if (list != null) {
            m.a(this.f49925f, list, null, null, null, 14, null);
            this.f49922c = null;
        }
    }

    public /* synthetic */ d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, List list, List list2, List list3, p pVar, n nVar, int i10, u uVar) {
        this(bVar, list, list2, list3, (i10 & 16) != 0 ? r.a() : pVar, (i10 & 32) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p.b() : nVar);
    }
}

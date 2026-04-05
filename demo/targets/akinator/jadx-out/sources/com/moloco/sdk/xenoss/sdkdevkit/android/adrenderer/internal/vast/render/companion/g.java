package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

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
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f49578a;

    /* renamed from: b, reason: collision with root package name */
    public List f49579b;

    /* renamed from: c, reason: collision with root package name */
    public List f49580c;

    /* renamed from: d, reason: collision with root package name */
    public final p f49581d;

    /* renamed from: e, reason: collision with root package name */
    public final n f49582e;

    public g(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, List<String> list, List<String> list2, p buttonTracker, n vastTracker) {
        e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        e0.checkNotNullParameter(buttonTracker, "buttonTracker");
        e0.checkNotNullParameter(vastTracker, "vastTracker");
        this.f49578a = customUserEventBuilderService;
        this.f49579b = list;
        this.f49580c = list2;
        this.f49581d = buttonTracker;
        this.f49582e = vastTracker;
    }

    public final void a(a.c button) {
        e0.checkNotNullParameter(button, "button");
        this.f49581d.a(button);
    }

    public final void a(a.c.EnumC0490a buttonType) {
        e0.checkNotNullParameter(buttonType, "buttonType");
        this.f49581d.a(buttonType);
    }

    public final void a(a.f lastClickPosition) {
        e0.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        List list = this.f49579b;
        if (list != null) {
            m.a(this.f49582e, list, null, null, null, this.f49581d.q(), this.f49578a, lastClickPosition, 14, null);
            this.f49579b = null;
        }
    }

    public /* synthetic */ g(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, List list, List list2, p pVar, n nVar, int i10, u uVar) {
        this(bVar, list, list2, (i10 & 8) != 0 ? r.a() : pVar, (i10 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p.b() : nVar);
    }

    public final void a() {
        List list = this.f49580c;
        if (list != null) {
            m.a(this.f49582e, list, null, null, null, 14, null);
            this.f49580c = null;
        }
    }
}

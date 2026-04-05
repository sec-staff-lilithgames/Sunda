package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public List f49522a;

    /* renamed from: b, reason: collision with root package name */
    public List f49523b;

    /* renamed from: c, reason: collision with root package name */
    public final List f49524c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n f49525d;

    public j(List<String> list, List<String> list2, List<String> list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n vastTracker) {
        e0.checkNotNullParameter(vastTracker, "vastTracker");
        this.f49522a = list;
        this.f49523b = list2;
        this.f49524c = list3;
        this.f49525d = vastTracker;
    }

    public final void a() {
        List list = this.f49523b;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m.a(this.f49525d, list, null, null, null, 14, null);
            this.f49523b = null;
        }
    }

    public final boolean b() {
        List list = this.f49522a;
        if (list == null) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m.a(this.f49525d, list, null, null, null, 14, null);
        this.f49522a = null;
        return true;
    }

    public static /* synthetic */ void a(j jVar, z zVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zVar = null;
        }
        jVar.a(zVar);
    }

    public final void a(z zVar) {
        List list = this.f49524c;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m.a(this.f49525d, list, zVar, null, null, 12, null);
        }
    }

    public /* synthetic */ j(List list, List list2, List list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n nVar, int i10, u uVar) {
        this(list, list2, list3, (i10 & 8) != 0 ? p.b() : nVar);
    }
}

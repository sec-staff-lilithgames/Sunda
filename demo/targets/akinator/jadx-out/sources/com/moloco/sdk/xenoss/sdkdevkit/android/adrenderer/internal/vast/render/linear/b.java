package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public List f49971a;

    /* renamed from: b, reason: collision with root package name */
    public List f49972b;

    /* renamed from: c, reason: collision with root package name */
    public final n f49973c;

    public b(List<String> list, List<String> list2, n vastTracker) {
        e0.checkNotNullParameter(vastTracker, "vastTracker");
        this.f49971a = list;
        this.f49972b = list2;
        this.f49973c = vastTracker;
    }

    public static /* synthetic */ void a(b bVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        bVar.a(num, str);
    }

    public static /* synthetic */ void b(b bVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        bVar.b(num, str);
    }

    public final void a(Integer num, String str) {
        List<String> list = this.f49971a;
        if (list != null) {
            this.f49973c.a(list, null, num, str);
            this.f49971a = null;
        }
    }

    public final void b(Integer num, String str) {
        List<String> list = this.f49972b;
        if (list != null) {
            this.f49973c.a(list, null, num, str);
            this.f49972b = null;
        }
    }

    public /* synthetic */ b(List list, List list2, n nVar, int i10, u uVar) {
        this(list, list2, (i10 & 4) != 0 ? p.b() : nVar);
    }
}

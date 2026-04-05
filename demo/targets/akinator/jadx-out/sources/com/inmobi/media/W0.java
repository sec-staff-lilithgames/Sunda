package com.inmobi.media;

import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f32415a;

    /* renamed from: b, reason: collision with root package name */
    public final C3095ye f32416b;

    /* renamed from: c, reason: collision with root package name */
    public long f32417c;

    /* renamed from: d, reason: collision with root package name */
    public long f32418d;

    /* renamed from: e, reason: collision with root package name */
    public long f32419e;

    /* renamed from: f, reason: collision with root package name */
    public long f32420f;

    /* renamed from: g, reason: collision with root package name */
    public long f32421g;

    /* renamed from: h, reason: collision with root package name */
    public long f32422h;

    /* renamed from: i, reason: collision with root package name */
    public long f32423i;

    /* renamed from: j, reason: collision with root package name */
    public final V0 f32424j;

    public W0(U0 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f32415a = adUnit;
        this.f32416b = new C3095ye();
        this.f32424j = new V0(this);
    }

    public final String a() {
        A0 a0Z;
        LinkedList<C2793h> linkedListF;
        C2793h c2793h;
        String strW;
        U0 u02 = this.f32415a;
        return (u02 == null || (a0Z = u02.z()) == null || (linkedListF = a0Z.f()) == null || (c2793h = (C2793h) uu.y0.firstOrNull((List) linkedListF)) == null || (strW = c2793h.w()) == null) ? "" : strW;
    }
}

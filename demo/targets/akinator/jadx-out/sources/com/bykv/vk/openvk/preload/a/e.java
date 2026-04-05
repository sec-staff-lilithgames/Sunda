package com.bykv.vk.openvk.preload.a;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    private String f16988g;

    /* renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.c f16982a = com.bykv.vk.openvk.preload.a.b.c.f16889a;

    /* renamed from: b, reason: collision with root package name */
    private q f16983b = q.f16996a;

    /* renamed from: c, reason: collision with root package name */
    private c f16984c = b.f16773a;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Type, f<?>> f16985d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List<s> f16986e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<s> f16987f = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f16989h = 2;

    /* renamed from: i, reason: collision with root package name */
    private int f16990i = 2;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16991j = true;

    public final e a(Type type, Object obj) {
        com.bykv.vk.openvk.preload.falconx.a.a.a(true);
        this.f16986e.add(com.bykv.vk.openvk.preload.a.b.a.m.a(com.bykv.vk.openvk.preload.a.c.a.a(type), (r) obj));
        return this;
    }

    public final d a() {
        a aVar;
        a aVar2;
        a aVar3;
        ArrayList arrayList = new ArrayList(this.f16987f.size() + this.f16986e.size() + 3);
        arrayList.addAll(this.f16986e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f16987f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        String str = this.f16988g;
        int i10 = this.f16989h;
        int i11 = this.f16990i;
        if (str != null && !"".equals(str.trim())) {
            aVar = new a(Date.class, str);
            aVar2 = new a(Timestamp.class, str);
            aVar3 = new a(java.sql.Date.class, str);
        } else {
            if (i10 != 2 && i11 != 2) {
                a aVar4 = new a(Date.class, i10, i11);
                a aVar5 = new a(Timestamp.class, i10, i11);
                a aVar6 = new a(java.sql.Date.class, i10, i11);
                aVar = aVar4;
                aVar2 = aVar5;
                aVar3 = aVar6;
            }
            return new d(this.f16982a, this.f16984c, this.f16985d, this.f16991j, this.f16983b, arrayList);
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(Date.class, aVar));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(Timestamp.class, aVar2));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(java.sql.Date.class, aVar3));
        return new d(this.f16982a, this.f16984c, this.f16985d, this.f16991j, this.f16983b, arrayList);
    }
}

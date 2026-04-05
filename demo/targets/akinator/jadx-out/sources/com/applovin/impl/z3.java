package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class z3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16350a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16351b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16352c;

    /* renamed from: d, reason: collision with root package name */
    private Long f16353d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f16354e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Deque f16355f = new ArrayDeque();

    public z3(com.applovin.impl.sdk.k kVar) {
        this.f16350a = (String) kVar.a(v4.f16020r4);
        this.f16351b = kVar.c(v4.f16028s4);
        this.f16352c = ((Integer) kVar.a(v4.f16036t4)).intValue();
    }

    public Long a() {
        return this.f16353d;
    }

    public Deque b() {
        return this.f16355f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f16352c <= 0) {
            return;
        }
        Map map = (Map) this.f16354e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                Iterator it = list.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / list.size()));
            }
        }
        if (this.f16355f.size() == this.f16352c) {
            this.f16355f.pollLast();
        }
        this.f16355f.addFirst(map2);
    }

    public void b(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f16351b) && this.f16352c > 0) {
            Iterator it = this.f16351b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j10, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f16350a) && str.endsWith(this.f16350a)) {
            this.f16353d = Long.valueOf(j10);
        }
    }

    private void a(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f16354e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f16354e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j10));
    }
}

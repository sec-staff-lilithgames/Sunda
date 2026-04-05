package com.mbridge.msdk.dycreator.viewobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {

    /* renamed from: a, reason: collision with root package name */
    private List<Object> f40294a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<Integer, Object> f40295b = new ConcurrentHashMap<>();

    public synchronized void a(Object obj, int i10) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f40295b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f40295b.put(Integer.valueOf(i10), obj);
            }
        }
    }

    public synchronized void a() {
        this.f40295b.clear();
    }
}

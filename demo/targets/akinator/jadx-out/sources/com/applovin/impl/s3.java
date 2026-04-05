package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s3 {

    /* renamed from: a, reason: collision with root package name */
    private final List f15215a = Collections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(v2 v2Var);
    }

    public void a(a aVar) {
        this.f15215a.add(aVar);
    }

    public void b(a aVar) {
        this.f15215a.remove(aVar);
    }

    public void a(v2 v2Var) {
        Iterator it = new ArrayList(this.f15215a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(v2Var);
        }
    }
}

package com.fyber.inneractive.sdk.model.vast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a, reason: collision with root package name */
    public String f24070a;

    /* renamed from: b, reason: collision with root package name */
    public String f24071b;

    /* renamed from: d, reason: collision with root package name */
    public final PriorityQueue f24073d;

    /* renamed from: f, reason: collision with root package name */
    public o f24075f;

    /* renamed from: g, reason: collision with root package name */
    public final PriorityQueue f24076g;

    /* renamed from: h, reason: collision with root package name */
    public final Comparator f24077h;

    /* renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.k f24084o;

    /* renamed from: p, reason: collision with root package name */
    public v f24085p;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f24074e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f24078i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f24079j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f24080k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f24081l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f24082m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public String f24083n = "";

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f24072c = new HashMap();

    public b(com.fyber.inneractive.sdk.flow.vast.g gVar, com.fyber.inneractive.sdk.flow.vast.d dVar) {
        this.f24073d = new PriorityQueue(1, gVar);
        this.f24077h = dVar;
        this.f24076g = new PriorityQueue(1, dVar);
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f24072c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f24072c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f24072c.put(xVar, arrayList);
        }
        arrayList.add(str);
    }
}

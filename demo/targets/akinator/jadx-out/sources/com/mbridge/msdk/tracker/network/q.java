package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f44001a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f44002b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f44003c;

    /* renamed from: d, reason: collision with root package name */
    public final List<g> f44004d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f44005e;

    /* renamed from: f, reason: collision with root package name */
    public final long f44006f;

    public q(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, a(list), list, z10, j10);
    }

    private static Map<String, String> a(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }

    private q(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f44001a = i10;
        this.f44002b = bArr;
        this.f44003c = map;
        if (list == null) {
            this.f44004d = null;
        } else {
            this.f44004d = Collections.unmodifiableList(list);
        }
        this.f44005e = z10;
        this.f44006f = j10;
    }
}

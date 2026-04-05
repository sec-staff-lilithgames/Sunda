package com.mbridge.msdk.foundation.same.net.toolbox;

import com.mbridge.msdk.tracker.network.g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f40824a;

    /* renamed from: b, reason: collision with root package name */
    public final List<g> f40825b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f40826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40827d;

    public a(int i10, byte[] bArr, List<g> list) {
        this(i10, bArr, a(list), list);
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

    private a(int i10, byte[] bArr, Map<String, String> map, List<g> list) {
        this.f40827d = i10;
        this.f40824a = bArr;
        this.f40826c = map;
        if (list == null) {
            this.f40825b = null;
        } else {
            this.f40825b = Collections.unmodifiableList(list);
        }
    }
}

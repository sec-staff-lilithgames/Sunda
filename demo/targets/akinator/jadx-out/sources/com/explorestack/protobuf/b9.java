package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b9 implements t9 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f21950a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f21951b;

    /* renamed from: c, reason: collision with root package name */
    public a9 f21952c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f21953d;

    /* renamed from: e, reason: collision with root package name */
    public final v8 f21954e;

    public b9(v8 v8Var, Map map) {
        this.f21954e = v8Var;
        this.f21950a = true;
        this.f21951b = 1;
        this.f21952c = new a9(this, map);
        this.f21953d = null;
    }

    public static <K, V> b9 emptyMapField(s8 s8Var) {
        return new b9(s8Var, Collections.EMPTY_MAP);
    }

    public static <K, V> b9 newMapField(s8 s8Var) {
        return new b9(s8Var, new LinkedHashMap());
    }

    public final a9 a(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f21954e.convertMessageToKeyAndValue((Message) it.next(), linkedHashMap);
        }
        return new a9(this, linkedHashMap);
    }

    public final ArrayList b(a9 a9Var) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Object, Object> entry : a9Var.entrySet()) {
            arrayList.add(this.f21954e.convertKeyAndValueToMessage(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public final List c() {
        if (this.f21951b == 1) {
            synchronized (this) {
                try {
                    if (this.f21951b == 1) {
                        this.f21953d = b(this.f21952c);
                        this.f21951b = 3;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableList(this.f21953d);
    }

    public void clear() {
        this.f21952c = new a9(this, new LinkedHashMap());
        this.f21951b = 1;
    }

    public b9 copy() {
        return new b9(this.f21954e, c9.b(getMap()));
    }

    public final List d() {
        if (this.f21951b != 2) {
            if (this.f21951b == 1) {
                this.f21953d = b(this.f21952c);
            }
            this.f21952c = null;
            this.f21951b = 2;
        }
        return this.f21953d;
    }

    @Override // com.explorestack.protobuf.t9
    public void ensureMutable() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof b9) {
            return c9.d(getMap(), ((b9) obj).getMap());
        }
        return false;
    }

    public Map<Object, Object> getMap() {
        if (this.f21951b == 2) {
            synchronized (this) {
                try {
                    if (this.f21951b == 2) {
                        this.f21952c = a(this.f21953d);
                        this.f21951b = 3;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableMap(this.f21952c);
    }

    public Map<Object, Object> getMutableMap() {
        if (this.f21951b != 1) {
            if (this.f21951b == 2) {
                this.f21952c = a(this.f21953d);
            }
            this.f21953d = null;
            this.f21951b = 1;
        }
        return this.f21952c;
    }

    public int hashCode() {
        return c9.a(getMap());
    }

    public boolean isMutable() {
        return this.f21950a;
    }

    public void makeImmutable() {
        this.f21950a = false;
    }

    public void mergeFrom(b9 b9Var) {
        getMutableMap().putAll(c9.b(b9Var.getMap()));
    }

    public b9(s8 s8Var, Map map) {
        this(new w8(s8Var), map);
    }
}

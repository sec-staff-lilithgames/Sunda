package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m8 {

    /* renamed from: f, reason: collision with root package name */
    public static final m8 f14455f = new m8();

    /* renamed from: a, reason: collision with root package name */
    private final m8 f14456a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14457b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f14458c;

    /* renamed from: d, reason: collision with root package name */
    protected String f14459d;

    /* renamed from: e, reason: collision with root package name */
    protected final List f14460e;

    public m8(String str, Map map, m8 m8Var) {
        this.f14456a = m8Var;
        this.f14457b = str;
        this.f14458c = Collections.unmodifiableMap(map);
        this.f14460e = new ArrayList();
    }

    public Map a() {
        return this.f14458c;
    }

    public List b() {
        return Collections.unmodifiableList(this.f14460e);
    }

    public String c() {
        return this.f14457b;
    }

    public String d() {
        return this.f14459d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmlNode{elementName='");
        sb2.append(this.f14457b);
        sb2.append("', text='");
        sb2.append(this.f14459d);
        sb2.append("', attributes=");
        return j1.o2.q(sb2, this.f14458c, AbstractJsonLexerKt.END_OBJ);
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f14460e.size());
        for (m8 m8Var : this.f14460e) {
            if (str.equalsIgnoreCase(m8Var.c())) {
                arrayList.add(m8Var);
            }
        }
        return arrayList;
    }

    public m8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f14460e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            m8 m8Var = (m8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(m8Var.c())) {
                return m8Var;
            }
            arrayList.addAll(m8Var.b());
        }
        return null;
    }

    public m8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (m8 m8Var : this.f14460e) {
            if (str.equalsIgnoreCase(m8Var.c())) {
                return m8Var;
            }
        }
        return null;
    }

    private m8() {
        this.f14456a = null;
        this.f14457b = "";
        this.f14458c = Collections.EMPTY_MAP;
        this.f14459d = "";
        this.f14460e = Collections.EMPTY_LIST;
    }
}

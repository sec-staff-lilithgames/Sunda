package com.explorestack.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class za implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f22978b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f22979c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gb f22980e;

    public za(gb gbVar) {
        this.f22980e = gbVar;
        this.f22978b = gbVar.f22168c.size();
    }

    public final Iterator a() {
        if (this.f22979c == null) {
            this.f22979c = this.f22980e.f22172h.entrySet().iterator();
        }
        return this.f22979c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f22978b;
        return (i10 > 0 && i10 <= this.f22980e.f22168c.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public Map.Entry<Comparable<Object>, Object> next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.f22980e.f22168c;
        int i10 = this.f22978b - 1;
        this.f22978b = i10;
        return (Map.Entry) list.get(i10);
    }
}

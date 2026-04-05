package com.explorestack.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class eb implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f22089b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22090c;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f22091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gb f22092f;

    public eb(gb gbVar) {
        this.f22092f = gbVar;
    }

    public final Iterator a() {
        if (this.f22091e == null) {
            this.f22091e = this.f22092f.f22169e.entrySet().iterator();
        }
        return this.f22091e;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f22089b + 1;
        gb gbVar = this.f22092f;
        return i10 < gbVar.f22168c.size() || (!gbVar.f22169e.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f22090c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f22090c = false;
        int i10 = gb.f22166j;
        gb gbVar = this.f22092f;
        gbVar.b();
        if (this.f22089b >= gbVar.f22168c.size()) {
            a().remove();
            return;
        }
        int i11 = this.f22089b;
        this.f22089b = i11 - 1;
        gbVar.d(i11);
    }

    @Override // java.util.Iterator
    public Map.Entry<Comparable<Object>, Object> next() {
        this.f22090c = true;
        int i10 = this.f22089b + 1;
        this.f22089b = i10;
        gb gbVar = this.f22092f;
        return i10 < gbVar.f22168c.size() ? (Map.Entry) gbVar.f22168c.get(this.f22089b) : (Map.Entry) a().next();
    }
}

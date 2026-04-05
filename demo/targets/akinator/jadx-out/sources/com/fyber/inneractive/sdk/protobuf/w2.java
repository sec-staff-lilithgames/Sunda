package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f26520a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f26521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f26522c;

    public w2(e3 e3Var) {
        this.f26522c = e3Var;
        this.f26520a = e3Var.f26370b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f26520a;
        if (i10 > 0 && i10 <= this.f26522c.f26370b.size()) {
            return true;
        }
        if (this.f26521b == null) {
            this.f26521b = this.f26522c.f26374f.entrySet().iterator();
        }
        return this.f26521b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f26521b == null) {
            this.f26521b = this.f26522c.f26374f.entrySet().iterator();
        }
        if (this.f26521b.hasNext()) {
            if (this.f26521b == null) {
                this.f26521b = this.f26522c.f26374f.entrySet().iterator();
            }
            return (Map.Entry) this.f26521b.next();
        }
        List list = this.f26522c.f26370b;
        int i10 = this.f26520a - 1;
        this.f26520a = i10;
        return (Map.Entry) list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

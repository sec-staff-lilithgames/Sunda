package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c3 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f26356a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26357b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f26358c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3 f26359d;

    public c3(e3 e3Var) {
        this.f26359d = e3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f26356a + 1 >= this.f26359d.f26370b.size()) {
            if (this.f26359d.f26371c.isEmpty()) {
                return false;
            }
            if (this.f26358c == null) {
                this.f26358c = this.f26359d.f26371c.entrySet().iterator();
            }
            if (!this.f26358c.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f26357b = true;
        int i10 = this.f26356a + 1;
        this.f26356a = i10;
        if (i10 < this.f26359d.f26370b.size()) {
            return (Map.Entry) this.f26359d.f26370b.get(this.f26356a);
        }
        if (this.f26358c == null) {
            this.f26358c = this.f26359d.f26371c.entrySet().iterator();
        }
        return (Map.Entry) this.f26358c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f26357b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f26357b = false;
        e3 e3Var = this.f26359d;
        int i10 = e3.f26368h;
        e3Var.a();
        if (this.f26356a >= this.f26359d.f26370b.size()) {
            if (this.f26358c == null) {
                this.f26358c = this.f26359d.f26371c.entrySet().iterator();
            }
            this.f26358c.remove();
            return;
        }
        e3 e3Var2 = this.f26359d;
        int i11 = this.f26356a;
        this.f26356a = i11 - 1;
        e3Var2.a();
        Object obj = ((b3) e3Var2.f26370b.remove(i11)).f26352b;
        if (e3Var2.f26371c.isEmpty()) {
            return;
        }
        Iterator it = e3Var2.c().entrySet().iterator();
        e3Var2.f26370b.add(new b3(e3Var2, (Map.Entry) it.next()));
        it.remove();
    }
}

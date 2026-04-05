package aw;

import aw.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f8307b;

    /* renamed from: c, reason: collision with root package name */
    public g.d f8308c;

    /* renamed from: e, reason: collision with root package name */
    public g.d f8309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f8310f;

    public k(g gVar) {
        this.f8310f = gVar;
        Iterator it = new ArrayList(gVar.getLruEntries$okhttp().values()).iterator();
        e0.checkNotNullExpressionValue(it, "iterator(...)");
        this.f8307b = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        g.d dVarSnapshot$okhttp;
        if (this.f8308c != null) {
            return true;
        }
        g gVar = this.f8310f;
        synchronized (gVar) {
            if (gVar.getClosed$okhttp()) {
                return false;
            }
            while (this.f8307b.hasNext()) {
                g.c cVar = (g.c) this.f8307b.next();
                if (cVar != null && (dVarSnapshot$okhttp = cVar.snapshot$okhttp()) != null) {
                    this.f8308c = dVarSnapshot$okhttp;
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        g.d dVar = this.f8309e;
        if (dVar == null) {
            throw new IllegalStateException("remove() before next()");
        }
        try {
            this.f8310f.remove(dVar.key());
        } catch (IOException unused) {
        } finally {
            this.f8309e = null;
        }
    }

    @Override // java.util.Iterator
    public g.d next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        g.d dVar = this.f8308c;
        this.f8309e = dVar;
        this.f8308c = null;
        e0.checkNotNull(dVar);
        return dVar;
    }
}

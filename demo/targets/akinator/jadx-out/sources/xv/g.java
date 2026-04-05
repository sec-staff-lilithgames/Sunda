package xv;

import aw.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f93625b;

    /* renamed from: c, reason: collision with root package name */
    public String f93626c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93627e;

    public g(e eVar) {
        this.f93625b = eVar.getCache$okhttp().snapshots();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f93626c != null) {
            return true;
        }
        this.f93627e = false;
        while (true) {
            Iterator it = this.f93625b;
            if (!it.hasNext()) {
                return false;
            }
            try {
                Closeable closeable = (Closeable) it.next();
                try {
                    continue;
                    this.f93626c = pw.h0.buffer(((g.d) closeable).getSource(0)).readUtf8LineStrict();
                    gv.d.closeFinally(closeable, null);
                    return true;
                } finally {
                    try {
                        continue;
                    } catch (Throwable th2) {
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f93627e) {
            throw new IllegalStateException("remove() before next()");
        }
        this.f93625b.remove();
    }

    @Override // java.util.Iterator
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f93626c;
        kotlin.jvm.internal.e0.checkNotNull(str);
        this.f93626c = null;
        this.f93627e = true;
        return str;
    }
}

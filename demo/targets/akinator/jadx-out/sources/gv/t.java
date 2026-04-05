package gv;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public String f58508b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f58509c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f58510e;

    public t(u uVar) {
        this.f58510e = uVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws IOException {
        if (this.f58508b == null && !this.f58509c) {
            String line = this.f58510e.f58511a.readLine();
            this.f58508b = line;
            if (line == null) {
                this.f58509c = true;
            }
        }
        return this.f58508b != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f58508b;
        this.f58508b = null;
        e0.checkNotNull(str);
        return str;
    }
}

package gv;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u implements rv.t {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedReader f58511a;

    public u(BufferedReader reader) {
        e0.checkNotNullParameter(reader, "reader");
        this.f58511a = reader;
    }

    @Override // rv.t
    public Iterator<String> iterator() {
        return new t(this);
    }
}

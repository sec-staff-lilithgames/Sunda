package mh;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f74593a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74594b;

    public c1(d1 d1Var, String str) {
        this.f74593a = d1Var;
        this.f74594b = (String) p1.checkNotNull(str);
    }

    public <A extends Appendable> A appendTo(A a10, Map<?, ?> map) throws IOException {
        return (A) appendTo((c1) a10, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
    }

    public String join(Map<?, ?> map) {
        return join(map.entrySet());
    }

    public c1 useForNull(String str) {
        return new c1(this.f74593a.useForNull(str), this.f74594b);
    }

    public StringBuilder appendTo(StringBuilder sb2, Map<?, ?> map) {
        return appendTo(sb2, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
    }

    public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
        return join(iterable.iterator());
    }

    public <A extends Appendable> A appendTo(A a10, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
        return (A) appendTo((c1) a10, iterable.iterator());
    }

    public String join(Iterator<? extends Map.Entry<?, ?>> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public <A extends Appendable> A appendTo(A a10, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
        p1.checkNotNull(a10);
        if (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            Object key = next.getKey();
            d1 d1Var = this.f74593a;
            a10.append(d1Var.a(key));
            String str = this.f74594b;
            a10.append(str);
            a10.append(d1Var.a(next.getValue()));
            while (it.hasNext()) {
                a10.append(d1Var.f74600a);
                Map.Entry<?, ?> next2 = it.next();
                a10.append(d1Var.a(next2.getKey()));
                a10.append(str);
                a10.append(d1Var.a(next2.getValue()));
            }
        }
        return a10;
    }

    public StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Map.Entry<?, ?>> iterable) {
        return appendTo(sb2, iterable.iterator());
    }

    public StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Map.Entry<?, ?>> it) {
        try {
            appendTo((c1) sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}

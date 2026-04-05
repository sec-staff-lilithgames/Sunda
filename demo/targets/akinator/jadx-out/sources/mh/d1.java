package mh;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f74600a;

    public d1(String str) {
        this.f74600a = (String) p1.checkNotNull(str);
    }

    public static d1 on(String str) {
        return new d1(str);
    }

    public CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public <A extends Appendable> A appendTo(A a10, Iterable<?> iterable) throws IOException {
        return (A) appendTo((d1) a10, iterable.iterator());
    }

    public String join(Iterable<?> iterable) {
        return join(iterable.iterator());
    }

    public d1 skipNulls() {
        return new a1(this, this);
    }

    public d1 useForNull(String str) {
        p1.checkNotNull(str);
        return new z0(this, this, str);
    }

    public c1 withKeyValueSeparator(char c10) {
        return withKeyValueSeparator(String.valueOf(c10));
    }

    public static d1 on(char c10) {
        return new d1(String.valueOf(c10));
    }

    public <A extends Appendable> A appendTo(A a10, Iterator<?> it) throws IOException {
        p1.checkNotNull(a10);
        if (it.hasNext()) {
            a10.append(a(it.next()));
            while (it.hasNext()) {
                a10.append(this.f74600a);
                a10.append(a(it.next()));
            }
        }
        return a10;
    }

    public final String join(Iterator<?> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public c1 withKeyValueSeparator(String str) {
        return new c1(this, str);
    }

    public d1(d1 d1Var) {
        this.f74600a = d1Var.f74600a;
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        p1.checkNotNull(objArr);
        return join(new b1(objArr, obj, obj2));
    }

    public final <A extends Appendable> A appendTo(A a10, Object[] objArr) throws IOException {
        return (A) appendTo((d1) a10, (Iterable<?>) Arrays.asList(objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb2, Iterable<?> iterable) {
        return appendTo(sb2, iterable.iterator());
    }

    public final StringBuilder appendTo(StringBuilder sb2, Iterator<?> it) {
        try {
            appendTo((d1) sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final StringBuilder appendTo(StringBuilder sb2, Object[] objArr) {
        return appendTo(sb2, (Iterable<?>) Arrays.asList(objArr));
    }

    public final <A extends Appendable> A appendTo(A a10, Object obj, Object obj2, Object... objArr) throws IOException {
        p1.checkNotNull(objArr);
        return (A) appendTo((d1) a10, (Iterable<?>) new b1(objArr, obj, obj2));
    }

    public final StringBuilder appendTo(StringBuilder sb2, Object obj, Object obj2, Object... objArr) {
        p1.checkNotNull(objArr);
        return appendTo(sb2, (Iterable<?>) new b1(objArr, obj, obj2));
    }
}

package io.odeeo.internal.t0;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f66432a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends n {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f66433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, String str) {
            super(nVar, null);
            this.f66433b = str;
        }

        @Override // io.odeeo.internal.t0.n
        public CharSequence a(Object obj) {
            return obj == null ? this.f66433b : n.this.a(obj);
        }

        @Override // io.odeeo.internal.t0.n
        public n skipNulls() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // io.odeeo.internal.t0.n
        public n useForNull(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends n {
        public b(n nVar) {
            super(nVar, null);
        }

        @Override // io.odeeo.internal.t0.n
        public <A extends Appendable> A appendTo(A a10, Iterator<?> it) throws IOException {
            u.checkNotNull(a10, "appendable");
            u.checkNotNull(it, "parts");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a10.append(n.this.a(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a10.append(n.this.f66432a);
                    a10.append(n.this.a(next2));
                }
            }
            return a10;
        }

        @Override // io.odeeo.internal.t0.n
        public n useForNull(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // io.odeeo.internal.t0.n
        public d withKeyValueSeparator(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends AbstractList<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f66436a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f66437b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f66438c;

        public c(Object[] objArr, Object obj, Object obj2) {
            this.f66436a = objArr;
            this.f66437b = obj;
            this.f66438c = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return i10 != 0 ? i10 != 1 ? this.f66436a[i10 - 2] : this.f66438c : this.f66437b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f66436a.length + 2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final n f66439a;

        /* renamed from: b, reason: collision with root package name */
        public final String f66440b;

        public /* synthetic */ d(n nVar, String str, a aVar) {
            this(nVar, str);
        }

        public <A extends Appendable> A appendTo(A a10, Map<?, ?> map) throws IOException {
            return (A) appendTo((d) a10, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public d useForNull(String str) {
            return new d(this.f66439a.useForNull(str), this.f66440b);
        }

        public d(n nVar, String str) {
            this.f66439a = nVar;
            this.f66440b = (String) u.checkNotNull(str);
        }

        public StringBuilder appendTo(StringBuilder sb2, Map<?, ?> map) {
            return appendTo(sb2, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        public <A extends Appendable> A appendTo(A a10, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo((d) a10, iterable.iterator());
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        public <A extends Appendable> A appendTo(A a10, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            u.checkNotNull(a10);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a10.append(this.f66439a.a(next.getKey()));
                a10.append(this.f66440b);
                a10.append(this.f66439a.a(next.getValue()));
                while (it.hasNext()) {
                    a10.append(this.f66439a.f66432a);
                    Map.Entry<?, ?> next2 = it.next();
                    a10.append(this.f66439a.a(next2.getKey()));
                    a10.append(this.f66440b);
                    a10.append(this.f66439a.a(next2.getValue()));
                }
            }
            return a10;
        }

        public StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb2, iterable.iterator());
        }

        public StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo((d) sb2, it);
                return sb2;
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public /* synthetic */ n(n nVar, a aVar) {
        this(nVar);
    }

    public static n on(String str) {
        return new n(str);
    }

    public <A extends Appendable> A appendTo(A a10, Iterable<?> iterable) throws IOException {
        return (A) appendTo((n) a10, iterable.iterator());
    }

    public final String join(Iterable<?> iterable) {
        return join(iterable.iterator());
    }

    public n skipNulls() {
        return new b(this);
    }

    public n useForNull(String str) {
        u.checkNotNull(str);
        return new a(this, str);
    }

    public d withKeyValueSeparator(char c10) {
        return withKeyValueSeparator(String.valueOf(c10));
    }

    public n(String str) {
        this.f66432a = (String) u.checkNotNull(str);
    }

    public static n on(char c10) {
        return new n(String.valueOf(c10));
    }

    public CharSequence a(Object obj) {
        u.checkNotNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public <A extends Appendable> A appendTo(A a10, Iterator<?> it) throws IOException {
        u.checkNotNull(a10);
        if (it.hasNext()) {
            a10.append(a(it.next()));
            while (it.hasNext()) {
                a10.append(this.f66432a);
                a10.append(a(it.next()));
            }
        }
        return a10;
    }

    public final String join(Iterator<?> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public d withKeyValueSeparator(String str) {
        return new d(this, str, null);
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    public n(n nVar) {
        this.f66432a = nVar.f66432a;
    }

    public static Iterable<Object> a(Object obj, Object obj2, Object[] objArr) {
        u.checkNotNull(objArr);
        return new c(objArr, obj, obj2);
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        return join(a(obj, obj2, objArr));
    }

    public final <A extends Appendable> A appendTo(A a10, Object[] objArr) throws IOException {
        return (A) appendTo((n) a10, (Iterable<?>) Arrays.asList(objArr));
    }

    public final <A extends Appendable> A appendTo(A a10, Object obj, Object obj2, Object... objArr) throws IOException {
        return (A) appendTo((n) a10, a(obj, obj2, objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb2, Iterable<?> iterable) {
        return appendTo(sb2, iterable.iterator());
    }

    public final StringBuilder appendTo(StringBuilder sb2, Iterator<?> it) {
        try {
            appendTo((n) sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final StringBuilder appendTo(StringBuilder sb2, Object[] objArr) {
        return appendTo(sb2, (Iterable<?>) Arrays.asList(objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb2, Object obj, Object obj2, Object... objArr) {
        return appendTo(sb2, a(obj, obj2, objArr));
    }
}

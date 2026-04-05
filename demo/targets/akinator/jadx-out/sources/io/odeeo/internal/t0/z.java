package io.odeeo.internal.t0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.t0.d f66473a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66474b;

    /* renamed from: c, reason: collision with root package name */
    public final h f66475c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66476d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.t0.d f66477a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.t0.z$a$a, reason: collision with other inner class name */
        public class C0652a extends g {
            public C0652a(z zVar, CharSequence charSequence) {
                super(zVar, charSequence);
            }

            @Override // io.odeeo.internal.t0.z.g
            public int separatorEnd(int i10) {
                return i10 + 1;
            }

            @Override // io.odeeo.internal.t0.z.g
            public int separatorStart(int i10) {
                return a.this.f66477a.indexIn(this.f66490c, i10);
            }
        }

        public a(io.odeeo.internal.t0.d dVar) {
            this.f66477a = dVar;
        }

        @Override // io.odeeo.internal.t0.z.h
        public g iterator(z zVar, CharSequence charSequence) {
            return new C0652a(zVar, charSequence);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f66479a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends g {
            public a(z zVar, CharSequence charSequence) {
                super(zVar, charSequence);
            }

            @Override // io.odeeo.internal.t0.z.g
            public int separatorEnd(int i10) {
                return b.this.f66479a.length() + i10;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // io.odeeo.internal.t0.z.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int separatorStart(int r6) {
                /*
                    r5 = this;
                    io.odeeo.internal.t0.z$b r0 = io.odeeo.internal.t0.z.b.this
                    java.lang.String r0 = r0.f66479a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f66490c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f66490c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    io.odeeo.internal.t0.z$b r4 = io.odeeo.internal.t0.z.b.this
                    java.lang.String r4 = r4.f66479a
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.t0.z.b.a.separatorStart(int):int");
            }
        }

        public b(String str) {
            this.f66479a = str;
        }

        @Override // io.odeeo.internal.t0.z.h
        public g iterator(z zVar, CharSequence charSequence) {
            return new a(zVar, charSequence);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.t0.g f66481a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends g {

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ io.odeeo.internal.t0.f f66482h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z zVar, CharSequence charSequence, io.odeeo.internal.t0.f fVar) {
                super(zVar, charSequence);
                this.f66482h = fVar;
            }

            @Override // io.odeeo.internal.t0.z.g
            public int separatorEnd(int i10) {
                return this.f66482h.end();
            }

            @Override // io.odeeo.internal.t0.z.g
            public int separatorStart(int i10) {
                if (this.f66482h.find(i10)) {
                    return this.f66482h.start();
                }
                return -1;
            }
        }

        public c(io.odeeo.internal.t0.g gVar) {
            this.f66481a = gVar;
        }

        @Override // io.odeeo.internal.t0.z.h
        public g iterator(z zVar, CharSequence charSequence) {
            return new a(zVar, charSequence, this.f66481a.matcher(charSequence));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f66484a;

        public d(int i10) {
            this.f66484a = i10;
        }

        @Override // io.odeeo.internal.t0.z.h
        public g iterator(z zVar, CharSequence charSequence) {
            return new a(zVar, charSequence);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends g {
            public a(z zVar, CharSequence charSequence) {
                super(zVar, charSequence);
            }

            @Override // io.odeeo.internal.t0.z.g
            public int separatorStart(int i10) {
                int i11 = i10 + d.this.f66484a;
                if (i11 < this.f66490c.length()) {
                    return i11;
                }
                return -1;
            }

            @Override // io.odeeo.internal.t0.z.g
            public int separatorEnd(int i10) {
                return i10;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Iterable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f66486a;

        public e(CharSequence charSequence) {
            this.f66486a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return z.this.a(this.f66486a);
        }

        public String toString() {
            n nVarOn = n.on(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            StringBuilder sbAppendTo = nVarOn.appendTo(sb2, (Iterable<?>) this);
            sbAppendTo.append(AbstractJsonLexerKt.END_LIST);
            return sbAppendTo.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final z f66488a;

        /* renamed from: b, reason: collision with root package name */
        public final z f66489b;

        public /* synthetic */ f(z zVar, z zVar2, a aVar) {
            this(zVar, zVar2);
        }

        public Map<String, String> split(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f66488a.split(charSequence)) {
                Iterator itA = this.f66489b.a(str);
                u.checkArgument(itA.hasNext(), "Chunk [%s] is not a valid entry", str);
                String str2 = (String) itA.next();
                u.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                u.checkArgument(itA.hasNext(), "Chunk [%s] is not a valid entry", str);
                linkedHashMap.put(str2, (String) itA.next());
                u.checkArgument(!itA.hasNext(), "Chunk [%s] is not a valid entry", str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        public f(z zVar, z zVar2) {
            this.f66488a = zVar;
            this.f66489b = (z) u.checkNotNull(zVar2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class g extends io.odeeo.internal.t0.b<String> {

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f66490c;

        /* renamed from: d, reason: collision with root package name */
        public final io.odeeo.internal.t0.d f66491d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f66492e;

        /* renamed from: f, reason: collision with root package name */
        public int f66493f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f66494g;

        public g(z zVar, CharSequence charSequence) {
            this.f66491d = zVar.f66473a;
            this.f66492e = zVar.f66474b;
            this.f66494g = zVar.f66476d;
            this.f66490c = charSequence;
        }

        @Override // io.odeeo.internal.t0.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int iSeparatorStart;
            int i10 = this.f66493f;
            while (true) {
                int i11 = this.f66493f;
                if (i11 == -1) {
                    return b();
                }
                iSeparatorStart = separatorStart(i11);
                if (iSeparatorStart == -1) {
                    iSeparatorStart = this.f66490c.length();
                    this.f66493f = -1;
                } else {
                    this.f66493f = separatorEnd(iSeparatorStart);
                }
                int i12 = this.f66493f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f66493f = i13;
                    if (i13 > this.f66490c.length()) {
                        this.f66493f = -1;
                    }
                } else {
                    while (i10 < iSeparatorStart && this.f66491d.matches(this.f66490c.charAt(i10))) {
                        i10++;
                    }
                    while (iSeparatorStart > i10 && this.f66491d.matches(this.f66490c.charAt(iSeparatorStart - 1))) {
                        iSeparatorStart--;
                    }
                    if (!this.f66492e || i10 != iSeparatorStart) {
                        break;
                    }
                    i10 = this.f66493f;
                }
            }
            int i14 = this.f66494g;
            if (i14 == 1) {
                iSeparatorStart = this.f66490c.length();
                this.f66493f = -1;
                while (iSeparatorStart > i10 && this.f66491d.matches(this.f66490c.charAt(iSeparatorStart - 1))) {
                    iSeparatorStart--;
                }
            } else {
                this.f66494g = i14 - 1;
            }
            return this.f66490c.subSequence(i10, iSeparatorStart).toString();
        }

        public abstract int separatorEnd(int i10);

        public abstract int separatorStart(int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface h {
        Iterator<String> iterator(z zVar, CharSequence charSequence);
    }

    public z(h hVar) {
        this(hVar, false, io.odeeo.internal.t0.d.none(), Integer.MAX_VALUE);
    }

    public static z fixedLength(int i10) {
        u.checkArgument(i10 > 0, "The length may not be less than 1");
        return new z(new d(i10));
    }

    public static z on(char c10) {
        return on(io.odeeo.internal.t0.d.is(c10));
    }

    public static z onPattern(String str) {
        return a(t.a(str));
    }

    public z limit(int i10) {
        u.checkArgument(i10 > 0, "must be greater than zero: %s", i10);
        return new z(this.f66475c, this.f66474b, this.f66473a, i10);
    }

    public z omitEmptyStrings() {
        return new z(this.f66475c, true, this.f66473a, this.f66476d);
    }

    public Iterable<String> split(CharSequence charSequence) {
        u.checkNotNull(charSequence);
        return new e(charSequence);
    }

    public List<String> splitToList(CharSequence charSequence) {
        u.checkNotNull(charSequence);
        Iterator<String> itA = a(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public z trimResults() {
        return trimResults(io.odeeo.internal.t0.d.whitespace());
    }

    public f withKeyValueSeparator(String str) {
        return withKeyValueSeparator(on(str));
    }

    public z(h hVar, boolean z10, io.odeeo.internal.t0.d dVar, int i10) {
        this.f66475c = hVar;
        this.f66474b = z10;
        this.f66473a = dVar;
        this.f66476d = i10;
    }

    public static z on(io.odeeo.internal.t0.d dVar) {
        u.checkNotNull(dVar);
        return new z(new a(dVar));
    }

    public z trimResults(io.odeeo.internal.t0.d dVar) {
        u.checkNotNull(dVar);
        return new z(this.f66475c, this.f66474b, dVar, this.f66476d);
    }

    public f withKeyValueSeparator(char c10) {
        return withKeyValueSeparator(on(c10));
    }

    public static z a(io.odeeo.internal.t0.g gVar) {
        u.checkArgument(!gVar.matcher("").matches(), "The pattern may not match the empty string: %s", gVar);
        return new z(new c(gVar));
    }

    public f withKeyValueSeparator(z zVar) {
        return new f(this, zVar, null);
    }

    public static z on(String str) {
        u.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new z(new b(str));
    }

    public final Iterator<String> a(CharSequence charSequence) {
        return this.f66475c.iterator(this, charSequence);
    }

    public static z on(Pattern pattern) {
        return a(new m(pattern));
    }
}

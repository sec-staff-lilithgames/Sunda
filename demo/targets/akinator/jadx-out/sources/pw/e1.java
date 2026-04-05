package pw;

import java.util.List;
import java.util.RandomAccess;
import pw.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e1 extends uu.g implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final a f81892e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final l0 f81893b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81894c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> e1 of(Iterable<? extends T> values, kv.l encode) {
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            kotlin.jvm.internal.e0.checkNotNullParameter(encode, "encode");
            List list = uu.y0.toList(values);
            l0.a aVar = l0.f81916e;
            int size = list.size();
            l[] lVarArr = new l[size];
            for (int i10 = 0; i10 < size; i10++) {
                lVarArr[i10] = encode.invoke(list.get(i10));
            }
            return new e1(list, aVar.of(lVarArr));
        }
    }

    public e1(List<Object> list, l0 options) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "list");
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        this.f81893b = options;
        List list2 = uu.y0.toList(list);
        this.f81894c = list2;
        if (list2.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static final <T> e1 of(Iterable<? extends T> iterable, kv.l lVar) {
        return f81892e.of(iterable, lVar);
    }

    @Override // uu.g, java.util.List
    public Object get(int i10) {
        return this.f81894c.get(i10);
    }

    public final List<Object> getList$okio() {
        return this.f81894c;
    }

    public final l0 getOptions$okio() {
        return this.f81893b;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f81894c.size();
    }
}

package rv;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class y extends x {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f85115a;

        public a(Iterator it) {
            this.f85115a = it;
        }

        @Override // rv.t
        public Iterator<T> iterator() {
            return this.f85115a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f85116a;

        public b(Object obj) {
            this.f85116a = obj;
        }

        @Override // rv.t
        public Iterator<T> iterator() {
            return new b0(this.f85116a);
        }
    }

    public static <T> t asSequence(Iterator<? extends T> it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "<this>");
        return constrainOnce(new a(it));
    }

    public static <T> t constrainOnce(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return tVar instanceof rv.a ? tVar : new rv.a(tVar);
    }

    public static <T> t emptySequence() {
        return i.f85023a;
    }

    public static final <T, C, R> t flatMapIndexed(t source, kv.p transform, kv.l iterator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        kotlin.jvm.internal.e0.checkNotNullParameter(iterator, "iterator");
        return w.sequence(new z(source, transform, iterator, null));
    }

    public static final <T> t flatten(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        f.j0 j0Var = new f.j0(18);
        return tVar instanceof f1 ? ((f1) tVar).flatten$kotlin_stdlib(j0Var) : new m(tVar, new a1.o(0), j0Var);
    }

    public static final <T> t flattenSequenceOfIterable(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        f.j0 j0Var = new f.j0(19);
        return tVar instanceof f1 ? ((f1) tVar).flatten$kotlin_stdlib(j0Var) : new m(tVar, new a1.o(0), j0Var);
    }

    public static <T> t generateSequence(kv.a nextFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nextFunction, "nextFunction");
        return constrainOnce(new o(nextFunction, new o5.x0(1, nextFunction)));
    }

    public static final <T> t ifEmpty(t tVar, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        return w.sequence(new a0(tVar, defaultValue, null));
    }

    public static final <T> t sequenceOf(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return uu.k0.asSequence(elements);
    }

    public static final <T> t shuffled(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return shuffled(tVar, ov.g.f79860b);
    }

    public static final <T, R> tu.v unzip(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            tu.v vVar = (tu.v) it.next();
            arrayList.add(vVar.getFirst());
            arrayList2.add(vVar.getSecond());
        }
        return tu.e0.to(arrayList, arrayList2);
    }

    public static <T> t generateSequence(T t10, kv.l nextFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nextFunction, "nextFunction");
        return t10 == null ? i.f85023a : new o(new o6.v0(t10, 6), nextFunction);
    }

    public static final <T> t sequenceOf(T t10) {
        return new b(t10);
    }

    public static final <T> t shuffled(t tVar, ov.g random) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(random, "random");
        return w.sequence(new c0(tVar, random, null));
    }

    public static <T> t generateSequence(kv.a seedFunction, kv.l nextFunction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(seedFunction, "seedFunction");
        kotlin.jvm.internal.e0.checkNotNullParameter(nextFunction, "nextFunction");
        return new o(seedFunction, nextFunction);
    }
}

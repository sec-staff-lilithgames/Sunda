package mh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g2 {
    public static String a(Iterable iterable, String str) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> q1 alwaysFalse() {
        return d2.f74602c;
    }

    public static <T> q1 alwaysTrue() {
        return d2.f74601b;
    }

    public static <T> q1 and(Iterable<? extends q1> iterable) {
        return new r1(b(iterable));
    }

    public static ArrayList b(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(p1.checkNotNull(it.next()));
        }
        return arrayList;
    }

    public static <A, B> q1 compose(q1 q1Var, v0 v0Var) {
        return new s1(q1Var, v0Var);
    }

    public static q1 contains(Pattern pattern) {
        return new u1(new y0(pattern));
    }

    public static q1 containsPattern(String str) {
        p1.checkNotNull(str);
        return new t1(o1.f74664a.compile(str));
    }

    public static <T> q1 equalTo(T t10) {
        return t10 == null ? isNull() : new x1(t10);
    }

    public static <T> q1 in(Collection<? extends T> collection) {
        return new v1(collection);
    }

    public static <T> q1 instanceOf(Class<?> cls) {
        return new w1(cls);
    }

    public static <T> q1 isNull() {
        return d2.f74603e;
    }

    public static <T> q1 not(q1 q1Var) {
        return new y1(q1Var);
    }

    public static <T> q1 notNull() {
        return d2.f74604f;
    }

    public static <T> q1 or(Iterable<? extends q1> iterable) {
        return new e2(b(iterable));
    }

    public static q1 subtypeOf(Class<?> cls) {
        return new f2(cls);
    }

    @SafeVarargs
    public static <T> q1 and(q1... q1VarArr) {
        return new r1(b(Arrays.asList(q1VarArr)));
    }

    @SafeVarargs
    public static <T> q1 or(q1... q1VarArr) {
        return new e2(b(Arrays.asList(q1VarArr)));
    }

    public static <T> q1 and(q1 q1Var, q1 q1Var2) {
        return new r1(Arrays.asList((q1) p1.checkNotNull(q1Var), (q1) p1.checkNotNull(q1Var2)));
    }

    public static <T> q1 or(q1 q1Var, q1 q1Var2) {
        return new e2(Arrays.asList((q1) p1.checkNotNull(q1Var), (q1) p1.checkNotNull(q1Var2)));
    }
}

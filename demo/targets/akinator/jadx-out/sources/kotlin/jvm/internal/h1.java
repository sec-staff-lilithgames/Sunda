package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h1 {
    public static Collection asMutableCollection(Object obj) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.b)) {
            throwCce(obj, "kotlin.collections.MutableCollection");
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.b)) {
            throwCce(obj, "kotlin.collections.MutableIterable");
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.c)) {
            throwCce(obj, "kotlin.collections.MutableIterator");
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.d)) {
            throwCce(obj, "kotlin.collections.MutableList");
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.e)) {
            throwCce(obj, "kotlin.collections.MutableListIterator");
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.g)) {
            throwCce(obj, "kotlin.collections.MutableMap");
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.f)) {
            throwCce(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.h)) {
            throwCce(obj, "kotlin.collections.MutableSet");
        }
        return castToSet(obj);
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i10) {
        if (obj != null && !isFunctionOfArity(obj, i10)) {
            throwCce(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection castToCollection(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw throwCce(e10);
        }
    }

    public static Iterable castToIterable(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw throwCce(e10);
        }
    }

    public static Iterator castToIterator(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e10) {
            throw throwCce(e10);
        }
    }

    public static List castToList(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw throwCce(e10);
        }
    }

    public static ListIterator castToListIterator(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e10) {
            throw throwCce(e10);
        }
    }

    public static Map castToMap(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw throwCce(e10);
        }
    }

    public static Map.Entry castToMapEntry(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e10) {
            throw throwCce(e10);
        }
    }

    public static Set castToSet(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw throwCce(e10);
        }
    }

    public static int getFunctionArity(Object obj) {
        if (obj instanceof y) {
            return ((y) obj).getArity();
        }
        if (obj instanceof kv.a) {
            return 0;
        }
        if (obj instanceof kv.l) {
            return 1;
        }
        if (obj instanceof kv.p) {
            return 2;
        }
        if (obj instanceof kv.q) {
            return 3;
        }
        if (obj instanceof kv.r) {
            return 4;
        }
        if (obj instanceof kv.s) {
            return 5;
        }
        if (obj instanceof kv.t) {
            return 6;
        }
        if (obj instanceof kv.u) {
            return 7;
        }
        if (obj instanceof kv.v) {
            return 8;
        }
        if (obj instanceof kv.w) {
            return 9;
        }
        if (obj instanceof kv.b) {
            return 10;
        }
        if (obj instanceof kv.c) {
            return 11;
        }
        if (obj instanceof kv.e) {
            return 13;
        }
        if (obj instanceof kv.f) {
            return 14;
        }
        if (obj instanceof kv.g) {
            return 15;
        }
        if (obj instanceof kv.h) {
            return 16;
        }
        if (obj instanceof kv.i) {
            return 17;
        }
        if (obj instanceof kv.j) {
            return 18;
        }
        if (obj instanceof kv.k) {
            return 19;
        }
        if (obj instanceof kv.m) {
            return 20;
        }
        return obj instanceof kv.n ? 21 : -1;
    }

    public static boolean isFunctionOfArity(Object obj, int i10) {
        return (obj instanceof tu.i) && getFunctionArity(obj) == i10;
    }

    public static boolean isMutableCollection(Object obj) {
        if (obj instanceof Collection) {
            return !(obj instanceof lv.a) || (obj instanceof lv.b);
        }
        return false;
    }

    public static boolean isMutableIterable(Object obj) {
        if (obj instanceof Iterable) {
            return !(obj instanceof lv.a) || (obj instanceof lv.b);
        }
        return false;
    }

    public static boolean isMutableIterator(Object obj) {
        if (obj instanceof Iterator) {
            return !(obj instanceof lv.a) || (obj instanceof lv.c);
        }
        return false;
    }

    public static boolean isMutableList(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof lv.a) || (obj instanceof lv.d);
        }
        return false;
    }

    public static boolean isMutableListIterator(Object obj) {
        if (obj instanceof ListIterator) {
            return !(obj instanceof lv.a) || (obj instanceof lv.e);
        }
        return false;
    }

    public static boolean isMutableMap(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof lv.a) || (obj instanceof lv.g);
        }
        return false;
    }

    public static boolean isMutableMapEntry(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof lv.a) || (obj instanceof lv.f);
        }
        return false;
    }

    public static boolean isMutableSet(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof lv.a) || (obj instanceof lv.h);
        }
        return false;
    }

    public static ClassCastException throwCce(ClassCastException classCastException) {
        e0.b(h1.class.getName(), classCastException);
        throw classCastException;
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i10, String str) {
        if (obj != null && !isFunctionOfArity(obj, i10)) {
            throwCce(str);
        }
        return obj;
    }

    public static void throwCce(Object obj, String str) {
        throwCce((obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static Collection asMutableCollection(Object obj, String str) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.b)) {
            throwCce(str);
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj, String str) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.b)) {
            throwCce(str);
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj, String str) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.c)) {
            throwCce(str);
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj, String str) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.d)) {
            throwCce(str);
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj, String str) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.e)) {
            throwCce(str);
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj, String str) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.g)) {
            throwCce(str);
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj, String str) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.f)) {
            throwCce(str);
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj, String str) {
        if ((obj instanceof lv.a) && !(obj instanceof lv.h)) {
            throwCce(str);
        }
        return castToSet(obj);
    }

    public static void throwCce(String str) {
        throw throwCce(new ClassCastException(str));
    }
}

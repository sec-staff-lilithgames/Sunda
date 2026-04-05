package nh;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class yc {
    public static <K0 extends Enum<K0>> uc enumKeys(Class<K0> cls) {
        mh.p1.checkNotNull(cls);
        return new hc(cls, 1);
    }

    public static uc hashKeys() {
        return hashKeys(8);
    }

    public static uc linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static uc treeKeys() {
        return treeKeys(we.natural());
    }

    public abstract <K, V> fc build();

    public <K, V> fc build(fc fcVar) {
        fc fcVarBuild = build();
        fcVarBuild.putAll(fcVar);
        return fcVarBuild;
    }

    public static uc hashKeys(int i10) {
        jh.i.o(i10, "expectedKeys");
        return new gc(i10, 0);
    }

    public static uc linkedHashKeys(int i10) {
        jh.i.o(i10, "expectedKeys");
        return new gc(i10, 1);
    }

    public static <K0> uc treeKeys(Comparator<K0> comparator) {
        mh.p1.checkNotNull(comparator);
        return new hc(comparator, 0);
    }
}

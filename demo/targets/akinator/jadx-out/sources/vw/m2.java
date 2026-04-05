package vw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class m2 extends LinkedHashMap implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final r3 f89985b;

    public m2() {
        this(null);
    }

    public String[] getKeys() throws Exception {
        HashSet hashSet = new HashSet();
        Iterator<i2> it = iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            if (next != null) {
                String path = next.getPath();
                String name = next.getName();
                hashSet.add(path);
                hashSet.add(name);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    public i2 getLabel(String str) {
        return (i2) remove(str);
    }

    public m2 getLabels() throws Exception {
        m2 m2Var = new m2(this.f89985b);
        Iterator<i2> it = iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            if (next != null) {
                m2Var.put(next.getPath(), next);
            }
        }
        return m2Var;
    }

    public String[] getPaths() throws Exception {
        HashSet hashSet = new HashSet();
        Iterator<i2> it = iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            if (next != null) {
                hashSet.add(next.getPath());
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    public boolean isStrict(l0 l0Var) {
        r3 r3Var = this.f89985b;
        return r3Var == null ? l0Var.isStrict() : l0Var.isStrict() && r3Var.isStrict();
    }

    @Override // java.lang.Iterable
    public Iterator<i2> iterator() {
        return values().iterator();
    }

    public m2(r3 r3Var) {
        this.f89985b = r3Var;
    }
}

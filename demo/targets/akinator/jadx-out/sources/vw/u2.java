package vw;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u2 extends LinkedHashMap implements Iterable {
    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return keySet().iterator();
    }

    public s2 take(String str) {
        return (s2) remove(str);
    }
}

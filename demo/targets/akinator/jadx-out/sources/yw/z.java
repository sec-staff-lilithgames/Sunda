package yw;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface z extends Iterable {
    v get(String str);

    String getName();

    v getNode();

    @Override // java.lang.Iterable
    Iterator<String> iterator();

    v put(String str, String str2);

    v remove(String str);
}

package yw;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface u extends Iterable {
    String getPrefix();

    String getPrefix(String str);

    String getReference(String str);

    @Override // java.lang.Iterable
    Iterator<String> iterator();

    String setReference(String str);

    String setReference(String str, String str2);
}

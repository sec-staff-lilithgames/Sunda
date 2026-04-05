package ub;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface o0 {
    z asToken();

    o0 at(String str) throws IllegalArgumentException;

    o0 at(w wVar);

    Iterator<String> fieldNames();

    o0 get(int i10);

    o0 get(String str);

    boolean isArray();

    boolean isContainerNode();

    boolean isMissingNode();

    boolean isObject();

    boolean isValueNode();

    s numberType();

    o0 path(int i10);

    o0 path(String str);

    int size();

    u traverse();

    u traverse(a0 a0Var);
}

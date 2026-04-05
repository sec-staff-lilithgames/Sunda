package com.explorestack.protobuf;

import com.explorestack.protobuf.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface u6 {
    void addRepeated(o6 o6Var, Object obj);

    void clear(o6 o6Var);

    Object get(k7 k7Var);

    Object get(o6 o6Var);

    Message.Builder getBuilder(o6 o6Var);

    Object getRaw(k7 k7Var);

    Object getRaw(o6 o6Var);

    Object getRepeated(k7 k7Var, int i10);

    Object getRepeated(o6 o6Var, int i10);

    Message.Builder getRepeatedBuilder(o6 o6Var, int i10);

    int getRepeatedCount(k7 k7Var);

    int getRepeatedCount(o6 o6Var);

    Object getRepeatedRaw(k7 k7Var, int i10);

    Object getRepeatedRaw(o6 o6Var, int i10);

    boolean has(k7 k7Var);

    boolean has(o6 o6Var);

    Message.Builder newBuilder();

    void set(o6 o6Var, Object obj);

    void setRepeated(o6 o6Var, int i10, Object obj);
}

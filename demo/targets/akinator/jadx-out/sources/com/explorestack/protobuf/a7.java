package com.explorestack.protobuf;

import com.explorestack.protobuf.Message;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a7 implements u6 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f21848a;

    /* renamed from: b, reason: collision with root package name */
    public final z6 f21849b;

    public a7(String str, Class cls, Class cls2) {
        z6 z6Var = new z6(str, cls, cls2);
        this.f21848a = z6Var.f22954c.getReturnType();
        this.f21849b = z6Var;
    }

    @Override // com.explorestack.protobuf.u6
    public void addRepeated(o6 o6Var, Object obj) {
        this.f21849b.addRepeated(o6Var, obj);
    }

    @Override // com.explorestack.protobuf.u6
    public void clear(o6 o6Var) {
        this.f21849b.clear(o6Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object get(k7 k7Var) {
        return this.f21849b.get(k7Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Message.Builder getBuilder(o6 o6Var) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRaw(k7 k7Var) {
        return get(k7Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeated(k7 k7Var, int i10) {
        return this.f21849b.getRepeated(k7Var, i10);
    }

    @Override // com.explorestack.protobuf.u6
    public Message.Builder getRepeatedBuilder(o6 o6Var, int i10) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.explorestack.protobuf.u6
    public int getRepeatedCount(k7 k7Var) {
        return this.f21849b.getRepeatedCount(k7Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeatedRaw(k7 k7Var, int i10) {
        return getRepeated(k7Var, i10);
    }

    @Override // com.explorestack.protobuf.u6
    public boolean has(k7 k7Var) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.explorestack.protobuf.u6
    public Message.Builder newBuilder() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // com.explorestack.protobuf.u6
    public void set(o6 o6Var, Object obj) {
        clear(o6Var);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            addRepeated(o6Var, it.next());
        }
    }

    @Override // com.explorestack.protobuf.u6
    public void setRepeated(o6 o6Var, int i10, Object obj) {
        this.f21849b.setRepeated(o6Var, i10, obj);
    }

    @Override // com.explorestack.protobuf.u6
    public Object get(o6 o6Var) {
        return this.f21849b.get(o6Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRaw(o6 o6Var) {
        return get(o6Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeated(o6 o6Var, int i10) {
        return this.f21849b.getRepeated(o6Var, i10);
    }

    @Override // com.explorestack.protobuf.u6
    public int getRepeatedCount(o6 o6Var) {
        return this.f21849b.getRepeatedCount(o6Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeatedRaw(o6 o6Var, int i10) {
        return getRepeated(o6Var, i10);
    }

    @Override // com.explorestack.protobuf.u6
    public boolean has(o6 o6Var) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }
}

package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v6 implements u6 {

    /* renamed from: a, reason: collision with root package name */
    public final Descriptors.FieldDescriptor f22780a;

    /* renamed from: b, reason: collision with root package name */
    public final Message f22781b;

    public v6(Descriptors.FieldDescriptor fieldDescriptor, Class cls) {
        this.f22780a = fieldDescriptor;
        this.f22781b = ((k7) k7.access$1100(k7.access$1000(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).internalGetMapField(fieldDescriptor.getNumber()).f21954e.getMessageDefaultInstance();
    }

    @Override // com.explorestack.protobuf.u6
    public void addRepeated(o6 o6Var, Object obj) {
        List listD = o6Var.internalGetMutableMapField(this.f22780a.getNumber()).d();
        Message messageBuild = (Message) obj;
        if (messageBuild == null) {
            messageBuild = null;
        } else {
            Message message = this.f22781b;
            if (!message.getClass().isInstance(messageBuild)) {
                messageBuild = message.toBuilder().mergeFrom(messageBuild).build();
            }
        }
        ((ArrayList) listD).add(messageBuild);
    }

    @Override // com.explorestack.protobuf.u6
    public void clear(o6 o6Var) {
        ((ArrayList) o6Var.internalGetMutableMapField(this.f22780a.getNumber()).d()).clear();
    }

    @Override // com.explorestack.protobuf.u6
    public Object get(k7 k7Var) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getRepeatedCount(k7Var); i10++) {
            arrayList.add(getRepeated(k7Var, i10));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.explorestack.protobuf.u6
    public Message.Builder getBuilder(o6 o6Var) {
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRaw(k7 k7Var) {
        return get(k7Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeated(k7 k7Var, int i10) {
        return k7Var.internalGetMapField(this.f22780a.getNumber()).c().get(i10);
    }

    @Override // com.explorestack.protobuf.u6
    public Message.Builder getRepeatedBuilder(o6 o6Var, int i10) {
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // com.explorestack.protobuf.u6
    public int getRepeatedCount(k7 k7Var) {
        return k7Var.internalGetMapField(this.f22780a.getNumber()).c().size();
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeatedRaw(k7 k7Var, int i10) {
        return getRepeated(k7Var, i10);
    }

    @Override // com.explorestack.protobuf.u6
    public boolean has(k7 k7Var) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.explorestack.protobuf.u6
    public Message.Builder newBuilder() {
        return this.f22781b.newBuilderForType();
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
        List listD = o6Var.internalGetMutableMapField(this.f22780a.getNumber()).d();
        Message messageBuild = (Message) obj;
        if (messageBuild == null) {
            messageBuild = null;
        } else {
            Message message = this.f22781b;
            if (!message.getClass().isInstance(messageBuild)) {
                messageBuild = message.toBuilder().mergeFrom(messageBuild).build();
            }
        }
        ((ArrayList) listD).set(i10, messageBuild);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRaw(o6 o6Var) {
        return get(o6Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeatedRaw(o6 o6Var, int i10) {
        return getRepeated(o6Var, i10);
    }

    @Override // com.explorestack.protobuf.u6
    public boolean has(o6 o6Var) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeated(o6 o6Var, int i10) {
        return o6Var.internalGetMapField(this.f22780a.getNumber()).c().get(i10);
    }

    @Override // com.explorestack.protobuf.u6
    public int getRepeatedCount(o6 o6Var) {
        return o6Var.internalGetMapField(this.f22780a.getNumber()).c().size();
    }

    @Override // com.explorestack.protobuf.u6
    public Object get(o6 o6Var) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getRepeatedCount(o6Var); i10++) {
            arrayList.add(getRepeated(o6Var, i10));
        }
        return Collections.unmodifiableList(arrayList);
    }
}

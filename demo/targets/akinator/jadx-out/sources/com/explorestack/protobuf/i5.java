package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i5 extends m5 {

    /* renamed from: i, reason: collision with root package name */
    public static final i5 f22227i = new i5(0);

    /* renamed from: e, reason: collision with root package name */
    public final Map f22228e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f22229f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f22230g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f22231h;

    public i5() {
        this.f22228e = new HashMap();
        this.f22229f = new HashMap();
        this.f22230g = new HashMap();
        this.f22231h = new HashMap();
    }

    public static i5 getEmptyRegistry() {
        return f22227i;
    }

    public static i5 newInstance() {
        return new i5();
    }

    public final void a(h5 h5Var, int i10) {
        Map map;
        Map map2;
        Descriptors.FieldDescriptor fieldDescriptor = h5Var.f22194a;
        if (!fieldDescriptor.isExtension()) {
            throw new IllegalArgumentException("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
        }
        int iC = b3.h.c(i10);
        if (iC == 0) {
            map = this.f22228e;
            map2 = this.f22230g;
        } else {
            if (iC != 1) {
                return;
            }
            map = this.f22229f;
            map2 = this.f22231h;
        }
        map.put(fieldDescriptor.getFullName(), h5Var);
        map2.put(new g5(fieldDescriptor.getContainingType(), fieldDescriptor.getNumber()), h5Var);
        if (fieldDescriptor.getContainingType().getOptions().getMessageSetWireFormat() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.isOptional() && fieldDescriptor.getExtensionScope() == fieldDescriptor.getMessageType()) {
            map.put(fieldDescriptor.getMessageType().getFullName(), h5Var);
        }
    }

    public void add(e5 e5Var) {
        h5 h5Var;
        if (e5Var.b() == 1 || e5Var.b() == 2) {
            if (e5Var.getDescriptor().getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                h5Var = new h5(e5Var.getDescriptor(), null);
            } else {
                if (e5Var.getMessageDefaultInstance() == null) {
                    throw new IllegalStateException("Registered message-type extension had null default instance: " + e5Var.getDescriptor().getFullName());
                }
                h5Var = new h5(e5Var.getDescriptor(), e5Var.getMessageDefaultInstance());
            }
            a(h5Var, e5Var.b());
        }
    }

    @Deprecated
    public h5 findExtensionByName(String str) {
        return findImmutableExtensionByName(str);
    }

    @Deprecated
    public h5 findExtensionByNumber(Descriptors.Descriptor descriptor, int i10) {
        return findImmutableExtensionByNumber(descriptor, i10);
    }

    public h5 findImmutableExtensionByName(String str) {
        return (h5) this.f22228e.get(str);
    }

    public h5 findImmutableExtensionByNumber(Descriptors.Descriptor descriptor, int i10) {
        return (h5) this.f22230g.get(new g5(descriptor, i10));
    }

    public h5 findMutableExtensionByName(String str) {
        return (h5) this.f22229f.get(str);
    }

    public h5 findMutableExtensionByNumber(Descriptors.Descriptor descriptor, int i10) {
        return (h5) this.f22231h.get(new g5(descriptor, i10));
    }

    public Set<h5> getAllImmutableExtensionsByExtendedType(String str) {
        HashSet hashSet = new HashSet();
        Map map = this.f22230g;
        for (g5 g5Var : map.keySet()) {
            if (g5Var.f22160a.getFullName().equals(str)) {
                hashSet.add(map.get(g5Var));
            }
        }
        return hashSet;
    }

    public Set<h5> getAllMutableExtensionsByExtendedType(String str) {
        HashSet hashSet = new HashSet();
        Map map = this.f22231h;
        for (g5 g5Var : map.keySet()) {
            if (g5Var.f22160a.getFullName().equals(str)) {
                hashSet.add(map.get(g5Var));
            }
        }
        return hashSet;
    }

    @Override // com.explorestack.protobuf.m5
    public i5 getUnmodifiable() {
        return new i5(this);
    }

    public i5(i5 i5Var) {
        super(i5Var);
        this.f22228e = Collections.unmodifiableMap(i5Var.f22228e);
        this.f22229f = Collections.unmodifiableMap(i5Var.f22229f);
        this.f22230g = Collections.unmodifiableMap(i5Var.f22230g);
        this.f22231h = Collections.unmodifiableMap(i5Var.f22231h);
    }

    public void add(e6 e6Var) {
        add((e5) e6Var);
    }

    public i5(int i10) {
        super(m5.f22373d);
        Map map = Collections.EMPTY_MAP;
        this.f22228e = map;
        this.f22229f = map;
        this.f22230g = map;
        this.f22231h = map;
    }

    public void add(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            h5 h5Var = new h5(fieldDescriptor, null);
            a(h5Var, 1);
            a(h5Var, 2);
            return;
        }
        throw new IllegalArgumentException("ExtensionRegistry.add() must be provided a default instance when adding an embedded message extension.");
    }

    public void add(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            a(new h5(fieldDescriptor, message), 1);
            return;
        }
        throw new IllegalArgumentException("ExtensionRegistry.add() provided a default instance for a non-message extension.");
    }
}

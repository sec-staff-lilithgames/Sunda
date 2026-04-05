package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f22411a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f22412b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Stack f22413c = new Stack();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f22414d = new HashMap();

    public final m0 a(Descriptors.Descriptor descriptor) {
        m0 m0Var;
        ArrayList arrayList;
        boolean z10;
        n0 n0Var;
        int i10 = this.f22412b;
        this.f22412b = i10 + 1;
        m0 m0Var2 = new m0(descriptor, i10);
        Stack stack = this.f22413c;
        stack.push(m0Var2);
        HashMap map = this.f22414d;
        map.put(descriptor, m0Var2);
        for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                m0 m0Var3 = (m0) map.get(fieldDescriptor.getMessageType());
                if (m0Var3 == null) {
                    m0Var2.f22364c = Math.min(m0Var2.f22364c, a(fieldDescriptor.getMessageType()).f22364c);
                } else if (m0Var3.f22365d == null) {
                    m0Var2.f22364c = Math.min(m0Var2.f22364c, m0Var3.f22364c);
                }
            }
        }
        if (m0Var2.f22363b == m0Var2.f22364c) {
            n0 n0Var2 = new n0();
            do {
                m0Var = (m0) stack.pop();
                m0Var.f22365d = n0Var2;
                Descriptors.Descriptor descriptor2 = m0Var.f22362a;
                arrayList = n0Var2.f22385a;
                arrayList.add(descriptor2);
            } while (m0Var != m0Var2);
            Iterator it = arrayList.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) it.next();
                z10 = true;
                if (descriptor3.isExtendable()) {
                    break;
                }
                for (Descriptors.FieldDescriptor fieldDescriptor2 : descriptor3.getFields()) {
                    if (fieldDescriptor2.isRequired() || (fieldDescriptor2.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && (n0Var = ((m0) map.get(fieldDescriptor2.getMessageType())).f22365d) != n0Var2 && n0Var.f22386b)) {
                        break loop2;
                    }
                }
            }
            n0Var2.f22386b = z10;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.f22411a.put((Descriptors.Descriptor) it2.next(), Boolean.valueOf(n0Var2.f22386b));
            }
        }
        return m0Var2;
    }

    public boolean needsIsInitializedCheck(Descriptors.Descriptor descriptor) {
        Boolean bool = (Boolean) this.f22411a.get(descriptor);
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            try {
                Boolean bool2 = (Boolean) this.f22411a.get(descriptor);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return a(descriptor).f22365d.f22386b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

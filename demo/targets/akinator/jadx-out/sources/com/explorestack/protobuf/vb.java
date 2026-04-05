package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class vb {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f22782a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public HashMap f22783b = new HashMap();

    public final void a(Descriptors.FileDescriptor fileDescriptor) {
        if (this.f22782a.add(fileDescriptor.getFullName())) {
            Iterator<Descriptors.FileDescriptor> it = fileDescriptor.getDependencies().iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Iterator<Descriptors.Descriptor> it2 = fileDescriptor.getMessageTypes().iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
    }

    public vb add(Descriptors.Descriptor descriptor) {
        if (this.f22783b == null) {
            throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
        }
        a(descriptor.getFile());
        return this;
    }

    public final void b(Descriptors.Descriptor descriptor) {
        Iterator<Descriptors.Descriptor> it = descriptor.getNestedTypes().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        if (!this.f22783b.containsKey(descriptor.getFullName())) {
            this.f22783b.put(descriptor.getFullName(), descriptor);
            return;
        }
        xb.f22893b.warning("Type " + descriptor.getFullName() + " is added multiple times.");
    }

    public xb build() {
        xb xbVar = new xb(this.f22783b);
        this.f22783b = null;
        return xbVar;
    }

    public vb add(Iterable<Descriptors.Descriptor> iterable) {
        if (this.f22783b != null) {
            Iterator<Descriptors.Descriptor> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next().getFile());
            }
            return this;
        }
        throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
    }
}

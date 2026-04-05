package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i7 {

    /* renamed from: a, reason: collision with root package name */
    public final Descriptors.Descriptor f22232a;

    /* renamed from: b, reason: collision with root package name */
    public final u6[] f22233b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f22234c;

    /* renamed from: d, reason: collision with root package name */
    public final w6[] f22235d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f22236e;

    public i7(Descriptors.Descriptor descriptor, String[] strArr, Class<? extends k7> cls, Class<? extends o6> cls2) {
        this(descriptor, strArr);
        ensureFieldAccessorsInitialized(cls, cls2);
    }

    public static w6 a(i7 i7Var, Descriptors.OneofDescriptor oneofDescriptor) {
        i7Var.getClass();
        if (oneofDescriptor.getContainingType() == i7Var.f22232a) {
            return i7Var.f22235d[oneofDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    public static u6 b(i7 i7Var, Descriptors.FieldDescriptor fieldDescriptor) {
        i7Var.getClass();
        if (fieldDescriptor.getContainingType() != i7Var.f22232a) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        if (fieldDescriptor.isExtension()) {
            throw new IllegalArgumentException("This type does not have extensions.");
        }
        return i7Var.f22233b[fieldDescriptor.getIndex()];
    }

    public i7 ensureFieldAccessorsInitialized(Class<? extends k7> cls, Class<? extends o6> cls2) {
        if (this.f22236e) {
            return this;
        }
        synchronized (this) {
            try {
                if (this.f22236e) {
                    return this;
                }
                int length = this.f22233b.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Descriptors.FieldDescriptor fieldDescriptor = this.f22232a.getFields().get(i10);
                    String str = fieldDescriptor.getContainingOneof() != null ? this.f22234c[fieldDescriptor.getContainingOneof().getIndex() + length] : null;
                    if (fieldDescriptor.isRepeated()) {
                        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            if (fieldDescriptor.isMapField()) {
                                u6[] u6VarArr = this.f22233b;
                                String str2 = this.f22234c[i10];
                                u6VarArr[i10] = new v6(fieldDescriptor, cls);
                            } else {
                                this.f22233b[i10] = new b7(this.f22234c[i10], cls, cls2);
                            }
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                            this.f22233b[i10] = new x6(fieldDescriptor, this.f22234c[i10], cls, cls2);
                        } else {
                            this.f22233b[i10] = new a7(this.f22234c[i10], cls, cls2);
                        }
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        this.f22233b[i10] = new g7(fieldDescriptor, this.f22234c[i10], cls, cls2, str);
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                        this.f22233b[i10] = new c7(fieldDescriptor, this.f22234c[i10], cls, cls2, str);
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                        this.f22233b[i10] = new h7(fieldDescriptor, this.f22234c[i10], cls, cls2, str);
                    } else {
                        this.f22233b[i10] = new f7(fieldDescriptor, this.f22234c[i10], cls, cls2, str);
                    }
                    i10++;
                }
                int length2 = this.f22235d.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    this.f22235d[i11] = new w6(this.f22232a, i11, this.f22234c[i11 + length], cls, cls2);
                }
                this.f22236e = true;
                this.f22234c = null;
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i7(Descriptors.Descriptor descriptor, String[] strArr) {
        this.f22232a = descriptor;
        this.f22234c = strArr;
        this.f22233b = new u6[descriptor.getFields().size()];
        this.f22235d = new w6[descriptor.getOneofs().size()];
        this.f22236e = false;
    }
}

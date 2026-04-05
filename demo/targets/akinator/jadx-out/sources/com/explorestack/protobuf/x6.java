package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x6 extends a7 {

    /* renamed from: c, reason: collision with root package name */
    public final Descriptors.EnumDescriptor f22873c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22874d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f22875e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22876f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f22877g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f22878h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f22879i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f22880j;

    public x6(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2) {
        super(str, cls, cls2);
        this.f22873c = fieldDescriptor.getEnumType();
        this.f22874d = k7.access$1000(this.f21848a, "valueOf", new Class[]{Descriptors.EnumValueDescriptor.class});
        this.f22875e = k7.access$1000(this.f21848a, "getValueDescriptor", new Class[0]);
        boolean zSupportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
        this.f22876f = zSupportsUnknownEnumValue;
        if (zSupportsUnknownEnumValue) {
            String strL = a.b.l("get", str, "Value");
            Class cls3 = Integer.TYPE;
            this.f22877g = k7.access$1000(cls, strL, new Class[]{cls3});
            this.f22878h = k7.access$1000(cls2, a.b.l("get", str, "Value"), new Class[]{cls3});
            this.f22879i = k7.access$1000(cls2, a.b.l("set", str, "Value"), new Class[]{cls3, cls3});
            this.f22880j = k7.access$1000(cls2, a.b.l(ProductAction.ACTION_ADD, str, "Value"), new Class[]{cls3});
        }
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public void addRepeated(o6 o6Var, Object obj) {
        if (this.f22876f) {
            k7.access$1100(this.f22880j, o6Var, new Object[]{Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber())});
        } else {
            super.addRepeated(o6Var, k7.access$1100(this.f22874d, null, new Object[]{obj}));
        }
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public Object get(k7 k7Var) {
        ArrayList arrayList = new ArrayList();
        int repeatedCount = getRepeatedCount(k7Var);
        for (int i10 = 0; i10 < repeatedCount; i10++) {
            arrayList.add(getRepeated(k7Var, i10));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public Object getRepeated(k7 k7Var, int i10) {
        if (!this.f22876f) {
            return k7.access$1100(this.f22875e, super.getRepeated(k7Var, i10), new Object[0]);
        }
        return this.f22873c.findValueByNumberCreatingIfUnknown(((Integer) k7.access$1100(this.f22877g, k7Var, new Object[]{Integer.valueOf(i10)})).intValue());
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public void setRepeated(o6 o6Var, int i10, Object obj) {
        if (this.f22876f) {
            k7.access$1100(this.f22879i, o6Var, new Object[]{Integer.valueOf(i10), Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber())});
        } else {
            super.setRepeated(o6Var, i10, k7.access$1100(this.f22874d, null, new Object[]{obj}));
        }
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public Object get(o6 o6Var) {
        ArrayList arrayList = new ArrayList();
        int repeatedCount = getRepeatedCount(o6Var);
        for (int i10 = 0; i10 < repeatedCount; i10++) {
            arrayList.add(getRepeated(o6Var, i10));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public Object getRepeated(o6 o6Var, int i10) {
        if (this.f22876f) {
            return this.f22873c.findValueByNumberCreatingIfUnknown(((Integer) k7.access$1100(this.f22878h, o6Var, new Object[]{Integer.valueOf(i10)})).intValue());
        }
        return k7.access$1100(this.f22875e, super.getRepeated(o6Var, i10), new Object[0]);
    }
}

package nh;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d2 extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76169b;

    /* renamed from: c, reason: collision with root package name */
    public int f76170c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2 f76171e;

    public d2(f2 f2Var, int i10) {
        this.f76171e = f2Var;
        Object obj = f2.f76237l;
        this.f76169b = f2Var.r()[i10];
        this.f76170c = i10;
    }

    public final void a() {
        int i10 = this.f76170c;
        Object obj = this.f76169b;
        f2 f2Var = this.f76171e;
        if (i10 != -1 && i10 < f2Var.size()) {
            if (Objects.equals(obj, f2Var.r()[this.f76170c])) {
                return;
            }
        }
        Object obj2 = f2.f76237l;
        this.f76170c = f2Var.k(obj);
    }

    @Override // nh.a0, java.util.Map.Entry
    public Object getKey() {
        return this.f76169b;
    }

    @Override // nh.a0, java.util.Map.Entry
    public Object getValue() {
        f2 f2Var = this.f76171e;
        Map mapF = f2Var.f();
        if (mapF != null) {
            return mapF.get(this.f76169b);
        }
        a();
        int i10 = this.f76170c;
        if (i10 == -1) {
            return null;
        }
        return f2Var.s()[i10];
    }

    @Override // nh.a0, java.util.Map.Entry
    public Object setValue(Object obj) {
        f2 f2Var = this.f76171e;
        Map mapF = f2Var.f();
        Object obj2 = this.f76169b;
        if (mapF != null) {
            return mapF.put(obj2, obj);
        }
        a();
        int i10 = this.f76170c;
        if (i10 == -1) {
            f2Var.put(obj2, obj);
            return null;
        }
        Object obj3 = f2Var.s()[i10];
        f2Var.s()[this.f76170c] = obj;
        return obj3;
    }
}

package com.explorestack.protobuf;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m5 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f22371b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile m5 f22372c;

    /* renamed from: d, reason: collision with root package name */
    public static final m5 f22373d = new m5(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map f22374a;

    public m5() {
        this.f22374a = new HashMap();
    }

    public static m5 getEmptyRegistry() {
        m5 m5VarCreateEmpty;
        m5 m5Var = f22372c;
        if (m5Var != null) {
            return m5Var;
        }
        synchronized (m5.class) {
            try {
                m5VarCreateEmpty = f22372c;
                if (m5VarCreateEmpty == null) {
                    m5VarCreateEmpty = j5.createEmpty();
                    f22372c = m5VarCreateEmpty;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m5VarCreateEmpty;
    }

    public static boolean isEagerlyParseMessageSets() {
        return f22371b;
    }

    public static m5 newInstance() {
        return j5.create();
    }

    public static void setEagerlyParseMessageSets(boolean z10) {
        f22371b = z10;
    }

    public final void add(k6 k6Var) {
        this.f22374a.put(new l5(k6Var.getContainingTypeDefaultInstance(), k6Var.getNumber()), k6Var);
    }

    public <ContainingType extends MessageLite> k6 findLiteExtensionByNumber(ContainingType containingtype, int i10) {
        return (k6) this.f22374a.get(new l5(containingtype, i10));
    }

    public m5 getUnmodifiable() {
        return new m5(this);
    }

    public m5(m5 m5Var) {
        if (m5Var == f22373d) {
            this.f22374a = Collections.EMPTY_MAP;
        } else {
            this.f22374a = Collections.unmodifiableMap(m5Var.f22374a);
        }
    }

    public final void add(f5 f5Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (k6.class.isAssignableFrom(f5Var.getClass())) {
            add((k6) f5Var);
        }
        Class cls = j5.f22271a;
        if (cls == null || !cls.isAssignableFrom(getClass())) {
            return;
        }
        try {
            getClass().getMethod(ProductAction.ACTION_ADD, k5.f22307a).invoke(this, f5Var);
        } catch (Exception e10) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", f5Var), e10);
        }
    }

    public m5(int i10) {
        this.f22374a = Collections.EMPTY_MAP;
    }
}

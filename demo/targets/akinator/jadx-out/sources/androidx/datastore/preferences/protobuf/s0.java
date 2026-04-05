package androidx.datastore.preferences.protobuf;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f5987b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile s0 f5988c;

    /* renamed from: d, reason: collision with root package name */
    public static final s0 f5989d = new s0(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map f5990a;

    public s0() {
        this.f5990a = new HashMap();
    }

    public static s0 getEmptyRegistry() {
        s0 s0VarCreateEmpty;
        d3 d3Var = d3.f5851c;
        s0 s0Var = f5988c;
        if (s0Var != null) {
            return s0Var;
        }
        synchronized (s0.class) {
            try {
                s0VarCreateEmpty = f5988c;
                if (s0VarCreateEmpty == null) {
                    s0VarCreateEmpty = p0.createEmpty();
                    f5988c = s0VarCreateEmpty;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s0VarCreateEmpty;
    }

    public static boolean isEagerlyParseMessageSets() {
        return f5987b;
    }

    public static s0 newInstance() {
        d3 d3Var = d3.f5851c;
        return p0.create();
    }

    public static void setEagerlyParseMessageSets(boolean z10) {
        f5987b = z10;
    }

    public final void add(i1 i1Var) {
        this.f5990a.put(new r0(i1Var.getContainingTypeDefaultInstance(), i1Var.getNumber()), i1Var);
    }

    public <ContainingType extends r2> i1 findLiteExtensionByNumber(ContainingType containingtype, int i10) {
        return (i1) this.f5990a.get(new r0(containingtype, i10));
    }

    public s0 getUnmodifiable() {
        return new s0(this);
    }

    public s0(s0 s0Var) {
        if (s0Var == f5989d) {
            this.f5990a = Collections.EMPTY_MAP;
        } else {
            this.f5990a = Collections.unmodifiableMap(s0Var.f5990a);
        }
    }

    public final void add(o0 o0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (i1.class.isAssignableFrom(o0Var.getClass())) {
            add((i1) o0Var);
        }
        d3 d3Var = d3.f5851c;
        Class cls = p0.f5969a;
        if (cls == null || !cls.isAssignableFrom(s0.class)) {
            return;
        }
        try {
            s0.class.getMethod(ProductAction.ACTION_ADD, q0.f5972a).invoke(this, o0Var);
        } catch (Exception e10) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", o0Var), e10);
        }
    }

    public s0(int i10) {
        this.f5990a = Collections.EMPTY_MAP;
    }
}

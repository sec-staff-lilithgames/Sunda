package sh;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import nh.we;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d1 implements c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d1 f85797b;

    /* renamed from: c, reason: collision with root package name */
    public static final CopyOnWriteArraySet f85798c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d1[] f85799e;

    static {
        d1 d1Var = new d1("INSTANCE", 0);
        f85797b = d1Var;
        f85799e = new d1[]{d1Var};
        f85798c = new CopyOnWriteArraySet();
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f85799e.clone();
    }

    @Override // sh.c1
    public void validateClass(Class<? extends Exception> cls) {
        CopyOnWriteArraySet copyOnWriteArraySet = f85798c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            if (cls.equals(((WeakReference) it.next()).get())) {
                return;
            }
        }
        we weVar = f1.f85805a;
        boolean z10 = true;
        mh.p1.checkArgument(!RuntimeException.class.isAssignableFrom(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        try {
            f1.a(cls, new Exception());
        } catch (Throwable unused) {
            z10 = false;
        }
        mh.p1.checkArgument(z10, "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
        if (copyOnWriteArraySet.size() > 1000) {
            copyOnWriteArraySet.clear();
        }
        copyOnWriteArraySet.add(new WeakReference(cls));
    }
}

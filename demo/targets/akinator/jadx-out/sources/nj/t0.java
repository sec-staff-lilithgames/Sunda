package nj;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t0 implements yh.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f77011c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public HashSet f77012a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f77013b;

    @Override // yh.a
    public void registerEventNames(Set<String> set) {
        Object obj = this.f77013b;
        if (obj == f77011c) {
            return;
        }
        if (obj != null) {
            ((yh.a) obj).registerEventNames(set);
        } else {
            synchronized (this) {
                this.f77012a.addAll(set);
            }
        }
    }

    @Override // yh.a
    public void unregister() {
        Object obj = this.f77013b;
        Object obj2 = f77011c;
        if (obj == obj2) {
            return;
        }
        if (obj != null) {
            ((yh.a) obj).unregister();
        }
        this.f77013b = obj2;
        synchronized (this) {
            this.f77012a.clear();
        }
    }

    @Override // yh.a
    public void unregisterEventNames() {
        Object obj = this.f77013b;
        if (obj == f77011c) {
            return;
        }
        if (obj != null) {
            ((yh.a) obj).unregisterEventNames();
        } else {
            synchronized (this) {
                this.f77012a.clear();
            }
        }
    }
}

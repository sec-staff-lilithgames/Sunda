package c0;

import c0.z1;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f11457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(z1 z1Var) {
        super(0);
        this.f11457e = z1Var;
    }

    @Override // kv.a
    public final Long invoke() {
        z1 z1Var = this.f11457e;
        Iterator<T> it = z1Var.f11703h.iterator();
        long jMax = 0;
        while (it.hasNext()) {
            jMax = Math.max(jMax, ((z1.c) it.next()).getDurationNanos$animation_core_release());
        }
        Iterator<T> it2 = z1Var.f11704i.iterator();
        while (it2.hasNext()) {
            jMax = Math.max(jMax, ((z1) it2.next()).getTotalDurationNanos());
        }
        return Long.valueOf(jMax);
    }
}

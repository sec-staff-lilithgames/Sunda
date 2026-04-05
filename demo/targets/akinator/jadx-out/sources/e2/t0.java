package e2;

import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f53625a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.p f53626b;

    public t0(String name, kv.p mergePolicy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(mergePolicy, "mergePolicy");
        this.f53625a = name;
        this.f53626b = mergePolicy;
    }

    public final kv.p getMergePolicy$ui_release() {
        return this.f53626b;
    }

    public final String getName() {
        return this.f53625a;
    }

    public final Object getValue(u0 thisRef, KProperty<?> property) {
        kotlin.jvm.internal.e0.checkNotNullParameter(thisRef, "thisRef");
        kotlin.jvm.internal.e0.checkNotNullParameter(property, "property");
        return r0.access$throwSemanticsGetNotSupported();
    }

    public final Object merge(Object obj, Object obj2) {
        return this.f53626b.invoke(obj, obj2);
    }

    public final void setValue(u0 thisRef, KProperty<?> property, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(thisRef, "thisRef");
        kotlin.jvm.internal.e0.checkNotNullParameter(property, "property");
        thisRef.set(this, obj);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.f53625a;
    }

    public /* synthetic */ t0(String str, kv.p pVar, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? s0.f53624e : pVar);
    }
}

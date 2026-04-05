package r7;

import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f83873a = new HashSet();

    public boolean enableFlag(b0 b0Var, boolean z10) {
        HashSet hashSet = this.f83873a;
        if (!z10) {
            return hashSet.remove(b0Var);
        }
        b0Var.getClass();
        return hashSet.add(b0Var);
    }

    public boolean isFlagEnabled(b0 b0Var) {
        return this.f83873a.contains(b0Var);
    }
}

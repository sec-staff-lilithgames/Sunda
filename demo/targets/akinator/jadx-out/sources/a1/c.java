package a1;

import b1.d0;
import kotlin.jvm.internal.e0;
import p0.j2;
import p0.y4;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3394b;

    public c(m mVar) {
        this.f3394b = mVar;
    }

    @Override // kv.l
    public final j2 invoke(j2 j2Var) {
        Object objRestore;
        if (!(j2Var instanceof d0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d0 d0Var = (d0) j2Var;
        if (d0Var.getValue() != null) {
            Object value = d0Var.getValue();
            e0.checkNotNull(value);
            objRestore = ((p) this.f3394b).restore(value);
        } else {
            objRestore = null;
        }
        y4 policy = d0Var.getPolicy();
        e0.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
        j2 j2VarMutableStateOf = z4.mutableStateOf(objRestore, policy);
        e0.checkNotNull(j2VarMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver>");
        return j2VarMutableStateOf;
    }
}

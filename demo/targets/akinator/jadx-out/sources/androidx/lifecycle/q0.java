package androidx.lifecycle;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q0 implements CoroutineScope {
    public abstract k0 getLifecycle$lifecycle_common();

    @tu.f
    public final Job launchWhenCreated(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new n0(this, block, null), 3, null);
    }

    @tu.f
    public final Job launchWhenResumed(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new o0(this, block, null), 3, null);
    }

    @tu.f
    public final Job launchWhenStarted(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new p0(this, block, null), 3, null);
    }
}

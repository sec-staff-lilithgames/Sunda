package a2;

import android.view.View;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f6 implements androidx.lifecycle.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f3577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0.s2 f3578c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.n3 f3579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f3580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f3581g;

    public f6(CoroutineScope coroutineScope, p0.s2 s2Var, p0.n3 n3Var, kotlin.jvm.internal.b1 b1Var, View view) {
        this.f3577b = coroutineScope;
        this.f3578c = s2Var;
        this.f3579e = n3Var;
        this.f3580f = b1Var;
        this.f3581g = view;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(androidx.lifecycle.b1 lifecycleOwner, androidx.lifecycle.i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        int i10 = b6.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            BuildersKt__Builders_commonKt.launch$default(this.f3577b, null, CoroutineStart.UNDISPATCHED, new e6(this.f3580f, this.f3579e, lifecycleOwner, this, this.f3581g, null), 1, null);
            return;
        }
        p0.s2 s2Var = this.f3578c;
        if (i10 == 2) {
            if (s2Var != null) {
                s2Var.resume();
            }
        } else if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            this.f3579e.cancel();
        } else if (s2Var != null) {
            s2Var.pause();
        }
    }
}

package androidx.fragment.app;

import androidx.lifecycle.l3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t2 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f6465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Fragment fragment) {
        super(0);
        this.f6465e = fragment;
    }

    @Override // kv.a
    public final l3 invoke() {
        return this.f6465e.getDefaultViewModelProviderFactory();
    }
}

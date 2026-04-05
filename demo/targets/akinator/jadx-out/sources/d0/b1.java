package d0;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f51318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(View view) {
        super(0);
        this.f51318e = view;
    }

    @Override // kv.a
    public final Boolean invoke() {
        return Boolean.valueOf(c1.access$isInScrollableViewGroup(this.f51318e));
    }
}

package m5;

import android.content.Context;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f74042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(1);
        this.f74042e = context;
    }

    @Override // kv.l
    public final k invoke(Context it) {
        e0.checkNotNullParameter(it, "it");
        return new k(this.f74042e);
    }
}

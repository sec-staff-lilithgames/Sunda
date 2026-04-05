package j1;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f69054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(List list) {
        super(1);
        this.f69054e = list;
    }

    public final Boolean invoke(int i10) {
        return Boolean.valueOf(i10 < 0 || i10 >= this.f69054e.size());
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}

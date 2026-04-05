package j0;

import kotlin.jvm.internal.f0;
import p0.j2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j2 f68785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.a f68786f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j2 j2Var, kv.a aVar) {
        super(0);
        this.f68785e = j2Var;
        this.f68786f = aVar;
    }

    @Override // kv.a
    public final Boolean invoke() {
        return Boolean.valueOf(((Boolean) this.f68785e.getValue()).booleanValue() || ((Boolean) this.f68786f.invoke()).booleanValue());
    }
}

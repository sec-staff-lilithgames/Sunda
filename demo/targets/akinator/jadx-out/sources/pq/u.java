package pq;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ br.e f81786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(br.e eVar) {
        super(0);
        this.f81786e = eVar;
    }

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uq.a invoke() {
        return new uq.a(this.f81786e.getStateGroups());
    }
}

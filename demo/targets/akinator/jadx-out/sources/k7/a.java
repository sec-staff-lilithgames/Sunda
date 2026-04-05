package k7;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f70636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(0);
        this.f70636e = cVar;
    }

    @Override // kv.a
    public final xv.h invoke() {
        return xv.h.f93646n.parse(this.f70636e.getResponseHeaders());
    }
}

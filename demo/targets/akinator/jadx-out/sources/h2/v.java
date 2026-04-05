package h2;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f58682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar) {
        super(0);
        this.f58682e = wVar;
    }

    @Override // kv.a
    public final f invoke() {
        return new f(this.f58682e.getLayout());
    }
}

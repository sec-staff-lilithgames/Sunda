package k7;

import kotlin.jvm.internal.f0;
import xv.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f70637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f70637e = cVar;
    }

    @Override // kv.a
    public final j0 invoke() {
        String str = this.f70637e.getResponseHeaders().get("Content-Type");
        if (str != null) {
            return j0.f93670e.parse(str);
        }
        return null;
    }
}

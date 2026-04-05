package ir;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f68355e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(0);
        this.f68355e = mVar;
    }

    @Override // kv.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        m mVar = this.f68355e;
        sb2.append(mVar.f68356a);
        sb2.append(" @");
        sb2.append(s.createHexHashCode(mVar));
        return sb2.toString();
    }
}

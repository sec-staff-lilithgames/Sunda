package rc;

import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f1 implements g1 {

    /* renamed from: b, reason: collision with root package name */
    public final cd.s f84185b;

    /* renamed from: c, reason: collision with root package name */
    public final cd.r f84186c;

    public f1(cd.s sVar, cd.r rVar) {
        this.f84185b = sVar;
        this.f84186c = rVar;
    }

    @Override // rc.g1
    public jc.o resolveType(Type type) {
        return this.f84185b.resolveMemberType(type, this.f84186c);
    }
}

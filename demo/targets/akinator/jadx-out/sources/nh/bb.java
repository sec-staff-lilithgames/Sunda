package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class bb extends vi {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76127c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Collection f76128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb(Collection collection, Iterator it, int i10) {
        super(it);
        this.f76127c = i10;
        this.f76128e = collection;
    }

    @Override // nh.vi
    public final Object a(Object obj) {
        switch (this.f76127c) {
            case 0:
                return new ab(this, (Map.Entry) obj);
            case 1:
                return new ai(this, (Map.Entry) obj);
            default:
                return jh.i.c(((ci) this.f76128e).f76516c, (Collection) obj);
        }
    }
}

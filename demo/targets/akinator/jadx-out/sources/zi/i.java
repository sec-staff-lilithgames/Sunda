package zi;

import kotlin.jvm.internal.e0;
import kv.l;
import o4.j;
import tu.x0;
import v6.o0;
import v6.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f97993c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f97994e;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f97992b = i10;
        this.f97993c = obj;
        this.f97994e = obj2;
    }

    @Override // kv.l
    public final Object invoke(Object obj) throws Exception {
        int i10 = this.f97992b;
        Object obj2 = this.f97994e;
        Object obj3 = this.f97993c;
        switch (i10) {
            case 0:
                j jVar = (j) obj3;
                String str = (String) obj2;
                o4.d dVar = (o4.d) obj;
                j.a aVar = j.f97995b;
                jVar.getClass();
                dVar.set(j.f97997d, str);
                jVar.d(dVar, str);
                return null;
            default:
                x5.b _connection = (x5.b) obj;
                r0.a aVar2 = r0.f89154c;
                e0.checkNotNullParameter(_connection, "_connection");
                ((r0) obj3).f89156b.insert(_connection, (o0) obj2);
                return x0.f87415a;
        }
    }
}

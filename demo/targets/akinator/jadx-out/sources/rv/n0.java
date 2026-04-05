package rv;

import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class n0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f85050c;

    public /* synthetic */ n0(List list, int i10) {
        this.f85049b = i10;
        this.f85050c = list;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f85049b) {
            case 0:
                return Boolean.valueOf(this.f85050c.contains(obj));
            default:
                WorkDatabase db2 = (WorkDatabase) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
                Object objApply = v6.b0.B.apply(db2.workSpecDao().getWorkStatusPojoForIds(this.f85050c));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(objApply, "apply(...)");
                return (List) objApply;
        }
    }
}

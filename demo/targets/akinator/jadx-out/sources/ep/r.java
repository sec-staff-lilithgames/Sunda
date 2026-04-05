package ep;

import java.util.Map;
import mh.p1;
import mh.v0;
import nh.fc;
import nh.na;
import nh.nd;
import nh.ya;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class r implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54900c;

    public /* synthetic */ r(Object obj, int i10) {
        this.f54899b = i10;
        this.f54900c = obj;
    }

    @Override // mh.v0
    public final Object apply(Object obj) {
        switch (this.f54899b) {
            case 0:
                c0 c0Var = (c0) obj;
                ((s) this.f54900c).getClass();
                return c0Var;
            case 1:
                me.v vVar = (me.v) obj;
                ((me.o) this.f54900c).getClass();
                return vVar;
            case 2:
                ya yaVar = (ya) this.f54900c;
                Map.Entry entry = (Map.Entry) obj;
                p1.checkNotNull(yaVar);
                p1.checkNotNull(entry);
                return new na(entry, yaVar);
            case 3:
                return ((fc) this.f54900c).get(obj);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                return ((nd) this.f54900c).f76505i.transformEntry(entry2.getKey(), entry2.getValue());
        }
    }
}

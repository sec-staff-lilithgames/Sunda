package ao;

import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements l {
    @Override // ao.l
    public q1 create(List<? extends q1> list, List<List<Integer>> list2) {
        return new k(list, list2);
    }

    @Override // ao.l
    @Deprecated
    public q1 createCompositeSequenceableLoader(q1... q1VarArr) {
        return new k(q1VarArr);
    }

    @Override // ao.l
    public q1 empty() {
        return new k(b5.of(), b5.of());
    }
}

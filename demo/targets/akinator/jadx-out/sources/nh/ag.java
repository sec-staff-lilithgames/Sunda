package nh;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ag extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76103e;

    /* renamed from: f, reason: collision with root package name */
    public final BitSet f76104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m5 f76105g;

    /* renamed from: h, reason: collision with root package name */
    public int f76106h;

    public ag(int i10, m5 m5Var) {
        this.f76103e = 1;
        this.f76105g = m5Var;
        this.f76106h = i10;
        this.f76104f = new BitSet(m5Var.size());
    }

    @Override // nh.b
    public final Object computeNext() {
        switch (this.f76103e) {
            case 0:
                int iNextSetBit = this.f76104f.nextSetBit(this.f76106h + 1);
                this.f76106h = iNextSetBit;
                if (iNextSetBit != -1) {
                    return this.f76105g.keySet().asList().get(this.f76106h);
                }
                this.f76111b = 3;
                return null;
            default:
                int i10 = this.f76106h;
                BitSet bitSet = this.f76104f;
                boolean zIsEmpty = bitSet.isEmpty();
                m5 m5Var = this.f76105g;
                if (zIsEmpty) {
                    bitSet.set(0, i10);
                } else {
                    int iNextSetBit2 = bitSet.nextSetBit(0);
                    int iNextClearBit = bitSet.nextClearBit(iNextSetBit2);
                    if (iNextClearBit == m5Var.size()) {
                        this.f76111b = 3;
                        return null;
                    }
                    int i11 = (iNextClearBit - iNextSetBit2) - 1;
                    bitSet.set(0, i11);
                    bitSet.clear(i11, iNextClearBit);
                    bitSet.set(iNextClearBit);
                }
                return new bg(m5Var, (BitSet) bitSet.clone(), i10);
        }
    }

    public ag(BitSet bitSet, m5 m5Var) {
        this.f76103e = 0;
        this.f76104f = bitSet;
        this.f76105g = m5Var;
        this.f76106h = -1;
    }
}

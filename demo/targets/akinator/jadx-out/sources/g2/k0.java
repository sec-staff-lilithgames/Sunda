package g2;

import g2.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f56779e = new k0(2);

    @Override // kv.p
    public final Object invoke(a1.r Saver, b.C0570b it) {
        Object objSave;
        kotlin.jvm.internal.e0.checkNotNullParameter(Saver, "$this$Saver");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        Object item = it.getItem();
        h hVar = item instanceof x ? h.f56760b : item instanceof r1 ? h.f56761c : item instanceof g2 ? h.f56762e : h.f56763f;
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0) {
            objSave = q1.save((x) it.getItem(), q1.getParagraphStyleSaver(), Saver);
        } else if (iOrdinal == 1) {
            objSave = q1.save((r1) it.getItem(), q1.getSpanStyleSaver(), Saver);
        } else if (iOrdinal == 2) {
            objSave = q1.save((g2) it.getItem(), q1.f56810d, Saver);
        } else {
            if (iOrdinal != 3) {
                throw new tu.t();
            }
            objSave = q1.save(it.getItem());
        }
        return uu.p0.arrayListOf(q1.save(hVar), objSave, q1.save(Integer.valueOf(it.getStart())), q1.save(Integer.valueOf(it.getEnd())), q1.save(it.getTag()));
    }
}

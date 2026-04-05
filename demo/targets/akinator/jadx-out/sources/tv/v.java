package tv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class v {
    public static boolean hasNotPassedNow(w wVar) {
        return f.m7205isNegativeimpl(wVar.mo7144elapsedNowUwyO8pc());
    }

    public static boolean hasPassedNow(w wVar) {
        return !f.m7205isNegativeimpl(wVar.mo7144elapsedNowUwyO8pc());
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static w m7234minusLRDsOJo(w wVar, long j10) {
        return wVar.mo7147plusLRDsOJo(f.m7223unaryMinusUwyO8pc(j10));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static w m7235plusLRDsOJo(w wVar, long j10) {
        return new a(wVar, j10, null);
    }
}

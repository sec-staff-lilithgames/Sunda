package md;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class x {
    public static void sendBlocking(jd.k kVar, jd.h hVar) {
        if (!(kVar instanceof f0)) {
            rd.a.w("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", kVar);
        } else {
            h0.getInstance().getUploader().logAndUpdateState(((f0) kVar).f74270a.withPriority(hVar), 1);
        }
    }
}

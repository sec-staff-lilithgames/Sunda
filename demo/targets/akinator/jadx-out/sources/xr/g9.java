package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface g9 {
    void transportInUse(boolean z10);

    void transportReady();

    void transportShutdown(wr.m6 m6Var);

    void transportTerminated();

    default wr.c filterTransport(wr.c cVar) {
        return cVar;
    }
}

package md;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c0 {
    public static b0 builder() {
        return new k();
    }

    public abstract jd.e getEncoding();

    public byte[] getPayload() {
        l lVar = (l) this;
        return (byte[]) lVar.f74317d.apply(lVar.f74316c.getPayload());
    }

    public abstract d0 getTransportContext();

    public abstract String getTransportName();
}

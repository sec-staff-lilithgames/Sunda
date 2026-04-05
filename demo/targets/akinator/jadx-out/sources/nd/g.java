package nd;

import md.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract g build();

        public abstract a setEvents(Iterable<u> iterable);

        public abstract a setExtras(byte[] bArr);
    }

    public static a builder() {
        return new nd.a();
    }

    public static g create(Iterable<u> iterable) {
        return builder().setEvents(iterable).build();
    }

    public abstract Iterable<u> getEvents();

    public abstract byte[] getExtras();
}

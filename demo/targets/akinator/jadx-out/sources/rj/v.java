package rj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class v {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract v build();

        public abstract a setLimit(long j10);

        public abstract a setLimiterKey(String str);

        public abstract a setTimeToLiveMillis(long j10);
    }

    public static a builder() {
        return new c();
    }

    public abstract long limit();

    public abstract String limiterKey();

    public abstract long timeToLiveMillis();
}

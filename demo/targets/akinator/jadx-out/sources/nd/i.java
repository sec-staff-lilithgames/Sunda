package nd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i {
    public static i fatalError() {
        return new c(h.f75989e, -1L);
    }

    public static i invalidPayload() {
        return new c(h.f75990f, -1L);
    }

    public static i ok(long j10) {
        return new c(h.f75987b, j10);
    }

    public static i transientError() {
        return new c(h.f75988c, -1L);
    }

    public abstract long getNextRequestWaitMillis();

    public abstract h getStatus();
}

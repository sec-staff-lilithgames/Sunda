package xd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements pd.b {
    public static c create() {
        return b.f91941a;
    }

    public static a eventClock() {
        return (a) pd.d.checkNotNullFromProvides(new g());
    }

    @Override // pd.b, ru.a
    public a get() {
        return eventClock();
    }
}

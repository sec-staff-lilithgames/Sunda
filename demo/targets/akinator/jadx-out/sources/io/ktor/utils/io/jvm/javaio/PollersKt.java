package io.ktor.utils.io.jvm.javaio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PollersKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f62181a = 0;
    private static final ThreadLocal<Parking<Thread>> parkingImplLocal = new ThreadLocal<>();

    public static final Parking<Thread> getParkingImpl() {
        Parking<Thread> parking = parkingImplLocal.get();
        return parking == null ? DefaultParking.INSTANCE : parking;
    }

    public static final boolean isParkingAllowed() {
        return getParkingImpl() != ProhibitParking.INSTANCE;
    }

    public static final void prohibitParking() {
        parkingImplLocal.set(ProhibitParking.INSTANCE);
    }
}

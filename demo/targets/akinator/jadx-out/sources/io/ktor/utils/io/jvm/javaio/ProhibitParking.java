package io.ktor.utils.io.jvm.javaio;

import kotlin.jvm.internal.e0;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ProhibitParking implements Parking<Thread> {
    public static final ProhibitParking INSTANCE = new ProhibitParking();

    private ProhibitParking() {
    }

    private final Void fail() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.io.jvm.javaio.Parking
    public void park(long j10) {
        fail();
        throw new k();
    }

    @Override // io.ktor.utils.io.jvm.javaio.Parking
    public Thread token() {
        fail();
        throw new k();
    }

    @Override // io.ktor.utils.io.jvm.javaio.Parking
    public void unpark(Thread token) {
        e0.checkNotNullParameter(token, "token");
        DefaultParking.INSTANCE.unpark(token);
    }
}

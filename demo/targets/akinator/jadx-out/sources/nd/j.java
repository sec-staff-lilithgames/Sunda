package nd;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {
    public static j create(Context context, xd.a aVar, xd.a aVar2) {
        return new d(context, aVar, aVar2, "cct");
    }

    public abstract Context getApplicationContext();

    public abstract String getBackendName();

    public abstract xd.a getMonotonicClock();

    public abstract xd.a getWallClock();

    public static j create(Context context, xd.a aVar, xd.a aVar2, String str) {
        return new d(context, aVar, aVar2, str);
    }
}

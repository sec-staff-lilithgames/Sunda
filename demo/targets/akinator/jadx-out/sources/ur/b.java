package ur;

import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements c {
    @Override // ur.c
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // ur.c
    public String getTimeZoneId() {
        return TimeZone.getDefault().getID();
    }
}

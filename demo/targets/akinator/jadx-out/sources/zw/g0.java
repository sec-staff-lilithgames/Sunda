package zw;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 implements h0 {
    @Override // zw.h0
    public TimeZone read(String str) {
        return DesugarTimeZone.getTimeZone(str);
    }

    @Override // zw.h0
    public String write(TimeZone timeZone) {
        return timeZone.getID();
    }
}

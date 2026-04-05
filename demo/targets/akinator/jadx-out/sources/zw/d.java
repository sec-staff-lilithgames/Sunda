package zw;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements h0 {
    @Override // zw.h0
    public AtomicLong read(String str) {
        return new AtomicLong(Long.valueOf(str).longValue());
    }

    @Override // zw.h0
    public String write(AtomicLong atomicLong) {
        return atomicLong.toString();
    }
}

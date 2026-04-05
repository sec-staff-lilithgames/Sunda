package zw;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements h0 {
    @Override // zw.h0
    public AtomicInteger read(String str) {
        return new AtomicInteger(Integer.valueOf(str).intValue());
    }

    @Override // zw.h0
    public String write(AtomicInteger atomicInteger) {
        return atomicInteger.toString();
    }
}

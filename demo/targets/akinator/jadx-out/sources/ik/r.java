package ik;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface r {
    boolean hasCacheExpired();

    Integer sessionRestartTimeout();

    Double sessionSamplingRate();

    Boolean sessionsEnabled();

    Object updateConfigs(m mVar, zu.d<? super x0> dVar);
}

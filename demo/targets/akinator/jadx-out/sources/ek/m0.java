package ek;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface m0 {
    Map<String, k0> generateProcessDataMap();

    int getMyPid();

    String getMyProcessName();

    String getMyUuid();

    boolean isColdStart(Map<String, k0> map);

    boolean isMyProcessStale(Map<String, k0> map);

    void onSessionGenerated();

    Map<String, k0> updateProcessDataMap(Map<String, k0> map);
}

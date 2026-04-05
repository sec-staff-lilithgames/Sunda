package org.slf4j.spi;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface MDCAdapter {
    void clear();

    String get(String str);

    Map<String, String> getCopyOfContextMap();

    void put(String str, String str2);

    void remove(String str);

    void setContextMap(Map<String, String> map);
}

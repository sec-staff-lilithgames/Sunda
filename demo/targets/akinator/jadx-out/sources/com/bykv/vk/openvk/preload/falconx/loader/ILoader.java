package com.bykv.vk.openvk.preload.falconx.loader;

import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface ILoader {
    boolean exist(String str) throws Exception;

    Map<String, Long> getChannelVersion();

    InputStream getInputStream(String str) throws Exception;

    String getResRootDir();

    void release() throws Exception;
}

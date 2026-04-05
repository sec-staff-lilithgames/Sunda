package com.unity3d.services.core.request;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface IWebRequestProgressListener {
    void onRequestProgress(String str, long j10, long j11);

    void onRequestStart(String str, long j10, int i10, Map<String, List<String>> map);
}

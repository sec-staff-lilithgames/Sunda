package com.unity3d.services.ads.operation;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.timer.BaseTimer;
import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class OperationState implements IWebViewSharedObject {
    private static String _emptyPlacementId = "";
    public Configuration configuration;

    /* renamed from: id, reason: collision with root package name */
    public String f50739id;
    public String placementId;
    public long startTime;
    public BaseTimer timeoutTimer;

    public OperationState(String str, Configuration configuration) {
        this.placementId = str == null ? _emptyPlacementId : str;
        this.configuration = configuration;
        this.f50739id = UUID.randomUUID().toString();
    }

    public long duration() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startTime);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this.f50739id;
    }

    public void start() {
        this.startTime = System.nanoTime();
    }
}

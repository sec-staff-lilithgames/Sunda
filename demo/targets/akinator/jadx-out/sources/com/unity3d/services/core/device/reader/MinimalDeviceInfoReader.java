package com.unity3d.services.core.device.reader;

import b0.e2;
import com.ironsource.Q6;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    final IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        HashMap mapS = e2.s(Q6.H, "android");
        mapS.put("sdkVersion", Integer.valueOf(SdkProperties.getVersionCode()));
        mapS.put("sdkVersionName", SdkProperties.getVersionName());
        mapS.put("idfi", Device.getIdfi());
        mapS.put(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        mapS.put("ts", Long.valueOf(System.currentTimeMillis()));
        mapS.put(AndroidGetAdPlayerContext.KEY_GAME_ID, ClientProperties.getGameId());
        return mapS;
    }
}

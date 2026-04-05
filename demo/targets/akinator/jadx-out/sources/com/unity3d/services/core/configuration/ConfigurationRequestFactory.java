package com.unity3d.services.core.configuration;

import com.ironsource.C3271ic;
import com.unity3d.services.core.device.reader.IDeviceInfoDataContainer;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ConfigurationRequestFactory {
    private final Configuration _configuration;
    private final IDeviceInfoDataContainer _deviceInfoDataContainer;

    public ConfigurationRequestFactory(Configuration configuration) {
        this(configuration, null);
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public WebRequest getWebRequest() throws IllegalAccessException, MalformedURLException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String configUrl = this._configuration.getConfigUrl();
        if (configUrl == null) {
            throw new MalformedURLException("Base URL is null");
        }
        HashMap map = new HashMap();
        map.put("Content-Encoding", Collections.singletonList("gzip"));
        WebRequest webRequest = new WebRequest(configUrl, C3271ic.f36944b, map);
        IDeviceInfoDataContainer iDeviceInfoDataContainer = this._deviceInfoDataContainer;
        webRequest.setBody(iDeviceInfoDataContainer != null ? iDeviceInfoDataContainer.getDeviceData() : null);
        DeviceLog.debug("Requesting configuration with: ".concat(configUrl));
        return webRequest;
    }

    public ConfigurationRequestFactory(Configuration configuration, IDeviceInfoDataContainer iDeviceInfoDataContainer) {
        this._configuration = configuration;
        this._deviceInfoDataContainer = iDeviceInfoDataContainer;
    }
}

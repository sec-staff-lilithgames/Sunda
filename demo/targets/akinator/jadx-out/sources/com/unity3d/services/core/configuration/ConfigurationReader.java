package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.webview.WebViewApp;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ConfigurationReader {
    private Configuration _localConfiguration;

    private Configuration getLocalConfiguration() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Configuration configuration = this._localConfiguration;
        if (configuration != null) {
            return configuration;
        }
        File file = new File(SdkProperties.getLocalConfigurationFilepath());
        if (file.exists()) {
            try {
                this._localConfiguration = new Configuration(new JSONObject(new String(Utilities.readFileBytes(file))));
            } catch (IOException | JSONException unused) {
                DeviceLog.debug("Unable to read configuration from storage");
                this._localConfiguration = null;
            }
        }
        return this._localConfiguration;
    }

    private Configuration getRemoteConfiguration() {
        if (WebViewApp.getCurrentApp() == null) {
            return null;
        }
        return WebViewApp.getCurrentApp().getConfiguration();
    }

    public Configuration getCurrentConfiguration() {
        if (getRemoteConfiguration() != null) {
            return getRemoteConfiguration();
        }
        Configuration localConfiguration = getLocalConfiguration();
        return localConfiguration != null ? localConfiguration : new Configuration();
    }
}

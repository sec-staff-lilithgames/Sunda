package com.unity3d.services.ads.webplayer;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebPlayerSettingsCache {
    private static WebPlayerSettingsCache instance;
    private HashMap<String, JSONObject> _webSettings = new HashMap<>();
    private HashMap<String, JSONObject> _webPlayerSettings = new HashMap<>();
    private HashMap<String, JSONObject> _webPlayerEventSettings = new HashMap<>();

    public static WebPlayerSettingsCache getInstance() {
        if (instance == null) {
            instance = new WebPlayerSettingsCache();
        }
        return instance;
    }

    public synchronized void addWebPlayerEventSettings(String str, JSONObject jSONObject) {
        this._webPlayerEventSettings.put(str, jSONObject);
    }

    public synchronized void addWebPlayerSettings(String str, JSONObject jSONObject) {
        this._webPlayerSettings.put(str, jSONObject);
    }

    public synchronized void addWebSettings(String str, JSONObject jSONObject) {
        this._webSettings.put(str, jSONObject);
    }

    public synchronized JSONObject getWebPlayerEventSettings(String str) {
        if (this._webPlayerEventSettings.containsKey(str)) {
            return this._webPlayerEventSettings.get(str);
        }
        return new JSONObject();
    }

    public synchronized JSONObject getWebPlayerSettings(String str) {
        if (this._webPlayerSettings.containsKey(str)) {
            return this._webPlayerSettings.get(str);
        }
        return new JSONObject();
    }

    public synchronized JSONObject getWebSettings(String str) {
        if (this._webSettings.containsKey(str)) {
            return this._webSettings.get(str);
        }
        return new JSONObject();
    }

    public synchronized void removeWebPlayerEventSettings(String str) {
        if (this._webPlayerEventSettings.containsKey(str)) {
            this._webPlayerEventSettings.remove(str);
        }
    }

    public synchronized void removeWebPlayerSettings(String str) {
        if (this._webPlayerSettings.containsKey(str)) {
            this._webPlayerSettings.remove(str);
        }
    }

    public synchronized void removeWebSettings(String str) {
        if (this._webSettings.containsKey(str)) {
            this._webSettings.remove(str);
        }
    }
}

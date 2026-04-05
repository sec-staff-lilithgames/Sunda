package com.unity3d.services.core.configuration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum ErrorState {
    CreateWebApp("create_webapp"),
    NetworkConfigRequest("network_config"),
    NetworkWebviewRequest("network_webview"),
    InvalidHash("invalid_hash"),
    CreateWebview("create_webview"),
    MalformedWebviewRequest("malformed_webview"),
    ResetWebApp("reset_webapp"),
    LoadCache("load_cache"),
    InitModules("init_modules"),
    CreateWebviewTimeout("create_webview_timeout"),
    CreateWebviewGameIdDisabled("create_webview_game_id_disabled"),
    CreateWebviewConfigError("create_webview_config_error"),
    CreateWebviewInvalidArgument("create_webview_invalid_arg"),
    InvalidGameId("check_gameId");

    private String _stateMetricName;

    ErrorState(String str) {
        this._stateMetricName = str;
    }

    public String getMetricName() {
        return this._stateMetricName;
    }
}

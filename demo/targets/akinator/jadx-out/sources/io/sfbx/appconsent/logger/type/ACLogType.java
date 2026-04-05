package io.sfbx.appconsent.logger.type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum ACLogType {
    DEBUG("SFBX_DEBUG:"),
    INFO("SFBX_INFO:"),
    WARNING("SFBX_WARNING:"),
    ERROR("SFBX_ERROR:");

    private final String tag;

    ACLogType(String str) {
        this.tag = str;
    }

    public final String getTag() {
        return this.tag;
    }
}

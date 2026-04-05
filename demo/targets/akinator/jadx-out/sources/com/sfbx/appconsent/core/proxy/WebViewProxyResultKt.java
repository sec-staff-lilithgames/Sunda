package com.sfbx.appconsent.core.proxy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewProxyResultKt {
    private static final String NO_FEATURE_PRESENT_ERROR_DESCRIPTION;
    private static final String NO_INSTANCE_PRESENT_ERROR_DESCRIPTION;
    private static final String NO_PACKAGE_PRESENT_ERROR_DESCRIPTION = System.lineSeparator() + "*****************************************************************************************************************" + System.lineSeparator() + "* It seems that the \"WebView\" system component is not present on your device, or that it is being updated.      *" + System.lineSeparator() + "* Please take the time to check whether it is present or not.                                                   *" + System.lineSeparator() + "* If it is and this log continues to appear, please contact support.                                            *" + System.lineSeparator() + "* If the component is not present and you are unwilling/unable to install it, CMP will not be able to function. *" + System.lineSeparator() + "*****************************************************************************************************************";

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.lineSeparator());
        sb2.append("********************************************************************************************************");
        sb2.append(System.lineSeparator());
        sb2.append("* It seems that your device does not support the \"FEATURE_WEBVIEW\" feature (android.software.webview). *");
        sb2.append(System.lineSeparator());
        sb2.append("* Without this feature, it's impossible to use our CMP.                                                *");
        sb2.append(System.lineSeparator());
        sb2.append("********************************************************************************************************");
        NO_FEATURE_PRESENT_ERROR_DESCRIPTION = sb2.toString();
        NO_INSTANCE_PRESENT_ERROR_DESCRIPTION = System.lineSeparator() + "***************************************************************************" + System.lineSeparator() + "* Despite the above checks, we tried to initialize the WebView component. *" + System.lineSeparator() + "* This was unsuccessful, so we're unable to initialize at all.            *" + System.lineSeparator() + "* Here's the full error trace.                                            *" + System.lineSeparator() + "***************************************************************************";
    }

    public static final String getNO_FEATURE_PRESENT_ERROR_DESCRIPTION() {
        return NO_FEATURE_PRESENT_ERROR_DESCRIPTION;
    }

    public static final String getNO_INSTANCE_PRESENT_ERROR_DESCRIPTION() {
        return NO_INSTANCE_PRESENT_ERROR_DESCRIPTION;
    }

    public static final String getNO_PACKAGE_PRESENT_ERROR_DESCRIPTION() {
        return NO_PACKAGE_PRESENT_ERROR_DESCRIPTION;
    }
}

package com.amazon.device.ads;

import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class SupportsProperty extends MraidDictionaryProperty {
    public SupportsProperty() throws JSONException {
        super("supports");
        try {
            this.data.put("tel", SDKUtilities.isTelSupported());
            this.data.put("sms", false);
            this.data.put("calendar", false);
            this.data.put("storePicture", false);
            this.data.put("inlineVideo", false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}

package com.amazon.device.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class MraidCloseCommand extends MraidCommand {
    public static final String NAME = "close";

    public static String getMraidName() {
        return "close";
    }

    @Override // com.amazon.device.ads.MraidCommand
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) {
        dTBAdMRAIDController.onMRAIDClose();
    }

    @Override // com.amazon.device.ads.MraidCommand
    public String getName() {
        return "close";
    }
}

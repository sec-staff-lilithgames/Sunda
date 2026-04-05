package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ModuleInstallStatusCodes extends CommonStatusCodes {
    public static final int INSUFFICIENT_STORAGE = 46003;
    public static final int MODULE_NOT_FOUND = 46002;
    public static final int NOT_ALLOWED_MODULE = 46001;
    public static final int SUCCESS = 0;
    public static final int UNKNOWN_MODULE = 46000;

    private ModuleInstallStatusCodes() {
    }

    public static String getStatusCodeString(int i10) {
        switch (i10) {
            case UNKNOWN_MODULE /* 46000 */:
                return "UNKNOWN_MODULE";
            case NOT_ALLOWED_MODULE /* 46001 */:
                return "NOT_ALLOWED_MODULE";
            case MODULE_NOT_FOUND /* 46002 */:
                return "MODULE_NOT_FOUND";
            case INSUFFICIENT_STORAGE /* 46003 */:
                return "INSUFFICIENT_STORAGE";
            default:
                return CommonStatusCodes.getStatusCodeString(i10);
        }
    }
}

package a3;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface f0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int getId(java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.f0.getId(java.lang.String):int");
    }

    static int getType(int i10) {
        if (i10 == 100) {
            return 2;
        }
        if (i10 == 101) {
            return 8;
        }
        if (i10 == 416) {
            return 4;
        }
        if (i10 == 420 || i10 == 421) {
            return 8;
        }
        switch (i10) {
            case AD_EXPIRED_VALUE:
            case MRAID_BRIDGE_ERROR_VALUE:
            case 306:
            case 307:
            case 308:
            case ASSET_FAILED_TO_DELETE_VALUE:
            case AD_HTML_FAILED_TO_LOAD_VALUE:
            case MRAID_JS_CALL_EMPTY_VALUE:
            case DEEPLINK_OPEN_FAILED_VALUE:
            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
            case LINK_COMMAND_OPEN_FAILED_VALUE:
            case JSON_PARAMS_ENCODE_ERROR_VALUE:
                return 4;
            default:
                switch (i10) {
                    case 401:
                    case TTAdConstant.AD_ID_IS_NULL_CODE /* 402 */:
                        return 2;
                    case 403:
                        return 4;
                    default:
                        switch (i10) {
                            case 423:
                            case 424:
                            case 425:
                                return 4;
                            default:
                                return -1;
                        }
                }
        }
    }
}

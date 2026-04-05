package xm;

import android.os.Bundle;
import android.text.TextUtils;
import io.bidmachine.iab.vast.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements b {
    @Override // xm.b
    public String prepare(String str, Bundle bundle) {
        int i10;
        if (!TextUtils.isEmpty(str) && bundle != null && bundle.containsKey("params_error_code") && (i10 = bundle.getInt("params_error_code", -1)) > -1) {
            e.d("VastAdUrlProcessor", "Before prepare url: %s", str);
            if (str.contains("[ERRORCODE]")) {
                str = str.replace("[ERRORCODE]", String.valueOf(i10));
            }
            if (str.contains("%5BERRORCODE%5D")) {
                str = str.replace("%5BERRORCODE%5D", String.valueOf(i10));
            }
            e.d("VastAdUrlProcessor", "After prepare url: %s", str);
        }
        return str;
    }
}

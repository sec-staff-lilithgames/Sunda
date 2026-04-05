package com.mbridge.msdk.foundation.same.report.crashreport;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {
    public static List<String> a() {
        ArrayList arrayList = new ArrayList();
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD == null) {
                gVarD = h.b().a();
            }
            Matcher matcher = Pattern.compile("<mvpackage>([^<]+)</mvpackage>").matcher(gVarD.P());
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                if (!TextUtils.isEmpty(strGroup)) {
                    String[] strArrSplit = strGroup.split(",");
                    if (strArrSplit.length > 0) {
                        arrayList.addAll(Arrays.asList(strArrSplit));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add("mbridge");
            }
            return arrayList;
        } catch (Exception e10) {
            p0.b("FilterStringUtil", e10.getMessage());
            arrayList.clear();
            arrayList.add("mbridge");
            return arrayList;
        }
    }

    public static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            if (contextD == null) {
                return jSONObject;
            }
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            long usableSpace = externalStorageDirectory.getUsableSpace();
            long totalSpace = externalStorageDirectory.getTotalSpace();
            String fileSize = Formatter.formatFileSize(contextD, usableSpace);
            String fileSize2 = Formatter.formatFileSize(contextD, totalSpace);
            jSONObject.put("max_memory", String.valueOf((float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d)));
            jSONObject.put("memoryby_app", String.valueOf((float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d)));
            jSONObject.put("remaining_memory", (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d));
            jSONObject.put("sdcard_remainder", fileSize);
            jSONObject.put("totalspacestr", fileSize2);
            jSONObject.put("crashtime", str);
            return jSONObject;
        } catch (Throwable th2) {
            p0.b("AbnormalExitUtil", th2.getMessage());
            return jSONObject;
        }
    }
}

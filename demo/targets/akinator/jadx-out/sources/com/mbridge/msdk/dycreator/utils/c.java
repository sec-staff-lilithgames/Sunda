package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.tools.p0;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class c {
    public static double a(double d10, double d11, int i10) {
        if (i10 < 0) {
            return 1.0d;
        }
        try {
            return new BigDecimal(Double.toString(d10)).divide(new BigDecimal(Double.toString(d11)), i10, 4).doubleValue();
        } catch (Exception e10) {
            p0.b("CommUtil", e10.getMessage());
            return 1.0d;
        }
    }

    public static int a(Context context, float f10) {
        if (context == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                return 0;
            }
            return (int) ((f10 * resources.getDisplayMetrics().density) + 0.5f);
        } catch (Exception e10) {
            p0.b("CommUtil", e10.getMessage());
            return 0;
        }
    }

    public static Map<String, String> a(Context context, AttributeSet attributeSet) {
        HashMap map = new HashMap();
        if (context != null && attributeSet != null) {
            int attributeCount = attributeSet.getAttributeCount();
            for (int i10 = 0; i10 < attributeCount; i10++) {
                String attributeName = attributeSet.getAttributeName(i10);
                if (!TextUtils.isEmpty(attributeName)) {
                    if (attributeName.equals("mbridge_data")) {
                        try {
                            map.put("mbridgeData", b.f40270a.get(attributeSet.getAttributeValue(i10).substring(8)));
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_click")) {
                        try {
                            map.put("mbridgeAction", b.f40270a.get(attributeSet.getAttributeValue(i10).substring(8)));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_strategy")) {
                        try {
                            map.put("mbridgeStrategy", b.f40270a.get(attributeSet.getAttributeValue(i10).substring(8)));
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_effect")) {
                        try {
                            map.put("mbridgeEffect", b.f40270a.get(attributeSet.getAttributeValue(i10).substring(8)));
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_report")) {
                        try {
                            map.put("mbridgeReport", attributeSet.getAttributeValue(i10));
                        } catch (Exception e14) {
                            e14.printStackTrace();
                        }
                    }
                }
            }
        }
        return map;
    }

    public static void a(Map<String, String> map, View view) {
        if (map == null || view == null) {
            return;
        }
        if (map.containsKey("mbridgeData")) {
            com.mbridge.msdk.dycreator.binding.b.a().b(view);
        }
        if (map.containsKey("mbridgeAction")) {
            com.mbridge.msdk.dycreator.binding.b.a().a(view);
        }
        if (map.containsKey("mbridgeEffect")) {
            com.mbridge.msdk.dycreator.binding.b.a().c(view);
        }
        if (map.containsKey("mbridgeReport")) {
            com.mbridge.msdk.dycreator.binding.b.a().d(view);
        }
    }

    public static Map<String, Boolean> a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit != null && strArrSplit.length > 0) {
                for (String str2 : strArrSplit) {
                    if (str2.equals("mbridgeAttached")) {
                        map.put("mbridgeAttached", Boolean.TRUE);
                    }
                    if (str2.equals("mbridgeDetached")) {
                        map.put("mbridgeDetached", Boolean.TRUE);
                    }
                }
            } else {
                if (str.equals("mbridgeAttached")) {
                    map.put("mbridgeAttached", Boolean.TRUE);
                }
                if (str.equals("mbridgeDetached")) {
                    map.put("mbridgeDetached", Boolean.TRUE);
                }
            }
        }
        return map;
    }
}

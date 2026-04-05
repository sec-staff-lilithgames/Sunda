package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.ironsource.C3191e4;
import hr.kNq.ikJMrW;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j1.o2;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzde {
    private static final Pattern zza = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzb = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzc = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map zzd;

    public static int zza(String str) {
        return zzc(str, false);
    }

    public static int zzb(String str) {
        return zzc(str, true);
    }

    private static int zzc(String str, boolean z10) throws NumberFormatException {
        int i10;
        zzgmd.zza(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & 255) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? zzc : zzb).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = zza.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) zzd.get(zzglm.zza(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    static {
        HashMap map = new HashMap();
        zzd = map;
        o2.v(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        o2.v(-983041, map, "azure", -657956, "beige");
        o2.v(-6972, map, "bisque", -16777216, "black");
        o2.v(-5171, map, "blanchedalmond", -16776961, "blue");
        o2.v(-7722014, map, "blueviolet", -5952982, "brown");
        o2.v(-2180985, map, "burlywood", -10510688, "cadetblue");
        o2.v(-8388864, map, "chartreuse", -2987746, "chocolate");
        o2.v(-32944, map, ikJMrW.jDCnKaQ, -10185235, "cornflowerblue");
        o2.v(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        o2.v(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        o2.v(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        o2.v(-29696, map, "darkorange", -6737204, "darkorchid");
        o2.v(-7667712, map, "darkred", -1468806, "darksalmon");
        o2.v(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        o2.v(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        o2.v(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        o2.v(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        o2.v(-16744448, map, "green", -5374161, PtLatqAYjEFT.ncUs);
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        o2.v(-38476, map, "hotpink", -3318692, "indianred");
        o2.v(-11861886, map, "indigo", -16, "ivory");
        o2.v(-989556, map, "khaki", -1644806, "lavender");
        o2.v(-3851, map, "lavenderblush", -8586240, "lawngreen");
        o2.v(-1331, map, "lemonchiffon", -5383962, "lightblue");
        o2.v(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        o2.v(-18751, map, "lightpink", -24454, "lightsalmon");
        o2.v(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        o2.v(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        o2.v(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        o2.v(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        o2.v(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        o2.v(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        o2.v(-12004916, map, QGjYBESwAiCc.NQBZHRlxs, -3730043, "mediumvioletred");
        o2.v(-15132304, map, "midnightblue", -655366, "mintcream");
        o2.v(-6943, map, "mistyrose", -6987, "moccasin");
        o2.v(-8531, map, "navajowhite", -16777088, "navy");
        o2.v(-133658, map, "oldlace", -8355840, "olive");
        o2.v(-9728477, map, "olivedrab", -23296, "orange");
        o2.v(-47872, map, "orangered", -2461482, "orchid");
        o2.v(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        o2.v(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        o2.v(-4139, map, "papayawhip", -9543, "peachpuff");
        o2.v(-3308225, map, "peru", -16181, "pink");
        o2.v(-2252579, map, "plum", -5185306, "powderblue");
        o2.v(-8388480, map, "purple", -10079335, "rebeccapurple");
        o2.v(-65536, map, "red", -4419697, "rosybrown");
        o2.v(-12490271, map, "royalblue", -7650029, "saddlebrown");
        o2.v(-360334, map, "salmon", -744352, "sandybrown");
        o2.v(-13726889, map, "seagreen", -2578, "seashell");
        o2.v(-6270419, map, "sienna", -4144960, "silver");
        o2.v(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        o2.v(-12156236, map, "steelblue", -2968436, "tan");
        o2.v(-16744320, map, "teal", -2572328, "thistle");
        o2.v(-40121, map, "tomato", 0, C3191e4.h.T);
        o2.v(-12525360, map, "turquoise", -1146130, "violet");
        o2.v(-663885, map, "wheat", -1, "white");
        o2.v(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }
}

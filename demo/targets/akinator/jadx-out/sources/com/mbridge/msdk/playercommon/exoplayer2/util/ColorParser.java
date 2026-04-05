package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.text.TextUtils;
import b0.e2;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.ironsource.C3191e4;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    private ColorParser() {
    }

    private static int argb(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int parseColorInternal(String str, boolean z10) {
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i10 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i10;
            }
            if (strReplace.length() == 9) {
                return ((i10 & 255) << 24) | (i10 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith(RGBA)) {
            Matcher matcher = (z10 ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(strReplace);
            if (matcher.matches()) {
                return argb(z10 ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (strReplace.startsWith(RGB)) {
            Matcher matcher2 = RGB_PATTERN.matcher(strReplace);
            if (matcher2.matches()) {
                return rgb(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(Util.toLowerInvariant(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }

    private static int rgb(int i10, int i11, int i12) {
        return argb(255, i10, i11, i12);
    }

    static {
        HashMap map = new HashMap();
        COLOR_MAP = map;
        e2.v(-984833, map, "aliceblue", -332841, "antiquewhite");
        a.t(map, "aqua", -16711681, -8388652, "aquamarine");
        e2.v(-983041, map, "azure", -657956, "beige");
        e2.v(-6972, map, "bisque", -16777216, "black");
        e2.v(-5171, map, "blanchedalmond", -16776961, "blue");
        e2.v(-7722014, map, "blueviolet", -5952982, "brown");
        e2.v(-2180985, map, "burlywood", -10510688, "cadetblue");
        e2.v(-8388864, map, "chartreuse", -2987746, "chocolate");
        e2.v(-32944, map, "coral", -10185235, "cornflowerblue");
        e2.v(-1828, map, "cornsilk", -2354116, "crimson");
        a.t(map, "cyan", -16711681, -16777077, "darkblue");
        e2.v(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        a.t(map, "darkgray", -5658199, -16751616, "darkgreen");
        a.t(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        e2.v(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        e2.v(-29696, map, "darkorange", -6737204, "darkorchid");
        e2.v(-7667712, map, "darkred", -1468806, "darksalmon");
        e2.v(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        a.t(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        e2.v(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        a.t(map, "dodgerblue", -14774017, -5103070, "firebrick");
        e2.v(-1296, map, "floralwhite", -14513374, "forestgreen");
        a.t(map, "fuchsia", -65281, -2302756, "gainsboro");
        e2.v(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        e2.v(-16744448, map, "green", -5374161, "greenyellow");
        a.t(map, "grey", -8355712, -983056, "honeydew");
        e2.v(-38476, map, "hotpink", -3318692, "indianred");
        e2.v(-11861886, map, "indigo", -16, "ivory");
        e2.v(-989556, map, "khaki", -1644806, "lavender");
        e2.v(-3851, map, "lavenderblush", -8586240, "lawngreen");
        e2.v(-1331, map, "lemonchiffon", -5383962, "lightblue");
        e2.v(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        e2.v(-18751, map, "lightpink", -24454, "lightsalmon");
        e2.v(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        a.t(map, "lightsteelblue", -5192482, -32, "lightyellow");
        e2.v(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        e2.v(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        e2.v(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        e2.v(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        e2.v(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        e2.v(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        e2.v(-15132304, map, "midnightblue", -655366, "mintcream");
        e2.v(-6943, map, "mistyrose", -6987, "moccasin");
        e2.v(-8531, map, "navajowhite", -16777088, "navy");
        e2.v(-133658, map, "oldlace", -8355840, "olive");
        e2.v(-9728477, map, "olivedrab", -23296, "orange");
        e2.v(-47872, map, "orangered", -2461482, KerkSviMAy.cKc);
        e2.v(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        e2.v(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        e2.v(-4139, map, "papayawhip", -9543, "peachpuff");
        e2.v(-3308225, map, "peru", -16181, "pink");
        e2.v(-2252579, map, "plum", -5185306, "powderblue");
        e2.v(-8388480, map, "purple", -10079335, "rebeccapurple");
        e2.v(-65536, map, "red", -4419697, "rosybrown");
        e2.v(-12490271, map, "royalblue", -7650029, "saddlebrown");
        e2.v(-360334, map, "salmon", -744352, "sandybrown");
        e2.v(-13726889, map, "seagreen", -2578, "seashell");
        e2.v(-6270419, map, "sienna", -4144960, "silver");
        e2.v(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        a.t(map, "snow", -1286, -16711809, "springgreen");
        e2.v(-12156236, map, OcvDtWCQ.LXeU, -2968436, "tan");
        e2.v(-16744320, map, "teal", -2572328, "thistle");
        e2.v(-40121, map, "tomato", 0, C3191e4.h.T);
        e2.v(-12525360, map, "turquoise", -1146130, "violet");
        e2.v(-663885, map, "wheat", -1, "white");
        e2.v(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }
}

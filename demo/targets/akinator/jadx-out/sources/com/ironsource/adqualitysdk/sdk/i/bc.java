package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.i.gf;
import com.ironsource.adqualitysdk.sdk.i.gn;
import com.ironsource.adqualitysdk.sdk.i.gt;
import com.ironsource.adqualitysdk.sdk.i.gx;
import com.ironsource.adqualitysdk.sdk.i.hb;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bc {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f948 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f949;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f950;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, List<? extends gk>> f951;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f952;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f953;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static List<String> f954;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f955;

    static {
        m1143();
        f954 = Arrays.asList(m1146("\uf238⦹盺㠫", (char) (MotionEvent.axisFromString("") + 11127), "煂푾㗸\u0096㤿몊\udbd8슆퓍✋\ue456交\ue6b2檖", KeyEvent.normalizeMetaState(0), "度\uf30b㑤\uf802").intern(), m1149("ຍ໌꒱⑳昋쫡\ue0b0恔嗔∹蛡ⲗ옠땛걹", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m1146("븍镹衁\uecce", (char) (52872 - KeyEvent.normalizeMetaState(0)), "㊲凵Ŷ蛯谮恖悳㟶谏蚷ᦪ芊㸁쑁躼", (ViewConfiguration.getTapTimeout() >> 16) + 1100315070, "度\uf30b㑤\uf802").intern());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(m1149("ჲႳ⅗㜏㨿풔퀲핀\ue953", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m1145(new ft()));
        linkedHashMap.put(m1146("ꣲ귓ࠟ㩜", (char) TextUtils.indexOf("", ""), "χ广Ჟ\u0bda뿶ҥ텇䶓炘", 531485608 - (KeyEvent.getMaxKeyCode() >> 16), "度\uf30b㑤\uf802").intern(), m1145(new fz()));
        linkedHashMap.put(m1149("鍀錁ᡚ⬺㘖圫屘漧\ue92b爰쥈\ue559", ExpandableListView.getPackedPositionGroup(0L) + 1).intern(), m1145(new fy()));
        linkedHashMap.put(m1146("躶ꌙ烏ǘ", (char) View.MeasureSpec.makeMeasureSpec(0, 0), "\ueb41ꦪ꧰\uef21臠쾫䣾ʖ撒", TextUtils.getOffsetBefore("", 0) - 811394674, "度\uf30b㑤\uf802").intern(), m1145(new gf.d(), new gf.e()));
        linkedHashMap.put(m1149("䛽䚿萯럊瀄芘쀡\uf3c2畇㐤캛ఫ喬ꍊ", KeyEvent.keyCodeFromString("") + 1).intern(), m1145(new gg()));
        linkedHashMap.put(m1146("㧫㰥Ṝ먮", (char) TextUtils.indexOf("", ""), "\udf8d攎惝䚅\udfae恌듬䮧ꨟ⒂", TextUtils.getOffsetBefore("", 0), "度\uf30b㑤\uf802").intern(), m1145(new gh()));
        linkedHashMap.put(m1146("\uaafe녻婵쐿", (char) TextUtils.indexOf("", ""), "竆칉२\u05f8杜샎竸嘛", Process.myPid() >> 22, "度\uf30b㑤\uf802").intern(), m1145(new gd()));
        linkedHashMap.put(m1149("᫁᪇ข랑璋\ude87䨎\uf398｢嗺ꟺ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern(), m1145(new ge()));
        linkedHashMap.put(m1146("ἂ澚\u0b4aﺝ", (char) (40203 - ExpandableListView.getPackedPositionType(0L)), "텭됏䳊ꬔﾲ饝", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "度\uf30b㑤\uf802").intern(), m1145(new gj()));
        linkedHashMap.put(m1149("♕☝퍬⡉\ue52c\ue21c靉∔쨻㙝", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m1145(new gi()));
        linkedHashMap.put(m1146("Ẫ꿜偯㚼", (char) (48208 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "\uee02䓯ᴼ？읜\ue4fb", ViewConfiguration.getTouchSlop() >> 8, "度\uf30b㑤\uf802").intern(), m1145(new gm()));
        linkedHashMap.put(m1146("菿ﺹ뎈ₒ", (char) Gravity.getAbsoluteGravity(0, 0), "뤐ᆄ퐿緳媴䨲܍㈝\udae2ﬡ\ude99", TextUtils.indexOf("", "") - 1996572285, "度\uf30b㑤\uf802").intern(), m1145(new gl()));
        linkedHashMap.put(m1146("凞ꑶ솟㚢", (char) View.combineMeasuredStates(0, 0), "ߋႁ튿䭜\ue5de嵜ꐫ쯾螰袏", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), "度\uf30b㑤\uf802").intern(), m1145(new gr()));
        linkedHashMap.put(m1149("钻银ಣິᇆﷃ\uecdf슪", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m1145(new gq()));
        linkedHashMap.put(m1149("녿넲ᨀҔࣨ甞帊䂌\ueb68䳹㤛\ue6f8\udb9f", 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), m1145(new gn.b(), new gn.c()));
        linkedHashMap.put(m1146("ܻ褟锜漱", (char) (12693 - TextUtils.getOffsetBefore("", 0)), "｟洣ᢏ廁ṭ撟", Color.blue(0), "度\uf30b㑤\uf802").intern(), m1145(new go()));
        linkedHashMap.put(m1149("玱珼몰ծ〘럇ﺪ䅛䯈琉\ue738\ue37a", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m1145(new gp()));
        linkedHashMap.put(m1146("ᦂ\ud8aa\u09de篊", (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 51721), "⠝\u0605\udffe㔲萪", (-556226024) - ExpandableListView.getPackedPositionChild(0L), "度\uf30b㑤\uf802").intern(), m1145(new gt(), new gt.b()));
        linkedHashMap.put(m1149("릆맖\uef3a悝㓥緣ꬿ⒒Ṏ烙\u31eb苽\ue7a8", -TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m1145(new gw()));
        linkedHashMap.put(m1146("縏\uf0f2\ued16운", (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46317), "ꝼ鋲펜\ue6db⟢囹", Color.blue(0), "度\uf30b㑤\uf802").intern(), m1145(new gu()));
        linkedHashMap.put(m1146("ٙ뢭䕭燔", (char) ((-1) - Process.getGidForName("")), "ⓘ差䡜护岉뾬赶䢇匮쫳粄正", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "度\uf30b㑤\uf802").intern(), m1145(new gv()));
        linkedHashMap.put(m1146("姑饟㼿竸", (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 63551), "멍䮯죊쾻ꔻ㕳", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "度\uf30b㑤\uf802").intern(), m1145(new gs()));
        linkedHashMap.put(m1146("斗ᚂꃥ㥤", (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), "쳱鲼좘ᅎ橜暘ⅸ", (-451509659) - (ViewConfiguration.getLongPressTimeout() >> 16), "度\uf30b㑤\uf802").intern(), m1145(new gy()));
        linkedHashMap.put(m1149("ኗዂቋ쩝溣훪噠蹔\ue324⪠⠶뷔", 1 - Color.red(0)).intern(), m1145(new gx(), new gx.d()));
        linkedHashMap.put(m1146("踎㚋냆袷", (char) (47024 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "哬暅날砎ⵞ딂", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "度\uf30b㑤\uf802").intern(), m1145(new hb.b(), new hb.d()));
        linkedHashMap.put(m1146("驻쟇㵠铄", (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 50236), "ꜷ矣\u0e3d䦣瓥ச", Color.argb(0, 0, 0, 0), "度\uf30b㑤\uf802").intern(), m1145(new gz()));
        f951 = Collections.unmodifiableMap(linkedHashMap);
        int i10 = f948 + 33;
        f949 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 58 / 0;
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static void m1143() {
        f955 = 8676093622720459009L;
        f952 = -575840194171019610L;
        f953 = 0;
        f950 = (char) 0;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static List<? extends gk> m1145(gk... gkVarArr) {
        int i10 = f949 + 45;
        f948 = i10 % 128;
        int i11 = i10 % 2;
        List<? extends gk> listAsList = Arrays.asList(gkVarArr);
        if (i11 == 0) {
            int i12 = 25 / 0;
        }
        int i13 = f949 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f948 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 4 / 0;
        }
        return listAsList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m1147() {
        int i10 = f948 + 41;
        f949 = i10 % 128;
        if (i10 % 2 == 0) {
            return f954;
        }
        int i11 = 36 / 0;
        return f954;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Map<String, List<gk>> m1150() {
        gk next;
        ArrayList arrayList = new ArrayList(f951.keySet());
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i10 = f948 + 71;
            f949 = i10 % 128;
            if (i10 % 2 != 0) {
                f951.get((String) it.next());
                throw null;
            }
            String str = (String) it.next();
            List<? extends gk> list = f951.get(str);
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<? extends gk> it2 = list.iterator();
                f949 = (f948 + 17) % 128;
                while (it2.hasNext()) {
                    int i11 = f948 + 47;
                    f949 = i11 % 128;
                    if (i11 % 2 != 0) {
                        next = it2.next();
                        int i12 = 44 / 0;
                        if (m1148(next)) {
                            f948 = (f949 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
                            arrayList2.add(next);
                        }
                    } else {
                        next = it2.next();
                        if (m1148(next)) {
                            f948 = (f949 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
                            arrayList2.add(next);
                        }
                    }
                }
                map.put(str, arrayList2);
            }
        }
        return map;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static gk m1151() {
        gb gbVar = new gb();
        f949 = (f948 + 37) % 128;
        return gbVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m1152() {
        int i10 = f949 + 49;
        f948 = i10 % 128;
        return m1149("\ude20\ude61࿑踷↯ᩅ䯝쨋ﺴ斪噑蟮汤\uf2d9؆꦳鉞쏜䈎", (ViewConfiguration.getZoomControlsTimeout() > (i10 % 2 == 0 ? 1L : 0L) ? 1 : (ViewConfiguration.getZoomControlsTimeout() == (i10 % 2 == 0 ? 1L : 0L) ? 0 : -1))).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static List<gk> m1144() {
        List<gk> listAsList = Arrays.asList(new gc(), new ga(), new fx());
        f949 = (f948 + 49) % 128;
        return listAsList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m1148(gk gkVar) {
        try {
            if (Prode.m533()) {
                int i10 = f948 + 55;
                f949 = i10 % 128;
                if (i10 % 2 != 0) {
                    gkVar.mo2525();
                    throw null;
                }
                gkVar.mo2525();
            } else {
                Class.forName(gkVar.mo2527());
            }
            f948 = (f949 + 65) % 128;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1146(String str, char c10, String str2, int i10, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (f.f2212) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                f.f2213 = 0;
                while (true) {
                    int i11 = f.f2213;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2211 = c12;
                        cArr5[i13] = (char) e3.g.e(cArr4[i13], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c12;
                        int i15 = f.f2213;
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f952) ^ f953) ^ f950);
                        f.f2213 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1149(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f955, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f955));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}

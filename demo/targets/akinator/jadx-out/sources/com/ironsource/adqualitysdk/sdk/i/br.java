package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdViewEventListener;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class br extends bg {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1188 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1189 = 2596280672829213887L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1190 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1191 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1192 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1193 = 373955893671153825L;

    public br(String str) {
        super(str);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static CreativeType m1441(FiveAdInterface fiveAdInterface) {
        int i10 = f1192 + 71;
        f1188 = i10 % 128;
        if (i10 % 2 == 0) {
            fiveAdInterface.getCreativeType();
            throw null;
        }
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        f1192 = (f1188 + 15) % 128;
        return creativeType;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static String m1443(FiveAdInterface fiveAdInterface) {
        int i10 = f1192 + 25;
        f1188 = i10 % 128;
        int i11 = i10 % 2;
        String slotId = fiveAdInterface.getSlotId();
        if (i11 == 0) {
            int i12 = 17 / 0;
        }
        int i13 = f1188 + 3;
        f1192 = i13 % 128;
        if (i13 % 2 == 0) {
            return slotId;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m1444(FiveAdInterface fiveAdInterface) {
        f1192 = (f1188 + 99) % 128;
        String adParameter = fiveAdInterface.getAdParameter();
        f1188 = (f1192 + 97) % 128;
        return adParameter;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ FiveAd m1445() {
        int i10 = f1192 + 79;
        f1188 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1442();
        }
        m1442();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static String m1447(FiveAdInterface fiveAdInterface) {
        int i10 = f1188 + 17;
        f1192 = i10 % 128;
        if (i10 % 2 != 0) {
            fiveAdInterface.getFiveAdTag();
            throw null;
        }
        String fiveAdTag = fiveAdInterface.getFiveAdTag();
        int i11 = f1192 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1188 = i11 % 128;
        if (i11 % 2 != 0) {
            return fiveAdTag;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ CreativeType m1448(FiveAdInterface fiveAdInterface) {
        f1188 = (f1192 + 3) % 128;
        CreativeType creativeTypeM1441 = m1441(fiveAdInterface);
        f1188 = (f1192 + 73) % 128;
        return creativeTypeM1441;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1452(FiveAdConfig fiveAdConfig) {
        int i10 = f1188 + 47;
        f1192 = i10 % 128;
        int i11 = i10 % 2;
        String strM1459 = m1459(fiveAdConfig);
        if (i11 != 0) {
            int i12 = 36 / 0;
        }
        int i13 = f1188 + 51;
        f1192 = i13 % 128;
        if (i13 % 2 == 0) {
            return strM1459;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1456(FiveAdInterface fiveAdInterface) {
        int i10 = f1188 + 11;
        f1192 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1447(fiveAdInterface);
        }
        m1447(fiveAdInterface);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ FiveAdListener m1458(FiveAdInterface fiveAdInterface) {
        int i10 = f1192 + 27;
        f1188 = i10 % 128;
        if (i10 % 2 == 0) {
            m1446(fiveAdInterface);
            throw null;
        }
        FiveAdListener fiveAdListenerM1446 = m1446(fiveAdInterface);
        f1192 = (f1188 + 111) % 128;
        return fiveAdListenerM1446;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1463(FiveAdInterface fiveAdInterface) {
        int i10 = f1188 + 113;
        f1192 = i10 % 128;
        int i11 = i10 % 2;
        String strM1444 = m1444(fiveAdInterface);
        if (i11 != 0) {
            int i12 = 8 / 0;
        }
        int i13 = f1188 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1192 = i13 % 128;
        if (i13 % 2 == 0) {
            return strM1444;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static FiveAd m1442() {
        int i10 = f1188 + 77;
        f1192 = i10 % 128;
        if (i10 % 2 != 0) {
            FiveAd.getSingleton();
            throw null;
        }
        FiveAd singleton = FiveAd.getSingleton();
        int i11 = f1192 + 25;
        f1188 = i11 % 128;
        if (i11 % 2 != 0) {
            return singleton;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static FiveAdListener m1446(FiveAdInterface fiveAdInterface) {
        int i10 = f1192 + 23;
        f1188 = i10 % 128;
        int i11 = i10 % 2;
        FiveAdListener listener = fiveAdInterface.getListener();
        if (i11 == 0) {
            int i12 = 13 / 0;
        }
        return listener;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1449(FiveAdCustomLayout fiveAdCustomLayout) {
        f1192 = (f1188 + 101) % 128;
        String strM1462 = m1462(fiveAdCustomLayout);
        f1192 = (f1188 + 115) % 128;
        return strM1462;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1453(FiveAdInterface fiveAdInterface) {
        f1192 = (f1188 + 9) % 128;
        String strM1443 = m1443(fiveAdInterface);
        int i10 = f1188 + 77;
        f1192 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1443;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1457(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (j.f2852) {
            try {
                j.f2850 = i10;
                char[] cArr2 = new char[cArr.length];
                j.f2851 = 0;
                while (true) {
                    int i11 = j.f2851;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f1189);
                        j.f2851++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1462(FiveAdCustomLayout fiveAdCustomLayout) {
        f1188 = (f1192 + 39) % 128;
        String advertiserName = fiveAdCustomLayout.getAdvertiserName();
        int i10 = f1192 + 101;
        f1188 = i10 % 128;
        if (i10 % 2 != 0) {
            return advertiserName;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1454("쐞\uf477\u0097ﵸ", (char) View.MeasureSpec.makeMeasureSpec(0, 0), "爲榝ᑣ❞禠飒ꗳ칾\udfea：戊ƣ脐ꚿ졞冉꼮끎欚˸", View.MeasureSpec.getSize(0), "킡毮軧\u0530").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return br.m1452((FiveAdConfig) list.get(0));
            }
        });
        map.put(m1457("賘箣戹檒儲妔䀌䢱㜓㾷♫\u2ef8ᕶᷨч\u0cc9בֿ\ue3d3\uea6e턨\ud9a4쀦좐뜄", TextUtils.indexOf("", "", 0) + 63353).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return br.m1453((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1457("賘㐗ﵑꚞ濢\u10c8\ud814腥䪳\uf3c3듓簄╆\ueea4韯壝\f쥇犁㯩ﳜ", 47309 - View.MeasureSpec.getSize(0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return br.m1456((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1454("뗰醧琣ᦘ", (char) (39028 - View.resolveSizeAndState(0, 0, 0)), "ᄞ눤\uf10bᶪ쭐҅⸕樞袿飄酱덚렏ꔱ댉趽뚨㜬矾뒓蟧㏖솁⫐駈ź앾뗂㺤\uaad8", ViewConfiguration.getMaximumFlingVelocity() >> 16, "킡毮軧\u0530").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return br.m1448((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1454("鹵䍠㠁Ⱓ", (char) (9015 - TextUtils.lastIndexOf("", '0')), "л\ude28\uda90ꉩ\ue998㴬〣\u20fc搼켯\ud9f8Kț싦ᐘ溑ꍏࣆ沨媪䪆ş\uf795⼟\uec7a旈븂蚚괚", ExpandableListView.getPackedPositionType(0L) + 21192862, "킡毮軧\u0530").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return br.m1463((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1454("봳ᦗ嵟專", (char) (2142 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "ꤹ毾ᱶ┸⨉ﯫ良륈칛퇸睊\ued67탣諸쉗᳗臩맳츻ޫ嵿\ue2ca\ude7d滋\ueabb㴡", View.MeasureSpec.getMode(0), "킡毮軧\u0530").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return br.m1458((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1454("ꉽ\u0a52쒯釣", (char) (TextUtils.lastIndexOf("", '0', 0) + 58309), "襇餼䠆\ue221쑧켘荞Ბꈉ༓휯⟦䘙掭\uf381裕ᚫꦅƖ\ue4e0\ue902녈\uf607\uea1d櫟컳", '0' - AndroidCharacter.getMirror('0'), "킡毮軧\u0530").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                br.m1455((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1454("ҡ\ue9d8껤ڍ", (char) (36270 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "庠ᬗꏠ㬍봔傖ᜑ⮄律쏱瓈\u206f肯躪劚镖柪∑", KeyEvent.getDeadChar(0, 0), "킡毮軧\u0530").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return br.m1445();
            }
        });
        map.put(m1457("賘䶩อ좠褚䯶Ѩ웛蝃䇷ʴ쌽鶯帇ᢘ\ud94e鯮呥ᛆ흃逷劑ጹ\ued9c긒棶⥥\uebf7ꑘ曝➷\ue01cꊾ持㶜", (ViewConfiguration.getScrollBarSize() >> 8) + 49523).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return br.m1449((FiveAdCustomLayout) list.get(0));
            }
        });
        map.put(m1454("帘峝袹若", (char) (29832 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\ue1b7흹\uf5b5\uf1a6闻๑쌓\ue036垢鱺걮ਉ锖疝螤", Color.alpha(0) - 1185096354, "킡毮軧\u0530").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                br.m1450((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        map.put(m1454("킯끅雟\ue5d8", (char) View.combineMeasuredStates(0, 0), "携ං欦跶勖剴≢\ue40b㦛舽吲谙忚\uedbb\ue73a쇳ᱏ꣗ᴔ\ude32", TextUtils.getOffsetBefore("", 0), "킡毮軧\u0530").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                br.m1451((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        int i10 = f1188 + 15;
        f1192 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 24 / 0;
        }
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1450(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f1192 = (f1188 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        m1464(fiveAdInterface, fiveAdLoadListener);
        f1188 = (f1192 + 19) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1455(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i10 = f1192 + 57;
        f1188 = i10 % 128;
        int i11 = i10 % 2;
        m1460(fiveAdInterface, fiveAdListener);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f1192 + 23;
        f1188 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m1464(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i10 = f1192 + 27;
        f1188 = i10 % 128;
        int i11 = i10 % 2;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        if (i11 == 0) {
            int i12 = 13 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1451(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i10 = f1192 + 83;
        f1188 = i10 % 128;
        int i11 = i10 % 2;
        m1461(fiveAdInterface, fiveAdViewEventListener);
        if (i11 == 0) {
            int i12 = 1 / 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0277  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.br.mo1110(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f1188 = (f1192 + 53) % 128;
        String sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        int i10 = f1192 + 59;
        f1188 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 47 / 0;
        }
        return sdkSemanticVersion;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1459(FiveAdConfig fiveAdConfig) {
        f1188 = (f1192 + 59) % 128;
        String str = fiveAdConfig.appId;
        f1188 = (f1192 + 115) % 128;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m1460(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i10 = f1192 + 11;
        f1188 = i10 % 128;
        int i11 = i10 % 2;
        fiveAdInterface.setListener(fiveAdListener);
        if (i11 == 0) {
            throw null;
        }
        f1192 = (f1188 + 103) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m1461(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i10 = f1188 + 49;
        f1192 = i10 % 128;
        int i11 = i10 % 2;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        if (i11 != 0) {
            int i12 = 64 / 0;
        }
        f1188 = (f1192 + 67) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1454(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1193) ^ f1190) ^ f1191);
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
}

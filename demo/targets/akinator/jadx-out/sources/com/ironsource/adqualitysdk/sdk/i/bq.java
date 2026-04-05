package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.placement.PlacementController;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bq extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1175 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1176 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1177 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1178 = 1;

    static {
        char[] cArr = new char[1080];
        com.google.android.gms.internal.play_billing.a.y("\u0000V¬\u0017Xö\u0004¥±\u0001]Õ\t¢¶abÞ\u000e£»ygÃ\u0000^¬\u000eXÀ\u0004\u00ad±\u0014]þ\tÂ¶cb»\u000e¾»Pg¢ØËt¨\u0080WÜ\u0007i\u0086\u0085A\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t¯¶Qbþ\u000e\u0096»Fgé\u0013´ÀFl\u0019\u0018¼\u008bÆ'¨ÓS\u008f\u0003:»Öa\u0082\u001f=Æér\u0085 0Ûì`\u0098+\u0000A¬6\u0000D¬7XÔ\u0004\u0093±&]þ\t\u0089¶Pbó\u000e\u009b»|gé\u0013´ÀNl\u0019\u0018¼\u007f'ÓW'¶{íÎP\"\u008cvÿÉ,\u001d\u0083qÃÄ\"\u0018\u0082lÛ¿\u0019\u0013jgÍº6\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t¼¶Lbÿ\u000e\u0092»Qgô\u0013¬ÀCl\u0019\u0018½\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t»¶[bò\u000e´»]gã\u0013¯À}l\u0015\u0018ºÅHq1\u001d¨Êyv\u001b\"ÛÏn{2'ÕÔL\u00805,ÐØº\u0085+1î\u0000c¬=XÉ\u0004Ø± ]ã\t\u009c¶Lbý\u000e\u009a»\u001agç\u0013¶ÀNl\u000e\u0018¡ÅIq\u0016\u001dêÊev\f\"ÑÏ\"{9'ÂÔc\u0080$,ÎØ\u0091\u0085)1ïÝÀ\u008a\b6ëâ\u0094\u008fD;Åç\u0082\u0094{@\u001bì²\u0099tE\u001dñ£\u009eoJ=öÕ£zO\bûñ¨hT9\u0000Û¬\u009bY.\u0005ò±\u0095^\f\nõ¶\u0090cz\u000fë»®ÕDy'\u008dØÑ\u0088d\t\u0088ÎÜ®c]·ÓÛ\u0088n^²ïÆ¦\u0015U¹1Í¡\u0010X¤\u0017È¾\u001fs£\u0010÷Ï\u0000c¬=XÉ\u0004Ø± ]ã\t\u009c¶Lbý\u000e\u009a»\u001agç\u0013¶ÀNl\u000e\u0018¡ÅIq\u0016\u001dêÊev\f\"ÑÏ\"{?'ÓÔv\u0080=,ÐØ\u0091\u0085>1åÝÀ\u008a\b6ëâ\u0094\u008fD;Åç\u0082\u0094b@\u0011ì\u009f\u0099DE\u0012ñ£\u009ejJ\u0019öý£mO\u0014ûÛ¨rT?\u0000Ü¬\u0083¯Þ\u0003½÷B«\u0012\u001e\u0093òT¦5\u0019ÎÍ`¡\u0011\u0014ÐÈF¼'oÙÃ\u009d·=jÄÞ¥²1eôÙ\u0097\u008dZ`óÔ¼\u0088_\u009e\u00912ÏÆ;\u009a*/ÒÃ\u0011\u0097n(¾ü\u000f\u0090h%èù\u0015\u008dD^¼òü\u0086S[»ïä\u0083\u0018T\u0097èþ¼#QÐåÍ¹!J\u0084\u001eÏ²\"Fc\u001bÌ¯\u0017C2\u0014ú¨\u0019|f\u0011¶¥7yp\n\u0091ÞêrD\u0007µÛôob\u0000\u0083Ôýh9=\u0099Ñàe\u00016\u0095ÊÐ\u009e32~Ç×\u009b\u0018/{\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t¾¶[bá\u000e\u0097»]gô\u0013½ÀNl5\u0018 ÅFq\u001d\u001d¶Ê{v\t\"ÎÏe{1'ÞÔC\u00807,ÒØ\u0091\u0085<1õÝ\u009a\u008a9TØø\u0086\frPcå\u009b\tX]'â÷6FZ!ï¡3\\G\r\u0094õ8µL\u001a\u0091ò%\u00adIQ\u009eÞ\"·vj\u009b\u0099/\u0084sh\u0080ÍÔ\u0086xk\u008c*Ñ\u0085e^\u0089{Þ³bP¶/Ûÿo~³9ÀÅ\u0014 ¸\u001aÍì\u0011¦¥\u000fÊÆ\u001eµ¢N÷Û\u001b½¯füÍ\u0000\u0080Trø5\r\u009eQJå%\n¸^Lâ)7ê[Gï\u000e<á@B\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t®¶_bã\u000e\u0087»bgï\u0013½À]l?\u0018¡ÅNq\u0006\u001d¶Êyv\u0004\"ÖÏi{,!±\u008dÒy-%}\u0090ü|;(C\u0097¦C\u001a/o\u009a\u009bF\u00162Dá¤MÆ9Xä·Pÿ<Oë\u0080Wý\u0003/î\u0090ZÕ\u0082\u000f.lÚ\u0093\u0086Ã3Bß\u0085\u008bü4\u001càµ\u008cñ9\u0001å \u0091ùB\u000bîR\u009aêG1ó\\\u009fæH&ôl \u0092M%ùm¥\u0085V*\u0002\u007f®\u008dZÚ\u0007\u007f¹ô\u0015\u008fáy½(\b\u0081äb°6\u000fæÛC·<\u0002ÊÞSª\u0017yøÕ³¡\f\u0000W¬7XÆ\u0004¢±:]û\t\u008a¶Xbù\u000e\u0081»{gä\u0013²ÀOl\u001f\u0018º\u0000W¬7XÆ\u0004¢±:]û\t\u008a¶Xbù\u000e\u0081»agÔ\u0013\u0094\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t ¶[bñ\u000e\u0090»ZgË\u0013·ÀXl\u0019\u0018\u008dÅOq\u001c\u001d°Êdv\u0007\"ÖÏ`{;'Â\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t¡¶Lbñ\u000e\u008b»PgÐ\u0013±ÀOl\u000b\u0018\u008dÅOq\u001c\u001d°Êdv\u0007\"ÖÏ`{;'Â5¤\u0099Çm81h\u0084éh.<O\u0083´W\u001a;k\u008eªR=&Qõ¤YÆ-Kð©Dé(kÿ\u0095Cê\u0017\"ú\u0092NÝ\u00120á\u0082µÝ\u00198\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t»¶[bò\u000e´»]gã\u0013¯\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t»¶[bò\u000e´»]gã\u0013¯Àil\u0010\u0018§ÅEq\u001c\u001d°\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t£¶Xbö\u000e\u0087»FgÐ\u0013±ÀOl\u000b\u0018«ÅRq:\u001d¥Êxv\f\"ÖÏi{,\u0000O¬4XÂ\u0004\u0093±:]Ì\t\u0085¶[bç\u000e\u0087»FgÎ\u0013¹ÀDl\u0018\u0018¢ÅEq\u0000\u001d\u0088Ê\u007fv\u001b\"ÎÏi{0'ÕÔp\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t¿¶Ubù\u000e\u0092»wgé\u0013¶À^l\u000e\u0018¡ÅLq\u001e\u001d¡ÊdXìô\u008f\u0000p\\ é¡\u0005fQ\u001bîñ:]V6ãÓ?MK\u0012\u0098ú4ª@\u0005\u009dè)ºE\u0005\u0092À.\u0080zw\u0097Û#\u008e\u007fq\u008cÈØ\u0095tp\u0000H¬+XÔ\u0004\u0084±\u0005]Â\t®¶Lbÿ\u000e\u0095»Ggã\u0013ªÀkl\u001f\u0018ºÅIq\u0004\u001d\u00adÊbv\u0011\u0000c¬=XÉ\u0004Ø± ]ã\t\u009c¶Lbý\u000e\u009a»\u001agç\u0013¶ÀNl\u000e\u0018¡ÅIq\u0016\u001dêÊev\f\"ÑÏ\"{1'ÆÔg\u0080&,ÊØ\u0099\u008531²Ý¦\u008a96ââ\u0096\u008f{;Ðç\u0098\u0094^@\u0011ì§\u0099QE\u0011ñ´\u009eYJ\töÈ£gO\u0016ûÛ¨pT/¿\u0085\u0013Õç2»C\u000eÏâ\u001a¶Z\t®Ý\u0013±f\u0004°Ø\r¬Y\u007f\u0087Óü§Fz§Îó¢Ru¡Éø\u009d4p\u009d\u0000g¬7XÐ\u0004¹±.]ü\t\u0089¶LbÓ\u000e\u0083»Wgî\u0013½Àil\u0010\u0018§ÅCq\u0019\u001d\u0090Ê~v\u001a\"ÕÏy{9'ØÔW\u0080&,Êy\u0013ÕC!¤}ÃÈX$ºpáÏ:\u001b\u0081¿ê\u0013ºç]»+\u000e©âv¶\u0002\tÖÝp±\n\u0004×Ø\u007f¬\u0001\u007fÞÓ\u0081§&zèÎ\u0091¢<uö\ng¦7RÐ\u000e²»-Wê\u0003\u0089¼Phô\u0004\u0087±Zmå\u0019¡Êbf\u0013\u0012¢ÏD{\u0017\u0017¶À_|\u0006(ÉÅxq?-ÞÞa\u008a1\u0000g¬7XÐ\u0004²±!]é\t\u0098¶Lbù\u000e\u0080»Agò\u0013·ÀXl5\u0018ªüyP)¤Îø¸M:¡åõ\u0091JE\u009eãò\u0099GD\u009bìï\u0085<[\u0090\fä¤9L\u008d\u0003á¶6d\u008a\u0013ÞÖ\u0000g¬7XÐ\u0004¦±:]ÿ\t\u0080¶Qbñ\u000e\u0086»Qgâ\u0013\u009cÀKl\b\u0018¯\u0000g¬7XÐ\u0004¦±)]è\t\u008d¶Sbõ\u000e\u0096»Qgô\u0013«½D\u0011\u0001åå¹¡\f\fàÈ´¿\u000bl\u0000I¬\u001cXð\u0004³±\u001a]É\t¸¶wbÄ\u000e«»ugÊ\u0000I¬\u001cXò\u0004·±\u0004]Ó\t¨\u0000N¬\u001dXð\u0004©±\u0001]Ô\t¥¶jbÙ\u000e£»xgÏ\u0013\u0082Àol8", "ISO-8859-1", cArr, 0, 1080);
        f1176 = cArr;
        f1177 = -1042374173370569646L;
    }

    public bq(String str) {
        super(str);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static Object m1423(String str) {
        switch (str.hashCode()) {
            case -1617199657:
                if (!str.equals(m1433((char) View.getDefaultSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6, 1058 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    return null;
                }
                int i10 = f1178 + 97;
                f1175 = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                return PlacementType.INVALID;
            case -1372958932:
                if (!str.equals(m1433((char) (Process.myTid() >> 22), ((byte) KeyEvent.getModifierMetaStateMask()) + 13, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1046).intern())) {
                    return null;
                }
                f1178 = (f1175 + 11) % 128;
                return PlacementType.INTERSTITIAL;
            case -65580248:
                if (str.equals(m1433((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 15, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1064).intern())) {
                    return PlacementType.NOT_INITIALIZED;
                }
                return null;
            case 543046670:
                if (!str.equals(m1433((char) (ExpandableListView.getPackedPositionChild(0L) + 48407), 8 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionChild(0L) + IronSourceError.ERROR_IS_SHOW_EXCEPTION).intern())) {
                    return null;
                }
                f1178 = (f1175 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
                return PlacementType.REWARDED;
            default:
                return null;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ DependencyHolder m1424() {
        f1175 = (f1178 + 105) % 128;
        DependencyHolder dependencyHolderM1422 = m1422();
        f1178 = (f1175 + 87) % 128;
        return dependencyHolderM1422;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1426(String str) {
        int i10 = f1178 + 37;
        f1175 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1423 = m1423(str);
        if (i11 != 0) {
            int i12 = 51 / 0;
        }
        int i13 = f1175 + 25;
        f1178 = i13 % 128;
        if (i13 % 2 != 0) {
            return objM1423;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ PreloadedVastData m1430(DependencyHolder dependencyHolder) {
        int i10 = f1178 + 107;
        f1175 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1425(dependencyHolder);
        }
        m1425(dependencyHolder);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ PlacementController m1432(HyprMXController hyprMXController) {
        int i10 = f1178 + 95;
        f1175 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1438(hyprMXController);
        }
        m1438(hyprMXController);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1437(DependencyHolder dependencyHolder) {
        int i10 = f1175 + 45;
        f1178 = i10 % 128;
        int i11 = i10 % 2;
        String strM1435 = m1435(dependencyHolder);
        if (i11 == 0) {
            int i12 = 75 / 0;
        }
        int i13 = f1178 + 33;
        f1175 = i13 % 128;
        if (i13 % 2 == 0) {
            return strM1435;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1439(Ad ad2) {
        f1178 = (f1175 + 91) % 128;
        String strM1427 = m1427(ad2);
        int i10 = f1175 + 111;
        f1178 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1427;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m1428(WebTrafficObject webTrafficObject) {
        f1178 = (f1175 + 59) % 128;
        List<WebTrafficObject.WebTrafficURL> listM1436 = m1436(webTrafficObject);
        int i10 = f1178 + 105;
        f1175 = i10 % 128;
        if (i10 % 2 == 0) {
            return listM1436;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1431(OfferCacheEntity offerCacheEntity) {
        f1175 = (f1178 + 75) % 128;
        String strM1434 = m1434(offerCacheEntity);
        f1175 = (f1178 + 77) % 128;
        return strM1434;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static List<WebTrafficObject.WebTrafficURL> m1436(WebTrafficObject webTrafficObject) {
        f1178 = (f1175 + 97) % 128;
        List<WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        int i10 = f1175 + 107;
        f1178 = i10 % 128;
        if (i10 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m1440(PreloadedVastData preloadedVastData) {
        int i10 = f1178 + 9;
        f1175 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject parameters = preloadedVastData.getParameters();
        if (i11 != 0) {
            int i12 = 26 / 0;
        }
        f1175 = (f1178 + 73) % 128;
        return parameters;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1433((char) (49122 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 865).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bq.m1428((WebTrafficObject) list.get(0));
            }
        });
        map.put(m1433((char) TextUtils.indexOf("", ""), (-16777188) - Color.rgb(0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 887).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bq.m1431((OfferCacheEntity) list.get(0));
            }
        });
        map.put(m1433((char) (31092 - TextUtils.indexOf("", "", 0, 0)), (Process.myPid() >> 22) + 9, 914 - MotionEvent.axisFromString("")).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bq.m1439((Ad) list.get(0));
            }
        });
        map.put(m1433((char) (49037 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 20, 923 - Process.getGidForName("")).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bq.m1426((String) list.get(0));
            }
        });
        map.put(m1433((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2561), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27, 945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bq.m1424();
            }
        });
        map.put(m1433((char) KeyEvent.keyCodeFromString(""), 16 - View.combineMeasuredStates(0, 0), 971 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bq.m1437((DependencyHolder) list.get(0));
            }
        });
        map.put(m1433((char) (64542 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 22, KeyEvent.normalizeMetaState(0) + 987).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bq.m1432((HyprMXController) list.get(0));
            }
        });
        map.put(m1433((char) KeyEvent.normalizeMetaState(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 16, View.MeasureSpec.getMode(0) + 1009).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bq.m1430((DependencyHolder) list.get(0));
            }
        });
        map.put(m1433((char) KeyEvent.normalizeMetaState(0), 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1025 - KeyEvent.getDeadChar(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bq.m1429((PreloadedVastData) list.get(0));
            }
        });
        int i10 = f1178 + 31;
        f1175 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1429(PreloadedVastData preloadedVastData) {
        f1175 = (f1178 + 27) % 128;
        JSONObject jSONObjectM1440 = m1440(preloadedVastData);
        int i10 = f1178 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1175 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 40 / 0;
        }
        return jSONObjectM1440;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1434(OfferCacheEntity offerCacheEntity) {
        f1175 = (f1178 + 19) % 128;
        String str = offerCacheEntity.clickThroughUrl;
        int i10 = f1175 + 79;
        f1178 = i10 % 128;
        if (i10 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static PlacementController m1438(HyprMXController hyprMXController) {
        f1178 = (f1175 + 67) % 128;
        PlacementController placementController = hyprMXController.getPlacementController();
        f1175 = (f1178 + 75) % 128;
        return placementController;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0560  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bq.mo1110(java.lang.String):java.lang.Class");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1435(DependencyHolder dependencyHolder) {
        int i10 = f1178 + 65;
        f1175 = i10 % 128;
        int i11 = i10 % 2;
        String distributorId = dependencyHolder.getDistributorId();
        if (i11 != 0) {
            int i12 = 53 / 0;
        }
        return distributorId;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        int i10 = f1178 + 31;
        f1175 = i10 % 128;
        try {
            try {
                String str = (String) (i10 % 2 != 0 ? BuildConfig.class.getDeclaredField(m1433((char) (ViewConfiguration.getLongPressTimeout() % 36), (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)) + 39, ViewConfiguration.getScrollBarFadeDuration() - 70).intern()) : BuildConfig.class.getDeclaredField(m1433((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, ViewConfiguration.getScrollBarFadeDuration() >> 16).intern())).get(null);
                int i11 = f1175 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1178 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 3 / 0;
                }
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2670().m2672().m2723(BuildConfig.class, m1433((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), Gravity.getAbsoluteGravity(0, 0) + 12, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12).intern());
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1433(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f1176[i11 + i12] ^ (i12 * f1177)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static PreloadedVastData m1425(DependencyHolder dependencyHolder) {
        f1175 = (f1178 + 91) % 128;
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        f1178 = (f1175 + 111) % 128;
        return preloadedData;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1427(Ad ad2) {
        int i10 = f1178 + 57;
        f1175 = i10 % 128;
        int i11 = i10 % 2;
        String str = ad2.type;
        if (i11 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static DependencyHolder m1422() {
        f1178 = (f1175 + 3) % 128;
        DependencyHolder dependencyHolder = DependencyHolder.INSTANCE;
        f1175 = (f1178 + 21) % 128;
        return dependencyHolder;
    }
}

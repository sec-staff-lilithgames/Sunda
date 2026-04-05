package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.LossReason;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.EventTypeExtended;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bl extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1068 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1069 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1070 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1071 = 1;

    static {
        char[] cArr = new char[1179];
        com.google.android.gms.internal.play_billing.a.y("\u0000^\u009aª5\u0088Ð¹k\u0084\u0006ª¡ê<ç×\u009brú\rø¨¶uVï\u0085@¸¥\u009a\u001e¡s\u00adÔ¶IÃ¢Ó\u0007åxòÝõ6ú\u0000A\u009a\u00925¨Ð\u008bk«\u0006¾¡¨<Û×É\u0000A\u009a\u00925ºÐ\u008bk¼\u0006«¡«\u0000A\u009a\u00925ªÐ\u0097k´\u0006¢¡\u0097<Ù×ÂrÃ\rù¨üCÄÞ\u0017y\u0007\u0014\u001e¯\u0005J8å)\u00800\u0000A\u009a\u00925 Ð\u008bk«\u0006º¡¡<Ô×ÕrÔÀ4ZçõË\u0010ò«ÜÆÎaÔü¼\u0017±\u0000A\u009a\u00925¾Ð\u0087k©\u0006»¡¡<É×Ärö\rý¨àCéÞ\u0013y\u0011\u0014\u001e¯\u0005J$å?\u0000A\u009a\u00925\u009fÐ¶k¡\u0006¾¡¡\u0082\u0013\u0018À·èRÙéï\u0084ëÚù@,ï9\n7±\u0006Ü\u0007{3æh\rx¨i×BrG\u0099V\u0004·\u0000B\u009a\u00975\u0082Ð\u008ck½\u0006¼¡\u0092<Ó×ÕrÑ\u0000i\u009a\u00995ÂÐ\u0080k±\u0006ª¡©<Û×ÓrÎ\rõ¨üCíÞPy\u0016\u0014\u000b¯\u000eJ8å)\u00800\u001b\u0016¶lQEìt\u0087~\"c¼\u008eW¤ò\u0081\u008d»(£³o)²\u0086¥c\u0082Ø\u0094µ\u0080\u0012\u0081\u008fþdóÁî\u0000B\u009a\u009f5\u0088Ð¯k¹\u0006\u00ad¡¬<Ó×ÞrÃ\rÝ¨ö\u0000C\u009a\u00845\u0089Ð\u0083k¬\u0006§¡²<ß×örÉ\rî¨ÿCéÞ\n\u0000I\u009a\u009b5\u008dÐ\u0085k½\u0006\u008a¡¥<Î×Ñ\u0000I\u009a\u00985\u0098Ð\u0087kª\u0006½¡°<Ó×ÄrÏ\rý¨þCÉÞ\u001a\u0000I\u009a\u00985\u0098Ð\u0087kª\u0006½¡°<Ó×ÄrÏ\rý¨þCÄÞ\u0017y\u0007\u0014\u001e¯\u0005J8å)\u00800\u0000F\u009a\u00835\u0080Ð\u008ek\u008b\u0006\u00ad¡¶<ß×ÕrÈ\rÝ¨ö\u0005G\u009f\u00990\u0082Õ\u0081n³\u0003\u0085¤½9ÃÒßwØ\bÂ\u00adáFòÛ\u0011\u0000M\u009a\u00935\u0088Ð\u008bk¹\u0006\u0098¡\u00ad<ß×Ç\u0000i\u009a\u00995ÂÐ\u0080k±\u0006ª¡©<Û×ÓrÎ\rõ¨üCíÞPy\u001a\u0014\u000b¯\u0014J?å:\u0080'\u001bY¶JQ\nìl\u0087y\"c¼\u008bWÜò¥\u008d»(°Ã£^¡ùà\u0094Å/ÇÊï÷im°Â¿'¬\u009c\u0089ñ\u008cV¢Ëù\u0000N\u009a\u00975\u0098Ð\u008bk®\u0006«¡\u0088<Ó×ÃrÒ\rù¨üCíÞ\f\u0000N\u009a\u00975\u0098Ð\u008bk®\u0006«¡\u0089<ß×ÔrÏ\rý¨ÄCáÞ\u001by\u0003íÖw\u0017Ø\u001f=\u0007\u0086.ë.L%ÑZ:u\u009fF\u0000R\u009a\u00935\u009bÐ\u0083kª\u0006ª¡¡<Þ×ürÏ\rï¨æCíÞ\u0010y\u0011\u0014\u0018\u0000R\u009a\u009f5\u008fÐ\u008ak\u0095\u0006«¡ <Ó×Ñrê\rõ¨áCüÞ\u001by\u001a\u0014\u000f¯\u0012T\u0012ÎßaÏ\u0084Ê?ÕRëõàh\u0093\u0083\u0091&°Yµü·\u0017¿\u0000i\u009a\u00995ÂÐ\u0080k±\u0006ª¡©<Û×ÓrÎ\rõ¨üCíÞPy\u0006\u0014\u0003¯\u0003J>å!\u0080'\u001b\\¶GQEì4\u0087B\"o¼\u009fW\u009aò¥\u008d»(°Ã£^¡ùà\u0094Å/ÇÊïìbv«Ù¼<³\u0087\u0083êªM\u009cÐï;ý\u009e÷áÚDç¯ß2>\u0095)ø(C=¦\u0016\t\u0001\u0000i\u009a\u00995ÂÐ\u0080k±\u0006ª¡©<Û×ÓrÎ\rõ¨üCíÞPy\u001a\u0014\u000b¯\u0014J?å:\u0080'\u001bY¶JQ\nìl\u0087y\"c¼\u008bWÜò¾\u008d·(°Ã¯^¯ùæ\u0094À/ÃÊáeë\u0000ö\u009b;6\u0013Ñ\u0012l5\u0007$¢!=JØMÖ\u0005LÖ\u0000M\u009a\u00845\u008dÐ\u008bk¼\u0006\u008f¡§<Î×ÙrÐ\rõ¨æCñ¿£%Y\u008aAo\fÔ}¹v\u001et\u0083\u0016h\u001fÍ\u0014²9\u0017!ü<aßÆ×«Á\u0010\u008eõÿZí?à¤Ö\t\u0083î\u0096S»8¹\u009d¢\u0003\u0012è\u007fMZ2\u007f\u0097}|náAF\u0015+\u0018\u0090\u000bu.Ú'¿0$ÃKOÑ\u0086~\u008f\u009b\u0089 ¾M\u0088ê¯wÙ\u009cÞ9ËFùãÑ\bé\u0095\b2\u001f_\u001eä\u000b\u0001 ®7\u0000c\u009a\u00995\u0081ÐÌk½\u0006¶¡´<Ö×ßrÔ\rù¨áCüÞ\u001fy\u0017\u0014\u0001¯NJ?å-\u0080 \u001b\u0016¶CQVì{\u0087y\"b¼ÒW¿ò\u009a\u008d¿(½Ã®^\u0084ùß\u0094Í/ÎÊ÷eé\u0000Å\u009b\u00196\u0004Ñ\u000fl*\u0007;¢<=G\u000f\u0000\u0095É:ÀßÆdñ\tÊ®ç3\u0083Ø\u0098}\u0099\u0002¢§«L¬ÑGvP\u001bF A\u008f\u0088\u0015AºH_Näy\u0089B.o³\u000bX\u0010ý\u0011\u0082*'#Ì$QÏöØ\u009bÎ ÉÅßjà\u000fô\u0094\u00899\u008eÞ\u008fcº\b§Q§Ëndg\u0081a:VWrðGm5\u0086-\u0000c\u009a\u00995\u0081ÐÌk½\u0006¶¡´<Ö×ßrÔ\rù¨áCüÞ\u001fy\u0017\u0014\u0001¯NJ?å-\u0080 \u001b\u0016¶CQVì{\u0087y\"b¼ÒW¿ò\u009a\u008d¿(½Ã®^\u0096ùß\u0094É/Õß}E´ê½\u000f»´\u008cÙ¨~\u009dãï\b÷\u00adÚÒÅwÑ\u009cÌ\u0001+¦*Ë?p\"ôpn±Á¹$°\u009f¿ò\u008bU\u0096Èõ#à\u0086éùÎ\\Í\u0000c\u009a\u00995\u0081ÐÌk½\u0006¶¡´<Ö×ßrÔ\rù¨áCüÞ\u001fy\u0017\u0014\u0001¯NJ?å-\u0080 \u001b\u0016¶XQEìi\u0087d\"(¼\u009dW\u0091ò\u009c\u008d·(¢Ã£^´ùÏ\u0094\u0082/ôÊùeý\u0000ð\u009b;6\u0013Ñ\u0012l5\u0007$¢!=JØM\u0000V\u009a\u00975\u009fÐ\u0096k\u008e\u0006§¡¡<ÍÉ\u0003Sùüá\u0019¬¢ÝÏÖhÔõ¶\u001e¿»´Ä\u0099a\u0081\u008a\u009c\u0017\u007f°wÝaf.\u0083_,MI@Òv\u007f8\u0098%%\tN\u0004ëHuý\u009eñ;üD×áÂ\nÃ\u0097Ô0¯]âæ\u0094\u0003\u0099¬\u009dÉ\u0090RLÿy\u0018c¥Ko\u0018õÑZØ¿Þ\u0004éiÚÎõS¹¸\u008c\u001d\u0096b¾\u0000c\u009a\u00995\u0081ÐÌk½\u0006¶¡´<Ö×ßrÔ\rù¨áCüÞ\u001fy\u0017\u0014\u0001¯NJ?å-\u0080 \u001b\u0016¶CQVì{\u0087y\"b¼ÒW¿ò\u009a\u008d¿(½Ã®^\u0081ùÒ\u0094ú/ËÊýeùõÃo\u0002À\n%\u0003\u009e\u001bó2T4ÉX\"i\u0087Zøz]s¶x+\u0085\u008c\u0084á\u008dH\u0010ÒÑ}ß\u0098Õ#ÿNÿéòt½\u009f\u008a:\u0090E»à¾\u000b¹\u0096U1Y\\F¨\r2ù\u009dòxÌÃÛ®×\tÞ\u0094¼\u007f»Úµ¥·\u0000\u009cë\u008f\u0000g\u009a\u00935\u0098Ð´k±\u0006ª¡¡<Õ×ñrÂ\rñúL`¸Ï³*\u008b\u0091\u0086ü\u008b[\u008bÆý-þ\u0000g\u009a\u00935\u0098Ð¦k±\u0006½¡´<Ö×Ñrß2÷¨\u0003\u0007\bâ6Y!4-\u0093$\u000eFåA@O?N\u009acqvì\u0080K\u0081&\u0088âgx\u0093×\u00982 \u0089¹ä CªÞß5Â\u0090ãïäJæ¡Ø<\f\u009b\u001bö\u001eM\u000f¨\u001a\u0007%b1ùL\u0000g\u009a\u00935\u0098Ð´k±\u0006ª¡¡<Õ[\u0094Á`nk\u008bP0O]RúZg(\u008c*);Ó\u0095Iaæj\u0003S¸XÕYrWï<\u0004+¡\"Þ\u000b{)\u0090\u001e¦\u001e<ê\u0093ávËÍÍ Ö\u0007Þ\u009a¦q¤Ôº«\u008b\u000e\u009få¸xc\u0000g\u009a\u00935\u0098Ð£k¼\u0006\u009a¡½<Ê×Õ'+½ß\u0012Ô÷ýLñ!î\u0086ä\u001b\u0093ð\u008eU£*´\u0000s\u009a\u00935\u0098Ð«k¶\u0006º¡¡<È×ÃrÒ\rõ¨æCáÞ\u001fy\u0018\u0014&¯\tJ%å8\u0080'\u001bV¶KQV\u0000s\u009a\u00935\u0098Ð°k½\u0006¹¡¥<È×ÔrÃ\rø¨ÞCáÞ\ry\u0000\u0014\u000f¯\u000eJ3å>\"®¸N\u0017Eò}Id$}\u0083w\u001e\u0002õ\u001fP7/(\u008a<a!üÆ[Ç6Ò\u008dÏºè \u001c\u008f\u0017j(Ñ/¼5\u001b\u001b\u0086GmPÈ]·|\u0012Qùnd\u0082Ã\u008f\u0018ý\u0082\t-\u0002È:s;\u001e ¹;$sÏ^jN\u0015o°f[uÎ\u0015Tøûï\u001eð¥üÈÍoÁò¤\u0019©¼¶Ã¿f\u008a\u008d¬\u0010}·qÚtay\u0084F", "ISO-8859-1", cArr, 0, 1179);
        f1069 = cArr;
        f1068 = -380964715253163274L;
    }

    public bl(String str) {
        super(str);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static List<Any> m1267(Ad ad2) {
        int i10 = f1070 + 21;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        List<Any> extProtoList = ad2.getExtProtoList();
        if (i11 == 0) {
            int i12 = 20 / 0;
        }
        return extProtoList;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static String m1268(Ad ad2) {
        f1071 = (f1070 + 93) % 128;
        String id2 = ad2.getId();
        f1070 = (f1071 + 79) % 128;
        return id2;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static Ad.Video m1269(Ad ad2) {
        f1070 = (f1071 + 7) % 128;
        Ad.Video video = ad2.getVideo();
        int i10 = f1071 + 71;
        f1070 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 37 / 0;
        }
        return video;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m1272(Ad ad2) {
        f1071 = (f1070 + 81) % 128;
        List<Any> listM1267 = m1267(ad2);
        f1070 = (f1071 + 99) % 128;
        return listM1267;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1279(ByteString byteString) {
        int i10 = f1070 + 55;
        f1071 = i10 % 128;
        if (i10 % 2 == 0) {
            m1294(byteString);
            throw null;
        }
        String strM1294 = m1294(byteString);
        int i11 = f1070 + 35;
        f1071 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM1294;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ByteString m1285(Any any) {
        f1071 = (f1070 + 103) % 128;
        ByteString byteStringM1276 = m1276(any);
        int i10 = f1071 + 33;
        f1070 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 31 / 0;
        }
        return byteStringM1276;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Video m1292(Ad ad2) {
        f1071 = (f1070 + 45) % 128;
        Ad.Video videoM1269 = m1269(ad2);
        int i10 = f1070 + 59;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return videoM1269;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display m1298(Ad ad2) {
        f1070 = (f1071 + 115) % 128;
        Ad.Display displayM1278 = m1278(ad2);
        f1071 = (f1070 + 61) % 128;
        return displayM1278;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1273(en.a aVar, en.d dVar) {
        f1071 = (f1070 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        m1284(aVar, dVar);
        int i10 = f1071 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1070 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 65 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1281(Ad ad2, int i10) {
        int i11 = f1071 + 55;
        f1070 = i11 % 128;
        if (i11 % 2 == 0) {
            return m1300(ad2, i10);
        }
        m1300(ad2, i10);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display.Banner m1286(Ad.Display display) {
        int i10 = f1071 + 11;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1277(display);
        }
        m1277(display);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1295(Ad.Display display) {
        f1070 = (f1071 + 71) % 128;
        String strM1299 = m1299(display);
        f1070 = (f1071 + 69) % 128;
        return strM1299;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1301(AdRequestParameters adRequestParameters) {
        f1071 = (f1070 + 7) % 128;
        String strM1271 = m1271(adRequestParameters);
        f1071 = (f1070 + 97) % 128;
        return strM1271;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1275(mm.h hVar, mm.c cVar) {
        f1071 = (f1070 + 51) % 128;
        m1303(hVar, cVar);
        int i10 = f1070 + 75;
        f1071 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m1283(Ad.Display.Banner banner) {
        f1070 = (f1071 + 11) % 128;
        List<Any> listM1302 = m1302(banner);
        int i10 = f1071 + 85;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return listM1302;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1287(Ad.Video video) {
        int i10 = f1070 + 11;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1280(video);
        }
        m1280(video);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1296(RequestExtension requestExtension) {
        int i10 = f1071 + 33;
        f1070 = i10 % 128;
        int i11 = i10 % 2;
        String strM1291 = m1291(requestExtension);
        if (i11 != 0) {
            int i12 = 35 / 0;
        }
        int i13 = f1071 + 53;
        f1070 = i13 % 128;
        if (i13 % 2 == 0) {
            return strM1291;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1299(Ad.Display display) {
        int i10 = f1070 + 91;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return display.getAdm();
        }
        display.getAdm();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1288(Ad ad2) {
        int i10 = f1071 + 45;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1268(ad2);
        }
        m1268(ad2);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1297(fr.a aVar, fr.d dVar) {
        int i10 = f1070 + 45;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        m1274(aVar, dVar);
        if (i11 == 0) {
            throw null;
        }
        f1070 = (f1071 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List<Any> m1302(Ad.Display.Banner banner) {
        f1071 = (f1070 + 83) % 128;
        List<Any> extProtoList = banner.getExtProtoList();
        int i10 = f1070 + 105;
        f1071 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 89 / 0;
        }
        return extProtoList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f1070 = (f1071 + 57) % 128;
        try {
            String strM2723 = hu.m2670().m2672().m2723(BidMachine.class, m1293((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, TextUtils.indexOf("", "")).intern());
            int i10 = f1071 + 37;
            f1070 = i10 % 128;
            if (i10 % 2 == 0) {
                return strM2723;
            }
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        switch (str.hashCode()) {
            case -2127904484:
                if (str.equals(m1293((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 17, 381 - View.combineMeasuredStates(0, 0)).intern())) {
                    return RichMediaListener.class;
                }
                return null;
            case -2032115546:
                if (str.equals(m1293((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 13 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.getCapsMode("", 0, 0) + PsExtractor.PRIVATE_STREAM_1).intern())) {
                    return CreativeFormat.class;
                }
                return null;
            case -1921270373:
                if (str.equals(m1293((char) (Color.green(0) + 62502), ExpandableListView.getPackedPositionChild(0L) + 13, Process.getGidForName("") + 739).intern())) {
                    return VastActivity.class;
                }
                return null;
            case -1798479256:
                if (str.equals(m1293((char) View.combineMeasuredStates(0, 0), 47 - ((Process.getThreadPriority(0) + 20) >> 6), 750 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    return VastActivity.class;
                }
                return null;
            case -1683121555:
                if (str.equals(m1293((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 12 - View.resolveSize(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 177).intern())) {
                    return BidMachineAd.class;
                }
                return null;
            case -1628534628:
                if (str.equals(m1293((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 20971), 9 - (Process.myPid() >> 22), 677 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    return MraidView.class;
                }
                return null;
            case -1627944928:
                if (!str.equals(m1293((char) (55995 - TextUtils.getOffsetBefore("", 0)), 14 - View.MeasureSpec.getSize(0), 112 - KeyEvent.keyCodeFromString("")).intern())) {
                    return null;
                }
                f1070 = (f1071 + 113) % 128;
                return mm.c.class;
            case -1518365947:
                if (str.equals(m1293((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 62868), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, Drawable.resolveOpacity(0, 0) + 897).intern())) {
                    return VastViewListener.class;
                }
                return null;
            case -1507727624:
                if (!str.equals(m1293((char) Color.blue(0), TextUtils.indexOf("", "", 0, 0) + 37, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 281).intern())) {
                    return null;
                }
                f1071 = (f1070 + 107) % 128;
                return yp.k.class;
            case -1371195010:
                if (str.equals(m1293((char) ((-1) - Process.getGidForName("")), 12 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 247).intern())) {
                    return FullScreenAd.class;
                }
                return null;
            case -1246480821:
                if (str.equals(m1293((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 60467), 19 - TextUtils.getCapsMode("", 0, 0), 448 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    return VideoPlayerActivity.class;
                }
                return null;
            case -1146475727:
                if (str.equals(m1293((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 8 - TextUtils.getOffsetAfter("", 0), 797 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    return VastView.class;
                }
                return null;
            case -1087582685:
                if (str.equals(m1293((char) (3917 - Color.alpha(0)), 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.green(0) + 634).intern())) {
                    return MraidInterstitial.class;
                }
                return null;
            case -1011229113:
                if (!str.equals(m1293((char) ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0') + 47, 588 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return null;
                }
                f1070 = (f1071 + 29) % 128;
                return MraidDialogActivity.class;
            case -838844802:
                if (str.equals(m1293((char) (51552 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE).intern())) {
                    return VastView.class;
                }
                return null;
            case -642689680:
                if (!str.equals(m1293((char) (57136 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 17, 722 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                int i10 = f1071 + 67;
                f1070 = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                return MraidViewListener.class;
            case -609786639:
                if (str.equals(m1293((char) (60804 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 10, 355 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    return fr.a.class;
                }
                return null;
            case -589219056:
                if (str.equals(m1293((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29976), 13 - TextUtils.indexOf("", "", 0, 0), 12 - Color.green(0)).intern())) {
                    return AdContentType.class;
                }
                return null;
            case -572702516:
                if (str.equals(m1293((char) (49269 - Color.blue(0)), ((Process.getThreadPriority(0) + 20) >> 6) + 9, (ViewConfiguration.getTouchSlop() >> 8) + 71).intern())) {
                    return AdRequest.class;
                }
                return null;
            case -475472046:
                if (str.equals(m1293((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 20 - Drawable.resolveOpacity(0, 0), 41 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    return AdFullScreenListener.class;
                }
                return null;
            case -211807062:
                if (str.equals(m1293((char) (45869 - KeyEvent.keyCodeFromString("")), TextUtils.lastIndexOf("", '0', 0) + 11, (ViewConfiguration.getWindowTouchSlop() >> 8) + 167).intern())) {
                    return BidMachine.class;
                }
                return null;
            case -150492023:
                if (str.equals(m1293((char) (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionType(0L) + 9, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 272).intern())) {
                    return yp.k.class;
                }
                return null;
            case 2115:
                if (str.equals(m1293((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54852), 1 - TextUtils.indexOf((CharSequence) "", '0'), 514 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    return Ad.class;
                }
                return null;
            case 1282165:
                if (!str.equals(m1293((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), View.getDefaultSize(0, 0) + 36, 685 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    return null;
                }
                int i11 = f1070 + 109;
                f1071 = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                return MraidView.class;
            case 3368703:
                if (str.equals(m1293((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 9 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25).intern())) {
                    return Ad.Display.class;
                }
                return null;
            case 141091039:
                if (!str.equals(m1293((char) (49087 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39, 529 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return null;
                }
                int i12 = f1070 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1071 = i12 % 128;
                if (i12 % 2 == 0) {
                    return null;
                }
                return MraidActivity.class;
            case 320151695:
                if (str.equals(m1293((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE).intern())) {
                    return en.a.class;
                }
                return null;
            case 503762424:
                if (str.equals(m1293((char) ((Process.getThreadPriority(0) + 20) >> 6), 6 - ExpandableListView.getPackedPositionChild(0L), 34 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    return Ad.Video.class;
                }
                return null;
            case 529939434:
                if (!str.equals(m1293((char) (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7, TextUtils.getTrimmedLength("") + 99).intern())) {
                    return null;
                }
                int i13 = f1071 + 103;
                f1070 = i13 % 128;
                if (i13 % 2 != 0) {
                    return null;
                }
                return AdsType.class;
            case 625873720:
                if (str.equals(m1293((char) TextUtils.indexOf("", "", 0), 38 - Color.blue(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 859).intern())) {
                    return MraidAdView.class;
                }
                return null;
            case 713768498:
                if (str.equals(m1293((char) ((-1) - ImageFormat.getBitsPerPixel(0)), ImageFormat.getBitsPerPixel(0) + 16, 340 - TextUtils.indexOf("", "", 0)).intern())) {
                    return yp.n.class;
                }
                return null;
            case 737636858:
                if (str.equals(m1293((char) View.resolveSizeAndState(0, 0, 0), 47 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 468).intern())) {
                    return VideoPlayerActivity.class;
                }
                return null;
            case 742497451:
                if (str.equals(m1293((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 37 - TextUtils.indexOf("", ""), Color.green(0) + 411).intern())) {
                    return RichMediaView.class;
                }
                return null;
            case 745946635:
                if (str.equals(m1293((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 14, (ViewConfiguration.getTapTimeout() >> 16) + 326).intern())) {
                    return vp.q.class;
                }
                return null;
            case 961844241:
                if (str.equals(m1293((char) (ViewConfiguration.getTouchSlop() >> 8), 10 - View.MeasureSpec.getMode(0), Process.getGidForName("") + 127).intern())) {
                    return mm.h.class;
                }
                return null;
            case 1125320581:
                if (str.equals(m1293((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 9 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 203).intern())) {
                    return ImageData.class;
                }
                return null;
            case 1165508119:
                if (str.equals(m1293((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.lastIndexOf("", '0', 0, 0) + 11, 61 - TextUtils.indexOf("", "", 0)).intern())) {
                    return AdListener.class;
                }
                return null;
            case 1212533506:
                if (!str.equals(m1293((char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0') + 17, 365 - Color.red(0)).intern())) {
                    return null;
                }
                f1070 = (f1071 + 29) % 128;
                return fr.d.class;
            case 1297340448:
                if (str.equals(m1293((char) ((-1) - MotionEvent.axisFromString("")), View.getDefaultSize(0, 0) + 20, ExpandableListView.getPackedPositionType(0L) + Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE).intern())) {
                    return en.d.class;
                }
                return null;
            case 1387614166:
                if (!str.equals(m1293((char) KeyEvent.keyCodeFromString(""), Color.red(0) + 19, (ViewConfiguration.getJumpTapTimeout() >> 16) + 80).intern())) {
                    return null;
                }
                int i14 = f1070 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1071 = i14 % 128;
                if (i14 % 2 != 0) {
                    return AdRequestParameters.class;
                }
                return BidMachineAd.class;
            case 1395486086:
                if (str.equals(m1293((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 12 - TextUtils.lastIndexOf("", '0', 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 516).intern())) {
                    return MraidActivity.class;
                }
                return null;
            case 1444286894:
                if (!str.equals(m1293((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19202), 19 - View.MeasureSpec.getSize(0), Color.alpha(0) + 569).intern())) {
                    return null;
                }
                int i15 = f1071 + 7;
                f1070 = i15 % 128;
                if (i15 % 2 != 0) {
                    return null;
                }
                return MraidDialogActivity.class;
            case 1461955341:
                if (str.equals(m1293((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21568), Color.red(0) + 13, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 397).intern())) {
                    return RichMediaView.class;
                }
                return null;
            case 1494941328:
                if (str.equals(m1293((char) (18546 - AndroidCharacter.getMirror('0')), 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), KeyEvent.normalizeMetaState(0) + 913).intern())) {
                    return RequestExtension.class;
                }
                return null;
            case 1917129446:
                if (str.equals(m1293((char) (1290 - TextUtils.getOffsetBefore("", 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, 258 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    return MediaAssetType.class;
                }
                return null;
            case 1955913096:
                if (str.equals(m1293((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 33362), ImageFormat.getBitsPerPixel(0) + 7, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 106).intern())) {
                    return AdView.class;
                }
                return null;
            case 2034998687:
                if (str.equals(m1293((char) (Color.blue(0) + 28501), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, Color.red(0) + 848).intern())) {
                    return MraidAdView.class;
                }
                return null;
            case 2110329530:
                if (str.equals(m1293((char) (63271 - (ViewConfiguration.getTapTimeout() >> 16)), KeyEvent.keyCodeFromString("") + 8, 317 - MotionEvent.axisFromString("")).intern())) {
                    return vp.f.class;
                }
                return null;
            case 2112955383:
                if (str.equals(m1293((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 36805), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25, 651 - View.resolveSize(0, 0)).intern())) {
                    return MraidInterstitialListener.class;
                }
                return null;
            case 2136410007:
                if (str.equals(m1293((char) Color.green(0), 31 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 136 - View.combineMeasuredStates(0, 0)).intern())) {
                    return mm.h.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1289(Ad ad2, int i10) {
        f1070 = (f1071 + 77) % 128;
        String strM1270 = m1270(ad2, i10);
        f1071 = (f1070 + 29) % 128;
        return strM1270;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1300(Ad ad2, int i10) {
        int i11 = f1071 + 31;
        f1070 = i11 % 128;
        if (i11 % 2 == 0) {
            return ad2.getAdomain(i10);
        }
        ad2.getAdomain(i10);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1293((char) (43113 - ImageFormat.getBitsPerPixel(0)), 12 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.lastIndexOf("", '0', 0) + 930).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1295((Ad.Display) list.get(0));
            }
        });
        map.put(m1293((char) (ViewConfiguration.getEdgeSlop() >> 16), Process.getGidForName("") + 12, 942 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1287((Ad.Video) list.get(0));
            }
        });
        map.put(m1293((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64042), (ViewConfiguration.getTapTimeout() >> 16) + 9, TextUtils.lastIndexOf("", '0') + 954).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1289((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m1293((char) KeyEvent.keyCodeFromString(""), Color.red(0) + 10, View.MeasureSpec.getSize(0) + 962).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1298((Ad) list.get(0));
            }
        });
        map.put(m1293((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12944), 16 - (ViewConfiguration.getPressedStateDuration() >> 16), 972 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1286((Ad.Display) list.get(0));
            }
        });
        map.put(m1293((char) (57855 - MotionEvent.axisFromString("")), (Process.myTid() >> 22) + 21, 988 - View.resolveSizeAndState(0, 0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1283((Ad.Display.Banner) list.get(0));
            }
        });
        map.put(m1293((char) ((Process.getThreadPriority(0) + 20) >> 6), KeyEvent.getDeadChar(0, 0) + 8, KeyEvent.normalizeMetaState(0) + 1009).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1292((Ad) list.get(0));
            }
        });
        map.put(m1293((char) (23539 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11, 1017 - ExpandableListView.getPackedPositionType(0L)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1281((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m1293((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 54258), 12 - TextUtils.lastIndexOf("", '0', 0), Color.alpha(0) + IronSourceError.ERROR_RV_LOAD_DURING_SHOW).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1288((Ad) list.get(0));
            }
        });
        map.put(m1293((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42617), 14 - ((Process.getThreadPriority(0) + 20) >> 6), 1040 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1290((AdRequestParameters) list.get(0));
            }
        });
        map.put(m1293((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 9 - Color.argb(0, 0, 0, 0), Color.red(0) + IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1301((AdRequestParameters) list.get(0));
            }
        });
        map.put(m1293((char) (Color.alpha(0) + 10060), 10 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1063).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1296((RequestExtension) list.get(0));
            }
        });
        map.put(m1293((char) TextUtils.getCapsMode("", 0, 0), (-16777193) - Color.rgb(0, 0, 0), 1074 - KeyEvent.normalizeMetaState(0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bl.m1273((en.a) list.get(0), (en.d) list.get(1));
                return null;
            }
        });
        map.put(m1293((char) KeyEvent.normalizeMetaState(0), 19 - View.resolveSize(0, 0), Color.green(0) + 1097).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bl.m1297((fr.a) list.get(0), (fr.d) list.get(1));
                return null;
            }
        });
        map.put(m1293((char) (8925 - TextUtils.indexOf("", "", 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 17, 1116 - View.resolveSize(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bl.m1275((mm.h) list.get(0), (mm.c) list.get(1));
                return null;
            }
        });
        map.put(m1293((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 47760), 14 - ImageFormat.getBitsPerPixel(0), 1133 - View.getDefaultSize(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1272((Ad) list.get(0));
            }
        });
        map.put(m1293((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6297), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1147).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1285((Any) list.get(0));
            }
        });
        map.put(m1293((char) (52854 - ExpandableListView.getPackedPositionChild(0L)), 18 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + e.a.f37417i).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bl.m1279((ByteString) list.get(0));
            }
        });
        f1070 = (f1071 + 101) % 128;
        return map;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1290(AdRequestParameters adRequestParameters) {
        int i10 = f1070 + 53;
        f1071 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1282(adRequestParameters);
        }
        m1282(adRequestParameters);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m1303(mm.h hVar, mm.c cVar) {
        int i10 = f1070 + 17;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        hVar.setListener(cVar);
        if (i11 == 0) {
            int i12 = 11 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1270(Ad ad2, int i10) {
        f1071 = (f1070 + 41) % 128;
        String bundle = ad2.getBundle(i10);
        int i11 = f1071 + 13;
        f1070 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 3 / 0;
        }
        return bundle;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1291(RequestExtension requestExtension) {
        int i10 = f1070 + 73;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        String sellerId = requestExtension.getSellerId();
        if (i11 == 0) {
            int i12 = 60 / 0;
        }
        int i13 = f1071 + 65;
        f1070 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 28 / 0;
        }
        return sellerId;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1271(AdRequestParameters adRequestParameters) {
        f1070 = (f1071 + 57) % 128;
        String name = adRequestParameters.getAdsType().getName();
        f1071 = (f1070 + 33) % 128;
        return name;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m1274(fr.a aVar, fr.d dVar) {
        int i10 = f1070 + 85;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        aVar.setListener(dVar);
        if (i11 == 0) {
            throw null;
        }
        f1071 = (f1070 + 43) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1294(ByteString byteString) {
        f1071 = (f1070 + 77) % 128;
        String stringUtf8 = byteString.toStringUtf8();
        int i10 = f1070 + 33;
        f1071 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 91 / 0;
        }
        return stringUtf8;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1293(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f1069[i11 + i12] ^ (i12 * f1068)) ^ c10);
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1280(Ad.Video video) {
        int i10 = f1071 + 75;
        f1070 = i10 % 128;
        int i11 = i10 % 2;
        String adm = video.getAdm();
        if (i11 != 0) {
            int i12 = 14 / 0;
        }
        f1070 = (f1071 + 7) % 128;
        return adm;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Ad.Display m1278(Ad ad2) {
        int i10 = f1070 + 17;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Display display = ad2.getDisplay();
        if (i11 == 0) {
            int i12 = 53 / 0;
        }
        return display;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Ad.Display.Banner m1277(Ad.Display display) {
        int i10 = f1071 + 5;
        f1070 = i10 % 128;
        if (i10 % 2 == 0) {
            return display.getBanner();
        }
        display.getBanner();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static ByteString m1276(Any any) {
        int i10 = f1070 + 47;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        ByteString value = any.getValue();
        if (i11 == 0) {
            int i12 = 88 / 0;
        }
        return value;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1282(AdRequestParameters adRequestParameters) {
        f1070 = (f1071 + 25) % 128;
        String placementId = adRequestParameters.getPlacementId();
        f1070 = (f1071 + 15) % 128;
        return placementId;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m1284(en.a aVar, en.d dVar) {
        int i10 = f1070 + 9;
        f1071 = i10 % 128;
        int i11 = i10 % 2;
        aVar.setListener(dVar);
        if (i11 == 0) {
            int i12 = 48 / 0;
        }
        f1071 = (f1070 + 15) % 128;
    }
}

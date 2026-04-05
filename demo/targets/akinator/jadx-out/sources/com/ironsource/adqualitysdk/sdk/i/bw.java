package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.amazon.device.ads.DTBAdView;
import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.NativeAdLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoAutomaticListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.InterstitialActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bw extends bg {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1294 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1295;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1296;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1297;

    static {
        char[] cArr = new char[1642];
        com.google.android.gms.internal.play_billing.a.y("\u0094ÎÎÕ \u008c\u009aSü\u001dWö\u0089¼ãsE\u000e¿\u0013\u0012Þt\u0097®[\u00002{í\u0000PZT´\u0011\u000eËh\u0085Ãu\u001d5wæÑ´\\p\u0006dè-Rï4¡\u009fDA\u000f+×\u008d\u0096w¹ÚB¼8fçÈ\u0082³U\u0015\u0012ÿÇ¡ò\u0088\u000fÒ;<q\u0086êàåK\u0006\u0095Sÿ\u008aYß£û\u000e)hv²¯\u001cÑgRÁW+\u0088u¿ß²:'\u0084cî\u009aHÈ\u0093\u0016ýCGx¡°\u000báV>°\u001a\u001a¿dËÏ\u0002) snÝ«'à\u0082\u0018ìY6\u0096\u0090íú÷E(¯m\tºSÝ¾\b\u0018]\u0000IZV´\u0004\u000eÍh\u0092Ãk\u001d$wáÑ´+\u0091\u0086Qà\u0004:á\u0094»ïdI!£öýÑW\u0084²Q\u0098PÂd,.\u0096µðº[Y\u0085\fïÕI\u0080³¤\u001evx)¢ð\f\u008ew\rÑ\b;×eàÏí*x\u0094<þÅX\u0097\u0083Ií\u001cW'±ï\u001b¾Fa E\nêt\u0095ßG9nc1Íè7§\u0092Bü\u0017&Ò\u0080\u0092ê§UB¿8\u0019çC\u0082®U\b\u0012rÇÜòó\u008b©\u008cGÑý\u0002\u009bq0®îø\u0084\r\"gØHu\u009d\u0013ÚÉ\rgh\u001c\u00ad\u0000cZW´\u001d\u000e\u0086h\u0089Ãj\u001d?wæÑ³+\u0097\u0086Eà\u001a:Ã\u0094½ï>I;£äýÓWÞ²K\f\u000fföÀ¤\u001bzu/Ï\u0014)Ü\u0083\u008dÞR8v\u0092ßì¸Ge¡Vû%UÚ¯\u008c\nYd3¾ü\u0018©r\u008eÍY'\u001c\u0081Ù8¹bº\u008cï66PCû\u0087%ÕO\néS\u0013m¾\u0082Øù\u0002>¬F×\u0085qÊ\u009b<Å)oy\u008a·4å^\u001c\u0000cZW´\u001d\u000e\u0086h\u0089Ãj\u001d?wæÑ³+\u0097\u0086Eà\u001a:Ã\u0094½ï>I%£åýÜW\u0099²I\f\u0014fñÀ¿\u001bfu3Ï\u001c)Û\u0083ÆÞi8*\u0092ÿì¦GS¡Wû\u0005UÚ¯\u0083\n}d\u0012¾é\u0018®r\u0096ÍU'\u001a\u0081ìÛ¹6i\u0090'êõDÌù\u008b£\u0090M×÷\u000f\u0091L:£äÊ\u008e,(hÒB\u007f\u0091\u0019íÃ\u0000mb\u0016\u00ad°äZ'\u0004\u0014®K\u00adY÷Z\u0019\u000f£ÖÅ£ng°5Úê|³\u0086\u008d\u0000IZU´\u0000\u000eÚh\u0085Ãk\u001d#wáÑ¯+\u0096\u0086tà\t:Ô\u0094¹×h\u008dtc!Ùû¿¤\u0014JÊ\u0002 À\u0006\u008eü·QU7(íõC\u00988}\u009e\u0000tÒ*í\u0080´egÛ$±Ë\u0000DZl´2\u000eéh\u0084ÃN\u001d9wíÑ·\u0000cZW´\u001d\u000e\u0086h\u0081Ãu\u001d1wòÑ¯+\u0096\u0086\u001eà\f:Å\u0094®ïyI+£åý\u0096W\u0091²L\f\u0013f¶À\u0094\u001b\\u\u0002Ï9)Ô\u0083¾ÞI8=\u0092ç>ÙdÈ\u008a\u00930XV\u0019ýÝ#©I|ï,\u0015/¸ÄÞ\u0093\u0004[ª(Ñ÷w\u0091\u009d|Ã^i\u0011\u008cØ2\u009bXhþ7\u0000LZ]´\u0006\u000eÍh\u008cÃH\u001d<wéÑ¹+±\u0086^à\u001c:Å\u0094ªïcI<£éýÌW\u0099²I\f\ffÔÀ¹\u001b{u4Ï\u001d)Þ\u0083\u008dÞR\u0000LZ]´\u0006\u000eÍh\u008cÃH\u001d<wéÑ¹+ª\u0086Uà\u001f:Á\u0094ªïtI-£äýîW\u0099²L\f\u0005f÷À\u0091\u001b}u4Ï\u0017)Ý\u0083\u0089ÞT81\u0092óì\u0084Gi¡Kû\u0004UÍ¯\u008e\n}d\"É9\u0093(}sÇ¸¡ù\n=ÔI¾\u009c\u0018ÌâßO )jó´]ß&\u0001\u0080Xj\u00914\u009b\u009eì{9Åp¯\u0082\téÒ\u0014¼F\u0006yà Jó\u00170ñ_\u0000LZ]´\u0006\u000eÍh\u008cÃH\u001d<wéÑ¹+ª\u0086Uà\u001f:Á\u0094ªïtI-£äýîW\u0099²L\f\u0005f÷À\u009d\u001biu.Ï\r)Ñ\u0083\u0084Þl81\u0092ãì¼Ge¡Vû\u0015UÚ:Þ`Ã\u008e¦4YR\u0019ùè\u0000LZ]´\u0006\u000eÍh\u008cÃH\u001d<wéÑ¹+¶\u0086Qà\u001c:É\u0094®ïuI\t£ä\u000f,U;»f\u0001£gôÌ\u001f\u0012sx\u008eÞî$û\u0089+ïe5·\u009bÎ\u0000LZ]´\u0006\u000eÍh\u008cÃH\u001d<wéÑ¹+¶\u0086Qà\u001c:É\u0094®ïuI\t£äýôW\u0099²[\f\u0014fýÀ¾\u001bmu2\u0000LZ]´\u0006\u000eÍh\u008cÃH\u001d<wéÑ¹+µ\u0086Uà\f:É\u0094¹ïFI!£åýÏ\u0000AZ\\´\u0011\u000eØh\u0094Ã}\u001d\"wÆÑ¡+\u008c\u0086Yà\u001e:Å\u0094\u0099ïtI\f£áýÌW\u0091\u0000NZY´\u0004\u000eÁh\u0096Ã}\u001d\u0011wìÑ\u0096+\u0091\u0086Uà\u001f:è\u0094·ï|I,£åýÊ\u0000IZV´\u0004\u000eÍh\u0092Ãv\u001d1wäÑ\u008e+\u0099\u0086Dà\u0001:Ö\u0094½ïQI,£ÌýÑW\u0083²\\\f\u0005föÀµ\u001bz\u0000NZY´\u0004\u000eÁh\u0096Ã}\u001d\u0011wìÑ\u0081+\u009c\u0086Qà\u0018:Ô\u0094½ïbI\u0001£îýÌW\u0095²Z\f\u0006fùÀ³\u001bm\u0000NZY´\u0004\u000eÁh\u0096Ã}\u001d\u0011wìÑ\u0084+\u0099\u0086Dà\t:é\u0094¶ïdI-£òýÞW\u0091²K\f\u0005;¡a¶\u008fë5.Syø\u0092&þL\u0003êf\u0010y½«Ûâ\u0001=¯VÔ\u009crÓ\u0098\u0006Æ8lq\u0089\u008b7æ]\u0004ûK \u0082NÁôò\u0012-ý¢§µIèó-\u0095z>\u0091àý\u008a\u0000,eÖz{¨\u001dáÇ>iR\u0012\u009d´Ç^\t\u0003úYí·°\ruk\"ÀÉ\u001e¥tXÒ8(#\u0085åã¸9X\u0097\u0005ì×J\u0088 QþbT!±îä0¾'Pzê¿\u008cè'\u0003ùo\u0093\u00925íÏëb/\u0004eÞ¶pê\u000b\u0007\u00adEG\u008a\u0019£³àV3èl\u0000NZY´\u0004\u000eÁh\u0096Ã}\u001d\u0011wìÑ\u0096+\u0091\u0086Uà\u001f:â\u0094±ï~I,£åýÊW¹²F\f\u0014fýÀ¢\u001bnu!Ï\u001b)Õ\u0000AZ\\´4\u000eÉh\u0094ÃyÜ$\u00865hnÒ¥´ä\u001f ÁT«\u0081\rÑ÷ÑZ<<Iæ¦HÖ3\u0017ôÒ®Ã@\u0098úS\u009c\u00127Öé¢\u0083w%'ß$rÏ\u0014\u0098ÎP`#\u001bü½\u0097Wz\tp£\u0007FÓø\u0089\u0004Z^n°$\n¿l¬ÇO\u0019\u0000sÅÕ\u0080/ò\u0082mä\u007f>ô\u0090\u0084ëMM\u0018§ØùõS ¶~\b7b\u008fÄ\u008b\u001fPq\u0017Ë/-ì\u0087£Ú7<-\u0096Ìè\u0087C\\¥mÿ\u0019Qý«¸\u000eX`+ºÐ\u001c\u0097v¯Él##\u0085Øß\u00852\u007f\u0094\u0018îÜ@ö\u008e_ÔN:\u0015\u0080Þæ\u009fM[\u0093/ùú_ª¥©\bBn\u0015´Ý\u001a®aqÇ\u001a-÷sýÙ\u008a<^\u0082\u0004èÇNª\u0095hû'A\u000e§Í\r\u009ePA\u0000IZJ´\u001f\u000eÆh³Ãw\u001d%wúÑ£+\u009d\u0086qà\f:Ó\u0094\u009eï\u007fI:£íýÙW\u0084»\u001eá\u0005\u000fBµ\u009aÓÙx6¦MÌ°jÕ\u0090Ê=\n[[\u0000BZY´\u001e\u000eÆh\u0085Ãj\u001d\u0011wìÑ\u0092+\u009d\u0086Aà\u001d:Å\u0094«ïdÙ\u0084\u0083\u009fmØ×\u0000±C\u001a¬Ä×®*\bPòW_\u00939Ù\u0000cZW´\u001d\u000e\u0086h\u0095Ãv\u001d9wüÑ¹+Ë\u0086TàF:É\u0094ªï\u007fI&£óý×W\u0085²Z\f\u0003fýÀ±\u001blu3ÏV)Ò\u0083\u0089ÞN86\u0092õìºG.¡zû\u0011UÆ¯\u008e\n}d\"¾É\u0018¤r®ÍY'\r\u0081×\u0000\fZ\u0017´P\u000e\u0088hËÃ$\u001d_w¢ÑØ+ß\u0086\u001bàQ:¢\u0094ÿï-Ir£«ý\u0098WÛ²\u0014\u0000IZV´\u0004\u000eÍh\u0092Ãk\u001d$wáÑ´+\u0091\u0086Qà\u0004:á\u0094¼E\u008d\u001f\u0092ñÀK\t-V\u0086¯Xà2%\u0094pnUÃ\u0095¥À\u007f%Ñxª\u009d\fâæ\"¸\u0013Ì¿\u0096 xòÂ;¤d\u000f\u009dÑÒ»\u0017\u001dBçgJ§,òö\u0017XJ#ª\u0085×o\u00051:\u009bc~°Àóª\u001cuÃ/ÜÁ\u008e{G\u001d\u0018¶áh®\u0002k¤>^\u001bóÛ\u0095\u008eOká6\u009aÈ<§Ö{\u0088G\"\u001fÇÑy\u009e\u0000RZ]´\u0007\u000eÉh\u0092Ã|\u001d5wìÑ\u0081+\u009cµÎïÁ\u0001\u009b»UÝ\u000evà¨©Âpd\u001d\u009e\u00003åU\u009a\u008fZ!+\u0000RZ]´\u0007\u000eÉh\u0092Ã|\u001d5wìÑ\u0081+\u009c\u0086|à\u0001:Ó\u0094¬ïuI&£åýÊ\u0000RZ]´\u0007\u000eÉh\u0092Ã|\u001d5wìÑ\u0081+\u009c\u0086bà\r:Ñ\u0094\u00adïuI;£ô\u0000LZ]´\u0006\u000eÍh\u008cÃH\u001d<wéÑ¹+±\u0086^à\u001c:Å\u0094ªïcI<£éýÌW\u0099²I\f\ffÙÀ´\u0000LZ]´\u0006\u000eÍh\u008cÃH\u001d<wéÑ¹+±\u0086^à\u001c:Å\u0094ªïcI<£éýÌW\u0099²I\f\ffÙÀ´\u001bDu)Ï\u000b)Ä\u0083\u008dÞN8=\u0092â\u0007Õ]Ä³\u009f\tTo\u0015ÄÑ\u001a¥ppÖ ,3\u0081Ìç\u0086=X\u00933èíN´¤}ú`P\r\u0081\u0095Û\u00845ß\u008f\u0014éUB\u0091\u009cåö0P`ªs\u0007\u008caÆ»\u0018\u0015sn\u00adÈô\"=| ÖM3½\u008dÐç2A}\u009a´ô÷NÄ¨\u001b¸ÌâÝ\f\u0086¶MÐ\f{È¥¼Ïii9\u0093*>ÕX\u009f\u0082A,*Wô»ná\u007f\u000f$µïÓ®xj¦\u001eÌËj\u009b\u0090\u0093=\u007f[:\u0081ð/\u009fTAò\u0019\u0018ËFõì¼\tN·#ÝÎ{\u0093;~ao\u008f45ÿS¾øz&\u000eLÛê\u008b\u0010\u0083½oÛ*\u0001à¯\u008fÔQr\t\u0098ÛÆål¬\u0089^73]Þû\u0083 vN\u001bô9\u0012ö¸¿å|\u0003\u000f©Ð\u0000gZ]´\u0004\u000eøh\u008cÃy\u001d3wíÑ\u00ad+\u009d\u0086^à\u001c:î\u0094¹ï}I-\u0000gZ]´\u0004\u000eêh\u0081Ãv\u001d>wíÑ²+´\u0086Qà\u0011:Ï\u0094\u00adïdI\u0018£ìýÙW\u0093²M\f\rfýÀ¾\u001b|u\u000eÏ\u0019)Ý\u0083\u008dûÔ¡îO·õR\u0093>8Ûæ\u0091\u008c^*\u0000Ð8}ê\u001b´Á}o/\u0014Â²\u008fXR\u0006A¬0Iô÷½3@i}\u00875=À[¬ðI.\u0003DÌâ\u0092\u0018ªµxÓ&\tï§½ÜPz\u001d\u0090ÀÎÕd¸\u0081z?5UÜó\u009f(LF\u0013\u0000rZ]´\u001d\u000eÇh\u0096Ã}\u001d\u0019wåÑ°+\u008a\u0086Uà\u001b:Ó\u0094±ï\u007fI&£ÄýÙW\u0084²I\f,fñÀ£\u001b|u%Ï\u0016)Õ\u0083\u009a\u0000gZ]´\u0004\u000eäh\u0085Ãn\u001d5wäÑ\u0090+\u0094\u0086Qà\u0011:é\u0094µï`I:£åýËW\u0083²A\f\u000fföÀ\u0094\u001biu4Ï\u0019)ú\u0083\u009bÞO86¾räO\n\u0007°÷Ö\u0096}}£&É÷o\u0083\u0095\u00878B^\u0002\u0084ú*¦Qs÷)\u001döCØé\u0090\fR²\u001cØå~\u008f¥rË q\u001f\u0097Æ=\u0095`V\u00869Ýî\u0087Ái\u0081Ó[µ\n\u001eáÀ\u0080ªq\f*ö\u0001[À=¤çPI%2õ\u0094\u009d~q T\u008a\u001eoÑÑ\u008f»w\u001d%Æû¨²\u0012¨ôE^\u0007\u0003Èå¡Ob11\u009aî\u0000sZ]´\u0004\u000eæh\u0081Ãl\u001d9wþÑ¥+¹\u0086Tà$:É\u0094«ïdI-£îýÝW\u0082\u0000gZ]´\u0004\u000eûh\u0085Ãj\u001d&wíÑ²+¼\u0086Qà\u001c:Á", "ISO-8859-1", cArr, 0, 1642);
        f1296 = cArr;
        f1295 = 6349800095619045944L;
    }

    public bw(String str) {
        super(str);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1588(ImpressionDataListener impressionDataListener) {
        int i10 = f1297 + 63;
        f1294 = i10 % 128;
        int i11 = i10 % 2;
        m1602(impressionDataListener);
        if (i11 == 0) {
            int i12 = 58 / 0;
        }
        int i13 = f1294 + 41;
        f1297 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1592(AdData adData) {
        int i10 = f1297 + 39;
        f1294 = i10 % 128;
        if (i10 % 2 == 0) {
            m1604(adData);
            throw null;
        }
        String strM1604 = m1604(adData);
        f1297 = (f1294 + 81) % 128;
        return strM1604;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1595(IronSourceBannerLayout ironSourceBannerLayout) {
        int i10 = f1297 + 101;
        f1294 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1591(ironSourceBannerLayout);
        }
        m1591(ironSourceBannerLayout);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1605(ImpressionData impressionData) {
        int i10 = f1297 + 63;
        f1294 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1586(impressionData);
        }
        m1586(impressionData);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1590((char) View.MeasureSpec.makeMeasureSpec(0, 0), 16 - Color.argb(0, 0, 0, 0), 1398 - ImageFormat.getBitsPerPixel(0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bw.m1596((Placement) list.get(0));
            }
        });
        map.put(m1590((char) KeyEvent.getDeadChar(0, 0), 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1414 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bw.m1595((IronSourceBannerLayout) list.get(0));
            }
        });
        map.put(m1590((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 64435), 20 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1443 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bw.m1605((ImpressionData) list.get(0));
            }
        });
        map.put(m1590((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13089), 24 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1463 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bw.m1598((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1590((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 28, View.MeasureSpec.getSize(0) + 1489).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bw.m1588((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1590((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 30, 1517 - Color.alpha(0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bw.m1597((LevelPlayImpressionData) list.get(0));
            }
        });
        map.put(m1590((char) (48660 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 31 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1547 - Color.green(0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bw.m1599((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1590((char) (56733 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, (ViewConfiguration.getLongPressTimeout() >> 16) + 1577).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bw.m1606((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1590((char) View.resolveSize(0, 0), ExpandableListView.getPackedPositionType(0L) + 19, 1611 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bw.m1593((LevelPlayNativeAd) list.get(0), (LevelPlayNativeAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1590((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 13, TextUtils.indexOf("", "") + 1629).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bw.m1592((AdData) list.get(0));
            }
        });
        f1294 = (f1297 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return map;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1593(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        f1297 = (f1294 + 103) % 128;
        m1587(levelPlayNativeAd, levelPlayNativeAdListener);
        f1294 = (f1297 + 15) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1596(Placement placement) {
        int i10 = f1297 + 9;
        f1294 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1600(placement);
        }
        m1600(placement);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1606(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        f1297 = (f1294 + 45) % 128;
        m1589(levelPlayImpressionDataListener);
        int i10 = f1297 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1294 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f1297 = (f1294 + 29) % 128;
        try {
            try {
                String sdkVersion = LevelPlay.getSdkVersion();
                f1294 = (f1297 + 63) % 128;
                return sdkVersion;
            } catch (Throwable unused) {
                return IronSourceUtils.getSDKVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1597(LevelPlayImpressionData levelPlayImpressionData) {
        f1294 = (f1297 + 109) % 128;
        JSONObject jSONObjectM1601 = m1601(levelPlayImpressionData);
        int i10 = f1294 + 95;
        f1297 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObjectM1601;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1604(AdData adData) {
        f1297 = (f1294 + 47) % 128;
        String serverData = adData.getServerData();
        int i10 = f1297 + 89;
        f1294 = i10 % 128;
        if (i10 % 2 != 0) {
            return serverData;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        switch (str.hashCode()) {
            case -2063883567:
                if (str.equals(m1590((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Process.getGidForName("") + 19, 616 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    return LevelPlayMediaView.class;
                }
                return null;
            case -2054763962:
                if (str.equals(m1590((char) (ViewConfiguration.getLongPressTimeout() >> 16), 25 - TextUtils.getOffsetAfter("", 0), Color.alpha(0) + 591).intern())) {
                    return LevelPlayNativeAdListener.class;
                }
                return null;
            case -2044561387:
                if (str.equals(m1590((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (Process.myTid() >> 22) + 21, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 719).intern())) {
                    return NativeAdDataInterface.class;
                }
                return null;
            case -2012752057:
                if (str.equals(m1590((char) KeyEvent.getDeadChar(0, 0), 23 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0') + 1231).intern())) {
                    return LevelPlayInterstitialAd.class;
                }
                return null;
            case -1879025222:
                if (str.equals(m1590((char) View.resolveSize(0, 0), 9 - Color.argb(0, 0, 0, 0), 356 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    return DTBAdView.class;
                }
                return null;
            case -1810844504:
                if (str.equals(m1590((char) (ImageFormat.getBitsPerPixel(0) + 79), TextUtils.getOffsetBefore("", 0) + 20, AndroidCharacter.getMirror('0') + 1028).intern())) {
                    return BannerAdViewListener.class;
                }
                return null;
            case -1704786309:
                if (str.equals(m1590((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollBarSize() >> 8) + 20, TextUtils.indexOf("", "") + 90).intern())) {
                    return InterstitialActivity.class;
                }
                return null;
            case -1678289205:
                if (str.equals(m1590((char) (34924 - Color.blue(0)), KeyEvent.keyCodeFromString("") + 48, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42).intern())) {
                    return ControllerActivity.class;
                }
                return null;
            case -1555060867:
                if (str.equals(m1590((char) ((ViewConfiguration.getTapTimeout() >> 16) + 33241), 27 - (ViewConfiguration.getLongPressTimeout() >> 16), 1303 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    return LevelPlayRewardedAdListener.class;
                }
                return null;
            case -1406023077:
                if (str.equals(m1590((char) (AndroidCharacter.getMirror('0') + 38915), TextUtils.indexOf("", "", 0) + 50, 110 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    return InterstitialActivity.class;
                }
                return null;
            case -1282106699:
                if (str.equals(m1590((char) (1081 - TextUtils.getOffsetBefore("", 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, 894 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    return LevelPlayBannerAdView.class;
                }
                return null;
            case -1276273849:
                if (str.equals(m1590((char) (55073 - TextUtils.getOffsetAfter("", 0)), AndroidCharacter.getMirror('0') - 26, Color.argb(0, 0, 0, 0) + 335).intern())) {
                    return ImpressionDataListener.class;
                }
                return null;
            case -1115843213:
                if (!str.equals(m1590((char) ExpandableListView.getPackedPositionType(0L), 14 - View.getDefaultSize(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 321).intern())) {
                    return null;
                }
                f1294 = (f1297 + 77) % 128;
                return ImpressionData.class;
            case -1088585376:
                if (!str.equals(m1590((char) (36371 - Color.green(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 29, Color.rgb(0, 0, 0) + 16778160).intern())) {
                    return null;
                }
                f1297 = (f1294 + 17) % 128;
                return LevelPlayBannerAdViewListener.class;
            case -989825485:
                if (str.equals(m1590((char) View.resolveSize(0, 0), TextUtils.getOffsetBefore("", 0) + 19, (ViewConfiguration.getFadingEdgeLength() >> 16) + 634).intern())) {
                    return AdapterNativeAdData.class;
                }
                return null;
            case -838208757:
                if (str.equals(m1590((char) (Process.myPid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 18, Color.blue(0) + 653).intern())) {
                    return NativeAdViewHolder.class;
                }
                return null;
            case -643050252:
                if (str.equals(m1590((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 46, 176 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    return OpenUrlActivity.class;
                }
                return null;
            case -609786639:
                if (str.equals(m1590((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 10, View.MeasureSpec.makeMeasureSpec(0, 0) + 1171).intern())) {
                    return RewardedAd.class;
                }
                return null;
            case -559540471:
                if (!str.equals(m1590((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51572), TextUtils.indexOf("", "", 0, 0) + 30, TextUtils.indexOf((CharSequence) "", '0', 0) + 489).intern())) {
                    return null;
                }
                f1297 = (f1294 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
                return LevelPlayRewardedVideoListener.class;
            case -498709917:
                if (str.equals(m1590((char) (52470 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 21 - MotionEvent.axisFromString(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1128).intern())) {
                    return InterstitialAdListener.class;
                }
                return null;
            case -498060603:
                if (str.equals(m1590((char) (AndroidCharacter.getMirror('0') - '0'), (Process.myTid() >> 22) + 9, 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    return Placement.class;
                }
                return null;
            case -393802555:
                if (str.equals(m1590((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, 1195 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return RewardedAdListener.class;
                }
                return null;
            case -284636416:
                if (str.equals(m1590((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 14 - ImageFormat.getBitsPerPixel(0), KeyEvent.normalizeMetaState(0) + 1004).intern())) {
                    return BannerAdRequest.class;
                }
                return null;
            case -154075626:
                if (!str.equals(m1590((char) ((-16718722) - Color.rgb(0, 0, 0)), 21 - View.MeasureSpec.getSize(0), 803 - Process.getGidForName("")).intern())) {
                    return null;
                }
                f1294 = (f1297 + 3) % 128;
                return NativeAdSmashListener.class;
            case -153002112:
                if (!str.equals(m1590((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 45, 1031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    return null;
                }
                f1297 = (f1294 + 69) % 128;
                return BannerAdView.class;
            case 30304559:
                if (!str.equals(m1590((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 36 - KeyEvent.normalizeMetaState(0), 517 - MotionEvent.axisFromString("")).intern())) {
                    return null;
                }
                f1297 = (f1294 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
                return LevelPlayRewardedVideoManualListener.class;
            case 85893348:
                if (!str.equals(m1590((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.combineMeasuredStates(0, 0) + 973).intern())) {
                    return null;
                }
                f1297 = (f1294 + 55) % 128;
                return IronSourceAds.AdFormat.class;
            case 149942051:
                if (str.equals(m1590((char) (44304 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 10 - (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE).intern())) {
                    return IronSource.class;
                }
                return null;
            case 204617641:
                if (str.equals(m1590((char) (TextUtils.getOffsetAfter("", 0) + 1945), 18 - MotionEvent.axisFromString(""), 1284 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    return LevelPlayRewardedAd.class;
                }
                return null;
            case 204897024:
                if (str.equals(m1590((char) (Color.rgb(0, 0, 0) + 16807306), 21 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1150 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    return InterstitialAdRequest.class;
                }
                return null;
            case 307677661:
                if (str.equals(m1590((char) (View.MeasureSpec.getSize(0) + 47964), Process.getGidForName("") + 13, 992 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return BannerAdInfo.class;
                }
                return null;
            case 308060116:
                if (str.equals(m1590((char) (55750 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 12 - View.MeasureSpec.getMode(0), TextUtils.getOffsetAfter("", 0) + 1019).intern())) {
                    return BannerAdView.class;
                }
                return null;
            case 320151695:
                if (str.equals(m1590((char) (Process.myTid() >> 22), 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 1096).intern())) {
                    return InterstitialAd.class;
                }
                return null;
            case 334118616:
                if (!str.equals(m1590((char) (TextUtils.getOffsetBefore("", 0) + 16021), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, View.MeasureSpec.makeMeasureSpec(0, 0) + 397).intern())) {
                    return null;
                }
                f1297 = (f1294 + 91) % 128;
                return LevelPlayBannerListener.class;
            case 663296747:
                if (str.equals(m1590((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 23603), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    return ControllerActivity.class;
                }
                return null;
            case 766880816:
                if (str.equals(m1590((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 27 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 825).intern())) {
                    return NativeAdViewBinderInterface.class;
                }
                return null;
            case 779287609:
                if (str.equals(m1590((char) (14576 - Color.alpha(0)), 22 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionGroup(0L) + Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE).intern())) {
                    return IronSourceBannerLayout.class;
                }
                return null;
            case 823061407:
                if (str.equals(m1590((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 65003), (-16777199) - Color.rgb(0, 0, 0), 767 - (Process.myTid() >> 22)).intern())) {
                    return NativeAdInterface.class;
                }
                return null;
            case 846220331:
                if (str.equals(m1590((char) (47906 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.alpha(0) + 23, 1346 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    return LevelPlayImpressionData.class;
                }
                return null;
            case 894546539:
                if (str.equals(m1590((char) (ViewConfiguration.getTapTimeout() >> 16), 24 - KeyEvent.normalizeMetaState(0), TextUtils.getOffsetAfter("", 0) + 671).intern())) {
                    return InternalNativeAdListener.class;
                }
                return null;
            case 1052532031:
                if (str.equals(m1590((char) (46491 - Process.getGidForName("")), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, ExpandableListView.getPackedPositionType(0L) + 1181).intern())) {
                    return RewardedAdInfo.class;
                }
                return null;
            case 1069602180:
                if (str.equals(m1590((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, 695 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    return NativeAdAdapterInterface.class;
                }
                return null;
            case 1081984916:
                if (str.equals(m1590((char) (948 - (ViewConfiguration.getEdgeSlop() >> 16)), 19 - TextUtils.lastIndexOf("", '0', 0, 0), 784 - View.MeasureSpec.getMode(0)).intern())) {
                    return NativeAdLoadListener.class;
                }
                return null;
            case 1180349927:
                if (str.equals(m1590((char) (AndroidCharacter.getMirror('0') - '0'), 50 - (ViewConfiguration.getPressedStateDuration() >> 16), 242 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    return IronSourceBannerLayout.class;
                }
                return null;
            case 1226831433:
                if (str.equals(m1590((char) (ExpandableListView.getPackedPositionChild(0L) + 56425), TextUtils.indexOf("", "", 0, 0) + 15, 858 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    return LevelPlayAdInfo.class;
                }
                return null;
            case 1266525324:
                if (str.equals(m1590((char) (62622 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, KeyEvent.normalizeMetaState(0) + 873).intern())) {
                    return LevelPlayBannerAdView.class;
                }
                return null;
            case 1267145181:
                if (str.equals(m1590((char) (TextUtils.lastIndexOf("", '0', 0) + 17861), 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1111 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    return InterstitialAdInfo.class;
                }
                return null;
            case 1304950957:
                if (str.equals(m1590((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 38030), 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    return AbstractAdapter.class;
                }
                return null;
            case 1325013503:
                if (str.equals(m1590((char) (KeyEvent.keyCodeFromString("") + 15154), 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1368 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    return LevelPlayImpressionDataListener.class;
                }
                return null;
            case 1432059210:
                if (!str.equals(m1590((char) View.combineMeasuredStates(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 38, 449 - Color.blue(0)).intern())) {
                    return null;
                }
                f1297 = (f1294 + 33) % 128;
                return LevelPlayRewardedVideoAutomaticListener.class;
            case 1517126868:
                if (str.equals(m1590((char) (62405 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 15, 160 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    return OpenUrlActivity.class;
                }
                return null;
            case 1628896204:
                if (str.equals(m1590((char) (15344 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 28, 741 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    return NativeAdInteractionListener.class;
                }
                return null;
            case 1715808775:
                if (!str.equals(m1590((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 47232), KeyEvent.normalizeMetaState(0) + 15, 1330 - (Process.myPid() >> 22)).intern())) {
                    return null;
                }
                f1294 = (f1297 + 41) % 128;
                return LevelPlayReward.class;
            case 1773831812:
                if (str.equals(m1590((char) (3938 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, 576 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    return NativeAdLayout.class;
                }
                return null;
            case 1870849118:
                if (str.equals(m1590((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, 1213 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    return RewardedAdRequest.class;
                }
                return null;
            case 1910059890:
                if (str.equals(m1590((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 17 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 561).intern())) {
                    return LevelPlayNativeAd.class;
                }
                return null;
            case 1910219460:
                if (str.equals(m1590((char) (63945 - (ViewConfiguration.getPressedStateDuration() >> 16)), 19 - View.resolveSizeAndState(0, 0, 0), AndroidCharacter.getMirror('0') + 244).intern())) {
                    return BannerSmashListener.class;
                }
                return null;
            case 1955369613:
                if (str.equals(m1590((char) ExpandableListView.getPackedPositionType(0L), 6 - ExpandableListView.getPackedPositionType(0L), ((byte) KeyEvent.getModifierMetaStateMask()) + 853).intern())) {
                    return AdData.class;
                }
                return null;
            case 1955530641:
                if (str.equals(m1590((char) (15006 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.getOffsetBefore("", 0) + 6, View.MeasureSpec.getSize(0) + 554).intern())) {
                    return AdInfo.class;
                }
                return null;
            case 2019413793:
                if (str.equals(m1590((char) KeyEvent.keyCodeFromString(""), 30 - TextUtils.indexOf((CharSequence) "", '0', 0), 366 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    return DTBAdView.class;
                }
                return null;
            case 2019599576:
                if (str.equals(m1590((char) ((Process.getThreadPriority(0) + 20) >> 6), Color.rgb(0, 0, 0) + 16777245, Process.getGidForName("") + StatusLine.HTTP_MISDIRECTED_REQUEST).intern())) {
                    return LevelPlayInterstitialListener.class;
                }
                return null;
            case 2102577435:
                if (str.equals(m1590((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 32, 1253 - View.resolveSize(0, 0)).intern())) {
                    return LevelPlayInterstitialAdListener.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1598(ImpressionDataListener impressionDataListener) {
        int i10 = f1297 + 79;
        f1294 = i10 % 128;
        int i11 = i10 % 2;
        m1594(impressionDataListener);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f1294 + 3;
        f1297 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 26 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1599(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i10 = f1297 + 33;
        f1294 = i10 % 128;
        int i11 = i10 % 2;
        m1603(levelPlayImpressionDataListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m1586(ImpressionData impressionData) {
        int i10 = f1294 + 1;
        f1297 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject allData = impressionData.getAllData();
        if (i11 != 0) {
            int i12 = 86 / 0;
        }
        f1297 = (f1294 + 47) % 128;
        return allData;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m1589(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        f1294 = (f1297 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        LevelPlay.removeImpressionDataListener(levelPlayImpressionDataListener);
        f1297 = (f1294 + 39) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m1587(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        f1294 = (f1297 + 103) % 128;
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        int i10 = f1294 + 113;
        f1297 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1600(Placement placement) {
        int i10 = f1297;
        f1294 = (i10 + 31) % 128;
        if (placement == null) {
            return null;
        }
        int i11 = i10 + 95;
        f1294 = i11 % 128;
        if (i11 % 2 != 0) {
            return placement.getPlacementName();
        }
        placement.getPlacementName();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m1602(ImpressionDataListener impressionDataListener) {
        f1294 = (f1297 + 35) % 128;
        IronSource.removeImpressionDataListener(impressionDataListener);
        f1297 = (f1294 + 29) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject m1601(LevelPlayImpressionData levelPlayImpressionData) {
        f1294 = (f1297 + 63) % 128;
        JSONObject allData = levelPlayImpressionData.getAllData();
        f1294 = (f1297 + 13) % 128;
        return allData;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m1603(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        f1294 = (f1297 + 23) % 128;
        LevelPlay.addImpressionDataListener(levelPlayImpressionDataListener);
        int i10 = f1294 + 53;
        f1297 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1591(IronSourceBannerLayout ironSourceBannerLayout) {
        int i10 = f1297 + 35;
        f1294 = i10 % 128;
        int i11 = i10 % 2;
        String placementName = ironSourceBannerLayout.getPlacementName();
        if (i11 == 0) {
            int i12 = 71 / 0;
        }
        f1294 = (f1297 + 49) % 128;
        return placementName;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m1594(ImpressionDataListener impressionDataListener) {
        f1297 = (f1294 + 91) % 128;
        IronSource.addImpressionDataListener(impressionDataListener);
        int i10 = f1294 + 11;
        f1297 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1590(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f1296[i11 + i12] ^ (i12 * f1295)) ^ c10);
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
}

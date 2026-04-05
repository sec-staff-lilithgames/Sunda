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
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.UserDataManager;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.auction.AdSourceConfig;
import net.pubnative.lite.sdk.auction.Auction;
import net.pubnative.lite.sdk.auction.HyBidAdSource;
import net.pubnative.lite.sdk.auction.VastTagAdSource;
import net.pubnative.lite.sdk.banner.presenter.BannerPresenterFactory;
import net.pubnative.lite.sdk.banner.presenter.MraidAdPresenter;
import net.pubnative.lite.sdk.banner.presenter.VastAdPresenter;
import net.pubnative.lite.sdk.browser.BrowserManager;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastSender;
import net.pubnative.lite.sdk.interstitial.PNInterstitialAd;
import net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.MraidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.VastInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterDecorator;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterFactory;
import net.pubnative.lite.sdk.interstitial.presenter.MraidInterstitialPresenter;
import net.pubnative.lite.sdk.interstitial.presenter.VastInterstitialPresenter;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.models.AdExt;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.AdvertisingInfo;
import net.pubnative.lite.sdk.models.RemoteConfigAppInfo;
import net.pubnative.lite.sdk.models.VASTtag;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDInterstitial;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.presenter.AdPresenterDecorator;
import net.pubnative.lite.sdk.presenter.PresenterFactory;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedAd;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastSender;
import net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity;
import net.pubnative.lite.sdk.rewarded.activity.VastRewardedActivity;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterDecorator;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterFactory;
import net.pubnative.lite.sdk.rewarded.presenter.VastRewardedPresenter;
import net.pubnative.lite.sdk.views.HyBidAdView;
import net.pubnative.lite.sdk.views.HyBidBannerAdView;
import net.pubnative.lite.sdk.views.HyBidLeaderboardAdView;
import net.pubnative.lite.sdk.views.HyBidMRectAdView;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.PNAdView;
import net.pubnative.lite.sdk.views.PNBannerAdView;
import net.pubnative.lite.sdk.views.PNMRectAdView;
import net.pubnative.lite.sdk.views.PNWebView;
import net.pubnative.lite.sdk.visibility.ImpressionManager;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFiles;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.Vast;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.response.VastProcessor;
import net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class by extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1313 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1314 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1315 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1316;

    static {
        char[] cArr = new char[2355];
        com.google.android.gms.internal.play_billing.a.y("ë\u0011øªÌ\u000fÑ®¥\u0015ßtÌÛøbåÊ\u0091~¾ïªl\u0019¹\n\u0015>\u009d#\u0000W\u0080x?l¤\u0091K\u0085ñ¶WÚæÏcóóç\u008b\b\u0012\u0000I\u0013ç'd:ìNMaÁuO\u0088¯\u009c?¯´Ã)Ö\u008fê\u0016þc\u0011ë%s8Ò\u001c\u009b\u000f&;¬&\"R\u0084}\bi\u0081\u0094B\u0080ø³}ßÌÊ@öÔâ¹\u007fÙlvXßEi1Å\u001eX\nÇ÷;ã\u008bÐ-¼\u0092©\u0010\u0095\u0089\u0081ý\u0000H\u0013ó'V:÷NLaóuX\u0088\u0095\u009c?¯¯Ã\u0016Ö\u008dê\u001dÛ:È\u0087ü\u000bá\u0086\u0095\u0010º¿®7SëGXtå\u0018g\r÷1f%\rÊ\u0085\u0000A\u0013ÿ'w:êNAaÝuR_\u008bL\"x³e9\u0011\u0084>\t*¥×}Ãüð`\u009cÈ\u0089IµÅ¡®N7z\u0099g\b\u0013\u0080\u0000\t,\u0098ÙsÅâãFðóÄ~Ùü\u00adG\u0082ø\u0096Sk\u009d\u007f)L´ \u001c5\u0080\t\u001d\u001d}òâÆoÖ»Å\u0006ñ\u008aì\u0007\u0098\u0084·;£\u0081^YJØyD\u0015ì\u0000m<á(\u008aÇ\u0013Ú\u0015É¯ý,à¾\u0094\f»\u0080¯\u0019RÜFfuã\u0019R\fÞ0J$'\u0000H\u0013ó'V:÷NLaûuR\u0088²\u009c5¯¨Ã\u0017Ö\u009aê\u0011þv\u0011å%w8ÌLk_Ð\u0000H\u0013ó'V:÷NLaûuR\u0088²\u009c5¯¨Ã\u0017Ö\u009aê\u0011þv\u0011å%w8ÌLh_ÆsQ\u0086©\u009a6\u00ad¿Á\u0007Ô\u0083è\u000eüV\u000fë#{6ÇJE]Àq%\u0084¸\u009e\u009c\u008d'¹\u0082¤#Ð\u0098ÿ/ë\u0086\u0016f\u0002á1|]ÃHNtÅ`¢\u008f1»£¦\u0018Ò¼Á\u0012í\u0085\u0018}\u0004â3k_ÓJWvÚb\u0083\u0091?½¢¨\u0012Ô\u009dÃ\u0010\u0000P\u0013Ä']:ðN\\a×uN\u0088µ\u009c$¯³Ã\u0010Ö\u0087ê\u0019þn\u0011Í%r\u0000I\u0013ä'`:ûNZaÁuH\u0088¯\u009c$¯³Ã\u0005Ö\u0082ê(þp\u0011é%e8ÅLD_Às[\u0086º\u009a\u0016\u00ad¹Á\u0005Ô\u009fè\büe\u000fú#w6ÐVúEWqÓlH\u0018é7r#ûÞ\u001cÊ\u0097ù\u0000\u0095¶\u00801¼\u009b¨ÃGZsÖnv\u001a÷\ts%èÐ\tÌ§û\u000e\u0097¶\u00827¾¦ªÅYD\u0000M\u0013ø'u:÷NLaûuR\u0088²\u009c5¯¨Ã\u0017Ö\u009aê\u0011þv\u0011å%w8ÌLz_Æs[\u0086»\u009a7\u00ad²Á\u0012Ô\u0095è\búKéöÝzÀ÷´|\u009bÁ\u008fUr¾f?U´9\r,\u009a\u0010\u0011\u0004vëðßgÂí¶E¥Ì\u0089P|°`!Wµ;\u001e.\u009fïÌüMÈÂÕ\u0012¡ú\u008ee\u009aüg\ns\u0093@\f,¯9:\u0005¿\u0011\u008eþBÊÝ×v£í°8\u009cïi\u000eu\u009bBP.\u00ad;<\u0007¬\u0013Ãà^ÌÉÙt¥ç²`\u009e\u008bk\tw\u009aDRP«=3\tª\u0015ÍâDÎÑÛr§õ´4\u0080¨m\u0017y¶F+R¬?\u001f\u000b²\u0017ÞäUðÌÝw©æ¶q\u0082\u0092o\u0005{\u009bH,T\u008f!7\rV\u0019Áæ@òÕß~«é\u0000H\u0013ó'V:÷NLaûuR\u0088²\u009c5¯¨Ã\u0017Ö\u009aê\u0011þv\u0011å%w8ÌLk_×sJ\u0086¡\u009a$\u00adµÁ\u0012Ô\u0089êsùòÍ}Ð\u00ad¤E\u008bÚ\u009fCbµv,E³)\u0010<\u0085\u0000\u0000\u00141ûýÏbÒÉ¦Rµ\u0087\u0099Pl±p$Gï+\u0012>\u0083\u0002\u0013\u0016|åáÉvÜË X·ß\u009b4n¶r%AíU\u00148\u008c\f\u0015\u0010rçûËnÞÍ¢J±\u008b\u0085\u0012h£|*C\u0094W\u0013: \u000e\r\u0012aáêõsØÈ¬Y³Î\u0087-jº~$M\u0093Q0$\u0088\bé\u001c~ãÿ÷jÚÁ®V\u0000M\u0013ø'u:÷NLaûuR\u0088²\u009c5¯¨Ã\u0017Ö\u009aê\u0011þv\u0011å%w8ÌLk_×sJ\u0086¡\u009a$\u00adµÁ\u0012Ô\u0089\u0000n\u0013ï'`:°NXaÇu^\u0088¨\u009c1¯®Ã\rÖ\u0098ê\u001dþ,\u0011à%\u007f8ÔLO_\u009asM\u0086¬\u009a9\u00adòÁ\u000fÔ\u009eè\u000eüa\u000fü#k6ÖJE]Âq)\u0084«\u00988«ð¿\tÒ\u0091æ\búo\ræ!s4ÐHW[\u0096o\u0014\u0082\u00ad\u0096%©\u0094½#Ð\u009aä\nøm\u000bà\u001fo2ÒFYYÎm-\u0080¯\u00944§£»\u000fÎ\u0082âéö|\tý\u001dj0ÑaErøFt[ù/r\u0000Ï\u0014[é°ý1Îº¢\u0003·\u0094\u008b\u001f\u009fxpþDiYò-Z>Ó\u0012Dç\u00adû(Ì» \f\u0000A\u0013î2Ø!w\u0015É\bf|ÅSJ\u0000A\u0013î'Q:æN\\\u0000A\u0013î'F:ûN[aÂuS\u0088¨\u009c#¯¿ZHIç}k`ò\u0014S;Ï/\\Ò¼Æ0õ½\u0099\n\u008c®°\u001f¤mKêè$û\u0099Ï\u000fÒ\u0087¦*\u0089¡\u009d\t`ßtHGÊ+{>ÿ\u0002O\u0016\u0004ù\u008aÍ)Ð¸¤:·\u00adCÓPNdÂyO\rÙ\"V6Þ\u008dw\u009eâªo·íÃVìÞøo\u0005\u0099\u0011\u001d\u0000M\u0013Ø'U:×NlaûuR\u0088²\u009c5¯¨Ã\u0017Ö\u009aê\u0011þv\u0011å%w8Ì\u0000M\u0013Ø'U:×Nlaðu]\u0088¨\u009c>¯¿Ã\u0016\u0000A\u0013î'D:ìNMaÁuY\u0088¨\u009c$¯¿Ã\u0016Öªê\u001dþa\u0011ã%d8ÁL^_ÛsL\u0000P\u0013ø'q:íNMaÜuH\u0088£\u009c\"¯\u009cÃ\u0005Ö\u008dê\fþm\u0011þ%o\u0000H\u0013ó'V:÷NLaàuY\u0088±\u009c1¯¨Ã\u0000Ö\u008bê\u001cþC\u0011è\u0000H\u0013ó'V:÷NLaàuY\u0088±\u009c1¯¨Ã\u0000Ö\u008bê\u001cþ@\u0011þ%y8ÁLN_×s_\u0086»\u009a&\u00ad\u008eÁ\u0003Ô\u0093è\u001füm\u000fø#}6Ð±s¢È\u0096m\u008bÌÿwÐÛÄb9\u008a-\n\u001e\u0093r;g°['O{ Å\u0094B\u0089úýuîìÂd7\u0080+\u001d\u001c´p8e¥Y%MZ¾Ç\u0000R\u0013ï'c:ÿNZaÖuY\u0088¢\u009c\u0000¯¨Ã\u0001Ö\u009dê\u001dþl\u0011ø%s8ÒLn_Ñs]\u0086§\u009a \u00ad½Á\u0012Ô\u009fè\b»¥¨\u0018\u009c\u0094\u0081\bõ\u00adÚ!Î®3U'÷\u0014_xömjQêE\u009bª\u000f\u009e\u0084\u0083%÷\u009bä\"Èª=K!Ê\u0016Yzè\u0000V\u0013ë'g:êNza×uK\u0088§\u009c\"¯¾Ã\u0001Ö\u008aê(þp\u0011é%e8ÅLD_Às[\u0086º\u0099\u0095\u008a\u0014¾\u009b£K×£ø<ì¥\u0011S\u0005Ê6UZöOcsæg×\u0088\u001b¼\u0084¡/Õ´Æaê¶\u001fW\u0003Â4\tXïMnqöe\u009e\u0096\u0007º\u0087¯<Ó³ÄcèÚ\u001dR\u0001Û2L&åK`\u007fóc\u0084\u0094E¸©\u00ad&Ñ\u0097Â*öÝ\u001be\u000fÈ0l$ðI}}áa\u0096\u0092\r\u0086¦«>ß¿À(ôÉ\u0019\\\r×>`\u0000H\u0013ó'V:÷NLaàuY\u0088±\u009c1¯¨Ã\u0000Ö\u008bê\u001cþC\u0011ï%b8ÉL\\_ÝsJ\u0086±\u0000n\u0013ï'`:°NXaÇu^\u0088¨\u009c1¯®Ã\rÖ\u0098ê\u001dþ,\u0011à%\u007f8ÔLO_\u009asM\u0086¬\u009a9\u00adòÁ\u0014Ô\u0095è\rüe\u000fü#|6ÇJH]\u0098q!\u0084©\u0098 «·¿\u001eÒ\u009bæ\bú\u007f\r¾!L4ÅH][Ìo\u0010\u0082©\u0096!©\u0081½\u0018Ð\u0090ä\u001bøl\u000bÓ\u001f\u007f2ÒFYYÌm-\u0080º\u0094!\u009c\u009a\u008f'»«¦&Ò¶ý\u001bé\u0087\u0014k\u0000î3r_ÍJFvõb\u00ad\u008d4¹³¤\u001aÐ\u008fÃ\fï\u008b\u0000P\u0013Ä'U:úN~aÛuY\u0088±\u0000H\u0013ó'V:÷NLaóuX\u0088\u0090\u009c9¯¿Ã\u0013l]\u007fæKCVâ\"Y\rå\u0019Hä½ð+Ãª¯\u0003ºº\u0086\t\u0092A}ðIfTÂ\u0000H\u0013ó'V:÷NLaþuY\u0088§\u009c4¯¿Ã\u0016Ö\u008cê\u0017þc\u0011þ%r8áLN_âsW\u0086\u00ad\u009a%\u0000H\u0013ó'V:÷NLaÿun\u0088£\u009c3¯®Ã%Ö\u008aê.þk\u0011é%a\u0000P\u0013Ä'U:ÎNaañuS\u0088¨\u009c$¯¿Ã\nÖ\u009aê1þl\u0011ê%y8öLC_ÑsI\u0000P\u0013Ä'V:ÿNFaÜuY\u0088´\u009c\u0011¯¾Ã2Ö\u0087ê\u001dþu\u0001ò\u0012f&û;nOï`stê\u0089%\u009d\u0096®.Â¯×)ë\u00ad\u0011I\u0002Ý6Z+â_SpýdL\u0099º\u008d>\u0000V\u0013ã'p:ûNGaóuX\u0000V\u0013ã'p:ûNGaóuX\u0088\u008a\u009c9¯©Ã\u0010Ö\u008bê\u0016þg\u0011þY\u008fJ:~©c\"\u0017\u009e8*,\u0081ÑIÅàöf\u009aÊ×\bÄµð9í´\u0099&¶\u009e¢\r_ûKkx÷\u0014I\u0001ß=T\u0000P\u0013æ'u:çNMaÀuu\u0088¨\u009c6¯µ\u0000H\u0013ó'V:÷NLaûuR\u0088²\u009c5¯¨Ã\u0017Ö\u009aê\u0011þv\u0011å%w8ÌLk_Ðsr\u0086¡\u009a!\u00ad¨Á\u0003Ô\u009eè\u001füvè\u000fû´Ï\u0011Ò°¦\u000b\u0089§\u009d\u001e`ötvGï+G>Ì\u0002[\u0016\u0004ù¯Í\u001dÐ\u008e¤\u001e·\u0087\u009b\u001cnárpEé=\u0086.=\u001a\u0098\u00079s\u0082\\=H\u0096µ^¡÷\u0092qþÝël×ßÃ¿,6\u0018½\u0005\u0000q\u0081b\bPñCmwçjR\u001eé1r%öØ\"Ì\u0091ÿ3\u0093¨\u00868º©®ÂAGuÖhw\u0000A\u0013î'D:ÿNZaÓuQ\u0088µË¶Ø\u0003ì\u0091ñ\t\u0085\u008bª=¾²CRWÂdU\bè\u001db!ý5\u0090Ú:î\u0097ó3\u0087¾\u009eú\u008dO¹Ü¤WÐëÿ_ëô\u0016)\u0002\u00931\u0018]¼H0t»`Â\u008fL»ß¦~\u0000V\u0013ã'p:ûNGañuP\u0088¯\u009c3¯±Ã\u00178Û+~\u001få\u0002evÛY~MÌ°,¤§\u00977û\u009bî\u001eñ\u008bâ.ÖµË5¿\u008b\u0090.\u0084\u0086yomû^y2Å'H\u001b×\u0000C\u0013å'y:îNIaÜuU\u0088©\u009c>¶½¥\u001b\u0091\u0087\u008c\u0010ø·×\"Ã«>W*À\u0019euþ`c\u0097Ê\u0084l°ð\u00adgÙÀöUâÜ\u001f \u000b·8\u0010T\u0081A\u000e}\u0092ià\u0086Q²÷¯[ÛÌÈHäÐ\u0011)\u0000C\u0013å'y:îNIaÜuU\u0088©\u009c>¯\u0099Ã\bÖ\u0087ê\u001bþi\u0011Ø%d8ÁLI_ßsW\u0086¦\u009a5\u0000C\u0013ø'q:ÿN\\aÛuJ\u0088£¬4¿\u008f\u008b\u0006\u0096\u0088â+Í¬Ù=$Ô0Tâ1ñ\u009cÅ Ø\u008f¬>\u0083¯úÞécÝïÀb´á\u009b^\u008fçr!f\u00adU 9\u008f,\u0003\u0000M\u0013ï'p:÷NIaôuU\u0088ª\u009c53\u008a (\u0014·\t0}\u008eR3F\u0092»m¯ò\u009cn^ëMFyÍdR\u0010ù?i+ÖÖ\u001bÂ\u009bñ\r\u009d©\u0088$´£ ß3Ü a\u0014í\t`\u0000W\u0013ø'u:îNXa×uNùBêßÞSÃÞ·}\u0098Â\u008c|q³e#V\u009b:\"/³\u0000C\u0013ø'q:ÿN\\aÛuJ\u0088£\u009c\u0000¯»Ã\u0016Ö\u008fê\u0015þq\u0000g\u0013ï'`:ßNXaÂuh\u0088©\u009c;¯¿Ã\nÜ¯Ï?û\u0080æ=\u0092\u0099½\u0015©\u0088Td@ósx\u001fô\nA6Ú\"¡Í%ù\u0091ä\u0002Q/B³v<k\u0094\u001f\u001d0\u008a$\u0005ÙõÍMþâ\u0092t\u0087Û»W¯*@µt$i\u0099\u001d\u0004ÒÊÁBõÍèr\u009cá³U§âZ\u0004N\u0093»¡¨)\u009c¦\u0081\u0019õ\u008aÚ7Î\u00883e'÷\u0014hxËm^QÛE\u008dª.\u0000g\u0013ï'`:ßNLaäu]\u0088µ\u009c$\u0086\u0080\u0095\b¡\u0087¼8È«ç\u000fó´\u000eO\u001aÒ)tEç\u0017ý\u0004u0ú-EYÖvebÃ\u009f(\u008b«8ú+r\u001fý\u0002BvÑYnMÒ°(¤¨\u00973\u0000g\u0013ï'`:ßNLaðuY\u0088§\u009c3¯µÃ\nÖ\u009d\u0000g\u0013ï'`:ßNLaóuO\u0088µ\u009c5¯®Ã1Ö\u009cê\u0014\u0000g\u0013ï'`:ßNLaöu]\u0088²\u009c1¯\u0092Ã\u0010Ö\u0083ê\u0014\u0000g\u0013ï'`:ßNLaöu]\u0088²\u009c1¯\u0090Ã\u0017\u0000g\u0013ï'`:ßNLaöu]\u0088²\u009c1¯\u008fÃ\u0016Ö\u0082\u0000g\u0013ï'`:ßNLaöu]\u0088²\u009c1¯\u0089Ã\u0010Ö\u009cê\u0011þl\u0011ë%P8ÉLO_ØsZÊCÙØíQðß\u0084|«÷¿HB¤V&e\u0093\t \u001c« 74cÛÈïzòé\u0086y\u0095à¹{L\u0086P\u0017g\u008e\"Ó1[\u0005Ô\u0018kløCVWéª\u0000¾\u0085\u008d\u0003á£ô\tÈ¸ÜÄ3Q\u0007Ì\u001asmØ~PJßW`#ó\f]\u0018âå\u000bñ\u008eÂ\b®¨»\u0018\u0087£\u0000g\u0013ï'`:ßNLaâu]\u0088´\u009c1¯·Ã\u0017Ö¸ê\u0011þf\u0011é%y8òLO_ÐsW\u0086º\u009a7\u00ad¿Á\u0012Ô¥è\büh\u0000g\u0013ï'`:ßNLaâu]\u0088´\u009c1¯·Ã\u0017Ö«ê\u0016þf\u0011Ï%w8ÒLN_æs[\u0086¬\u009a;\u00ad®Á\u0003Ô\u0093è\u000eüQ\u000fü#t\u0000g\u0013ï'`:ßNLaâu]\u0088´\u009c1¯·Ã\u0017Ö¸ê\u0011þf\u0011é%y8ãLF_Ýs]\u0086£\u009a!\u0000g\u0013ï'`:ßNLaâu]\u0088´\u009c1¯·Ã\u0017Ö«ê\u0016þf\u0011Ï%w8ÒLN_÷sR\u0086¡\u009a1\u00ad·Á\u0015\u009bú\u0088r¼ý¡BÕÑú\u007fîÀ\u0013)\u0007¬4*X\u008aM%q\u008ceû\u008at¾ä£{×ÞÄEèÆ\u001d\u0000\u0001½6-Z\u0088O!s\u008egê\u0094g\u0000g\u0013ï'`:ßNLaâu]\u0088´\u009c1¯·Ã\u0017Ö«ê\u0016þf\u0011Ï%w8ÒLN_ásL\u0086¤\u009a\u001e\u00adµÁ\u0015Ô\u0084ø0ë¸ß7Â\u0088¶\u001b\u0099µ\u008d\npãdfWà;@\u0000g\u0013ï'`:ÈNAaÖuY\u0088©\u009c\u0013¯¶Ã\rÖ\u008dê\u0013þq\u0011Ï%z8ÉLI_ßsj\u0086 \u009a \u00ad³Á\u0013Ô\u0097è\u0012í\u0012þ\u009aÊ\u0015×½£4\u008c£\u0098,eÜqfBÃ.x;ø\u0007f\u0013\u0004üºÈ\u000fÕ¼¡<²ª\u009e\u001fkÏwF@Ê,x9ì\u0005a\u0011\u0016â·Î\u0004Û¤§-z\fi\u0084]\u000b@¶4,\u001b´\u000f'òÌæUÕØ¹`¬ë\u0090P\u0084\u0005k\u008e_\u001eB 6\u0015%·\t'üÌàL×Ð»eÍgÞïê`÷Ý\u0083Z¬×¸]E²Q9b¬\u000e\u0001\u001b\u00ad'\u00173oÜüèwõÎ\u0081C\u0092Û¾PK\u0089W6`¯%Ò6Z\u0002Õ\u001fbkóDkPà\u00ad\u001d¹\u0080\u008a,æ£ó>Ï¬ÛÃ4P\u0000Õ\u001dpiì\u0000g\u0013ï'`:ÈNIaÁuH\u0088\u0087\u009c4¯\u0089Ã\u000bÖ\u009bê\nþa\u0011é%U8ÒLO_ÕsJ\u0086¡\u009a$\u00ad¹Á\u0015\u007fDlÌXCEð1n\u001eõ\nv÷\u0084ã5Ð\u0090¼+©¨\u0095\u000f\u0081Dn×ZAÕ&Æ®ò!ï\u008c\u009b\u001d´\u0092 \t]îIrzÉ\u0016@\u0003Ü?V+6Ä¿ð4í\u0084\u0099?\u008a\u0090¦\u0007Sý\u0000g\u0013ï'`:ÍN\\aÓuH\u0088¯\u009c3¯\u0088Ã\u0001Ö\u009dê\u0017þw\u0011þ%u8ÅLi_Æs[\u0086©\u009a&\u00adµÁ\u0010Ô\u0095è.ü}\u000fþ#}\u0000g\u0013ï'`:ÉNZaÓuL\u0088¶\u009c5¯¨Ã'Ö\u009cê\u001dþc\u0011ø%\u007f8ÖLO_Ç\u0000g\u0013ï'`:ÉNZaÓuL\u0088¶\u009c5¯¨Ã2Ö¯ê+þV\u0011Í%r8ôLK_Ósk\u0086\u009a\u009a\u001b\u0000g\u0013ï'`:ÝNZa×u]\u0088²\u009c9¯¬Ã\u0001Ö¾ê\u0019þp\u0011í%{8ÓLi_Æs[\u0086©\u009a&\u00adµÁ\u0010Ô\u0095è>üe\u000fú#y\u0000g\u0013ï'`:ÝNZa×u]\u0088²\u009c9¯¬Ã\u0001Ö¾ê\u0019þp\u0011í%{8ÓLo_ÚsH\u0086¡\u009a \u00ad³Á\bÔ\u009dè\u001füj\u000fú#N6ÃJ^]Å", "ISO-8859-1", cArr, 0, 2355);
        f1313 = cArr;
        f1314 = -6809736618199477366L;
    }

    public by(String str) {
        super(str);
    }

    /* renamed from: 爫, reason: contains not printable characters */
    private static List<String> m1611(AdParams adParams) {
        int i10 = f1316 + 101;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            adParams.getEndCardUrlList();
            throw null;
        }
        List<String> endCardUrlList = adParams.getEndCardUrlList();
        f1315 = (f1316 + 1) % 128;
        return endCardUrlList;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static String m1612(AdParams adParams) {
        int i10 = f1316 + 91;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return adParams.getVideoRedirectUrl();
        }
        adParams.getVideoRedirectUrl();
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static List<String> m1613(AdParams adParams) {
        f1316 = (f1315 + 11) % 128;
        List<String> endCardClicks = adParams.getEndCardClicks();
        int i10 = f1316 + 79;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 98 / 0;
        }
        return endCardClicks;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static List<String> m1614(AdParams adParams) {
        f1315 = (f1316 + 55) % 128;
        List<String> videoClicks = adParams.getVideoClicks();
        int i10 = f1316 + 31;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 65 / 0;
        }
        return videoClicks;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static List<String> m1615(AdParams adParams) {
        int i10 = f1316 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            adParams.getVideoFileUrlsList();
            throw null;
        }
        List<String> videoFileUrlsList = adParams.getVideoFileUrlsList();
        f1315 = (f1316 + 67) % 128;
        return videoFileUrlsList;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static String m1616(AdParams adParams) {
        f1315 = (f1316 + 85) % 128;
        String endCardRedirectUrl = adParams.getEndCardRedirectUrl();
        int i10 = f1316 + 51;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return endCardRedirectUrl;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static String m1617() {
        f1316 = (f1315 + 5) % 128;
        String appToken = HyBid.getAppToken();
        int i10 = f1316 + 13;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 0 / 0;
        }
        return appToken;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ List m1622(AdParams adParams) {
        f1315 = (f1316 + 97) % 128;
        List<String> listM1611 = m1611(adParams);
        int i10 = f1316 + 19;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM1611;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ List m1624(AdParams adParams) {
        f1316 = (f1315 + 107) % 128;
        List<String> listM1615 = m1615(adParams);
        int i10 = f1316 + 39;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 72 / 0;
        }
        return listM1615;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ String m1625() {
        f1315 = (f1316 + 73) % 128;
        String strM1617 = m1617();
        int i10 = f1316 + 11;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1617;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ List m1629(AdParams adParams) {
        f1315 = (f1316 + 19) % 128;
        List<String> listM1613 = m1613(adParams);
        int i10 = f1315 + 3;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return listM1613;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1633(StaticResource staticResource) {
        f1315 = (f1316 + 45) % 128;
        String strM1667 = m1667(staticResource);
        f1316 = (f1315 + 67) % 128;
        return strM1667;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1642(AdData adData) {
        int i10 = f1315 + 61;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1678(adData);
        }
        m1678(adData);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1652(Ad ad2) {
        int i10 = f1315 + 1;
        f1316 = i10 % 128;
        int i11 = i10 % 2;
        String strM1621 = m1621(ad2);
        if (i11 != 0) {
            int i12 = 37 / 0;
        }
        f1315 = (f1316 + 87) % 128;
        return strM1621;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ e m1662(by byVar, VideoAdListener videoAdListener, ch chVar) {
        f1316 = (f1315 + 91) % 128;
        e eVarM1663 = byVar.m1663(videoAdListener, chVar);
        int i10 = f1316 + 59;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return eVarM1663;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1677(Ad ad2) {
        f1315 = (f1316 + 35) % 128;
        String strM1623 = m1623(ad2);
        f1316 = (f1315 + 39) % 128;
        return strM1623;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static String m1618(Ad ad2) {
        int i10 = f1316 + 79;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return ad2.getVast();
        }
        ad2.getVast();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static String m1621(Ad ad2) {
        f1316 = (f1315 + 17) % 128;
        String creativeId = ad2.getCreativeId();
        f1315 = (f1316 + 73) % 128;
        return creativeId;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m1623(Ad ad2) {
        f1315 = (f1316 + 29) % 128;
        String zoneId = ad2.getZoneId();
        int i10 = f1315 + 103;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return zoneId;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m1626(Ad ad2, String str) {
        f1316 = (f1315 + 71) % 128;
        String assetUrl = ad2.getAssetUrl(str);
        int i10 = f1316 + 91;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 68 / 0;
        }
        return assetUrl;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static AdData m1630(Ad ad2, String str) {
        f1316 = (f1315 + 19) % 128;
        AdData asset = ad2.getAsset(str);
        f1315 = (f1316 + 81) % 128;
        return asset;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1635(AdParams adParams) {
        f1316 = (f1315 + 33) % 128;
        String strM1612 = m1612(adParams);
        int i10 = f1315 + 83;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1612;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1643(AdData adData, String str) {
        f1316 = (f1315 + 19) % 128;
        String strM1632 = m1632(adData, str);
        f1316 = (f1315 + 93) % 128;
        return strM1632;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1653(Ad ad2, String str) {
        f1316 = (f1315 + 65) % 128;
        String strM1626 = m1626(ad2, str);
        f1315 = (f1316 + 11) % 128;
        return strM1626;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1665(Ad ad2) {
        int i10 = f1316 + 93;
        f1315 = i10 % 128;
        int i11 = i10 % 2;
        String strM1618 = m1618(ad2);
        if (i11 == 0) {
            int i12 = 15 / 0;
        }
        return strM1618;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1679(MediaFile mediaFile) {
        int i10 = f1315 + 91;
        f1316 = i10 % 128;
        if (i10 % 2 != 0) {
            m1644(mediaFile);
            throw null;
        }
        String strM1644 = m1644(mediaFile);
        int i11 = f1316 + 55;
        f1315 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM1644;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static List<AdData> m1620(Ad ad2, String str) {
        f1316 = (f1315 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        List<AdData> beacons = ad2.getBeacons(str);
        int i10 = f1316 + 91;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return beacons;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m1627(AdParams adParams) {
        f1316 = (f1315 + 51) % 128;
        String adParams2 = adParams.getAdParams();
        f1316 = (f1315 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        return adParams2;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static String m1628(AdData adData) {
        int i10 = f1316 + 53;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return adData.getURL();
        }
        adData.getURL();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m1636(Ad ad2, String str) {
        f1315 = (f1316 + 63) % 128;
        List<AdData> listM1620 = m1620(ad2, str);
        f1316 = (f1315 + 67) % 128;
        return listM1620;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1646(CreativeParams creativeParams) {
        int i10 = f1316 + 53;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            m1634(creativeParams);
            throw null;
        }
        String strM1634 = m1634(creativeParams);
        f1316 = (f1315 + 103) % 128;
        return strM1634;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1654(AdData adData) {
        int i10 = f1315 + 33;
        f1316 = i10 % 128;
        if (i10 % 2 != 0) {
            m1628(adData);
            throw null;
        }
        String strM1628 = m1628(adData);
        int i11 = f1315 + 3;
        f1316 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 65 / 0;
        }
        return strM1628;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1666(AdData adData) {
        f1315 = (f1316 + 85) % 128;
        String strM1631 = m1631(adData);
        int i10 = f1315 + 65;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1631;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1680(StaticResource staticResource) {
        f1315 = (f1316 + 43) % 128;
        String strM1645 = m1645(staticResource);
        int i10 = f1316 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1645;
        }
        throw null;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends VideoAdListener implements hc<VideoAdListener> {

        /* renamed from: ﭖ, reason: contains not printable characters */
        private static int f1355 = 1;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static short[] f1357 = null;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f1358 = -584027865;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f1360 = 0;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f1361 = -144942445;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f1362 = 89;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private VideoAdListener f1364;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private ch f1365;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static byte[] f1356 = {-58, 0, 14, 2, 0, -18, 34, -17, 3, -14, 35, -24, 35, -45, -1, 65, -68, 13, -9, 9, -15, 1, 10, 29, -24, 35, -46, 10, 1, -5, 19, -61, 3, 8, 27, -30, 3, -14, 35, -24, 35, -45, -1, 65, -68, 13, -9, 9, -15, 1, 10, 29, -24, 35, -46, 10, 1, -5, 19, -62, -1, -15, 2, 17, -19, 33, -17, 35, -45, -1, 65, -68, 13, -9, 9, -15, 1, 10, 29, -24, 35, -46, 10, 1, -5, 19, -62, -1, -6, 8, -6, -3, 41, -33, 35, -45, -1, 65, -68, 13, -9, 9, -15, 1, 10, 29, -24, 35, -46, 10, 1, -5, 19, -58, -10, 41, -35, 5, 2, -4, 19, -18, -5, 37, -32, 35, -45, -1, 65, -68, 13, -9, 9, -15, 1, 10, 29, -24, 35, -46, 10, 1, -5, 19, -54, 8, 7, 21, -17, -14, 17, 30, -33, -10, 41, -40, -2, -5, 1, -2, 50, -43, -1, 65, -68, 13, -9, 9, -15, 1, 10, 29, -24, 35, -46, 10, 1, -5, 19, -51, -10, -7, 6, 41, -30, -14, 17, 30, -33, -10, 41, -40, -2, -5, 1, -2, 50, -33, 35, -45, -1, 65, -68, 13, -9, 9, -15, 1, 10, 29, -24, 35, -46, 10, 1, -5, 19, -56, 3, 8, 27, -30, 3, -14, 35, -24, -14, 17, 30, -33, -10, 41, -41, -1, 65, -68, 13, -9, 9, -15, 1, 10, 29, -24, 35, -46, 10, 1, -5, 19};

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int[] f1359 = {939213787, -580340080, -1566692816, 644381725, 1553210343, 484788871, 1623657751, 998203890, -1376132022, -201857803, -567488946, -2110397265, -181864720, 2082142435, -1881948138, -1211318802, -455504042, 436733505};

        public e(VideoAdListener videoAdListener, ch chVar) {
            this.f1364 = videoAdListener;
            this.f1365 = chVar;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private VideoAdListener m1688() {
            int i10 = f1355;
            VideoAdListener videoAdListener = this.f1364;
            int i11 = i10 + 71;
            f1360 = i11 % 128;
            if (i11 % 2 == 0) {
                return videoAdListener;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m1689(int[] iArr, int i10) {
            String str;
            synchronized (d.f1845) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f1359.clone();
                    d.f1846 = 0;
                    while (true) {
                        int i11 = d.f1846;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            char c10 = (char) (i12 >> 16);
                            cArr[0] = c10;
                            char c11 = (char) i12;
                            cArr[1] = c11;
                            char c12 = (char) (iArr[i11 + 1] >> 16);
                            cArr[2] = c12;
                            char c13 = (char) iArr[i11 + 1];
                            cArr[3] = c13;
                            d.f1844 = (c10 << 16) + c11;
                            d.f1847 = (c12 << 16) + c13;
                            d.m2179(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = d.f1844 ^ iArr2[i13];
                                d.f1844 = i14;
                                int iM2178 = d.m2178(i14) ^ d.f1847;
                                int i15 = d.f1844;
                                d.f1844 = iM2178;
                                d.f1847 = i15;
                            }
                            int i16 = d.f1844;
                            int i17 = d.f1847;
                            d.f1844 = i17;
                            d.f1847 = i16;
                            int i18 = i16 ^ iArr2[16];
                            d.f1847 = i18;
                            int i19 = i17 ^ iArr2[17];
                            d.f1844 = i19;
                            cArr[0] = (char) (i19 >>> 16);
                            cArr[1] = (char) i19;
                            cArr[2] = (char) (i18 >>> 16);
                            cArr[3] = (char) i18;
                            d.m2179(iArr2);
                            int i20 = d.f1846;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            d.f1846 = i20 + 2;
                        } else {
                            str = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m1690(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (n.f3160) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f1362;
                    int i14 = i10 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f1356;
                        i14 = bArr != null ? (byte) (bArr[f1361 + i11] + i13) : (short) (f1357[f1361 + i11] + i13);
                    }
                    if (i14 > 0) {
                        n.f3165 = ((i11 + i14) - 2) + f1361 + i15;
                        n.f3163 = b10;
                        char c10 = (char) (i12 + f1358);
                        n.f3162 = c10;
                        sb2.append(c10);
                        n.f3161 = n.f3162;
                        n.f3164 = 1;
                        while (n.f3164 < i14) {
                            byte[] bArr2 = f1356;
                            if (bArr2 != null) {
                                int i16 = n.f3165;
                                n.f3165 = i16 - 1;
                                n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                            } else {
                                short[] sArr = f1357;
                                int i17 = n.f3165;
                                n.f3165 = i17 - 1;
                                n.f3162 = (char) (n.f3161 + (((short) (sArr[i17] + s10)) ^ n.f3163));
                            }
                            sb2.append(n.f3162);
                            n.f3161 = n.f3162;
                            n.f3164++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }

        public void onAdClicked() {
            f1360 = (f1355 + 25) % 128;
            by.this.m1169(this, this.f1365, m1690(TextUtils.indexOf("", "", 0) - 90, (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), Color.rgb(0, 0, 0) + 161719747, (byte) (Process.myPid() >> 22), 584027951 - Color.red(0)).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                f1360 = (f1355 + 13) % 128;
                videoAdListener.onAdClicked();
            }
        }

        public void onAdCustomEndCardFound() {
            f1355 = (f1360 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            by.this.m1169(this, this.f1365, m1690((-90) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 144942624 - TextUtils.indexOf("", ""), (byte) Color.red(0), 584027950 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                f1360 = (f1355 + 13) % 128;
                videoAdListener.onAdCustomEndCardFound();
                f1360 = (f1355 + 1) % 128;
            }
        }

        public void onAdDidReachEnd() {
            f1355 = (f1360 + 21) % 128;
            by.this.m1169(this, this.f1365, m1690((-91) - TextUtils.lastIndexOf("", '0'), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.green(0) + 144942558, (byte) ((-1) - MotionEvent.axisFromString("")), ((byte) KeyEvent.getModifierMetaStateMask()) + 584027952).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i10 = f1355 + 37;
                f1360 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onAdDidReachEnd();
                if (i11 != 0) {
                    throw null;
                }
            }
            int i12 = f1360 + 109;
            f1355 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }

        public void onAdDismissed() {
            f1355 = (f1360 + 73) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, -311394025, -1973429101, 576639838, -1173026891, -830317484, 2052191369, -2004309470, -833450549}, 29 - View.combineMeasuredStates(0, 0)).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                videoAdListener.onAdDismissed();
            }
            f1355 = (f1360 + 11) % 128;
        }

        public void onAdExpired() {
            f1360 = (f1355 + 39) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, -311394025, -1973429101, -1784051366, -1182277992, 1879770121, 1514650601}, TextUtils.getOffsetAfter("", 0) + 27).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                videoAdListener.onAdExpired();
                f1355 = (f1360 + 19) % 128;
            }
        }

        public void onAdLoadFail(PlayerInfo playerInfo) {
            f1355 = (f1360 + 115) % 128;
            by.this.m1169(this, this.f1365, m1690((-90) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) (AndroidCharacter.getMirror('0') - '0'), Process.getGidForName("") + 144942477, (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 584027951 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), playerInfo);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                videoAdListener.onAdLoadFail(playerInfo);
                f1355 = (f1360 + 55) % 128;
            }
        }

        public void onAdLoadSuccess() {
            by.this.m1169(this, this.f1365, m1690(View.combineMeasuredStates(0, 0) - 90, (short) (Process.myPid() >> 22), 144942445 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) Drawable.resolveOpacity(0, 0), Color.alpha(0) + 584027951).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i10 = f1360 + 115;
                f1355 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onAdLoadSuccess();
                if (i11 == 0) {
                    throw null;
                }
            }
            int i12 = f1355 + 99;
            f1360 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 89 / 0;
            }
        }

        public void onAdSkipped() {
            f1355 = (f1360 + 69) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, -311394025, -1973429101, -2107819289, -716408852, 1250663745, 1072134780}, 27 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                videoAdListener.onAdSkipped();
            }
            int i10 = f1355 + 49;
            f1360 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public void onAdStarted() {
            f1360 = (f1355 + 77) % 128;
            by.this.m1169(this, this.f1365, m1690((ViewConfiguration.getLongPressTimeout() >> 16) - 90, (short) TextUtils.getOffsetAfter("", 0), 144942503 - ExpandableListView.getPackedPositionChild(0L), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 584027950).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                videoAdListener.onAdStarted();
                f1360 = (f1355 + 107) % 128;
            }
        }

        public void onCustomCTACLick(boolean z10) {
            f1360 = (f1355 + 97) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 1481075777, -31121084, -936772139, 317960317, 277504261, -1364773198, -245864811, -1626857594}, MotionEvent.axisFromString("") + 33).intern(), Boolean.valueOf(z10));
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i10 = f1355 + 97;
                f1360 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onCustomCTACLick(z10);
                if (i11 != 0) {
                    throw null;
                }
            }
        }

        public void onCustomCTALoadFail() {
            f1355 = (f1360 + 53) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 1481075777, -31121084, -936772139, 317960317, -1513806524, 2049809152, 1503611873, 1322356701, -327602717, -1218832200}, 35 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i10 = f1355 + 61;
                f1360 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onCustomCTALoadFail();
                if (i11 != 0) {
                    throw null;
                }
            }
            f1355 = (f1360 + 25) % 128;
        }

        public void onCustomCTAShow() {
            f1360 = (f1355 + 9) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 1481075777, -31121084, -936772139, 317960317, 98521060, -606364628, 1514241374, -1419997118}, 31 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                f1360 = (f1355 + 47) % 128;
                videoAdListener.onCustomCTAShow();
                f1355 = (f1360 + 53) % 128;
            }
        }

        public void onCustomEndCardClick(String str) {
            f1360 = (f1355 + 73) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 1481075777, -31121084, -936772139, 317960317, 1086086034, 1484446967, -649114445, 1408318090, -1257246111, 665678114}, 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), str);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                videoAdListener.onCustomEndCardClick(str);
                f1360 = (f1355 + 109) % 128;
            }
            f1360 = (f1355 + 99) % 128;
        }

        public void onCustomEndCardShow(String str) {
            f1360 = (f1355 + 57) % 128;
            by.this.m1169(this, this.f1365, m1690(MotionEvent.axisFromString("") - 89, (short) (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 144942588, (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 584027952 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), str);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i10 = f1360 + 25;
                f1355 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onCustomEndCardShow(str);
                if (i11 == 0) {
                    throw null;
                }
            }
        }

        public void onDefaultEndCardClick(String str) {
            f1355 = (f1360 + 99) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 642414011, -84571454, 55182382, -1585862397, -1470890030, -792046111, -816336688, 903316208, -1794012682, -1081103121, 944161398, 1140352251}, TextUtils.lastIndexOf("", '0', 0) + 38).intern(), str);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i10 = f1360 + 29;
                f1355 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onDefaultEndCardClick(str);
                if (i11 == 0) {
                    int i12 = 18 / 0;
                }
            }
        }

        public void onDefaultEndCardShow(String str) {
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 642414011, -84571454, 55182382, -1585862397, -1470890030, -792046111, -816336688, 903316208, 2028638640, -41119860}, 36 - View.combineMeasuredStates(0, 0)).intern(), str);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i10 = f1355 + 35;
                f1360 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onDefaultEndCardShow(str);
                if (i11 != 0) {
                    throw null;
                }
                f1355 = (f1360 + 39) % 128;
            }
        }

        public void onEndCardClosed(Boolean bool) {
            f1360 = (f1355 + 9) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 860157695, -1198357486, -105724731, -1853711581, -2030937648, 242398801, -1734980099, -67523894}, 31 - Drawable.resolveOpacity(0, 0)).intern(), bool);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                f1355 = (f1360 + 23) % 128;
                videoAdListener.onEndCardClosed(bool);
            }
        }

        public void onEndCardLoadFail(Boolean bool) {
            f1355 = (f1360 + 27) % 128;
            by.this.m1169(this, this.f1365, m1690((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 90, (short) (AndroidCharacter.getMirror('0') - '0'), 144942662 - Color.argb(0, 0, 0, 0), (byte) TextUtils.indexOf("", "", 0, 0), 584027951 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), bool);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i10 = f1355 + 111;
                f1360 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onEndCardLoadFail(bool);
                if (i11 != 0) {
                    throw null;
                }
            }
            int i12 = f1355 + 11;
            f1360 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }

        public void onEndCardLoadSuccess(Boolean bool) {
            f1360 = (f1355 + 69) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 860157695, -1198357486, -105724731, -1853711581, -373644041, -65317717, 233485353, -987285495, -176438144, -1209930138}, TextUtils.indexOf("", "", 0) + 36).intern(), bool);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                videoAdListener.onEndCardLoadSuccess(bool);
                f1360 = (f1355 + 7) % 128;
            }
        }

        public void onEndCardSkipped(Boolean bool) {
            f1360 = (f1355 + 85) % 128;
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 860157695, -1198357486, -105724731, -1853711581, -259975133, 1575992382, -560016518, 1702034011}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32).intern(), bool);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                videoAdListener.onEndCardSkipped(bool);
            }
            f1355 = (f1360 + 23) % 128;
        }

        public void onLeaveApp() {
            int i10 = f1355 + 23;
            f1360 = i10 % 128;
            if (i10 % 2 != 0) {
                by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, -1843914197, -1837672131, -195958753, 1130398060, 2134748653, -374195594}, 16777242 / Color.rgb(0, 0, 1)).intern(), new Object[0]);
                if (this.f1364 == null) {
                    return;
                }
            } else {
                by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, -1843914197, -1837672131, -195958753, 1130398060, 2134748653, -374195594}, Color.rgb(0, 0, 0) + 16777242).intern(), new Object[0]);
                if (this.f1364 == null) {
                    return;
                }
            }
            this.f1364.onLeaveApp();
            f1360 = (f1355 + 11) % 128;
        }

        public void onReplay() {
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 768076836, 41723337, -834862812, 3325546}, View.getDefaultSize(0, 0) + 24).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                f1360 = (f1355 + 77) % 128;
                videoAdListener.onReplay();
                f1360 = (f1355 + 15) % 128;
            }
        }

        public void onReplayFinish() {
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, 768076836, 41723337, -834862812, 3325546, -581048736, 1490116252, 531412453, 452772307}, Drawable.resolveOpacity(0, 0) + 30).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i10 = f1355 + 57;
                f1360 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onReplayFinish();
                if (i11 != 0) {
                    throw null;
                }
            }
            int i12 = f1360 + 81;
            f1355 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 67 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hc
        /* renamed from: ｋ */
        public final /* synthetic */ VideoAdListener mo1115() {
            int i10 = f1355 + 55;
            f1360 = i10 % 128;
            if (i10 % 2 != 0) {
                m1688();
                throw null;
            }
            VideoAdListener videoAdListenerM1688 = m1688();
            int i11 = f1360 + 49;
            f1355 = i11 % 128;
            if (i11 % 2 != 0) {
                return videoAdListenerM1688;
            }
            throw null;
        }

        public void onAdDismissed(int i10) {
            by.this.m1169(this, this.f1365, m1689(new int[]{-1297565383, -915862706, -732466139, 9775678, -1385856802, 1528902865, -1538045529, -740434867, -311394025, -1973429101, 576639838, -1173026891, -830317484, 2052191369, -1325342318, -2015764093, -789547324, -710207421, -1660925095, -1705686337, 2139036112, 536337709}, 41 - Color.argb(0, 0, 0, 0)).intern(), Integer.valueOf(i10));
            VideoAdListener videoAdListener = this.f1364;
            if (videoAdListener != null) {
                int i11 = f1360 + 15;
                f1355 = i11 % 128;
                int i12 = i11 % 2;
                videoAdListener.onAdDismissed(i10);
                if (i12 == 0) {
                    throw null;
                }
            }
            int i13 = f1360 + 101;
            f1355 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static String m1619(AdParams adParams) {
        f1316 = (f1315 + 61) % 128;
        String id2 = adParams.getId();
        int i10 = f1316 + 39;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 36 / 0;
        }
        return id2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdParams m1640(VideoAdController videoAdController) {
        f1316 = (f1315 + 47) % 128;
        AdParams adParamsM1675 = m1675(videoAdController);
        f1315 = (f1316 + 59) % 128;
        return adParamsM1675;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1647(AdParams adParams) {
        f1315 = (f1316 + 45) % 128;
        String strM1627 = m1627(adParams);
        int i10 = f1315 + 37;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1627;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m1656(AdParams adParams) {
        f1316 = (f1315 + 19) % 128;
        List<String> listM1614 = m1614(adParams);
        int i10 = f1316 + 25;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM1614;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1668(CreativeParams creativeParams) {
        int i10 = f1316 + 17;
        f1315 = i10 % 128;
        int i11 = i10 % 2;
        String strM1655 = m1655(creativeParams);
        if (i11 == 0) {
            int i12 = 5 / 0;
        }
        return strM1655;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1681(AdParams adParams) {
        f1316 = (f1315 + 49) % 128;
        String strM1616 = m1616(adParams);
        f1316 = (f1315 + 37) % 128;
        return strM1616;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AdData m1648(Ad ad2, String str) {
        f1316 = (f1315 + 115) % 128;
        AdData adDataM1630 = m1630(ad2, str);
        f1315 = (f1316 + 73) % 128;
        return adDataM1630;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ CompanionAds m1657(Creative creative) {
        f1315 = (f1316 + 63) % 128;
        CompanionAds companionAdsM1684 = m1684(creative);
        f1316 = (f1315 + 105) % 128;
        return companionAdsM1684;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1669(AdParams adParams) {
        f1316 = (f1315 + 57) % 128;
        String strM1619 = m1619(adParams);
        int i10 = f1316 + 51;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1619;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ AdData m1683(Ad ad2, String str) {
        f1316 = (f1315 + 65) % 128;
        AdData adDataM1671 = m1671(ad2, str);
        f1316 = (f1315 + 9) % 128;
        return adDataM1671;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        int i10 = f1316 + 23;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            HyBid.getHyBidVersion();
            throw null;
        }
        String hyBidVersion = HyBid.getHyBidVersion();
        int i11 = f1315 + 101;
        f1316 = i11 % 128;
        if (i11 % 2 == 0) {
            return hyBidVersion;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m1641(Ad ad2) {
        JSONObject json;
        int i10 = f1315 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1316 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                json = ad2.toJson();
                int i11 = 48 / 0;
            } else {
                json = ad2.toJson();
            }
            f1315 = (f1316 + 61) % 128;
            return json;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ClickThrough m1649(VideoClicks videoClicks) {
        f1316 = (f1315 + 61) % 128;
        ClickThrough clickThroughM1637 = m1637(videoClicks);
        int i10 = f1315 + 79;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return clickThroughM1637;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Creatives m1658(VastAdSource vastAdSource) {
        f1315 = (f1316 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        Creatives creativesM1638 = m1638(vastAdSource);
        int i10 = f1316 + 59;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 17 / 0;
        }
        return creativesM1638;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m1670(VideoClicks videoClicks) {
        int i10 = f1316 + 1;
        f1315 = i10 % 128;
        int i11 = i10 % 2;
        List<ClickTracking> listM1682 = m1682(videoClicks);
        if (i11 == 0) {
            int i12 = 37 / 0;
        }
        return listM1682;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Creatives m1686(InLine inLine) {
        int i10 = f1315 + 89;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1673(inLine);
        }
        m1673(inLine);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Creatives m1650(Wrapper wrapper) {
        f1315 = (f1316 + 57) % 128;
        Creatives creativesM1674 = m1674(wrapper);
        f1316 = (f1315 + 7) % 128;
        return creativesM1674;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ VASTAdTagURI m1659(Wrapper wrapper) {
        f1315 = (f1316 + 13) % 128;
        VASTAdTagURI vASTAdTagURIM1639 = m1639(wrapper);
        int i10 = f1315 + 9;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return vASTAdTagURIM1639;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ CompanionClickThrough m1672(Companion companion) {
        f1315 = (f1316 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        CompanionClickThrough companionClickThroughM1685 = m1685(companion);
        int i10 = f1315 + 33;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return companionClickThroughM1685;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m1687(VideoAd videoAd) {
        f1316 = (f1315 + 115) % 128;
        boolean zIsRewarded = videoAd.isRewarded();
        f1316 = (f1315 + 3) % 128;
        return zIsRewarded;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1651(Ad ad2) {
        f1316 = (f1315 + 65) % 128;
        JSONObject jSONObjectM1641 = m1641(ad2);
        f1316 = (f1315 + 19) % 128;
        return jSONObjectM1641;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1660(VideoAd videoAd, VideoAdListener videoAdListener) {
        f1315 = (f1316 + 97) % 128;
        m1676(videoAd, videoAdListener);
        f1316 = (f1315 + 17) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1678(AdData adData) {
        f1315 = (f1316 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        String html = adData.getHtml();
        int i10 = f1316 + 49;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return html;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1664((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 11, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1632).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1625();
            }
        });
        map.put(m1664((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56518), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18, View.MeasureSpec.makeMeasureSpec(0, 0) + 1643).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Boolean.valueOf(by.m1661((VideoAd) list.get(0)));
            }
        });
        map.put(m1664((char) (Color.blue(0) + 20828), 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1661 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.24
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                by.m1660((VideoAd) list.get(0), (VideoAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1664((char) (ExpandableListView.getPackedPositionChild(0L) + 53934), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, KeyEvent.normalizeMetaState(0) + 1678).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.34
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1651((Ad) list.get(0));
            }
        });
        map.put(m1664((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 48070), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, 1687 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.33
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1652((Ad) list.get(0));
            }
        });
        map.put(m1664((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1702 - Color.alpha(0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.32
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1665((Ad) list.get(0));
            }
        });
        map.put(m1664((char) (Color.alpha(0) + 34535), TextUtils.getOffsetBefore("", 0) + 11, AndroidCharacter.getMirror('0') + 1663).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.40
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1677((Ad) list.get(0));
            }
        });
        map.put(m1664((char) (6042 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 9, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.39
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1683((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1664((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14493), View.MeasureSpec.makeMeasureSpec(0, 0) + 10, MotionEvent.axisFromString("") + 1732).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.36
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1648((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1664((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "", 0, 0) + 12, KeyEvent.getDeadChar(0, 0) + 1741).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1636((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1664((char) KeyEvent.normalizeMetaState(0), (-16777203) - Color.rgb(0, 0, 0), 1753 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1653((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1664((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 13 - (Process.myTid() >> 22), 1766 - View.resolveSizeAndState(0, 0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1642((AdData) list.get(0));
            }
        });
        map.put(m1664((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0) + 11, View.getDefaultSize(0, 0) + 1779).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1666((AdData) list.get(0));
            }
        });
        map.put(m1664((char) View.combineMeasuredStates(0, 0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0), 1789 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1654((AdData) list.get(0));
            }
        });
        map.put(m1664((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.green(0) + 20, Gravity.getAbsoluteGravity(0, 0) + 1802).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1643((AdData) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1664((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51744), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1822).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1662(by.this, (VideoAdListener) list.get(0), chVar);
            }
        });
        map.put(m1664((char) (8884 - TextUtils.indexOf("", "", 0, 0)), 16 - ExpandableListView.getPackedPositionChild(0L), 1846 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1647((AdParams) list.get(0));
            }
        });
        map.put(m1664((char) (28095 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 13 - (ViewConfiguration.getEdgeSlop() >> 16), 1862 - TextUtils.indexOf("", "", 0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1669((AdParams) list.get(0));
            }
        });
        map.put(m1664((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27, 1875 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1635((AdParams) list.get(0));
            }
        });
        map.put(m1664((char) View.MeasureSpec.getSize(0), 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1902 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1681((AdParams) list.get(0));
            }
        });
        map.put(m1664((char) (ViewConfiguration.getTouchSlop() >> 8), 22 - Color.blue(0), 1931 - TextUtils.getTrimmedLength("")).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1656((AdParams) list.get(0));
            }
        });
        map.put(m1664((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, (ViewConfiguration.getEdgeSlop() >> 16) + 1953).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1629((AdParams) list.get(0));
            }
        });
        map.put(m1664((char) (39837 - View.MeasureSpec.getSize(0)), 28 - TextUtils.getTrimmedLength(""), TextUtils.lastIndexOf("", '0', 0, 0) + 1978).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1624((AdParams) list.get(0));
            }
        });
        map.put(m1664((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 25, 2006 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1622((AdParams) list.get(0));
            }
        });
        map.put(m1664((char) (ImageFormat.getBitsPerPixel(0) + 63576), ((Process.getThreadPriority(0) + 20) >> 6) + 11, 2030 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1640((VideoAdController) list.get(0));
            }
        });
        map.put(m1664((char) Color.green(0), 26 - (ViewConfiguration.getPressedStateDuration() >> 16), MotionEvent.axisFromString("") + 2042).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1649((VideoClicks) list.get(0));
            }
        });
        map.put(m1664((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 60790), TextUtils.indexOf("", "", 0) + 31, ExpandableListView.getPackedPositionType(0L) + 2067).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1670((VideoClicks) list.get(0));
            }
        });
        map.put(m1664((char) (31338 - TextUtils.lastIndexOf("", '0', 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 24, 2098 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.23
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1672((Companion) list.get(0));
            }
        });
        map.put(m1664((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 52480), 23 - (ViewConfiguration.getPressedStateDuration() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2121).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1657((Creative) list.get(0));
            }
        });
        map.put(m1664((char) (9654 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 18 - (Process.myPid() >> 22), TextUtils.indexOf("", "") + 2145).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1686((InLine) list.get(0));
            }
        });
        map.put(m1664((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 25, KeyEvent.keyCodeFromString("") + 2163).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.25
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1658((VastAdSource) list.get(0));
            }
        });
        map.put(m1664((char) ((-16744669) - Color.rgb(0, 0, 0)), 16 - View.MeasureSpec.makeMeasureSpec(0, 0), 2187 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.26
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1679((MediaFile) list.get(0));
            }
        });
        map.put(m1664((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 54593), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20, TextUtils.indexOf("", "", 0, 0) + 2203).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.27
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1633((StaticResource) list.get(0));
            }
        });
        map.put(m1664((char) Color.green(0), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), 2224 - Color.argb(0, 0, 0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.28
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1680((StaticResource) list.get(0));
            }
        });
        map.put(m1664((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2253).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.29
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1650((Wrapper) list.get(0));
            }
        });
        map.put(m1664((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, (ViewConfiguration.getScrollBarSize() >> 8) + 2272).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.30
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1659((Wrapper) list.get(0));
            }
        });
        map.put(m1664((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, KeyEvent.keyCodeFromString("") + 2294).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.35
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1668((CreativeParams) list.get(0));
            }
        });
        map.put(m1664((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 32 - Gravity.getAbsoluteGravity(0, 0), 2323 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.by.31
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return by.m1646((CreativeParams) list.get(0));
            }
        });
        f1315 = (f1316 + 47) % 128;
        return map;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1661(VideoAd videoAd) {
        int i10 = f1316 + 31;
        f1315 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM1687 = m1687(videoAd);
        if (i11 == 0) {
            int i12 = 75 / 0;
        }
        return zM1687;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List<ClickTracking> m1682(VideoClicks videoClicks) {
        f1315 = (f1316 + 49) % 128;
        List<ClickTracking> clickTrackingList = videoClicks.getClickTrackingList();
        f1315 = (f1316 + 45) % 128;
        return clickTrackingList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        switch (str.hashCode()) {
            case -2115104349:
                if (str.equals(m1664((char) (View.combineMeasuredStates(0, 0) + 23001), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1264 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    return VideoAdView.class;
                }
                return null;
            case -2101083431:
                if (str.equals(m1664((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 57976), KeyEvent.normalizeMetaState(0) + 6, 1545 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    return InLine.class;
                }
                return null;
            case -2095699225:
                if (str.equals(m1664((char) (TextUtils.indexOf((CharSequence) "", '0') + 24852), Color.red(0) + 24, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 642).intern())) {
                    return VastInterstitialActivity.class;
                }
                return null;
            case -2049897434:
                if (str.equals(m1664((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, KeyEvent.getDeadChar(0, 0) + 1427).intern())) {
                    return VideoClicks.class;
                }
                return null;
            case -2030915791:
                if (str.equals(m1664((char) ExpandableListView.getPackedPositionGroup(0L), 61 - (ViewConfiguration.getLongPressTimeout() >> 16), 1031 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    return VastRewardedActivity.class;
                }
                return null;
            case -2022878658:
                if (str.equals(m1664((char) (7369 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14, 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    return RequestManager.class;
                }
                return null;
            case -1973009238:
                if (!str.equals(m1664((char) (64135 - TextUtils.lastIndexOf("", '0')), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1550 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    return null;
                }
                int i10 = f1316 + 47;
                f1315 = i10 % 128;
                if (i10 % 2 == 0) {
                    return PNAPIContentInfoView.class;
                }
                return VastAdSource.class;
            case -1867123455:
                if (str.equals(m1664((char) (39420 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 62, 948 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    return HyBidRewardedActivity.class;
                }
                return null;
            case -1758764491:
                if (!str.equals(m1664((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-16777202) - Color.rgb(0, 0, 0), 1619 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                f1316 = (f1315 + 83) % 128;
                return CreativeParams.class;
            case -1741983831:
                if (str.equals(m1664((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1384 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    return AdParams.class;
                }
                return null;
            case -1692490108:
                if (str.equals(m1664((char) (44151 - TextUtils.getOffsetBefore("", 0)), 9 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1535).intern())) {
                    return Creatives.class;
                }
                return null;
            case -1668741680:
                if (str.equals(m1664((char) (ExpandableListView.getPackedPositionGroup(0L) + 64029), 25 - Color.alpha(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 358).intern())) {
                    return VastInterstitialPresenter.class;
                }
                return null;
            case -1474059205:
                if (str.equals(m1664((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 4377), 10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1233).intern())) {
                    return PNWebView.class;
                }
                return null;
            case -1454339106:
                if (str.equals(m1664((char) (40660 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 32 - Color.red(0), MotionEvent.axisFromString("") + 228).intern())) {
                    return HyBidInterstitialBroadcastSender.class;
                }
                return null;
            case -1305745411:
                if (str.equals(m1664((char) View.MeasureSpec.getMode(0), Color.rgb(0, 0, 0) + 16777231, (ViewConfiguration.getFadingEdgeLength() >> 16) + EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_VALUE).intern())) {
                    return HyBidRewardedAd.class;
                }
                return null;
            case -1042733280:
                if (str.equals(m1664((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 32664), 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 58 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    return AdSourceConfig.class;
                }
                return null;
            case -1040143378:
                if (str.equals(m1664((char) (View.MeasureSpec.getMode(0) + 58123), (-16777200) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0') + 130).intern())) {
                    return MraidAdPresenter.class;
                }
                return null;
            case -1034806157:
                if (str.equals(m1664((char) (KeyEvent.getMaxKeyCode() >> 16), 7 - (ViewConfiguration.getTouchSlop() >> 8), 1600 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    return Wrapper.class;
                }
                return null;
            case -1007287447:
                if (str.equals(m1664((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 22, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1010).intern())) {
                    return HyBidRewardedActivity.class;
                }
                return null;
            case -917597044:
                if (str.equals(m1664((char) (59932 - TextUtils.lastIndexOf("", '0', 0, 0)), 69 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 479).intern())) {
                    return MraidInterstitialActivity.class;
                }
                return null;
            case -889171374:
                if (str.equals(m1664((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 549 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    return MraidInterstitialActivity.class;
                }
                return null;
            case -844922724:
                if (str.equals(m1664((char) (TextUtils.getOffsetBefore("", 0) + 36154), 9 - Color.red(0), 732 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    return MRAIDView.class;
                }
                return null;
            case -801627293:
                if (!str.equals(m1664((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 11, 756 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                int i11 = f1316 + 89;
                f1315 = i11 % 128;
                if (i11 % 2 == 0) {
                    return InterstitialPresenterDecorator.class;
                }
                return MRAIDBanner.class;
            case -747024196:
                if (!str.equals(m1664((char) (45371 - KeyEvent.keyCodeFromString("")), 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 849 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    return null;
                }
                int i12 = f1315 + 13;
                f1316 = i12 % 128;
                if (i12 % 2 != 0) {
                    return null;
                }
                return HyBidRewardedBroadcastSender.class;
            case -729230458:
                if (str.equals(m1664((char) (55134 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, 1274 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    return VastProcessor.class;
                }
                return null;
            case -709708726:
                if (str.equals(m1664((char) TextUtils.getOffsetBefore("", 0), View.combineMeasuredStates(0, 0) + 13, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 72).intern())) {
                    return HyBidAdSource.class;
                }
                return null;
            case -617879491:
                if (str.equals(m1664((char) (TextUtils.indexOf((CharSequence) "", '0') + 14489), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1438 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    return ClickThrough.class;
                }
                return null;
            case -594285390:
                if (!str.equals(m1664((char) TextUtils.indexOf("", "", 0), AndroidCharacter.getMirror('0') - '!', Color.rgb(0, 0, 0) + 16778465).intern())) {
                    return null;
                }
                int i13 = f1316 + 95;
                f1315 = i13 % 128;
                if (i13 % 2 != 0) {
                    return VideoAdListener.class;
                }
                return AdSourceConfig.class;
            case -589715152:
                if (str.equals(m1664((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, 1186 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    return PNAPIContentInfoView.class;
                }
                return null;
            case -587420703:
                if (str.equals(m1664((char) (63764 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), TextUtils.lastIndexOf("", '0') + 13, TextUtils.indexOf("", "", 0, 0) + 1606).intern())) {
                    return VASTAdTagURI.class;
                }
                return null;
            case -567645543:
                if (str.equals(m1664((char) (ImageFormat.getBitsPerPixel(0) + 1), 22 - TextUtils.indexOf("", "", 0), 1148 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return HyBidLeaderboardAdView.class;
                }
                return null;
            case -520974940:
                if (str.equals(m1664((char) ExpandableListView.getPackedPositionGroup(0L), 10 - (Process.myTid() >> 22), 680 - TextUtils.indexOf("", "", 0)).intern())) {
                    return AdResponse.class;
                }
                return null;
            case -514201671:
                if (str.equals(m1664((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55020), 15 - Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 145).intern())) {
                    return VastAdPresenter.class;
                }
                return null;
            case -385055469:
                if (!str.equals(m1664((char) (13255 - View.MeasureSpec.getSize(0)), Drawable.resolveOpacity(0, 0) + 10, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1571).intern())) {
                    return null;
                }
                int i14 = f1316 + 57;
                f1315 = i14 % 128;
                if (i14 % 2 == 0) {
                    return HyBidRewardedAd.Listener.class;
                }
                return MediaFiles.class;
            case -348198615:
                if (str.equals(m1664((char) (38793 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21, 1484 - KeyEvent.normalizeMetaState(0)).intern())) {
                    return CompanionClickThrough.class;
                }
                return null;
            case -242952691:
                if (str.equals(m1664((char) KeyEvent.keyCodeFromString(""), 16 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 260).intern())) {
                    return PNInterstitialAd.class;
                }
                return null;
            case -232966702:
                if (!str.equals(m1664((char) (23049 - TextUtils.indexOf("", "")), TextUtils.getTrimmedLength("") + 15, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 691).intern())) {
                    return null;
                }
                f1316 = (f1315 + 95) % 128;
                return AdvertisingInfo.class;
            case -217201711:
                if (str.equals(m1664((char) (59463 - Color.argb(0, 0, 0, 0)), 23 - View.MeasureSpec.getMode(0), 1325 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    return HyBidRewardedAd.Listener.class;
                }
                return null;
            case -205981873:
                if (str.equals(m1664((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 11, 1288 - Color.blue(0)).intern())) {
                    return PlayerInfo.class;
                }
                return null;
            case -150968480:
                if (str.equals(m1664((char) Drawable.resolveOpacity(0, 0), 8 - ((byte) KeyEvent.getModifierMetaStateMask()), 1562 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    return MediaFile.class;
                }
                return null;
            case -133293208:
                if (str.equals(m1664((char) (15822 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 18 - TextUtils.indexOf((CharSequence) "", '0'), 1348 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return HyBidAdView.Listener.class;
                }
                return null;
            case -114588646:
                if (str.equals(m1664((char) (40621 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, 1410 - (Process.myPid() >> 22)).intern())) {
                    return VideoAdController.class;
                }
                return null;
            case 2115:
                if (str.equals(m1664((char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2, 667 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    return Ad.class;
                }
                return null;
            case 2658924:
                if (str.equals(m1664((char) ((ViewConfiguration.getTouchSlop() >> 8) + 13194), 4 - (ViewConfiguration.getTapTimeout() >> 16), 1595 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    return Vast.class;
                }
                return null;
            case 22955995:
                if (str.equals(m1664((char) (418 - Color.red(0)), ExpandableListView.getPackedPositionGroup(0L) + 13, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1219).intern())) {
                    return PNMRectAdView.class;
                }
                return null;
            case 63078110:
                if (str.equals(m1664((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 5 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 676).intern())) {
                    return AdExt.class;
                }
                return null;
            case 70165004:
                if (str.equals(m1664((char) (ImageFormat.getBitsPerPixel(0) + 60250), 5 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.getSize(0)).intern())) {
                    return HyBid.class;
                }
                return null;
            case 152629510:
                if (str.equals(m1664((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 8, 1112 - TextUtils.getTrimmedLength("")).intern())) {
                    return PNAdView.class;
                }
                return null;
            case 254077974:
                if (str.equals(m1664((char) Color.red(0), Gravity.getAbsoluteGravity(0, 0) + 20, Color.alpha(0) + 768).intern())) {
                    return AdPresenterDecorator.class;
                }
                return null;
            case 271735736:
                if (str.equals(m1664((char) (6636 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 15, 12 - View.resolveSize(0, 0)).intern())) {
                    return UserDataManager.class;
                }
                return null;
            case 282218207:
                if (str.equals(m1664((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, TextUtils.lastIndexOf("", '0', 0) + 276).intern())) {
                    return InterstitialPresenterDecorator.class;
                }
                return null;
            case 287435653:
                if (str.equals(m1664((char) (55895 - Color.green(0)), Color.red(0) + 14, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 160).intern())) {
                    return BrowserManager.class;
                }
                return null;
            case 353872196:
                if (str.equals(m1664((char) TextUtils.indexOf("", "", 0, 0), 17 - Drawable.resolveOpacity(0, 0), Color.argb(0, 0, 0, 0) + 27).intern())) {
                    return ImpressionManager.class;
                }
                return null;
            case 378666444:
                if (str.equals(m1664((char) (56171 - Process.getGidForName("")), 15 - TextUtils.getCapsMode("", 0, 0), 85 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    return VastTagAdSource.class;
                }
                return null;
            case 424904237:
                if (str.equals(m1664((char) (KeyEvent.keyCodeFromString("") + 52192), 18 - Drawable.resolveOpacity(0, 0), 1392 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    return ViewControllerVast.class;
                }
                return null;
            case 441957133:
                if (str.equals(m1664((char) View.MeasureSpec.getMode(0), 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Process.getGidForName("") + 1171).intern())) {
                    return HyBidMRectAdView.class;
                }
                return null;
            case 476474561:
                if (str.equals(m1664((char) (61346 - View.MeasureSpec.getSize(0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 70, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 384).intern())) {
                    return HyBidInterstitialActivity.class;
                }
                return null;
            case 482776408:
                if (str.equals(m1664((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 34 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 194).intern())) {
                    return HyBidInterstitialBroadcastReceiver.class;
                }
                return null;
            case 485976319:
                if (str.equals(m1664((char) (Process.getGidForName("") + 57142), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, TextUtils.getOffsetAfter("", 0) + 5).intern())) {
                    return AdCache.class;
                }
                return null;
            case 504900231:
                if (str.equals(m1664((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 453 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    return HyBidInterstitialActivity.class;
                }
                return null;
            case 591135468:
                if (str.equals(m1664((char) (Process.myTid() >> 22), 9 - TextUtils.getOffsetBefore("", 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1462).intern())) {
                    return Companion.class;
                }
                return null;
            case 606183598:
                if (str.equals(m1664((char) (22195 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, 304 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    return InterstitialPresenterFactory.class;
                }
                return null;
            case 676623548:
                if (str.equals(m1664((char) (24248 - KeyEvent.keyCodeFromString("")), 14 - Color.alpha(0), 1581 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return StaticResource.class;
                }
                return null;
            case 767767497:
                if (str.equals(m1664((char) (40140 - (Process.myPid() >> 22)), AndroidCharacter.getMirror('0') - 28, Color.green(0) + 1092).intern())) {
                    return VastRewardedActivity.class;
                }
                return null;
            case 789926062:
                if (str.equals(m1664((char) (24521 - TextUtils.getOffsetAfter("", 0)), 22 - Color.green(0), 107 - View.MeasureSpec.getSize(0)).intern())) {
                    return BannerPresenterFactory.class;
                }
                return null;
            case 862687632:
                if (str.equals(m1664((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 48119), (KeyEvent.getMaxKeyCode() >> 16) + 24, View.resolveSizeAndState(0, 0, 0) + EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE).intern())) {
                    return RewardedPresenterFactory.class;
                }
                return null;
            case 956069326:
                if (str.equals(m1664((char) ((KeyEvent.getMaxKeyCode() >> 16) + 17285), KeyEvent.keyCodeFromString("") + 7, 724 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    return VASTtag.class;
                }
                return null;
            case 1002796579:
                if (str.equals(m1664((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 7, 100 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return Auction.class;
                }
                return null;
            case 1044987291:
                if (str.equals(m1664((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 20, 173 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    return HyBidInterstitialAd.class;
                }
                return null;
            case 1150879268:
                if (str.equals(m1664((char) (TextUtils.indexOf((CharSequence) "", '0') + 46847), (ViewConfiguration.getScrollBarSize() >> 8) + 12, 1471 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                    return CompanionAds.class;
                }
                return null;
            case 1164559907:
                if (str.equals(m1664((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 17 - TextUtils.getOffsetBefore("", 0), 740 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    return MRAIDInterstitial.class;
                }
                return null;
            case 1199380782:
                if (str.equals(m1664((char) Color.alpha(0), (Process.myTid() >> 22) + 21, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 926).intern())) {
                    return VastRewardedPresenter.class;
                }
                return null;
            case 1228519789:
                if (str.equals(m1664((char) View.resolveSizeAndState(0, 0, 0), 69 - TextUtils.indexOf("", "", 0, 0), 574 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    return VastInterstitialActivity.class;
                }
                return null;
            case 1241891335:
                if (!str.equals(m1664((char) (KeyEvent.keyCodeFromString("") + 59510), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, TextUtils.getOffsetBefore("", 0) + IronSourceError.ERROR_NT_LOAD_EXCEPTION).intern())) {
                    return null;
                }
                f1316 = (f1315 + 17) % 128;
                return RemoteConfigAppInfo.class;
            case 1250739860:
                if (!str.equals(m1664((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 11 - KeyEvent.keyCodeFromString(""), Color.alpha(0) + 1120).intern())) {
                    return null;
                }
                int i15 = f1316 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f1315 = i15 % 128;
                if (i15 % 2 == 0) {
                    return null;
                }
                return HyBidAdView.class;
            case 1296210799:
                if (str.equals(m1664((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 27, 1298 - Drawable.resolveOpacity(0, 0)).intern())) {
                    return HyBidInterstitialAd.Listener.class;
                }
                return null;
            case 1373883333:
                if (!str.equals(m1664((char) TextUtils.indexOf("", "", 0), TextUtils.getOffsetBefore("", 0) + 26, (ViewConfiguration.getEdgeSlop() >> 16) + 333).intern())) {
                    return null;
                }
                int i16 = f1315 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f1316 = i16 % 128;
                if (i16 % 2 == 0) {
                    return MraidInterstitialPresenter.class;
                }
                return HyBidAdView.class;
            case 1402445010:
                if (str.equals(m1664((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 15, 1206 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    return PNBannerAdView.class;
                }
                return null;
            case 1506578400:
                if (str.equals(m1664((char) (27669 - KeyEvent.normalizeMetaState(0)), 17 - (Process.myPid() >> 22), TextUtils.indexOf((CharSequence) "", '0', 0) + 1132).intern())) {
                    return HyBidBannerAdView.class;
                }
                return null;
            case 1521679714:
                if (str.equals(m1664((char) Color.blue(0), 16 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 788).intern())) {
                    return PresenterFactory.class;
                }
                return null;
            case 1607572150:
                if (str.equals(m1664((char) ((-16777216) - Color.rgb(0, 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 30, 818 - TextUtils.lastIndexOf("", '0')).intern())) {
                    return HyBidRewardedBroadcastReceiver.class;
                }
                return null;
            case 1877773523:
                if (str.equals(m1664((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1504 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    return CompanionClickTracking.class;
                }
                return null;
            case 1885066191:
                if (str.equals(m1664((char) Gravity.getAbsoluteGravity(0, 0), 8 - Color.alpha(0), 1527 - (Process.myPid() >> 22)).intern())) {
                    return Creative.class;
                }
                return null;
            case 1955369613:
                if (str.equals(m1664((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 12954), 6 - (ViewConfiguration.getJumpTapTimeout() >> 16), Process.getGidForName("") + 670).intern())) {
                    return AdData.class;
                }
                return null;
            case 1969459009:
                if (str.equals(m1664((char) (Process.myPid() >> 22), 25 - TextUtils.lastIndexOf("", '0', 0), 877 - View.MeasureSpec.getMode(0)).intern())) {
                    return RewardedPresenterDecorator.class;
                }
                return null;
            case 2079062148:
                if (str.equals(m1664((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20645), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, 1367 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    return e.class;
                }
                return null;
            case 2107600959:
                if (str.equals(m1664((char) (61896 - TextUtils.indexOf("", "")), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, 1450 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    return ClickTracking.class;
                }
                return null;
            case 2117435870:
                if (str.equals(m1664((char) TextUtils.indexOf("", "", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 7, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1242).intern())) {
                    return VideoAd.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1655(CreativeParams creativeParams) {
        int i10 = f1316 + 79;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            creativeParams.getCreativeData();
            throw null;
        }
        String creativeData = creativeParams.getCreativeData();
        int i11 = f1316 + 59;
        f1315 = i11 % 128;
        if (i11 % 2 != 0) {
            return creativeData;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static CompanionClickThrough m1685(Companion companion) {
        f1315 = (f1316 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        CompanionClickThrough companionClickThrough = companion.getCompanionClickThrough();
        f1316 = (f1315 + 109) % 128;
        return companionClickThrough;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1631(AdData adData) {
        int i10 = f1315 + 61;
        f1316 = i10 % 128;
        if (i10 % 2 != 0) {
            adData.getJS();
            throw null;
        }
        String js2 = adData.getJS();
        int i11 = f1315 + 27;
        f1316 = i11 % 128;
        if (i11 % 2 == 0) {
            return js2;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static CompanionAds m1684(Creative creative) {
        f1316 = (f1315 + 39) % 128;
        CompanionAds companionAds = creative.getCompanionAds();
        f1315 = (f1316 + 109) % 128;
        return companionAds;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1632(AdData adData, String str) {
        f1316 = (f1315 + 83) % 128;
        String stringField = adData.getStringField(str);
        int i10 = f1315 + 19;
        f1316 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 19 / 0;
        }
        return stringField;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static ClickThrough m1637(VideoClicks videoClicks) {
        f1315 = (f1316 + 93) % 128;
        ClickThrough clickThrough = videoClicks.getClickThrough();
        int i10 = f1315 + 29;
        f1316 = i10 % 128;
        if (i10 % 2 == 0) {
            return clickThrough;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Creatives m1638(VastAdSource vastAdSource) {
        f1316 = (f1315 + 59) % 128;
        Creatives creatives = vastAdSource.getCreatives();
        f1316 = (f1315 + 61) % 128;
        return creatives;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static VASTAdTagURI m1639(Wrapper wrapper) {
        int i10 = f1316 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1315 = i10 % 128;
        if (i10 % 2 == 0) {
            wrapper.getVastAdTagURI();
            throw null;
        }
        VASTAdTagURI vastAdTagURI = wrapper.getVastAdTagURI();
        int i11 = f1315 + 15;
        f1316 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 36 / 0;
        }
        return vastAdTagURI;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1634(CreativeParams creativeParams) {
        f1316 = (f1315 + 7) % 128;
        String environmentVars = creativeParams.getEnvironmentVars();
        int i10 = f1316 + 61;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return environmentVars;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static AdData m1671(Ad ad2, String str) {
        int i10 = f1315 + 47;
        f1316 = i10 % 128;
        int i11 = i10 % 2;
        AdData meta = ad2.getMeta(str);
        if (i11 != 0) {
            int i12 = 83 / 0;
        }
        return meta;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m1676(VideoAd videoAd, VideoAdListener videoAdListener) {
        int i10 = f1316 + 17;
        f1315 = i10 % 128;
        int i11 = i10 % 2;
        videoAd.setAdListener(videoAdListener);
        if (i11 == 0) {
            int i12 = 74 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private e m1663(VideoAdListener videoAdListener, ch chVar) {
        e eVar = new e(videoAdListener, chVar);
        int i10 = f1315 + 31;
        f1316 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 72 / 0;
        }
        return eVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static AdParams m1675(VideoAdController videoAdController) {
        int i10 = f1316 + 13;
        f1315 = i10 % 128;
        int i11 = i10 % 2;
        AdParams adParams = videoAdController.getAdParams();
        if (i11 == 0) {
            int i12 = 86 / 0;
        }
        int i13 = f1316 + 21;
        f1315 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 69 / 0;
        }
        return adParams;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Creatives m1673(InLine inLine) {
        f1316 = (f1315 + 17) % 128;
        Creatives creatives = inLine.getCreatives();
        f1316 = (f1315 + 77) % 128;
        return creatives;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1667(StaticResource staticResource) {
        f1315 = (f1316 + 99) % 128;
        String text = staticResource.getText();
        int i10 = f1316 + 59;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            return text;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Creatives m1674(Wrapper wrapper) {
        f1315 = (f1316 + 91) % 128;
        Creatives creatives = wrapper.getCreatives();
        f1316 = (f1315 + 19) % 128;
        return creatives;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1664(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f1313[i11 + i12] ^ (i12 * f1314)) ^ c10);
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
    private static String m1644(MediaFile mediaFile) {
        int i10 = f1315 + 25;
        f1316 = i10 % 128;
        if (i10 % 2 != 0) {
            mediaFile.getText();
            throw null;
        }
        String text = mediaFile.getText();
        f1316 = (f1315 + 13) % 128;
        return text;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1645(StaticResource staticResource) {
        int i10 = f1315 + 101;
        f1316 = i10 % 128;
        if (i10 % 2 != 0) {
            staticResource.getCreativeType();
            throw null;
        }
        String creativeType = staticResource.getCreativeType();
        f1316 = (f1315 + 13) % 128;
        return creativeType;
    }
}

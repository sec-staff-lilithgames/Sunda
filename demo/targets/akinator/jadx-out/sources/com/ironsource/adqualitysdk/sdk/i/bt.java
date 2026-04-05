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
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Tap;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.VideoContentListenerAdapter;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IArichMediaVideoView;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bt extends bg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1212 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1213;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1214;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1215;

    static {
        char[] cArr = new char[1352];
        com.google.android.gms.internal.play_billing.a.y("\u0000I?`~r½OüJ;'z7¹\u0016ø\u00197\bvéµÓôÆ3Âr¡± ð\u008e/\u008fn\u0090®Híj,IkCª1é5(,g-¦\u0019åü$ÿcÒ¢Ûá´ ·\u0000c?a~q½\u0004ü^;?z6¹\u0007ø\u00027PvåµôôÆ3Ór¶±³ð\u0083/\u009an\u0095®|í},\bkGª&é;(pg\r¦\u0019åü$ÿcÒ¢Ûá´ §_¹\u009e\u0099ÝÖ\u001dO\\z\u009bLÚU\u0019LX-\u00979Ö\u001c\u0015\u001fTò\u0093÷Òé\u0011ÀPÈ\u008f¯Îª\r\u0088L\u0095\u008cnËR\nlIC\u0088MÇ;\u00063E\u0016\u00843Ãã\u0002úAõ\u0080Ü¿Ñþ²=\u00ad\u0000I?`~r½OüJ;'z7¹\u0016ø\u00197\bvéµÜôÝ3Úr¨±¡ð\u0083/\u009cn\u0099®oív,gkPª\u0003é3(*g\u0005¦\fåá$âcÝ$ \u001b¢Z²\u0099ÇØ\u009d\u001fü^õ\u009dÄÜÁ\u0013\u0093R&\u00917Ð\u0005\u0017\u0010Vu\u0095pÔ@\u000bYJV\u008a¿É¾\bËO\u0084\u008eåÍø\f³CÎ\u0082ÚÁ?\u0000<G\u0011\u0086\u0018Åw\u0004d{zºZù\u00159\u008cx¹¿\u008fþ\u0096=\u008f|î³úòß1Üp1·4ö%5\u0018t\u0013«eêh)FhE¨¤ï¶.³m®¬\u009dãÊ\"öaÓ Øç5&$e+¤\u0010\u0088m·DöV5ktn³\u0003ò\u001312p=¿,þÍ=ì|å»ñú\u00889»x¡§®æ±&Oej¤kãt\"\u0003a\u001b *ï$.?mÕ¬×ëò*×i\u0087¨\u009e×\u0091\u0016¸Uµ\u0095VÔI\u0013ER{\u0091hÐ\r\u0000c?a~q½\u0004ü^;?z6¹\u0007ø\u00027PvåµôôÆ3Ór¶±³ð\u0083/\u009an\u0095®|í},\bkGª&é;(pg\r¦\u0019åü$ÿcÒ¢Ûá´ §_¹\u009e\u0099ÝÖ\u001dO\\z\u009bLÚU\u0019LX-\u00979Ö\u001c\u0015\u001fTò\u0093÷Òò\u0011ÇPß\u008f¢Î\u0095\r\u0083L\u0090\u008ckËq\nHIE\u0088^Ç-\u00069E4\u0084\u001eÃá\u0002÷Aù\u0080Ø¿ùþ¥= |\u008b»\u0086ú\u0097:xyc¸k÷Y66u7»Ê\u0084ãÅñ\u0006ÌGÉ\u0080¤Á´\u0002\u0095C\u009a\u008c\u008bÍj\u000eXOO\u0088fÉ7\n>K\u0017\u0000I?`~r½OüJ;'z7¹\u0016ø\u00197\bvéµÛôÌ3är¡±£ð\u0095/\u008bn\u008f®~´¸\u008b\u0091Ê\u0083\t¾H»\u008fÖÎÆ\rçLè\u0083ùÂ\u0018\u0001*@=\u0087\u0015ÆP\u0005MDu\u009bzÚ\u007f\u001a\u009eY\u009b1¶\u000e\u009fO\u008d\u008c°Íµ\nØKÈ\u0088éÉæ\u0006÷G\u0016\u0084(Å2\u0002-CR\u0080LÁk\u001ex_l\u009f\u009bÜ©\u001d¸Z¦\u009bØðàÏæ\u008eöMì\fÿË\u0089\u008a\u0094I¬\b\u0094Ç¶\u0086KER\u0004fÃz\u0082\u001f\u0000I?`~r½OüJ;'z7¹\u0016ø\u00197\bvéµÙôÇ3Ør°±·ð\u008e/\u009an¿®eív,RkFª-é<(2g\t¦\bônËG\u008aUIh\bmÏ\u0000\u008e\u0010M1\f>Ã/\u0082ÎAè\u0000áÇø\u0086\u0097E¶\u0004¨Û§\u009a¯Z_\u0019PØm\u009f\u007f^\u0000\u001d\u0005\u0000I?`~r½OüJ;'z7¹\u0016ø\u00197\bvéµÛôÌ3àr\u00ad±·ð\u0097/»n\u0092®cíl,ek[ª,é$(,g\u0003¦\u0016åä$ócÖ\u0090O¯zîo-Dlf«5ê=)\bh\u0006§\u0005æï%ÔdË£Üâ»óMÌp\u008dqNL\u000fDÈ=\u0089\u0010J\u0003\u000b\u000bÄ\u0002\u0085áFü\u0007ÅÀÌ\t\u0018\u0000I?`~r½OüJ;'z7¹\u0016ø\u00197\bvéµÜôÝ3Úr¨±¡ð\u0083/\u009cn\u0099®oív,pk]ª&é5(1g/¦\u0015åæ$âcÁ¢Üá´ \u008d_³\u009e\u0084Ý\u008c\u001dt\\{\u009bNÚ\\\u0019[X>\u0000I?`~r½OüJ;'z7¹\u0016ø\u00197\bvéµÜôÝ3Úr¨±¡ð\u0083/\u009cn\u0099®oív,gkPª\u0007é&(;g\u0002¦\u000eåû$ÚcÍ¢Áá´ «_²\u009e\u008fÝ\u008a\u0000V?g~x½OüW;\u0005z;¹\fø\u00047\u001bvâµîôä3ßr·±¦ð\u0085/\u0080n\u0099®x\u0000I?`~h½OüJ;(z5¹\u000eø27\fvãµíôÛ3Ór¶±\u009eð\u0089/\u009dn\u0088®oív,CkF)¥\u0016\u009eW\u009dZheA$Sçn¦ka\u0006 \u0016ã7¢8m),Èïý®üiû(\u0089ë\u0080ª¢u½4¸ôN·WvF1qð&³\u0007r\u001a=#ü/¿Ú~û9ìøà»\u0095z\u008a\u0005\u0093Ä®\u0087«Gf\u0006QÁb\u0080aCk\u0002\bÍ\t\u0000I?`~r½OüJ;'z7¹\u0016ø\u00197\bvéµÜôÝ3Úr¨±¡ð\u0083/\u009cn\u0099®oív,skZª+é$(\u001dg\u0003¦\u0014åü$äcË¢Þá¬ «_®\u0000I?`~r½OüJ;'z7¹\u0016ø\u00197\bvéµÛôÌ3àr\u00ad±·ð\u0097/¸n\u0095®ní},Ikwª-é>(*g\t¦\u0014åü$ÕcË¢Üá´ ¼_³\u009e\u0086Ý\u0094\u001dc\\f¨U\u0097hÖi\u0015TT\\\u0093%Ò\b\u0011\u001bP\u0013\u009f\u001aÞù\u001dä\\Ý\u009bÔÚ\u0095\u0019¦X\u0091\u0087\u008eÆ\u0098\u0006\u007fEz\u0000V?g~x½OüW;\u0005z;¹\fø\u00047\u001bvâµîôä3ßr·±¦ð\u0085/\u0080n\u0099®xíY,BkUª2é$(;g\u001e\u008afµ`ô~7wvv±\u0000ð\u001f3\u0006r6½%òþÍø\u008cÆOï\u000eîÉ\u0098\u0088\u0087K\u0082\n¢Å«\u0084mGD\u0006zÁv\u00800C\n\u00029Ý-\u009c9\\Ò\u001fÃÞý\u0099æX\u0087~¤A¢\u0000§Ã®\u0082±EÎ\u0004ÖÇÄ\u0086ôIç\u0005£:\u0089{\u0086¸²ù·>ß\u007fÍ¼áýõ2ús\"°\u0011ñ66=bî]è\u001cÉßä\u009eüY\u0089\u0018¾Û \u009a³U°\u0014J×k\u0096fQu\u0010\u0006Ó\u001a\u0092\u0011M \f>ÌÚ\u0000B?o~o½Oün;/z0¹\u0007ø\u001f7(våµÿôß3úr\u00ad±¡ð\u0094/\u008bn\u0092®oíj\u0015¿*\u0096k\u0084¨¹é¼.ÑoÁ¬àíï\"þc\u001f *á+&,g^¤Wåu:j{o»\u0099ø\u00809\u0091~¦¿ñüÐ=Írô³øð\r1,v;·7ôB5]JD\u008byÈ|\b§I\u008b\u008e Ï®\f\u0081M×\u0082ÜÃì\u0000åA\u0001\u0086\u0017Ç?\u00047E$\u009axÛO\u0018dYc\u009cå£ÌâÞ!ã`æ§\u008bæ\u009b%ºdµ«¤êE)wh`¯Lî\u0001-\u001bl;³\u0007ò&2ÃqÚ°þ÷ë6¢u\u0095´\u0081û´:³yJ¸_ÿz>I}\u0005¼\u0016Ã\u0018\u0002\u000fA9\u0081ÚÀÊ\u0007ëFï\u0085áÄ\u0089\u000b\u0099Jª\u0089\u009eÈI\u000fJNm\u0000g?k~h½iüM;4z&¹\u0007ø\u001e7\nvÜµèôÇ3Õr¡±¡ð\u0093/\u008bn\u0098®Xí},WkAª'é#(*\u0087`¸lùo:~{O¼.ý'>,\u007f\u0013\u0000g?k~h½kü\\;\u0005z;¹\fø\u00047\u001bvâµî]\u0092b\u0086#¡à¤¡¯fÑ'Üäú¥ùjà+\u0012è\u000f©\u0012n)\u0000i?}~J½Cü\\;#z;¹#ø\u0014\u0000g?k~h½iüT;/z7¹\tø$7\u0016vþµõôÝ3Ñr¬±\u0087ð\u0092/\u0082ÒPí\\¬_oQ.né\b¨\fk *3¨«\u0097§Ö¤\u0015µT\u0091\u0093æÒý\u0011ÍPÈ\u009f×Þ$\u001d\u0003\\\n\u009b\u0013Ú|\u0019]XC\u0087LÆD\u0006´E»\u0084\u0086Ã\u0094\u0002ëAî\u0000g?k~h½yü];*z1¹\u0001ø\u00047\u001bvèµÙôÇ3Ør°±·ð\u008e/\u009an¿®eív,RkFª-é<(2g\t¦\b\u0096µ©¹èº+½j\u009c\u00adñìè/ÄnÑ¡àà7#;b\u000e¥\u0001äx'ef@\u0000s?k~h½oüN;#z:¹\u0016ø\u000372våµéôÜ3Órª±·ð\u0092L«s§2¤ñ§°\u0090wÙ6èõÁ´È\u0000g?k~h½\u007füV;/z ¹&ø\u00197\rvüµöôÉ3Ïr\u0090±«ð\u0090/\u008bn¹®dím,K\u0000g?k~h½güJ;'z=¹\u0006ø27\u001fvâµôôÍ3Är\u0092±»ð\u0085/\u0099nµ®nyñFý\u0007þÄõ\u0085ÃB \u0003°À\u0091\u0081\u0095N\u009b\u000fsÌc\u008dPJd\u000b3È0\u0089\u0017V<\u0017\u0005×ñ\u0094ïUÙ\u0012Ì\u0000I?@~H½oüj;\u0015z\u0000¹+ø$77vÍµÖ\u0010Ñ/ÒnÏ\u00adóìö+\u0098j\u0088©¯è¨\b]7LvIµyô|\u0000B?O~R½dü};\u00145±\n¨K¨\u0088\u0088É\u0089\u000eáOò\u008cÅ\u0000S?_~I½küj;\u0003P&o;.>í\u000e¬\u0001ku*eé^/(\u0010'Q6\u0092\u0007Ó\u0001\u0014fUl", "ISO-8859-1", cArr, 0, 1352);
        f1214 = cArr;
        f1215 = 7789617240097832718L;
    }

    public bt(String str) {
        super(str);
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static InneractiveUnitController m1468(InneractiveAdSpot inneractiveAdSpot) {
        f1213 = (f1212 + 13) % 128;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        f1212 = (f1213 + 89) % 128;
        return selectedUnitController;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static String m1469(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1212 + 39;
        f1213 = i10 % 128;
        int i11 = i10 % 2;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        if (i11 != 0) {
            int i12 = 71 / 0;
        }
        return clickThroughUrl;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean m1472(InneractiveAdSpot inneractiveAdSpot) {
        f1212 = (f1213 + 71) % 128;
        boolean zIsFullscreenAd = inneractiveAdSpot.getAdContent().isFullscreenAd();
        f1213 = (f1212 + 13) % 128;
        return zIsFullscreenAd;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m1473(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1213 + 113;
        f1212 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        if (i11 == 0) {
            int i12 = 25 / 0;
        }
        return zIsVideoAd;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveUnitController m1474(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1213 + 45;
        f1212 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1468(inneractiveAdSpot);
        }
        m1468(inneractiveAdSpot);
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ int m1475() {
        int iM1470;
        int i10 = f1213 + 41;
        f1212 = i10 % 128;
        if (i10 % 2 == 0) {
            iM1470 = m1470();
            int i11 = 82 / 0;
        } else {
            iM1470 = m1470();
        }
        f1212 = (f1213 + 69) % 128;
        return iM1470;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static InneractiveAdRequest m1477(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1212 + 3;
        f1213 = i10 % 128;
        int i11 = i10 % 2;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        if (i11 != 0) {
            int i12 = 69 / 0;
        }
        return currentProcessedRequest;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1478(String str) {
        int i10 = f1212 + 29;
        f1213 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1471(str);
        }
        m1471(str);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1483(ImpressionData impressionData) {
        f1212 = (f1213 + 15) % 128;
        String strM1490 = m1490(impressionData);
        f1212 = (f1213 + 45) % 128;
        return strM1490;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveAdRequest m1485(InneractiveAdSpot inneractiveAdSpot) {
        f1212 = (f1213 + 21) % 128;
        InneractiveAdRequest inneractiveAdRequestM1477 = m1477(inneractiveAdSpot);
        int i10 = f1213 + 11;
        f1212 = i10 % 128;
        if (i10 % 2 != 0) {
            return inneractiveAdRequestM1477;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveAdSpot m1492(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        f1212 = (f1213 + 95) % 128;
        InneractiveAdSpot inneractiveAdSpotM1486 = m1486(inneractiveAdViewUnitController);
        f1213 = (f1212 + 11) % 128;
        return inneractiveAdSpotM1486;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1496(InneractiveAdRequest inneractiveAdRequest) {
        f1212 = (f1213 + 75) % 128;
        String strM1481 = m1481(inneractiveAdRequest);
        f1212 = (f1213 + 111) % 128;
        return strM1481;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static Enum m1471(String str) {
        switch (str.hashCode()) {
            case -2032180703:
                if (str.equals(m1489((char) (AndroidCharacter.getMirror('0') + 12092), (-16777209) - Color.rgb(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1344).intern())) {
                    return UnitDisplayType.DEFAULT;
                }
                return null;
            case -1841345251:
                if (!str.equals(m1489((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 6 - Color.argb(0, 0, 0, 0), 1330 - TextUtils.lastIndexOf("", '0')).intern())) {
                    return null;
                }
                int i10 = f1213 + 109;
                f1212 = i10 % 128;
                if (i10 % 2 != 0) {
                    return UnitDisplayType.SQUARE;
                }
                return UnitDisplayType.BANNER;
            case -1372958932:
                if (!str.equals(m1489((char) KeyEvent.normalizeMetaState(0), 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ExpandableListView.getPackedPositionChild(0L) + 1292).intern())) {
                    return null;
                }
                int i11 = f1212 + 99;
                f1213 = i11 % 128;
                if (i11 % 2 == 0) {
                    return UnitDisplayType.INTERSTITIAL;
                }
                break;
            case -1201514634:
                if (!str.equals(m1489((char) (20592 - TextUtils.indexOf("", "")), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, 1337 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    return null;
                }
                f1212 = (f1213 + 19) % 128;
                UnitDisplayType unitDisplayType = UnitDisplayType.VERTICAL;
                f1213 = (f1212 + 59) % 128;
                return unitDisplayType;
            case -77725029:
                if (!str.equals(m1489((char) (4253 - Color.argb(0, 0, 0, 0)), Color.green(0) + 9, 1302 - MotionEvent.axisFromString("")).intern())) {
                    return null;
                }
                f1212 = (f1213 + 47) % 128;
                break;
            case 73622449:
                if (str.equals(m1489((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 2064), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6, 1312 - (Process.myPid() >> 22)).intern())) {
                    return UnitDisplayType.MRECT;
                }
                return null;
            case 543046670:
                if (str.equals(m1489((char) (TextUtils.indexOf((CharSequence) "", '0') + 13796), 8 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1323).intern())) {
                    return UnitDisplayType.REWARDED;
                }
                return null;
            case 1951953708:
                if (!str.equals(m1489((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 6 - (Process.myTid() >> 22), 1317 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    return null;
                }
                f1212 = (f1213 + 71) % 128;
                return UnitDisplayType.BANNER;
            default:
                return null;
        }
        return UnitDisplayType.LANDSCAPE;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static Object m1476(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1213 + 97;
        f1212 = i10 % 128;
        int i11 = i10 % 2;
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        if (i11 == 0) {
            int i12 = 52 / 0;
        }
        f1213 = (f1212 + 35) % 128;
        return adContent;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1479(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1212 + 103;
        f1213 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1476 = m1476(inneractiveAdSpot);
        if (i11 != 0) {
            int i12 = 67 / 0;
        }
        f1213 = (f1212 + 81) % 128;
        return objM1476;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1484(InneractiveAdSpot inneractiveAdSpot) {
        f1212 = (f1213 + 73) % 128;
        boolean zM1472 = m1472(inneractiveAdSpot);
        f1213 = (f1212 + 7) % 128;
        return zM1472;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ InneractiveContentController.EventsListener m1487(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f1213 = (f1212 + 49) % 128;
        InneractiveContentController.EventsListener eventsListenerM1493 = m1493(inneractiveFullscreenVideoContentController);
        f1212 = (f1213 + 95) % 128;
        return eventsListenerM1493;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1494(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1212 + 105;
        f1213 = i10 % 128;
        if (i10 % 2 != 0) {
            m1469(inneractiveAdSpot);
            throw null;
        }
        String strM1469 = m1469(inneractiveAdSpot);
        f1212 = (f1213 + 15) % 128;
        return strM1469;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1498(InneractiveAdSpot inneractiveAdSpot) {
        int i10 = f1213 + 101;
        f1212 = i10 % 128;
        if (i10 % 2 == 0) {
            m1473(inneractiveAdSpot);
            throw null;
        }
        boolean zM1473 = m1473(inneractiveAdSpot);
        f1212 = (f1213 + 5) % 128;
        return zM1473;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1480(InneractiveUnitController inneractiveUnitController) {
        int i10 = f1212 + 105;
        f1213 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1495 = m1495(inneractiveUnitController);
        if (i11 != 0) {
            int i12 = 31 / 0;
        }
        return objM1495;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m1488(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i10 = f1213 + 41;
        f1212 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1482 = m1482(inneractiveFullscreenAdActivity);
        if (i11 == 0) {
            int i12 = 56 / 0;
        }
        f1213 = (f1212 + 41) % 128;
        return objM1482;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Object m1495(InneractiveUnitController inneractiveUnitController) {
        f1213 = (f1212 + 31) % 128;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        f1213 = (f1212 + 95) % 128;
        return selectedContentController;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        switch (str.hashCode()) {
            case -1764994669:
                if (str.equals(m1489((char) (ExpandableListView.getPackedPositionChild(0L) + 32494), Drawable.resolveOpacity(0, 0) + 10, 864 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    return IAVideoKit.class;
                }
                return null;
            case -1757761411:
                if (str.equals(m1489((char) TextUtils.indexOf("", "", 0, 0), 27 - Color.green(0), AndroidCharacter.getMirror('0') + 755).intern())) {
                    return VideoContentListenerAdapter.class;
                }
                return null;
            case -1751837367:
                if (str.equals(m1489((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 105).intern())) {
                    return InneractiveFullscreenAdActivity.class;
                }
                return null;
            case -1661930846:
                if (str.equals(m1489((char) TextUtils.getOffsetAfter("", 0), KeyEvent.keyCodeFromString("") + 80, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 248).intern())) {
                    return InneractiveRichMediaVideoPlayerActivityCore.class;
                }
                return null;
            case -1611796569:
                if (!str.equals(m1489((char) ('0' - AndroidCharacter.getMirror('0')), Color.alpha(0) + 37, 581 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    return null;
                }
                f1213 = (f1212 + 55) % 128;
                return InneractiveFullscreenAdEventsListener.class;
            case -1452673136:
                if (str.equals(m1489((char) Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 20, (Process.myTid() >> 22) + 344).intern())) {
                    return InneractiveAdRequest.class;
                }
                return null;
            case -1264220508:
                if (str.equals(m1489((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ImageFormat.getBitsPerPixel(0) + 478).intern())) {
                    return InneractiveAdViewUnitController.class;
                }
                return null;
            case -1205203919:
                if (str.equals(m1489((char) Drawable.resolveOpacity(0, 0), 44 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 537 - TextUtils.lastIndexOf("", '0')).intern())) {
                    return InneractiveFullscreenVideoContentController.class;
                }
                return null;
            case -1190251081:
                if (str.equals(m1489((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 708 - View.combineMeasuredStates(0, 0)).intern())) {
                    return InneractiveFullscreenUnitController.class;
                }
                return null;
            case -1115843213:
                if (str.equals(m1489((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 1514), 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 874 - View.resolveSize(0, 0)).intern())) {
                    return ImpressionData.class;
                }
                return null;
            case -955341033:
                if (str.equals(m1489((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 35375), 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 830 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    return IAMraidKit.class;
                }
                return null;
            case -758374370:
                if (str.equals(m1489((char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.green(0) + 39, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 742).intern())) {
                    return InneractiveAdViewVideoContentController.class;
                }
                return null;
            case -587023626:
                if (!str.equals(m1489((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 62135), 24 - KeyEvent.normalizeMetaState(0), View.getDefaultSize(0, 0) + 840).intern())) {
                    return null;
                }
                f1212 = (f1213 + 7) % 128;
                return IAmraidWebViewController.class;
            case -312786562:
                if (!str.equals(m1489((char) View.MeasureSpec.getSize(0), 34 - (ViewConfiguration.getJumpTapTimeout() >> 16), ViewConfiguration.getMaximumFlingVelocity() >> 16).intern())) {
                    return null;
                }
                f1212 = (f1213 + 19) % 128;
                return InneractiveInternalBrowserActivity.class;
            case -233888832:
                if (str.equals(m1489((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 5622), 55 - ExpandableListView.getPackedPositionGroup(0L), 930 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    return InneractiveFullscreenAdEventsListenerWithImpressionData.class;
                }
                return null;
            case -50587944:
                if (str.equals(m1489((char) (36890 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 15 - Gravity.getAbsoluteGravity(0, 0), (Process.myPid() >> 22) + 508).intern())) {
                    return UnitDisplayType.class;
                }
                return null;
            case 82:
                if (!str.equals(m1489((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 2379), (Process.myTid() >> 22) + 1, TextUtils.getOffsetBefore("", 0) + 537).intern())) {
                    return null;
                }
                int i10 = f1213 + 65;
                f1212 = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                return R.class;
            case 83843:
                if (str.equals(m1489((char) (TextUtils.indexOf("", "", 0) + 10737), TextUtils.getOffsetBefore("", 0) + 3, 661 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    return Tap.class;
                }
                return null;
            case 114221977:
                if (str.equals(m1489((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28, 424 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    return InneractiveContentController.class;
                }
                return null;
            case 218220615:
                if (!str.equals(m1489((char) (View.MeasureSpec.getMode(0) + 12799), Gravity.getAbsoluteGravity(0, 0) + 24, 386 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    return null;
                }
                f1213 = (f1212 + 21) % 128;
                return InneractiveMediationName.class;
            case 294386593:
                if (str.equals(m1489((char) (48051 - AndroidCharacter.getMirror('0')), (-16777199) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 328).intern())) {
                    return InneractiveAdSpot.class;
                }
                return null;
            case 305774826:
                if (str.equals(m1489((char) (40108 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 49 - TextUtils.getOffsetBefore("", 0), 984 - Color.green(0)).intern())) {
                    return InneractiveAdViewEventsListenerWithImpressionData.class;
                }
                return null;
            case 334157136:
                if (str.equals(m1489((char) (Gravity.getAbsoluteGravity(0, 0) + 25255), ((Process.getThreadPriority(0) + 20) >> 6) + 20, 888 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return IArichMediaVideoView.class;
                }
                return null;
            case 598324252:
                if (str.equals(m1489((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 62503), Color.green(0) + 25, 452 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    return InneractiveUnitController.class;
                }
                return null;
            case 652259752:
                if (!str.equals(m1489((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 23073), View.MeasureSpec.getSize(0) + 44, 664 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    return null;
                }
                int i11 = f1213 + 91;
                f1212 = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                return InneractiveFullscreenAdEventsListenerAdapter.class;
            case 778319234:
                if (!str.equals(m1489((char) (ExpandableListView.getPackedPositionChild(0L) + 43025), 21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getTouchSlop() >> 8) + 782).intern())) {
                    return null;
                }
                int i12 = f1213 + 101;
                f1212 = i12 % 128;
                if (i12 % 2 == 0) {
                    return null;
                }
                return InneractiveUnitController.EventsListenerAdapter.class;
            case 809010015:
                if (str.equals(m1489((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 23 - (ViewConfiguration.getLongPressTimeout() >> 16), 637 - MotionEvent.axisFromString("")).intern())) {
                    return InneractiveInternalBrowserActivity.InternalBrowserListener.class;
                }
                return null;
            case 986039922:
                if (!str.equals(m1489((char) View.MeasureSpec.makeMeasureSpec(0, 0), 20 - View.MeasureSpec.getMode(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 617).intern())) {
                    return null;
                }
                f1212 = (f1213 + 111) % 128;
                return VideoContentListener.class;
            case 996606931:
                if (str.equals(m1489((char) (61610 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, 410 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    return IAConfigManager.class;
                }
                return null;
            case 1840053850:
                if (str.equals(m1489((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) + 71, (ViewConfiguration.getTouchSlop() >> 8) + 34).intern())) {
                    return InneractiveInternalBrowserActivity.class;
                }
                return null;
            case 1945237502:
                if (str.equals(m1489((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 34851), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 205).intern())) {
                    return InneractiveRichMediaVideoPlayerActivityCore.class;
                }
                return null;
            case 1956883725:
                if (!str.equals(m1489((char) (62264 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, Color.rgb(0, 0, 0) + 16777739).intern())) {
                    return null;
                }
                int i13 = f1212 + 49;
                f1213 = i13 % 128;
                if (i13 % 2 == 0) {
                    return InneractiveUnitController.EventsListener.class;
                }
                return InneractiveFullscreenVideoContentController.class;
            case 2019288557:
                if (!str.equals(m1489((char) (ExpandableListView.getPackedPositionType(0L) + 9411), 68 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) + Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE).intern())) {
                    return null;
                }
                int i14 = f1213 + 113;
                f1212 = i14 % 128;
                if (i14 % 2 == 0) {
                    return InneractiveRichMediaVideoPlayerActivityCore.class;
                }
                return InneractiveFullscreenAdActivity.class;
            case 2082429859:
                if (str.equals(m1489((char) TextUtils.getCapsMode("", 0, 0), 21 - TextUtils.indexOf("", "", 0, 0), 909 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    return IArichMediaVideoView.BaseVideoViewListener.class;
                }
                return null;
            case 2110184418:
                if (str.equals(m1489((char) (46321 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 363).intern())) {
                    return InneractiveAdRenderer.class;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1489((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.red(0) + 26, TextUtils.lastIndexOf("", '0') + IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1485((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1489((char) ((KeyEvent.getMaxKeyCode() >> 16) + 34567), 9 - (ViewConfiguration.getTouchSlop() >> 8), View.MeasureSpec.getSize(0) + 1059).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1496((InneractiveAdRequest) list.get(0));
            }
        });
        map.put(m1489((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12 - View.combineMeasuredStates(0, 0), (Process.myPid() >> 22) + 1068).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1479((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1489((char) (24058 - Process.getGidForName("")), TextUtils.indexOf("", "") + 14, 1080 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Boolean.valueOf(bt.m1484((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m1489((char) (ViewConfiguration.getScrollBarSize() >> 8), 9 - View.combineMeasuredStates(0, 0), Color.green(0) + 1094).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Boolean.valueOf(bt.m1498((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m1489((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 18 - (ViewConfiguration.getLongPressTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 1103).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1494((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1489((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 53815), 10 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1121 - TextUtils.getTrimmedLength("")).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1488((InneractiveFullscreenAdActivity) list.get(0));
            }
        });
        map.put(m1489((char) (43213 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 25, 1129 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1474((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m1489((char) ((-1) - Process.getGidForName("")), 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1155 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1480((InneractiveUnitController) list.get(0));
            }
        });
        map.put(m1489((char) (38609 - TextUtils.lastIndexOf("", '0', 0, 0)), 17 - (ViewConfiguration.getTouchSlop() >> 8), 1183 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1487((InneractiveFullscreenVideoContentController) list.get(0));
            }
        });
        map.put(m1489((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Process.getGidForName("") + 18, 1200 - KeyEvent.getDeadChar(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bt.m1491((InneractiveContentController) list.get(0), (VideoContentListener) list.get(1));
                return null;
            }
        });
        map.put(m1489((char) (19659 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 9 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1217).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1492((InneractiveAdViewUnitController) list.get(0));
            }
        });
        map.put(m1489((char) Color.argb(0, 0, 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1226).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1478((String) list.get(0));
            }
        });
        map.put(m1489((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 20 - KeyEvent.normalizeMetaState(0), 1247 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Integer.valueOf(bt.m1475());
            }
        });
        map.put(m1489((char) (31127 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, 1268 - View.getDefaultSize(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bt.m1483((ImpressionData) list.get(0));
            }
        });
        int i10 = f1213 + 69;
        f1212 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1491(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i10 = f1213 + 55;
        f1212 = i10 % 128;
        int i11 = i10 % 2;
        m1497(inneractiveContentController, eventsListener);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f1212 + 1;
        f1213 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 8 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m1497(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        f1213 = (f1212 + 97) % 128;
        inneractiveContentController.setEventsListener(eventsListener);
        int i10 = f1213 + 49;
        f1212 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 45 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        f1212 = (f1213 + 17) % 128;
        String version = InneractiveAdManager.getVersion();
        int i10 = f1213 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1212 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 30 / 0;
        }
        return version;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1481(InneractiveAdRequest inneractiveAdRequest) {
        int i10 = f1213 + 7;
        f1212 = i10 % 128;
        if (i10 % 2 == 0) {
            inneractiveAdRequest.getSpotId();
            throw null;
        }
        String spotId = inneractiveAdRequest.getSpotId();
        f1213 = (f1212 + 105) % 128;
        return spotId;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static InneractiveAdSpot m1486(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        f1213 = (f1212 + 37) % 128;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        int i10 = f1212 + 47;
        f1213 = i10 % 128;
        if (i10 % 2 == 0) {
            return adSpot;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1490(ImpressionData impressionData) {
        int i10 = f1212 + 83;
        f1213 = i10 % 128;
        int i11 = i10 % 2;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        if (i11 != 0) {
            int i12 = 66 / 0;
        }
        return advertiserDomain;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1489(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f1214[i11 + i12] ^ (i12 * f1215)) ^ c10);
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static InneractiveContentController.EventsListener m1493(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f1212 = (f1213 + 11) % 128;
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        f1212 = (f1213 + 45) % 128;
        return eventsListener;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int m1470() {
        f1212 = (f1213 + 111) % 128;
        int i10 = R.id.inneractive_webview_mraid;
        int i11 = f1213 + 95;
        f1212 = i11 % 128;
        if (i11 % 2 != 0) {
            return i10;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Object m1482(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i10 = f1213 + 7;
        f1212 = i10 % 128;
        int i11 = i10 % 2;
        ViewGroup layout = inneractiveFullscreenAdActivity.getLayout();
        if (i11 == 0) {
            int i12 = 56 / 0;
        }
        int i13 = f1212 + 93;
        f1213 = i13 % 128;
        if (i13 % 2 == 0) {
            return layout;
        }
        throw null;
    }
}

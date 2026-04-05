package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bj extends bg {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1032 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1033 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1036 = {51437, 65012, 41643, 22346, 7186, 49462, 63469, 48287, 24909, 5656, 56091, 33259, 46722, 31565, 8292, 54569, 39930, 16517, 43356, 40047, 49970, 14052, 32167, 41111, 38486, 56626, 252, 30644, 47748, 57431, 55046, 6902, 16855, 46232, 64073, 8484, 5359, 23504, 'C', 13680, 27181, 40952, 54424, 2454, 16205, 29735, 'C', 13680, 27177, 40947, 54444, 2451, 16205, 29738, 43513, 57005, 5018, 'C', 13680, 27181, 40955, 54456, 2440, 16201, 29741, 43491, 57003, 5019, 18760, 32276, 46063, 59611, 7567, 21315, 34859, 48581, 62165, 10140, 23923, 37434, 50967, 64708, 12699, 37916, 41241, 65117, 3001, 16628, 40400, 43783, 57460, 'A', 13654, 27175, 40951, 54436, 2454, 16206, 29759, 43507, 57001, 'I', 13660, 27152, 40947, 54458, 2441, 16216, 29751, 43492, 57003, 5013, 18762, 32283, 46059, 59600, 7554, 21314, 34867, 48615, 62173, 'S', 13638, 27141, 40932, 54460, 2489, 16205, 29746, 43516, 56992, 5013, 18757, 32307, '6', 13596, 27221, 40888, 54520, GMTDateParser.SECONDS, 13655, 27152, 40898, 54442, 2494, 16201, 29746, 43509, 56997, 5013, 18770, 32317, 'g', 13655, 27152, 40917, 54432, 2459, 16222, 29738, 43506, 57005, 5019, 18773, 32300, 46030, 59609, 7554, 21317, 34869, 48613, 62146, 10125, 9479, 4151, 20336, 47797, 61888, 11515, 6718, 20810, 35986, 64461, 14075, 27701, 23372, 38588, 52708, 14545, 30324, 44397, 39124, 55186, 749, 30742, 46921, 57977, 55729, 5366, 16913, 'c', 13632, 27137, 40951, 54460, 2463, 16248, 29724, 43475, 57002, 5013, 18772, 32300, 46056, 59603, 7553, 21331, 34854, 48576, 62163, 10116, 23935, 37419, 50975, 64708, 12679, 'i', 13633, 27187, 40947, 54442, 2476, 16197, 29755, 43495, 56967, 5018, 18759, 32314, 46054, 59609, 7562, 534, 14142, 26703, 40331, 55027, 3040, 15679, 30276, 43912, 56540, 4607, 19260};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1037 = -4703846895164574414L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1034 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1038 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1035 = 43951;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends ChartboostDelegate implements hc<ChartboostDelegate> {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f1048 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f1049 = 1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static long f1050;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f1051;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private ChartboostDelegate f1052;

        /* renamed from: ｋ, reason: contains not printable characters */
        private ch f1053;

        static {
            char[] cArr = new char[1261];
            com.google.android.gms.internal.play_billing.a.y("\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0012tô ¸Ígù!%ìQ\u0091}\u009bªHÖ\u0001\u0002Ê.\u0099[Q\u0087)³õß¢\ft8>dô\u0090¶¼\u0094éL\u0015\u001aAÏm\u00857l\u001b|o8³ì\u0087·êj>\"\u0002ÝV\u0084¹H\u008d%ÑÃ%\u0087\tµ\\r ;ôëØ¡+'\u007f=CÛ\u0097\u0097úHÎ\u000e\u0012Ãf¨J¸\u009deá+5ì\u0019¤ls°\u0006\u0084Úè\u008d;[\u000f\u0011SÛ§\u0099\u008b»Þc\"5vàZª\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍQù,%ëQ«}\u009bªpÖ\u001a\u0002Û.\u008f[W\u0087\u0013³ïß¿\fe8%dæ\u0090®%n\t~}:¡î\u0095µøh, \u0010ßD\u0086«J\u009f'ÃÁ7\u0085\u001b·Np²9æéÊ£9%m(QØ\u0085\u009eèyÜ\u0001\u0000Ìt\u0082X\u0087\u008f{ó\u0015'í\u000b¦~l¢\u0004\u0096Øú\u008f)Y\u001d\u0013AÙµ\u009b\u0099¹Ìa07dâH¨Gékù\u001f½Ãi÷2\u009aïN§rX&\u0001ÉÍý ¡FU\u0002y0,÷Ð¾\u0084n¨$[¢\u000f¯3_ç\u0019\u008aü¾\u008ebQ\u0016\u0004:=íà\u0091\u00adELi.\u001cûÀ¯ôC\u0098\u000fKÏ\u007f\u008f#Y×\u0001û6®þ¼\u0004\u0090\u0014äP8\u0084\fßa\u0002µJ\u0089µÝì2 \u0006MZ«®ï\u0082Ý×\u001a+S\u007f\u0083SÉ OôBÈ²\u001côq\u0016Ef\u0099 í÷ÁÜ\u00167j]¾\u009c\u0092Èç\u0010;T\u000f¨cø°\"\u0084bØ¡,é\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍQù!%áQ }\u0095ªpÖ\u001a\u0002Û.\u008f[W\u0087\u0013³ïß¿\fe8%dæ\u0090®\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍVù$%ûQ³}\u0092ªXÖ\r\u0002æ.\u0084[Q\u0087\u0005³éß¥\fe8%dó\u0090«¼\u009céThPD@0\u0004ìÐØ\u008bµVa\u001e]á\t¸ætÒ\u0019\u008eÿz»V\u0089\u0003Nÿ\u0007«×\u0087\u009dt\u001b \u0016\u001cæÈ ¥B\u00911Mö9 \u0015\u0081ÂO¾\u0013jÙF°3Xï\u0007Ûí··dqP+\fýø¥Ô\u0087\u0081J}\f_^sN\u0007\nÛÞï\u0085\u0082XV\u0010jï>¶Ñzå\u0017¹ñMµa\u00874@È\t\u009cÙ°\u0093C\u0015\u0017\u000f+éÿ¥\u0092z¦<zñ\u000e\u008c\"\u0086õU\u0089\u001c]×q\u0084\u0004LØ0ìé\u0080¹Sig\u0010;êÏ¯ã\u0093\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍQù,%ëQ«}\u009bªtÖ\u001b\u0002Ý.\u008f[d\u0087\u0010³ëß¥Ø?ô/\u0080k\\¿hä\u00059Ñqí\u008e¹×V\u001bbv>\u0090ÊÔææ³!Oh\u001b¸7òÄt\u0090n¬\u0088xÄ\u0015\u001b!]ý\u0090\u0089û¥ër6\u000exÚ¿ö÷\u0083 _Qk\u0088\u0007ØÔ\bàq¼\u008bHÎdò\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍTù,%áQ¯}ªªVÖ8\u0002À.\u008b[A\u0087-³ôß¤\ft8\rd÷\u0090²¼\u008e\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍVù$%ûQ®}\u0097ªJÖ\u0007\u0002â.\u0085[W\u0087\u0005³Úß¦\fa8?ú(Ö8¢|~¨Jó'.ófÏ\u0099\u009bÀt\f@a\u001c\u0087èÃÄñ\u00916m\u007f9¯\u0015åæc²n\u008e\u009eZØ7:\u0003Jß\u008c«Û\u0087ðP\u001f,pø¶Ôä¡\u000f}{I\u0080%Î\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍQù!%áQ }\u0095ªtÖ\u001b\u0002Ý.\u008f[d\u0087\u0010³ëß¥\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍVù$%ûQ³}\u0092ªXÖ\r\u0002â.\u0085[W\u0087\u0005³Úß¦\fa8?\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍTù,%áQ¯}ªªVÖ&\u0002Ê.\u0089[J\u0087\u0012³ÿß\u0095\f}8%dä\u0090©u0Y -dñ°Åë¨6|~@\u0081\u0014Øû\u0014Ïy\u0093\u009fgÛKé\u001e.âg¶·\u009aýi{=v\u0001\u0086ÕÀ¸1\u008c_P\u008e$Ã\bèß\t£kwµ[ú.=òUÆ\u0087ª×y!MP\u0011\u009aå×Éç\u009c9`m4¼\u0018îï>³C\u0087\u0087\u008d\u0003¡5Õu\t\u0086=êP5\u0084v¸\u009fìü\u0003\u00187@k\u008d\u009fÈ³Þæ2\u001a`N\u0094bã\u0091/Å`ù\u0092-Â@\u0018tK¨\u009bÜÍðö'0u\u001cY\f-Hñ\u009cÅÇ¨\u001a|R@\u00ad\u0014ôû8ÏU\u0093³g÷KÅ\u001e\u0002âK¶\u009b\u009aÑiW=M\u0001«Õç¸8\u008c~P³$Ø\bÈß\u0015£[w\u009c[Ô.\u0003òmÆ¡ªþy/Ma\u0011¼åøÉÆ\u009c1`E4\u0095\u0018Óï\u0014\u001aö6æB¢\u009evª-Çð\u0013¸/G{\u001e\u0094Ò ¿üY\b\u001d$/qè\u008d¡Ùqõ;\u0006½R°n@º\u0006×äã\u0099?^K\u001eg.°ÞÌ¤\u0018m4>Aâ\u009d±©KÅ\u0007\u0016ò\"\u0090~V\u008a\u0012¦'\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍTù,%áQ¯}ªªVÖ8\u0002À.\u008b[A\u00872³þß¡\fp8>dã\u0090§¼\u0099én\u0015\u001aAÊm\u008c\u009aKjÜFÌ2\u0088î\\Ú\u0007·Úc\u0092_m\u000b4äøÐ\u0095\u008csx7T\u0005\u0001Âý\u008b©[\u0085\u0011v\u0097\"\u009a\u001ejÊ,§É\u0093»Od;1\u0017\bÀÕ¼\u0098hbD\u00101Íí\u009eÙvµ-fëR·\u000eNú4Ö\u0006\u0083Â\u007f\u0083ý\u001fÑ\u000f¥Ky\u009fMÄ \u0019ôQÈ®\u009c÷s;GV\u001b°ïôÃÆ\u0096\u0001jH>\u0098\u0012ÒáTµY\u0089©]ï0\r\u0004}Ø»¬ì\u0080ÇW7+Mÿ\u0084Ó×¦\u000bzXN¢\"îñ\u001bÅy\u0099¿mûAÎ\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍQù!%áQ }\u0095ªkÖ\u0011\u0002Ø.\u008b[W\u0087\u0004³þß²\fG8%dã\u0090§¼\u0092\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍQù\"%åQ³}\u0092ª\\Ö\u0000\u0002Ê.¸[@\u0087\u0017³úß¤\fu8)dã\u0090\u0094¼\u0094é\\\u0015\u0016AÁ\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍVù$%ûQ³}\u0092ªXÖ\r\u0002ý.\u008f[R\u0087\u0001³éß²\ft8(dÑ\u0090«¼\u0099é]\u0015\u001c\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0016tõ »Í~ù\t%áQ°}\u008eªUÖ\u0015\u0002Ö.¼[L\u0087\u0004³þß¹\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³ÍQù,%ëQ«}\u009bªpÖ\u001a\u0002ÿ.\u0086[D\u0087\u0019Ò§þ·\u008aóV'b|\u000f¡Ûéç\u0016³O\\\u0083hî4\bÀLì~¹¹Eð\u0011 =jÎì\u009aá¦\u0011rW\u001f°+È÷\u0005\u0083K¯Nx²\u0004ÜÐ$üo\u0089¥UÍa\u0011\rbÞ\u0099êÉ¶\u001a\u0000C,SX\u0017\u0084Ã°\u0098ÝE\t\r5òa«\u008egº\næì\u0012¨>\u009ak]\u0097\u0014ÃÄï\u008e\u001c\bH\u0005tõ ³Í[ù#%áQ·}\u0097ªXÖ\u0018\u0002Æ.\u0090[@", "ISO-8859-1", cArr, 0, 1261);
            f1051 = cArr;
            f1050 = 795143199028948027L;
        }

        public b(ChartboostDelegate chartboostDelegate, ch chVar) {
            this.f1052 = chartboostDelegate;
            this.f1053 = chVar;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private ChartboostDelegate m1246() {
            int i10 = f1048;
            int i11 = i10 + 57;
            f1049 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            ChartboostDelegate chartboostDelegate = this.f1052;
            f1049 = (i10 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
            return chartboostDelegate;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m1247(char c10, int i10, int i11) {
            String str;
            synchronized (c.f1373) {
                try {
                    char[] cArr = new char[i10];
                    c.f1374 = 0;
                    while (true) {
                        int i12 = c.f1374;
                        if (i12 < i10) {
                            cArr[i12] = (char) ((f1051[i11 + i12] ^ (i12 * f1050)) ^ c10);
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

        public void didCacheInPlay(String str) {
            f1048 = (f1049 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionGroup(0L) + 33, View.resolveSize(0, 0) + 1158).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCacheInPlay(str);
            }
            f1049 = (f1048 + 23) % 128;
        }

        public void didCacheInterstitial(String str) {
            f1049 = (f1048 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 'W' - AndroidCharacter.getMirror('0'), 88 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCacheInterstitial(str);
                f1049 = (f1048 + 49) % 128;
            }
        }

        public void didCacheMoreApps(String str) {
            bj.this.m1169(this, this.f1053, m1247((char) View.resolveSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 35, 413 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                int i10 = f1049 + 63;
                f1048 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didCacheMoreApps(str);
                if (i11 != 0) {
                    throw null;
                }
            }
            int i12 = f1049 + 87;
            f1048 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }

        public void didCacheRewardedVideo(String str) {
            bj.this.m1169(this, this.f1053, m1247((char) (Drawable.resolveOpacity(0, 0) + 6837), (KeyEvent.getMaxKeyCode() >> 16) + 40, 831 - TextUtils.indexOf("", "", 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1048 = (f1049 + 37) % 128;
                chartboostDelegate.didCacheRewardedVideo(str);
                f1049 = (f1048 + 109) % 128;
            }
        }

        public void didClickInterstitial(String str) {
            f1048 = (f1049 + 77) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 38, TextUtils.indexOf("", "", 0, 0) + 251).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                chartboostDelegate.didClickInterstitial(str);
            }
            f1048 = (f1049 + 99) % 128;
        }

        public void didClickMoreApps(String str) {
            f1049 = (f1048 + 109) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) Color.green(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 34, View.MeasureSpec.getMode(0) + 600).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                chartboostDelegate.didClickMoreApps(str);
                f1048 = (f1049 + 19) % 128;
            }
        }

        public void didClickRewardedVideo(String str) {
            f1048 = (f1049 + 49) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (ViewConfiguration.getEdgeSlop() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 998).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1049 = (f1048 + 21) % 128;
                chartboostDelegate.didClickRewardedVideo(str);
            }
        }

        public void didCloseInterstitial(String str) {
            bj.this.m1169(this, this.f1053, m1247((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48198), 39 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.getDefaultSize(0, 0) + 212).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1048 = (f1049 + 115) % 128;
                chartboostDelegate.didCloseInterstitial(str);
            }
            int i10 = f1048 + 37;
            f1049 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didCloseMoreApps(String str) {
            f1049 = (f1048 + 107) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (64107 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 34 - ExpandableListView.getPackedPositionChild(0L), 565 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1048 = (f1049 + 13) % 128;
                chartboostDelegate.didCloseMoreApps(str);
            }
            f1049 = (f1048 + 69) % 128;
        }

        public void didCloseRewardedVideo(String str) {
            bj.this.m1169(this, this.f1053, m1247((char) (64859 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 40 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 959).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1049 = (f1048 + 75) % 128;
                chartboostDelegate.didCloseRewardedVideo(str);
                f1049 = (f1048 + 13) % 128;
            }
        }

        public void didCompleteInterstitial(String str) {
            f1049 = (f1048 + 9) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (TextUtils.getCapsMode("", 0, 0) + 26643), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, (ViewConfiguration.getTouchSlop() >> 8) + 331).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                int i10 = f1049 + 67;
                f1048 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didCompleteInterstitial(str);
                if (i11 != 0) {
                    throw null;
                }
            }
        }

        public void didCompleteRewardedVideo(String str, int i10) {
            f1048 = (f1049 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (ImageFormat.getBitsPerPixel(0) + 1), Gravity.getAbsoluteGravity(0, 0) + 43, (ViewConfiguration.getDoubleTapTimeout() >> 16) + IronSourceError.ERROR_RV_SHOW_EXCEPTION).intern(), str, Integer.valueOf(i10));
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1048 = (f1049 + 31) % 128;
                chartboostDelegate.didCompleteRewardedVideo(str, i10);
                f1048 = (f1049 + 49) % 128;
            }
        }

        public void didDismissInterstitial(String str) {
            f1049 = (f1048 + 93) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (18346 - View.MeasureSpec.getMode(0)), 41 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetAfter("", 0) + 171).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                int i10 = f1049 + 3;
                f1048 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didDismissInterstitial(str);
                if (i11 != 0) {
                    throw null;
                }
            }
        }

        public void didDismissRewardedVideo(String str) {
            bj.this.m1169(this, this.f1053, m1247((char) (27295 - Color.blue(0)), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 916 - (Process.myPid() >> 22)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1048 = (f1049 + 111) % 128;
                chartboostDelegate.didDismissRewardedVideo(str);
            }
            f1048 = (f1049 + 13) % 128;
        }

        public void didDisplayInterstitial(String str) {
            f1049 = (f1048 + 85) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0) + 41, 291 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDisplayInterstitial(str);
                f1048 = (f1049 + 1) % 128;
            }
        }

        public void didDisplayMoreApps(String str) {
            f1049 = (f1048 + 37) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) Color.alpha(0), 37 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 635).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                int i10 = f1048 + 79;
                f1049 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didDisplayMoreApps(str);
                if (i11 == 0) {
                    throw null;
                }
            }
        }

        public void didDisplayRewardedVideo(String str) {
            bj.this.m1169(this, this.f1053, m1247((char) KeyEvent.normalizeMetaState(0), 42 - (ViewConfiguration.getTapTimeout() >> 16), 1081 - Color.green(0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1048 = (f1049 + 63) % 128;
                chartboostDelegate.didDisplayRewardedVideo(str);
                f1048 = (f1049 + 59) % 128;
            }
            int i10 = f1048 + 19;
            f1049 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            bj.this.m1169(this, this.f1053, m1247((char) ((Process.myPid() >> 22) + 53988), AndroidCharacter.getMirror('0') - '\n', 1192 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1048 = (f1049 + 19) % 128;
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
                f1049 = (f1048 + 23) % 128;
            }
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            f1048 = (f1049 + 101) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (Color.green(0) + 9517), (ViewConfiguration.getEdgeSlop() >> 16) + 44, 127 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                int i10 = f1048 + 97;
                f1049 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
                if (i11 == 0) {
                    throw null;
                }
            }
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            bj.this.m1169(this, this.f1053, m1247((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0, 0) + 41, (-16776728) - Color.rgb(0, 0, 0)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
                f1048 = (f1049 + 1) % 128;
            }
            int i10 = f1048 + 53;
            f1049 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            bj.this.m1169(this, this.f1053, m1247((char) View.combineMeasuredStates(0, 0), 44 - TextUtils.indexOf((CharSequence) "", '0'), 871 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                int i10 = f1049 + 17;
                f1048 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
                if (i11 != 0) {
                    throw null;
                }
            }
            f1048 = (f1049 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            bj.this.m1169(this, this.f1053, m1247((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 40, 672 - KeyEvent.normalizeMetaState(0)).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                int i10 = f1049 + 85;
                f1048 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
                if (i11 != 0) {
                    throw null;
                }
            }
            f1048 = (f1049 + 7) % 128;
        }

        public void didInitialize() {
            f1049 = (f1048 + 55) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) Color.argb(0, 0, 0, 0), 32 - (Process.myTid() >> 22), 1229 - Color.red(0)).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                int i10 = f1049 + 11;
                f1048 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didInitialize();
                if (i11 != 0) {
                    throw null;
                }
            }
        }

        public void didPauseClickForConfirmation(Activity activity) {
            f1048 = (f1049 + 67) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (30067 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 47, 710 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                f1048 = (f1049 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
                try {
                    chartboostDelegate.getClass().getDeclaredMethod(m1247((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36198), ((Process.getThreadPriority(0) + 20) >> 6) + 28, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 758).intern(), Activity.class).invoke(this.f1052, activity);
                } catch (Throwable unused) {
                }
            }
        }

        public boolean shouldDisplayInterstitial(String str) {
            f1048 = (f1049 + 3) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (TextUtils.indexOf((CharSequence) "", '0') + 14128), 44 - TextUtils.getOffsetBefore("", 0), 44 - Color.blue(0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate == null) {
                return false;
            }
            boolean zShouldDisplayInterstitial = chartboostDelegate.shouldDisplayInterstitial(str);
            int i10 = f1049 + 81;
            f1048 = i10 % 128;
            if (i10 % 2 == 0) {
                return zShouldDisplayInterstitial;
            }
            throw null;
        }

        public boolean shouldDisplayMoreApps(String str) {
            f1049 = (f1048 + 99) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (55420 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 40 - View.combineMeasuredStates(0, 0), 447 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate == null) {
                return false;
            }
            int i10 = f1048 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f1049 = i10 % 128;
            if (i10 % 2 != 0) {
                return chartboostDelegate.shouldDisplayMoreApps(str);
            }
            boolean zShouldDisplayMoreApps = chartboostDelegate.shouldDisplayMoreApps(str);
            int i11 = 83 / 0;
            return zShouldDisplayMoreApps;
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            f1048 = (f1049 + 113) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30046), View.MeasureSpec.getSize(0) + 45, View.MeasureSpec.makeMeasureSpec(0, 0) + 786).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate == null) {
                return false;
            }
            boolean zShouldDisplayRewardedVideo = chartboostDelegate.shouldDisplayRewardedVideo(str);
            f1049 = (f1048 + 17) % 128;
            return zShouldDisplayRewardedVideo;
        }

        public boolean shouldRequestInterstitial(String str) {
            f1049 = (f1048 + 87) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) ExpandableListView.getPackedPositionGroup(0L), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                return chartboostDelegate.shouldRequestInterstitial(str);
            }
            f1048 = (f1049 + 69) % 128;
            return false;
        }

        public boolean shouldRequestMoreApps(String str) {
            f1048 = (f1049 + 99) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (24349 - View.MeasureSpec.makeMeasureSpec(0, 0)), KeyEvent.normalizeMetaState(0) + 40, 373 - (Process.myPid() >> 22)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate == null) {
                return false;
            }
            f1049 = (f1048 + 95) % 128;
            return chartboostDelegate.shouldRequestMoreApps(str);
        }

        public void willDisplayVideo(String str) {
            f1049 = (f1048 + 59) % 128;
            bj.this.m1169(this, this.f1053, m1247((char) (KeyEvent.getMaxKeyCode() >> 16), Color.green(0) + 35, Process.getGidForName("") + 1124).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                int i10 = f1049 + 31;
                f1048 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.willDisplayVideo(str);
                if (i11 != 0) {
                    throw null;
                }
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hc
        /* renamed from: ｋ */
        public final /* synthetic */ ChartboostDelegate mo1115() {
            f1049 = (f1048 + 3) % 128;
            ChartboostDelegate chartboostDelegateM1246 = m1246();
            int i10 = f1049 + 49;
            f1048 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 1 / 0;
            }
            return chartboostDelegateM1246;
        }

        public void didDismissMoreApps(String str) {
            f1048 = (f1049 + 71) % 128;
            bj bjVar = bj.this;
            ch chVar = this.f1053;
            char mode = (char) View.MeasureSpec.getMode(0);
            String str2 = KGUkpTlXZlJLy.WRTsRfOBMlx;
            bjVar.m1169(this, chVar, m1247(mode, TextUtils.indexOf(str2, str2) + 37, 527 - ExpandableListView.getPackedPositionChild(0L)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f1052;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDismissMoreApps(str);
            }
            f1049 = (f1048 + 7) % 128;
        }
    }

    public bj(String str) {
        super(str);
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static boolean m1226() {
        f1033 = (f1032 + 15) % 128;
        boolean z10 = m1227() instanceof b;
        int i10 = f1032 + 81;
        f1033 = i10 % 128;
        if (i10 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static Object m1227() {
        com.chartboost.sdk.a delegate;
        int i10 = f1032 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1033 = i10 % 128;
        if (i10 % 2 == 0) {
            delegate = Chartboost.getDelegate();
            int i11 = 66 / 0;
        } else {
            delegate = Chartboost.getDelegate();
        }
        int i12 = f1033 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1032 = i12 % 128;
        if (i12 % 2 == 0) {
            return delegate;
        }
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1228() {
        int i10 = f1032 + 95;
        f1033 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1229();
        }
        m1229();
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static boolean m1229() {
        f1033 = (f1032 + 3) % 128;
        boolean zIsWebViewEnabled = Chartboost.isWebViewEnabled();
        int i10 = f1032 + 105;
        f1033 = i10 % 128;
        if (i10 % 2 != 0) {
            return zIsWebViewEnabled;
        }
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static Object m1230() {
        f1032 = (f1033 + 65) % 128;
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.d;
        int i10 = f1033 + 63;
        f1032 = i10 % 128;
        if (i10 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1231() {
        f1032 = (f1033 + 13) % 128;
        Object objM1227 = m1227();
        f1032 = (f1033 + 19) % 128;
        return objM1227;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ Object m1232() {
        int i10 = f1032 + 33;
        f1033 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1230();
        }
        m1230();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1236(ChartboostDelegate chartboostDelegate) {
        f1033 = (f1032 + 89) % 128;
        m1243(chartboostDelegate);
        int i10 = f1032 + 53;
        f1033 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1237(CBInPlay cBInPlay) {
        f1033 = (f1032 + 73) % 128;
        String strM1233 = m1233(cBInPlay);
        f1033 = (f1032 + 75) % 128;
        return strM1233;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1239(CBInPlay cBInPlay) {
        f1032 = (f1033 + 97) % 128;
        String strM1242 = m1242(cBInPlay);
        f1033 = (f1032 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return strM1242;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ b m1240(bj bjVar, ChartboostDelegate chartboostDelegate, ch chVar) {
        int i10 = f1032 + 41;
        f1033 = i10 % 128;
        int i11 = i10 % 2;
        b bVarM1238 = bjVar.m1238(chartboostDelegate, chVar);
        if (i11 == 0) {
            int i12 = 44 / 0;
        }
        int i13 = f1032 + 111;
        f1033 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 5 / 0;
        }
        return bVarM1238;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        int i10 = f1032 + 111;
        f1033 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Chartboost.getSDKVersion();
                throw null;
            }
            String sDKVersion = Chartboost.getSDKVersion();
            f1033 = (f1032 + 103) % 128;
            return sDKVersion;
        } catch (Error unused) {
            return m1241((char) (TextUtils.lastIndexOf("", '0') + 1), AndroidCharacter.getMirror('0') - '+', 134 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1244(bj bjVar, ch chVar) {
        f1032 = (f1033 + 7) % 128;
        bjVar.m1234(chVar);
        int i10 = f1032 + 35;
        f1033 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032d  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bj.mo1110(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1241((char) (Process.myPid() >> 22), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, 138 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bj.m1244(bj.this, chVar);
                return null;
            }
        });
        map.put(m1241((char) (Process.myPid() >> 22), AndroidCharacter.getMirror('0') - 27, 152 - View.resolveSize(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bj.m1231();
            }
        });
        map.put(m1241((char) (TextUtils.indexOf("", "", 0, 0) + 9568), TextUtils.lastIndexOf("", '0', 0) + 28, 173 - Color.blue(0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bj.m1232();
            }
        });
        map.put(m1241((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - (Process.myPid() >> 22), 200 - View.resolveSizeAndState(0, 0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bj.m1240(bj.this, (ChartboostDelegate) list.get(0), chVar);
            }
        });
        map.put(m1235("媡☂婒ㄛ", (char) View.MeasureSpec.makeMeasureSpec(0, 0), "基ᓓᶉ廙ቛ霪访\udce3쥋뉱묻ꣲ栝썏쒧虈渁\ufddc业퍡\uda07", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1378222683, "\u0000\u0000\u0000\u0000").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bj.m1236((ChartboostDelegate) list.get(0));
                return null;
            }
        });
        map.put(m1241((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 226 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Boolean.valueOf(bj.m1228());
            }
        });
        map.put(m1235("薕\ud8b8ꮾ覡", (char) Color.blue(0), "쿔\uf732ꚉ뭖\uf078㕐\ud8a9\ue15b\uf6c8\uf689䲡", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1093093243, "\u0000\u0000\u0000\u0000").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bj.m1237((CBInPlay) list.get(0));
            }
        });
        map.put(m1235("繅튚䊲㓔", (char) TextUtils.getOffsetBefore("", 0), "빘쪥\uf249阦憝ጩ閍묃\uf0e1\uf8c6", AndroidCharacter.getMirror('0') - '0', "\u0000\u0000\u0000\u0000").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bj.m1239((CBInPlay) list.get(0));
            }
        });
        map.put(m1241((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 639), 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 242 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Boolean.valueOf(bj.m1245(bj.this));
            }
        });
        int i10 = f1033 + 113;
        f1032 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1245(bj bjVar) {
        f1032 = (f1033 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        boolean zM1226 = m1226();
        int i10 = f1033 + 5;
        f1032 = i10 % 128;
        if (i10 % 2 == 0) {
            return zM1226;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m1243(ChartboostDelegate chartboostDelegate) {
        int i10 = f1032 + 25;
        f1033 = i10 % 128;
        int i11 = i10 % 2;
        Chartboost.setDelegate(chartboostDelegate);
        if (i11 == 0) {
            throw null;
        }
        f1032 = (f1033 + 65) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1242(CBInPlay cBInPlay) {
        int i10 = f1032 + 7;
        f1033 = i10 % 128;
        if (i10 % 2 == 0) {
            cBInPlay.getAppName();
            throw null;
        }
        String appName = cBInPlay.getAppName();
        int i11 = f1032 + 87;
        f1033 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 8 / 0;
        }
        return appName;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m1234(ch chVar) {
        f1033 = (f1032 + 111) % 128;
        m1243(m1238((ChartboostDelegate) m1227(), chVar));
        f1032 = (f1033 + 73) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1241(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f1036[i11 + i12] ^ (i12 * f1037)) ^ c10);
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
    private static String m1233(CBInPlay cBInPlay) {
        int i10 = f1033 + 49;
        f1032 = i10 % 128;
        int i11 = i10 % 2;
        String location = cBInPlay.getLocation();
        if (i11 != 0) {
            int i12 = 6 / 0;
        }
        f1032 = (f1033 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        return location;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private b m1238(ChartboostDelegate chartboostDelegate, ch chVar) {
        b bVar = new b(chartboostDelegate, chVar);
        int i10 = f1032 + 55;
        f1033 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
        return bVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1235(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1034) ^ f1038) ^ f1035);
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

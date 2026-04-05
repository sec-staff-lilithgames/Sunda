package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.lib.samodelspace.saad.SACreative;
import tv.superawesome.lib.samodelspace.saad.SACreativeFormat;
import tv.superawesome.lib.samodelspace.saad.SADetails;
import tv.superawesome.lib.samodelspace.saad.SAMedia;
import tv.superawesome.lib.samodelspace.saad.SAResponse;
import tv.superawesome.lib.samodelspace.vastad.SAVASTAd;
import tv.superawesome.lib.samodelspace.vastad.SAVASTMedia;
import tv.superawesome.lib.sawebplayer.SAWebPlayer;
import tv.superawesome.lib.sawebplayer.SAWebView;
import tv.superawesome.sdk.publisher.AwesomeAds;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAEvent;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAInterstitialAd;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoActivity;
import tv.superawesome.sdk.publisher.SAVideoAd;
import tv.superawesome.sdk.publisher.SAVideoClick;
import tv.superawesome.sdk.publisher.managed.AdViewJavaScriptBridge;
import tv.superawesome.sdk.publisher.managed.SACustomWebView;
import tv.superawesome.sdk.publisher.managed.SAManagedAdActivity;
import tv.superawesome.sdk.publisher.managed.SAManagedAdView;
import tv.superawesome.sdk.publisher.video.AdVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayer;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerController;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerActivity;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cd extends bg {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1440 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1441 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f1442 = 18667;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1443 = 62515;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1444 = 1062823643045293647L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1445 = 47905;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1446 = 15204;

    public cd(String str) {
        super(str);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ SAInterface m1796() {
        int i10 = f1441 + 39;
        f1440 = i10 % 128;
        if (i10 % 2 != 0) {
            m1797();
            throw null;
        }
        SAInterface sAInterfaceM1797 = m1797();
        f1441 = (f1440 + 23) % 128;
        return sAInterfaceM1797;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static SAInterface m1797() {
        f1441 = (f1440 + 85) % 128;
        SAInterface listener = SAVideoAd.getListener();
        int i10 = f1441 + 61;
        f1440 = i10 % 128;
        if (i10 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1799(SAAd sAAd) {
        f1440 = (f1441 + 59) % 128;
        JSONObject jSONObjectM1801 = m1801(sAAd);
        f1440 = (f1441 + 63) % 128;
        return jSONObjectM1801;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1802(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.f3166) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3167 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3167;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1442)) ^ ((c11 >>> 5) + f1446)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1445) ^ ((c12 + i12) ^ ((c12 << 4) + f1443))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3167;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3167 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m1803(SABannerAd sABannerAd, SAInterface sAInterface) {
        f1440 = (f1441 + 79) % 128;
        sABannerAd.setListener(sAInterface);
        f1440 = (f1441 + 83) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final Class mo1110(String str) {
        switch (str.hashCode()) {
            case -1959951430:
                if (str.equals(m1798("Ĕ傀\ued26㗿ŕ뺫\u31eeｻ롌\uf76e碓놆猀〦ꉉࣿ⫒䫀\ue51b쌰\ue590菍ⳇ驎齔\udc9e鞞岰嘕ᕒ\ud957", 1 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    return AdVideoPlayerControllerView.class;
                }
                return null;
            case -1855458488:
                if (str.equals(m1802("⠤躲짒静䡾挧䬖\uaa3e\udaf9❽뎤뇞車걑엞뉆\uf311\uf294诓⺡뎤뇞䄆疷\u05ec↊\u175d\ue822뵗௨\uec21⏠뎤뇞", 35 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    return IVideoPlayerControllerView.Listener.class;
                }
                return null;
            case -1788589794:
                if (str.equals(m1798("ⳛ덮䁏샂Ⲛ嵅鲇\u0a46閂ᒒ헟䒊廕폈༊ﷄܝ꤄䡭㘗졩怣膨潻느㽰", -ImageFormat.getBitsPerPixel(0)).intern())) {
                    return AdViewJavaScriptBridge.class;
                }
                return null;
            case -1718372116:
                if (str.equals(m1798("ᤅ⧤ⳔẨᥖ쟪\uf00f퐳ꁜ踁륺", View.combineMeasuredStates(0, 0) + 1).intern())) {
                    return SAEvent.class;
                }
                return null;
            case -1711491530:
                if (str.equals(m1802("깋䅺⥀嬶ԉ꣹艌\ue9ca", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8).intern())) {
                    return SAMedia.class;
                }
                return null;
            case -1305374924:
                if (str.equals(m1802("࣯䜫\uf554慙ꏟ∱뎤뇞㟮Ꙫ햠ꓵ她杬⢋簂\ue603\uf4faⴻ᧮㊅廊뇅姪\uefcb\uec30磼ᳪᏠ흈ﰟ翲儓ᲀ錁䥀솨驴깋䅺둢鰰儓ᲀ錁䥀ሿ煞ሿ煞\uec09ᴚ苸蒌巀꿱蚽\uf42e", 57 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    return SAManagedAdActivity.class;
                }
                return null;
            case -1292741795:
                if (str.equals(m1798("殕惰Ȣ煰毆軾\udeea믜틺윯鞹\uf53d", ExpandableListView.getPackedPositionType(0L) + 1).intern())) {
                    return SAVASTAd.class;
                }
                return null;
            case -1246480821:
                if (!str.equals(m1802("䄆疷\udb46莰뎎࢈⛯ು⌺詑\uda9d喲\uec09ᴚ苸蒌巀꿱蚽\uf42e", View.MeasureSpec.makeMeasureSpec(0, 0) + 19).intern())) {
                    return null;
                }
                int i10 = f1441 + 97;
                f1440 = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                return VideoPlayerActivity.class;
            case -983382056:
                if (str.equals(m1798("뾪⺽屆᮹뿼삛肼턱۹襦짰鿱춫丟ጢ⚟鑱㓐呠\ued6a嬵\ufdee鶤됁⇴", -ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    return VideoPlayerController.class;
                }
                return null;
            case -926853969:
                if (str.equals(m1802("깋䅺㖱ǚ㑢鉧㞝ﰙ緔ꈁ", 10 - TextUtils.getTrimmedLength("")).intern())) {
                    return SAResponse.class;
                }
                return null;
            case -877887884:
                if (str.equals(m1798("羈ԙ麱ϐ翁\ueb00䉆쥙웑ꋽ\u0b3b螕එ斧퇂㻇呿ή隍\uf505鬊홉当걡\ue1c1褐\ue42d檠⢅䃙", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    return IVideoPlayerControllerView.class;
                }
                return null;
            case -844831949:
                if (str.equals(m1798("龃睥渄䨤鿊饼닳肭⛚킁ﮎ칡\ued9a៛ⅷ眳", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    return IVideoPlayer.class;
                }
                return null;
            case -499959157:
                if (str.equals(m1802("깋䅺䛎꣬퇰\ueef0䰱ᠾ𥳐㲙宧\udf9f", (ViewConfiguration.getTouchSlop() >> 8) + 11).intern())) {
                    return SAInterface.class;
                }
                return null;
            case -279114759:
                if (!str.equals(m1802("࣯䜫\uf554慙ꏟ∱뎤뇞㟮Ꙫ햠ꓵ她杬⢋簂\ue603\uf4faⴻ᧮㊅廊뇅姪\uefcb\uec30磼ᳪᏠ흈\uf516뭻\udb46莰뎎࢈⛯ು⌺詑Ꮰ흈䄆疷\udb46莰뎎࢈⛯ು⌺詑\uda9d喲\uec09ᴚ苸蒌巀꿱蚽\uf42e", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 61).intern())) {
                    return null;
                }
                f1440 = (f1441 + 91) % 128;
                return VideoPlayerActivity.class;
            case -258874416:
                if (str.equals(m1802("깋䅺䄆疷\udb46莰⩸と呮☑", 9 - Drawable.resolveOpacity(0, 0)).intern())) {
                    return SAVideoAd.class;
                }
                return null;
            case 2537233:
                if (str.equals(m1798("\uf0cb鑦䔕ⲍ\uf098穨駊\ue604", (KeyEvent.getMaxKeyCode() >> 16) + 1).intern())) {
                    return SAAd.class;
                }
                return null;
            case 102107741:
                if (str.equals(m1798("죒搧ˁ쮓좁訩\ude16Đ熚쏉革俉뫞҉䶣\uf69f\ue307繈\u0ad2㵖", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    return SAInterstitialAd.class;
                }
                return null;
            case 347965699:
                if (!str.equals(m1798("൦嗯붷줖യ믶慀Ο됿\uf20b⠽䵓罿㕑\uf2c4\uf401⚑侃떋㿃\ue9e4蚿籕暧錯\ud9e6윱ꁦ婽ာ觔\ueb2dᶧ\uab6e", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern())) {
                    return null;
                }
                int i11 = f1440 + 79;
                f1441 = i11 % 128;
                return i11 % 2 == 0 ? AdViewJavaScriptBridge.class : IVideoPlayerController.Listener.class;
            case 511814123:
                if (str.equals(m1798("\uec0f辍ﵧ⸿\uec5c憃↮\ue4b7啑⡐棔ꩳ鸀", 1 - Color.argb(0, 0, 0, 0)).intern())) {
                    return SAWebView.class;
                }
                return null;
            case 562364207:
                if (!str.equals(m1798("晀颁蜞跃昉皘審䝊\udf19㽥ኔআᑙ\uf83f졭냔䶷苭輢笖苂䯑䛼≲\uf809ᒈ", 1 - View.resolveSize(0, 0)).intern())) {
                    return null;
                }
                f1441 = (f1440 + 97) % 128;
                return IVideoPlayerController.class;
            case 690451442:
                if (!str.equals(m1798("賅᪩\udf4f㋹貄\uf482·\uf87d㖜뵕䫟뚱ﻋ稏逊\u0fff꜃Ã흭쐬桷짤Ẩ鵀\u128e隷ꗉ安\udbde彪\ueb2cჂ鰄\ue428", 1 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    return null;
                }
                int i12 = f1440 + 17;
                f1441 = i12 % 128;
                return i12 % 2 == 0 ? AdViewJavaScriptBridge.class : AdViewJavaScriptBridge.Listener.class;
            case 816054202:
                if (str.equals(m1802("깋䅺䧺鳵뵗௨她杬㝊\uef78蔊쐪鄪鞾踾\ue6c3", TextUtils.getCapsMode("", 0, 0) + 15).intern())) {
                    return SACustomWebView.class;
                }
                return null;
            case 846064660:
                if (!str.equals(m1802("깋䅺\ued50\udac8蒥Ð芯씍芊\u206d", MotionEvent.axisFromString("") + 10).intern())) {
                    return null;
                }
                int i13 = f1441 + 25;
                f1440 = i13 % 128;
                if (i13 % 2 != 0) {
                    return null;
                }
                return SADetails.class;
            case 912139882:
                if (str.equals(m1798("ꞑ鸜\ufbd2᧱Ꟃ瀒✚퍝Ỿ㧃湅鶽햍ﺲ뒥", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    return SAVASTMedia.class;
                }
                return null;
            case 947295484:
                if (str.equals(m1802("깋䅺䄆疷\udb46莰⩸と\uec09ᴚ苸蒌巀꿱蚽\uf42e", 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    return SAVideoActivity.class;
                }
                return null;
            case 1067523235:
                if (str.equals(m1802("깋䅺둢鰰儓ᲀ錁䥀ሿ煞ሿ煞\uec09ᴚ苸蒌巀꿱蚽\uf42e", 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    return SAManagedAdActivity.class;
                }
                return null;
            case 1179812605:
                if (str.equals(m1802("࣯䜫\uf554慙ꏟ∱뎤뇞㟮Ꙫ햠ꓵ她杬⢋簂\ue603\uf4faⴻ᧮㊅廊뇅姪\uefcb\uec30磼ᳪᏠ흈깋䅺䛎꣬퇰\ueef0攒\ueada鳬↺鳬↺읦豽迂鱽", View.resolveSizeAndState(0, 0, 0) + 46).intern())) {
                    return SAInterstitialAd.class;
                }
                return null;
            case 1233891357:
                if (str.equals(m1802("깋䅺﨎傯붱墫鳬↺Ӫ㐾", 10 - Color.red(0)).intern())) {
                    return SACreative.class;
                }
                return null;
            case 1635726011:
                if (!str.equals(m1798("籢虃\ue807\udc62簱桍㓏ᛦ씺↭網堈\u0e76\ue6edꝲ\ue16c", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern())) {
                    return null;
                }
                f1441 = (f1440 + 7) % 128;
                return SAVideoClick.class;
            case 1852615901:
                if (str.equals(m1798("ᯮꅀྜጧᮽ低퍀\ud9abꊼڥ騣靼槗쇣", -ImageFormat.getBitsPerPixel(0)).intern())) {
                    return SABannerAd.class;
                }
                return null;
            case 1864912441:
                if (!str.equals(m1802("깋䅺둢鰰儓ᲀ錁䥀ሿ煞뭂﵁鄪鞾踾\ue6c3", 15 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    return null;
                }
                int i14 = f1440 + 95;
                f1441 = i14 % 128;
                if (i14 % 2 == 0) {
                    return null;
                }
                return SAManagedAdView.class;
            case 1888267954:
                if (!str.equals(m1802("࣯䜫\uf554慙ꏟ∱뎤뇞㟮Ꙫ햠ꓵ她杬⢋簂\ue603\uf4faⴻ᧮㊅廊뇅姪\uefcb\uec30磼ᳪ但檳⼻ꁬ짒静䡾挧㗇飦鳬↺\uf516뭻咃\ue717", 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                f1440 = (f1441 + 75) % 128;
                return SAVideoActivity.class;
            case 1968274797:
                if (str.equals(m1802("\ue4fb\uebdf햠ꓵ她杬﹈ꯌ⊬쑸", 10 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    return AwesomeAds.class;
                }
                return null;
            case 1976248583:
                if (str.equals(m1798("縴蘣缲ᐽ繽栺ꏅ\udeb4읭⇇\ueab8選భ\ue69dぁ⤪嗌鱉眓\ue2e8骡啲뻙뮒", (Process.myTid() >> 22) + 1).intern())) {
                    return IVideoPlayer.Listener.class;
                }
                return null;
            case 2044807796:
                if (str.equals(m1798("볖셽Ὥ⎦벅⽳쎰\ue939֏暗諃\ua7e6컘ꇟ倽Ậ霐\udb13\u175e핳", -TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    return SACreativeFormat.class;
                }
                return null;
            case 2057982119:
                if (!str.equals(m1798("憠Ǟ満ᵛ懳\uefd0뉉ퟓ\ud8feꘅזּ餓Ꭱ慼⇤", (Process.myTid() >> 22) + 1).intern())) {
                    return null;
                }
                f1441 = (f1440 + 11) % 128;
                return SAWebPlayer.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1798("쇗咡檾㾂솶몊뙷\uf51d碂\uf35e！믿돀㐬◛ʈ\uea0d", -MotionEvent.axisFromString("")).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cd.m1799((SAAd) list.get(0));
            }
        });
        map.put(m1798("蠛闓ﯨძ衼篹✂\uda50ㅎ㈼湗钭諸\uf570뒲ⷧꏜ辤\uf3df\ue624沎䚞", 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cd.m1796();
            }
        });
        map.put(m1802("緔ꈁ눂ே鈳쟻䪺\ueef7霮ꧩ\uefcb\uec30퇰\ueef0䪺\ueef7㚿䊫", 17 - View.resolveSizeAndState(0, 0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                cd.m1800((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        int i10 = f1440 + 53;
        f1441 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 60 / 0;
        }
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1800(SABannerAd sABannerAd, SAInterface sAInterface) {
        f1441 = (f1440 + 115) % 128;
        m1803(sABannerAd, sAInterface);
        int i10 = f1441 + 103;
        f1440 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        int i10 = f1441 + 103;
        f1440 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                return SAVersion.getSDKVersionNumber();
            }
            SAVersion.getSDKVersionNumber();
            throw null;
        } catch (Throwable unused) {
            return hu.m2670().m2672().m2723(SAVersion.class, m1798("쌧༡疾痺썹\ue132ꥄ뽌穇꣎\ue04a\uf18e녴澺㫌䢻", (ViewConfiguration.getEdgeSlop() >> 16) + 1).intern());
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1798(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f1444, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f1444));
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m1801(SAAd sAAd) {
        f1440 = (f1441 + 17) % 128;
        JSONObject jSONObjectWriteToJson = sAAd.writeToJson();
        f1441 = (f1440 + 53) % 128;
        return jSONObjectWriteToJson;
    }
}

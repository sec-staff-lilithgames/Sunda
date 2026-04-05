package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ig {

    /* renamed from: ᔱ, reason: contains not printable characters */
    private static int[] f2649 = null;

    /* renamed from: ᔲ, reason: contains not printable characters */
    private static int f2650 = 1;

    /* renamed from: ᔹ, reason: contains not printable characters */
    private static long f2651;

    /* renamed from: ᔺ, reason: contains not printable characters */
    private static int f2652;

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final List<String> f2653;

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static String f2654;

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static String f2655;

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static String f2656;

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static String f2657;

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static String f2658;

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static String f2659;

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static String f2660;

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static String f2661;

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static String f2662;

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static String f2663;

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static String f2664;

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static String f2665;

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static String f2666;

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static String f2667;

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static String f2668;

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static String f2669;

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static String f2670;

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static String f2671;

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static String f2672;

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static String f2673;

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static String f2674;

    /* renamed from: Ύ, reason: contains not printable characters */
    public static String f2675;

    /* renamed from: K, reason: contains not printable characters */
    public static String f2676;

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static String f2677;

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static String f2678;

    /* renamed from: く, reason: contains not printable characters */
    public static String f2679;

    /* renamed from: っ, reason: contains not printable characters */
    public static String f2680;

    /* renamed from: へ, reason: contains not printable characters */
    public static String f2681;

    /* renamed from: ゥ, reason: contains not printable characters */
    public static String f2682;

    /* renamed from: ト, reason: contains not printable characters */
    public static String f2683;

    /* renamed from: リ, reason: contains not printable characters */
    public static String f2684;

    /* renamed from: ヮ, reason: contains not printable characters */
    public static String f2685;

    /* renamed from: ヶ, reason: contains not printable characters */
    public static String f2686;

    /* renamed from: 丫, reason: contains not printable characters */
    public static String f2687;

    /* renamed from: 乁, reason: contains not printable characters */
    public static String f2688;

    /* renamed from: 爫, reason: contains not printable characters */
    public static String f2689;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static String f2690;

    /* renamed from: טּ, reason: contains not printable characters */
    public static String f2691;

    /* renamed from: סּ, reason: contains not printable characters */
    public static String f2692;

    /* renamed from: ףּ, reason: contains not printable characters */
    public static String f2693;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static String f2694;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static String f2695;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static String f2696;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static String f2697;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static String f2698;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static String f2699;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static String f2700;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static String f2701;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static String f2702;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static String f2703;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String f2704;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String f2705;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String f2706;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String f2707;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String f2708;

    static {
        m2805();
        f2705 = m2803("㇈\uea8c沠뉄ㆡ།꜊Ϭꘓ靕ཛ﮹ộﾄ鞘", 1 - Color.green(0)).intern();
        f2707 = m2803("ｏ࿎䌝佧Ｆ\uea4f袷ﻍ", 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
        f2708 = m2803("ᅳ\udcc4쬵툝ᄃ㥇\u008c掾", (ViewConfiguration.getTapTimeout() >> 16) + 1).intern();
        f2704 = m2803("츃锭\ue3bd浗칢炦⠷\udce3姏\ue8e3", -TextUtils.lastIndexOf("", '0', 0, 0)).intern();
        f2706 = m2804(new int[]{-134524696, -728081134, -271403135, -887313004}, TextUtils.getOffsetAfter("", 0) + 6).intern();
        f2701 = m2803("張䛵ਪ馜彁ꍩ", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        f2700 = m2804(new int[]{1267427649, 379363752, -410930470, 1208246470}, TextUtils.indexOf((CharSequence) "", '0', 0) + 7).intern();
        f2699 = m2803("\uef10댵⍅흝\uef62嚿\ue8ff曹磞컻䂼麠", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1).intern();
        f2703 = m2803("㷍ᴑ枡傛㶺\uf89d개\ue106ꨐ惈њ\u197f\u12c6", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern();
        f2702 = m2803("뒩莈ﭫՋ듄昂テ듵⍴﹄颔", 1 - KeyEvent.normalizeMetaState(0)).intern();
        f2695 = m2804(new int[]{-2094384664, 2022555312, -2082805543, -819662117}, 6 - ((Process.getThreadPriority(0) + 20) >> 6)).intern();
        f2694 = m2803("ꆘ꽚瓹쟛ꇷ䫛뽭癥㙴튃ᜌ踿躐멉", TextUtils.indexOf("", "", 0, 0) + 1).intern();
        f2697 = m2804(new int[]{-1920826012, 275007175, -491382764, -1564184885}, 5 - (ViewConfiguration.getTouchSlop() >> 8)).intern();
        f2696 = m2803("Ш뷆\uea86蜗щ塍℮㚳鏠", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        f2698 = m2804(new int[]{-1920826012, 275007175, -591374085, -1646734474}, KeyEvent.normalizeMetaState(0) + 5).intern();
        f2693 = m2804(new int[]{101978310, 311411668, -1633395096, -848132712}, '7' - AndroidCharacter.getMirror('0')).intern();
        f2691 = m2803("ຒⶉ棚須\u0ef4젏ꍪ⦤饂偷ଲ퇭", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        f2692 = m2804(new int[]{-1178118654, 1438324984, 1269336441, -504974215}, (ViewConfiguration.getTapTimeout() >> 16) + 8).intern();
        f2690 = m2803("ṗ景共ꕯḴ菬髄ᓑ覙ᮧ", 1 - ExpandableListView.getPackedPositionGroup(0L)).intern();
        f2689 = m2803("\ud7ca뜢澲볎\ud7a9効ꐚൗ䀏쫹్", Color.argb(0, 0, 0, 0) + 1).intern();
        f2684 = m2804(new int[]{1256912133, -1708289941, -732132750, 801399371}, 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        f2687 = m2804(new int[]{1164959114, -1283954978, 1043046583, 112204707}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7).intern();
        f2685 = m2803("䪁\uf272다\ue18c䫲\u17ef祙倔\udd4f辵턍", 1 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern();
        f2686 = m2803("者䛱\uf556燛醙ꍷ㻬쁣浼㬶隿", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
        f2688 = m2804(new int[]{-830623516, 1677180312, 1043046583, 112204707}, 6 - TextUtils.lastIndexOf("", '0', 0)).intern();
        f2681 = m2803("␛蘄镁뜰⑲掆廸ڈ돕\ufbc3\uf6a8", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern();
        f2680 = m2804(new int[]{-1220005728, -1154699014, 1440930089, -949951594}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6).intern();
        f2682 = m2804(new int[]{-1838386832, -1923888033, 293676659, 223745654}, Color.blue(0) + 5).intern();
        f2679 = m2803("ƽ蒋岱\ue89cǔ愀霌夡陯", 1 - Color.alpha(0)).intern();
        f2683 = m2803("\uf626룑첺\udfba\uf64f嵚܃清懪", (Process.myPid() >> 22) + 1).intern();
        f2677 = m2803("꣔蛋⛊ᨗꢽ捀\ued66ꮿ㼙", -ImageFormat.getBitsPerPixel(0)).intern();
        f2674 = m2803("䝨江ᵧ癨䜁觔훘쟁", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern();
        f2675 = m2803("㲰\ue953沱蓻㳙\u0cd8꜎㕒ꭺ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1).intern();
        f2678 = m2803("ད鉄뉠㬍༸矏种誰", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
        f2676 = m2803("媧跇킨茔嫎桌ᬕ㊭쵭\uf008덁쫭", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern();
        f2673 = m2803("蚪뷸䞠外蛃塳谝\ue8abᅸ쀷⑉ჯ", -((byte) KeyEvent.getModifierMetaStateMask())).intern();
        f2669 = m2803("좨\uf3b6筹힢죅ᘰ냂昮彰蹎ᢑ鹈\ue7a3", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
        f2670 = m2803("瓟㵼湊⢰璚\ud8e5ꗱ餓\ue317䂅ඵ慚寂⡲镪즐뎏", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern();
        f2671 = m2804(new int[]{-1363159419, -1569381923, 995629744, 1875123925, 1340658068, -1455859519}, MotionEvent.axisFromString("") + 11).intern();
        f2672 = m2804(new int[]{-1363159419, -1569381923, 360218639, -1548705767, 462350731, 1048211404}, Process.getGidForName("") + 12).intern();
        f2668 = m2803("쥮ﮓ襨猳줦ḽ䋕슊庑虊\uea97㫛\ue662\uee91牚", -ExpandableListView.getPackedPositionChild(0L)).intern();
        f2664 = m2803("맀雭곆쑜릈獃杻痥ⸯ\ueb32켽趧雌華埴", 1 - TextUtils.getOffsetBefore("", 0)).intern();
        f2665 = m2803("贈ￚ䞸̔憎ᩴ谅늭洮舅\u244d䫭헉\uead8벊", 1 - KeyEvent.getDeadChar(0, 0)).intern();
        f2667 = m2803("밥使ᑍ⺏뱭\uaad1\udff0鼶⯝㊱瞤杲錯婷\uef62쾯筵", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        f2666 = m2803("쥣緥ᾄ봞줫顋퐹ಧ庌/籨\uf4f2\ue67f棑\ue4a6尺ร킣", (ViewConfiguration.getTapTimeout() >> 16) + 1).intern();
        f2663 = m2803("苗⒙糱䱬芢섅띊\ufdd3ᔢ奜Ἅ֊", 1 - TextUtils.indexOf("", "")).intern();
        f2660 = m2804(new int[]{1362154043, -766757092, 1528915980, -221843484, 829248209, 1959541305}, 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern();
        f2661 = m2803("禝\udb7e⏨냦积㻧", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        f2662 = m2804(new int[]{-1094622614, -1105642218}, 3 - (ViewConfiguration.getTouchSlop() >> 8)).intern();
        f2659 = m2803("曷\ud83e롅\uec09暖㶥珬", (Process.myPid() >> 22) + 1).intern();
        f2654 = m2804(new int[]{1546656174, -1099551718, 1128265754, 66549995, 197507437, -1691625528, 1521074913, -1997872055}, 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
        f2656 = m2803("䰸㖯\u0b0e蓦䱕퀥살㕂\udbc0䡥棠촎", 1 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern();
        f2657 = m2803("꜌鎧측펴Ꝿ瘭։", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern();
        f2658 = m2804(new int[]{1741289124, -73936979}, 3 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        f2655 = m2803("㟾\udb26\ued8eᱏ㞗㺪☤귯", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern();
        f2653 = Arrays.asList(m2803("ⱅ㡄簒茳Ⱔ\uddcf랓㊝뮕䖀Ώ쫟͙", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern());
        int i10 = f2652 + 23;
        f2650 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2803(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2651, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2651));
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
    public static void m2805() {
        f2651 = -9198053937772239377L;
        f2649 = new int[]{-370377770, 1505631388, -27336998, -2140154485, -1586166653, -272821785, -1598875969, 1883717487, -1088424270, -1919009616, 322620511, -690741836, -117381846, -1771219271, 386253355, 880057204, 1436151041, -1458626094};
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2804(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2649.clone();
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
}

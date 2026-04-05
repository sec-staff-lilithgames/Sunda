package go;

import android.content.Context;
import android.os.Handler;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import com.ironsource.G9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.moloco.sdk.BKC.KerkSviMAy;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.k0;
import io.bidmachine.media3.common.util.q0;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ln.g0;
import mh.u2;
import nh.b5;
import nh.m5;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements f, g0 {

    /* renamed from: r, reason: collision with root package name */
    public static final b5 f58335r = b5.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: s, reason: collision with root package name */
    public static final b5 f58336s = b5.of(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: t, reason: collision with root package name */
    public static final b5 f58337t = b5.of(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: u, reason: collision with root package name */
    public static final b5 f58338u = b5.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: v, reason: collision with root package name */
    public static final b5 f58339v = b5.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: w, reason: collision with root package name */
    public static final b5 f58340w = b5.of(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: x, reason: collision with root package name */
    public static o f58341x;

    /* renamed from: a, reason: collision with root package name */
    public final Context f58342a;

    /* renamed from: b, reason: collision with root package name */
    public final m5 f58343b;

    /* renamed from: c, reason: collision with root package name */
    public final d f58344c;

    /* renamed from: d, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.g f58345d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58346e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f58347f;

    /* renamed from: g, reason: collision with root package name */
    public int f58348g;

    /* renamed from: h, reason: collision with root package name */
    public long f58349h;

    /* renamed from: i, reason: collision with root package name */
    public long f58350i;

    /* renamed from: j, reason: collision with root package name */
    public long f58351j;

    /* renamed from: k, reason: collision with root package name */
    public long f58352k;

    /* renamed from: l, reason: collision with root package name */
    public long f58353l;

    /* renamed from: m, reason: collision with root package name */
    public long f58354m;

    /* renamed from: n, reason: collision with root package name */
    public int f58355n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f58356o;

    /* renamed from: p, reason: collision with root package name */
    public int f58357p;

    /* renamed from: q, reason: collision with root package name */
    public String f58358q;

    public o(Context context, HashMap map, int i10, io.bidmachine.media3.common.util.g gVar, boolean z10) {
        this.f58342a = context == null ? null : context.getApplicationContext();
        this.f58343b = m5.copyOf((Map) map);
        this.f58344c = new d();
        this.f58347f = new e0(i10);
        this.f58345d = gVar;
        this.f58346e = z10;
        if (context == null) {
            this.f58355n = 0;
            this.f58353l = 1000000L;
            return;
        }
        k0 k0Var = k0.getInstance(context);
        int networkType = k0Var.getNetworkType();
        this.f58355n = networkType;
        this.f58353l = a(networkType);
        k0Var.register(new m(this), io.bidmachine.media3.common.util.b.get());
    }

    public static long b(int i10, String str) {
        int[] iArr;
        String strNullToEmpty = u2.nullToEmpty(str);
        strNullToEmpty.getClass();
        char c10 = 65535;
        switch (strNullToEmpty.hashCode()) {
            case 2083:
                if (strNullToEmpty.equals("AD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2084:
                if (strNullToEmpty.equals("AE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2085:
                if (strNullToEmpty.equals("AF")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2086:
                if (strNullToEmpty.equals("AG")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088:
                if (strNullToEmpty.equals("AI")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091:
                if (strNullToEmpty.equals("AL")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092:
                if (strNullToEmpty.equals("AM")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2094:
                if (strNullToEmpty.equals("AO")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2096:
                if (strNullToEmpty.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2097:
                if (strNullToEmpty.equals("AR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2098:
                if (strNullToEmpty.equals("AS")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2099:
                if (strNullToEmpty.equals("AT")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2100:
                if (strNullToEmpty.equals("AU")) {
                    c10 = '\f';
                    break;
                }
                break;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                if (strNullToEmpty.equals("AW")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2103:
                if (strNullToEmpty.equals("AX")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2105:
                if (strNullToEmpty.equals("AZ")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2111:
                if (strNullToEmpty.equals("BA")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2112:
                if (strNullToEmpty.equals("BB")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2114:
                if (strNullToEmpty.equals("BD")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2115:
                if (strNullToEmpty.equals("BE")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2116:
                if (strNullToEmpty.equals("BF")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2117:
                if (strNullToEmpty.equals("BG")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2118:
                if (strNullToEmpty.equals("BH")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2119:
                if (strNullToEmpty.equals("BI")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2120:
                if (strNullToEmpty.equals("BJ")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2122:
                if (strNullToEmpty.equals("BL")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2123:
                if (strNullToEmpty.equals("BM")) {
                    c10 = 26;
                    break;
                }
                break;
            case 2124:
                if (strNullToEmpty.equals("BN")) {
                    c10 = 27;
                    break;
                }
                break;
            case 2125:
                if (strNullToEmpty.equals("BO")) {
                    c10 = 28;
                    break;
                }
                break;
            case 2127:
                if (strNullToEmpty.equals("BQ")) {
                    c10 = 29;
                    break;
                }
                break;
            case 2128:
                if (strNullToEmpty.equals(PtLatqAYjEFT.wOR)) {
                    c10 = 30;
                    break;
                }
                break;
            case 2129:
                if (strNullToEmpty.equals("BS")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2130:
                if (strNullToEmpty.equals("BT")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2133:
                if (strNullToEmpty.equals("BW")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2135:
                if (strNullToEmpty.equals(QpyI.kzeYicAyIAS)) {
                    c10 = AbstractJsonLexerKt.STRING;
                    break;
                }
                break;
            case 2136:
                if (strNullToEmpty.equals("BZ")) {
                    c10 = '#';
                    break;
                }
                break;
            case 2142:
                if (strNullToEmpty.equals("CA")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2145:
                if (strNullToEmpty.equals("CD")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2147:
                if (strNullToEmpty.equals("CF")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2148:
                if (strNullToEmpty.equals("CG")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2149:
                if (strNullToEmpty.equals("CH")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2150:
                if (strNullToEmpty.equals("CI")) {
                    c10 = ')';
                    break;
                }
                break;
            case 2152:
                if (strNullToEmpty.equals("CK")) {
                    c10 = GMTDateParser.ANY;
                    break;
                }
                break;
            case 2153:
                if (strNullToEmpty.equals("CL")) {
                    c10 = '+';
                    break;
                }
                break;
            case 2154:
                if (strNullToEmpty.equals("CM")) {
                    c10 = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 2155:
                if (strNullToEmpty.equals("CN")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2156:
                if (strNullToEmpty.equals("CO")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2159:
                if (strNullToEmpty.equals("CR")) {
                    c10 = '/';
                    break;
                }
                break;
            case 2162:
                if (strNullToEmpty.equals("CU")) {
                    c10 = '0';
                    break;
                }
                break;
            case 2163:
                if (strNullToEmpty.equals("CV")) {
                    c10 = '1';
                    break;
                }
                break;
            case 2164:
                if (strNullToEmpty.equals("CW")) {
                    c10 = '2';
                    break;
                }
                break;
            case 2165:
                if (strNullToEmpty.equals("CX")) {
                    c10 = '3';
                    break;
                }
                break;
            case 2166:
                if (strNullToEmpty.equals("CY")) {
                    c10 = '4';
                    break;
                }
                break;
            case 2167:
                if (strNullToEmpty.equals("CZ")) {
                    c10 = '5';
                    break;
                }
                break;
            case 2177:
                if (strNullToEmpty.equals("DE")) {
                    c10 = '6';
                    break;
                }
                break;
            case 2182:
                if (strNullToEmpty.equals("DJ")) {
                    c10 = '7';
                    break;
                }
                break;
            case 2183:
                if (strNullToEmpty.equals("DK")) {
                    c10 = '8';
                    break;
                }
                break;
            case 2185:
                if (strNullToEmpty.equals("DM")) {
                    c10 = '9';
                    break;
                }
                break;
            case 2187:
                if (strNullToEmpty.equals("DO")) {
                    c10 = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case 2198:
                if (strNullToEmpty.equals("DZ")) {
                    c10 = ';';
                    break;
                }
                break;
            case 2206:
                if (strNullToEmpty.equals("EC")) {
                    c10 = '<';
                    break;
                }
                break;
            case 2208:
                if (strNullToEmpty.equals("EE")) {
                    c10 = G5.T;
                    break;
                }
                break;
            case G9.a.f34481e /* 2210 */:
                if (strNullToEmpty.equals("EG")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2221:
                if (strNullToEmpty.equals("ER")) {
                    c10 = '?';
                    break;
                }
                break;
            case 2222:
                if (strNullToEmpty.equals("ES")) {
                    c10 = '@';
                    break;
                }
                break;
            case 2223:
                if (strNullToEmpty.equals("ET")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 2243:
                if (strNullToEmpty.equals("FI")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 2244:
                if (strNullToEmpty.equals("FJ")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 2245:
                if (strNullToEmpty.equals("FK")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 2247:
                if (strNullToEmpty.equals("FM")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 2249:
                if (strNullToEmpty.equals("FO")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 2252:
                if (strNullToEmpty.equals("FR")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2266:
                if (strNullToEmpty.equals("GA")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 2267:
                if (strNullToEmpty.equals("GB")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2269:
                if (strNullToEmpty.equals("GD")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2270:
                if (strNullToEmpty.equals("GE")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2271:
                if (strNullToEmpty.equals("GF")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 2272:
                if (strNullToEmpty.equals("GG")) {
                    c10 = GMTDateParser.MONTH;
                    break;
                }
                break;
            case 2273:
                if (strNullToEmpty.equals("GH")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2274:
                if (strNullToEmpty.equals("GI")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2277:
                if (strNullToEmpty.equals("GL")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2278:
                if (strNullToEmpty.equals("GM")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 2279:
                if (strNullToEmpty.equals("GN")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 2281:
                if (strNullToEmpty.equals("GP")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 2282:
                if (strNullToEmpty.equals("GQ")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 2283:
                if (strNullToEmpty.equals("GR")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 2285:
                if (strNullToEmpty.equals("GT")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 2286:
                if (strNullToEmpty.equals("GU")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 2288:
                if (strNullToEmpty.equals("GW")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 2290:
                if (strNullToEmpty.equals("GY")) {
                    c10 = GMTDateParser.YEAR;
                    break;
                }
                break;
            case 2307:
                if (strNullToEmpty.equals("HK")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 2314:
                if (strNullToEmpty.equals("HR")) {
                    c10 = AbstractJsonLexerKt.BEGIN_LIST;
                    break;
                }
                break;
            case 2316:
                if (strNullToEmpty.equals("HT")) {
                    c10 = AbstractJsonLexerKt.STRING_ESC;
                    break;
                }
                break;
            case 2317:
                if (strNullToEmpty.equals("HU")) {
                    c10 = AbstractJsonLexerKt.END_LIST;
                    break;
                }
                break;
            case 2331:
                if (strNullToEmpty.equals("ID")) {
                    c10 = '^';
                    break;
                }
                break;
            case 2332:
                if (strNullToEmpty.equals("IE")) {
                    c10 = '_';
                    break;
                }
                break;
            case 2339:
                if (strNullToEmpty.equals("IL")) {
                    c10 = '`';
                    break;
                }
                break;
            case 2340:
                if (strNullToEmpty.equals("IM")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 2341:
                if (strNullToEmpty.equals("IN")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 2342:
                if (strNullToEmpty.equals("IO")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 2344:
                if (strNullToEmpty.equals("IQ")) {
                    c10 = GMTDateParser.DAY_OF_MONTH;
                    break;
                }
                break;
            case 2345:
                if (strNullToEmpty.equals("IR")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 2346:
                if (strNullToEmpty.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                    c10 = 'f';
                    break;
                }
                break;
            case 2347:
                if (strNullToEmpty.equals("IT")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 2363:
                if (strNullToEmpty.equals("JE")) {
                    c10 = GMTDateParser.HOURS;
                    break;
                }
                break;
            case 2371:
                if (strNullToEmpty.equals("JM")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 2373:
                if (strNullToEmpty.equals("JO")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 2374:
                if (strNullToEmpty.equals("JP")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 2394:
                if (strNullToEmpty.equals("KE")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 2396:
                if (strNullToEmpty.equals("KG")) {
                    c10 = GMTDateParser.MINUTES;
                    break;
                }
                break;
            case 2397:
                if (strNullToEmpty.equals("KH")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 2398:
                if (strNullToEmpty.equals("KI")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 2402:
                if (strNullToEmpty.equals("KM")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 2403:
                if (strNullToEmpty.equals(PcrIk.eiTC)) {
                    c10 = 'q';
                    break;
                }
                break;
            case 2407:
                if (strNullToEmpty.equals("KR")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 2412:
                if (strNullToEmpty.equals("KW")) {
                    c10 = GMTDateParser.SECONDS;
                    break;
                }
                break;
            case 2414:
                if (strNullToEmpty.equals("KY")) {
                    c10 = 't';
                    break;
                }
                break;
            case 2415:
                if (strNullToEmpty.equals("KZ")) {
                    c10 = AbstractJsonLexerKt.UNICODE_ESC;
                    break;
                }
                break;
            case 2421:
                if (strNullToEmpty.equals("LA")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 2422:
                if (strNullToEmpty.equals("LB")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 2423:
                if (strNullToEmpty.equals("LC")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 2429:
                if (strNullToEmpty.equals("LI")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 2431:
                if (strNullToEmpty.equals("LK")) {
                    c10 = GMTDateParser.ZONE;
                    break;
                }
                break;
            case 2438:
                if (strNullToEmpty.equals("LR")) {
                    c10 = AbstractJsonLexerKt.BEGIN_OBJ;
                    break;
                }
                break;
            case 2439:
                if (strNullToEmpty.equals("LS")) {
                    c10 = '|';
                    break;
                }
                break;
            case 2440:
                if (strNullToEmpty.equals("LT")) {
                    c10 = AbstractJsonLexerKt.END_OBJ;
                    break;
                }
                break;
            case 2441:
                if (strNullToEmpty.equals("LU")) {
                    c10 = '~';
                    break;
                }
                break;
            case 2442:
                if (strNullToEmpty.equals("LV")) {
                    c10 = 127;
                    break;
                }
                break;
            case 2445:
                if (strNullToEmpty.equals("LY")) {
                    c10 = 128;
                    break;
                }
                break;
            case 2452:
                if (strNullToEmpty.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                    c10 = 129;
                    break;
                }
                break;
            case 2454:
                if (strNullToEmpty.equals("MC")) {
                    c10 = 130;
                    break;
                }
                break;
            case 2455:
                if (strNullToEmpty.equals("MD")) {
                    c10 = 131;
                    break;
                }
                break;
            case 2456:
                if (strNullToEmpty.equals("ME")) {
                    c10 = 132;
                    break;
                }
                break;
            case 2457:
                if (strNullToEmpty.equals("MF")) {
                    c10 = 133;
                    break;
                }
                break;
            case 2458:
                if (strNullToEmpty.equals("MG")) {
                    c10 = 134;
                    break;
                }
                break;
            case 2459:
                if (strNullToEmpty.equals("MH")) {
                    c10 = 135;
                    break;
                }
                break;
            case 2462:
                if (strNullToEmpty.equals("MK")) {
                    c10 = 136;
                    break;
                }
                break;
            case 2463:
                if (strNullToEmpty.equals("ML")) {
                    c10 = 137;
                    break;
                }
                break;
            case 2464:
                if (strNullToEmpty.equals("MM")) {
                    c10 = 138;
                    break;
                }
                break;
            case 2465:
                if (strNullToEmpty.equals("MN")) {
                    c10 = 139;
                    break;
                }
                break;
            case 2466:
                if (strNullToEmpty.equals("MO")) {
                    c10 = 140;
                    break;
                }
                break;
            case 2467:
                if (strNullToEmpty.equals("MP")) {
                    c10 = 141;
                    break;
                }
                break;
            case 2468:
                if (strNullToEmpty.equals("MQ")) {
                    c10 = 142;
                    break;
                }
                break;
            case 2469:
                if (strNullToEmpty.equals("MR")) {
                    c10 = 143;
                    break;
                }
                break;
            case 2470:
                if (strNullToEmpty.equals("MS")) {
                    c10 = 144;
                    break;
                }
                break;
            case 2471:
                if (strNullToEmpty.equals("MT")) {
                    c10 = 145;
                    break;
                }
                break;
            case 2472:
                if (strNullToEmpty.equals("MU")) {
                    c10 = 146;
                    break;
                }
                break;
            case 2473:
                if (strNullToEmpty.equals("MV")) {
                    c10 = 147;
                    break;
                }
                break;
            case 2474:
                if (strNullToEmpty.equals("MW")) {
                    c10 = 148;
                    break;
                }
                break;
            case 2475:
                if (strNullToEmpty.equals("MX")) {
                    c10 = 149;
                    break;
                }
                break;
            case 2476:
                if (strNullToEmpty.equals("MY")) {
                    c10 = 150;
                    break;
                }
                break;
            case 2477:
                if (strNullToEmpty.equals("MZ")) {
                    c10 = 151;
                    break;
                }
                break;
            case 2483:
                if (strNullToEmpty.equals("NA")) {
                    c10 = 152;
                    break;
                }
                break;
            case 2485:
                if (strNullToEmpty.equals("NC")) {
                    c10 = 153;
                    break;
                }
                break;
            case 2487:
                if (strNullToEmpty.equals("NE")) {
                    c10 = 154;
                    break;
                }
                break;
            case 2488:
                if (strNullToEmpty.equals("NF")) {
                    c10 = 155;
                    break;
                }
                break;
            case 2489:
                if (strNullToEmpty.equals("NG")) {
                    c10 = 156;
                    break;
                }
                break;
            case 2491:
                if (strNullToEmpty.equals("NI")) {
                    c10 = 157;
                    break;
                }
                break;
            case 2494:
                if (strNullToEmpty.equals("NL")) {
                    c10 = 158;
                    break;
                }
                break;
            case 2497:
                if (strNullToEmpty.equals("NO")) {
                    c10 = 159;
                    break;
                }
                break;
            case 2498:
                if (strNullToEmpty.equals("NP")) {
                    c10 = 160;
                    break;
                }
                break;
            case 2500:
                if (strNullToEmpty.equals("NR")) {
                    c10 = 161;
                    break;
                }
                break;
            case G9.b.f34491e /* 2503 */:
                if (strNullToEmpty.equals("NU")) {
                    c10 = 162;
                    break;
                }
                break;
            case 2508:
                if (strNullToEmpty.equals("NZ")) {
                    c10 = 163;
                    break;
                }
                break;
            case 2526:
                if (strNullToEmpty.equals("OM")) {
                    c10 = 164;
                    break;
                }
                break;
            case 2545:
                if (strNullToEmpty.equals("PA")) {
                    c10 = 165;
                    break;
                }
                break;
            case 2549:
                if (strNullToEmpty.equals("PE")) {
                    c10 = 166;
                    break;
                }
                break;
            case 2550:
                if (strNullToEmpty.equals("PF")) {
                    c10 = 167;
                    break;
                }
                break;
            case 2551:
                if (strNullToEmpty.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                    c10 = 168;
                    break;
                }
                break;
            case 2552:
                if (strNullToEmpty.equals("PH")) {
                    c10 = 169;
                    break;
                }
                break;
            case 2555:
                if (strNullToEmpty.equals("PK")) {
                    c10 = 170;
                    break;
                }
                break;
            case 2556:
                if (strNullToEmpty.equals("PL")) {
                    c10 = 171;
                    break;
                }
                break;
            case 2557:
                if (strNullToEmpty.equals("PM")) {
                    c10 = 172;
                    break;
                }
                break;
            case 2562:
                if (strNullToEmpty.equals("PR")) {
                    c10 = 173;
                    break;
                }
                break;
            case 2563:
                if (strNullToEmpty.equals("PS")) {
                    c10 = 174;
                    break;
                }
                break;
            case 2564:
                if (strNullToEmpty.equals("PT")) {
                    c10 = 175;
                    break;
                }
                break;
            case 2567:
                if (strNullToEmpty.equals("PW")) {
                    c10 = 176;
                    break;
                }
                break;
            case 2569:
                if (strNullToEmpty.equals("PY")) {
                    c10 = 177;
                    break;
                }
                break;
            case 2576:
                if (strNullToEmpty.equals("QA")) {
                    c10 = 178;
                    break;
                }
                break;
            case 2611:
                if (strNullToEmpty.equals("RE")) {
                    c10 = 179;
                    break;
                }
                break;
            case 2621:
                if (strNullToEmpty.equals("RO")) {
                    c10 = 180;
                    break;
                }
                break;
            case 2625:
                if (strNullToEmpty.equals("RS")) {
                    c10 = 181;
                    break;
                }
                break;
            case 2627:
                if (strNullToEmpty.equals("RU")) {
                    c10 = 182;
                    break;
                }
                break;
            case 2629:
                if (strNullToEmpty.equals("RW")) {
                    c10 = 183;
                    break;
                }
                break;
            case 2638:
                if (strNullToEmpty.equals("SA")) {
                    c10 = 184;
                    break;
                }
                break;
            case 2639:
                if (strNullToEmpty.equals("SB")) {
                    c10 = 185;
                    break;
                }
                break;
            case 2640:
                if (strNullToEmpty.equals("SC")) {
                    c10 = 186;
                    break;
                }
                break;
            case 2641:
                if (strNullToEmpty.equals("SD")) {
                    c10 = 187;
                    break;
                }
                break;
            case 2642:
                if (strNullToEmpty.equals("SE")) {
                    c10 = 188;
                    break;
                }
                break;
            case 2644:
                if (strNullToEmpty.equals("SG")) {
                    c10 = 189;
                    break;
                }
                break;
            case 2645:
                if (strNullToEmpty.equals(KerkSviMAy.jLhJBnca)) {
                    c10 = 190;
                    break;
                }
                break;
            case 2646:
                if (strNullToEmpty.equals("SI")) {
                    c10 = 191;
                    break;
                }
                break;
            case 2647:
                if (strNullToEmpty.equals("SJ")) {
                    c10 = 192;
                    break;
                }
                break;
            case 2648:
                if (strNullToEmpty.equals("SK")) {
                    c10 = 193;
                    break;
                }
                break;
            case 2649:
                if (strNullToEmpty.equals("SL")) {
                    c10 = 194;
                    break;
                }
                break;
            case 2650:
                if (strNullToEmpty.equals("SM")) {
                    c10 = 195;
                    break;
                }
                break;
            case 2651:
                if (strNullToEmpty.equals("SN")) {
                    c10 = 196;
                    break;
                }
                break;
            case 2652:
                if (strNullToEmpty.equals("SO")) {
                    c10 = 197;
                    break;
                }
                break;
            case 2655:
                if (strNullToEmpty.equals("SR")) {
                    c10 = 198;
                    break;
                }
                break;
            case 2656:
                if (strNullToEmpty.equals("SS")) {
                    c10 = 199;
                    break;
                }
                break;
            case 2657:
                if (strNullToEmpty.equals("ST")) {
                    c10 = 200;
                    break;
                }
                break;
            case 2659:
                if (strNullToEmpty.equals("SV")) {
                    c10 = 201;
                    break;
                }
                break;
            case 2661:
                if (strNullToEmpty.equals("SX")) {
                    c10 = 202;
                    break;
                }
                break;
            case 2662:
                if (strNullToEmpty.equals("SY")) {
                    c10 = 203;
                    break;
                }
                break;
            case 2663:
                if (strNullToEmpty.equals("SZ")) {
                    c10 = 204;
                    break;
                }
                break;
            case 2671:
                if (strNullToEmpty.equals("TC")) {
                    c10 = 205;
                    break;
                }
                break;
            case 2672:
                if (strNullToEmpty.equals("TD")) {
                    c10 = 206;
                    break;
                }
                break;
            case 2675:
                if (strNullToEmpty.equals("TG")) {
                    c10 = 207;
                    break;
                }
                break;
            case 2676:
                if (strNullToEmpty.equals("TH")) {
                    c10 = 208;
                    break;
                }
                break;
            case 2678:
                if (strNullToEmpty.equals("TJ")) {
                    c10 = 209;
                    break;
                }
                break;
            case 2680:
                if (strNullToEmpty.equals("TL")) {
                    c10 = 210;
                    break;
                }
                break;
            case 2681:
                if (strNullToEmpty.equals("TM")) {
                    c10 = 211;
                    break;
                }
                break;
            case 2682:
                if (strNullToEmpty.equals("TN")) {
                    c10 = 212;
                    break;
                }
                break;
            case 2683:
                if (strNullToEmpty.equals("TO")) {
                    c10 = 213;
                    break;
                }
                break;
            case 2686:
                if (strNullToEmpty.equals("TR")) {
                    c10 = 214;
                    break;
                }
                break;
            case 2688:
                if (strNullToEmpty.equals("TT")) {
                    c10 = 215;
                    break;
                }
                break;
            case 2690:
                if (strNullToEmpty.equals("TV")) {
                    c10 = 216;
                    break;
                }
                break;
            case 2691:
                if (strNullToEmpty.equals("TW")) {
                    c10 = 217;
                    break;
                }
                break;
            case 2694:
                if (strNullToEmpty.equals("TZ")) {
                    c10 = 218;
                    break;
                }
                break;
            case 2700:
                if (strNullToEmpty.equals("UA")) {
                    c10 = 219;
                    break;
                }
                break;
            case 2706:
                if (strNullToEmpty.equals("UG")) {
                    c10 = 220;
                    break;
                }
                break;
            case 2718:
                if (strNullToEmpty.equals("US")) {
                    c10 = 221;
                    break;
                }
                break;
            case 2724:
                if (strNullToEmpty.equals("UY")) {
                    c10 = 222;
                    break;
                }
                break;
            case 2725:
                if (strNullToEmpty.equals("UZ")) {
                    c10 = 223;
                    break;
                }
                break;
            case 2731:
                if (strNullToEmpty.equals("VA")) {
                    c10 = 224;
                    break;
                }
                break;
            case 2733:
                if (strNullToEmpty.equals("VC")) {
                    c10 = 225;
                    break;
                }
                break;
            case 2735:
                if (strNullToEmpty.equals("VE")) {
                    c10 = 226;
                    break;
                }
                break;
            case 2737:
                if (strNullToEmpty.equals("VG")) {
                    c10 = 227;
                    break;
                }
                break;
            case 2739:
                if (strNullToEmpty.equals("VI")) {
                    c10 = 228;
                    break;
                }
                break;
            case 2744:
                if (strNullToEmpty.equals("VN")) {
                    c10 = 229;
                    break;
                }
                break;
            case 2751:
                if (strNullToEmpty.equals("VU")) {
                    c10 = 230;
                    break;
                }
                break;
            case 2767:
                if (strNullToEmpty.equals("WF")) {
                    c10 = 231;
                    break;
                }
                break;
            case 2780:
                if (strNullToEmpty.equals("WS")) {
                    c10 = 232;
                    break;
                }
                break;
            case 2803:
                if (strNullToEmpty.equals("XK")) {
                    c10 = 233;
                    break;
                }
                break;
            case 2828:
                if (strNullToEmpty.equals("YE")) {
                    c10 = 234;
                    break;
                }
                break;
            case 2843:
                if (strNullToEmpty.equals("YT")) {
                    c10 = 235;
                    break;
                }
                break;
            case 2855:
                if (strNullToEmpty.equals("ZA")) {
                    c10 = 236;
                    break;
                }
                break;
            case 2867:
                if (strNullToEmpty.equals("ZM")) {
                    c10 = 237;
                    break;
                }
                break;
            case 2877:
                if (strNullToEmpty.equals("ZW")) {
                    c10 = 238;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 4:
            case 17:
            case 29:
            case '2':
            case '9':
            case 'q':
            case 't':
            case 202:
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                iArr = new int[]{1, 2, 0, 0, 2, 2};
                break;
            case 1:
                iArr = new int[]{1, 4, 2, 3, 4, 1};
                break;
            case 2:
            case 204:
                iArr = new int[]{4, 4, 3, 4, 2, 2};
                break;
            case 3:
            case ')':
                iArr = new int[]{2, 4, 3, 4, 2, 2};
                break;
            case 5:
                iArr = new int[]{1, 1, 1, 2, 2, 2};
                break;
            case 6:
            case 165:
                iArr = new int[]{2, 3, 2, 3, 2, 2};
                break;
            case 7:
                iArr = new int[]{3, 4, 4, 3, 2, 2};
                break;
            case '\b':
            case '?':
            case 162:
            case 186:
            case 190:
                iArr = new int[]{4, 2, 2, 2, 2, 2};
                break;
            case '\t':
                iArr = new int[]{2, 2, 2, 2, 1, 2};
                break;
            case '\n':
                iArr = new int[]{2, 2, 3, 3, 2, 2};
                break;
            case 11:
            case '=':
            case ']':
            case 'f':
            case 127:
            case 145:
            case 188:
                iArr = new int[]{0, 0, 0, 0, 0, 2};
                break;
            case '\f':
                iArr = new int[]{0, 3, 1, 1, 3, 0};
                break;
            case '\r':
                iArr = new int[]{2, 2, 3, 4, 2, 2};
                break;
            case 14:
            case '3':
            case TPAT_ERROR_VALUE:
            case 144:
            case 172:
            case 195:
            case 224:
                iArr = new int[]{0, 2, 2, 2, 2, 2};
                break;
            case 15:
            case '7':
            case 128:
            case 194:
                iArr = new int[]{4, 2, 3, 3, 2, 2};
                break;
            case 16:
            case 'j':
            case INVALID_GZIP_BID_PAYLOAD_VALUE:
                iArr = new int[]{1, 1, 1, 1, 2, 2};
                break;
            case 18:
                iArr = new int[]{2, 1, 3, 2, 4, 2};
                break;
            case 19:
                iArr = new int[]{0, 0, 1, 0, 1, 2};
                break;
            case 20:
            case 187:
            case 203:
            case 206:
                iArr = new int[]{4, 3, 4, 4, 2, 2};
                break;
            case 21:
            case 175:
            case 191:
                iArr = new int[]{0, 0, 0, 0, 1, 2};
                break;
            case 22:
                iArr = new int[]{1, 3, 1, 3, 4, 2};
                break;
            case 23:
            case 'T':
            case '\\':
            case 154:
            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
            case 234:
                iArr = new int[]{4, 4, 4, 4, 2, 2};
                break;
            case 24:
                iArr = new int[]{4, 4, 2, 3, 2, 2};
                break;
            case 25:
            case 141:
            case 177:
                iArr = new int[]{1, 2, 2, 2, 2, 2};
                break;
            case 26:
                iArr = new int[]{0, 2, 0, 0, 2, 2};
                break;
            case 27:
                iArr = new int[]{3, 2, 0, 0, 2, 2};
                break;
            case 28:
                iArr = new int[]{1, 2, 4, 4, 2, 2};
                break;
            case 30:
                iArr = new int[]{1, 1, 1, 1, 2, 4};
                break;
            case 31:
                iArr = new int[]{3, 2, 1, 1, 2, 2};
                break;
            case ' ':
                iArr = new int[]{3, 1, 2, 2, 3, 2};
                break;
            case '!':
                iArr = new int[]{3, 2, 1, 0, 2, 2};
                break;
            case '\"':
                iArr = new int[]{1, 2, 3, 3, 2, 2};
                break;
            case '#':
            case '*':
                iArr = new int[]{2, 2, 2, 1, 2, 2};
                break;
            case '$':
            case MRAID_JS_COPY_FAILED_VALUE:
                iArr = new int[]{0, 2, 1, 2, 3, 3};
                break;
            case '%':
            case TPAT_RETRY_FAILED_VALUE:
                iArr = new int[]{3, 3, 2, 2, 2, 2};
                break;
            case '&':
                iArr = new int[]{4, 2, 4, 2, 2, 2};
                break;
            case '\'':
            case '>':
            case 134:
                iArr = new int[]{3, 4, 3, 3, 2, 2};
                break;
            case '(':
                iArr = new int[]{0, 1, 0, 0, 0, 2};
                break;
            case '+':
            case 208:
                iArr = new int[]{0, 1, 2, 2, 2, 2};
                break;
            case ',':
            case 143:
                iArr = new int[]{4, 3, 3, 4, 2, 2};
                break;
            case '-':
                iArr = new int[]{2, 0, 1, 1, 3, 1};
                break;
            case '.':
                iArr = new int[]{2, 3, 3, 2, 2, 2};
                break;
            case '/':
            case 157:
                iArr = new int[]{2, 4, 4, 4, 2, 2};
                break;
            case '0':
            case 'o':
            case 161:
            case 210:
                iArr = new int[]{4, 2, 4, 4, 2, 2};
                break;
            case '1':
                iArr = new int[]{2, 3, 0, 1, 2, 2};
                break;
            case '4':
                iArr = new int[]{1, 0, 1, 0, 0, 2};
                break;
            case '5':
                iArr = new int[]{0, 0, 2, 0, 1, 2};
                break;
            case '6':
                iArr = new int[]{0, 1, 4, 2, 2, 1};
                break;
            case '8':
                iArr = new int[]{0, 0, 2, 0, 0, 2};
                break;
            case ':':
            case INVALID_RI_ENDPOINT_VALUE:
                iArr = new int[]{3, 4, 4, 4, 2, 2};
                break;
            case ';':
            case 209:
                iArr = new int[]{3, 3, 4, 4, 2, 2};
                break;
            case '<':
                iArr = new int[]{1, 3, 2, 1, 2, 2};
                break;
            case '@':
                iArr = new int[]{0, 0, 0, 0, 1, 0};
                break;
            case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                iArr = new int[]{4, 3, 4, 4, 4, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                iArr = new int[]{0, 0, 0, 1, 0, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                iArr = new int[]{3, 2, 2, 3, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case PsExtractor.AUDIO_STREAM /* 192 */:
                iArr = new int[]{3, 2, 2, 2, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER /* 69 */:
                iArr = new int[]{4, 2, 4, 0, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER /* 70 */:
                iArr = new int[]{0, 2, 2, 0, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER /* 71 */:
                iArr = new int[]{1, 1, 1, 1, 0, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                iArr = new int[]{3, 4, 0, 0, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                iArr = new int[]{1, 1, 3, 2, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                iArr = new int[]{2, 2, 0, 0, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                iArr = new int[]{1, 1, 0, 2, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                iArr = new int[]{3, 2, 3, 3, 2, 2};
                break;
            case 'M':
                iArr = new int[]{0, 2, 1, 1, 2, 2};
                break;
            case 'N':
                iArr = new int[]{3, 3, 3, 2, 2, 2};
                break;
            case 'O':
            case 'a':
            case 'h':
                iArr = new int[]{0, 2, 0, 1, 2, 2};
                break;
            case 'P':
            case 130:
                iArr = new int[]{1, 2, 2, 0, 2, 2};
                break;
            case 'Q':
            case 199:
                iArr = new int[]{4, 3, 2, 4, 2, 2};
                break;
            case 'R':
                iArr = new int[]{3, 4, 4, 2, 2, 2};
                break;
            case 'S':
                iArr = new int[]{2, 1, 1, 3, 2, 2};
                break;
            case 'U':
                iArr = new int[]{1, 0, 0, 0, 1, 2};
                break;
            case 'V':
                iArr = new int[]{2, 1, 2, 1, 2, 2};
                break;
            case 'W':
                iArr = new int[]{2, 2, 4, 3, 3, 2};
                break;
            case 'X':
                iArr = new int[]{4, 4, 1, 2, 2, 2};
                break;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                iArr = new int[]{3, 1, 1, 3, 2, 2};
                break;
            case 'Z':
                iArr = new int[]{0, 1, 0, 1, 1, 0};
                break;
            case '[':
            case 's':
                iArr = new int[]{1, 0, 0, 0, 0, 2};
                break;
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                iArr = new int[]{3, 1, 3, 3, 2, 4};
                break;
            case '_':
                iArr = new int[]{1, 1, 1, 1, 1, 2};
                break;
            case '`':
                iArr = new int[]{1, 2, 2, 3, 4, 2};
                break;
            case 'b':
                iArr = new int[]{1, 1, 3, 2, 2, 3};
                break;
            case 'c':
                iArr = new int[]{3, 2, 2, 0, 2, 2};
                break;
            case 'd':
                iArr = new int[]{3, 2, 3, 2, 2, 2};
                break;
            case 'e':
                iArr = new int[]{4, 2, 3, 3, 4, 3};
                break;
            case 'g':
                iArr = new int[]{0, 1, 1, 2, 1, 2};
                break;
            case 'i':
                iArr = new int[]{2, 4, 3, 1, 2, 2};
                break;
            case 'k':
                iArr = new int[]{0, 3, 2, 3, 4, 2};
                break;
            case 'l':
                iArr = new int[]{3, 2, 1, 1, 1, 2};
                break;
            case 'm':
                iArr = new int[]{2, 1, 1, 2, 2, 2};
                break;
            case 'n':
                iArr = new int[]{1, 0, 4, 2, 2, 2};
                break;
            case 'p':
            case 230:
                iArr = new int[]{4, 3, 3, 2, 2, 2};
                break;
            case 'r':
                iArr = new int[]{0, 2, 2, 4, 4, 4};
                break;
            case ASSET_FAILED_STATUS_CODE_VALUE:
                iArr = new int[]{2, 1, 2, 2, 3, 2};
                break;
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                iArr = new int[]{1, 2, 1, 3, 2, 2};
                break;
            case JSON_ENCODE_ERROR_VALUE:
                iArr = new int[]{3, 1, 1, 2, 2, 2};
                break;
            case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                iArr = new int[]{2, 2, 1, 1, 2, 2};
                break;
            case INVALID_ADS_ENDPOINT_VALUE:
            case 138:
                iArr = new int[]{3, 2, 3, 3, 4, 2};
                break;
            case INVALID_LOG_ERROR_ENDPOINT_VALUE:
            case 168:
                iArr = new int[]{4, 3, 3, 3, 2, 2};
                break;
            case INVALID_METRICS_ENDPOINT_VALUE:
                iArr = new int[]{0, 1, 0, 1, 0, 2};
                break;
            case '~':
                iArr = new int[]{4, 0, 3, 2, 1, 3};
                break;
            case 129:
                iArr = new int[]{3, 3, 1, 1, 2, 2};
                break;
            case MRAID_JS_WRITE_FAILED_VALUE:
                iArr = new int[]{1, 0, 0, 0, 2, 2};
                break;
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                iArr = new int[]{2, 0, 0, 1, 3, 2};
                break;
            case OMSDK_JS_WRITE_FAILED_VALUE:
                iArr = new int[]{1, 2, 2, 3, 2, 2};
                break;
            case 135:
            case LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE:
            case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
            case 231:
                iArr = new int[]{4, 2, 2, 4, 2, 2};
                break;
            case PRIVACY_URL_ERROR_VALUE:
                iArr = new int[]{1, 0, 0, 1, 3, 2};
                break;
            case 139:
                iArr = new int[]{2, 0, 2, 2, 2, 2};
                break;
            case 140:
                iArr = new int[]{0, 2, 4, 4, 3, 1};
                break;
            case 142:
                iArr = new int[]{2, 1, 2, 3, 2, 2};
                break;
            case 146:
                iArr = new int[]{3, 1, 0, 2, 2, 2};
                break;
            case 147:
                iArr = new int[]{3, 2, 1, 3, 4, 2};
                break;
            case 148:
                iArr = new int[]{3, 2, 2, 1, 2, 2};
                break;
            case 149:
                iArr = new int[]{2, 4, 4, 4, 3, 2};
                break;
            case 150:
                iArr = new int[]{1, 0, 4, 1, 1, 0};
                break;
            case 151:
            case 232:
                iArr = new int[]{3, 1, 2, 2, 2, 2};
                break;
            case 152:
                iArr = new int[]{3, 4, 3, 2, 2, 2};
                break;
            case 153:
            case 235:
                iArr = new int[]{2, 3, 3, 4, 2, 2};
                break;
            case 156:
                iArr = new int[]{3, 4, 2, 1, 2, 2};
                break;
            case 158:
                iArr = new int[]{2, 1, 4, 3, 0, 4};
                break;
            case 159:
                iArr = new int[]{0, 0, 3, 0, 0, 2};
                break;
            case 160:
                iArr = new int[]{2, 2, 4, 3, 2, 2};
                break;
            case 163:
                iArr = new int[]{0, 0, 1, 2, 4, 2};
                break;
            case 164:
                iArr = new int[]{2, 3, 1, 2, 4, 2};
                break;
            case 166:
                iArr = new int[]{1, 2, 4, 4, 3, 2};
                break;
            case 167:
                iArr = new int[]{2, 2, 3, 1, 2, 2};
                break;
            case 169:
                iArr = new int[]{2, 1, 2, 3, 2, 1};
                break;
            case 170:
                iArr = new int[]{3, 3, 3, 3, 2, 2};
                break;
            case 171:
                iArr = new int[]{1, 0, 2, 2, 4, 4};
                break;
            case 173:
                iArr = new int[]{2, 0, 2, 1, 2, 0};
                break;
            case 174:
                iArr = new int[]{3, 4, 1, 3, 2, 2};
                break;
            case 176:
                iArr = new int[]{2, 2, 4, 1, 2, 2};
                break;
            case 178:
                iArr = new int[]{1, 4, 4, 4, 4, 2};
                break;
            case 179:
                iArr = new int[]{0, 3, 2, 3, 1, 2};
                break;
            case 180:
                iArr = new int[]{0, 0, 1, 1, 3, 2};
                break;
            case 181:
                iArr = new int[]{1, 0, 0, 1, 2, 2};
                break;
            case 182:
                iArr = new int[]{1, 0, 0, 1, 3, 3};
                break;
            case 183:
                iArr = new int[]{3, 3, 2, 0, 2, 2};
                break;
            case 184:
                iArr = new int[]{3, 1, 1, 2, 2, 0};
                break;
            case 185:
            case 238:
                iArr = new int[]{4, 2, 4, 3, 2, 2};
                break;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                iArr = new int[]{2, 3, 3, 3, 1, 1};
                break;
            case 193:
                iArr = new int[]{0, 1, 1, 1, 2, 2};
                break;
            case 196:
                iArr = new int[]{4, 4, 3, 2, 2, 2};
                break;
            case 197:
                iArr = new int[]{2, 2, 3, 4, 4, 2};
                break;
            case 198:
                iArr = new int[]{2, 4, 4, 1, 2, 2};
                break;
            case 200:
                iArr = new int[]{2, 2, 1, 2, 2, 2};
                break;
            case 201:
                iArr = new int[]{2, 3, 2, 1, 2, 2};
                break;
            case 205:
                iArr = new int[]{3, 2, 1, 2, 2, 2};
                break;
            case 207:
                iArr = new int[]{3, 4, 1, 0, 2, 2};
                break;
            case 212:
                iArr = new int[]{3, 1, 1, 1, 2, 2};
                break;
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                iArr = new int[]{3, 2, 4, 3, 2, 2};
                break;
            case AD_RESPONSE_EMPTY_VALUE:
                iArr = new int[]{2, 4, 1, 0, 2, 2};
                break;
            case AD_RESPONSE_TIMED_OUT_VALUE:
                iArr = new int[]{0, 0, 0, 0, 0, 0};
                break;
            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                iArr = new int[]{3, 4, 2, 1, 3, 2};
                break;
            case AD_RESPONSE_RETRY_AFTER_VALUE:
                iArr = new int[]{3, 3, 2, 3, 4, 2};
                break;
            case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                iArr = new int[]{2, 2, 4, 1, 3, 1};
                break;
            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                iArr = new int[]{2, 1, 1, 2, 1, 2};
                break;
            case STALE_CACHED_RESPONSE_VALUE:
                iArr = new int[]{1, 2, 3, 4, 3, 2};
                break;
            case 227:
                iArr = new int[]{2, 2, 1, 1, 2, 4};
                break;
            case 228:
                iArr = new int[]{0, 2, 1, 2, 2, 2};
                break;
            case 229:
                iArr = new int[]{0, 0, 1, 2, 2, 2};
                break;
            case 233:
                iArr = new int[]{1, 2, 1, 1, 2, 2};
                break;
            case 236:
                iArr = new int[]{2, 4, 2, 1, 1, 2};
                break;
            case 237:
                iArr = new int[]{4, 4, 4, 3, 2, 2};
                break;
            default:
                iArr = new int[]{2, 2, 2, 2, 2, 2};
                break;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return ((Long) f58336s.get(iArr[1])).longValue();
            }
            if (i10 == 4) {
                return ((Long) f58337t.get(iArr[2])).longValue();
            }
            if (i10 == 5) {
                return ((Long) f58338u.get(iArr[3])).longValue();
            }
            if (i10 != 7) {
                if (i10 == 9) {
                    return ((Long) f58340w.get(iArr[5])).longValue();
                }
                if (i10 != 10) {
                    return 1000000L;
                }
                return ((Long) f58339v.get(iArr[4])).longValue();
            }
        }
        return ((Long) f58335r.get(iArr[0])).longValue();
    }

    public static synchronized o getSingletonInstance(Context context) {
        try {
            if (f58341x == null) {
                f58341x = new n(context).build();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f58341x;
    }

    public final long a(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        m5 m5Var = this.f58343b;
        Long lValueOf = (Long) m5Var.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = (Long) m5Var.get(0);
        } else if (lValueOf.longValue() == C.TIME_UNSET) {
            lValueOf = Long.valueOf(b(i10, this.f58358q));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    @Override // go.f
    public void addEventListener(Handler handler, e eVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(handler);
        io.bidmachine.media3.common.util.a.checkNotNull(eVar);
        this.f58344c.addListener(handler, eVar);
    }

    public final synchronized void c(int i10) {
        int i11 = this.f58355n;
        if (i11 == 0 || this.f58346e) {
            if (this.f58356o) {
                i10 = this.f58357p;
            }
            if (i11 != i10 || this.f58358q == null) {
                this.f58355n = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    if (this.f58358q == null) {
                        this.f58358q = a1.getCountryCode(this.f58342a);
                    }
                    this.f58353l = a(i10);
                    long jElapsedRealtime = ((q0) this.f58345d).elapsedRealtime();
                    int i12 = this.f58348g > 0 ? (int) (jElapsedRealtime - this.f58349h) : 0;
                    long j10 = this.f58350i;
                    long j11 = this.f58353l;
                    if (i12 != 0 || j10 != 0 || j11 != this.f58354m) {
                        this.f58354m = j11;
                        this.f58344c.bandwidthSample(i12, j10, j11);
                    }
                    this.f58349h = jElapsedRealtime;
                    this.f58350i = 0L;
                    this.f58352k = 0L;
                    this.f58351j = 0L;
                    this.f58347f.reset();
                }
            }
        }
    }

    @Override // go.f
    public synchronized long getBitrateEstimate() {
        return this.f58353l;
    }

    @Override // go.f
    public /* bridge */ /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return super.getTimeToFirstByteEstimateUs();
    }

    @Override // go.f
    public g0 getTransferListener() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // ln.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onBytesTransferred(ln.i r1, ln.m r2, boolean r3, int r4) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r3 == 0) goto Lf
            r1 = 8
            boolean r1 = r2.isFlagSet(r1)     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            r1 = 1
            goto L10
        Ld:
            r1 = move-exception
            goto L1c
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L14
            monitor-exit(r0)
            return
        L14:
            long r1 = r0.f58350i     // Catch: java.lang.Throwable -> Ld
            long r3 = (long) r4     // Catch: java.lang.Throwable -> Ld
            long r1 = r1 + r3
            r0.f58350i = r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: go.o.onBytesTransferred(ln.i, ln.m, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    @Override // ln.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferEnd(ln.i r12, ln.m r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            r12 = 0
            r0 = 1
            if (r14 == 0) goto L13
            r14 = 8
            boolean r13 = r13.isFlagSet(r14)     // Catch: java.lang.Throwable -> Lf
            if (r13 != 0) goto L13
            r13 = r0
            goto L14
        Lf:
            r0 = move-exception
            r12 = r0
            goto L8e
        L13:
            r13 = r12
        L14:
            if (r13 != 0) goto L18
            monitor-exit(r11)
            return
        L18:
            int r13 = r11.f58348g     // Catch: java.lang.Throwable -> Lf
            if (r13 <= 0) goto L1d
            r12 = r0
        L1d:
            io.bidmachine.media3.common.util.a.checkState(r12)     // Catch: java.lang.Throwable -> Lf
            io.bidmachine.media3.common.util.g r12 = r11.f58345d     // Catch: java.lang.Throwable -> Lf
            io.bidmachine.media3.common.util.q0 r12 = (io.bidmachine.media3.common.util.q0) r12     // Catch: java.lang.Throwable -> Lf
            long r12 = r12.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.f58349h     // Catch: java.lang.Throwable -> Lf
            long r1 = r12 - r1
            int r4 = (int) r1     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.f58351j     // Catch: java.lang.Throwable -> Lf
            long r5 = (long) r4     // Catch: java.lang.Throwable -> Lf
            long r1 = r1 + r5
            r11.f58351j = r1     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.f58352k     // Catch: java.lang.Throwable -> Lf
            long r5 = r11.f58350i     // Catch: java.lang.Throwable -> Lf
            long r1 = r1 + r5
            r11.f58352k = r1     // Catch: java.lang.Throwable -> Lf
            if (r4 <= 0) goto L87
            float r14 = (float) r5     // Catch: java.lang.Throwable -> Lf
            r1 = 1174011904(0x45fa0000, float:8000.0)
            float r14 = r14 * r1
            float r1 = (float) r4     // Catch: java.lang.Throwable -> Lf
            float r14 = r14 / r1
            go.e0 r1 = r11.f58347f     // Catch: java.lang.Throwable -> Lf
            double r2 = (double) r5     // Catch: java.lang.Throwable -> Lf
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> Lf
            int r2 = (int) r2     // Catch: java.lang.Throwable -> Lf
            r1.addSample(r2, r14)     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.f58351j     // Catch: java.lang.Throwable -> Lf
            r5 = 2000(0x7d0, double:9.88E-321)
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 >= 0) goto L5e
            long r1 = r11.f58352k     // Catch: java.lang.Throwable -> Lf
            r5 = 524288(0x80000, double:2.590327E-318)
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 < 0) goto L69
        L5e:
            go.e0 r14 = r11.f58347f     // Catch: java.lang.Throwable -> Lf
            r1 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14.getPercentile(r1)     // Catch: java.lang.Throwable -> Lf
            long r1 = (long) r14     // Catch: java.lang.Throwable -> Lf
            r11.f58353l = r1     // Catch: java.lang.Throwable -> Lf
        L69:
            long r5 = r11.f58350i     // Catch: java.lang.Throwable -> Lf
            long r7 = r11.f58353l     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r4 != 0) goto L7c
            int r14 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r14 != 0) goto L7c
            long r9 = r11.f58354m     // Catch: java.lang.Throwable -> Lf
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L7c
            goto L83
        L7c:
            r11.f58354m = r7     // Catch: java.lang.Throwable -> Lf
            go.d r3 = r11.f58344c     // Catch: java.lang.Throwable -> Lf
            r3.bandwidthSample(r4, r5, r7)     // Catch: java.lang.Throwable -> Lf
        L83:
            r11.f58349h = r12     // Catch: java.lang.Throwable -> Lf
            r11.f58350i = r1     // Catch: java.lang.Throwable -> Lf
        L87:
            int r12 = r11.f58348g     // Catch: java.lang.Throwable -> Lf
            int r12 = r12 - r0
            r11.f58348g = r12     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r11)
            return
        L8e:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lf
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: go.o.onTransferEnd(ln.i, ln.m, boolean):void");
    }

    @Override // ln.g0
    public void onTransferInitializing(ln.i iVar, ln.m mVar, boolean z10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // ln.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferStart(ln.i r1, ln.m r2, boolean r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            r1 = 1
            if (r3 == 0) goto L10
            r3 = 8
            boolean r2 = r2.isFlagSet(r3)     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L10
            r2 = r1
            goto L11
        Le:
            r1 = move-exception
            goto L2a
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L15
            monitor-exit(r0)
            return
        L15:
            int r2 = r0.f58348g     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L23
            io.bidmachine.media3.common.util.g r2 = r0.f58345d     // Catch: java.lang.Throwable -> Le
            io.bidmachine.media3.common.util.q0 r2 = (io.bidmachine.media3.common.util.q0) r2     // Catch: java.lang.Throwable -> Le
            long r2 = r2.elapsedRealtime()     // Catch: java.lang.Throwable -> Le
            r0.f58349h = r2     // Catch: java.lang.Throwable -> Le
        L23:
            int r2 = r0.f58348g     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r1
            r0.f58348g = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: go.o.onTransferStart(ln.i, ln.m, boolean):void");
    }

    @Override // go.f
    public void removeEventListener(e eVar) {
        this.f58344c.removeListener(eVar);
    }

    public synchronized void setNetworkTypeOverride(int i10) {
        this.f58357p = i10;
        this.f58356o = true;
        c(i10);
    }
}

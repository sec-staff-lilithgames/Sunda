package qf;

import android.content.Context;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.exoplayer2.util.n1;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import com.ironsource.G9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f83021a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f83022b;

    /* renamed from: c, reason: collision with root package name */
    public int f83023c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.exoplayer2.util.d f83024d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83025e;

    public w(Context context) {
        this.f83021a = context == null ? null : context.getApplicationContext();
        this.f83022b = a(n1.getCountryCode(context));
        this.f83023c = 2000;
        this.f83024d = com.google.android.exoplayer2.util.d.f28436a;
        this.f83025e = true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static HashMap a(String str) {
        int[] iArr;
        b5 b5Var = x.f83029p;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c10 = 11;
                    break;
                }
                break;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                if (str.equals("AW")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c10 = 26;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c10 = 27;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c10 = 28;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c10 = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c10 = AbstractJsonLexerKt.STRING;
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c10 = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = GMTDateParser.ANY;
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '/';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c10 = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = '<';
                    break;
                }
                break;
            case G9.a.f34481e /* 2210 */:
                if (str.equals("EG")) {
                    c10 = G5.T;
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = GMTDateParser.MONTH;
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    c10 = GMTDateParser.YEAR;
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = AbstractJsonLexerKt.BEGIN_LIST;
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = AbstractJsonLexerKt.STRING_ESC;
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = AbstractJsonLexerKt.END_LIST;
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = GMTDateParser.DAY_OF_MONTH;
                    break;
                }
                break;
            case 2346:
                if (str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                    c10 = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = GMTDateParser.HOURS;
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = GMTDateParser.MINUTES;
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = GMTDateParser.SECONDS;
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 't';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = AbstractJsonLexerKt.UNICODE_ESC;
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = GMTDateParser.ZONE;
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = AbstractJsonLexerKt.BEGIN_OBJ;
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '|';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = AbstractJsonLexerKt.END_OBJ;
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = '~';
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = 127;
                    break;
                }
                break;
            case 2452:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                    c10 = 128;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = 129;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = 130;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = 131;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = 132;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = 133;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = 134;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = 135;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = 136;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = 137;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = 138;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = 139;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = 140;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = 141;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = 142;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = 143;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = 144;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = 145;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = 146;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = 147;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = 148;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = 149;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = 150;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = 151;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = 152;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = 153;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = 154;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = 155;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = 156;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = 157;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = 158;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c10 = 159;
                    break;
                }
                break;
            case G9.b.f34491e /* 2503 */:
                if (str.equals("NU")) {
                    c10 = 160;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = 161;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = 162;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = 163;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = 164;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = 165;
                    break;
                }
                break;
            case 2551:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                    c10 = 166;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = 167;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = 168;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = 169;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = 170;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = 171;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = 172;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = 173;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = 174;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c10 = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = 176;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = 177;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = 182;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = 183;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = 189;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c10 = 190;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = 191;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = 192;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = 193;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = 194;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = 195;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = 196;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = 197;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = 198;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = 199;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = 200;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = 201;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = 202;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = 203;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = 204;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = 205;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = 206;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = 207;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c10 = 208;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = 209;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = 210;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = 211;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = 212;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = 213;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = 214;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 215;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = 216;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = 217;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = 218;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = 219;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = 220;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = 221;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = 222;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c10 = 223;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = 224;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = 225;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = 226;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = 227;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = 228;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = 229;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = 230;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c10 = 231;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = 232;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = 233;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = 234;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = 235;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = 236;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = 237;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case '1':
                iArr = new int[]{2, 2, 0, 0, 2, 2};
                break;
            case 1:
                iArr = new int[]{1, 4, 3, 4, 4, 2};
                break;
            case 2:
            case 166:
                iArr = new int[]{4, 3, 3, 3, 2, 2};
                break;
            case 3:
                iArr = new int[]{2, 4, 3, 4, 2, 2};
                break;
            case 4:
            case 16:
            case 25:
            case 28:
            case '8':
            case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                iArr = new int[]{0, 2, 0, 0, 2, 2};
                break;
            case 5:
                iArr = new int[]{1, 1, 1, 3, 2, 2};
                break;
            case 6:
                iArr = new int[]{2, 3, 2, 3, 2, 2};
                break;
            case 7:
                iArr = new int[]{4, 4, 4, 3, 2, 2};
                break;
            case '\b':
            case '>':
            case 188:
                iArr = new int[]{4, 2, 2, 2, 2, 2};
                break;
            case '\t':
                iArr = new int[]{2, 2, 3, 3, 2, 2};
                break;
            case '\n':
                iArr = new int[]{1, 2, 1, 4, 1, 4};
                break;
            case 11:
                iArr = new int[]{0, 2, 1, 1, 3, 0};
                break;
            case '\f':
            case 'U':
                iArr = new int[]{1, 2, 4, 4, 2, 2};
                break;
            case '\r':
            case '2':
            case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
            case 140:
            case 143:
            case 170:
            case 193:
            case STALE_CACHED_RESPONSE_VALUE:
                iArr = new int[]{0, 2, 2, 2, 2, 2};
                break;
            case 14:
            case 19:
            case ':':
                iArr = new int[]{3, 3, 4, 4, 2, 2};
                break;
            case 15:
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                iArr = new int[]{1, 1, 1, 1, 2, 2};
                break;
            case 17:
            case 't':
                iArr = new int[]{2, 1, 2, 2, 2, 2};
                break;
            case 18:
                iArr = new int[]{0, 1, 4, 4, 3, 2};
                break;
            case 20:
            case '?':
            case 'S':
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                iArr = new int[]{0, 0, 0, 0, 1, 2};
                break;
            case 21:
                iArr = new int[]{1, 3, 1, 4, 4, 2};
                break;
            case 22:
            case '[':
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 153:
            case 204:
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
            case 233:
                iArr = new int[]{4, 4, 4, 4, 2, 2};
                break;
            case 23:
                iArr = new int[]{4, 4, 2, 3, 2, 2};
                break;
            case 24:
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case 175:
                iArr = new int[]{1, 2, 2, 2, 2, 2};
                break;
            case 26:
                iArr = new int[]{3, 2, 0, 1, 2, 2};
                break;
            case 27:
                iArr = new int[]{1, 2, 3, 2, 2, 2};
                break;
            case 29:
                iArr = new int[]{1, 1, 2, 1, 1, 0};
                break;
            case 30:
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                iArr = new int[]{3, 2, 1, 2, 2, 2};
                break;
            case 31:
            case 150:
            case 231:
                iArr = new int[]{3, 1, 2, 1, 2, 2};
                break;
            case ' ':
                iArr = new int[]{3, 2, 1, 0, 2, 2};
                break;
            case '!':
                iArr = new int[]{1, 1, 2, 3, 2, 2};
                break;
            case '\"':
            case ')':
                iArr = new int[]{2, 2, 2, 1, 2, 2};
                break;
            case '#':
                iArr = new int[]{0, 2, 3, 3, 3, 3};
                break;
            case '$':
            case 'o':
                iArr = new int[]{4, 3, 3, 2, 2, 2};
                break;
            case '%':
            case 183:
                iArr = new int[]{4, 2, 4, 2, 2, 2};
                break;
            case '&':
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                iArr = new int[]{3, 3, 3, 3, 2, 2};
                break;
            case '\'':
                iArr = new int[]{0, 0, 0, 0, 0, 3};
                break;
            case '(':
            case '=':
                iArr = new int[]{3, 4, 3, 3, 2, 2};
                break;
            case '*':
                iArr = new int[]{1, 1, 2, 1, 3, 2};
                break;
            case '+':
                iArr = new int[]{4, 3, 3, 4, 2, 2};
                break;
            case ',':
                iArr = new int[]{2, 0, 4, 3, 3, 1};
                break;
            case '-':
                iArr = new int[]{2, 3, 4, 2, 2, 2};
                break;
            case '.':
                iArr = new int[]{2, 4, 4, 4, 2, 2};
                break;
            case '/':
            case 'n':
                iArr = new int[]{4, 2, 4, 3, 2, 2};
                break;
            case '0':
                iArr = new int[]{2, 3, 0, 1, 2, 2};
                break;
            case '3':
            case 'Z':
            case '~':
                iArr = new int[]{1, 0, 0, 0, 0, 2};
                break;
            case '4':
                iArr = new int[]{0, 0, 2, 0, 1, 2};
                break;
            case '5':
                iArr = new int[]{0, 1, 3, 2, 2, 2};
                break;
            case '6':
            case 201:
            case 207:
                iArr = new int[]{4, 3, 4, 4, 2, 2};
                break;
            case '7':
            case '<':
            case '\\':
            case INVALID_LOG_ERROR_ENDPOINT_VALUE:
            case 144:
                iArr = new int[]{0, 0, 0, 0, 0, 2};
                break;
            case '9':
                iArr = new int[]{3, 4, 4, 4, 4, 2};
                break;
            case ';':
                iArr = new int[]{1, 3, 2, 1, 2, 2};
                break;
            case '@':
            case 194:
                iArr = new int[]{4, 4, 3, 2, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                iArr = new int[]{0, 0, 0, 2, 0, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                iArr = new int[]{3, 1, 2, 3, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                iArr = new int[]{4, 2, 3, 0, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER /* 69 */:
                iArr = new int[]{1, 1, 2, 1, 1, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER /* 70 */:
            case 205:
                iArr = new int[]{3, 4, 1, 0, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER /* 71 */:
                iArr = new int[]{0, 1, 1, 2, 1, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
            case 'p':
            case 's':
            case JSON_ENCODE_ERROR_VALUE:
            case 200:
            case 224:
                iArr = new int[]{1, 2, 0, 0, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                iArr = new int[]{1, 0, 0, 2, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
            case 168:
            case PsExtractor.AUDIO_STREAM /* 192 */:
                iArr = new int[]{3, 2, 3, 3, 2, 2};
                break;
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                iArr = new int[]{0, 2, 1, 0, 2, 2};
                break;
            case 'M':
            case 'g':
                iArr = new int[]{1, 2, 0, 1, 2, 2};
                break;
            case 'N':
            case 208:
                iArr = new int[]{2, 2, 2, 4, 2, 2};
                break;
            case 'O':
                iArr = new int[]{4, 3, 2, 4, 2, 2};
                break;
            case 'P':
                iArr = new int[]{4, 4, 4, 2, 2, 2};
                break;
            case 'Q':
                iArr = new int[]{3, 1, 1, 3, 2, 2};
                break;
            case 'R':
                iArr = new int[]{4, 4, 3, 3, 2, 2};
                break;
            case 'T':
                iArr = new int[]{2, 2, 2, 1, 1, 2};
                break;
            case 'V':
                iArr = new int[]{4, 4, 2, 2, 2, 2};
                break;
            case 'W':
                iArr = new int[]{3, 0, 1, 1, 2, 2};
                break;
            case 'X':
                iArr = new int[]{0, 1, 1, 3, 2, 0};
                break;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                iArr = new int[]{3, 3, 2, 2, 2, 2};
                break;
            case ']':
                iArr = new int[]{3, 1, 1, 2, 3, 2};
                break;
            case '_':
                iArr = new int[]{1, 2, 2, 3, 4, 2};
                break;
            case '`':
                iArr = new int[]{0, 2, 0, 1, 2, 2};
                break;
            case 'a':
                iArr = new int[]{1, 1, 2, 1, 2, 1};
                break;
            case 'b':
            case AD_RESPONSE_EMPTY_VALUE:
            case 230:
                iArr = new int[]{4, 2, 2, 4, 2, 2};
                break;
            case 'c':
            case 190:
                iArr = new int[]{3, 2, 2, 2, 2, 2};
                break;
            case 'd':
                iArr = new int[]{4, 2, 3, 3, 4, 2};
                break;
            case 'e':
                iArr = new int[]{0, 0, 1, 0, 0, 2};
                break;
            case 'f':
                iArr = new int[]{0, 0, 1, 1, 1, 2};
                break;
            case 'h':
                iArr = new int[]{2, 4, 2, 1, 2, 2};
                break;
            case 'i':
                iArr = new int[]{2, 0, 1, 1, 2, 2};
                break;
            case 'j':
                iArr = new int[]{0, 3, 3, 3, 4, 4};
                break;
            case 'k':
                iArr = new int[]{3, 2, 2, 1, 2, 2};
                break;
            case 'l':
            case 141:
                iArr = new int[]{2, 1, 1, 2, 2, 2};
                break;
            case 'm':
                iArr = new int[]{1, 0, 4, 2, 2, 2};
                break;
            case 'q':
                iArr = new int[]{0, 2, 2, 4, 4, 4};
                break;
            case 'r':
                iArr = new int[]{1, 0, 1, 0, 0, 2};
                break;
            case ASSET_FAILED_STATUS_CODE_VALUE:
                iArr = new int[]{1, 2, 1, 3, 2, 2};
                break;
            case TPAT_ERROR_VALUE:
                iArr = new int[]{3, 2, 3, 4, 4, 2};
                break;
            case INVALID_ADS_ENDPOINT_VALUE:
                iArr = new int[]{3, 4, 3, 4, 2, 2};
                break;
            case INVALID_RI_ENDPOINT_VALUE:
            case MRAID_JS_COPY_FAILED_VALUE:
                iArr = new int[]{3, 3, 3, 2, 2, 2};
                break;
            case INVALID_METRICS_ENDPOINT_VALUE:
                iArr = new int[]{1, 1, 4, 2, 0, 2};
                break;
            case 127:
            case 212:
            case 237:
                iArr = new int[]{3, 2, 4, 3, 2, 2};
                break;
            case 128:
                iArr = new int[]{3, 3, 2, 1, 2, 2};
                break;
            case 129:
                iArr = new int[]{0, 2, 2, 0, 2, 2};
                break;
            case 130:
                iArr = new int[]{1, 0, 0, 0, 2, 2};
                break;
            case MRAID_JS_WRITE_FAILED_VALUE:
                iArr = new int[]{2, 0, 0, 1, 1, 2};
                break;
            case 134:
                iArr = new int[]{4, 2, 1, 3, 2, 2};
                break;
            case 135:
                iArr = new int[]{2, 0, 0, 1, 3, 2};
                break;
            case PRIVACY_URL_ERROR_VALUE:
            case AD_RESPONSE_TIMED_OUT_VALUE:
                iArr = new int[]{3, 4, 2, 2, 2, 2};
                break;
            case TPAT_RETRY_FAILED_VALUE:
                iArr = new int[]{2, 2, 2, 3, 4, 2};
                break;
            case 138:
                iArr = new int[]{2, 0, 1, 2, 2, 2};
                break;
            case 139:
                iArr = new int[]{0, 2, 4, 4, 4, 2};
                break;
            case 142:
                iArr = new int[]{4, 2, 3, 4, 2, 2};
                break;
            case 145:
            case 182:
                iArr = new int[]{3, 1, 1, 2, 2, 2};
                break;
            case 146:
                iArr = new int[]{3, 4, 1, 3, 3, 2};
                break;
            case 147:
                iArr = new int[]{4, 2, 3, 3, 2, 2};
                break;
            case 148:
                iArr = new int[]{3, 4, 4, 4, 2, 2};
                break;
            case 149:
                iArr = new int[]{1, 0, 4, 1, 2, 2};
                break;
            case 151:
                iArr = new int[]{3, 4, 3, 2, 2, 2};
                break;
            case 152:
                iArr = new int[]{3, 2, 3, 4, 2, 2};
                break;
            case 154:
                iArr = new int[]{3, 4, 2, 1, 2, 2};
                break;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                iArr = new int[]{2, 3, 4, 3, 2, 2};
                break;
            case 156:
                iArr = new int[]{0, 2, 3, 3, 0, 4};
                break;
            case 157:
                iArr = new int[]{0, 1, 2, 1, 1, 2};
                break;
            case 158:
                iArr = new int[]{2, 1, 4, 3, 2, 2};
                break;
            case 159:
                iArr = new int[]{4, 0, 3, 2, 2, 2};
                break;
            case 160:
                iArr = new int[]{4, 2, 2, 1, 2, 2};
                break;
            case 161:
                iArr = new int[]{1, 0, 2, 2, 4, 2};
                break;
            case 162:
                iArr = new int[]{2, 3, 1, 3, 4, 2};
                break;
            case 163:
                iArr = new int[]{2, 3, 3, 3, 2, 2};
                break;
            case 164:
                iArr = new int[]{1, 2, 4, 4, 3, 2};
                break;
            case 165:
            case 199:
                iArr = new int[]{2, 3, 3, 1, 2, 2};
                break;
            case 167:
                iArr = new int[]{2, 1, 3, 2, 2, 0};
                break;
            case 169:
                iArr = new int[]{2, 1, 2, 2, 4, 2};
                break;
            case 171:
                iArr = new int[]{2, 0, 2, 0, 2, 1};
                break;
            case 172:
                iArr = new int[]{3, 4, 1, 4, 2, 2};
                break;
            case 173:
                iArr = new int[]{1, 0, 0, 0, 1, 2};
                break;
            case 174:
                iArr = new int[]{2, 2, 4, 2, 2, 2};
                break;
            case 176:
                iArr = new int[]{1, 4, 4, 4, 4, 2};
                break;
            case 177:
                iArr = new int[]{1, 2, 2, 3, 1, 2};
                break;
            case 178:
                iArr = new int[]{0, 0, 1, 2, 1, 2};
                break;
            case 179:
                iArr = new int[]{2, 0, 0, 0, 2, 2};
                break;
            case 180:
                iArr = new int[]{1, 0, 0, 0, 3, 3};
                break;
            case 181:
                iArr = new int[]{3, 3, 1, 0, 2, 2};
                break;
            case 184:
                iArr = new int[]{4, 3, 1, 1, 2, 2};
                break;
            case 185:
                iArr = new int[]{4, 3, 4, 2, 2, 2};
                break;
            case 186:
                iArr = new int[]{0, 1, 1, 1, 0, 2};
                break;
            case 187:
                iArr = new int[]{2, 3, 3, 3, 3, 3};
                break;
            case 191:
                iArr = new int[]{1, 1, 1, 1, 3, 2};
                break;
            case 195:
                iArr = new int[]{3, 2, 2, 4, 4, 2};
                break;
            case 196:
                iArr = new int[]{2, 4, 3, 0, 2, 2};
                break;
            case 197:
            case 210:
                iArr = new int[]{4, 2, 2, 3, 2, 2};
                break;
            case 198:
                iArr = new int[]{2, 2, 1, 2, 2, 2};
                break;
            case 202:
                iArr = new int[]{4, 4, 3, 4, 2, 2};
                break;
            case 203:
                iArr = new int[]{2, 2, 1, 3, 2, 2};
                break;
            case 206:
                iArr = new int[]{0, 1, 2, 1, 2, 2};
                break;
            case 209:
                iArr = new int[]{4, 2, 4, 4, 2, 2};
                break;
            case LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE:
            case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                iArr = new int[]{2, 1, 1, 1, 2, 2};
                break;
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                iArr = new int[]{1, 0, 0, 1, 3, 2};
                break;
            case INVALID_GZIP_BID_PAYLOAD_VALUE:
                iArr = new int[]{1, 4, 0, 0, 2, 2};
                break;
            case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                iArr = new int[]{0, 2, 0, 0, 0, 0};
                break;
            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                iArr = new int[]{0, 1, 1, 2, 4, 2};
                break;
            case AD_RESPONSE_RETRY_AFTER_VALUE:
                iArr = new int[]{1, 1, 4, 1, 3, 1};
                break;
            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                iArr = new int[]{2, 2, 3, 4, 3, 2};
                break;
            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                iArr = new int[]{2, 2, 0, 1, 2, 2};
                break;
            case 227:
                iArr = new int[]{0, 2, 1, 2, 2, 2};
                break;
            case 228:
                iArr = new int[]{0, 0, 1, 2, 2, 1};
                break;
            case 229:
                iArr = new int[]{4, 3, 3, 1, 2, 2};
                break;
            case 232:
                iArr = new int[]{1, 2, 1, 1, 2, 2};
                break;
            case 234:
                iArr = new int[]{2, 3, 3, 4, 2, 2};
                break;
            case 235:
                iArr = new int[]{2, 3, 2, 1, 2, 2};
                break;
            case 236:
                iArr = new int[]{4, 4, 4, 3, 3, 2};
                break;
            default:
                iArr = new int[]{2, 2, 2, 2, 2, 2};
                break;
        }
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        b5 b5Var2 = x.f83029p;
        map.put(2, (Long) b5Var2.get(iArr[0]));
        map.put(3, (Long) x.f83030q.get(iArr[1]));
        map.put(4, (Long) x.f83031r.get(iArr[2]));
        map.put(5, (Long) x.f83032s.get(iArr[3]));
        map.put(10, (Long) x.f83033t.get(iArr[4]));
        map.put(9, (Long) x.f83034u.get(iArr[5]));
        map.put(7, (Long) b5Var2.get(iArr[0]));
        return map;
    }

    public x build() {
        return new x(this.f83021a, this.f83022b, this.f83023c, this.f83024d, this.f83025e);
    }

    public w setClock(com.google.android.exoplayer2.util.d dVar) {
        this.f83024d = dVar;
        return this;
    }

    public w setInitialBitrateEstimate(long j10) {
        Iterator it = this.f83022b.keySet().iterator();
        while (it.hasNext()) {
            setInitialBitrateEstimate(((Integer) it.next()).intValue(), j10);
        }
        return this;
    }

    public w setResetOnNetworkTypeChange(boolean z10) {
        this.f83025e = z10;
        return this;
    }

    public w setSlidingWindowMaxWeight(int i10) {
        this.f83023c = i10;
        return this;
    }

    public w setInitialBitrateEstimate(int i10, long j10) {
        this.f83022b.put(Integer.valueOf(i10), Long.valueOf(j10));
        return this;
    }

    public w setInitialBitrateEstimate(String str) {
        this.f83022b = a(mh.c.toUpperCase(str));
        return this;
    }
}

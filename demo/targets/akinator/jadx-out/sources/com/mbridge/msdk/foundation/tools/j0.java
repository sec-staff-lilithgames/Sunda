package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f41128a;

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f41129b;

    /* renamed from: c, reason: collision with root package name */
    private static byte[] f41130c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: d, reason: collision with root package name */
    private static char[] f41131d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', GMTDateParser.MONTH, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', GMTDateParser.YEAR, 'Z', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f', 'g', GMTDateParser.HOURS, 'i', 'j', 'k', 'l', GMTDateParser.MINUTES, 'n', 'o', 'p', 'q', 'r', GMTDateParser.SECONDS, 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', GMTDateParser.ZONE, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap map = new HashMap();
        f41128a = map;
        map.put('v', 'A');
        f41128a.put('S', 'B');
        f41128a.put('o', 'C');
        f41128a.put('a', 'D');
        f41128a.put('j', 'E');
        f41128a.put('c', 'F');
        f41128a.put('7', 'G');
        Map<Character, Character> map2 = f41128a;
        Character chValueOf = Character.valueOf(GMTDateParser.DAY_OF_MONTH);
        map2.put(chValueOf, 'H');
        f41128a.put('R', 'I');
        f41128a.put(Character.valueOf(GMTDateParser.ZONE), 'J');
        f41128a.put('p', 'K');
        f41128a.put('W', 'L');
        f41128a.put('i', Character.valueOf(GMTDateParser.MONTH));
        f41128a.put('f', 'N');
        f41128a.put('G', 'O');
        f41128a.put('y', 'P');
        f41128a.put('N', 'Q');
        f41128a.put('x', 'R');
        f41128a.put('Z', 'S');
        f41128a.put('n', 'T');
        f41128a.put('V', 'U');
        f41128a.put('5', 'V');
        f41128a.put('k', 'W');
        f41128a.put('+', 'X');
        f41128a.put('D', Character.valueOf(GMTDateParser.YEAR));
        f41128a.put('H', 'Z');
        f41128a.put('L', 'a');
        f41128a.put(Character.valueOf(GMTDateParser.YEAR), 'b');
        f41128a.put(Character.valueOf(GMTDateParser.HOURS), 'c');
        f41128a.put('J', chValueOf);
        f41128a.put('4', 'e');
        f41128a.put('6', 'f');
        f41128a.put('l', 'g');
        f41128a.put('t', Character.valueOf(GMTDateParser.HOURS));
        f41128a.put('0', 'i');
        f41128a.put('U', 'j');
        f41128a.put('3', 'k');
        f41128a.put('Q', 'l');
        f41128a.put('r', Character.valueOf(GMTDateParser.MINUTES));
        f41128a.put('g', 'n');
        f41128a.put('E', 'o');
        f41128a.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'p');
        f41128a.put('q', 'q');
        f41128a.put('8', 'r');
        f41128a.put(Character.valueOf(GMTDateParser.SECONDS), Character.valueOf(GMTDateParser.SECONDS));
        f41128a.put('w', 't');
        f41128a.put('/', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f41128a.put('X', 'v');
        f41128a.put(Character.valueOf(GMTDateParser.MONTH), 'w');
        f41128a.put('e', 'x');
        f41128a.put('B', 'y');
        f41128a.put('A', Character.valueOf(GMTDateParser.ZONE));
        f41128a.put('T', '0');
        f41128a.put('2', '1');
        f41128a.put('F', '2');
        f41128a.put('b', '3');
        f41128a.put('9', '4');
        f41128a.put('P', '5');
        f41128a.put('1', '6');
        f41128a.put('O', '7');
        f41128a.put('I', '8');
        f41128a.put('K', '9');
        f41128a.put(Character.valueOf(GMTDateParser.MINUTES), '+');
        f41128a.put('C', '/');
        HashMap map3 = new HashMap();
        f41129b = map3;
        map3.put('A', 'v');
        f41129b.put('B', 'S');
        f41129b.put('C', 'o');
        f41129b.put('D', 'a');
        f41129b.put('E', 'j');
        f41129b.put('F', 'c');
        f41129b.put('G', '7');
        f41129b.put('H', chValueOf);
        f41129b.put('I', 'R');
        f41129b.put('J', Character.valueOf(GMTDateParser.ZONE));
        f41129b.put('K', 'p');
        f41129b.put('L', 'W');
        f41129b.put(Character.valueOf(GMTDateParser.MONTH), 'i');
        f41129b.put('N', 'f');
        f41129b.put('O', 'G');
        f41129b.put('P', 'y');
        f41129b.put('Q', 'N');
        f41129b.put('R', 'x');
        f41129b.put('S', 'Z');
        f41129b.put('T', 'n');
        f41129b.put('U', 'V');
        f41129b.put('V', '5');
        f41129b.put('W', 'k');
        f41129b.put('X', '+');
        f41129b.put(Character.valueOf(GMTDateParser.YEAR), 'D');
        f41129b.put('Z', 'H');
        f41129b.put('a', 'L');
        f41129b.put('b', Character.valueOf(GMTDateParser.YEAR));
        f41129b.put('c', Character.valueOf(GMTDateParser.HOURS));
        f41129b.put(chValueOf, 'J');
        f41129b.put('e', '4');
        f41129b.put('f', '6');
        f41129b.put('g', 'l');
        f41129b.put(Character.valueOf(GMTDateParser.HOURS), 't');
        f41129b.put('i', '0');
        f41129b.put('j', 'U');
        f41129b.put('k', '3');
        f41129b.put('l', 'Q');
        f41129b.put(Character.valueOf(GMTDateParser.MINUTES), 'r');
        f41129b.put('n', 'g');
        f41129b.put('o', 'E');
        f41129b.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f41129b.put('q', 'q');
        f41129b.put('r', '8');
        f41129b.put(Character.valueOf(GMTDateParser.SECONDS), Character.valueOf(GMTDateParser.SECONDS));
        f41129b.put('t', 'w');
        f41129b.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), '/');
        f41129b.put('v', 'X');
        f41129b.put('w', Character.valueOf(GMTDateParser.MONTH));
        f41129b.put('x', 'e');
        f41129b.put('y', 'B');
        f41129b.put(Character.valueOf(GMTDateParser.ZONE), 'A');
        f41129b.put('0', 'T');
        f41129b.put('1', '2');
        f41129b.put('2', 'F');
        f41129b.put('3', 'b');
        f41129b.put('4', '9');
        f41129b.put('5', 'P');
        f41129b.put('6', '1');
        f41129b.put('7', 'O');
        f41129b.put('8', 'I');
        f41129b.put('9', 'K');
        f41129b.put('+', Character.valueOf(GMTDateParser.MINUTES));
        f41129b.put('/', 'C');
    }

    public static String a(String str) {
        return q0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : q0.c(str);
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.ColorParser;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class CssParser {
    private static final String BLOCK_END = "}";
    private static final String BLOCK_START = "{";
    private static final String PROPERTY_BGCOLOR = "background-color";
    private static final String PROPERTY_FONT_FAMILY = "font-family";
    private static final String PROPERTY_FONT_STYLE = "font-style";
    private static final String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final String VALUE_BOLD = "bold";
    private static final String VALUE_ITALIC = "italic";
    private static final String VALUE_UNDERLINE = "underline";
    private static final Pattern VOICE_NAME_PATTERN = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private final ParsableByteArray styleInput = new ParsableByteArray();
    private final StringBuilder stringBuilder = new StringBuilder();

    private void applySelectorToStyle(WebvttCssStyle webvttCssStyle, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = VOICE_NAME_PATTERN.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                webvttCssStyle.setTargetVoice(matcher.group(1));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = Util.split(str, "\\.");
        String str2 = strArrSplit[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, iIndexOf2));
            webvttCssStyle.setTargetId(str2.substring(iIndexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (strArrSplit.length > 1) {
            webvttCssStyle.setTargetClasses((String[]) Arrays.copyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }

    private static boolean maybeSkipComment(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] bArr = parsableByteArray.data;
        if (position + 2 > iLimit) {
            return false;
        }
        int i10 = position + 1;
        if (bArr[position] != 47) {
            return false;
        }
        int i11 = position + 2;
        if (bArr[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iLimit) {
                parsableByteArray.skipBytes(iLimit - parsableByteArray.getPosition());
                return true;
            }
            if (((char) bArr[i11]) == '*' && ((char) bArr[i12]) == '/') {
                iLimit = i11 + 2;
                i11 = iLimit;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean maybeSkipWhitespace(ParsableByteArray parsableByteArray) {
        char cPeekCharAtPosition = peekCharAtPosition(parsableByteArray, parsableByteArray.getPosition());
        if (cPeekCharAtPosition != '\t' && cPeekCharAtPosition != '\n' && cPeekCharAtPosition != '\f' && cPeekCharAtPosition != '\r' && cPeekCharAtPosition != ' ') {
            return false;
        }
        parsableByteArray.skipBytes(1);
        return true;
    }

    private static String parseIdentifier(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && !z10) {
            char c10 = (char) parsableByteArray.data[position];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                position++;
                sb2.append(c10);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb2.toString();
    }

    public static String parseNextToken(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        String identifier = parseIdentifier(parsableByteArray, sb2);
        if (!"".equals(identifier)) {
            return identifier;
        }
        return "" + ((char) parsableByteArray.readUnsignedByte());
    }

    private static String parsePropertyValue(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int position = parsableByteArray.getPosition();
            String nextToken = parseNextToken(parsableByteArray, sb2);
            if (nextToken == null) {
                return null;
            }
            if (BLOCK_END.equals(nextToken) || ";".equals(nextToken)) {
                parsableByteArray.setPosition(position);
                z10 = true;
            } else {
                sb3.append(nextToken);
            }
        }
        return sb3.toString();
    }

    private static String parseSelector(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() < 5 || !"::cue".equals(parsableByteArray.readString(5))) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        String nextToken = parseNextToken(parsableByteArray, sb2);
        if (nextToken == null) {
            return null;
        }
        if (BLOCK_START.equals(nextToken)) {
            parsableByteArray.setPosition(position);
            return "";
        }
        String cueTarget = "(".equals(nextToken) ? readCueTarget(parsableByteArray) : null;
        String nextToken2 = parseNextToken(parsableByteArray, sb2);
        if (!")".equals(nextToken2) || nextToken2 == null) {
            return null;
        }
        return cueTarget;
    }

    private static void parseStyleDeclaration(ParsableByteArray parsableByteArray, WebvttCssStyle webvttCssStyle, StringBuilder sb2) {
        skipWhitespaceAndComments(parsableByteArray);
        String identifier = parseIdentifier(parsableByteArray, sb2);
        if (!"".equals(identifier) && ":".equals(parseNextToken(parsableByteArray, sb2))) {
            skipWhitespaceAndComments(parsableByteArray);
            String propertyValue = parsePropertyValue(parsableByteArray, sb2);
            if (propertyValue == null || "".equals(propertyValue)) {
                return;
            }
            int position = parsableByteArray.getPosition();
            String nextToken = parseNextToken(parsableByteArray, sb2);
            if (!";".equals(nextToken)) {
                if (!BLOCK_END.equals(nextToken)) {
                    return;
                } else {
                    parsableByteArray.setPosition(position);
                }
            }
            if ("color".equals(identifier)) {
                webvttCssStyle.setFontColor(ColorParser.parseCssColor(propertyValue));
                return;
            }
            if (PROPERTY_BGCOLOR.equals(identifier)) {
                webvttCssStyle.setBackgroundColor(ColorParser.parseCssColor(propertyValue));
                return;
            }
            if (PROPERTY_TEXT_DECORATION.equals(identifier)) {
                if ("underline".equals(propertyValue)) {
                    webvttCssStyle.setUnderline(true);
                }
            } else {
                if (PROPERTY_FONT_FAMILY.equals(identifier)) {
                    webvttCssStyle.setFontFamily(propertyValue);
                    return;
                }
                if (PROPERTY_FONT_WEIGHT.equals(identifier)) {
                    if ("bold".equals(propertyValue)) {
                        webvttCssStyle.setBold(true);
                    }
                } else if (PROPERTY_FONT_STYLE.equals(identifier) && "italic".equals(propertyValue)) {
                    webvttCssStyle.setItalic(true);
                }
            }
        }
    }

    private static char peekCharAtPosition(ParsableByteArray parsableByteArray, int i10) {
        return (char) parsableByteArray.data[i10];
    }

    private static String readCueTarget(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        boolean z10 = false;
        while (position < iLimit && !z10) {
            int i10 = position + 1;
            z10 = ((char) parsableByteArray.data[position]) == ')';
            position = i10;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    public static void skipStyleBlock(ParsableByteArray parsableByteArray) {
        while (!TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }

    public static void skipWhitespaceAndComments(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z10 = true; parsableByteArray.bytesLeft() > 0 && z10; z10 = false) {
                if (maybeSkipWhitespace(parsableByteArray) || maybeSkipComment(parsableByteArray)) {
                    break;
                }
            }
            return;
        }
    }

    public WebvttCssStyle parseBlock(ParsableByteArray parsableByteArray) {
        this.stringBuilder.setLength(0);
        int position = parsableByteArray.getPosition();
        skipStyleBlock(parsableByteArray);
        this.styleInput.reset(parsableByteArray.data, parsableByteArray.getPosition());
        this.styleInput.setPosition(position);
        String selector = parseSelector(this.styleInput, this.stringBuilder);
        if (selector != null && BLOCK_START.equals(parseNextToken(this.styleInput, this.stringBuilder))) {
            WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
            applySelectorToStyle(webvttCssStyle, selector);
            String nextToken = null;
            boolean z10 = false;
            while (!z10) {
                int position2 = this.styleInput.getPosition();
                nextToken = parseNextToken(this.styleInput, this.stringBuilder);
                boolean z11 = nextToken == null || BLOCK_END.equals(nextToken);
                if (!z11) {
                    this.styleInput.setPosition(position2);
                    parseStyleDeclaration(this.styleInput, webvttCssStyle, this.stringBuilder);
                }
                z10 = z11;
            }
            if (BLOCK_END.equals(nextToken)) {
                return webvttCssStyle;
            }
        }
        return null;
    }
}

package io.odeeo.internal.m0;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f64635c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f64636d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final x f64637a = new x();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f64638b = new StringBuilder();

    public static void a(x xVar, d dVar, StringBuilder sb2) {
        e(xVar);
        String strA = a(xVar, sb2);
        if (!"".equals(strA) && ":".equals(b(xVar, sb2))) {
            e(xVar);
            String strC = c(xVar, sb2);
            if (strC == null || "".equals(strC)) {
                return;
            }
            int position = xVar.getPosition();
            String strB = b(xVar, sb2);
            if (!";".equals(strB)) {
                if (!"}".equals(strB)) {
                    return;
                } else {
                    xVar.setPosition(position);
                }
            }
            if ("color".equals(strA)) {
                dVar.setFontColor(io.odeeo.internal.q0.f.parseCssColor(strC));
                return;
            }
            if ("background-color".equals(strA)) {
                dVar.setBackgroundColor(io.odeeo.internal.q0.f.parseCssColor(strC));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strA)) {
                if ("over".equals(strC)) {
                    dVar.setRubyPosition(1);
                    return;
                } else {
                    if ("under".equals(strC)) {
                        dVar.setRubyPosition(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strA)) {
                if (!"all".equals(strC) && !strC.startsWith("digits")) {
                    z10 = false;
                }
                dVar.setCombineUpright(z10);
                return;
            }
            if ("text-decoration".equals(strA)) {
                if (TtmlNode.UNDERLINE.equals(strC)) {
                    dVar.setUnderline(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strA)) {
                dVar.setFontFamily(strC);
                return;
            }
            if ("font-weight".equals(strA)) {
                if (TtmlNode.BOLD.equals(strC)) {
                    dVar.setBold(true);
                }
            } else if ("font-style".equals(strA)) {
                if (TtmlNode.ITALIC.equals(strC)) {
                    dVar.setItalic(true);
                }
            } else if ("font-size".equals(strA)) {
                a(strC, dVar);
            }
        }
    }

    public static String b(x xVar, StringBuilder sb2) {
        e(xVar);
        if (xVar.bytesLeft() == 0) {
            return null;
        }
        String strA = a(xVar, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) xVar.readUnsignedByte());
    }

    public static String c(x xVar) {
        int position = xVar.getPosition();
        int iLimit = xVar.limit();
        boolean z10 = false;
        while (position < iLimit && !z10) {
            int i10 = position + 1;
            z10 = ((char) xVar.getData()[position]) == ')';
            position = i10;
        }
        return xVar.readString((position - 1) - xVar.getPosition()).trim();
    }

    public static String d(x xVar, StringBuilder sb2) {
        e(xVar);
        if (xVar.bytesLeft() < 5 || !"::cue".equals(xVar.readString(5))) {
            return null;
        }
        int position = xVar.getPosition();
        String strB = b(xVar, sb2);
        if (strB == null) {
            return null;
        }
        if ("{".equals(strB)) {
            xVar.setPosition(position);
            return "";
        }
        String strC = "(".equals(strB) ? c(xVar) : null;
        if (")".equals(b(xVar, sb2))) {
            return strC;
        }
        return null;
    }

    public static void e(x xVar) {
        while (true) {
            for (boolean z10 = true; xVar.bytesLeft() > 0 && z10; z10 = false) {
                if (b(xVar) || a(xVar)) {
                    break;
                }
            }
            return;
        }
    }

    public List<d> parseBlock(x xVar) {
        this.f64638b.setLength(0);
        int position = xVar.getPosition();
        d(xVar);
        this.f64637a.reset(xVar.getData(), xVar.getPosition());
        this.f64637a.setPosition(position);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strD = d(this.f64637a, this.f64638b);
            if (strD == null || !"{".equals(b(this.f64637a, this.f64638b))) {
                break;
            }
            d dVar = new d();
            a(dVar, strD);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int position2 = this.f64637a.getPosition();
                String strB = b(this.f64637a, this.f64638b);
                boolean z11 = strB == null || "}".equals(strB);
                if (!z11) {
                    this.f64637a.setPosition(position2);
                    a(this.f64637a, dVar, this.f64638b);
                }
                str = strB;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public static String c(x xVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int position = xVar.getPosition();
            String strB = b(xVar, sb2);
            if (strB == null) {
                return null;
            }
            if (!"}".equals(strB) && !";".equals(strB)) {
                sb3.append(strB);
            } else {
                xVar.setPosition(position);
                z10 = true;
            }
        }
        return sb3.toString();
    }

    public static boolean b(x xVar) {
        char cA = a(xVar, xVar.getPosition());
        if (cA != '\t' && cA != '\n' && cA != '\f' && cA != '\r' && cA != ' ') {
            return false;
        }
        xVar.skipBytes(1);
        return true;
    }

    public static void d(x xVar) {
        while (!TextUtils.isEmpty(xVar.readLine())) {
        }
    }

    public static char a(x xVar, int i10) {
        return (char) xVar.getData()[i10];
    }

    public static boolean a(x xVar) {
        int position = xVar.getPosition();
        int iLimit = xVar.limit();
        byte[] data = xVar.getData();
        if (position + 2 > iLimit) {
            return false;
        }
        int i10 = position + 1;
        if (data[position] != 47) {
            return false;
        }
        int i11 = position + 2;
        if (data[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 < iLimit) {
                if (((char) data[i11]) == '*' && ((char) data[i12]) == '/') {
                    iLimit = i11 + 2;
                    i11 = iLimit;
                } else {
                    i11 = i12;
                }
            } else {
                xVar.skipBytes(iLimit - xVar.getPosition());
                return true;
            }
        }
    }

    public static String a(x xVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int position = xVar.getPosition();
        int iLimit = xVar.limit();
        while (position < iLimit && !z10) {
            char c10 = (char) xVar.getData()[position];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                position++;
                sb2.append(c10);
            }
        }
        xVar.skipBytes(position - xVar.getPosition());
        return sb2.toString();
    }

    public static void a(String str, d dVar) {
        Matcher matcher = f64636d.matcher(io.odeeo.internal.t0.c.toLowerCase(str));
        if (!matcher.matches()) {
            p.w("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                dVar.setFontSizeUnit(3);
                break;
            case "em":
                dVar.setFontSizeUnit(2);
                break;
            case "px":
                dVar.setFontSizeUnit(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.setFontSize(Float.parseFloat((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1))));
    }

    public final void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f64635c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.setTargetVoice((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = g0.split(str, "\\.");
        String str2 = strArrSplit[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.setTargetTagName(str2.substring(0, iIndexOf2));
            dVar.setTargetId(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.setTargetTagName(str2);
        }
        if (strArrSplit.length > 1) {
            dVar.setTargetClasses((String[]) g0.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }
}

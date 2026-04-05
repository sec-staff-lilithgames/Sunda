package io.odeeo.internal.i0;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e3.g;
import io.odeeo.internal.d0.a;
import io.odeeo.internal.d0.e;
import io.odeeo.internal.d0.f;
import io.odeeo.internal.i0.c;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends e {

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f64301t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o, reason: collision with root package name */
    public final boolean f64302o;

    /* renamed from: p, reason: collision with root package name */
    public final b f64303p;

    /* renamed from: q, reason: collision with root package name */
    public Map<String, c> f64304q;

    /* renamed from: r, reason: collision with root package name */
    public float f64305r;

    /* renamed from: s, reason: collision with root package name */
    public float f64306s;

    public a() {
        this(null);
    }

    public static float b(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static Map<String, c> c(x xVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarFromFormatLine = null;
        while (true) {
            String line = xVar.readLine();
            if (line == null || (xVar.bytesLeft() != 0 && xVar.peekUnsignedByte() == 91)) {
                break;
            }
            if (line.startsWith("Format:")) {
                aVarFromFormatLine = c.a.fromFormatLine(line);
            } else if (line.startsWith("Style:")) {
                if (aVarFromFormatLine == null) {
                    p.w("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(line));
                } else {
                    c cVarFromStyleLine = c.fromStyleLine(line, aVarFromFormatLine);
                    if (cVarFromStyleLine != null) {
                        linkedHashMap.put(cVarFromStyleLine.f64312a, cVarFromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static int d(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                g.z(i10, "Unknown alignment: ", "SsaDecoder");
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static Layout.Alignment e(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                g.z(i10, "Unknown alignment: ", "SsaDecoder");
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // io.odeeo.internal.d0.e
    public f a(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        x xVar = new x(bArr, i10);
        if (!this.f64302o) {
            a(xVar);
        }
        a(xVar, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f64305r = -3.4028235E38f;
        this.f64306s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f64302o = false;
            this.f64303p = null;
            return;
        }
        this.f64302o = true;
        String strFromUtf8Bytes = g0.fromUtf8Bytes(list.get(0));
        io.odeeo.internal.q0.a.checkArgument(strFromUtf8Bytes.startsWith("Format:"));
        this.f64303p = (b) io.odeeo.internal.q0.a.checkNotNull(b.fromFormatLine(strFromUtf8Bytes));
        a(new x(list.get(1)));
    }

    public final void b(x xVar) {
        while (true) {
            String line = xVar.readLine();
            if (line == null) {
                return;
            }
            if (xVar.bytesLeft() != 0 && xVar.peekUnsignedByte() == 91) {
                return;
            }
            String[] strArrSplit = line.split(":");
            if (strArrSplit.length == 2) {
                String lowerCase = io.odeeo.internal.t0.c.toLowerCase(strArrSplit[0].trim());
                lowerCase.getClass();
                if (lowerCase.equals("playresx")) {
                    this.f64305r = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.f64306s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    public final void a(x xVar) {
        while (true) {
            String line = xVar.readLine();
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                b(xVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                this.f64304q = c(xVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                p.i("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
            }
        }
    }

    public static int c(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                g.z(i10, "Unknown alignment: ", "SsaDecoder");
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public final void a(x xVar, List<List<io.odeeo.internal.d0.a>> list, List<Long> list2) {
        b bVarFromFormatLine = this.f64302o ? this.f64303p : null;
        while (true) {
            String line = xVar.readLine();
            if (line == null) {
                return;
            }
            if (line.startsWith("Format:")) {
                bVarFromFormatLine = b.fromFormatLine(line);
            } else if (line.startsWith("Dialogue:")) {
                if (bVarFromFormatLine == null) {
                    p.w("SsaDecoder", "Skipping dialogue line before complete format: ".concat(line));
                } else {
                    a(line, bVarFromFormatLine, list, list2);
                }
            }
        }
    }

    public final void a(String str, b bVar, List<List<io.odeeo.internal.d0.a>> list, List<Long> list2) {
        int i10;
        io.odeeo.internal.q0.a.checkArgument(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", bVar.f64311e);
        if (strArrSplit.length != bVar.f64311e) {
            p.w("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        long jA = a(strArrSplit[bVar.f64307a]);
        if (jA == C.TIME_UNSET) {
            p.w("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        long jA2 = a(strArrSplit[bVar.f64308b]);
        if (jA2 == C.TIME_UNSET) {
            p.w("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        Map<String, c> map = this.f64304q;
        c cVar = (map == null || (i10 = bVar.f64309c) == -1) ? null : map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[bVar.f64310d];
        io.odeeo.internal.d0.a aVarA = a(c.b.stripStyleOverrides(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.parseFromDialogue(str2), this.f64305r, this.f64306s);
        int iA = a(jA2, list2, list);
        for (int iA2 = a(jA, list2, list); iA2 < iA; iA2++) {
            list.get(iA2).add(aVarA);
        }
    }

    public static long a(String str) {
        Matcher matcher = f64301t.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong((String) g0.castNonNull(matcher.group(4))) * 10000) + (Long.parseLong((String) g0.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) g0.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) g0.castNonNull(matcher.group(1))) * 3600000000L);
    }

    public static io.odeeo.internal.d0.a a(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        a.b text = new a.b().setText(spannableString);
        if (cVar != null) {
            if (cVar.f64314c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f64314c.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f64315d;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                text.setTextSize(f12 / f11, 1);
            }
            boolean z10 = cVar.f64316e;
            if (z10 && cVar.f64317f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f64317f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f64318g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f64319h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f64333a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f64313b : -1;
        }
        text.setTextAlignment(e(i10)).setPositionAnchor(d(i10)).setLineAnchor(c(i10));
        PointF pointF = bVar.f64334b;
        if (pointF != null && f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
            text.setPosition(pointF.x / f10);
            text.setLine(bVar.f64334b.y / f11, 0);
        } else {
            text.setPosition(b(text.getPositionAnchor()));
            text.setLine(b(text.getLineAnchor()), 0);
        }
        return text.build();
    }

    public static int a(long j10, List<Long> list, List<List<io.odeeo.internal.d0.a>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }
}

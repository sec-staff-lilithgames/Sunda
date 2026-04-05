package kf;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ef.i;
import ef.j;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mh.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f70898s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: n, reason: collision with root package name */
    public final boolean f70899n;

    /* renamed from: o, reason: collision with root package name */
    public final b f70900o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashMap f70901p;

    /* renamed from: q, reason: collision with root package name */
    public float f70902q;

    /* renamed from: r, reason: collision with root package name */
    public float f70903r;

    public a() {
        this(null);
    }

    public static int d(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long f(String str) {
        Matcher matcher = f70898s.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong((String) n1.castNonNull(matcher.group(4))) * 10000) + (Long.parseLong((String) n1.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) n1.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) n1.castNonNull(matcher.group(1))) * 3600000000L);
    }

    @Override // ef.i
    public final j c(byte[] bArr, int i10, boolean z10) {
        v0 v0Var;
        Charset charset;
        b bVar;
        float f10;
        Layout.Alignment alignment;
        int i11;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        v0 v0Var2 = new v0(bArr, i10);
        Charset utfCharsetFromBom = v0Var2.readUtfCharsetFromBom();
        if (utfCharsetFromBom == null) {
            utfCharsetFromBom = h0.f74628c;
        }
        boolean z11 = aVar.f70899n;
        if (!z11) {
            aVar.e(v0Var2, utfCharsetFromBom);
        }
        b bVarFromFormatLine = z11 ? aVar.f70900o : null;
        while (true) {
            String line = v0Var2.readLine(utfCharsetFromBom);
            if (line == null) {
                return new f(arrayList, arrayList2);
            }
            if (line.startsWith("Format:")) {
                bVarFromFormatLine = b.fromFormatLine(line);
            } else if (line.startsWith("Dialogue:")) {
                if (bVarFromFormatLine == null) {
                    f0.w("SsaDecoder", "Skipping dialogue line before complete format: ".concat(line));
                } else {
                    int i19 = bVarFromFormatLine.f70908e;
                    com.google.android.exoplayer2.util.a.checkArgument(line.startsWith("Dialogue:"));
                    String[] strArrSplit = line.substring(9).split(",", i19);
                    if (strArrSplit.length != i19) {
                        f0.w("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(line));
                    } else {
                        long jF = f(strArrSplit[bVarFromFormatLine.f70904a]);
                        if (jF == C.TIME_UNSET) {
                            f0.w("SsaDecoder", "Skipping invalid timing: ".concat(line));
                        } else {
                            long jF2 = f(strArrSplit[bVarFromFormatLine.f70905b]);
                            if (jF2 == C.TIME_UNSET) {
                                f0.w("SsaDecoder", "Skipping invalid timing: ".concat(line));
                            } else {
                                LinkedHashMap linkedHashMap = aVar.f70901p;
                                e eVar = (linkedHashMap == null || (i18 = bVarFromFormatLine.f70906c) == -1) ? null : (e) linkedHashMap.get(strArrSplit[i18].trim());
                                String str = strArrSplit[bVarFromFormatLine.f70907d];
                                d fromDialogue = d.parseFromDialogue(str);
                                String strReplace = d.stripStyleOverrides(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f12 = aVar.f70902q;
                                float f13 = aVar.f70903r;
                                SpannableString spannableString = new SpannableString(strReplace);
                                ef.a text = new ef.a().setText(spannableString);
                                v0Var = v0Var2;
                                if (eVar != null) {
                                    boolean z12 = eVar.f70932g;
                                    Integer num = eVar.f70929d;
                                    Integer num2 = eVar.f70928c;
                                    if (num2 != null) {
                                        charset = utfCharsetFromBom;
                                        bVar = bVarFromFormatLine;
                                        f10 = f12;
                                        i14 = 33;
                                        i15 = 0;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        charset = utfCharsetFromBom;
                                        bVar = bVarFromFormatLine;
                                        f10 = f12;
                                        i14 = 33;
                                        i15 = 0;
                                    }
                                    if (eVar.f70935j == 3 && num != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i15, spannableString.length(), i14);
                                    }
                                    float f14 = eVar.f70930e;
                                    if (f14 != -3.4028235E38f && f13 != -3.4028235E38f) {
                                        text.setTextSize(f14 / f13, 1);
                                    }
                                    boolean z13 = eVar.f70931f;
                                    if (z13 && z12) {
                                        i16 = 33;
                                        i17 = 0;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i16 = 33;
                                        i17 = 0;
                                        if (z13) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z12) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (eVar.f70933h) {
                                        spannableString.setSpan(new UnderlineSpan(), i17, spannableString.length(), i16);
                                    }
                                    if (eVar.f70934i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i17, spannableString.length(), i16);
                                    }
                                } else {
                                    charset = utfCharsetFromBom;
                                    bVar = bVarFromFormatLine;
                                    f10 = f12;
                                }
                                int i20 = fromDialogue.f70924a;
                                PointF pointF = fromDialogue.f70925b;
                                if (i20 == -1) {
                                    i20 = eVar != null ? eVar.f70927b : -1;
                                }
                                switch (i20) {
                                    case 0:
                                    default:
                                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(i20, "Unknown alignment: ", "SsaDecoder");
                                    case -1:
                                        alignment = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        break;
                                }
                                ef.a textAlignment = text.setTextAlignment(alignment);
                                int i21 = Integer.MIN_VALUE;
                                switch (i20) {
                                    case 0:
                                    default:
                                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(i20, "Unknown alignment: ", "SsaDecoder");
                                    case -1:
                                        i11 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i11 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i11 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i11 = 2;
                                        break;
                                }
                                ef.a positionAnchor = textAlignment.setPositionAnchor(i11);
                                switch (i20) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(i20, "Unknown alignment: ", "SsaDecoder");
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i21 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i21 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i21 = 0;
                                        break;
                                }
                                positionAnchor.setLineAnchor(i21);
                                if (pointF == null || f13 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                    int positionAnchor2 = text.getPositionAnchor();
                                    if (positionAnchor2 != 0) {
                                        i12 = 1;
                                        if (positionAnchor2 != 1) {
                                            i13 = 2;
                                            f11 = positionAnchor2 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i13 = 2;
                                            f11 = 0.5f;
                                        }
                                    } else {
                                        i12 = 1;
                                        i13 = 2;
                                        f11 = 0.05f;
                                    }
                                    text.setPosition(f11);
                                    int lineAnchor = text.getLineAnchor();
                                    text.setLine(lineAnchor != 0 ? lineAnchor != i12 ? lineAnchor != i13 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f, 0);
                                } else {
                                    text.setPosition(pointF.x / f10);
                                    text.setLine(pointF.y / f13, 0);
                                }
                                ef.b bVarBuild = text.build();
                                int iD = d(jF2, arrayList2, arrayList);
                                for (int iD2 = d(jF, arrayList2, arrayList); iD2 < iD; iD2++) {
                                    ((List) arrayList.get(iD2)).add(bVarBuild);
                                }
                                aVar = this;
                                v0Var2 = v0Var;
                                bVarFromFormatLine = bVar;
                                utfCharsetFromBom = charset;
                            }
                        }
                    }
                }
                v0Var = v0Var2;
                charset = utfCharsetFromBom;
                bVar = bVarFromFormatLine;
                aVar = this;
                v0Var2 = v0Var;
                bVarFromFormatLine = bVar;
                utfCharsetFromBom = charset;
            } else {
                v0Var = v0Var2;
                charset = utfCharsetFromBom;
                bVar = bVarFromFormatLine;
                aVar = this;
                v0Var2 = v0Var;
                bVarFromFormatLine = bVar;
                utfCharsetFromBom = charset;
            }
        }
    }

    public final void e(v0 v0Var, Charset charset) {
        while (true) {
            String line = v0Var.readLine(charset);
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                while (true) {
                    String line2 = v0Var.readLine(charset);
                    if (line2 == null || (v0Var.bytesLeft() != 0 && v0Var.peekChar(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = line2.split(":");
                    if (strArrSplit.length == 2) {
                        String lowerCase = mh.c.toLowerCase(strArrSplit[0].trim());
                        lowerCase.getClass();
                        if (lowerCase.equals("playresx")) {
                            this.f70902q = Float.parseFloat(strArrSplit[1].trim());
                        } else if (lowerCase.equals("playresy")) {
                            try {
                                this.f70903r = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c cVarFromFormatLine = null;
                while (true) {
                    String line3 = v0Var.readLine(charset);
                    if (line3 == null || (v0Var.bytesLeft() != 0 && v0Var.peekChar(charset) == '[')) {
                        break;
                    }
                    if (line3.startsWith("Format:")) {
                        cVarFromFormatLine = c.fromFormatLine(line3);
                    } else if (line3.startsWith("Style:")) {
                        if (cVarFromFormatLine == null) {
                            f0.w("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(line3));
                        } else {
                            e eVarFromStyleLine = e.fromStyleLine(line3, cVarFromFormatLine);
                            if (eVarFromStyleLine != null) {
                                linkedHashMap.put(eVarFromStyleLine.f70926a, eVarFromStyleLine);
                            }
                        }
                    }
                }
                this.f70901p = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                f0.i("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
            }
        }
    }

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f70902q = -3.4028235E38f;
        this.f70903r = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f70899n = false;
            this.f70900o = null;
            return;
        }
        this.f70899n = true;
        String strFromUtf8Bytes = n1.fromUtf8Bytes(list.get(0));
        com.google.android.exoplayer2.util.a.checkArgument(strFromUtf8Bytes.startsWith("Format:"));
        this.f70900o = (b) com.google.android.exoplayer2.util.a.checkNotNull(b.fromFormatLine(strFromUtf8Bytes));
        e(new v0(list.get(1)), h0.f74628c);
    }
}

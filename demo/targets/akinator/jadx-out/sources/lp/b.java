package lp;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import e3.g;
import hp.i;
import hp.r;
import hp.s;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.k;
import io.bidmachine.media3.common.util.m0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements s {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f73565g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73566a;

    /* renamed from: b, reason: collision with root package name */
    public final a f73567b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f73568c;

    /* renamed from: d, reason: collision with root package name */
    public LinkedHashMap f73569d;

    /* renamed from: e, reason: collision with root package name */
    public float f73570e;

    /* renamed from: f, reason: collision with root package name */
    public float f73571f;

    public b() {
        this(null);
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
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

    public static long c(String str) {
        Matcher matcher = f73565g.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong((String) a1.castNonNull(matcher.group(4))) * 10000) + (Long.parseLong((String) a1.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) a1.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) a1.castNonNull(matcher.group(1))) * 3600000000L);
    }

    @Override // hp.s
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void parse(byte[] bArr, r rVar, k kVar) {
        super.parse(bArr, rVar, kVar);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ i parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return super.parseToLegacySubtitle(bArr, i10, i11);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public b(List<byte[]> list) throws NumberFormatException {
        this.f73570e = -3.4028235E38f;
        this.f73571f = -3.4028235E38f;
        this.f73568c = new m0();
        if (list == null || list.isEmpty()) {
            this.f73566a = false;
            this.f73567b = null;
            return;
        }
        this.f73566a = true;
        String strFromUtf8Bytes = a1.fromUtf8Bytes(list.get(0));
        io.bidmachine.media3.common.util.a.checkArgument(strFromUtf8Bytes.startsWith("Format:"));
        this.f73567b = (a) io.bidmachine.media3.common.util.a.checkNotNull(a.fromFormatLine(strFromUtf8Bytes));
        b(new m0(list.get(1)), StandardCharsets.UTF_8);
    }

    @Override // hp.s
    public void parse(byte[] bArr, int i10, int i11, r rVar, k kVar) throws NumberFormatException {
        Charset charset;
        a aVar;
        m0 m0Var;
        float f10;
        Layout.Alignment alignment;
        int i12;
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        b bVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m0 m0Var2 = bVar.f73568c;
        m0Var2.reset(bArr, i10 + i11);
        m0Var2.setPosition(i10);
        Charset utfCharsetFromBom = m0Var2.readUtfCharsetFromBom();
        if (utfCharsetFromBom == null) {
            utfCharsetFromBom = StandardCharsets.UTF_8;
        }
        boolean z10 = bVar.f73566a;
        if (!z10) {
            bVar.b(m0Var2, utfCharsetFromBom);
        }
        a aVarFromFormatLine = z10 ? bVar.f73567b : null;
        while (true) {
            String line = m0Var2.readLine(utfCharsetFromBom);
            if (line == null) {
                ArrayList arrayList3 = (rVar.f59126a == C.TIME_UNSET || !rVar.f59127b) ? null : new ArrayList();
                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                    List list = (List) arrayList.get(i20);
                    if (!list.isEmpty() || i20 == 0) {
                        if (i20 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i20)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i20 + 1)).longValue() - ((Long) arrayList2.get(i20)).longValue();
                        long j10 = rVar.f59126a;
                        if (j10 == C.TIME_UNSET || jLongValue >= j10) {
                            kVar.accept(new hp.c(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new hp.c(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        kVar.accept((hp.c) it.next());
                    }
                    return;
                }
                return;
            }
            if (line.startsWith("Format:")) {
                aVarFromFormatLine = a.fromFormatLine(line);
            } else if (line.startsWith("Dialogue:")) {
                if (aVarFromFormatLine == null) {
                    b0.w("SsaParser", "Skipping dialogue line before complete format: ".concat(line));
                } else {
                    int i21 = aVarFromFormatLine.f73564e;
                    io.bidmachine.media3.common.util.a.checkArgument(line.startsWith("Dialogue:"));
                    String[] strArrSplit = line.substring(9).split(",", i21);
                    if (strArrSplit.length != i21) {
                        b0.w("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(line));
                    } else {
                        long jC = c(strArrSplit[aVarFromFormatLine.f73560a]);
                        if (jC == C.TIME_UNSET) {
                            b0.w("SsaParser", "Skipping invalid timing: ".concat(line));
                        } else {
                            long jC2 = c(strArrSplit[aVarFromFormatLine.f73561b]);
                            if (jC2 == C.TIME_UNSET || jC2 <= jC) {
                                charset = utfCharsetFromBom;
                                aVar = aVarFromFormatLine;
                                m0Var = m0Var2;
                                b0.w("SsaParser", "Skipping invalid timing: ".concat(line));
                            } else {
                                LinkedHashMap linkedHashMap = bVar.f73569d;
                                e eVar = (linkedHashMap == null || (i19 = aVarFromFormatLine.f73562c) == -1) ? null : (e) linkedHashMap.get(strArrSplit[i19].trim());
                                String str = strArrSplit[aVarFromFormatLine.f73563d];
                                d fromDialogue = d.parseFromDialogue(str);
                                charset = utfCharsetFromBom;
                                aVar = aVarFromFormatLine;
                                String strReplace = d.stripStyleOverrides(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f12 = bVar.f73570e;
                                float f13 = bVar.f73571f;
                                SpannableString spannableString = new SpannableString(strReplace);
                                in.a text = new in.a().setText(spannableString);
                                if (eVar != null) {
                                    boolean z11 = eVar.f73595g;
                                    Integer num = eVar.f73592d;
                                    Integer num2 = eVar.f73591c;
                                    if (num2 != null) {
                                        m0Var = m0Var2;
                                        f10 = f13;
                                        i15 = 33;
                                        i16 = 0;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        m0Var = m0Var2;
                                        f10 = f13;
                                        i15 = 33;
                                        i16 = 0;
                                    }
                                    if (eVar.f73598j == 3 && num != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i16, spannableString.length(), i15);
                                    }
                                    float f14 = eVar.f73593e;
                                    if (f14 != -3.4028235E38f && f10 != -3.4028235E38f) {
                                        text.setTextSize(f14 / f10, 1);
                                    }
                                    boolean z12 = eVar.f73594f;
                                    if (z12 && z11) {
                                        i17 = 0;
                                        i18 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i17 = 0;
                                        i18 = 33;
                                        if (z12) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z11) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (eVar.f73596h) {
                                        spannableString.setSpan(new UnderlineSpan(), i17, spannableString.length(), i18);
                                    }
                                    if (eVar.f73597i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i17, spannableString.length(), i18);
                                    }
                                } else {
                                    m0Var = m0Var2;
                                    f10 = f13;
                                }
                                int i22 = fromDialogue.f73587a;
                                PointF pointF = fromDialogue.f73588b;
                                int i23 = i22 != -1 ? i22 : eVar != null ? eVar.f73590b : -1;
                                switch (i23) {
                                    case 0:
                                    default:
                                        g.t(i23, "Unknown alignment: ", "SsaParser");
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
                                in.a textAlignment = text.setTextAlignment(alignment);
                                int i24 = Integer.MIN_VALUE;
                                switch (i23) {
                                    case 0:
                                    default:
                                        g.t(i23, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        i12 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i12 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i12 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i12 = 2;
                                        break;
                                }
                                in.a positionAnchor = textAlignment.setPositionAnchor(i12);
                                switch (i23) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        g.t(i23, "Unknown alignment: ", "SsaParser");
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i24 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i24 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i24 = 0;
                                        break;
                                }
                                positionAnchor.setLineAnchor(i24);
                                if (pointF == null || f10 == -3.4028235E38f || f12 == -3.4028235E38f) {
                                    int positionAnchor2 = text.getPositionAnchor();
                                    if (positionAnchor2 != 0) {
                                        i14 = 1;
                                        if (positionAnchor2 != 1) {
                                            i13 = 2;
                                            f11 = positionAnchor2 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i13 = 2;
                                            f11 = 0.5f;
                                        }
                                    } else {
                                        i13 = 2;
                                        i14 = 1;
                                        f11 = 0.05f;
                                    }
                                    text.setPosition(f11);
                                    int lineAnchor = text.getLineAnchor();
                                    text.setLine(lineAnchor != 0 ? lineAnchor != i14 ? lineAnchor != i13 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f, 0);
                                } else {
                                    text.setPosition(pointF.x / f12);
                                    text.setLine(pointF.y / f10, 0);
                                }
                                in.b bVarBuild = text.build();
                                int iA = a(jC2, arrayList2, arrayList);
                                for (int iA2 = a(jC, arrayList2, arrayList); iA2 < iA; iA2++) {
                                    ((List) arrayList.get(iA2)).add(bVarBuild);
                                }
                            }
                            bVar = this;
                            utfCharsetFromBom = charset;
                            aVarFromFormatLine = aVar;
                            m0Var2 = m0Var;
                        }
                    }
                }
                charset = utfCharsetFromBom;
                aVar = aVarFromFormatLine;
                m0Var = m0Var2;
                bVar = this;
                utfCharsetFromBom = charset;
                aVarFromFormatLine = aVar;
                m0Var2 = m0Var;
            } else {
                charset = utfCharsetFromBom;
                aVar = aVarFromFormatLine;
                m0Var = m0Var2;
                bVar = this;
                utfCharsetFromBom = charset;
                aVarFromFormatLine = aVar;
                m0Var2 = m0Var;
            }
        }
    }

    public final void b(m0 m0Var, Charset charset) throws NumberFormatException {
        while (true) {
            String line = m0Var.readLine(charset);
            if (line != null) {
                if ("[Script Info]".equalsIgnoreCase(line)) {
                    while (true) {
                        String line2 = m0Var.readLine(charset);
                        if (line2 == null || (m0Var.bytesLeft() != 0 && m0Var.peekChar(charset) == '[')) {
                            break;
                        }
                        String[] strArrSplit = line2.split(KGUkpTlXZlJLy.fXLm);
                        if (strArrSplit.length == 2) {
                            String lowerCase = mh.c.toLowerCase(strArrSplit[0].trim());
                            lowerCase.getClass();
                            if (!lowerCase.equals("playresx")) {
                                if (lowerCase.equals("playresy")) {
                                    try {
                                        this.f73571f = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            } else {
                                this.f73570e = Float.parseFloat(strArrSplit[1].trim());
                            }
                        }
                    }
                } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    c cVarFromFormatLine = null;
                    while (true) {
                        String line3 = m0Var.readLine(charset);
                        if (line3 == null || (m0Var.bytesLeft() != 0 && m0Var.peekChar(charset) == '[')) {
                            break;
                        }
                        if (line3.startsWith("Format:")) {
                            cVarFromFormatLine = c.fromFormatLine(line3);
                        } else if (line3.startsWith("Style:")) {
                            if (cVarFromFormatLine == null) {
                                b0.w("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(line3));
                            } else {
                                e eVarFromStyleLine = e.fromStyleLine(line3, cVarFromFormatLine);
                                if (eVarFromStyleLine != null) {
                                    linkedHashMap.put(eVarFromStyleLine.f73589a, eVarFromStyleLine);
                                }
                            }
                        }
                    }
                    this.f73569d = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                    b0.i("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(line)) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

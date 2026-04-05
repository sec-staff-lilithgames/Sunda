package mf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import j1.o2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f74534a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74535b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74536c;

    /* renamed from: d, reason: collision with root package name */
    public final long f74537d;

    /* renamed from: e, reason: collision with root package name */
    public final long f74538e;

    /* renamed from: f, reason: collision with root package name */
    public final h f74539f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f74540g;

    /* renamed from: h, reason: collision with root package name */
    public final String f74541h;

    /* renamed from: i, reason: collision with root package name */
    public final String f74542i;

    /* renamed from: j, reason: collision with root package name */
    public final e f74543j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f74544k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f74545l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f74546m;

    public e(String str, String str2, long j10, long j11, h hVar, String[] strArr, String str3, String str4, e eVar) {
        this.f74534a = str;
        this.f74535b = str2;
        this.f74542i = str4;
        this.f74539f = hVar;
        this.f74540g = strArr;
        this.f74536c = str2 != null;
        this.f74537d = j10;
        this.f74538e = j11;
        this.f74541h = (String) com.google.android.exoplayer2.util.a.checkNotNull(str3);
        this.f74543j = eVar;
        this.f74544k = new HashMap();
        this.f74545l = new HashMap();
    }

    public static SpannableStringBuilder b(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            ef.a aVar = new ef.a();
            aVar.setText(new SpannableStringBuilder());
            treeMap.put(str, aVar);
        }
        return (SpannableStringBuilder) com.google.android.exoplayer2.util.a.checkNotNull(((ef.a) treeMap.get(str)).getText());
    }

    public static e buildNode(String str, long j10, long j11, h hVar, String[] strArr, String str2, String str3, e eVar) {
        return new e(str, null, j10, j11, hVar, strArr, str2, str3, eVar);
    }

    public static e buildTextNode(String str) {
        return new e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public final void a(TreeSet treeSet, boolean z10) {
        String str = this.f74534a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(str);
        if (z10 || zEquals || (zEquals2 && this.f74542i != null)) {
            long j10 = this.f74537d;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f74538e;
            if (j11 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f74546m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f74546m.size(); i10++) {
            ((e) this.f74546m.get(i10)).a(treeSet, z10 || zEquals);
        }
    }

    public void addChild(e eVar) {
        if (this.f74546m == null) {
            this.f74546m = new ArrayList();
        }
        this.f74546m.add(eVar);
    }

    public final void c(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f74541h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (isActive(j10) && TtmlNode.TAG_DIV.equals(this.f74534a) && (str2 = this.f74542i) != null) {
            o2.z(str, str2, arrayList);
            return;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChild(i10).c(j10, str, arrayList);
        }
    }

    public final void d(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        if (isActive(j10)) {
            String str2 = this.f74541h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it = this.f74545l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = (String) entry.getKey();
                HashMap map3 = this.f74544k;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    ef.a aVar = (ef.a) com.google.android.exoplayer2.util.a.checkNotNull((ef.a) treeMap.get(str4));
                    int i10 = ((f) com.google.android.exoplayer2.util.a.checkNotNull((f) map2.get(str3))).f74556j;
                    h hVarResolveStyle = g.resolveStyle(this.f74539f, this.f74540g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.getText();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.setText(spannableStringBuilder);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (hVarResolveStyle != null) {
                        g.applyStylesToSpan(spannableStringBuilder2, iIntValue, iIntValue2, hVarResolveStyle, this.f74543j, map, i10);
                        if ("p".equals(this.f74534a)) {
                            if (hVarResolveStyle.getShearPercentage() != Float.MAX_VALUE) {
                                aVar.setShearDegrees((hVarResolveStyle.getShearPercentage() * (-90.0f)) / 100.0f);
                            }
                            if (hVarResolveStyle.getTextAlign() != null) {
                                aVar.setTextAlignment(hVarResolveStyle.getTextAlign());
                            }
                            if (hVarResolveStyle.getMultiRowAlign() != null) {
                                aVar.setMultiRowAlignment(hVarResolveStyle.getMultiRowAlign());
                            }
                        }
                    }
                }
            }
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                getChild(i11).d(j10, map, map2, str3, treeMap);
            }
        }
    }

    public final void e(long j10, boolean z10, String str, TreeMap treeMap) {
        boolean z11;
        TreeMap treeMap2;
        long j11;
        HashMap map = this.f74544k;
        map.clear();
        HashMap map2 = this.f74545l;
        map2.clear();
        String str2 = this.f74534a;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.f74541h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f74536c && z10) {
            b(str4, treeMap).append((CharSequence) com.google.android.exoplayer2.util.a.checkNotNull(this.f74535b));
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z10) {
            b(str4, treeMap).append('\n');
            return;
        }
        if (isActive(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                map.put((String) entry.getKey(), Integer.valueOf(((CharSequence) com.google.android.exoplayer2.util.a.checkNotNull(((ef.a) entry.getValue()).getText())).length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                e child = getChild(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    treeMap2 = treeMap;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    treeMap2 = treeMap;
                }
                child.e(j11, z11, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderB = b(str4, treeMap);
                int length = spannableStringBuilderB.length() - 1;
                while (length >= 0 && spannableStringBuilderB.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderB.charAt(length) != '\n') {
                    spannableStringBuilderB.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                map2.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) com.google.android.exoplayer2.util.a.checkNotNull(((ef.a) entry2.getValue()).getText())).length()));
            }
        }
    }

    public e getChild(int i10) {
        ArrayList arrayList = this.f74546m;
        if (arrayList != null) {
            return (e) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getChildCount() {
        ArrayList arrayList = this.f74546m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public List<ef.b> getCues(long j10, Map<String, h> map, Map<String, f> map2, Map<String, String> map3) {
        ArrayList arrayList = new ArrayList();
        c(j10, this.f74541h, arrayList);
        TreeMap treeMap = new TreeMap();
        e(j10, false, this.f74541h, treeMap);
        d(j10, map, map2, this.f74541h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                f fVar = (f) com.google.android.exoplayer2.util.a.checkNotNull(map2.get(pair.first));
                arrayList2.add(new ef.a().setBitmap(bitmapDecodeByteArray).setPosition(fVar.f74548b).setPositionAnchor(0).setLine(fVar.f74549c, 0).setLineAnchor(fVar.f74551e).setSize(fVar.f74552f).setBitmapHeight(fVar.f74553g).setVerticalType(fVar.f74556j).build());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = (f) com.google.android.exoplayer2.util.a.checkNotNull(map2.get(entry.getKey()));
            ef.a aVar = (ef.a) entry.getValue();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) com.google.android.exoplayer2.util.a.checkNotNull(aVar.getText());
            for (a aVar2 : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.setLine(fVar2.f74549c, fVar2.f74550d);
            aVar.setLineAnchor(fVar2.f74551e);
            aVar.setPosition(fVar2.f74548b);
            aVar.setSize(fVar2.f74552f);
            aVar.setTextSize(fVar2.f74555i, fVar2.f74554h);
            aVar.setVerticalType(fVar2.f74556j);
            arrayList2.add(aVar.build());
        }
        return arrayList2;
    }

    public long[] getEventTimesUs() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] getStyleIds() {
        return this.f74540g;
    }

    public boolean isActive(long j10) {
        long j11 = this.f74537d;
        long j12 = this.f74538e;
        if (j11 == C.TIME_UNSET && j12 == C.TIME_UNSET) {
            return true;
        }
        if (j11 <= j10 && j12 == C.TIME_UNSET) {
            return true;
        }
        if (j11 != C.TIME_UNSET || j10 >= j12) {
            return j11 <= j10 && j10 < j12;
        }
        return true;
    }
}

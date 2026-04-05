package np;

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
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f77120a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77121b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77122c;

    /* renamed from: d, reason: collision with root package name */
    public final long f77123d;

    /* renamed from: e, reason: collision with root package name */
    public final long f77124e;

    /* renamed from: f, reason: collision with root package name */
    public final g f77125f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f77126g;

    /* renamed from: h, reason: collision with root package name */
    public final String f77127h;

    /* renamed from: i, reason: collision with root package name */
    public final String f77128i;

    /* renamed from: j, reason: collision with root package name */
    public final c f77129j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f77130k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f77131l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f77132m;

    public c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f77120a = str;
        this.f77121b = str2;
        this.f77128i = str4;
        this.f77125f = gVar;
        this.f77126g = strArr;
        this.f77122c = str2 != null;
        this.f77123d = j10;
        this.f77124e = j11;
        this.f77127h = (String) io.bidmachine.media3.common.util.a.checkNotNull(str3);
        this.f77129j = cVar;
        this.f77130k = new HashMap();
        this.f77131l = new HashMap();
    }

    public static SpannableStringBuilder b(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            in.a aVar = new in.a();
            aVar.setText(new SpannableStringBuilder());
            treeMap.put(str, aVar);
        }
        return (SpannableStringBuilder) io.bidmachine.media3.common.util.a.checkNotNull(((in.a) treeMap.get(str)).getText());
    }

    public static c buildNode(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j10, j11, gVar, strArr, str2, str3, cVar);
    }

    public static c buildTextNode(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public final void a(TreeSet treeSet, boolean z10) {
        String str = this.f77120a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(str);
        if (z10 || zEquals || (zEquals2 && this.f77128i != null)) {
            long j10 = this.f77123d;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f77124e;
            if (j11 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f77132m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f77132m.size(); i10++) {
            ((c) this.f77132m.get(i10)).a(treeSet, z10 || zEquals);
        }
    }

    public void addChild(c cVar) {
        if (this.f77132m == null) {
            this.f77132m = new ArrayList();
        }
        this.f77132m.add(cVar);
    }

    public final void c(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f77127h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (isActive(j10) && TtmlNode.TAG_DIV.equals(this.f77120a) && (str2 = this.f77128i) != null) {
            o2.z(str, str2, arrayList);
            return;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChild(i10).c(j10, str, arrayList);
        }
    }

    public final void d(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        if (isActive(j10)) {
            String str2 = this.f77127h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it = this.f77131l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = (String) entry.getKey();
                HashMap map3 = this.f77130k;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    in.a aVar = (in.a) io.bidmachine.media3.common.util.a.checkNotNull((in.a) treeMap.get(str4));
                    int i10 = ((e) io.bidmachine.media3.common.util.a.checkNotNull((e) map2.get(str3))).f77151j;
                    g gVarResolveStyle = f.resolveStyle(this.f77125f, this.f77126g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.getText();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.setText(spannableStringBuilder);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (gVarResolveStyle != null) {
                        f.applyStylesToSpan(spannableStringBuilder2, iIntValue, iIntValue2, gVarResolveStyle, this.f77129j, map, i10);
                        if ("p".equals(this.f77120a)) {
                            if (gVarResolveStyle.getShearPercentage() != Float.MAX_VALUE) {
                                aVar.setShearDegrees((gVarResolveStyle.getShearPercentage() * (-90.0f)) / 100.0f);
                            }
                            if (gVarResolveStyle.getTextAlign() != null) {
                                aVar.setTextAlignment(gVarResolveStyle.getTextAlign());
                            }
                            if (gVarResolveStyle.getMultiRowAlign() != null) {
                                aVar.setMultiRowAlignment(gVarResolveStyle.getMultiRowAlign());
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
        HashMap map = this.f77130k;
        map.clear();
        HashMap map2 = this.f77131l;
        map2.clear();
        String str2 = this.f77120a;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.f77127h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f77122c && z10) {
            b(str4, treeMap).append((CharSequence) io.bidmachine.media3.common.util.a.checkNotNull(this.f77121b));
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z10) {
            b(str4, treeMap).append('\n');
            return;
        }
        if (isActive(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                map.put((String) entry.getKey(), Integer.valueOf(((CharSequence) io.bidmachine.media3.common.util.a.checkNotNull(((in.a) entry.getValue()).getText())).length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                c child = getChild(i10);
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
                map2.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) io.bidmachine.media3.common.util.a.checkNotNull(((in.a) entry2.getValue()).getText())).length()));
            }
        }
    }

    public c getChild(int i10) {
        ArrayList arrayList = this.f77132m;
        if (arrayList != null) {
            return (c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getChildCount() {
        ArrayList arrayList = this.f77132m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public List<in.b> getCues(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        ArrayList arrayList = new ArrayList();
        c(j10, this.f77127h, arrayList);
        TreeMap treeMap = new TreeMap();
        e(j10, false, this.f77127h, treeMap);
        d(j10, map, map2, this.f77127h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) io.bidmachine.media3.common.util.a.checkNotNull(map2.get(pair.first));
                arrayList2.add(new in.a().setBitmap(bitmapDecodeByteArray).setPosition(eVar.f77143b).setPositionAnchor(0).setLine(eVar.f77144c, 0).setLineAnchor(eVar.f77146e).setSize(eVar.f77147f).setBitmapHeight(eVar.f77148g).setVerticalType(eVar.f77151j).build());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) io.bidmachine.media3.common.util.a.checkNotNull(map2.get(entry.getKey()));
            in.a aVar = (in.a) entry.getValue();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) io.bidmachine.media3.common.util.a.checkNotNull(aVar.getText());
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
            aVar.setLine(eVar2.f77144c, eVar2.f77145d);
            aVar.setLineAnchor(eVar2.f77146e);
            aVar.setPosition(eVar2.f77143b);
            aVar.setSize(eVar2.f77147f);
            aVar.setTextSize(eVar2.f77150i, eVar2.f77149h);
            aVar.setVerticalType(eVar2.f77151j);
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
        return this.f77126g;
    }

    public boolean isActive(long j10) {
        long j11 = this.f77123d;
        long j12 = this.f77124e;
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

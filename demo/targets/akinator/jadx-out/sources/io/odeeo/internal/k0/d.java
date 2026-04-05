package io.odeeo.internal.k0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.odeeo.internal.d0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f64455a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64456b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f64457c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64458d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64459e;

    /* renamed from: f, reason: collision with root package name */
    public final g f64460f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f64461g;

    /* renamed from: h, reason: collision with root package name */
    public final String f64462h;

    /* renamed from: i, reason: collision with root package name */
    public final String f64463i;

    /* renamed from: j, reason: collision with root package name */
    public final d f64464j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f64465k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap<String, Integer> f64466l;

    /* renamed from: m, reason: collision with root package name */
    public List<d> f64467m;

    public d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f64455a = str;
        this.f64456b = str2;
        this.f64463i = str4;
        this.f64460f = gVar;
        this.f64461g = strArr;
        this.f64457c = str2 != null;
        this.f64458d = j10;
        this.f64459e = j11;
        this.f64462h = (String) io.odeeo.internal.q0.a.checkNotNull(str3);
        this.f64464j = dVar;
        this.f64465k = new HashMap<>();
        this.f64466l = new HashMap<>();
    }

    public static d buildNode(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d buildTextNode(String str) {
        return new d(null, f.a(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public final void a(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f64455a);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(this.f64455a);
        if (z10 || zEquals || (zEquals2 && this.f64463i != null)) {
            long j10 = this.f64458d;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f64459e;
            if (j11 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f64467m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f64467m.size(); i10++) {
            this.f64467m.get(i10).a(treeSet, z10 || zEquals);
        }
    }

    public void addChild(d dVar) {
        if (this.f64467m == null) {
            this.f64467m = new ArrayList();
        }
        this.f64467m.add(dVar);
    }

    public d getChild(int i10) {
        List<d> list = this.f64467m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getChildCount() {
        List<d> list = this.f64467m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<io.odeeo.internal.d0.a> getCues(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        ArrayList arrayList = new ArrayList();
        a(j10, this.f64462h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j10, false, this.f64462h, treeMap);
        a(j10, map, map2, this.f64462h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) io.odeeo.internal.q0.a.checkNotNull(map2.get(pair.first));
                arrayList2.add(new a.b().setBitmap(bitmapDecodeByteArray).setPosition(eVar.f64469b).setPositionAnchor(0).setLine(eVar.f64470c, 0).setLineAnchor(eVar.f64472e).setSize(eVar.f64473f).setBitmapHeight(eVar.f64474g).setVerticalType(eVar.f64477j).build());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) io.odeeo.internal.q0.a.checkNotNull(map2.get(entry.getKey()));
            a.b bVar = (a.b) entry.getValue();
            a((SpannableStringBuilder) io.odeeo.internal.q0.a.checkNotNull(bVar.getText()));
            bVar.setLine(eVar2.f64470c, eVar2.f64471d);
            bVar.setLineAnchor(eVar2.f64472e);
            bVar.setPosition(eVar2.f64469b);
            bVar.setSize(eVar2.f64473f);
            bVar.setTextSize(eVar2.f64476i, eVar2.f64475h);
            bVar.setVerticalType(eVar2.f64477j);
            arrayList2.add(bVar.build());
        }
        return arrayList2;
    }

    public long[] getEventTimesUs() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] getStyleIds() {
        return this.f64461g;
    }

    public boolean isActive(long j10) {
        long j11 = this.f64458d;
        if (j11 == C.TIME_UNSET && this.f64459e == C.TIME_UNSET) {
            return true;
        }
        if (j11 <= j10 && this.f64459e == C.TIME_UNSET) {
            return true;
        }
        if (j11 != C.TIME_UNSET || j10 >= this.f64459e) {
            return j11 <= j10 && j10 < this.f64459e;
        }
        return true;
    }

    public final void a(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f64462h)) {
            str = this.f64462h;
        }
        if (isActive(j10) && TtmlNode.TAG_DIV.equals(this.f64455a) && this.f64463i != null) {
            list.add(new Pair<>(str, this.f64463i));
            return;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChild(i10).a(j10, str, list);
        }
    }

    public final void a(long j10, boolean z10, String str, Map<String, a.b> map) {
        boolean z11;
        Map<String, a.b> map2;
        long j11;
        this.f64465k.clear();
        this.f64466l.clear();
        if (TtmlNode.TAG_METADATA.equals(this.f64455a)) {
            return;
        }
        if (!"".equals(this.f64462h)) {
            str = this.f64462h;
        }
        String str2 = str;
        if (this.f64457c && z10) {
            a(str2, map).append((CharSequence) io.odeeo.internal.q0.a.checkNotNull(this.f64456b));
            return;
        }
        if (TtmlNode.TAG_BR.equals(this.f64455a) && z10) {
            a(str2, map).append('\n');
            return;
        }
        if (isActive(j10)) {
            for (Map.Entry<String, a.b> entry : map.entrySet()) {
                this.f64465k.put(entry.getKey(), Integer.valueOf(((CharSequence) io.odeeo.internal.q0.a.checkNotNull(entry.getValue().getText())).length()));
            }
            boolean zEquals = "p".equals(this.f64455a);
            int i10 = 0;
            while (i10 < getChildCount()) {
                d child = getChild(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    map2 = map;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    map2 = map;
                }
                child.a(j11, z11, str2, map2);
                i10++;
                j10 = j11;
                map = map2;
            }
            Map<String, a.b> map3 = map;
            if (zEquals) {
                f.a(a(str2, map3));
            }
            for (Map.Entry<String, a.b> entry2 : map3.entrySet()) {
                this.f64466l.put(entry2.getKey(), Integer.valueOf(((CharSequence) io.odeeo.internal.q0.a.checkNotNull(entry2.getValue().getText())).length()));
            }
        }
    }

    public static SpannableStringBuilder a(String str, Map<String, a.b> map) {
        if (!map.containsKey(str)) {
            a.b bVar = new a.b();
            bVar.setText(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) io.odeeo.internal.q0.a.checkNotNull(map.get(str).getText());
    }

    public final void a(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, a.b> map3) {
        if (isActive(j10)) {
            String str2 = "".equals(this.f64462h) ? str : this.f64462h;
            Iterator<Map.Entry<String, Integer>> it = this.f64466l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f64465k.containsKey(key) ? this.f64465k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    a(map, (a.b) io.odeeo.internal.q0.a.checkNotNull(map3.get(key)), iIntValue, iIntValue2, ((e) io.odeeo.internal.q0.a.checkNotNull(map2.get(str2))).f64477j);
                }
            }
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                getChild(i10).a(j10, map, map2, str2, map3);
            }
        }
    }

    public final void a(Map<String, g> map, a.b bVar, int i10, int i11, int i12) {
        g gVarResolveStyle = f.resolveStyle(this.f64460f, this.f64461g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.getText();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.setText(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarResolveStyle != null) {
            f.applyStylesToSpan(spannableStringBuilder2, i10, i11, gVarResolveStyle, this.f64464j, map, i12);
            if ("p".equals(this.f64455a)) {
                if (gVarResolveStyle.getShearPercentage() != Float.MAX_VALUE) {
                    bVar.setShearDegrees((gVarResolveStyle.getShearPercentage() * (-90.0f)) / 100.0f);
                }
                if (gVarResolveStyle.getTextAlign() != null) {
                    bVar.setTextAlignment(gVarResolveStyle.getTextAlign());
                }
                if (gVarResolveStyle.getMultiRowAlign() != null) {
                    bVar.setMultiRowAlignment(gVarResolveStyle.getMultiRowAlign());
                }
            }
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
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
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }
}
